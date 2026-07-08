package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0D4A, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0D4A {
    public static final C0D4A DONE;
    public static final C0D4A GIVEN_UP;
    public static final C0D4A IDLE;
    public static final C0D4A IMG_FAILED;
    public static final C0D4A IMG_IN_FLIGHT;
    public static final /* synthetic */ C0D4A[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0D4A UCP_FAILED;
    public static final C0D4A UCP_IN_FLIGHT;
    public static final C0D4A UCP_SUCCESS;

    public static InterfaceC2044707zh<C0D4A> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0D4A c0d4a = new C0D4A("IDLE", 0);
        IDLE = c0d4a;
        C0D4A c0d4a2 = new C0D4A("UCP_IN_FLIGHT", 1);
        UCP_IN_FLIGHT = c0d4a2;
        C0D4A c0d4a3 = new C0D4A("UCP_SUCCESS", 2);
        UCP_SUCCESS = c0d4a3;
        C0D4A c0d4a4 = new C0D4A("UCP_FAILED", 3);
        UCP_FAILED = c0d4a4;
        C0D4A c0d4a5 = new C0D4A("IMG_IN_FLIGHT", 4);
        IMG_IN_FLIGHT = c0d4a5;
        C0D4A c0d4a6 = new C0D4A("IMG_FAILED", 5);
        IMG_FAILED = c0d4a6;
        C0D4A c0d4a7 = new C0D4A("DONE", 6);
        DONE = c0d4a7;
        C0D4A c0d4a8 = new C0D4A("GIVEN_UP", 7);
        GIVEN_UP = c0d4a8;
        C0D4A[] c0d4aArr = {c0d4a, c0d4a2, c0d4a3, c0d4a4, c0d4a5, c0d4a6, c0d4a7, c0d4a8};
        LL = c0d4aArr;
        LLILLJJLI = new C2254308sP(c0d4aArr);
    }

    public static C0D4A[] values() {
        return (C0D4A[]) LL.clone();
    }

    /* JADX INFO: renamed from: short, reason: not valid java name */
    public final String m23short() {
        switch (C0D4B.LIZ[ordinal()]) {
            case 1:
                return "I";
            case 2:
                return "UF";
            case 3:
                return "US";
            case 4:
                return "UX";
            case 5:
                return "IF";
            case 6:
                return "IX";
            case 7:
                return "OK";
            case 8:
                return "GU";
            default:
                throw new C1954807lC();
        }
    }

    public static C0D4A valueOf(String str) {
        return (C0D4A) C08FF.LIZ(C0D4A.class, str);
    }

    public C0D4A(String str, int i) {
    }
}
