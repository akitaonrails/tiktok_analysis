package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0hPJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1202870hPJ {
    public static final EnumC1202870hPJ LLILLJJLI;
    public static final EnumC1202870hPJ LLILLL;
    public static final EnumC1202870hPJ LLILZ;
    public static final EnumC1202870hPJ LLILZIL;
    public static final /* synthetic */ EnumC1202870hPJ[] LLILZLL;
    public final int LL;

    static {
        EnumC1202870hPJ enumC1202870hPJ = new EnumC1202870hPJ("BREATHING_RELAX", 0, 0);
        LLILLJJLI = enumC1202870hPJ;
        EnumC1202870hPJ enumC1202870hPJ2 = new EnumC1202870hPJ("BREATHING_INHALE", 1, 1);
        LLILLL = enumC1202870hPJ2;
        EnumC1202870hPJ enumC1202870hPJ3 = new EnumC1202870hPJ("BREATHING_HOLD", 2, 2);
        EnumC1202870hPJ enumC1202870hPJ4 = new EnumC1202870hPJ("BREATHING_EXHALE", 3, 3);
        LLILZ = enumC1202870hPJ4;
        EnumC1202870hPJ enumC1202870hPJ5 = new EnumC1202870hPJ("BREATHING_DONE", 4, 4);
        LLILZIL = enumC1202870hPJ5;
        EnumC1202870hPJ[] enumC1202870hPJArr = {enumC1202870hPJ, enumC1202870hPJ2, enumC1202870hPJ3, enumC1202870hPJ4, enumC1202870hPJ5};
        LLILZLL = enumC1202870hPJArr;
        new C2254308sP(enumC1202870hPJArr);
    }

    public static EnumC1202870hPJ[] values() {
        return (EnumC1202870hPJ[]) LLILZLL.clone();
    }

    public static EnumC1202870hPJ valueOf(String str) {
        return (EnumC1202870hPJ) C08FF.LIZ(EnumC1202870hPJ.class, str);
    }

    public EnumC1202870hPJ(String str, int i, int i2) {
        this.LL = i2;
    }
}
