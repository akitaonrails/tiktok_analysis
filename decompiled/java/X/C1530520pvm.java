package X;

import com.bytedance.lynx.hybrid.service.IResourceServiceX;
import com.bytedance.lynx.hybrid.ssp.base.SSPResponse;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.ttnet.TTNetInit;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0pvm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1530520pvm implements InterfaceC1530620pvw {
    public final IResourceServiceX LIZ;
    public final C1537480q70 LIZIZ;

    /* JADX WARN: Removed duplicated region for block: B:30:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0117  */
    @Override // X.InterfaceC1530620pvw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(final com.bytedance.lynx.hybrid.ssp.base.SSPResponse.Prefetch r15) {
        /*
            Method dump skipped, instruction units count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1530520pvm.LIZ(com.bytedance.lynx.hybrid.ssp.base.SSPResponse$Prefetch):void");
    }

    @Override // X.InterfaceC1530620pvw
    public final void LIZIZ(SSPResponse.PreConnect preConnect) {
        String str = preConnect.domain;
        if (str == null) {
            return;
        }
        try {
            TTNetInit.preconnectUrl(str);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public C1530520pvm(IResourceServiceX iResourceServiceX, C1537480q70 c1537480q70) {
        this.LIZ = iResourceServiceX;
        this.LIZIZ = c1537480q70;
    }
}
