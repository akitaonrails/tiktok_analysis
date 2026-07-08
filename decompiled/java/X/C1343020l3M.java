package X;

import android.view.Choreographer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: X.0l3M, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1343020l3M {
    public static void LIZ(Choreographer choreographer, Choreographer.FrameCallback frameCallback) throws Throwable {
        C1348340lBw.LIZ.getClass();
        C01GW c01gw = C1348340lBw.LIZLLL;
        if (c01gw.getValue() != null) {
            Object value = c01gw.getValue();
            if (C1348340lBw.LIZJ) {
                C01GW c01gw2 = C1348340lBw.LJ;
                if (c01gw2.getValue() != null) {
                    try {
                        Method method = (Method) c01gw2.getValue();
                        if (method != null) {
                            C2204961BRm.a0(method, choreographer, new Object[]{Integer.valueOf(C1348340lBw.LIZIZ), frameCallback, value, 0L}, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOGhd56A7QQ0eDzfS4TfJZz9", null));
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        C1348340lBw.LIZJ = false;
                    }
                    if (C1348340lBw.LIZJ) {
                        return;
                    }
                }
            }
        }
        choreographer.postFrameCallbackDelayed(frameCallback, 0L);
    }
}
