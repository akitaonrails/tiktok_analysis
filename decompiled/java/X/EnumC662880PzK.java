package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0PzK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC662880PzK {
    public static final EnumC662880PzK CARD_ANCHOR;
    public static final /* synthetic */ EnumC662880PzK[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC662880PzK MULTI_ANCHOR_LARGE;
    public static final EnumC662880PzK MULTI_ANCHOR_MEDIUM;
    public static final EnumC662880PzK MULTI_ANCHOR_SMALL;
    public static final EnumC662880PzK SINGLE_ANCHOR_LARGE;
    public static final EnumC662880PzK SINGLE_ANCHOR_MEDIUM;
    public static final EnumC662880PzK SINGLE_ANCHOR_SMALL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC662880PzK> getEntries() {
        return LLILLL;
    }

    static {
        EnumC662880PzK enumC662880PzK = new EnumC662880PzK("SINGLE_ANCHOR_SMALL", 0, "search_live_single_entrance");
        SINGLE_ANCHOR_SMALL = enumC662880PzK;
        EnumC662880PzK enumC662880PzK2 = new EnumC662880PzK("SINGLE_ANCHOR_MEDIUM", 1, "search_live_single_entrance");
        SINGLE_ANCHOR_MEDIUM = enumC662880PzK2;
        EnumC662880PzK enumC662880PzK3 = new EnumC662880PzK("SINGLE_ANCHOR_LARGE", 2, "search_live_single_entrance");
        SINGLE_ANCHOR_LARGE = enumC662880PzK3;
        EnumC662880PzK enumC662880PzK4 = new EnumC662880PzK("MULTI_ANCHOR_SMALL", 3, "search_live_multi_entrance");
        MULTI_ANCHOR_SMALL = enumC662880PzK4;
        EnumC662880PzK enumC662880PzK5 = new EnumC662880PzK("MULTI_ANCHOR_MEDIUM", 4, "search_live_multi_entrance");
        MULTI_ANCHOR_MEDIUM = enumC662880PzK5;
        EnumC662880PzK enumC662880PzK6 = new EnumC662880PzK("MULTI_ANCHOR_LARGE", 5, "search_live_multi_entrance");
        MULTI_ANCHOR_LARGE = enumC662880PzK6;
        EnumC662880PzK enumC662880PzK7 = new EnumC662880PzK("CARD_ANCHOR", 6, "search_live_card_anchor");
        CARD_ANCHOR = enumC662880PzK7;
        EnumC662880PzK[] enumC662880PzKArr = {enumC662880PzK, enumC662880PzK2, enumC662880PzK3, enumC662880PzK4, enumC662880PzK5, enumC662880PzK6, enumC662880PzK7};
        LLILLJJLI = enumC662880PzKArr;
        LLILLL = new C2254308sP(enumC662880PzKArr);
    }

    public static EnumC662880PzK[] values() {
        return (EnumC662880PzK[]) LLILLJJLI.clone();
    }

    public final String getMetricsName() {
        return this.LL;
    }

    public static EnumC662880PzK valueOf(String str) {
        return (EnumC662880PzK) C08FF.LIZ(EnumC662880PzK.class, str);
    }

    public EnumC662880PzK(String str, int i, String str2) {
        this.LL = str2;
    }
}
