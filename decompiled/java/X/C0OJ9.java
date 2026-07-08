package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0OJ9, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OJ9 {
    public static final /* synthetic */ C0OJ9[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0OJ9 OFF;
    public static final C0OJ9 ON;

    public static InterfaceC2044707zh<C0OJ9> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0OJ9 c0oj9 = new C0OJ9("ON", 0);
        ON = c0oj9;
        C0OJ9 c0oj92 = new C0OJ9("OFF", 1);
        OFF = c0oj92;
        C0OJ9[] c0oj9Arr = {c0oj9, c0oj92};
        LL = c0oj9Arr;
        LLILLJJLI = new C2254308sP(c0oj9Arr);
    }

    public static C0OJ9[] values() {
        return (C0OJ9[]) LL.clone();
    }

    public static C0OJ9 valueOf(String str) {
        return (C0OJ9) C08FF.LIZ(C0OJ9.class, str);
    }

    public C0OJ9(String str, int i) {
    }
}
