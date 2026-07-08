package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00B2, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00B2 {
    public static final C00B2 DISMISS;
    public static final /* synthetic */ C00B2[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C00B2 SHOW;

    public static InterfaceC2044707zh<C00B2> getEntries() {
        return LLILLJJLI;
    }

    static {
        C00B2 c00b2 = new C00B2("SHOW", 0);
        SHOW = c00b2;
        C00B2 c00b22 = new C00B2("DISMISS", 1);
        DISMISS = c00b22;
        C00B2[] c00b2Arr = {c00b2, c00b22};
        LL = c00b2Arr;
        LLILLJJLI = new C2254308sP(c00b2Arr);
    }

    public static C00B2[] values() {
        return (C00B2[]) LL.clone();
    }

    public static C00B2 valueOf(String str) {
        return (C00B2) C08FF.LIZ(C00B2.class, str);
    }

    public C00B2(String str, int i) {
    }
}
