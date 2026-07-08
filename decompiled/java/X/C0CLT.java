package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0CLT, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CLT {
    public static boolean LIZ() {
        Boolean silentShareConfigurable;
        try {
            silentShareConfigurable = C0CLW.LIZIZ.LIZ.getSilentShareConfigurable();
        } catch (C316660CbA e) {
            TryCatchGuardChecker.doCheck(e);
            silentShareConfigurable = Boolean.TRUE;
        }
        return silentShareConfigurable.booleanValue() && C0CLS.LIZ == 0;
    }
}
