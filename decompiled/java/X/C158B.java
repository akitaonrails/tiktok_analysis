package X;

import Y.AfS131S0000000_3;
import Y.AkS159S0000000_31;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveNtpServerUrlSetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.158B, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C158B {
    public static volatile C158B LIZIZ;
    public final C158C LIZ;

    public static long LIZ() {
        if (LIZIZ == null || LIZIZ.LIZ == null || !LIZIZ.LIZ.LIZLLL) {
            return C963140bAe.LIZIZ();
        }
        C158C c158c = LIZIZ.LIZ;
        return !c158c.LIZLLL ? C963140bAe.LIZIZ() : c158c.LJ + (SystemClock.elapsedRealtime() - c158c.LJFF);
    }

    public static long LIZIZ() {
        if (LIZIZ == null || LIZIZ.LIZ == null || !LIZIZ.LIZ.LIZLLL) {
            return C963140bAe.LIZJ();
        }
        C158C c158c = LIZIZ.LIZ;
        return !c158c.LIZLLL ? C963140bAe.LIZIZ() : c158c.LJ + (SystemClock.elapsedRealtime() - c158c.LJFF);
    }

    public static long LIZJ() {
        return LIZ() / 1000;
    }

    public C158B(Context context) {
        C158C c158c;
        String value = LiveNtpServerUrlSetting.INSTANCE.getValue();
        if (TextUtils.isEmpty(value)) {
            return;
        }
        synchronized (C158C.class) {
            if (C158C.LJI == null) {
                C158C.LJI = new C158C(value);
                C158C.LJII = C786410Ut5.N3(context);
            }
            c158c = C158C.LJI;
        }
        this.LIZ = c158c;
        C19490011Na.LIZJ(60L, TimeUnit.MINUTES).LJLIIL(2147483647L).LJL(C11S5.LIZIZ).LJJJJZI(new AkS159S0000000_31(5)).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C516901zr(26), new AfS131S0000000_3(7));
    }

    public static void LIZLLL(Context context) {
        if (LIZIZ == null) {
            synchronized (C158B.class) {
                try {
                    if (LIZIZ == null) {
                        LIZIZ = new C158B(context);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }
}
