package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.ab.CCDiversionEntConfig;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0L0O, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0L0O {
    public static Keva LIZ() {
        return CCDiversionEntConfig.CapCutBannerBean.LIZ.getValue();
    }

    public static void LIZIZ() {
        int i;
        CCDiversionEntConfig.LIZ.getClass();
        if (CCDiversionEntConfig.LIZ().capcutBanner == null) {
            return;
        }
        LIZ().storeInt("key_total_show_count", LIZ().getInt("key_total_show_count", 0) + 1);
        String str = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date());
        String string = LIZ().getString("key_last_show_date", "");
        int i2 = LIZ().getInt("key_today_show_count", 0);
        if (Intrinsics.LJFF(string, str)) {
            i = i2 + 1;
        } else {
            LIZ().storeString("key_last_show_date", str);
            i = 1;
        }
        LIZ().storeInt("key_today_show_count", i);
        if (LIZ().getBoolean("key_has_clicked", false)) {
            LIZ().storeInt("key_show_count_after_click", LIZ().getInt("key_show_count_after_click", 0) + 1);
        }
    }

    public static boolean LIZJ() {
        CCDiversionEntConfig.LIZ.getClass();
        CCDiversionEntConfig.CapCutBannerBean capCutBannerBean = CCDiversionEntConfig.LIZ().capcutBanner;
        if (capCutBannerBean == null) {
            return false;
        }
        if (capCutBannerBean.maxCloseTimes > 0 && LIZ().getInt("key_close_count", 0) >= capCutBannerBean.maxCloseTimes) {
            return false;
        }
        if (capCutBannerBean.maxShowTimes > 0 && LIZ().getInt("key_total_show_count", 0) >= capCutBannerBean.maxShowTimes) {
            return false;
        }
        if (LIZ().getBoolean("key_has_clicked", false) && capCutBannerBean.maxShowTimesAfterClick > 0 && LIZ().getInt("key_show_count_after_click", 0) >= capCutBannerBean.maxShowTimesAfterClick) {
            return false;
        }
        String string = LIZ().getString("key_last_show_date", "");
        String str = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date());
        int i = LIZ().getInt("key_today_show_count", 0);
        if (!Intrinsics.LJFF(string, str)) {
            i = 0;
        }
        int i2 = capCutBannerBean.timesPerDay;
        return i2 <= 0 || i < i2;
    }
}
