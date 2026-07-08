package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0TVL, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TVL {
    public static final C0TVL EMAIL;
    public static final /* synthetic */ C0TVL[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0TVL PHONE;
    public final String LL;

    public static InterfaceC2044707zh<C0TVL> getEntries() {
        return LLILLL;
    }

    static {
        C0TVL c0tvl = new C0TVL("EMAIL", 0, "email");
        EMAIL = c0tvl;
        C0TVL c0tvl2 = new C0TVL("PHONE", 1, "phone");
        PHONE = c0tvl2;
        C0TVL[] c0tvlArr = {c0tvl, c0tvl2};
        LLILLJJLI = c0tvlArr;
        LLILLL = new C2254308sP(c0tvlArr);
    }

    public static C0TVL[] values() {
        return (C0TVL[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C0TVL valueOf(String str) {
        return (C0TVL) C08FF.LIZ(C0TVL.class, str);
    }

    public C0TVL(String str, int i, String str2) {
        this.LL = str2;
    }
}
