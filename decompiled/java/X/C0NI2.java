package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0NI2, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NI2 {
    public static final C0NI2 BYPASS;
    public static final /* synthetic */ C0NI2[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0NI2 LOAD_MORE;
    public static final C0NI2 PRELOAD;
    public static final C0NI2 REFRESH;

    public static InterfaceC2044707zh<C0NI2> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0NI2 c0ni2 = new C0NI2("PRELOAD", 0);
        PRELOAD = c0ni2;
        C0NI2 c0ni22 = new C0NI2("BYPASS", 1);
        BYPASS = c0ni22;
        C0NI2 c0ni23 = new C0NI2("REFRESH", 2);
        REFRESH = c0ni23;
        C0NI2 c0ni24 = new C0NI2("LOAD_MORE", 3);
        LOAD_MORE = c0ni24;
        C0NI2[] c0ni2Arr = {c0ni2, c0ni22, c0ni23, c0ni24};
        LL = c0ni2Arr;
        LLILLJJLI = new C2254308sP(c0ni2Arr);
    }

    public static C0NI2[] values() {
        return (C0NI2[]) LL.clone();
    }

    public static C0NI2 valueOf(String str) {
        return (C0NI2) C08FF.LIZ(C0NI2.class, str);
    }

    public C0NI2(String str, int i) {
    }
}
