package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.model.SearchHistory;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0QF9, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QF9 extends C0QFA {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String containerID;
        String containerID2;
        try {
            List<SearchHistory> listLIZIZ = C0QPJ.LJIJI(null).LIZIZ();
            ArrayList arrayList = new ArrayList();
            for (SearchHistory searchHistory : (ArrayList) C444200HbO.LIZJ(listLIZIZ)) {
                InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
                if (interfaceC634840OvC != null) {
                    containerID2 = interfaceC634840OvC.getContainerID();
                } else {
                    containerID2 = null;
                }
                XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(C0QFD.class, containerID2);
                ((C0QFD) xBaseModelLIZJ).setWord(searchHistory.keyword);
                arrayList.add(xBaseModelLIZJ);
            }
            InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
            if (interfaceC634840OvC2 != null) {
                containerID = interfaceC634840OvC2.getContainerID();
            } else {
                containerID = null;
            }
            C0QFB c0qfb = (C0QFB) C1909107dp.LIZJ(C0QFB.class, containerID);
            c0qfb.setHistoryList(arrayList);
            completionBlock.onSuccess(c0qfb, "");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C798280VTe.LIZ("GetSearchHistoryMethod", e);
            String message = e.getMessage();
            if (message != null) {
                C2382909Vj.LIZ(completionBlock, 0, message, null, 4);
            }
        }
    }
}
