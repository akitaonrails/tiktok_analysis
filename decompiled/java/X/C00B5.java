package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00B5, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00B5 {
    public static final /* synthetic */ C00B5[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C00B5 LOAD;
    public static final C00B5 NONE;
    public static final C00B5 PRELOAD;

    public static InterfaceC2044707zh<C00B5> getEntries() {
        return LLILLJJLI;
    }

    static {
        C00B5 c00b5 = new C00B5("PRELOAD", 0);
        PRELOAD = c00b5;
        C00B5 c00b52 = new C00B5("LOAD", 1);
        LOAD = c00b52;
        C00B5 c00b53 = new C00B5("NONE", 2);
        NONE = c00b53;
        C00B5[] c00b5Arr = {c00b5, c00b52, c00b53};
        LL = c00b5Arr;
        LLILLJJLI = new C2254308sP(c00b5Arr);
    }

    public static C00B5[] values() {
        return (C00B5[]) LL.clone();
    }

    public static C00B5 valueOf(String str) {
        return (C00B5) C08FF.LIZ(C00B5.class, str);
    }

    public C00B5(String str, int i) {
    }
}
