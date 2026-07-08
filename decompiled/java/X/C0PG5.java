package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0PG5, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PG5 {
    public static final /* synthetic */ C0PG5[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0PG5 NO_TRACKED_ITEMS;
    public static final C0PG5 PARTIAL_FAIL;
    public static final C0PG5 SUCCESS;
    public static final C0PG5 TIMEOUT;

    public static InterfaceC2044707zh<C0PG5> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0PG5 c0pg5 = new C0PG5("SUCCESS", 0);
        SUCCESS = c0pg5;
        C0PG5 c0pg52 = new C0PG5("PARTIAL_FAIL", 1);
        PARTIAL_FAIL = c0pg52;
        C0PG5 c0pg53 = new C0PG5("TIMEOUT", 2);
        TIMEOUT = c0pg53;
        C0PG5 c0pg54 = new C0PG5("NO_TRACKED_ITEMS", 3);
        NO_TRACKED_ITEMS = c0pg54;
        C0PG5[] c0pg5Arr = {c0pg5, c0pg52, c0pg53, c0pg54};
        LL = c0pg5Arr;
        LLILLJJLI = new C2254308sP(c0pg5Arr);
    }

    public static C0PG5[] values() {
        return (C0PG5[]) LL.clone();
    }

    public static C0PG5 valueOf(String str) {
        return (C0PG5) C08FF.LIZ(C0PG5.class, str);
    }

    public C0PG5(String str, int i) {
    }
}
