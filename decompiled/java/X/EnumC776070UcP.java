package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0UcP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class EnumC776070UcP {
    public static final EnumC776070UcP GUIDE_ANIMATION_BLOCK;
    public static final EnumC776070UcP INSERT_STICKER_BLOCK;
    public static final EnumC776070UcP LIKE_RATE_INTERVAL_INCREASE;
    public static final /* synthetic */ EnumC776070UcP[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC776070UcP ONLINE_COUNT_REFRESH_INTERVAL_INCREASE;
    public static final EnumC776070UcP ONLINE_LIKE_COUNT_REFRESH_INTERVAL_INCREASE;
    public static final EnumC776070UcP REALTIME_LIVE_CENTER_ENTRY_ANIM_BLOCK;
    public static final EnumC776070UcP REALTIME_LIVE_CENTER_REFRESH_INTERVAL_INCREASE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC776070UcP> getEntries() {
        return LLILLL;
    }

    static {
        EnumC776070UcP enumC776070UcP = new EnumC776070UcP("REALTIME_LIVE_CENTER_ENTRY_ANIM_BLOCK", 0, "realtime_live_center_entry_anim_block");
        REALTIME_LIVE_CENTER_ENTRY_ANIM_BLOCK = enumC776070UcP;
        EnumC776070UcP enumC776070UcP2 = new EnumC776070UcP("REALTIME_LIVE_CENTER_REFRESH_INTERVAL_INCREASE", 1, "realtime_live_center_refresh_interval_increase");
        REALTIME_LIVE_CENTER_REFRESH_INTERVAL_INCREASE = enumC776070UcP2;
        EnumC776070UcP enumC776070UcP3 = new EnumC776070UcP("ONLINE_COUNT_REFRESH_INTERVAL_INCREASE", 2, "online_count_refresh_interval_increase");
        ONLINE_COUNT_REFRESH_INTERVAL_INCREASE = enumC776070UcP3;
        EnumC776070UcP enumC776070UcP4 = new EnumC776070UcP("ONLINE_LIKE_COUNT_REFRESH_INTERVAL_INCREASE", 3, "online_like_count_refresh_interval_increase");
        ONLINE_LIKE_COUNT_REFRESH_INTERVAL_INCREASE = enumC776070UcP4;
        EnumC776070UcP enumC776070UcP5 = new EnumC776070UcP("LIKE_RATE_INTERVAL_INCREASE", 4, "like_rate_interval_increase");
        LIKE_RATE_INTERVAL_INCREASE = enumC776070UcP5;
        EnumC776070UcP enumC776070UcP6 = new EnumC776070UcP("INSERT_STICKER_BLOCK", 5, "insert_sticker_block");
        INSERT_STICKER_BLOCK = enumC776070UcP6;
        EnumC776070UcP enumC776070UcP7 = new EnumC776070UcP("GUIDE_ANIMATION_BLOCK", 6, "guide_animation_block");
        GUIDE_ANIMATION_BLOCK = enumC776070UcP7;
        EnumC776070UcP[] enumC776070UcPArr = {enumC776070UcP, enumC776070UcP2, enumC776070UcP3, enumC776070UcP4, enumC776070UcP5, enumC776070UcP6, enumC776070UcP7};
        LLILLJJLI = enumC776070UcPArr;
        LLILLL = new C2254308sP(enumC776070UcPArr);
    }

    public static EnumC776070UcP[] values() {
        return (EnumC776070UcP[]) LLILLJJLI.clone();
    }

    public final String getFeatureName() {
        return this.LL;
    }

    public static EnumC776070UcP valueOf(String str) {
        return (EnumC776070UcP) C08FF.LIZ(EnumC776070UcP.class, str);
    }

    public EnumC776070UcP(String str, int i, String str2) {
        this.LL = str2;
    }
}
