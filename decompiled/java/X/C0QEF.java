package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.model.SearchHistory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0QEF, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QEF extends C0QEG {
    public final C0QEH LIZJ(C0QF6 c0qf6) {
        String containerID;
        String containerID2;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            containerID = interfaceC634840OvC.getContainerID();
        } else {
            containerID = null;
        }
        C0QEH c0qeh = (C0QEH) C1909107dp.LIZJ(C0QEH.class, containerID);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(c0qf6.LIZIZ());
        ArrayList arrayList2 = new ArrayList();
        for (SearchHistory searchHistory : C13LP.LL(arrayList, 20)) {
            if (searchHistory != null) {
                InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
                if (interfaceC634840OvC2 != null) {
                    containerID2 = interfaceC634840OvC2.getContainerID();
                } else {
                    containerID2 = null;
                }
                XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(C0QEJ.class, containerID2);
                ((C0QEJ) xBaseModelLIZJ).setWord(searchHistory.keyword);
                arrayList2.add(xBaseModelLIZJ);
            }
        }
        c0qeh.setHistoryList(arrayList2);
        return c0qeh;
    }

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String string;
        C0QEI c0qei = (C0QEI) xBaseParamModel;
        try {
            Number type = c0qei.getType();
            if (type == null || (string = type.toString()) == null) {
                string = "";
            }
            C0QF6 c0qf6LJIJI = C0QPJ.LJIJI(null);
            if (Intrinsics.LJFF(string, CardStruct.IStatusCode.DEFAULT)) {
                C0QEE c0qee = C0QEE.LIZ;
                C13BV c13bv = C13BV.INSTANCE;
                c0qee.getClass();
                C0QEE.LIZJ(c13bv, true, null, "del_all_jsb");
                c0qf6LJIJI.LJIIIIZZ();
                completionBlock.onSuccess(LIZJ(c0qf6LJIJI), "");
                return;
            }
            if (Intrinsics.LJFF(string, "1")) {
                String keyword = c0qei.getKeyword();
                if (keyword == null) {
                    keyword = "";
                }
                C0QEE c0qee2 = C0QEE.LIZ;
                List listSingletonList = Collections.singletonList(keyword);
                c0qee2.getClass();
                C0QEE.LIZJ(listSingletonList, false, null, "del_jsb");
                c0qf6LJIJI.LJIIJ(new SearchHistory(keyword, 0), "del_jsb_cur");
                completionBlock.onSuccess(LIZJ(c0qf6LJIJI), "");
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJFF(e, "delete_history_jsb_err");
            C798280VTe.LIZ("DeleteSearchHistoryMethod", e);
            String message = e.getMessage();
            if (message != null) {
                C2382909Vj.LIZ(completionBlock, -1, message, null, 4);
            }
        }
    }
}
