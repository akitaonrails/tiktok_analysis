package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0c8D, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1000070c8D {
    public static final EnumC1000070c8D BOTTOM_CARD;
    public static final EnumC1000070c8D DESCRIPTIVE_CARD;
    public static final /* synthetic */ EnumC1000070c8D[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1000070c8D NON_DESCRIPTIVE;
    public static final EnumC1000070c8D TOP_CARD;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1000070c8D> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1000070c8D enumC1000070c8D = new EnumC1000070c8D("TOP_CARD", 0, "top_card");
        TOP_CARD = enumC1000070c8D;
        EnumC1000070c8D enumC1000070c8D2 = new EnumC1000070c8D("BOTTOM_CARD", 1, "bottom_card");
        BOTTOM_CARD = enumC1000070c8D2;
        EnumC1000070c8D enumC1000070c8D3 = new EnumC1000070c8D("DESCRIPTIVE_CARD", 2, "descriptive_card");
        DESCRIPTIVE_CARD = enumC1000070c8D3;
        EnumC1000070c8D enumC1000070c8D4 = new EnumC1000070c8D("NON_DESCRIPTIVE", 3, "non_descriptive");
        NON_DESCRIPTIVE = enumC1000070c8D4;
        EnumC1000070c8D[] enumC1000070c8DArr = {enumC1000070c8D, enumC1000070c8D2, enumC1000070c8D3, enumC1000070c8D4};
        LLILLJJLI = enumC1000070c8DArr;
        LLILLL = new C2254308sP(enumC1000070c8DArr);
    }

    public static EnumC1000070c8D[] values() {
        return (EnumC1000070c8D[]) LLILLJJLI.clone();
    }

    public final String getSceneName() {
        return this.LL;
    }

    public static EnumC1000070c8D valueOf(String str) {
        return (EnumC1000070c8D) C08FF.LIZ(EnumC1000070c8D.class, str);
    }

    public EnumC1000070c8D(String str, int i, String str2) {
        this.LL = str2;
    }
}
