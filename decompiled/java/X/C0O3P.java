package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0O3P, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0O3P {
    public static final C0O3P CacheFirst;
    public static final C0O3P CacheOnly;
    public static final /* synthetic */ C0O3P[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0O3P NetWhenCacheMiss;
    public static final C0O3P NetworkOnly;

    public static InterfaceC2044707zh<C0O3P> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0O3P c0o3p = new C0O3P("CacheFirst", 0);
        CacheFirst = c0o3p;
        C0O3P c0o3p2 = new C0O3P("NetworkOnly", 1);
        NetworkOnly = c0o3p2;
        C0O3P c0o3p3 = new C0O3P("CacheOnly", 2);
        CacheOnly = c0o3p3;
        C0O3P c0o3p4 = new C0O3P("NetWhenCacheMiss", 3);
        NetWhenCacheMiss = c0o3p4;
        C0O3P[] c0o3pArr = {c0o3p, c0o3p2, c0o3p3, c0o3p4};
        LL = c0o3pArr;
        LLILLJJLI = new C2254308sP(c0o3pArr);
    }

    public static C0O3P[] values() {
        return (C0O3P[]) LL.clone();
    }

    public static C0O3P valueOf(String str) {
        return (C0O3P) C08FF.LIZ(C0O3P.class, str);
    }

    public C0O3P(String str, int i) {
    }
}
