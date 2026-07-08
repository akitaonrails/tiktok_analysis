package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0rap, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1594410rap implements C0QF8 {
    public static final EnumC1594410rap AVOID_INT_BY_SERVER;
    public static final EnumC1594410rap CLICK_THRESHOLD_REACHED;
    public static final EnumC1594410rap FULL_SCREEN_AD;
    public static final /* synthetic */ EnumC1594410rap[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1594410rap MULTI_PHOTO;
    public static final EnumC1594410rap NEW_USER_GUIDANCE;
    public static final EnumC1594410rap NORMAL_AD;
    public static final EnumC1594410rap OTHER;
    public static final EnumC1594410rap REACHED_EXIT_COUNT;
    public static final EnumC1594410rap SCREEN_LIVE;
    public static final EnumC1594410rap SCREEN_TIME;
    public static final EnumC1594410rap SHOW_THRESHOLD_REACHED;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1594410rap> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1594410rap enumC1594410rap = new EnumC1594410rap("NEW_USER_GUIDANCE", 0, "new_user_guidance");
        NEW_USER_GUIDANCE = enumC1594410rap;
        EnumC1594410rap enumC1594410rap2 = new EnumC1594410rap("NORMAL_AD", 1, "normal_ad");
        NORMAL_AD = enumC1594410rap2;
        EnumC1594410rap enumC1594410rap3 = new EnumC1594410rap("FULL_SCREEN_AD", 2, "full_screen_ad");
        FULL_SCREEN_AD = enumC1594410rap3;
        EnumC1594410rap enumC1594410rap4 = new EnumC1594410rap("MULTI_PHOTO", 3, "multi_photo");
        MULTI_PHOTO = enumC1594410rap4;
        EnumC1594410rap enumC1594410rap5 = new EnumC1594410rap("SCREEN_LIVE", 4, "screen_live");
        SCREEN_LIVE = enumC1594410rap5;
        EnumC1594410rap enumC1594410rap6 = new EnumC1594410rap("SHOW_THRESHOLD_REACHED", 5, null);
        SHOW_THRESHOLD_REACHED = enumC1594410rap6;
        EnumC1594410rap enumC1594410rap7 = new EnumC1594410rap("CLICK_THRESHOLD_REACHED", 6, null);
        CLICK_THRESHOLD_REACHED = enumC1594410rap7;
        EnumC1594410rap enumC1594410rap8 = new EnumC1594410rap("REACHED_EXIT_COUNT", 7, "reached_exit_count");
        REACHED_EXIT_COUNT = enumC1594410rap8;
        EnumC1594410rap enumC1594410rap9 = new EnumC1594410rap("OTHER", 8, "other");
        OTHER = enumC1594410rap9;
        EnumC1594410rap enumC1594410rap10 = new EnumC1594410rap("AVOID_INT_BY_SERVER", 9, null);
        AVOID_INT_BY_SERVER = enumC1594410rap10;
        EnumC1594410rap enumC1594410rap11 = new EnumC1594410rap("SCREEN_TIME", 10, "screen_time");
        SCREEN_TIME = enumC1594410rap11;
        EnumC1594410rap[] enumC1594410rapArr = {enumC1594410rap, enumC1594410rap2, enumC1594410rap3, enumC1594410rap4, enumC1594410rap5, enumC1594410rap6, enumC1594410rap7, enumC1594410rap8, enumC1594410rap9, enumC1594410rap10, enumC1594410rap11};
        LLILLJJLI = enumC1594410rapArr;
        LLILLL = new C2254308sP(enumC1594410rapArr);
    }

    public static EnumC1594410rap[] values() {
        return (EnumC1594410rap[]) LLILLJJLI.clone();
    }

    public final String getMobString() {
        return this.LL;
    }

    public static EnumC1594410rap valueOf(String str) {
        return (EnumC1594410rap) C08FF.LIZ(EnumC1594410rap.class, str);
    }

    public EnumC1594410rap(String str, int i, String str2) {
        this.LL = str2;
    }
}
