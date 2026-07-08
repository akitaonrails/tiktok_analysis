package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0KBJ, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KBJ {
    public static final C0KBJ EXPIRED_IN_GRACE_PERIOD;
    public static final /* synthetic */ C0KBJ[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0KBJ NOT_SUBSCRIBE;
    public static final C0KBJ SUBSCRIBED_NOT_EXPIRED;
    public final String LL;

    public static InterfaceC2044707zh<C0KBJ> getEntries() {
        return LLILLL;
    }

    static {
        C0KBJ c0kbj = new C0KBJ("NOT_SUBSCRIBE", 0, "not_subscribed");
        NOT_SUBSCRIBE = c0kbj;
        C0KBJ c0kbj2 = new C0KBJ("SUBSCRIBED_NOT_EXPIRED", 1, "subscribed_not_expired");
        SUBSCRIBED_NOT_EXPIRED = c0kbj2;
        C0KBJ c0kbj3 = new C0KBJ("EXPIRED_IN_GRACE_PERIOD", 2, "subscribed_expired_grace_period");
        EXPIRED_IN_GRACE_PERIOD = c0kbj3;
        C0KBJ[] c0kbjArr = {c0kbj, c0kbj2, c0kbj3};
        LLILLJJLI = c0kbjArr;
        LLILLL = new C2254308sP(c0kbjArr);
    }

    public static C0KBJ[] values() {
        return (C0KBJ[]) LLILLJJLI.clone();
    }

    public final String getState() {
        return this.LL;
    }

    public static C0KBJ valueOf(String str) {
        return (C0KBJ) C08FF.LIZ(C0KBJ.class, str);
    }

    public C0KBJ(String str, int i, String str2) {
        this.LL = str2;
    }
}
