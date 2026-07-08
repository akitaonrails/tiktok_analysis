package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0MXF, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MXF {
    public static final C0MXF EXPIRED;
    public static final C0MXF GENERATION;
    public static final /* synthetic */ C0MXF[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0MXF NETWORK;
    public static final C0MXF NOT_DELETE;
    public static final C0MXF NOT_FAIL;
    public static final C0MXF NOT_FOUND;
    public static final C0MXF QUOTA;
    public static final C0MXF VIOLATION;
    public final int LL;

    public static InterfaceC2044707zh<C0MXF> getEntries() {
        return LLILLL;
    }

    static {
        C0MXF c0mxf = new C0MXF("NOT_FAIL", 0, 0);
        NOT_FAIL = c0mxf;
        C0MXF c0mxf2 = new C0MXF("NETWORK", 1, 1);
        NETWORK = c0mxf2;
        C0MXF c0mxf3 = new C0MXF("QUOTA", 2, 2);
        QUOTA = c0mxf3;
        C0MXF c0mxf4 = new C0MXF("GENERATION", 3, 3);
        GENERATION = c0mxf4;
        C0MXF c0mxf5 = new C0MXF("VIOLATION", 4, 4);
        VIOLATION = c0mxf5;
        C0MXF c0mxf6 = new C0MXF("EXPIRED", 5, 5);
        EXPIRED = c0mxf6;
        C0MXF c0mxf7 = new C0MXF("NOT_FOUND", 6, 6);
        NOT_FOUND = c0mxf7;
        C0MXF c0mxf8 = new C0MXF("NOT_DELETE", 7, 7);
        NOT_DELETE = c0mxf8;
        C0MXF[] c0mxfArr = {c0mxf, c0mxf2, c0mxf3, c0mxf4, c0mxf5, c0mxf6, c0mxf7, c0mxf8};
        LLILLJJLI = c0mxfArr;
        LLILLL = new C2254308sP(c0mxfArr);
    }

    public static C0MXF[] values() {
        return (C0MXF[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static C0MXF valueOf(String str) {
        return (C0MXF) C08FF.LIZ(C0MXF.class, str);
    }

    public C0MXF(String str, int i, int i2) {
        this.LL = i2;
    }
}
