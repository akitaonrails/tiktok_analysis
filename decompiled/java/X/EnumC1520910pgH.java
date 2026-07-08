package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0pgH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class EnumC1520910pgH {
    public static final C1520930pgJ Companion;
    public static final /* synthetic */ EnumC1520910pgH[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1520910pgH LYNX;
    public static final EnumC1520910pgH SDUI;
    public static final EnumC1520910pgH UNKNOWN;
    public static final EnumC1520910pgH WEB;
    public final String LL;

    public static final EnumC1520910pgH fromName(String str) {
        Companion.getClass();
        return C1520930pgJ.LIZ(str);
    }

    public static InterfaceC2044707zh<EnumC1520910pgH> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1520910pgH enumC1520910pgH = new EnumC1520910pgH("WEB", 0, "web");
        WEB = enumC1520910pgH;
        EnumC1520910pgH enumC1520910pgH2 = new EnumC1520910pgH("LYNX", 1, "lynx");
        LYNX = enumC1520910pgH2;
        EnumC1520910pgH enumC1520910pgH3 = new EnumC1520910pgH("SDUI", 2, "sdui");
        SDUI = enumC1520910pgH3;
        EnumC1520910pgH enumC1520910pgH4 = new EnumC1520910pgH("UNKNOWN", 3, "unknown");
        UNKNOWN = enumC1520910pgH4;
        EnumC1520910pgH[] enumC1520910pgHArr = {enumC1520910pgH, enumC1520910pgH2, enumC1520910pgH3, enumC1520910pgH4};
        LLILLJJLI = enumC1520910pgHArr;
        LLILLL = new C2254308sP(enumC1520910pgHArr);
        Companion = new C1520930pgJ();
    }

    public static EnumC1520910pgH[] values() {
        return (EnumC1520910pgH[]) LLILLJJLI.clone();
    }

    public final String getType() {
        return this.LL;
    }

    public static EnumC1520910pgH valueOf(String str) {
        return (EnumC1520910pgH) C08FF.LIZ(EnumC1520910pgH.class, str);
    }

    public EnumC1520910pgH(String str, int i, String str2) {
        this.LL = str2;
    }
}
