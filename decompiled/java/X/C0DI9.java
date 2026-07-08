package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0DI9, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DI9 {
    public static final C0DI9 APPEND;
    public static final C0DI9 COMPLETE_CHANGE;
    public static final C0DI9 IDENTICAL;
    public static final /* synthetic */ C0DI9[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0DI9 TAIL_REPLACE;

    public static InterfaceC2044707zh<C0DI9> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0DI9 c0di9 = new C0DI9("IDENTICAL", 0);
        IDENTICAL = c0di9;
        C0DI9 c0di92 = new C0DI9("APPEND", 1);
        APPEND = c0di92;
        C0DI9 c0di93 = new C0DI9("TAIL_REPLACE", 2);
        TAIL_REPLACE = c0di93;
        C0DI9 c0di94 = new C0DI9("COMPLETE_CHANGE", 3);
        COMPLETE_CHANGE = c0di94;
        C0DI9[] c0di9Arr = {c0di9, c0di92, c0di93, c0di94};
        LL = c0di9Arr;
        LLILLJJLI = new C2254308sP(c0di9Arr);
    }

    public static C0DI9[] values() {
        return (C0DI9[]) LL.clone();
    }

    public static C0DI9 valueOf(String str) {
        return (C0DI9) C08FF.LIZ(C0DI9.class, str);
    }

    public C0DI9(String str, int i) {
    }
}
