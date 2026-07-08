package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0MP6, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MP6 {
    public static final void LIZ(Object obj, InterfaceC20236714Gf interfaceC20236714Gf) {
        try {
            C189200o6.m2constructorimpl(obj);
            interfaceC20236714Gf.resumeWith(obj);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
