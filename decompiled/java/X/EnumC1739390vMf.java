package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0vMf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1739390vMf {
    public static final EnumC1739390vMf CAMPAIGN;
    public static final /* synthetic */ EnumC1739390vMf[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1739390vMf PDP;
    public static final EnumC1739390vMf SHOWCASE;
    public static final EnumC1739390vMf UNSPECIFIED;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1739390vMf> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1739390vMf enumC1739390vMf = new EnumC1739390vMf("UNSPECIFIED", 0, 0);
        UNSPECIFIED = enumC1739390vMf;
        EnumC1739390vMf enumC1739390vMf2 = new EnumC1739390vMf("PDP", 1, 1);
        PDP = enumC1739390vMf2;
        EnumC1739390vMf enumC1739390vMf3 = new EnumC1739390vMf("CAMPAIGN", 2, 2);
        CAMPAIGN = enumC1739390vMf3;
        EnumC1739390vMf enumC1739390vMf4 = new EnumC1739390vMf("SHOWCASE", 3, 3);
        SHOWCASE = enumC1739390vMf4;
        EnumC1739390vMf[] enumC1739390vMfArr = {enumC1739390vMf, enumC1739390vMf2, enumC1739390vMf3, enumC1739390vMf4};
        LLILLJJLI = enumC1739390vMfArr;
        LLILLL = new C2254308sP(enumC1739390vMfArr);
    }

    public static EnumC1739390vMf[] values() {
        return (EnumC1739390vMf[]) LLILLJJLI.clone();
    }

    public final int getScene() {
        return this.LL;
    }

    public static EnumC1739390vMf valueOf(String str) {
        return (EnumC1739390vMf) C08FF.LIZ(EnumC1739390vMf.class, str);
    }

    public EnumC1739390vMf(String str, int i, int i2) {
        this.LL = i2;
    }
}
