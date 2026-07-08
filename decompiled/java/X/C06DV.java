package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.ss.android.ugc.aweme.im.streak.api.pet.IStreakPetService;

/* JADX INFO: renamed from: X.06DV, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06DV extends C06DW {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String containerID;
        C06DX c06dx = (C06DX) xBaseParamModel;
        String conversationId = c06dx.getConversationId();
        Number conversationType = c06dx.getConversationType();
        String uuid = c06dx.getUuid();
        boolean z = C1590806Ks.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("receive ");
        sbLIZ.append(getName());
        sbLIZ.append(" jsb: Param: conversationId: ");
        sbLIZ.append(conversationId);
        sbLIZ.append(", conversationType: ");
        sbLIZ.append(conversationType);
        C1590806Ks.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        C06DZ c06dz = C06BG.LIZ.get(uuid);
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            containerID = interfaceC634840OvC.getContainerID();
        } else {
            containerID = null;
        }
        C06DY c06dy = (C06DY) C1909107dp.LIZJ(C06DY.class, containerID);
        if (c06dz == null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Failed to get panel configuration for conversationId: ");
            sbLIZ2.append(conversationId);
            C1590806Ks.LIZIZ(C2188811AlT.LIZIZ(sbLIZ2));
            c06dy.setStatusCode(-1);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("Failed to get panel configuration for conversationId: ");
            sbLIZ3.append(conversationId);
            c06dy.setStatusMsg(C2188811AlT.LIZIZ(sbLIZ3));
            completionBlock.onSuccess(c06dy, "");
            return;
        }
        InterfaceC1059280dfi interfaceC1059280dfiLJJIJLIJ = c06dz.LIZ.LJJIJLIJ();
        if (interfaceC1059280dfiLJJIJLIJ == null) {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("Failed to get container for conversationId: ");
            sbLIZ4.append(conversationId);
            C1590806Ks.LIZIZ(C2188811AlT.LIZIZ(sbLIZ4));
            c06dy.setStatusCode(-1);
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("Failed to get container for conversationId: ");
            sbLIZ5.append(conversationId);
            c06dy.setStatusMsg(C2188811AlT.LIZIZ(sbLIZ5));
            completionBlock.onSuccess(c06dy, "");
            return;
        }
        interfaceC1059280dfiLJJIJLIJ.close();
        IStreakPetService.LIZ.getClass();
        C1586906Jf.LIZ().LJJII().LIZ(new C15531066f(EnumC205800qm.OPEN_STREAK_PET_STICKER_PANEL));
        c06dy.setStatusCode(0);
        c06dy.setStatusMsg("Success");
        completionBlock.onSuccess(c06dy, "");
    }
}
