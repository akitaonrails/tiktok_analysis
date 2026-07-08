package X;

import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0QGJ, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QGJ extends C0QGK {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String containerID;
        C0QGL c0qgl = (C0QGL) xBaseParamModel;
        try {
            long j = CastLongProtector.parseLong(c0qgl.getShowIndex());
            C0Q2N c0q2n = C0Q3H.LIZ;
            boolean zLIZ = C0Q3H.LIZ(c0qgl.getPosition().intValue(), c0qgl.getModule(), j, c0qgl.getWordsContent());
            InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
            if (interfaceC634840OvC != null) {
                containerID = interfaceC634840OvC.getContainerID();
            } else {
                containerID = null;
            }
            completionBlock.onSuccess((C0QGM) C1909107dp.LIZJ(C0QGM.class, containerID), String.valueOf(zLIZ));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C2382909Vj.LIZ(completionBlock, 0, e.toString(), null, 4);
        }
    }
}
