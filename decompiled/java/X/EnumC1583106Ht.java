package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.06Ht, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC1583106Ht {
    public static final EnumC1583106Ht FEATURE_KEY_MARKET_STREAK_PET_SHARE_PANEL;
    public static final EnumC1583106Ht FEATURE_KEY_STREAK_PET_SHARE_PANEL;
    public static final /* synthetic */ EnumC1583106Ht[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1583106Ht> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1583106Ht enumC1583106Ht = new EnumC1583106Ht("FEATURE_KEY_STREAK_PET_SHARE_PANEL", 0, "streak_pet_share_panel");
        FEATURE_KEY_STREAK_PET_SHARE_PANEL = enumC1583106Ht;
        EnumC1583106Ht enumC1583106Ht2 = new EnumC1583106Ht("FEATURE_KEY_MARKET_STREAK_PET_SHARE_PANEL", 1, "market_streak_pet_share_panel");
        FEATURE_KEY_MARKET_STREAK_PET_SHARE_PANEL = enumC1583106Ht2;
        EnumC1583106Ht[] enumC1583106HtArr = {enumC1583106Ht, enumC1583106Ht2};
        LLILLJJLI = enumC1583106HtArr;
        LLILLL = new C2254308sP(enumC1583106HtArr);
    }

    public static EnumC1583106Ht[] values() {
        return (EnumC1583106Ht[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1583106Ht valueOf(String str) {
        return (EnumC1583106Ht) C08FF.LIZ(EnumC1583106Ht.class, str);
    }

    public EnumC1583106Ht(String str, int i, String str2) {
        this.LL = str2;
    }
}
