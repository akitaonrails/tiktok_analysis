package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0KTZ, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KTZ {
    public static final C0KTZ ACTIVE;
    public static final C0KTZ CANCEL;
    public static final C0KTZ EXPIRED;
    public static final C0KTZ INIT;
    public static final /* synthetic */ C0KTZ[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0KTZ ON_HOLD;
    public static final C0KTZ UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<C0KTZ> getEntries() {
        return LLILLL;
    }

    static {
        C0KTZ c0ktz = new C0KTZ("UNKNOWN", 0, -1);
        UNKNOWN = c0ktz;
        C0KTZ c0ktz2 = new C0KTZ("INIT", 1, 0);
        INIT = c0ktz2;
        C0KTZ c0ktz3 = new C0KTZ("ACTIVE", 2, 1);
        ACTIVE = c0ktz3;
        C0KTZ c0ktz4 = new C0KTZ("CANCEL", 3, 2);
        CANCEL = c0ktz4;
        C0KTZ c0ktz5 = new C0KTZ("ON_HOLD", 4, 3);
        ON_HOLD = c0ktz5;
        C0KTZ c0ktz6 = new C0KTZ("EXPIRED", 5, 4);
        EXPIRED = c0ktz6;
        C0KTZ[] c0ktzArr = {c0ktz, c0ktz2, c0ktz3, c0ktz4, c0ktz5, c0ktz6};
        LLILLJJLI = c0ktzArr;
        LLILLL = new C2254308sP(c0ktzArr);
    }

    public static C0KTZ[] values() {
        return (C0KTZ[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C0KTZ valueOf(String str) {
        return (C0KTZ) C08FF.LIZ(C0KTZ.class, str);
    }

    public C0KTZ(String str, int i, int i2) {
        this.LL = i2;
    }
}
