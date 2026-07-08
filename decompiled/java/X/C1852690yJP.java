package X;

import com.ss.android.ugc.aweme.tako.ccl.model.api.NewActionBarHomeworkItem;
import com.ss.android.ugc.aweme.tako.ccl.model.api.NewActionBarItem;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoSug;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0yJP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1852690yJP {
    public static final Integer LIZ(NewActionBarItem newActionBarItem) {
        int i = newActionBarItem.type;
        if (i != 1) {
            if (i != 5) {
                if (i == 6) {
                    return Integer.valueOf(R.raw.icon_ai_video);
                }
                return null;
            }
            C1852700yJQ.LIZ.getClass();
            if (C1852700yJQ.LIZ()) {
                return Integer.valueOf(R.raw.icon_ai_image);
            }
            return null;
        }
        return Integer.valueOf(R.raw.icon_atom);
    }

    public static final Integer LIZIZ(NewActionBarItem newActionBarItem) {
        if (newActionBarItem.type == 6) {
            return Integer.valueOf(R.raw.tux_lottie_common_tako_imagetovideo_icon_dark);
        }
        return null;
    }

    public static final Integer LIZJ(NewActionBarItem newActionBarItem) {
        if (newActionBarItem.type == 6) {
            return Integer.valueOf(R.raw.tux_lottie_common_tako_imagetovideo_icon);
        }
        return null;
    }

    public static final String LIZLLL(NewActionBarItem newActionBarItem) {
        int i = newActionBarItem.type;
        if (i == 7) {
            String str = newActionBarItem.name;
            if (str == null) {
                return "default";
            }
            return str;
        }
        return C1855920yOc.LIZJ(Integer.valueOf(i));
    }

    public static final boolean LJ(NewActionBarItem newActionBarItem) {
        int i = newActionBarItem.type;
        if (i != 4) {
            if (i == 6 && !((Boolean) C0AX8.LIZ.getValue()).booleanValue()) {
                C1860520yW2.LIZ.getClass();
                if (C1860520yW2.LJIIZILJ() < 100) {
                    return true;
                }
                return false;
            }
            return false;
        }
        if (((Boolean) C0AX8.LIZ.getValue()).booleanValue()) {
            C1860520yW2.LIZ.getClass();
            if (C1860520yW2.LJ() < 100) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final boolean LJFF(NewActionBarItem newActionBarItem) {
        C1855770yON.LIZ.getClass();
        if (C1855770yON.LIZIZ() || newActionBarItem.type == 1) {
            return true;
        }
        return false;
    }

    public static final TakoSug LJI(NewActionBarItem newActionBarItem) {
        if (newActionBarItem.type == 2) {
            NewActionBarHomeworkItem newActionBarHomeworkItem = newActionBarItem.homeworkItem;
            if (newActionBarHomeworkItem != null) {
                return newActionBarHomeworkItem.sug;
            }
            return null;
        }
        return newActionBarItem.actionSug;
    }

    public static final boolean LJII(NewActionBarItem newActionBarItem) {
        Integer numLIZ;
        if (newActionBarItem.type == 1 && (numLIZ = C1854130yLj.LIZ()) != null && numLIZ.intValue() == 1) {
            return true;
        }
        return false;
    }
}
