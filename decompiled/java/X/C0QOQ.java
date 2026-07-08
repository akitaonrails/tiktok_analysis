package X;

import android.view.View;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.model.SearchHistory;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0QOQ, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QOQ extends C0QOR {
    public static List LIZJ(C0QF6 c0qf6) {
        ArrayList<SearchHistory> arrayList = new ArrayList();
        arrayList.addAll(C13LP.LL(c0qf6.LIZIZ(), 20));
        ArrayList arrayList2 = new ArrayList();
        for (SearchHistory searchHistory : arrayList) {
            XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(C0QOU.class, null);
            ((C0QOU) xBaseModelLIZJ).setWord(searchHistory.keyword);
            arrayList2.add(xBaseModelLIZJ);
        }
        return arrayList2;
    }

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        View view;
        View view2;
        C0QOT c0qot = (C0QOT) xBaseParamModel;
        String str = "";
        try {
            Number type = c0qot.getType();
            if (Intrinsics.LJFF(type, 0)) {
                InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
                if (interfaceC634840OvC != null) {
                    view2 = interfaceC634840OvC.getView();
                } else {
                    view2 = null;
                }
                C0QF6 c0qf6LIZ = C0QOP.LIZ(view2);
                XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(C0QOS.class, null);
                C0QOS c0qos = (C0QOS) xBaseModelLIZJ;
                if (c0qf6LIZ != null) {
                    c0qos.setHistoryList(LIZJ(c0qf6LIZ));
                }
                completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
                return;
            }
            if (Intrinsics.LJFF(type, 1)) {
                InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
                if (interfaceC634840OvC2 != null) {
                    view = interfaceC634840OvC2.getView();
                } else {
                    view = null;
                }
                String keyword = c0qot.getKeyword();
                if (keyword == null) {
                    keyword = "";
                }
                C0QF6 c0qf6LIZIZ = C0QOP.LIZIZ(view, keyword);
                XBaseModel xBaseModelLIZJ2 = C1909107dp.LIZJ(C0QOS.class, null);
                C0QOS c0qos2 = (C0QOS) xBaseModelLIZJ2;
                if (c0qf6LIZIZ != null) {
                    c0qos2.setHistoryList(LIZJ(c0qf6LIZIZ));
                }
                completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ2, "");
                return;
            }
            C1AF0.LIZJ("ecDeleteSearchHistory type is not 0 or 1");
            C2382909Vj.LIZ(completionBlock, -1, "ecDeleteSearchHistory type is not 0 or 1", null, 4);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJFF(e, "delete_history_jsb_err");
            C798270VTd.LIZ("DeleteSearchHistoryMethod", e);
            String message = e.getMessage();
            if (message != null) {
                str = message;
            }
            C2382909Vj.LIZ(completionBlock, -1, str, null, 4);
        }
    }
}
