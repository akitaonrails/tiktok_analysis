package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: renamed from: X.15x4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20686015x4 {
    public static final C20686015x4 LIZ = new C20686015x4();
    public static final Keva LIZIZ = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME);
    public static String LIZJ;
    public static int LIZLLL;

    static {
        String curUserId = C0XQ7.LJFF().getCurUserId();
        if (curUserId == null) {
            curUserId = "";
        }
        LIZJ = curUserId;
        LIZLLL = -1;
    }

    public static String LIZIZ() {
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        return curUserId == null ? "" : curUserId;
    }

    public static String LIZJ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("video_recuser_disable_time_");
        sbLIZ.append(LIZIZ());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LIZLLL() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("video_recuser_show_key_");
        sbLIZ.append(LIZIZ());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static int LIZ(EnumC20685915x3 enumC20685915x3) {
        Keva keva = LIZIZ;
        long j = keva.getLong(enumC20685915x3.getKeyForStart(), -1L);
        int i = 0;
        int i2 = keva.getInt(enumC20685915x3.getKeyForCount(), 0);
        long jCurrentTimeMillis = System.currentTimeMillis();
        int period = enumC20685915x3.getPeriod() * 60 * 60 * LSPassThroughRecordSizeConfig.DEFAULT;
        if (j != -1 && jCurrentTimeMillis - j <= period) {
            i = i2;
        } else {
            int i3 = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(enumC20685915x3);
            sbLIZ.append(", reset time and follow cnt");
            C1720106oR.LJI("RecMore", C2188811AlT.LIZIZ(sbLIZ));
            keva.storeLong(enumC20685915x3.getKeyForStart(), jCurrentTimeMillis);
            keva.storeInt(enumC20685915x3.getKeyForCount(), 0);
        }
        int i4 = C2187451AjH.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(enumC20685915x3);
        sbLIZ2.append(", current follow cnt: ");
        sbLIZ2.append(i);
        C1720106oR.LJI("RecMore", C2188811AlT.LIZIZ(sbLIZ2));
        return i;
    }
}
