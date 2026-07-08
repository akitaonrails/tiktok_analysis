package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00B3, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00B3 {
    public static final C00B3 GONE;
    public static final /* synthetic */ C00B3[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C00B3 SHOW;

    public static InterfaceC2044707zh<C00B3> getEntries() {
        return LLILLJJLI;
    }

    static {
        C00B3 c00b3 = new C00B3("GONE", 0);
        GONE = c00b3;
        C00B3 c00b32 = new C00B3("SHOW", 1);
        SHOW = c00b32;
        C00B3[] c00b3Arr = {c00b3, c00b32};
        LL = c00b3Arr;
        LLILLJJLI = new C2254308sP(c00b3Arr);
    }

    public static C00B3[] values() {
        return (C00B3[]) LL.clone();
    }

    public static C00B3 valueOf(String str) {
        return (C00B3) C08FF.LIZ(C00B3.class, str);
    }

    public C00B3(String str, int i) {
    }
}
