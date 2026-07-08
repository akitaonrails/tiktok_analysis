package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0QFY, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QFY {
    public static final C0QFY FOLLOW_IS_FOLD;
    public static final C0QFY IS_FOLDED;
    public static final /* synthetic */ C0QFY[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0QFY NOT_FOLDED;

    public static InterfaceC2044707zh<C0QFY> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0QFY c0qfy = new C0QFY("FOLLOW_IS_FOLD", 0);
        FOLLOW_IS_FOLD = c0qfy;
        C0QFY c0qfy2 = new C0QFY("IS_FOLDED", 1);
        IS_FOLDED = c0qfy2;
        C0QFY c0qfy3 = new C0QFY("NOT_FOLDED", 2);
        NOT_FOLDED = c0qfy3;
        C0QFY[] c0qfyArr = {c0qfy, c0qfy2, c0qfy3};
        LL = c0qfyArr;
        LLILLJJLI = new C2254308sP(c0qfyArr);
    }

    public static C0QFY[] values() {
        return (C0QFY[]) LL.clone();
    }

    public static C0QFY valueOf(String str) {
        return (C0QFY) C08FF.LIZ(C0QFY.class, str);
    }

    public C0QFY(String str, int i) {
    }
}
