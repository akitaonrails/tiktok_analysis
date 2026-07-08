package X;

import com.ss.android.ugc.aweme.im.streak.impl.exp.DMStreakWidgetConfig;
import com.ss.android.ugc.aweme.im.streak.impl.exp.DMStreakWidgetDefaultOffsetConfig;
import com.ss.android.ugc.aweme.im.streak.impl.exp.DMStreakWidgetDefaultSubConfig;
import com.ss.android.ugc.aweme.im.streak.impl.exp.DMStreakWidgetSizeConfig;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: renamed from: X.06Ko, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1590406Ko {
    public static final DMStreakWidgetConfig LIZ = new DMStreakWidgetConfig(new DMStreakWidgetDefaultSubConfig(80), new DMStreakWidgetDefaultOffsetConfig(12, 4, -8, -8), new DMStreakWidgetSizeConfig(100, 100));
    public static final C01GW LIZIZ;
    public static final int LIZJ;
    public static final DMStreakWidgetDefaultOffsetConfig LIZLLL;
    public static final DMStreakWidgetSizeConfig LJ;

    static {
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(1390));
        LIZIZ = c01gwLIZIZ;
        DMStreakWidgetDefaultSubConfig dMStreakWidgetDefaultSubConfig = ((DMStreakWidgetConfig) c01gwLIZIZ.getValue()).defaultSubConfig;
        if (dMStreakWidgetDefaultSubConfig == null) {
            dMStreakWidgetDefaultSubConfig = new DMStreakWidgetDefaultSubConfig(80);
        }
        LIZJ = dMStreakWidgetDefaultSubConfig.top;
        DMStreakWidgetDefaultOffsetConfig dMStreakWidgetDefaultOffsetConfig = ((DMStreakWidgetConfig) c01gwLIZIZ.getValue()).offsetConfig;
        if (dMStreakWidgetDefaultOffsetConfig == null) {
            dMStreakWidgetDefaultOffsetConfig = new DMStreakWidgetDefaultOffsetConfig(12, 4, -8, -8);
        }
        LIZLLL = dMStreakWidgetDefaultOffsetConfig;
        DMStreakWidgetSizeConfig dMStreakWidgetSizeConfig = ((DMStreakWidgetConfig) c01gwLIZIZ.getValue()).sizeConfig;
        if (dMStreakWidgetSizeConfig == null) {
            dMStreakWidgetSizeConfig = new DMStreakWidgetSizeConfig(100, 100);
        }
        LJ = dMStreakWidgetSizeConfig;
    }
}
