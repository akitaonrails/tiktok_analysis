package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0pYf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class EnumC1516190pYf {
    public static final EnumC1516190pYf LL;
    public static final EnumC1516190pYf LLILLJJLI;
    public static final EnumC1516190pYf LLILLL;
    public static final EnumC1516190pYf LLILZ;
    public static final /* synthetic */ EnumC1516190pYf[] LLILZIL;

    static {
        EnumC1516190pYf enumC1516190pYf = new EnumC1516190pYf("NONE", 0);
        LL = enumC1516190pYf;
        EnumC1516190pYf enumC1516190pYf2 = new EnumC1516190pYf("WAITING_PREFER", 1);
        LLILLJJLI = enumC1516190pYf2;
        EnumC1516190pYf enumC1516190pYf3 = new EnumC1516190pYf("RELEASED_BY_PREFER", 2);
        LLILLL = enumC1516190pYf3;
        EnumC1516190pYf enumC1516190pYf4 = new EnumC1516190pYf("RELEASED_BY_TIMEOUT", 3);
        LLILZ = enumC1516190pYf4;
        EnumC1516190pYf[] enumC1516190pYfArr = {enumC1516190pYf, enumC1516190pYf2, enumC1516190pYf3, enumC1516190pYf4};
        LLILZIL = enumC1516190pYfArr;
        new C2254308sP(enumC1516190pYfArr);
    }

    public static EnumC1516190pYf[] values() {
        return (EnumC1516190pYf[]) LLILZIL.clone();
    }

    public static EnumC1516190pYf valueOf(String str) {
        return (EnumC1516190pYf) C08FF.LIZ(EnumC1516190pYf.class, str);
    }

    public EnumC1516190pYf(String str, int i) {
    }
}
