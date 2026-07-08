package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.06IE, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06IE {
    public static final C06IE LARGE;
    public static final /* synthetic */ C06IE[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C06IE NORMAL;
    public static final C06IE SMALL;

    public static InterfaceC2044707zh<C06IE> getEntries() {
        return LLILLJJLI;
    }

    static {
        C06IE c06ie = new C06IE("SMALL", 0);
        SMALL = c06ie;
        C06IE c06ie2 = new C06IE("NORMAL", 1);
        NORMAL = c06ie2;
        C06IE c06ie3 = new C06IE("LARGE", 2);
        LARGE = c06ie3;
        C06IE[] c06ieArr = {c06ie, c06ie2, c06ie3};
        LL = c06ieArr;
        LLILLJJLI = new C2254308sP(c06ieArr);
    }

    public static C06IE[] values() {
        return (C06IE[]) LL.clone();
    }

    public static C06IE valueOf(String str) {
        return (C06IE) C08FF.LIZ(C06IE.class, str);
    }

    public C06IE(String str, int i) {
    }
}
