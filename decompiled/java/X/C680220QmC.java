package X;

import com.ss.android.ugc.aweme.ecommerce.search.middle.ai.bean.EcSearchAIHistoryWord;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0QmC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C680220QmC extends AbstractC680230QmD {
    public final InterfaceC680250QmF LIZJ(List<EcSearchAIHistoryWord> list) {
        String containerID;
        String containerID2;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            containerID = interfaceC634840OvC.getContainerID();
        } else {
            containerID = null;
        }
        InterfaceC680250QmF interfaceC680250QmF = (InterfaceC680250QmF) C1909107dp.LIZJ(InterfaceC680250QmF.class, containerID);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (EcSearchAIHistoryWord ecSearchAIHistoryWord : list) {
            InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
            if (interfaceC634840OvC2 != null) {
                containerID2 = interfaceC634840OvC2.getContainerID();
            } else {
                containerID2 = null;
            }
            InterfaceC680260QmG interfaceC680260QmG = (InterfaceC680260QmG) C1909107dp.LIZJ(InterfaceC680260QmG.class, containerID2);
            interfaceC680260QmG.setWord(ecSearchAIHistoryWord.word);
            arrayList.add(interfaceC680260QmG);
        }
        interfaceC680250QmF.setHistoryList(arrayList);
        return interfaceC680250QmF;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    @Override // X.AbstractC1549150qPp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void handle(com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel r8, com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock r9, X.EnumC1063300dmC r10) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C680220QmC.handle(com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel, com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock, X.0dmC):void");
    }
}
