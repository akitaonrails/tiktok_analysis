package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0N5J, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0N5J {
    public static final /* synthetic */ C0N5J[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0N5J TYPE_GIFT_DIALOG;
    public static final C0N5J TYPE_VOTE_DIALOG;

    public static InterfaceC2044707zh<C0N5J> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0N5J c0n5j = new C0N5J("TYPE_GIFT_DIALOG", 0);
        TYPE_GIFT_DIALOG = c0n5j;
        C0N5J c0n5j2 = new C0N5J("TYPE_VOTE_DIALOG", 1);
        TYPE_VOTE_DIALOG = c0n5j2;
        C0N5J[] c0n5jArr = {c0n5j, c0n5j2};
        LL = c0n5jArr;
        LLILLJJLI = new C2254308sP(c0n5jArr);
    }

    public static C0N5J[] values() {
        return (C0N5J[]) LL.clone();
    }

    public static C0N5J valueOf(String str) {
        return (C0N5J) C08FF.LIZ(C0N5J.class, str);
    }

    public C0N5J(String str, int i) {
    }
}
