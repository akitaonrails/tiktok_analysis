package X;

import android.os.Build;
import com.ss.android.ugc.aweme.experiment.TabUIOptConfig;

/* JADX INFO: renamed from: X.0rW6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1591480rW6 {
    public static final TabUIOptConfig LIZ = new TabUIOptConfig(null, null, null, null, null, null, null, null, null);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C1591680rWQ());
    public static final C01GW LIZJ = C452501pT.LIZIZ(new C486560J6g());

    public static int LIZ() {
        TabUIOptConfig tabUIOptConfigLIZJ;
        Integer num;
        if (Build.VERSION.SDK_INT < 24 || ((Boolean) LIZJ.getValue()).booleanValue() || ((C1585060rLk.LIZIZ() && !C0BKN.LIZ()) || (tabUIOptConfigLIZJ = LIZJ()) == null || (num = tabUIOptConfigLIZJ.topTabShadowNew) == null)) {
            return 0;
        }
        return num.intValue();
    }

    public static int LIZIZ() {
        TabUIOptConfig tabUIOptConfigLIZJ;
        Integer num;
        if (Build.VERSION.SDK_INT < 24 || ((Boolean) LIZJ.getValue()).booleanValue() || ((C1585060rLk.LIZIZ() && !C0BKN.LIZ()) || (tabUIOptConfigLIZJ = LIZJ()) == null || (num = tabUIOptConfigLIZJ.topLayerOpt) == null)) {
            return 0;
        }
        return num.intValue();
    }

    public static TabUIOptConfig LIZJ() {
        return (TabUIOptConfig) LIZIZ.getValue();
    }

    public static boolean LIZLLL() {
        Boolean bool;
        TabUIOptConfig tabUIOptConfigLIZJ = LIZJ();
        if (tabUIOptConfigLIZJ == null || (bool = tabUIOptConfigLIZJ.topTabIndicatorOpt) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public static boolean LJ() {
        Boolean bool;
        TabUIOptConfig tabUIOptConfigLIZJ = LIZJ();
        return ((tabUIOptConfigLIZJ == null || (bool = tabUIOptConfigLIZJ.topTabUiOptShadow) == null) ? false : bool.booleanValue()) || LIZ() == 1;
    }

    public static boolean LJFF() {
        Boolean bool;
        TabUIOptConfig tabUIOptConfigLIZJ = LIZJ();
        if (tabUIOptConfigLIZJ == null || (bool = tabUIOptConfigLIZJ.tabTextColorOpt) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public static boolean LJI() {
        return LIZ() == 2 || LIZ() == 3 || C295430Bi1.LIZ();
    }
}
