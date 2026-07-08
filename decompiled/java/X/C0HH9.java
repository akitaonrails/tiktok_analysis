package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0HH9, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HH9 {
    public static final C0HH9 CHANGED_BG_CHANGED_EXPRESSION;
    public static final C0HH9 CHANGED_BG_DEFAULT_EXPRESSION;
    public static final C0HH9 DEFAULT_BG_CHANGED_EXPRESSION;
    public static final C0HH9 DEFAULT_BG_DEFAULT_EXPRESSION;
    public static final /* synthetic */ C0HH9[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<C0HH9> getEntries() {
        return LLILLL;
    }

    static {
        C0HH9 c0hh9 = new C0HH9("CHANGED_BG_CHANGED_EXPRESSION", 0, 0);
        CHANGED_BG_CHANGED_EXPRESSION = c0hh9;
        C0HH9 c0hh92 = new C0HH9("DEFAULT_BG_DEFAULT_EXPRESSION", 1, 1);
        DEFAULT_BG_DEFAULT_EXPRESSION = c0hh92;
        C0HH9 c0hh93 = new C0HH9("DEFAULT_BG_CHANGED_EXPRESSION", 2, 2);
        DEFAULT_BG_CHANGED_EXPRESSION = c0hh93;
        C0HH9 c0hh94 = new C0HH9("CHANGED_BG_DEFAULT_EXPRESSION", 3, 3);
        CHANGED_BG_DEFAULT_EXPRESSION = c0hh94;
        C0HH9[] c0hh9Arr = {c0hh9, c0hh92, c0hh93, c0hh94};
        LLILLJJLI = c0hh9Arr;
        LLILLL = new C2254308sP(c0hh9Arr);
    }

    public static C0HH9[] values() {
        return (C0HH9[]) LLILLJJLI.clone();
    }

    public final int getParam() {
        return this.LL;
    }

    public static C0HH9 valueOf(String str) {
        return (C0HH9) C08FF.LIZ(C0HH9.class, str);
    }

    public C0HH9(String str, int i, int i2) {
        this.LL = i2;
    }
}
