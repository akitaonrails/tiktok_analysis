package X;

/* JADX INFO: renamed from: X.0aBR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public enum EnumC925190aBR {
    USER_CLICK("turn_on_with_user_click"),
    AUDIENCE_OPEN("audience_open"),
    AUTO_START("turn_on_with_auto_start"),
    RESTART_AFTER_MIC_ROOM("turn_on_with_restart_after_mic_room"),
    RESTART_AFTER_CO_HOST("turn_on_with_restart_after_co_host"),
    ACTIVITY_PAGE_OPEN("turn_on_with_activity_page"),
    ADAPT_MIC_ROOM("turn_on_adapt_mic_room"),
    AUTO_START_AS_PUNISH_TIME_OUT("auto_start_as_punish_time_out"),
    RESTART_WHEN_CO_HOST_ENTER_MIX_MODE("restart_when_co_host_enter_mix_mode"),
    RESTART_WHEN_MIX_MODE_CO_HOST_END("restart_when_mix_mode_co_host_end"),
    RESTART_WHEN_MIX_MODE_TO_MULTI_HOST("restart_when_mix_mode_to_multi_host");

    public String value;

    public static EnumC925190aBR valueOf(String str) {
        return (EnumC925190aBR) C08FF.LIZ(EnumC925190aBR.class, str);
    }

    EnumC925190aBR(String str) {
        this.value = str;
    }
}
