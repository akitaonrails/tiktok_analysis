package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0M3T, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0M3T {
    public static final /* synthetic */ C0M3T[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0M3T THIS_WEEK;
    public static final C0M3T TODAY;
    public static final C0M3T UNKNOWN;
    public final String LL;

    public static InterfaceC2044707zh<C0M3T> getEntries() {
        return LLILLL;
    }

    static {
        C0M3T c0m3t = new C0M3T("TODAY", 0, "Today");
        TODAY = c0m3t;
        C0M3T c0m3t2 = new C0M3T("THIS_WEEK", 1, "This week");
        THIS_WEEK = c0m3t2;
        C0M3T c0m3t3 = new C0M3T("UNKNOWN", 2, "Unknown");
        UNKNOWN = c0m3t3;
        C0M3T[] c0m3tArr = {c0m3t, c0m3t2, c0m3t3};
        LLILLJJLI = c0m3tArr;
        LLILLL = new C2254308sP(c0m3tArr);
    }

    public static C0M3T[] values() {
        return (C0M3T[]) LLILLJJLI.clone();
    }

    public final String getGroupName() {
        return this.LL;
    }

    public static C0M3T valueOf(String str) {
        return (C0M3T) C08FF.LIZ(C0M3T.class, str);
    }

    public C0M3T(String str, int i, String str2) {
        this.LL = str2;
    }
}
