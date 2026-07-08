package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.19C9, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C19C9 {
    public static final C19C9 LL;
    public static final C19C9 LLILLJJLI;
    public static final C19C9 LLILLL;
    public static final C19C9 LLILZ;
    public static final C19C9 LLILZIL;
    public static final C19C9 LLILZLL;
    public static final /* synthetic */ C19C9[] LLIZ;

    static {
        C19C9 c19c9 = new C19C9("NONE", 0);
        LL = c19c9;
        C19C9 c19c92 = new C19C9("ACTIVITY_CREATED", 1);
        LLILLJJLI = c19c92;
        C19C9 c19c93 = new C19C9("START", 2);
        LLILLL = c19c93;
        C19C9 c19c94 = new C19C9("RESUME", 3);
        LLILZ = c19c94;
        C19C9 c19c95 = new C19C9("PAUSE", 4);
        LLILZIL = c19c95;
        C19C9 c19c96 = new C19C9("STOP", 5);
        LLILZLL = c19c96;
        C19C9[] c19c9Arr = {c19c9, c19c92, c19c93, c19c94, c19c95, c19c96};
        LLIZ = c19c9Arr;
        new C2254308sP(c19c9Arr);
    }

    public static C19C9[] values() {
        return (C19C9[]) LLIZ.clone();
    }

    public static C19C9 valueOf(String str) {
        return (C19C9) C08FF.LIZ(C19C9.class, str);
    }

    public C19C9(String str, int i) {
    }
}
