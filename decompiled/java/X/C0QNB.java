package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0QNB, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QNB {
    public static final /* synthetic */ C0QNB[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0QNB RESULT;
    public static final C0QNB SUG;
    public static final C0QNB SUGGEST;

    public static InterfaceC2044707zh<C0QNB> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0QNB c0qnb = new C0QNB("SUG", 0);
        SUG = c0qnb;
        C0QNB c0qnb2 = new C0QNB("SUGGEST", 1);
        SUGGEST = c0qnb2;
        C0QNB c0qnb3 = new C0QNB("RESULT", 2);
        RESULT = c0qnb3;
        C0QNB[] c0qnbArr = {c0qnb, c0qnb2, c0qnb3};
        LL = c0qnbArr;
        LLILLJJLI = new C2254308sP(c0qnbArr);
    }

    public static C0QNB[] values() {
        return (C0QNB[]) LL.clone();
    }

    public static C0QNB valueOf(String str) {
        return (C0QNB) C08FF.LIZ(C0QNB.class, str);
    }

    public C0QNB(String str, int i) {
    }
}
