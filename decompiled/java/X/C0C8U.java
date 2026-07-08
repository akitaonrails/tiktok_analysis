package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0C8U, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0C8U {
    public static final C0C8U ALL;
    public static final /* synthetic */ C0C8U[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0C8U RANGE;

    public static InterfaceC2044707zh<C0C8U> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0C8U c0c8u = new C0C8U("ALL", 0);
        ALL = c0c8u;
        C0C8U c0c8u2 = new C0C8U("RANGE", 1);
        RANGE = c0c8u2;
        C0C8U[] c0c8uArr = {c0c8u, c0c8u2};
        LL = c0c8uArr;
        LLILLJJLI = new C2254308sP(c0c8uArr);
    }

    public static C0C8U[] values() {
        return (C0C8U[]) LL.clone();
    }

    public static C0C8U valueOf(String str) {
        return (C0C8U) C08FF.LIZ(C0C8U.class, str);
    }

    public C0C8U(String str, int i) {
    }
}
