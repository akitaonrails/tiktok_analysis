package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ErB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC377550ErB {
    public static final /* synthetic */ EnumC377550ErB[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC377550ErB SLIDE_END;
    public static final EnumC377550ErB SLIDE_IN;
    public static final EnumC377550ErB SLIDE_OUT;
    public static final EnumC377550ErB SLIDE_START;

    public static InterfaceC2044707zh<EnumC377550ErB> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC377550ErB enumC377550ErB = new EnumC377550ErB("SLIDE_START", 0);
        SLIDE_START = enumC377550ErB;
        EnumC377550ErB enumC377550ErB2 = new EnumC377550ErB("SLIDE_IN", 1);
        SLIDE_IN = enumC377550ErB2;
        EnumC377550ErB enumC377550ErB3 = new EnumC377550ErB("SLIDE_OUT", 2);
        SLIDE_OUT = enumC377550ErB3;
        EnumC377550ErB enumC377550ErB4 = new EnumC377550ErB("SLIDE_END", 3);
        SLIDE_END = enumC377550ErB4;
        EnumC377550ErB[] enumC377550ErBArr = {enumC377550ErB, enumC377550ErB2, enumC377550ErB3, enumC377550ErB4};
        LL = enumC377550ErBArr;
        LLILLJJLI = new C2254308sP(enumC377550ErBArr);
    }

    public static EnumC377550ErB[] values() {
        return (EnumC377550ErB[]) LL.clone();
    }

    public static EnumC377550ErB valueOf(String str) {
        return (EnumC377550ErB) C08FF.LIZ(EnumC377550ErB.class, str);
    }

    public EnumC377550ErB(String str, int i) {
    }
}
