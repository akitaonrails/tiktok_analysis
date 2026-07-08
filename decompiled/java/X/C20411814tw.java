package X;

import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.14tw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20411814tw extends AbstractC20415114uT {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        long jLongValue;
        long jLongValue2;
        InterfaceC20415014uS interfaceC20415014uS = (InterfaceC20415014uS) xBaseParamModel;
        XBaseResultModel xBaseResultModel = (XBaseResultModel) C1909107dp.LIZJ(InterfaceC20414514uN.class, null);
        C0UTJ c0utjPl1 = ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).Pl1(null);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("playbookAnchorService=");
        sbLIZ.append(c0utjPl1);
        sbLIZ.append(", playbookId=");
        sbLIZ.append(interfaceC20415014uS.getPlaybookId());
        sbLIZ.append(", playbookContentId=");
        sbLIZ.append(interfaceC20415014uS.getPlaybookContentId());
        sbLIZ.append(", from=");
        sbLIZ.append(interfaceC20415014uS.getFrom());
        sbLIZ.append(',');
        C1AZW.LJIIJ(12, "Play_OpenPlaybookDetailPanelMethod_28", C2188811AlT.LIZIZ(sbLIZ), null, null);
        if (c0utjPl1 != null) {
            Long lLJJLIL = C500260Jjc.LJJLIL(interfaceC20415014uS.getPlaybookId());
            if (lLJJLIL != null) {
                jLongValue = lLJJLIL.longValue();
            } else {
                jLongValue = 0;
            }
            Long lLJJLIL2 = C500260Jjc.LJJLIL(interfaceC20415014uS.getPlaybookContentId());
            if (lLJJLIL2 != null) {
                jLongValue2 = lLJJLIL2.longValue();
            } else {
                jLongValue2 = 0;
            }
            c0utjPl1.LJJIFFI(new C20382814pG(jLongValue, jLongValue2, false, false, false, null, null, null, false, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, -4), interfaceC20415014uS.getFrom(), new C915190ZvJ("room_banner", false, 4), EnumC20429314wl.ACTIVITY, false);
        }
        completionBlock.onSuccess(xBaseResultModel, "");
    }
}
