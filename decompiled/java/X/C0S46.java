package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0S46, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0S46 {
    public static final C0S46 ALPHA;
    public static final C0S46 EMPTY;
    public static final /* synthetic */ C0S46[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0S46 NONE;
    public static final C0S46 NONE_ALARM;
    public static final C0S46 NONE_SKIP;
    public static final C0S46 SIZE;
    public static final C0S46 VISIBILITY;
    public final String LL;

    public static InterfaceC2044707zh<C0S46> getEntries() {
        return LLILLL;
    }

    static {
        C0S46 c0s46 = new C0S46("VISIBILITY", 0, "VIS");
        VISIBILITY = c0s46;
        C0S46 c0s462 = new C0S46("SIZE", 1, "SIZE");
        SIZE = c0s462;
        C0S46 c0s463 = new C0S46("ALPHA", 2, "ALPHA");
        ALPHA = c0s463;
        C0S46 c0s464 = new C0S46("EMPTY", 3, "EMPTY");
        EMPTY = c0s464;
        C0S46 c0s465 = new C0S46("NONE", 4, "NONE");
        NONE = c0s465;
        C0S46 c0s466 = new C0S46("NONE_SKIP", 5, "NONE_SKIP");
        NONE_SKIP = c0s466;
        C0S46 c0s467 = new C0S46("NONE_ALARM", 6, "NONE_ALARM");
        NONE_ALARM = c0s467;
        C0S46[] c0s46Arr = {c0s46, c0s462, c0s463, c0s464, c0s465, c0s466, c0s467};
        LLILLJJLI = c0s46Arr;
        LLILLL = new C2254308sP(c0s46Arr);
    }

    public static C0S46[] values() {
        return (C0S46[]) LLILLJJLI.clone();
    }

    public final boolean hitAlarm() {
        return this == NONE_ALARM;
    }

    public final boolean isNormalVisible() {
        return this == NONE;
    }

    public final boolean isValid() {
        return this == NONE || this == NONE_SKIP || this == NONE_ALARM;
    }

    public final String getValue() {
        return this.LL;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.LL;
    }

    public static C0S46 valueOf(String str) {
        return (C0S46) C08FF.LIZ(C0S46.class, str);
    }

    public C0S46(String str, int i, String str2) {
        this.LL = str2;
    }
}
