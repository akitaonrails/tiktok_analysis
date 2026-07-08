package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.15gP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class EnumC20582715gP {
    public static final /* synthetic */ EnumC20582715gP[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC20582715gP QUOTA_FAIL;
    public static final EnumC20582715gP RATE_LIMIT;
    public static final EnumC20582715gP SERVER_ERROR;
    public static final EnumC20582715gP TNS_ERROR;
    public final String LL;

    public static InterfaceC2044707zh<EnumC20582715gP> getEntries() {
        return LLILLL;
    }

    static {
        EnumC20582715gP enumC20582715gP = new EnumC20582715gP("SERVER_ERROR", 0, "server_error");
        SERVER_ERROR = enumC20582715gP;
        EnumC20582715gP enumC20582715gP2 = new EnumC20582715gP("QUOTA_FAIL", 1, "quota_fail");
        QUOTA_FAIL = enumC20582715gP2;
        EnumC20582715gP enumC20582715gP3 = new EnumC20582715gP("RATE_LIMIT", 2, "rate_limit");
        RATE_LIMIT = enumC20582715gP3;
        EnumC20582715gP enumC20582715gP4 = new EnumC20582715gP("TNS_ERROR", 3, "tns_error");
        TNS_ERROR = enumC20582715gP4;
        EnumC20582715gP[] enumC20582715gPArr = {enumC20582715gP, enumC20582715gP2, enumC20582715gP3, enumC20582715gP4};
        LLILLJJLI = enumC20582715gPArr;
        LLILLL = new C2254308sP(enumC20582715gPArr);
    }

    public static EnumC20582715gP[] values() {
        return (EnumC20582715gP[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC20582715gP valueOf(String str) {
        return (EnumC20582715gP) C08FF.LIZ(EnumC20582715gP.class, str);
    }

    public EnumC20582715gP(String str, int i, String str2) {
        this.LL = str2;
    }
}
