package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.lemon.banner.FeedBannerLemon8FreqParams;
import kotlin.jvm.internal.AFwS204S0000000_16;

/* JADX INFO: renamed from: X.0dpO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1065280dpO {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(413));

    public static C0SGG LIZ(boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        String str;
        Keva repo = Keva.getRepo("feed_banner_lemon8");
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!repo.getBoolean("key_has_show_before", false)) {
            if (z) {
                repo.storeInt("key_one_day_show_count", 1);
                repo.storeLong("key_one_day_start_cal_time", jCurrentTimeMillis);
                repo.storeInt("key_one_circle_no_action_count", 1);
                repo.storeLong("key_one_cycle_start_cal_time", jCurrentTimeMillis);
                repo.storeBoolean("key_has_show_before", true);
            }
            return new C0SGG();
        }
        int i = repo.getInt("key_one_day_show_count", 0);
        long j = repo.getLong("key_one_day_start_cal_time", 0L);
        int i2 = repo.getInt("key_one_circle_no_action_count", 0);
        long j2 = repo.getLong("key_one_cycle_start_cal_time", 0L);
        long j3 = (jCurrentTimeMillis - j) / 86400000;
        C01GW c01gw = LIZ;
        if (i < ((FeedBannerLemon8FreqParams) c01gw.getValue()).oneDayMaxCnt && j3 < 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (j3 >= 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z2 && !z3) {
            z4 = false;
        } else {
            z4 = true;
        }
        long j4 = (jCurrentTimeMillis - j2) / 86400000;
        if (i2 < ((FeedBannerLemon8FreqParams) c01gw.getValue()).oneCircleUnclickCnt) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (j4 >= ((FeedBannerLemon8FreqParams) c01gw.getValue()).circleInterval) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (!z5 && !z6) {
            z7 = false;
        } else {
            z7 = true;
        }
        if (z4 && z7) {
            if (z2) {
                if (z) {
                    repo.storeInt("key_one_day_show_count", i + 1);
                    if (z5) {
                        int i3 = i2 + 1;
                        repo.storeInt("key_one_circle_no_action_count", i3);
                        if (i3 == ((FeedBannerLemon8FreqParams) c01gw.getValue()).oneCircleUnclickCnt) {
                            repo.storeLong("key_one_cycle_start_cal_time", jCurrentTimeMillis);
                        }
                    } else {
                        repo.storeInt("key_one_circle_no_action_count", 1);
                        repo.storeLong("key_one_cycle_start_cal_time", 0L);
                    }
                }
            } else if (z) {
                repo.storeInt("key_one_day_show_count", 1);
                repo.storeLong("key_one_day_start_cal_time", jCurrentTimeMillis);
                if (z5) {
                    int i4 = i2 + 1;
                    repo.storeInt("key_one_circle_no_action_count", i4);
                    if (i4 == ((FeedBannerLemon8FreqParams) c01gw.getValue()).oneCircleUnclickCnt) {
                        repo.storeLong("key_one_cycle_start_cal_time", jCurrentTimeMillis);
                    }
                } else {
                    repo.storeInt("key_one_circle_no_action_count", 1);
                    repo.storeLong("key_one_cycle_start_cal_time", 0L);
                }
            }
            return new C0SGG();
        }
        if (!z4) {
            str = "frequency_control";
        } else {
            str = "exit";
        }
        return new C0SGG(false, str);
    }
}
