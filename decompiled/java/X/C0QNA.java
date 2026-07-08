package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0QNA, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QNA {
    public static final /* synthetic */ C0QNA[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0QNA RESULT;
    public static final C0QNA SUG;
    public static final C0QNA SUGGEST;
    public final int LL;

    public static InterfaceC2044707zh<C0QNA> getEntries() {
        return LLILLL;
    }

    static {
        C0QNA c0qna = new C0QNA("SUG", 0, 0);
        SUG = c0qna;
        C0QNA c0qna2 = new C0QNA("SUGGEST", 1, 1);
        SUGGEST = c0qna2;
        C0QNA c0qna3 = new C0QNA("RESULT", 2, 2);
        RESULT = c0qna3;
        C0QNA[] c0qnaArr = {c0qna, c0qna2, c0qna3};
        LLILLJJLI = c0qnaArr;
        LLILLL = new C2254308sP(c0qnaArr);
    }

    public static C0QNA[] values() {
        return (C0QNA[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C0QNA valueOf(String str) {
        return (C0QNA) C08FF.LIZ(C0QNA.class, str);
    }

    public C0QNA(String str, int i, int i2) {
        this.LL = i2;
    }
}
