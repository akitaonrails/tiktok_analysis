package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0L9U, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0L9U {
    public static final C0L9U GRANTED_AFTER_REQUEST;
    public static final C0L9U GRANTED_BEFORE_REQUEST;
    public static final /* synthetic */ C0L9U[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<C0L9U> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0L9U c0l9u = new C0L9U("GRANTED_BEFORE_REQUEST", 0);
        GRANTED_BEFORE_REQUEST = c0l9u;
        C0L9U c0l9u2 = new C0L9U("GRANTED_AFTER_REQUEST", 1);
        GRANTED_AFTER_REQUEST = c0l9u2;
        C0L9U[] c0l9uArr = {c0l9u, c0l9u2};
        LL = c0l9uArr;
        LLILLJJLI = new C2254308sP(c0l9uArr);
    }

    public static C0L9U[] values() {
        return (C0L9U[]) LL.clone();
    }

    public static C0L9U valueOf(String str) {
        return (C0L9U) C08FF.LIZ(C0L9U.class, str);
    }

    public C0L9U(String str, int i) {
    }
}
