package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0OL2, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OL2 {
    public static final C0OL2 BULLETIN_ACCOUNT_TYPE_LIVE_ARENA;
    public static final C0OL2 BULLETIN_ACCOUNT_TYPE_NORMAL;
    public static final /* synthetic */ C0OL2[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final long LL;

    public static InterfaceC2044707zh<C0OL2> getEntries() {
        return LLILLL;
    }

    static {
        C0OL2 c0ol2 = new C0OL2("BULLETIN_ACCOUNT_TYPE_NORMAL", 0, 0L);
        BULLETIN_ACCOUNT_TYPE_NORMAL = c0ol2;
        C0OL2 c0ol22 = new C0OL2("BULLETIN_ACCOUNT_TYPE_LIVE_ARENA", 1, 1L);
        BULLETIN_ACCOUNT_TYPE_LIVE_ARENA = c0ol22;
        C0OL2[] c0ol2Arr = {c0ol2, c0ol22};
        LLILLJJLI = c0ol2Arr;
        LLILLL = new C2254308sP(c0ol2Arr);
    }

    public static C0OL2[] values() {
        return (C0OL2[]) LLILLJJLI.clone();
    }

    public final long getType() {
        return this.LL;
    }

    public static C0OL2 valueOf(String str) {
        return (C0OL2) C08FF.LIZ(C0OL2.class, str);
    }

    public C0OL2(String str, int i, long j) {
        this.LL = j;
    }
}
