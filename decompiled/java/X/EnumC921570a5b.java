package X;

/* JADX INFO: renamed from: X.0a5b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public enum EnumC921570a5b {
    USER_CLICK(10001, "finish_with_user_click"),
    ILLEGAL_LIVE(10010, "finish_with_illegal_live"),
    INTERRUPT_BY_CO_HOST(10003, "finish_with_interrupt_by_co_host"),
    RTC_ERROR(10011, "finish_with_rtc_error"),
    MIC_ROOM(10002, "finish_with_mic_room"),
    PUNISH_CENTER_IM(10021, "punish_center_im");

    public long finishReason;
    public String value;

    public static EnumC921570a5b valueOf(String str) {
        return (EnumC921570a5b) C08FF.LIZ(EnumC921570a5b.class, str);
    }

    EnumC921570a5b(long j, String str) {
        this.value = str;
        this.finishReason = j;
    }
}
