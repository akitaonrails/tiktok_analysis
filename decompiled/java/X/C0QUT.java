package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0QUT, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QUT {
    public static final /* synthetic */ C0QUT[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0QUT RESULT;
    public static final C0QUT SUG;
    public static final C0QUT SUGGEST;

    public static InterfaceC2044707zh<C0QUT> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0QUT c0qut = new C0QUT("SUG", 0);
        SUG = c0qut;
        C0QUT c0qut2 = new C0QUT("SUGGEST", 1);
        SUGGEST = c0qut2;
        C0QUT c0qut3 = new C0QUT("RESULT", 2);
        RESULT = c0qut3;
        C0QUT[] c0qutArr = {c0qut, c0qut2, c0qut3};
        LL = c0qutArr;
        LLILLJJLI = new C2254308sP(c0qutArr);
    }

    public static C0QUT[] values() {
        return (C0QUT[]) LL.clone();
    }

    public static C0QUT valueOf(String str) {
        return (C0QUT) C08FF.LIZ(C0QUT.class, str);
    }

    public C0QUT(String str, int i) {
    }
}
