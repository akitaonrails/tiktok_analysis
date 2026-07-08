package X;

import Y.ARunnableS113S0100000_13;
import Y.ARunnableS24S0101000_13;
import android.os.Build;
import android.os.Looper;
import android.view.Choreographer;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: X.0UwA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C788320UwA {
    public static boolean LIZ;
    public static Method LIZIZ;

    public final void LIZIZ() {
        if (Build.VERSION.SDK_INT >= 28) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                LIZ(1);
            } else {
                C786410Ut5.LJL(new BPEAHandler(Looper.getMainLooper()), new ARunnableS113S0100000_13(this, 200));
            }
        }
    }

    public final void LIZ(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                try {
                    Method declaredMethod = LIZIZ;
                    if (declaredMethod == null) {
                        declaredMethod = Choreographer.class.getDeclaredMethod("setFPSDivisor", Integer.TYPE);
                        declaredMethod.setAccessible(true);
                        LIZIZ = declaredMethod;
                    }
                    C2204961BRm.a0(declaredMethod, C786410Ut5.v2(), new Object[]{Integer.valueOf(i)}, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+wc5rc1T+tTDpbvlwk0e/e5zyeS1CSJZdM2U83ZA5Zrr6NyCahTJ08", null));
                    return;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    return;
                }
            }
            C786410Ut5.LJL(new BPEAHandler(Looper.getMainLooper()), new ARunnableS24S0101000_13(i, this, 6));
        }
    }
}
