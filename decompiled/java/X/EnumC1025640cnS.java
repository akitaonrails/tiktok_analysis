package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0cnS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1025640cnS {
    public static final EnumC1025640cnS APP_STORE;
    public static final EnumC1025640cnS BROWSER;
    public static final /* synthetic */ EnumC1025640cnS[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1025640cnS OPEN_APP;
    public static final EnumC1025640cnS OPEN_BROWSER_BY_CHOOSER;

    public static InterfaceC2044707zh<EnumC1025640cnS> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1025640cnS enumC1025640cnS = new EnumC1025640cnS("OPEN_APP", 0);
        OPEN_APP = enumC1025640cnS;
        EnumC1025640cnS enumC1025640cnS2 = new EnumC1025640cnS("BROWSER", 1);
        BROWSER = enumC1025640cnS2;
        EnumC1025640cnS enumC1025640cnS3 = new EnumC1025640cnS("APP_STORE", 2);
        APP_STORE = enumC1025640cnS3;
        EnumC1025640cnS enumC1025640cnS4 = new EnumC1025640cnS("OPEN_BROWSER_BY_CHOOSER", 3);
        OPEN_BROWSER_BY_CHOOSER = enumC1025640cnS4;
        EnumC1025640cnS[] enumC1025640cnSArr = {enumC1025640cnS, enumC1025640cnS2, enumC1025640cnS3, enumC1025640cnS4};
        LL = enumC1025640cnSArr;
        LLILLJJLI = new C2254308sP(enumC1025640cnSArr);
    }

    public static EnumC1025640cnS[] values() {
        return (EnumC1025640cnS[]) LL.clone();
    }

    public static EnumC1025640cnS valueOf(String str) {
        return (EnumC1025640cnS) C08FF.LIZ(EnumC1025640cnS.class, str);
    }

    public EnumC1025640cnS(String str, int i) {
    }
}
