package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0HX2, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HX2 {
    public static final C0HX2 ALPHA;
    public static final /* synthetic */ C0HX2[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0HX2 TRANSLATE_Y;

    public static InterfaceC2044707zh<C0HX2> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0HX2 c0hx2 = new C0HX2("ALPHA", 0);
        ALPHA = c0hx2;
        C0HX2 c0hx22 = new C0HX2("TRANSLATE_Y", 1);
        TRANSLATE_Y = c0hx22;
        C0HX2[] c0hx2Arr = {c0hx2, c0hx22};
        LL = c0hx2Arr;
        LLILLJJLI = new C2254308sP(c0hx2Arr);
    }

    public static C0HX2[] values() {
        return (C0HX2[]) LL.clone();
    }

    public static C0HX2 valueOf(String str) {
        return (C0HX2) C08FF.LIZ(C0HX2.class, str);
    }

    public C0HX2(String str, int i) {
    }
}
