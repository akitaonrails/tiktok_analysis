package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0KBI, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KBI {
    public static final C0KBI EXPIRED_IN_GRACE_PERIOD;
    public static final /* synthetic */ C0KBI[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0KBI NOT_SUBSCRIBE;
    public static final C0KBI SUBSCRIBED_NOT_EXPIRED;
    public final String LL;

    public static InterfaceC2044707zh<C0KBI> getEntries() {
        return LLILLL;
    }

    static {
        C0KBI c0kbi = new C0KBI("NOT_SUBSCRIBE", 0, "not_subscribed");
        NOT_SUBSCRIBE = c0kbi;
        C0KBI c0kbi2 = new C0KBI("SUBSCRIBED_NOT_EXPIRED", 1, "subscribed_not_expired");
        SUBSCRIBED_NOT_EXPIRED = c0kbi2;
        C0KBI c0kbi3 = new C0KBI("EXPIRED_IN_GRACE_PERIOD", 2, "subscribed_expired_grace_period");
        EXPIRED_IN_GRACE_PERIOD = c0kbi3;
        C0KBI[] c0kbiArr = {c0kbi, c0kbi2, c0kbi3};
        LLILLJJLI = c0kbiArr;
        LLILLL = new C2254308sP(c0kbiArr);
    }

    public static C0KBI[] values() {
        return (C0KBI[]) LLILLJJLI.clone();
    }

    public final String getState() {
        return this.LL;
    }

    public static C0KBI valueOf(String str) {
        return (C0KBI) C08FF.LIZ(C0KBI.class, str);
    }

    public C0KBI(String str, int i, String str2) {
        this.LL = str2;
    }
}
