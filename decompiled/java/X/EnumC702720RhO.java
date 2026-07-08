package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0RhO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class EnumC702720RhO {
    public static final EnumC702720RhO ALPHA;
    public static final EnumC702720RhO AVAILABLE;
    public static final /* synthetic */ EnumC702720RhO[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC702720RhO MEASURE_HEIGHT;
    public static final EnumC702720RhO MEASURE_WIDTH;
    public static final EnumC702720RhO VISIBLE;
    public final int LL;

    public static InterfaceC2044707zh<EnumC702720RhO> getEntries() {
        return LLILLL;
    }

    static {
        EnumC702720RhO enumC702720RhO = new EnumC702720RhO("VISIBLE", 0, 1);
        VISIBLE = enumC702720RhO;
        EnumC702720RhO enumC702720RhO2 = new EnumC702720RhO("ALPHA", 1, 2);
        ALPHA = enumC702720RhO2;
        EnumC702720RhO enumC702720RhO3 = new EnumC702720RhO("MEASURE_WIDTH", 2, 3);
        MEASURE_WIDTH = enumC702720RhO3;
        EnumC702720RhO enumC702720RhO4 = new EnumC702720RhO("MEASURE_HEIGHT", 3, 4);
        MEASURE_HEIGHT = enumC702720RhO4;
        EnumC702720RhO enumC702720RhO5 = new EnumC702720RhO("AVAILABLE", 4, 0);
        AVAILABLE = enumC702720RhO5;
        EnumC702720RhO[] enumC702720RhOArr = {enumC702720RhO, enumC702720RhO2, enumC702720RhO3, enumC702720RhO4, enumC702720RhO5};
        LLILLJJLI = enumC702720RhOArr;
        LLILLL = new C2254308sP(enumC702720RhOArr);
    }

    public static EnumC702720RhO[] values() {
        return (EnumC702720RhO[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC702720RhO valueOf(String str) {
        return (EnumC702720RhO) C08FF.LIZ(EnumC702720RhO.class, str);
    }

    public EnumC702720RhO(String str, int i, int i2) {
        this.LL = i2;
    }
}
