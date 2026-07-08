package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0RQA, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RQA {
    public static final /* synthetic */ C0RQA[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0RQA PAUSE;
    public static final C0RQA PLAY;
    public static final C0RQA STOP;
    public final int LL;

    public static InterfaceC2044707zh<C0RQA> getEntries() {
        return LLILLL;
    }

    static {
        C0RQA c0rqa = new C0RQA("PLAY", 0, 1);
        PLAY = c0rqa;
        C0RQA c0rqa2 = new C0RQA("PAUSE", 1, 2);
        PAUSE = c0rqa2;
        C0RQA c0rqa3 = new C0RQA("STOP", 2, 3);
        STOP = c0rqa3;
        C0RQA[] c0rqaArr = {c0rqa, c0rqa2, c0rqa3};
        LLILLJJLI = c0rqaArr;
        LLILLL = new C2254308sP(c0rqaArr);
    }

    public static C0RQA[] values() {
        return (C0RQA[]) LLILLJJLI.clone();
    }

    public final int getState() {
        return this.LL;
    }

    public static C0RQA valueOf(String str) {
        return (C0RQA) C08FF.LIZ(C0RQA.class, str);
    }

    public C0RQA(String str, int i, int i2) {
        this.LL = i2;
    }
}
