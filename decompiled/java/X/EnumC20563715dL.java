package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.15dL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class EnumC20563715dL {
    public static final EnumC20563715dL CENTER;
    public static final EnumC20563715dL CROP;
    public static final C20568715e9 Companion;
    public static final /* synthetic */ EnumC20563715dL[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC20563715dL TOP;
    public final int LL;

    public static InterfaceC2044707zh<EnumC20563715dL> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.15e9] */
    static {
        EnumC20563715dL enumC20563715dL = new EnumC20563715dL("CENTER", 0, 1);
        CENTER = enumC20563715dL;
        EnumC20563715dL enumC20563715dL2 = new EnumC20563715dL("TOP", 1, 2);
        TOP = enumC20563715dL2;
        EnumC20563715dL enumC20563715dL3 = new EnumC20563715dL("CROP", 2, 3);
        CROP = enumC20563715dL3;
        EnumC20563715dL[] enumC20563715dLArr = {enumC20563715dL, enumC20563715dL2, enumC20563715dL3};
        LLILLJJLI = enumC20563715dLArr;
        LLILLL = new C2254308sP(enumC20563715dLArr);
        Companion = new Object() { // from class: X.15e9
        };
    }

    public static EnumC20563715dL[] values() {
        return (EnumC20563715dL[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC20563715dL valueOf(String str) {
        return (EnumC20563715dL) C08FF.LIZ(EnumC20563715dL.class, str);
    }

    public EnumC20563715dL(String str, int i, int i2) {
        this.LL = i2;
    }
}
