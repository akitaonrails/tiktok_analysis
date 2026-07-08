package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0SU1, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SU1 {
    public static final C0SU1 LL;
    public static final C0SU1 LLILLJJLI;
    public static final C0SU1 LLILLL;
    public static final C0SU1 LLILZ;
    public static final /* synthetic */ C0SU1[] LLILZIL;

    static {
        C0SU1 c0su1 = new C0SU1("NORMAL", 0);
        LL = c0su1;
        C0SU1 c0su12 = new C0SU1("PENDING", 1);
        LLILLJJLI = c0su12;
        C0SU1 c0su13 = new C0SU1("OWNED", 2);
        LLILLL = c0su13;
        C0SU1 c0su14 = new C0SU1("RELEASED", 3);
        LLILZ = c0su14;
        C0SU1[] c0su1Arr = {c0su1, c0su12, c0su13, c0su14};
        LLILZIL = c0su1Arr;
        new C2254308sP(c0su1Arr);
    }

    public static C0SU1[] values() {
        return (C0SU1[]) LLILZIL.clone();
    }

    public static C0SU1 valueOf(String str) {
        return (C0SU1) C08FF.LIZ(C0SU1.class, str);
    }

    public C0SU1(String str, int i) {
    }
}
