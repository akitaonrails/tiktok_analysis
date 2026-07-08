package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0EC3, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EC3 {
    public static final C0EC3 CAN_NOT_BE_STITCHED;
    public static final C0EC3 COUNT_LIMIT;
    public static final /* synthetic */ C0EC3[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0EC3 SUCCESS;
    public static final C0EC3 TIME_LIMIT;
    public static final C0EC3 UNEXPECTED;

    public static InterfaceC2044707zh<C0EC3> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0EC3 c0ec3 = new C0EC3("SUCCESS", 0);
        SUCCESS = c0ec3;
        C0EC3 c0ec32 = new C0EC3("COUNT_LIMIT", 1);
        COUNT_LIMIT = c0ec32;
        C0EC3 c0ec33 = new C0EC3("TIME_LIMIT", 2);
        TIME_LIMIT = c0ec33;
        C0EC3 c0ec34 = new C0EC3("CAN_NOT_BE_STITCHED", 3);
        CAN_NOT_BE_STITCHED = c0ec34;
        C0EC3 c0ec35 = new C0EC3("UNEXPECTED", 4);
        UNEXPECTED = c0ec35;
        C0EC3[] c0ec3Arr = {c0ec3, c0ec32, c0ec33, c0ec34, c0ec35};
        LL = c0ec3Arr;
        LLILLJJLI = new C2254308sP(c0ec3Arr);
    }

    public static C0EC3[] values() {
        return (C0EC3[]) LL.clone();
    }

    public static C0EC3 valueOf(String str) {
        return (C0EC3) C08FF.LIZ(C0EC3.class, str);
    }

    public C0EC3(String str, int i) {
    }
}
