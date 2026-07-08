package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0N1P, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0N1P {
    public static final C0N1P CUSTOM_POLL;
    public static final /* synthetic */ C0N1P[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0N1P NONE;

    public static InterfaceC2044707zh<C0N1P> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0N1P c0n1p = new C0N1P("CUSTOM_POLL", 0);
        CUSTOM_POLL = c0n1p;
        C0N1P c0n1p2 = new C0N1P("NONE", 1);
        NONE = c0n1p2;
        C0N1P[] c0n1pArr = {c0n1p, c0n1p2};
        LL = c0n1pArr;
        LLILLJJLI = new C2254308sP(c0n1pArr);
    }

    public static C0N1P[] values() {
        return (C0N1P[]) LL.clone();
    }

    public static C0N1P valueOf(String str) {
        return (C0N1P) C08FF.LIZ(C0N1P.class, str);
    }

    public C0N1P(String str, int i) {
    }
}
