package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1AKf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class EnumC2177591AKf {
    public static final EnumC2177591AKf CRITICAL;
    public static final C2177611AKh Companion;
    public static final /* synthetic */ EnumC2177591AKf[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC2177591AKf LOW;
    public static final EnumC2177591AKf NONE;
    public static final EnumC2177591AKf NORMAL;

    public static InterfaceC2044707zh<EnumC2177591AKf> getEntries() {
        return LLILLJJLI;
    }

    public static final boolean meetsThreshold(EnumC2177591AKf enumC2177591AKf, EnumC2177591AKf enumC2177591AKf2) {
        Companion.getClass();
        return C2177611AKh.LIZ(enumC2177591AKf, enumC2177591AKf2);
    }

    static {
        EnumC2177591AKf enumC2177591AKf = new EnumC2177591AKf("NONE", 0);
        NONE = enumC2177591AKf;
        EnumC2177591AKf enumC2177591AKf2 = new EnumC2177591AKf("NORMAL", 1);
        NORMAL = enumC2177591AKf2;
        EnumC2177591AKf enumC2177591AKf3 = new EnumC2177591AKf("LOW", 2);
        LOW = enumC2177591AKf3;
        EnumC2177591AKf enumC2177591AKf4 = new EnumC2177591AKf("CRITICAL", 3);
        CRITICAL = enumC2177591AKf4;
        EnumC2177591AKf[] enumC2177591AKfArr = {enumC2177591AKf, enumC2177591AKf2, enumC2177591AKf3, enumC2177591AKf4};
        LL = enumC2177591AKfArr;
        LLILLJJLI = new C2254308sP(enumC2177591AKfArr);
        Companion = new C2177611AKh();
    }

    public static EnumC2177591AKf[] values() {
        return (EnumC2177591AKf[]) LL.clone();
    }

    public static EnumC2177591AKf valueOf(String str) {
        return (EnumC2177591AKf) C08FF.LIZ(EnumC2177591AKf.class, str);
    }

    public EnumC2177591AKf(String str, int i) {
    }
}
