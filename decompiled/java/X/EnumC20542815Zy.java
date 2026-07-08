package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.15Zy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class EnumC20542815Zy {
    public static final EnumC20542815Zy BREATH;
    public static final C20543615a6 Companion;
    public static final /* synthetic */ EnumC20542815Zy[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC20542815Zy RESET;
    public static final EnumC20542815Zy STRETCH;
    public static final EnumC20542815Zy WATER;
    public final String LL;

    public static InterfaceC2044707zh<EnumC20542815Zy> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.15a6] */
    static {
        EnumC20542815Zy enumC20542815Zy = new EnumC20542815Zy("BREATH", 0, "breathe");
        BREATH = enumC20542815Zy;
        EnumC20542815Zy enumC20542815Zy2 = new EnumC20542815Zy("WATER", 1, "drink");
        WATER = enumC20542815Zy2;
        EnumC20542815Zy enumC20542815Zy3 = new EnumC20542815Zy("RESET", 2, "reset");
        RESET = enumC20542815Zy3;
        EnumC20542815Zy enumC20542815Zy4 = new EnumC20542815Zy("STRETCH", 3, "stretch");
        STRETCH = enumC20542815Zy4;
        EnumC20542815Zy[] enumC20542815ZyArr = {enumC20542815Zy, enumC20542815Zy2, enumC20542815Zy3, enumC20542815Zy4};
        LLILLJJLI = enumC20542815ZyArr;
        LLILLL = new C2254308sP(enumC20542815ZyArr);
        Companion = new Object() { // from class: X.15a6
        };
    }

    public static EnumC20542815Zy[] values() {
        return (EnumC20542815Zy[]) LLILLJJLI.clone();
    }

    public final String getS() {
        return this.LL;
    }

    public static EnumC20542815Zy valueOf(String str) {
        return (EnumC20542815Zy) C08FF.LIZ(EnumC20542815Zy.class, str);
    }

    public EnumC20542815Zy(String str, int i, String str2) {
        this.LL = str2;
    }
}
