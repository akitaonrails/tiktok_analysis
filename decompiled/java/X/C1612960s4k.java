package X;

import com.bytedance.keva.Keva;
import java.util.Calendar;

/* JADX INFO: renamed from: X.0s4k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1612960s4k {
    public static final Keva LIZ = Keva.getRepo("paid_content");

    public static boolean LIZ() {
        Calendar calendar = Calendar.getInstance();
        Keva keva = LIZ;
        long j = keva.getLong("post_purchase_exit_inner_feed_popup_last_shown_time", 0L);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(j);
        return (keva.getInt("post_purchase_exit_inner_feed_popup_total_show_count", 0) < 2 && calendar.get(6) != calendar2.get(6)) || C0C64.LJIILLIIL().LJIJ(31744, 0, "series_iap_frequency_control_test", true) == 1;
    }

    public static boolean LIZIZ() {
        Calendar calendar = Calendar.getInstance();
        Keva keva = LIZ;
        long j = keva.getLong("post_purchase_guidance_notification_last_shown_time", 0L);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(j);
        return (keva.getInt("post_purchase_guidance_notification_total_show_count", 0) < 2 && calendar.get(6) != calendar2.get(6)) || C0C64.LJIILLIIL().LJIJ(31744, 0, "series_iap_frequency_control_test", true) == 1;
    }
}
