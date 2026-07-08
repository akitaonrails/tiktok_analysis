package X;

import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.ss.android.ugc.aweme.im.streak.impl.exp.StreakRestoreCompensationConfig;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: renamed from: X.06Bd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1565906Bd {
    public static final StreakRestoreCompensationConfig LIZ = new StreakRestoreCompensationConfig(false, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL, 30, false);
    public static final C01GW LIZIZ;
    public static final boolean LIZJ;
    public static final int LIZLLL;
    public static final int LJ;
    public static final boolean LJFF;

    static {
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(1392));
        LIZIZ = c01gwLIZIZ;
        LIZJ = ((StreakRestoreCompensationConfig) c01gwLIZIZ.getValue()).enable;
        LIZLLL = ((StreakRestoreCompensationConfig) c01gwLIZIZ.getValue()).validDurationInSeconds * LSPassThroughRecordSizeConfig.DEFAULT;
        LJ = ((StreakRestoreCompensationConfig) c01gwLIZIZ.getValue()).spreadDurationInSeconds * LSPassThroughRecordSizeConfig.DEFAULT;
        LJFF = ((StreakRestoreCompensationConfig) c01gwLIZIZ.getValue()).needPullManually;
    }
}
