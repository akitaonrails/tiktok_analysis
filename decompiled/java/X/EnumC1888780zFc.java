package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0zFc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class EnumC1888780zFc {
    public static final EnumC1888780zFc LL;
    public static final EnumC1888780zFc LLILLJJLI;
    public static final EnumC1888780zFc LLILLL;
    public static final EnumC1888780zFc LLILZ;
    public static final EnumC1888780zFc LLILZIL;
    public static final EnumC1888780zFc LLILZLL;
    public static final /* synthetic */ EnumC1888780zFc[] LLIZ;

    static {
        EnumC1888780zFc enumC1888780zFc = new EnumC1888780zFc("IDENT", 0);
        LL = enumC1888780zFc;
        EnumC1888780zFc enumC1888780zFc2 = new EnumC1888780zFc("AND", 1);
        LLILLJJLI = enumC1888780zFc2;
        EnumC1888780zFc enumC1888780zFc3 = new EnumC1888780zFc("OR", 2);
        LLILLL = enumC1888780zFc3;
        EnumC1888780zFc enumC1888780zFc4 = new EnumC1888780zFc("LPAREN", 3);
        LLILZ = enumC1888780zFc4;
        EnumC1888780zFc enumC1888780zFc5 = new EnumC1888780zFc("RPAREN", 4);
        LLILZIL = enumC1888780zFc5;
        EnumC1888780zFc enumC1888780zFc6 = new EnumC1888780zFc("EOF", 5);
        LLILZLL = enumC1888780zFc6;
        EnumC1888780zFc[] enumC1888780zFcArr = {enumC1888780zFc, enumC1888780zFc2, enumC1888780zFc3, enumC1888780zFc4, enumC1888780zFc5, enumC1888780zFc6};
        LLIZ = enumC1888780zFcArr;
        new C2254308sP(enumC1888780zFcArr);
    }

    public static EnumC1888780zFc[] values() {
        return (EnumC1888780zFc[]) LLIZ.clone();
    }

    public static EnumC1888780zFc valueOf(String str) {
        return (EnumC1888780zFc) C08FF.LIZ(EnumC1888780zFc.class, str);
    }

    public EnumC1888780zFc(String str, int i) {
    }
}
