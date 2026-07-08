package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0jst, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class EnumC1298090jst {
    public static final EnumC1298090jst Array;
    public static final EnumC1298090jst Boolean;
    public static final EnumC1298090jst Int;
    public static final /* synthetic */ EnumC1298090jst[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1298090jst Map;
    public static final EnumC1298090jst Null;
    public static final EnumC1298090jst Number;
    public static final EnumC1298090jst String;

    public static InterfaceC2044707zh<EnumC1298090jst> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1298090jst enumC1298090jst = new EnumC1298090jst("Null", 0);
        Null = enumC1298090jst;
        EnumC1298090jst enumC1298090jst2 = new EnumC1298090jst("Boolean", 1);
        Boolean = enumC1298090jst2;
        EnumC1298090jst enumC1298090jst3 = new EnumC1298090jst("Number", 2);
        Number = enumC1298090jst3;
        EnumC1298090jst enumC1298090jst4 = new EnumC1298090jst("Int", 3);
        Int = enumC1298090jst4;
        EnumC1298090jst enumC1298090jst5 = new EnumC1298090jst("String", 4);
        String = enumC1298090jst5;
        EnumC1298090jst enumC1298090jst6 = new EnumC1298090jst("Map", 5);
        Map = enumC1298090jst6;
        EnumC1298090jst enumC1298090jst7 = new EnumC1298090jst("Array", 6);
        Array = enumC1298090jst7;
        EnumC1298090jst[] enumC1298090jstArr = {enumC1298090jst, enumC1298090jst2, enumC1298090jst3, enumC1298090jst4, enumC1298090jst5, enumC1298090jst6, enumC1298090jst7};
        LL = enumC1298090jstArr;
        LLILLJJLI = new C2254308sP(enumC1298090jstArr);
    }

    public static EnumC1298090jst[] values() {
        return (EnumC1298090jst[]) LL.clone();
    }

    public static EnumC1298090jst valueOf(String str) {
        return (EnumC1298090jst) C08FF.LIZ(EnumC1298090jst.class, str);
    }

    public EnumC1298090jst(String str, int i) {
    }
}
