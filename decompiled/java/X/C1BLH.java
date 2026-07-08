package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1BLH, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BLH {
    public static final C1BLH CANCELED;
    public static final C1BLH DOWNLOADED;
    public static final C1BLH FAILED;
    public static final /* synthetic */ C1BLH[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C1BLH NOT_START;
    public static final C1BLH PENDING;
    public static final C1BLH RUNNING;
    public static final C1BLH SUCCEEDED;
    public static final C1BLH TIMEOUT;
    public static final C1BLH UNKNOWN;

    public static InterfaceC2044707zh<C1BLH> getEntries() {
        return LLILLJJLI;
    }

    static {
        C1BLH c1blh = new C1BLH("NOT_START", 0);
        NOT_START = c1blh;
        C1BLH c1blh2 = new C1BLH("TIMEOUT", 1);
        TIMEOUT = c1blh2;
        C1BLH c1blh3 = new C1BLH("PENDING", 2);
        PENDING = c1blh3;
        C1BLH c1blh4 = new C1BLH("RUNNING", 3);
        RUNNING = c1blh4;
        C1BLH c1blh5 = new C1BLH("DOWNLOADED", 4);
        DOWNLOADED = c1blh5;
        C1BLH c1blh6 = new C1BLH("SUCCEEDED", 5);
        SUCCEEDED = c1blh6;
        C1BLH c1blh7 = new C1BLH("FAILED", 6);
        FAILED = c1blh7;
        C1BLH c1blh8 = new C1BLH("CANCELED", 7);
        CANCELED = c1blh8;
        C1BLH c1blh9 = new C1BLH("UNKNOWN", 8);
        UNKNOWN = c1blh9;
        C1BLH[] c1blhArr = {c1blh, c1blh2, c1blh3, c1blh4, c1blh5, c1blh6, c1blh7, c1blh8, c1blh9};
        LL = c1blhArr;
        LLILLJJLI = new C2254308sP(c1blhArr);
    }

    public static C1BLH[] values() {
        return (C1BLH[]) LL.clone();
    }

    public final boolean isFinished() {
        return this == SUCCEEDED || this == FAILED || this == CANCELED || this == DOWNLOADED || this == UNKNOWN;
    }

    public static C1BLH valueOf(String str) {
        return (C1BLH) C08FF.LIZ(C1BLH.class, str);
    }

    public C1BLH(String str, int i) {
    }
}
