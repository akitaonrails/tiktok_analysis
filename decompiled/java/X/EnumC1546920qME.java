package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0qME, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class EnumC1546920qME {
    public static final EnumC1546920qME GeckoChannel;
    public static final /* synthetic */ EnumC1546920qME[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1546920qME LastAccess;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1546920qME> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1546920qME enumC1546920qME = new EnumC1546920qME("LastAccess", 0, "last_access");
        LastAccess = enumC1546920qME;
        EnumC1546920qME enumC1546920qME2 = new EnumC1546920qME("GeckoChannel", 1, "gecko_channel");
        GeckoChannel = enumC1546920qME2;
        EnumC1546920qME[] enumC1546920qMEArr = {enumC1546920qME, enumC1546920qME2};
        LLILLJJLI = enumC1546920qMEArr;
        LLILLL = new C2254308sP(enumC1546920qMEArr);
    }

    public static EnumC1546920qME[] values() {
        return (EnumC1546920qME[]) LLILLJJLI.clone();
    }

    public final String getField() {
        return this.LL;
    }

    public static EnumC1546920qME valueOf(String str) {
        return (EnumC1546920qME) C08FF.LIZ(EnumC1546920qME.class, str);
    }

    public EnumC1546920qME(String str, int i, String str2) {
        this.LL = str2;
    }
}
