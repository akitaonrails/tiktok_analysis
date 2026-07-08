package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0L9V, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0L9V {
    public static final C0L9V GRANTED_AFTER_REQUEST;
    public static final C0L9V GRANTED_BEFORE_REQUEST;
    public static final /* synthetic */ C0L9V[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<C0L9V> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0L9V c0l9v = new C0L9V("GRANTED_BEFORE_REQUEST", 0);
        GRANTED_BEFORE_REQUEST = c0l9v;
        C0L9V c0l9v2 = new C0L9V("GRANTED_AFTER_REQUEST", 1);
        GRANTED_AFTER_REQUEST = c0l9v2;
        C0L9V[] c0l9vArr = {c0l9v, c0l9v2};
        LL = c0l9vArr;
        LLILLJJLI = new C2254308sP(c0l9vArr);
    }

    public static C0L9V[] values() {
        return (C0L9V[]) LL.clone();
    }

    public static C0L9V valueOf(String str) {
        return (C0L9V) C08FF.LIZ(C0L9V.class, str);
    }

    public C0L9V(String str, int i) {
    }
}
