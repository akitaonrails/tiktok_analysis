package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0MzB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC586350MzB {
    public static final /* synthetic */ EnumC586350MzB[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC586350MzB PRE_DATA;
    public static final EnumC586350MzB REAL_DATA;
    public static final EnumC586350MzB UNKNOWN;

    public static InterfaceC2044707zh<EnumC586350MzB> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC586350MzB enumC586350MzB = new EnumC586350MzB("UNKNOWN", 0);
        UNKNOWN = enumC586350MzB;
        EnumC586350MzB enumC586350MzB2 = new EnumC586350MzB("PRE_DATA", 1);
        PRE_DATA = enumC586350MzB2;
        EnumC586350MzB enumC586350MzB3 = new EnumC586350MzB("REAL_DATA", 2);
        REAL_DATA = enumC586350MzB3;
        EnumC586350MzB[] enumC586350MzBArr = {enumC586350MzB, enumC586350MzB2, enumC586350MzB3};
        LL = enumC586350MzBArr;
        LLILLJJLI = new C2254308sP(enumC586350MzBArr);
    }

    public static EnumC586350MzB[] values() {
        return (EnumC586350MzB[]) LL.clone();
    }

    public static EnumC586350MzB valueOf(String str) {
        return (EnumC586350MzB) C08FF.LIZ(EnumC586350MzB.class, str);
    }

    public EnumC586350MzB(String str, int i) {
    }
}
