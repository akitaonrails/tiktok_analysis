package X;

import android.app.Activity;
import androidx.fragment.app.FragmentManager;

/* JADX INFO: renamed from: X.0JMX, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JMX {
    public static final C0JMX LIZ = new C0JMX();

    public static void LIZ(long j, Activity activity, C0JMR c0jmr, String str) {
        C19EG c19egLIZIZ;
        FragmentManager supportFragmentManager;
        if (activity != null && (c19egLIZIZ = C1388190mED.LIZIZ(activity)) != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null) {
            C1390850mIV c1390850mIV = new C1390850mIV();
            C1247510iZJ c1247510iZJ = new C1247510iZJ();
            c1247510iZJ.LIZIZ(2131855835);
            c1247510iZJ.LIZJ = 0;
            c1247510iZJ.LIZ(new C0JMY(j, activity, c0jmr, str));
            c1390850mIV.LIZIZ(c1247510iZJ);
            c1390850mIV.LIZLLL(2131855834);
            c1390850mIV.LIZ.LL = new DialogInterfaceOnCancelListenerC521720Kd8(c0jmr, 5);
            c1390850mIV.LIZJ().show(supportFragmentManager, "pcs_course_video_player_action");
            C490770JMl.LJ(Long.valueOf(c0jmr.LIZ), "show", null);
        }
    }
}
