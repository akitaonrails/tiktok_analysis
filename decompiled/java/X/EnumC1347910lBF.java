package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0lBF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class EnumC1347910lBF {
    public static final EnumC1347910lBF LL;
    public static final EnumC1347910lBF LLILLJJLI;
    public static final EnumC1347910lBF LLILLL;
    public static final /* synthetic */ EnumC1347910lBF[] LLILZ;

    static {
        EnumC1347910lBF enumC1347910lBF = new EnumC1347910lBF("HIDDEN", 0);
        LL = enumC1347910lBF;
        EnumC1347910lBF enumC1347910lBF2 = new EnumC1347910lBF("ENABLED", 1);
        LLILLJJLI = enumC1347910lBF2;
        EnumC1347910lBF enumC1347910lBF3 = new EnumC1347910lBF("DISABLED", 2);
        LLILLL = enumC1347910lBF3;
        EnumC1347910lBF[] enumC1347910lBFArr = {enumC1347910lBF, enumC1347910lBF2, enumC1347910lBF3};
        LLILZ = enumC1347910lBFArr;
        new C2254308sP(enumC1347910lBFArr);
    }

    public static EnumC1347910lBF[] values() {
        return (EnumC1347910lBF[]) LLILZ.clone();
    }

    public static EnumC1347910lBF valueOf(String str) {
        return (EnumC1347910lBF) C08FF.LIZ(EnumC1347910lBF.class, str);
    }

    public EnumC1347910lBF(String str, int i) {
    }
}
