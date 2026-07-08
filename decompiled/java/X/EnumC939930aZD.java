package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0aZD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC939930aZD {
    public static final EnumC939930aZD ANCHOR;
    public static final EnumC939930aZD CONTENT;
    public static final EnumC939930aZD GUEST;
    public static final /* synthetic */ EnumC939930aZD[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC939930aZD NO_GUEST;
    public final String LL;

    public static InterfaceC2044707zh<EnumC939930aZD> getEntries() {
        return LLILLL;
    }

    static {
        EnumC939930aZD enumC939930aZD = new EnumC939930aZD("ANCHOR", 0, "anchor");
        ANCHOR = enumC939930aZD;
        EnumC939930aZD enumC939930aZD2 = new EnumC939930aZD("GUEST", 1, "guest");
        GUEST = enumC939930aZD2;
        EnumC939930aZD enumC939930aZD3 = new EnumC939930aZD("CONTENT", 2, "content");
        CONTENT = enumC939930aZD3;
        EnumC939930aZD enumC939930aZD4 = new EnumC939930aZD("NO_GUEST", 3, "noGuest");
        NO_GUEST = enumC939930aZD4;
        EnumC939930aZD[] enumC939930aZDArr = {enumC939930aZD, enumC939930aZD2, enumC939930aZD3, enumC939930aZD4};
        LLILLJJLI = enumC939930aZDArr;
        LLILLL = new C2254308sP(enumC939930aZDArr);
    }

    public static EnumC939930aZD[] values() {
        return (EnumC939930aZD[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC939930aZD valueOf(String str) {
        return (EnumC939930aZD) C08FF.LIZ(EnumC939930aZD.class, str);
    }

    public EnumC939930aZD(String str, int i, String str2) {
        this.LL = str2;
    }
}
