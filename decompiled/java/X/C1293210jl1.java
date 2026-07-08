package X;

import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0jl1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1293210jl1 {
    public static final Interpolator LIZ = new LinearInterpolator();
    public static C1119470fEn<WeakReference<Interpolator>> LIZIZ;

    public static void LIZIZ(int i, WeakReference<Interpolator> weakReference) {
        synchronized (C1293210jl1.class) {
            try {
                LIZIZ.LJFF(i, weakReference);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x0024. Please report as an issue. */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <T> X.C1293200jl0<T> LIZ(android.util.JsonReader r15, X.C1291600jiQ r16, float r17, X.InterfaceC1293670jll<T> r18, boolean r19) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1293210jl1.LIZ(android.util.JsonReader, X.0jiQ, float, X.0jll, boolean):X.0jl0");
    }
}
