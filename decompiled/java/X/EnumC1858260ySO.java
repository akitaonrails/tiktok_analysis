package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ySO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1858260ySO {
    public static final EnumC1858260ySO LLILLL;
    public static final EnumC1858260ySO LLILZ;
    public static final EnumC1858260ySO LLILZIL;
    public static final EnumC1858260ySO LLILZLL;
    public static final EnumC1858260ySO LLIZ;
    public static final /* synthetic */ EnumC1858260ySO[] LLIZLLLIL;
    public final Integer LL;
    public final String LLILLJJLI;

    static {
        EnumC1858260ySO enumC1858260ySO = new EnumC1858260ySO(0, "RESPONSE_1", 0, "response_1");
        LLILLL = enumC1858260ySO;
        EnumC1858260ySO enumC1858260ySO2 = new EnumC1858260ySO(1, "RESPONSE_2", 1, "response_2");
        LLILZ = enumC1858260ySO2;
        EnumC1858260ySO enumC1858260ySO3 = new EnumC1858260ySO(2, "BOTH", 2, "both");
        LLILZIL = enumC1858260ySO3;
        EnumC1858260ySO enumC1858260ySO4 = new EnumC1858260ySO(3, "NEITHER", 3, "neither");
        LLILZLL = enumC1858260ySO4;
        EnumC1858260ySO enumC1858260ySO5 = new EnumC1858260ySO(4, "CLOSE", null, null);
        LLIZ = enumC1858260ySO5;
        EnumC1858260ySO[] enumC1858260ySOArr = {enumC1858260ySO, enumC1858260ySO2, enumC1858260ySO3, enumC1858260ySO4, enumC1858260ySO5};
        LLIZLLLIL = enumC1858260ySOArr;
        new C2254308sP(enumC1858260ySOArr);
    }

    public static EnumC1858260ySO[] values() {
        return (EnumC1858260ySO[]) LLIZLLLIL.clone();
    }

    public static EnumC1858260ySO valueOf(String str) {
        return (EnumC1858260ySO) C08FF.LIZ(EnumC1858260ySO.class, str);
    }

    public EnumC1858260ySO(int i, String str, Integer num, String str2) {
        this.LL = num;
        this.LLILLJJLI = str2;
    }
}
