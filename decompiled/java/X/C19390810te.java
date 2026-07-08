package X;

import android.graphics.Point;
import com.bytedance.keva.Keva;
import kotlin.jvm.internal.AFwS218S0000000_29;

/* JADX INFO: renamed from: X.10te, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19390810te {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(454));

    public static Keva LIZ() {
        return (Keva) LIZ.getValue();
    }

    public static void LIZIZ(C19390910tf c19390910tf) {
        LIZ().storeString("last_window_size", c19390910tf.LIZ.name());
        Point point = c19390910tf.LIZIZ;
        LIZ().storeInt("last_window_position_x", point.x);
        LIZ().storeInt("last_window_position_y", point.y);
        LIZ().storeBoolean("last_window_adhere_to_left", c19390910tf.LIZJ);
        LIZ().storeFloat("last_window_position_y_relative", c19390910tf.LIZLLL);
    }
}
