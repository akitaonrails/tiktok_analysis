package X;

import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0OXB, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OXB extends C0OXD {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        long jLongValue;
        Long lLJIILIIL;
        C0OXC c0oxc = (C0OXC) xBaseParamModel;
        Long lLJIILIIL2 = C2095008Iq.LJIILIIL(c0oxc.getBulletinBoardId());
        if (lLJIILIIL2 != null) {
            jLongValue = lLJIILIIL2.longValue();
        } else {
            jLongValue = 0;
        }
        long j = CastLongProtector.parseLong(c0oxc.getItemId());
        int iIntValue = c0oxc.getActionType().intValue();
        String liveEventId = c0oxc.getLiveEventId();
        String containerID = null;
        if (liveEventId != null) {
            lLJIILIIL = C2095008Iq.LJIILIIL(liveEventId);
        } else {
            lLJIILIIL = null;
        }
        if (jLongValue != 0 && j != 0 && iIntValue >= 0) {
            C1440005kM.LIZ(new C0OJV(jLongValue, j, c0oxc.getExtra(), lLJIILIIL, iIntValue));
            InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
            if (interfaceC634840OvC != null) {
                containerID = interfaceC634840OvC.getContainerID();
            }
            completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(C0OXE.class, containerID), "success");
            return;
        }
        C2382909Vj.LIZ(completionBlock, 1, "bbId or itemId is null", null, 4);
    }
}
