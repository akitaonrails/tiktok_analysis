package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0N2U, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0N2U {
    public static final C0N2U FRESH_ENOUGH;
    public static final /* synthetic */ C0N2U[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0N2U NEED_UPDATE;
    public static final C0N2U OUT_OF_DATE;

    public static InterfaceC2044707zh<C0N2U> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0N2U c0n2u = new C0N2U("FRESH_ENOUGH", 0);
        FRESH_ENOUGH = c0n2u;
        C0N2U c0n2u2 = new C0N2U("NEED_UPDATE", 1);
        NEED_UPDATE = c0n2u2;
        C0N2U c0n2u3 = new C0N2U("OUT_OF_DATE", 2);
        OUT_OF_DATE = c0n2u3;
        C0N2U[] c0n2uArr = {c0n2u, c0n2u2, c0n2u3};
        LL = c0n2uArr;
        LLILLJJLI = new C2254308sP(c0n2uArr);
    }

    public static C0N2U[] values() {
        return (C0N2U[]) LL.clone();
    }

    public static C0N2U valueOf(String str) {
        return (C0N2U) C08FF.LIZ(C0N2U.class, str);
    }

    public C0N2U(String str, int i) {
    }
}
