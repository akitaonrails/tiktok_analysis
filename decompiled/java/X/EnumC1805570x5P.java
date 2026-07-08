package X;

/* JADX INFO: renamed from: X.0x5P, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public enum EnumC1805570x5P {
    LIVE_PAGE("live_room"),
    VIDEO_GIFT_PANEL("video_gift_panel"),
    EXCHANGE_SUCCESS("exchange_success"),
    TASK_POST_PROCESS("task_post_process"),
    RECHARGE_SUCCESS("recharge_success"),
    WEB_SOCKET("web_socket"),
    PROMOTE("promote"),
    UNKNOWN("unknown");

    public final String entryPointName;

    public static EnumC1805570x5P find(String str) {
        EnumC1805570x5P enumC1805570x5P = UNKNOWN;
        for (EnumC1805570x5P enumC1805570x5P2 : values()) {
            if (str.equals(enumC1805570x5P2.entryPointName)) {
                return enumC1805570x5P2;
            }
        }
        return enumC1805570x5P;
    }

    public static EnumC1805570x5P valueOf(String str) {
        return (EnumC1805570x5P) C08FF.LIZ(EnumC1805570x5P.class, str);
    }

    EnumC1805570x5P(String str) {
        this.entryPointName = str;
    }
}
