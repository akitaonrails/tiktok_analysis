package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.11XN, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11XN {
    public static final C11XN CLAIM;
    public static final C11XN CLAIMED;
    public static final C11XN FOLLOW;
    public static final /* synthetic */ C11XN[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C11XN USE;

    public static InterfaceC2044707zh<C11XN> getEntries() {
        return LLILLJJLI;
    }

    static {
        C11XN c11xn = new C11XN("CLAIM", 0);
        CLAIM = c11xn;
        C11XN c11xn2 = new C11XN("CLAIMED", 1);
        CLAIMED = c11xn2;
        C11XN c11xn3 = new C11XN("USE", 2);
        USE = c11xn3;
        C11XN c11xn4 = new C11XN("FOLLOW", 3);
        FOLLOW = c11xn4;
        C11XN[] c11xnArr = {c11xn, c11xn2, c11xn3, c11xn4};
        LL = c11xnArr;
        LLILLJJLI = new C2254308sP(c11xnArr);
    }

    public static C11XN[] values() {
        return (C11XN[]) LL.clone();
    }

    public static C11XN valueOf(String str) {
        return (C11XN) C08FF.LIZ(C11XN.class, str);
    }

    public C11XN(String str, int i) {
    }
}
