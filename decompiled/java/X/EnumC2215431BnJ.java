package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1BnJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class EnumC2215431BnJ {
    public static final EnumC2215431BnJ FLOAT;
    public static final EnumC2215431BnJ INT;
    public static final /* synthetic */ EnumC2215431BnJ[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC2215431BnJ LONG;
    public static final EnumC2215431BnJ STRING;

    public static InterfaceC2044707zh<EnumC2215431BnJ> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC2215431BnJ enumC2215431BnJ = new EnumC2215431BnJ("INT", 0);
        INT = enumC2215431BnJ;
        EnumC2215431BnJ enumC2215431BnJ2 = new EnumC2215431BnJ("LONG", 1);
        LONG = enumC2215431BnJ2;
        EnumC2215431BnJ enumC2215431BnJ3 = new EnumC2215431BnJ("FLOAT", 2);
        FLOAT = enumC2215431BnJ3;
        EnumC2215431BnJ enumC2215431BnJ4 = new EnumC2215431BnJ("STRING", 3);
        STRING = enumC2215431BnJ4;
        EnumC2215431BnJ[] enumC2215431BnJArr = {enumC2215431BnJ, enumC2215431BnJ2, enumC2215431BnJ3, enumC2215431BnJ4};
        LL = enumC2215431BnJArr;
        LLILLJJLI = new C2254308sP(enumC2215431BnJArr);
    }

    public static EnumC2215431BnJ[] values() {
        return (EnumC2215431BnJ[]) LL.clone();
    }

    public static EnumC2215431BnJ valueOf(String str) {
        return (EnumC2215431BnJ) C08FF.LIZ(EnumC2215431BnJ.class, str);
    }

    public EnumC2215431BnJ(String str, int i) {
    }
}
