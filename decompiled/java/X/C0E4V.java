package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0E4V, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0E4V {
    public static final C0E4V CIRCLE;
    public static final C0E4V CIRCLE_V2;
    public static final /* synthetic */ C0E4V[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0E4V NONE;

    public static InterfaceC2044707zh<C0E4V> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0E4V c0e4v = new C0E4V("NONE", 0);
        NONE = c0e4v;
        C0E4V c0e4v2 = new C0E4V("CIRCLE", 1);
        CIRCLE = c0e4v2;
        C0E4V c0e4v3 = new C0E4V("CIRCLE_V2", 2);
        CIRCLE_V2 = c0e4v3;
        C0E4V[] c0e4vArr = {c0e4v, c0e4v2, c0e4v3};
        LL = c0e4vArr;
        LLILLJJLI = new C2254308sP(c0e4vArr);
    }

    public static C0E4V[] values() {
        return (C0E4V[]) LL.clone();
    }

    public static C0E4V valueOf(String str) {
        return (C0E4V) C08FF.LIZ(C0E4V.class, str);
    }

    public C0E4V(String str, int i) {
    }
}
