package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0IIk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class EnumC464240IIk {
    public static final EnumC464240IIk INITIATIVE_EFFECTIVE_USER_TYPE;
    public static final /* synthetic */ EnumC464240IIk[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC464240IIk MG_TOPLIVE_LAND_STRATEGY;
    public static final EnumC464240IIk USER_APP_HIGHACTIVE_LIVE_LOWACTIVE_28D;
    public static final EnumC464240IIk VALID_GIFT_REWATCH_CNT_14D;
    public static final EnumC464240IIk VALID_WATCH_ACTIVE_DAY;
    public final int LL;
    public final String LLILLJJLI;

    public static InterfaceC2044707zh<EnumC464240IIk> getEntries() {
        return LLILZ;
    }

    static {
        EnumC464240IIk enumC464240IIk = new EnumC464240IIk("VALID_WATCH_ACTIVE_DAY", 0, 1, "treco_user_valid_watch_active_day");
        VALID_WATCH_ACTIVE_DAY = enumC464240IIk;
        EnumC464240IIk enumC464240IIk2 = new EnumC464240IIk("INITIATIVE_EFFECTIVE_USER_TYPE", 1, 2, "treco_user_initiative_effective_user_type");
        INITIATIVE_EFFECTIVE_USER_TYPE = enumC464240IIk2;
        EnumC464240IIk enumC464240IIk3 = new EnumC464240IIk("VALID_GIFT_REWATCH_CNT_14D", 2, 3, "treco_user_valid_gift_rewatch_cnt_14d");
        VALID_GIFT_REWATCH_CNT_14D = enumC464240IIk3;
        EnumC464240IIk enumC464240IIk4 = new EnumC464240IIk("USER_APP_HIGHACTIVE_LIVE_LOWACTIVE_28D", 3, 10, "user_app_highactive_live_lowactive_28d");
        USER_APP_HIGHACTIVE_LIVE_LOWACTIVE_28D = enumC464240IIk4;
        EnumC464240IIk enumC464240IIk5 = new EnumC464240IIk("MG_TOPLIVE_LAND_STRATEGY", 4, 11, "mg_toplive_land_strategy");
        MG_TOPLIVE_LAND_STRATEGY = enumC464240IIk5;
        EnumC464240IIk[] enumC464240IIkArr = {enumC464240IIk, enumC464240IIk2, enumC464240IIk3, enumC464240IIk4, enumC464240IIk5};
        LLILLL = enumC464240IIkArr;
        LLILZ = new C2254308sP(enumC464240IIkArr);
    }

    public static EnumC464240IIk[] values() {
        return (EnumC464240IIk[]) LLILLL.clone();
    }

    public final int getIndex() {
        return this.LL;
    }

    public final String getKey() {
        return this.LLILLJJLI;
    }

    public static EnumC464240IIk valueOf(String str) {
        return (EnumC464240IIk) C08FF.LIZ(EnumC464240IIk.class, str);
    }

    public EnumC464240IIk(String str, int i, int i2, String str2) {
        this.LL = i2;
        this.LLILLJJLI = str2;
    }
}
