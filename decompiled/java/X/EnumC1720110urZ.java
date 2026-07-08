package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0urZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1720110urZ {
    public static final EnumC1720110urZ BOTTOM_SHEET;
    public static final EnumC1720110urZ CARD;
    public static final /* synthetic */ EnumC1720110urZ[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1720110urZ PAGE;
    public static final EnumC1720110urZ SECTION;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1720110urZ> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1720110urZ enumC1720110urZ = new EnumC1720110urZ("PAGE", 0, 1);
        PAGE = enumC1720110urZ;
        EnumC1720110urZ enumC1720110urZ2 = new EnumC1720110urZ("BOTTOM_SHEET", 1, 2);
        BOTTOM_SHEET = enumC1720110urZ2;
        EnumC1720110urZ enumC1720110urZ3 = new EnumC1720110urZ("CARD", 2, 3);
        CARD = enumC1720110urZ3;
        EnumC1720110urZ enumC1720110urZ4 = new EnumC1720110urZ("SECTION", 3, 4);
        SECTION = enumC1720110urZ4;
        EnumC1720110urZ[] enumC1720110urZArr = {enumC1720110urZ, enumC1720110urZ2, enumC1720110urZ3, enumC1720110urZ4};
        LLILLJJLI = enumC1720110urZArr;
        LLILLL = new C2254308sP(enumC1720110urZArr);
    }

    public static EnumC1720110urZ[] values() {
        return (EnumC1720110urZ[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1720110urZ valueOf(String str) {
        return (EnumC1720110urZ) C08FF.LIZ(EnumC1720110urZ.class, str);
    }

    public EnumC1720110urZ(String str, int i, int i2) {
        this.LL = i2;
    }
}
