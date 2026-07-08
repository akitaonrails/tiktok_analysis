package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0TVK, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TVK {
    public static final C0TVK ACTIVITY;
    public static final C0TVK DEVICE;
    public static final C0TVK EMAIL;
    public static final /* synthetic */ C0TVK[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0TVK PASSKEY;
    public static final C0TVK PASSWORD;
    public static final C0TVK PHONE;
    public static final C0TVK TWOSV;
    public final String LL;

    public static InterfaceC2044707zh<C0TVK> getEntries() {
        return LLILLL;
    }

    static {
        C0TVK c0tvk = new C0TVK("PHONE", 0, "phone");
        PHONE = c0tvk;
        C0TVK c0tvk2 = new C0TVK("EMAIL", 1, "email");
        EMAIL = c0tvk2;
        C0TVK c0tvk3 = new C0TVK("TWOSV", 2, "two_sv");
        TWOSV = c0tvk3;
        C0TVK c0tvk4 = new C0TVK("DEVICE", 3, "device");
        DEVICE = c0tvk4;
        C0TVK c0tvk5 = new C0TVK("ACTIVITY", 4, "activity");
        ACTIVITY = c0tvk5;
        C0TVK c0tvk6 = new C0TVK("PASSKEY", 5, "passkey");
        PASSKEY = c0tvk6;
        C0TVK c0tvk7 = new C0TVK("PASSWORD", 6, "password");
        PASSWORD = c0tvk7;
        C0TVK[] c0tvkArr = {c0tvk, c0tvk2, c0tvk3, c0tvk4, c0tvk5, c0tvk6, c0tvk7};
        LLILLJJLI = c0tvkArr;
        LLILLL = new C2254308sP(c0tvkArr);
    }

    public static C0TVK[] values() {
        return (C0TVK[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C0TVK valueOf(String str) {
        return (C0TVK) C08FF.LIZ(C0TVK.class, str);
    }

    public C0TVK(String str, int i, String str2) {
        this.LL = str2;
    }
}
