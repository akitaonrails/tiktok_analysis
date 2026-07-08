package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0LQV, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LQV {
    public static final C0LQV AI_PORTRAIT;
    public static final C0LQV AI_REMIX;
    public static final C0LQV AI_THEATER;
    public static final /* synthetic */ C0LQV[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<C0LQV> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0LQV c0lqv = new C0LQV("AI_THEATER", 0);
        AI_THEATER = c0lqv;
        C0LQV c0lqv2 = new C0LQV("AI_REMIX", 1);
        AI_REMIX = c0lqv2;
        C0LQV c0lqv3 = new C0LQV("AI_PORTRAIT", 2);
        AI_PORTRAIT = c0lqv3;
        C0LQV[] c0lqvArr = {c0lqv, c0lqv2, c0lqv3};
        LL = c0lqvArr;
        LLILLJJLI = new C2254308sP(c0lqvArr);
    }

    public static C0LQV[] values() {
        return (C0LQV[]) LL.clone();
    }

    public static C0LQV valueOf(String str) {
        return (C0LQV) C08FF.LIZ(C0LQV.class, str);
    }

    public C0LQV(String str, int i) {
    }
}
