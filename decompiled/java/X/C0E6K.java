package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0E6K, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0E6K {
    public static final C0E6K ADD;
    public static final C0E6K CANVASBG;
    public static final /* synthetic */ C0E6K[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0E6K REPLACE;
    public static final C0E6K SELECT;

    public static InterfaceC2044707zh<C0E6K> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0E6K c0e6k = new C0E6K("SELECT", 0);
        SELECT = c0e6k;
        C0E6K c0e6k2 = new C0E6K("ADD", 1);
        ADD = c0e6k2;
        C0E6K c0e6k3 = new C0E6K("REPLACE", 2);
        REPLACE = c0e6k3;
        C0E6K c0e6k4 = new C0E6K("CANVASBG", 3);
        CANVASBG = c0e6k4;
        C0E6K[] c0e6kArr = {c0e6k, c0e6k2, c0e6k3, c0e6k4};
        LL = c0e6kArr;
        LLILLJJLI = new C2254308sP(c0e6kArr);
    }

    public static C0E6K[] values() {
        return (C0E6K[]) LL.clone();
    }

    public static C0E6K valueOf(String str) {
        return (C0E6K) C08FF.LIZ(C0E6K.class, str);
    }

    public C0E6K(String str, int i) {
    }
}
