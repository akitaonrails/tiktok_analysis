package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0RSx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class EnumC696290RSx {
    public static final /* synthetic */ EnumC696290RSx[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC696290RSx REWARD_ANOLE_SLIDE_SLOT;
    public static final EnumC696290RSx REWARD_ANOLE_TOP_FULL_ABOVE_ALL_SLOT;
    public static final EnumC696290RSx REWARD_ANOLE_TOP_FULL_SLOT;
    public final String LL;

    public static InterfaceC2044707zh<EnumC696290RSx> getEntries() {
        return LLILLL;
    }

    static {
        EnumC696290RSx enumC696290RSx = new EnumC696290RSx("REWARD_ANOLE_SLIDE_SLOT", 0, "tt_reward_ad_full_screen_slide");
        REWARD_ANOLE_SLIDE_SLOT = enumC696290RSx;
        EnumC696290RSx enumC696290RSx2 = new EnumC696290RSx("REWARD_ANOLE_TOP_FULL_SLOT", 1, "tt_reward_ad_top_full_screen");
        REWARD_ANOLE_TOP_FULL_SLOT = enumC696290RSx2;
        EnumC696290RSx enumC696290RSx3 = new EnumC696290RSx("REWARD_ANOLE_TOP_FULL_ABOVE_ALL_SLOT", 2, "tt_reward_ad_top_full_screen_above_all");
        REWARD_ANOLE_TOP_FULL_ABOVE_ALL_SLOT = enumC696290RSx3;
        EnumC696290RSx[] enumC696290RSxArr = {enumC696290RSx, enumC696290RSx2, enumC696290RSx3};
        LLILLJJLI = enumC696290RSxArr;
        LLILLL = new C2254308sP(enumC696290RSxArr);
    }

    public static EnumC696290RSx[] values() {
        return (EnumC696290RSx[]) LLILLJJLI.clone();
    }

    public final String getSlotName() {
        return this.LL;
    }

    public static EnumC696290RSx valueOf(String str) {
        return (EnumC696290RSx) C08FF.LIZ(EnumC696290RSx.class, str);
    }

    public EnumC696290RSx(String str, int i, String str2) {
        this.LL = str2;
    }
}
