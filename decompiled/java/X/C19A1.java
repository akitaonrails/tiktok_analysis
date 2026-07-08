package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.19A1, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C19A1 {
    public static final C19A1 LL;
    public static final C19A1 LLILLJJLI;
    public static final C19A1 LLILLL;
    public static final C19A1 LLILZ;
    public static final C19A1 LLILZIL;
    public static final C19A1 LLILZLL;
    public static final /* synthetic */ C19A1[] LLIZ;

    static {
        C19A1 c19a1 = new C19A1("NONE", 0);
        LL = c19a1;
        C19A1 c19a12 = new C19A1("ACTIVITY_CREATED", 1);
        LLILLJJLI = c19a12;
        C19A1 c19a13 = new C19A1("START", 2);
        LLILLL = c19a13;
        C19A1 c19a14 = new C19A1("RESUME", 3);
        LLILZ = c19a14;
        C19A1 c19a15 = new C19A1("PAUSE", 4);
        LLILZIL = c19a15;
        C19A1 c19a16 = new C19A1("STOP", 5);
        LLILZLL = c19a16;
        C19A1[] c19a1Arr = {c19a1, c19a12, c19a13, c19a14, c19a15, c19a16};
        LLIZ = c19a1Arr;
        new C2254308sP(c19a1Arr);
    }

    public static C19A1[] values() {
        return (C19A1[]) LLIZ.clone();
    }

    public static C19A1 valueOf(String str) {
        return (C19A1) C08FF.LIZ(C19A1.class, str);
    }

    public C19A1(String str, int i) {
    }
}
