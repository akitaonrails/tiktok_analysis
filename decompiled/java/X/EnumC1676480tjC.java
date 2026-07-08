package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0tjC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class EnumC1676480tjC {
    public static final EnumC1676480tjC LL;
    public static final EnumC1676480tjC LLILLJJLI;
    public static final EnumC1676480tjC LLILLL;
    public static final /* synthetic */ EnumC1676480tjC[] LLILZ;

    static {
        EnumC1676480tjC enumC1676480tjC = new EnumC1676480tjC("Unlimited", 0);
        LL = enumC1676480tjC;
        EnumC1676480tjC enumC1676480tjC2 = new EnumC1676480tjC("FirstItemRestrict", 1);
        LLILLJJLI = enumC1676480tjC2;
        EnumC1676480tjC enumC1676480tjC3 = new EnumC1676480tjC("SecondItemRestrict", 2);
        LLILLL = enumC1676480tjC3;
        EnumC1676480tjC[] enumC1676480tjCArr = {enumC1676480tjC, enumC1676480tjC2, enumC1676480tjC3};
        LLILZ = enumC1676480tjCArr;
        new C2254308sP(enumC1676480tjCArr);
    }

    public static EnumC1676480tjC[] values() {
        return (EnumC1676480tjC[]) LLILZ.clone();
    }

    public static EnumC1676480tjC valueOf(String str) {
        return (EnumC1676480tjC) C08FF.LIZ(EnumC1676480tjC.class, str);
    }

    public EnumC1676480tjC(String str, int i) {
    }
}
