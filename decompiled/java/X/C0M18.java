package X;

import android.content.Context;
import androidx.lifecycle.Lifecycle;
import kotlin.jvm.internal.AwS91S0210000_8;

/* JADX INFO: renamed from: X.0M18, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0M18 {
    public static final C0M18 LIZ = new C0M18();

    public static void LIZ(boolean z) {
        C0MVY c0mvy;
        C194353111z c194353111z = C194353111z.LIZ;
        if (z) {
            c0mvy = C0MVY.SHOW;
        } else {
            c0mvy = C0MVY.DISMISS;
        }
        c194353111z.LIZIZ(1016, c0mvy, C0LD3.DUAL_BALL, C0LEP.CLOSE_VISIBLE_5S);
    }

    public static void LIZIZ(Context context, C571420Mb6 c571420Mb6, boolean z) {
        Lifecycle lifecycle;
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
        Lifecycle.State currentState = null;
        if (c19egLIZIZ != null && (lifecycle = c19egLIZIZ.getLifecycle()) != null) {
            currentState = lifecycle.getCurrentState();
        }
        if (currentState == Lifecycle.State.RESUMED && c19egLIZIZ != null) {
            C0CNO.LIZLLL(0L, new AwS91S0210000_8(c19egLIZIZ, c571420Mb6, z, 0));
        }
    }
}
