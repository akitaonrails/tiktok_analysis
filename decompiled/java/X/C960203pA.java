package X;

import android.content.Context;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.03pA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C960203pA {
    public static final boolean LIZIZ(Context context) {
        if (C1388190mED.LIZ(context) == null) {
            C1AF0.LJ(new RuntimeException("Do not use application get them Settings, Use activity get them Settings. Use Application context get theme is FollowSystem not is User setting."));
        }
        if (context.getResources().getInteger(R.integer.cl) != 0) {
            return true;
        }
        return false;
    }

    @InterfaceC1294060jmO
    public static final int LIZ(int i, Context context) {
        Integer numLIZJ = C1308910kAL.LIZJ(i, context);
        if (numLIZJ != null) {
            return numLIZJ.intValue();
        }
        Integer numLIZJ2 = C1308910kAL.LIZJ(i, new C1361400lX0(context, R.style.xm));
        if (numLIZJ2 != null) {
            return numLIZJ2.intValue();
        }
        return -1;
    }
}
