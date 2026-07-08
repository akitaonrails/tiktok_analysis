package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ZBI, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZBI {
    public static final C0ZBI ARCHIVE;
    public static final /* synthetic */ C0ZBI[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0ZBI UN_ARCHIVE;
    public final String LL;

    public static InterfaceC2044707zh<C0ZBI> getEntries() {
        return LLILLL;
    }

    static {
        C0ZBI c0zbi = new C0ZBI("UN_ARCHIVE", 0, "unarchive");
        UN_ARCHIVE = c0zbi;
        C0ZBI c0zbi2 = new C0ZBI("ARCHIVE", 1, "archive");
        ARCHIVE = c0zbi2;
        C0ZBI[] c0zbiArr = {c0zbi, c0zbi2};
        LLILLJJLI = c0zbiArr;
        LLILLL = new C2254308sP(c0zbiArr);
    }

    public static C0ZBI[] values() {
        return (C0ZBI[]) LLILLJJLI.clone();
    }

    public final String getEventName() {
        return this.LL;
    }

    public static C0ZBI valueOf(String str) {
        return (C0ZBI) C08FF.LIZ(C0ZBI.class, str);
    }

    public C0ZBI(String str, int i, String str2) {
        this.LL = str2;
    }
}
