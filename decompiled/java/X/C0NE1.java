package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0NE1, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NE1 {
    public static final C0NE1 ADD;
    public static final C0NE1 CLEAR;
    public static final C0NE1 IN;
    public static final /* synthetic */ C0NE1[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0NE1 REMOVE;
    public static final C0NE1 REPLACE;

    public static InterfaceC2044707zh<C0NE1> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0NE1 c0ne1 = new C0NE1("ADD", 0);
        ADD = c0ne1;
        C0NE1 c0ne12 = new C0NE1("REMOVE", 1);
        REMOVE = c0ne12;
        C0NE1 c0ne13 = new C0NE1("REPLACE", 2);
        REPLACE = c0ne13;
        C0NE1 c0ne14 = new C0NE1("CLEAR", 3);
        CLEAR = c0ne14;
        C0NE1 c0ne15 = new C0NE1("IN", 4);
        IN = c0ne15;
        C0NE1[] c0ne1Arr = {c0ne1, c0ne12, c0ne13, c0ne14, c0ne15};
        LL = c0ne1Arr;
        LLILLJJLI = new C2254308sP(c0ne1Arr);
    }

    public static C0NE1[] values() {
        return (C0NE1[]) LL.clone();
    }

    public static C0NE1 valueOf(String str) {
        return (C0NE1) C08FF.LIZ(C0NE1.class, str);
    }

    public C0NE1(String str, int i) {
    }
}
