package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0QW1, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QW1 {
    public static final C0QW1 CLICK;
    public static final C0QW1 CONTAINER_LAUNCH;
    public static final /* synthetic */ C0QW1[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final C0QW1 MEANINGFUL;
    public static final C0QW1 MIX_INIT;
    public static final C0QW1 NOT_INIT;
    public static final C0QW1 PREFETCH;
    public static final C0QW1 REFRESH_DATA;
    public static final C0QW1 ROUTE;
    public final String LL;
    public final int LLILLJJLI;

    public static InterfaceC2044707zh<C0QW1> getEntries() {
        return LLILZ;
    }

    static {
        C0QW1 c0qw1 = new C0QW1("NOT_INIT", 0, "not_init", 0);
        NOT_INIT = c0qw1;
        C0QW1 c0qw12 = new C0QW1("PREFETCH", 1, "prefetch", 99);
        PREFETCH = c0qw12;
        C0QW1 c0qw13 = new C0QW1("CLICK", 2, "click", 1);
        CLICK = c0qw13;
        C0QW1 c0qw14 = new C0QW1("ROUTE", 3, "route", 2);
        ROUTE = c0qw14;
        C0QW1 c0qw15 = new C0QW1("CONTAINER_LAUNCH", 4, "launch", 3);
        CONTAINER_LAUNCH = c0qw15;
        C0QW1 c0qw16 = new C0QW1("MIX_INIT", 5, "mix_init", 4);
        MIX_INIT = c0qw16;
        C0QW1 c0qw17 = new C0QW1("REFRESH_DATA", 6, "mix_refresh_data", 5);
        REFRESH_DATA = c0qw17;
        C0QW1 c0qw18 = new C0QW1("MEANINGFUL", 7, "meaningful", 6);
        MEANINGFUL = c0qw18;
        C0QW1[] c0qw1Arr = {c0qw1, c0qw12, c0qw13, c0qw14, c0qw15, c0qw16, c0qw17, c0qw18};
        LLILLL = c0qw1Arr;
        LLILZ = new C2254308sP(c0qw1Arr);
    }

    public static C0QW1[] values() {
        return (C0QW1[]) LLILLL.clone();
    }

    public final int getSequence() {
        return this.LLILLJJLI;
    }

    public final String getStage() {
        return this.LL;
    }

    public static C0QW1 valueOf(String str) {
        return (C0QW1) C08FF.LIZ(C0QW1.class, str);
    }

    public C0QW1(String str, int i, String str2, int i2) {
        this.LL = str2;
        this.LLILLJJLI = i2;
    }
}
