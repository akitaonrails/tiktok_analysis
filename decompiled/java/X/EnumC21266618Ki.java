package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.18Ki, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class EnumC21266618Ki {
    public static final EnumC21266618Ki BUSINESS;
    public static final C21266818Kk Companion;
    public static final EnumC21266618Ki EC;
    public static final /* synthetic */ EnumC21266618Ki[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC21266618Ki LOCAL_SERVICE;
    public static final EnumC21266618Ki UNKNOWN;
    public final String LL;

    public static InterfaceC2044707zh<EnumC21266618Ki> getEntries() {
        return LLILLL;
    }

    static {
        EnumC21266618Ki enumC21266618Ki = new EnumC21266618Ki("EC", 0, "ec_shop");
        EC = enumC21266618Ki;
        EnumC21266618Ki enumC21266618Ki2 = new EnumC21266618Ki("LOCAL_SERVICE", 1, "local_service");
        LOCAL_SERVICE = enumC21266618Ki2;
        EnumC21266618Ki enumC21266618Ki3 = new EnumC21266618Ki("BUSINESS", 2, "LIVE_SDK_GroupBusiness");
        BUSINESS = enumC21266618Ki3;
        EnumC21266618Ki enumC21266618Ki4 = new EnumC21266618Ki("UNKNOWN", 3, "unknown");
        UNKNOWN = enumC21266618Ki4;
        EnumC21266618Ki[] enumC21266618KiArr = {enumC21266618Ki, enumC21266618Ki2, enumC21266618Ki3, enumC21266618Ki4};
        LLILLJJLI = enumC21266618KiArr;
        LLILLL = new C2254308sP(enumC21266618KiArr);
        Companion = new C21266818Kk();
    }

    public static EnumC21266618Ki[] values() {
        return (EnumC21266618Ki[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC21266618Ki valueOf(String str) {
        return (EnumC21266618Ki) C08FF.LIZ(EnumC21266618Ki.class, str);
    }

    public EnumC21266618Ki(String str, int i, String str2) {
        this.LL = str2;
    }
}
