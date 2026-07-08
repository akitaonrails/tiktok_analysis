package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0y8K, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1845820y8K {
    public static final EnumC1845820y8K CLICK_EXPLORE;
    public static final EnumC1845820y8K CLICK_SUB;
    public static final EnumC1845820y8K EXPLORE_MORE_INTERESTS_BUTTON;
    public static final /* synthetic */ EnumC1845820y8K[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1845820y8K OTHER;
    public static final EnumC1845820y8K PIN;
    public static final EnumC1845820y8K SLIDE;
    public static final EnumC1845820y8K UNPIN;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1845820y8K> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1845820y8K enumC1845820y8K = new EnumC1845820y8K("CLICK_EXPLORE", 0, "click_explore");
        CLICK_EXPLORE = enumC1845820y8K;
        EnumC1845820y8K enumC1845820y8K2 = new EnumC1845820y8K("CLICK_SUB", 1, "click_sub");
        CLICK_SUB = enumC1845820y8K2;
        EnumC1845820y8K enumC1845820y8K3 = new EnumC1845820y8K("SLIDE", 2, "slide");
        SLIDE = enumC1845820y8K3;
        EnumC1845820y8K enumC1845820y8K4 = new EnumC1845820y8K("PIN", 3, "pin");
        PIN = enumC1845820y8K4;
        EnumC1845820y8K enumC1845820y8K5 = new EnumC1845820y8K("OTHER", 4, "other");
        OTHER = enumC1845820y8K5;
        EnumC1845820y8K enumC1845820y8K6 = new EnumC1845820y8K("UNPIN", 5, "unpin");
        UNPIN = enumC1845820y8K6;
        EnumC1845820y8K enumC1845820y8K7 = new EnumC1845820y8K("EXPLORE_MORE_INTERESTS_BUTTON", 6, "explore_more_interests_button");
        EXPLORE_MORE_INTERESTS_BUTTON = enumC1845820y8K7;
        EnumC1845820y8K[] enumC1845820y8KArr = {enumC1845820y8K, enumC1845820y8K2, enumC1845820y8K3, enumC1845820y8K4, enumC1845820y8K5, enumC1845820y8K6, enumC1845820y8K7};
        LLILLJJLI = enumC1845820y8KArr;
        LLILLL = new C2254308sP(enumC1845820y8KArr);
    }

    public static EnumC1845820y8K[] values() {
        return (EnumC1845820y8K[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1845820y8K valueOf(String str) {
        return (EnumC1845820y8K) C08FF.LIZ(EnumC1845820y8K.class, str);
    }

    public EnumC1845820y8K(String str, int i, String str2) {
        this.LL = str2;
    }
}
