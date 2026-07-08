package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0rHX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1582450rHX {
    public static final EnumC1582450rHX LL;
    public static final EnumC1582450rHX LLILLJJLI;
    public static final EnumC1582450rHX LLILLL;
    public static final EnumC1582450rHX LLILZ;
    public static final /* synthetic */ EnumC1582450rHX[] LLILZIL;

    static {
        EnumC1582450rHX enumC1582450rHX = new EnumC1582450rHX("IDLE", 0);
        LL = enumC1582450rHX;
        EnumC1582450rHX enumC1582450rHX2 = new EnumC1582450rHX("LOADING", 1);
        LLILLJJLI = enumC1582450rHX2;
        EnumC1582450rHX enumC1582450rHX3 = new EnumC1582450rHX("END", 2);
        LLILLL = enumC1582450rHX3;
        EnumC1582450rHX enumC1582450rHX4 = new EnumC1582450rHX("ERROR", 3);
        LLILZ = enumC1582450rHX4;
        EnumC1582450rHX[] enumC1582450rHXArr = {enumC1582450rHX, enumC1582450rHX2, enumC1582450rHX3, enumC1582450rHX4};
        LLILZIL = enumC1582450rHXArr;
        new C2254308sP(enumC1582450rHXArr);
    }

    public static EnumC1582450rHX[] values() {
        return (EnumC1582450rHX[]) LLILZIL.clone();
    }

    public static EnumC1582450rHX valueOf(String str) {
        return (EnumC1582450rHX) C08FF.LIZ(EnumC1582450rHX.class, str);
    }

    public EnumC1582450rHX(String str, int i) {
    }
}
