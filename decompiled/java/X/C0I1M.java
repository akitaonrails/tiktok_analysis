package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0I1M, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0I1M {
    public static final C0I1M EXTERNAL_LINK;
    public static final /* synthetic */ C0I1M[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0I1M MENTION_ALL;
    public static final C0I1M MENTION_SINGLE;
    public static final C0I1M ROUTER_HYPER_LINK;
    public static final C0I1M UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<C0I1M> getEntries() {
        return LLILLL;
    }

    static {
        C0I1M c0i1m = new C0I1M("UNKNOWN", 0, 0);
        UNKNOWN = c0i1m;
        C0I1M c0i1m2 = new C0I1M("MENTION_SINGLE", 1, 1);
        MENTION_SINGLE = c0i1m2;
        C0I1M c0i1m3 = new C0I1M("MENTION_ALL", 2, 2);
        MENTION_ALL = c0i1m3;
        C0I1M c0i1m4 = new C0I1M("EXTERNAL_LINK", 3, 3);
        EXTERNAL_LINK = c0i1m4;
        C0I1M c0i1m5 = new C0I1M("ROUTER_HYPER_LINK", 4, 4);
        ROUTER_HYPER_LINK = c0i1m5;
        C0I1M[] c0i1mArr = {c0i1m, c0i1m2, c0i1m3, c0i1m4, c0i1m5};
        LLILLJJLI = c0i1mArr;
        LLILLL = new C2254308sP(c0i1mArr);
    }

    public static C0I1M[] values() {
        return (C0I1M[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C0I1M valueOf(String str) {
        return (C0I1M) C08FF.LIZ(C0I1M.class, str);
    }

    public C0I1M(String str, int i, int i2) {
        this.LL = i2;
    }
}
