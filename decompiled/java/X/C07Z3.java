package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.07Z3, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07Z3 {
    public final Object LIZ = new Object();
    public C07Z2 LIZIZ;

    public final boolean LIZ(EnumC1799930wwJ enumC1799930wwJ, String str) {
        boolean zLJFF;
        String string = a0.LJLIIIL(str).toString();
        if (string == null || string.length() <= 0) {
            return false;
        }
        synchronized (this.LIZ) {
            try {
                zLJFF = Intrinsics.LJFF(this.LIZIZ, new C07Z2(enumC1799930wwJ, string));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return zLJFF;
    }
}
