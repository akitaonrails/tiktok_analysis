package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.common.model.AwemeStatusBean;

/* JADX INFO: renamed from: X.0Cs7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C327170Cs7 {
    public final AwemeStatusBean LIZ;
    public final Aweme LIZIZ;
    public final long LIZJ;

    public static boolean LIZ(C327170Cs7 c327170Cs7) {
        long jLJFF = 300000;
        try {
            SettingsManager.LIZLLL().getClass();
            jLJFF = SettingsManager.LJFF("im_feed_video_status_valid_duration", 300000L);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        c327170Cs7.getClass();
        if (System.currentTimeMillis() - c327170Cs7.LIZJ > jLJFF) {
            return true;
        }
        return false;
    }

    public C327170Cs7(AwemeStatusBean awemeStatusBean, Aweme aweme) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.LIZ = awemeStatusBean;
        this.LIZIZ = aweme;
        this.LIZJ = jCurrentTimeMillis;
    }
}
