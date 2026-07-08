package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0NJ5, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NJ5 {
    public static final /* synthetic */ C0NJ5[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0NJ5 PAGE_STATE;
    public static final C0NJ5 PASS_THROUGH;
    public static final C0NJ5 SERVER;

    public static InterfaceC2044707zh<C0NJ5> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0NJ5 c0nj5 = new C0NJ5("PAGE_STATE", 0);
        PAGE_STATE = c0nj5;
        C0NJ5 c0nj52 = new C0NJ5("PASS_THROUGH", 1);
        PASS_THROUGH = c0nj52;
        C0NJ5 c0nj53 = new C0NJ5("SERVER", 2);
        SERVER = c0nj53;
        C0NJ5[] c0nj5Arr = {c0nj5, c0nj52, c0nj53};
        LL = c0nj5Arr;
        LLILLJJLI = new C2254308sP(c0nj5Arr);
    }

    public static C0NJ5[] values() {
        return (C0NJ5[]) LL.clone();
    }

    public static C0NJ5 valueOf(String str) {
        return (C0NJ5) C08FF.LIZ(C0NJ5.class, str);
    }

    public C0NJ5(String str, int i) {
    }
}
