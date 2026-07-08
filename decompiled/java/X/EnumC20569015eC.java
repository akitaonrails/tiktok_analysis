package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.15eC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class EnumC20569015eC {
    public static final EnumC20569015eC BOTTOM;
    public static final EnumC20569015eC CENTER;
    public static final C20568915eB Companion;
    public static final EnumC20569015eC LEFT;
    public static final /* synthetic */ EnumC20569015eC[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC20569015eC RIGHT;
    public static final EnumC20569015eC TOP;
    public final int LL;

    public static InterfaceC2044707zh<EnumC20569015eC> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [X.15eB] */
    static {
        EnumC20569015eC enumC20569015eC = new EnumC20569015eC("CENTER", 0, 0);
        CENTER = enumC20569015eC;
        EnumC20569015eC enumC20569015eC2 = new EnumC20569015eC("LEFT", 1, 1);
        LEFT = enumC20569015eC2;
        EnumC20569015eC enumC20569015eC3 = new EnumC20569015eC("TOP", 2, 2);
        TOP = enumC20569015eC3;
        EnumC20569015eC enumC20569015eC4 = new EnumC20569015eC("RIGHT", 3, 3);
        RIGHT = enumC20569015eC4;
        EnumC20569015eC enumC20569015eC5 = new EnumC20569015eC("BOTTOM", 4, 4);
        BOTTOM = enumC20569015eC5;
        EnumC20569015eC[] enumC20569015eCArr = {enumC20569015eC, enumC20569015eC2, enumC20569015eC3, enumC20569015eC4, enumC20569015eC5};
        LLILLJJLI = enumC20569015eCArr;
        LLILLL = new C2254308sP(enumC20569015eCArr);
        Companion = new Object() { // from class: X.15eB
        };
    }

    public static EnumC20569015eC[] values() {
        return (EnumC20569015eC[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC20569015eC valueOf(String str) {
        return (EnumC20569015eC) C08FF.LIZ(EnumC20569015eC.class, str);
    }

    public EnumC20569015eC(String str, int i, int i2) {
        this.LL = i2;
    }
}
