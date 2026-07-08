package X;

import com.google.gson.reflect.TypeToken;
import java.util.Map;
import webcast.data.RechargeRetentionPopupConfig;

/* JADX INFO: renamed from: X.0U53, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public interface C0U53 {
    public static final C0JT6<Boolean> Rd = new C0JT6<>("live_recharge_cancel_retention_enable_setting", Boolean.class);
    public static final C0JT6<Map<String, RechargeRetentionPopupConfig.EventInfo>> Sd = new C0JT6<>("live_recharge_cancel_retention_setting", new TypeToken<Map<String, RechargeRetentionPopupConfig.EventInfo>>() { // from class: X.0Tc3
    }.getType());
    public static final C0JT6<Boolean> Td = new C0JT6<>("live_recharge_v3_retention_shown_setting", Boolean.class);
    public static final C0JT6<Long> Ud = new C0JT6<>("live_recharge_v3_retention_shown_timestamp", Long.class);
    public static final C0JT6<Boolean> Vd = new C0JT6<>("live_recharge_v3_red_dot_shown", Boolean.class);
    public static final C20337914i1<Integer> Wd = new C20337914i1<>("live_recharge_email_collection_live_room_count", Integer.class, 0);
    public static final C20337914i1<Integer> Xd = new C20337914i1<>("live_recharge_email_auth_live_room_count", Integer.class, 0);
    public static final C20337914i1<Integer> Yd = new C20337914i1<>("live_recharge_email_collection_profile_count", Integer.class, 0);
    public static final C20337914i1<Integer> Zd = new C20337914i1<>("live_recharge_email_auth_profile_count", Integer.class, 0);
    public static final C20337914i1<Long> ae;
    public static final C20337914i1<Long> be;
    public static final C20337914i1<String> ce;

    /* JADX INFO: renamed from: de, reason: collision with root package name */
    public static final C0JT6<String> f124de;
    public static final C20337914i1<Long> ee;

    static {
        new C20337914i1("live_recharge_exchange_marquee_count", Integer.class, 0);
        ae = new C20337914i1<>("cash_recharge_panel_animation_timestamp", Long.class, 0L);
        be = new C20337914i1<>("cash_recharge_panel_first_show_timestamp", Long.class, 0L);
        ce = new C20337914i1<>("cash_recharge_panel_task_id", String.class, "");
        f124de = new C0JT6<>("live_revenue_default_location_cache", String.class);
        ee = new C20337914i1<>("wallet_recharge_panel_open_times", Long.class, 0L);
    }
}
