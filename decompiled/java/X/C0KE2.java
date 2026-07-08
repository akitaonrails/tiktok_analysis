package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0KE2, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KE2 {
    public static final C0KED Companion;
    public static final C0KE2 DISCOUNT;
    public static final C0KE2 FREE_TRIAL_7DAYS;
    public static final /* synthetic */ C0KE2[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0KE2 UNKNOWN;
    public final long LL;

    public static InterfaceC2044707zh<C0KE2> getEntries() {
        return LLILLL;
    }

    static {
        C0KE2 c0ke2 = new C0KE2("UNKNOWN", 0, 0L);
        UNKNOWN = c0ke2;
        C0KE2 c0ke22 = new C0KE2("DISCOUNT", 1, 1L);
        DISCOUNT = c0ke22;
        C0KE2 c0ke23 = new C0KE2("FREE_TRIAL_7DAYS", 2, 2L);
        FREE_TRIAL_7DAYS = c0ke23;
        C0KE2[] c0ke2Arr = {c0ke2, c0ke22, c0ke23};
        LLILLJJLI = c0ke2Arr;
        LLILLL = new C2254308sP(c0ke2Arr);
        Companion = new C0KED();
    }

    public static C0KE2[] values() {
        return (C0KE2[]) LLILLJJLI.clone();
    }

    public final long getValue() {
        return this.LL;
    }

    public static C0KE2 valueOf(String str) {
        return (C0KE2) C08FF.LIZ(C0KE2.class, str);
    }

    public C0KE2(String str, int i, long j) {
        this.LL = j;
    }
}
