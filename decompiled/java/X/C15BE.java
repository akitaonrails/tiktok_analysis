package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.15BE, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15BE {
    public static final C15BE ADDED;
    public static final C15BE DELAY;
    public static final C15BE DELETE;
    public static final /* synthetic */ C15BE[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C15BE LOTTIE;
    public static final C15BE MOVE;
    public static final C15BE NONE;
    public static final C15BE TRANSITION;

    public static InterfaceC2044707zh<C15BE> getEntries() {
        return LLILLJJLI;
    }

    static {
        C15BE c15be = new C15BE("MOVE", 0);
        MOVE = c15be;
        C15BE c15be2 = new C15BE("DELETE", 1);
        DELETE = c15be2;
        C15BE c15be3 = new C15BE("TRANSITION", 2);
        TRANSITION = c15be3;
        C15BE c15be4 = new C15BE("LOTTIE", 3);
        LOTTIE = c15be4;
        C15BE c15be5 = new C15BE("ADDED", 4);
        ADDED = c15be5;
        C15BE c15be6 = new C15BE("NONE", 5);
        NONE = c15be6;
        C15BE c15be7 = new C15BE("DELAY", 6);
        DELAY = c15be7;
        C15BE[] c15beArr = {c15be, c15be2, c15be3, c15be4, c15be5, c15be6, c15be7};
        LL = c15beArr;
        LLILLJJLI = new C2254308sP(c15beArr);
    }

    public static C15BE[] values() {
        return (C15BE[]) LL.clone();
    }

    public static C15BE valueOf(String str) {
        return (C15BE) C08FF.LIZ(C15BE.class, str);
    }

    public C15BE(String str, int i) {
    }
}
