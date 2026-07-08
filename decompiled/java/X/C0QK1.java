package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0QK1, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QK1 {
    public static final C0QK1 ECOMMERCE;
    public static final C0QK1 HOT;
    public static final C0QK1 LIVE;
    public static final /* synthetic */ C0QK1[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0QK1 NOTHING;
    public static final C0QK1 PERSON;
    public static final C0QK1 POI;

    public static InterfaceC2044707zh<C0QK1> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0QK1 c0qk1 = new C0QK1("NOTHING", 0);
        NOTHING = c0qk1;
        C0QK1 c0qk12 = new C0QK1("HOT", 1);
        HOT = c0qk12;
        C0QK1 c0qk13 = new C0QK1("LIVE", 2);
        LIVE = c0qk13;
        C0QK1 c0qk14 = new C0QK1("ECOMMERCE", 3);
        ECOMMERCE = c0qk14;
        C0QK1 c0qk15 = new C0QK1("POI", 4);
        POI = c0qk15;
        C0QK1 c0qk16 = new C0QK1("PERSON", 5);
        PERSON = c0qk16;
        C0QK1[] c0qk1Arr = {c0qk1, c0qk12, c0qk13, c0qk14, c0qk15, c0qk16};
        LL = c0qk1Arr;
        LLILLJJLI = new C2254308sP(c0qk1Arr);
    }

    public static C0QK1[] values() {
        return (C0QK1[]) LL.clone();
    }

    public static C0QK1 valueOf(String str) {
        return (C0QK1) C08FF.LIZ(C0QK1.class, str);
    }

    public C0QK1(String str, int i) {
    }
}
