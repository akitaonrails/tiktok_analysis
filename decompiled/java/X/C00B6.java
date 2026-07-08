package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00B6, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00B6 {
    public static final /* synthetic */ C00B6[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C00B6 PRELOAD;
    public static final C00B6 RENDER;

    public static InterfaceC2044707zh<C00B6> getEntries() {
        return LLILLJJLI;
    }

    static {
        C00B6 c00b6 = new C00B6("PRELOAD", 0);
        PRELOAD = c00b6;
        C00B6 c00b62 = new C00B6("RENDER", 1);
        RENDER = c00b62;
        C00B6[] c00b6Arr = {c00b6, c00b62};
        LL = c00b6Arr;
        LLILLJJLI = new C2254308sP(c00b6Arr);
    }

    public static C00B6[] values() {
        return (C00B6[]) LL.clone();
    }

    public static C00B6 valueOf(String str) {
        return (C00B6) C08FF.LIZ(C00B6.class, str);
    }

    public C00B6(String str, int i) {
    }
}
