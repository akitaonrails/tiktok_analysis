package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0KE1, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KE1 {
    public static final C0KEN Companion;
    public static final C0KE1 DISCOUNT;
    public static final C0KE1 FREE_TRIAL_7DAYS;
    public static final /* synthetic */ C0KE1[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0KE1 UNKNOWN;
    public final long LL;

    public static InterfaceC2044707zh<C0KE1> getEntries() {
        return LLILLL;
    }

    static {
        C0KE1 c0ke1 = new C0KE1("UNKNOWN", 0, 0L);
        UNKNOWN = c0ke1;
        C0KE1 c0ke12 = new C0KE1("DISCOUNT", 1, 1L);
        DISCOUNT = c0ke12;
        C0KE1 c0ke13 = new C0KE1("FREE_TRIAL_7DAYS", 2, 2L);
        FREE_TRIAL_7DAYS = c0ke13;
        C0KE1[] c0ke1Arr = {c0ke1, c0ke12, c0ke13};
        LLILLJJLI = c0ke1Arr;
        LLILLL = new C2254308sP(c0ke1Arr);
        Companion = new C0KEN();
    }

    public static C0KE1[] values() {
        return (C0KE1[]) LLILLJJLI.clone();
    }

    public final long getValue() {
        return this.LL;
    }

    public static C0KE1 valueOf(String str) {
        return (C0KE1) C08FF.LIZ(C0KE1.class, str);
    }

    public C0KE1(String str, int i, long j) {
        this.LL = j;
    }
}
