package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ZFR, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZFR {
    public static final C0ZFR INTERACTED;
    public static final /* synthetic */ C0ZFR[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0ZFR NOT_AVAILABLE;
    public static final C0ZFR NOT_INTERACT;
    public static final C0ZFR READY_TO_INTERACT;
    public final String LL;

    public static InterfaceC2044707zh<C0ZFR> getEntries() {
        return LLILLL;
    }

    static {
        C0ZFR c0zfr = new C0ZFR("NOT_INTERACT", 0, "not_interact");
        NOT_INTERACT = c0zfr;
        C0ZFR c0zfr2 = new C0ZFR("READY_TO_INTERACT", 1, "ready_to_interact");
        READY_TO_INTERACT = c0zfr2;
        C0ZFR c0zfr3 = new C0ZFR("INTERACTED", 2, "interacted");
        INTERACTED = c0zfr3;
        C0ZFR c0zfr4 = new C0ZFR("NOT_AVAILABLE", 3, "not_available");
        NOT_AVAILABLE = c0zfr4;
        C0ZFR[] c0zfrArr = {c0zfr, c0zfr2, c0zfr3, c0zfr4};
        LLILLJJLI = c0zfrArr;
        LLILLL = new C2254308sP(c0zfrArr);
    }

    public static C0ZFR[] values() {
        return (C0ZFR[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C0ZFR valueOf(String str) {
        return (C0ZFR) C08FF.LIZ(C0ZFR.class, str);
    }

    public C0ZFR(String str, int i, String str2) {
        this.LL = str2;
    }
}
