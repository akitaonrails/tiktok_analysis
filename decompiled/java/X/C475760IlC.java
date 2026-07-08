package X;

import android.content.Context;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0IlC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C475760IlC {
    public static int LJFF(Integer num) {
        if (num != null) {
            if (num.intValue() == 6) {
                return 4;
            }
            if (num.intValue() == 7) {
                return 3;
            }
            if (num.intValue() == 8) {
                return 2;
            }
            if (num.intValue() == 9) {
                return 1;
            }
            return 0;
        }
        return 0;
    }

    public static TuxIconDrawable LIZ(int i, Context context) {
        int i2;
        int i3;
        if (i == 2) {
            i2 = R.raw.icon_microphone_exclamatio_mark;
        } else {
            i2 = R.raw.icon_microphone;
            if (i != 2) {
                i3 = R.attr.eyp;
            }
            return LIZIZ(i2, i3, context);
        }
        i3 = R.attr.exz;
        return LIZIZ(i2, i3, context);
    }

    public static TuxIconDrawable LIZJ(int i, Context context) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return LIZIZ(R.raw.icon_wifi, R.attr.eyp, context);
                }
                return LIZIZ(R.raw.icon_wifi_slash, R.attr.exz, context);
            }
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_color_wifi_low;
            return c419910GdJ.LIZ(context);
        }
        C419910GdJ c419910GdJ2 = new C419910GdJ();
        c419910GdJ2.LIZ = R.raw.icon_color_wifi_medium;
        return c419910GdJ2.LIZ(context);
    }

    public static TuxIconDrawable LIZLLL(int i, Context context) {
        int i2;
        int i3;
        if (i != 1) {
            if (i != 2) {
                i2 = R.raw.icon_thermometer_low;
                if (i != 1) {
                    if (i != 2) {
                        i3 = R.attr.eyp;
                    }
                }
                return LIZIZ(i2, i3, context);
            }
            i2 = R.raw.icon_thermometer_high;
            i3 = R.attr.exz;
            return LIZIZ(i2, i3, context);
        }
        i2 = R.raw.icon_thermometer_medium;
        i3 = R.attr.eze;
        return LIZIZ(i2, i3, context);
    }

    public static boolean LJ(int i, EnumC466180IPw enumC466180IPw) {
        int i2 = C466160IPu.LIZ[enumC466180IPw.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    if (i == 0) {
                        return true;
                    }
                    return false;
                }
                throw new C1954807lC();
            }
            if (i == 0) {
                return true;
            }
            return false;
        }
        if (i == 0) {
            return true;
        }
        return false;
    }

    public static TuxIconDrawable LIZIZ(int i, int i2, Context context) {
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = i;
        c419910GdJ.LIZLLL = Integer.valueOf(C497740JfY.LIZLLL(i2, context));
        return c419910GdJ.LIZ(context);
    }
}
