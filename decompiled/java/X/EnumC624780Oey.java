package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Oey, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC624780Oey {
    public static final /* synthetic */ EnumC624780Oey[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC624780Oey NETWORK_NO_TOAST;
    public static final EnumC624780Oey NETWORK_WIFI_TOAST;
    public static final EnumC624780Oey RETURN_FYP;
    public static final EnumC624780Oey SCREEN_RECORDING_TOAST;
    public static final EnumC624780Oey START_DOWNLOADING_TOAST;
    public static final EnumC624780Oey STORAGE_FULL_TOAST;
    public static final EnumC624780Oey SWITCH_TIER_NO_NET_TOAST;
    public static final EnumC624780Oey UPDATED_COUNT_TOAST;
    public static final EnumC624780Oey WATCH_ALL_OFFLINE_VIDEOS_TOAST;
    public final String LL;

    public static InterfaceC2044707zh<EnumC624780Oey> getEntries() {
        return LLILLL;
    }

    static {
        EnumC624780Oey enumC624780Oey = new EnumC624780Oey("SCREEN_RECORDING_TOAST", 0);
        SCREEN_RECORDING_TOAST = enumC624780Oey;
        EnumC624780Oey enumC624780Oey2 = new EnumC624780Oey("UPDATED_COUNT_TOAST", 1);
        UPDATED_COUNT_TOAST = enumC624780Oey2;
        EnumC624780Oey enumC624780Oey3 = new EnumC624780Oey("STORAGE_FULL_TOAST", 2);
        STORAGE_FULL_TOAST = enumC624780Oey3;
        EnumC624780Oey enumC624780Oey4 = new EnumC624780Oey("NETWORK_NO_TOAST", 3);
        NETWORK_NO_TOAST = enumC624780Oey4;
        EnumC624780Oey enumC624780Oey5 = new EnumC624780Oey("NETWORK_WIFI_TOAST", 4);
        NETWORK_WIFI_TOAST = enumC624780Oey5;
        EnumC624780Oey enumC624780Oey6 = new EnumC624780Oey("START_DOWNLOADING_TOAST", 5);
        START_DOWNLOADING_TOAST = enumC624780Oey6;
        EnumC624780Oey enumC624780Oey7 = new EnumC624780Oey("RETURN_FYP", 6, "return_fyp");
        RETURN_FYP = enumC624780Oey7;
        EnumC624780Oey enumC624780Oey8 = new EnumC624780Oey("WATCH_ALL_OFFLINE_VIDEOS_TOAST", 7, "watch_all_offline_videos");
        WATCH_ALL_OFFLINE_VIDEOS_TOAST = enumC624780Oey8;
        EnumC624780Oey enumC624780Oey9 = new EnumC624780Oey("SWITCH_TIER_NO_NET_TOAST", 8);
        SWITCH_TIER_NO_NET_TOAST = enumC624780Oey9;
        EnumC624780Oey[] enumC624780OeyArr = {enumC624780Oey, enumC624780Oey2, enumC624780Oey3, enumC624780Oey4, enumC624780Oey5, enumC624780Oey6, enumC624780Oey7, enumC624780Oey8, enumC624780Oey9};
        LLILLJJLI = enumC624780OeyArr;
        LLILLL = new C2254308sP(enumC624780OeyArr);
    }

    public static EnumC624780Oey[] values() {
        return (EnumC624780Oey[]) LLILLJJLI.clone();
    }

    public final String getMobName() {
        return this.LL;
    }

    public static EnumC624780Oey valueOf(String str) {
        return (EnumC624780Oey) C08FF.LIZ(EnumC624780Oey.class, str);
    }

    public /* synthetic */ EnumC624780Oey(String str, int i) {
        this(str, i, "");
    }

    public EnumC624780Oey(String str, int i, String str2) {
        this.LL = str2;
    }
}
