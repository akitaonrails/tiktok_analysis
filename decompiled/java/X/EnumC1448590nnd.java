package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0nnd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class EnumC1448590nnd {
    public static final /* synthetic */ EnumC1448590nnd[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC1448590nnd RATIO_1_1;
    public static final EnumC1448590nnd RATIO_3_4;
    public static final EnumC1448590nnd RATIO_9_16;
    public final float LL;
    public final String LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1448590nnd> getEntries() {
        return LLILZ;
    }

    static {
        EnumC1448590nnd enumC1448590nnd = new EnumC1448590nnd(0.5625f, "RATIO_9_16", 0, "9:16");
        RATIO_9_16 = enumC1448590nnd;
        EnumC1448590nnd enumC1448590nnd2 = new EnumC1448590nnd(0.75f, "RATIO_3_4", 1, "3:4");
        RATIO_3_4 = enumC1448590nnd2;
        EnumC1448590nnd enumC1448590nnd3 = new EnumC1448590nnd(1.0f, "RATIO_1_1", 2, "1:1");
        RATIO_1_1 = enumC1448590nnd3;
        EnumC1448590nnd[] enumC1448590nndArr = {enumC1448590nnd, enumC1448590nnd2, enumC1448590nnd3};
        LLILLL = enumC1448590nndArr;
        LLILZ = new C2254308sP(enumC1448590nndArr);
    }

    public static EnumC1448590nnd[] values() {
        return (EnumC1448590nnd[]) LLILLL.clone();
    }

    public final String getDesc() {
        return this.LLILLJJLI;
    }

    public final float getRatio() {
        return this.LL;
    }

    public static EnumC1448590nnd valueOf(String str) {
        return (EnumC1448590nnd) C08FF.LIZ(EnumC1448590nnd.class, str);
    }

    public EnumC1448590nnd(float f, String str, int i, String str2) {
        this.LL = f;
        this.LLILLJJLI = str2;
    }
}
