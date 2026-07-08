package X;

import Y.ARunnableS112S0100000_12;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0TXU, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TXU extends C0TXR {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        C0TXW c0txw;
        String containerID;
        C0TXT c0txt = (C0TXT) xBaseParamModel;
        try {
            Number actionType = c0txt.getActionType();
            if (Intrinsics.LJFF(actionType, 1)) {
                c0txw = C0TXW.SHOW;
            } else if (Intrinsics.LJFF(actionType, 2)) {
                c0txw = C0TXW.CLICK;
            } else if (Intrinsics.LJFF(actionType, 3)) {
                c0txw = C0TXW.DISLIKE;
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("err: unknown actionType: ");
                sbLIZ.append(c0txt.getActionType());
                C2382909Vj.LIZ(completionBlock, 0, C2188811AlT.LIZIZ(sbLIZ), null, 4);
                return;
            }
            C0TXY c0txy = C0TXY.LIZ;
            int iIntValue = c0txt.getCardType().intValue();
            String subCardType = c0txt.getSubCardType();
            c0txt.getTimestamp().longValue();
            C0TXX c0txx = new C0TXX(c0txw, iIntValue, subCardType, c0txt.getAwemeId());
            c0txy.getClass();
            C823050WQl.LIZJ().execute(new ARunnableS112S0100000_12(c0txx, 314));
            C19719912Dl c19719912DlLIZ = C13LE.LIZ(C0TXQ.class);
            InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
            if (interfaceC634840OvC != null) {
                containerID = interfaceC634840OvC.getContainerID();
            } else {
                containerID = null;
            }
            XBaseModel xBaseModelLIZJ = C1549500qQO.LIZJ(containerID, c19719912DlLIZ);
            ((C0TXQ) xBaseModelLIZJ).setCode(1);
            completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "success");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("err: ");
            sbLIZ2.append(th.getMessage());
            C2382909Vj.LIZ(completionBlock, 0, C2188811AlT.LIZIZ(sbLIZ2), null, 4);
        }
    }
}
