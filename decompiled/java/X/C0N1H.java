package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0N1H, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0N1H {
    public static final C0N1H BACKGROUND;
    public static final /* synthetic */ C0N1H[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0N1H PROGRESS_BAR;

    public static InterfaceC2044707zh<C0N1H> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0N1H c0n1h = new C0N1H("BACKGROUND", 0);
        BACKGROUND = c0n1h;
        C0N1H c0n1h2 = new C0N1H("PROGRESS_BAR", 1);
        PROGRESS_BAR = c0n1h2;
        C0N1H[] c0n1hArr = {c0n1h, c0n1h2};
        LL = c0n1hArr;
        LLILLJJLI = new C2254308sP(c0n1hArr);
    }

    public static C0N1H[] values() {
        return (C0N1H[]) LL.clone();
    }

    public static C0N1H valueOf(String str) {
        return (C0N1H) C08FF.LIZ(C0N1H.class, str);
    }

    public C0N1H(String str, int i) {
    }
}
