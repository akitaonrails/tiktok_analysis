package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.056N, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C056N {
    public static final C056N CLOSE_ONLY;
    public static final /* synthetic */ C056N[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C056N REOPEN_NOTICEBOARD_DIALOG;

    public static InterfaceC2044707zh<C056N> getEntries() {
        return LLILLJJLI;
    }

    static {
        C056N c056n = new C056N("CLOSE_ONLY", 0);
        CLOSE_ONLY = c056n;
        C056N c056n2 = new C056N("REOPEN_NOTICEBOARD_DIALOG", 1);
        REOPEN_NOTICEBOARD_DIALOG = c056n2;
        C056N[] c056nArr = {c056n, c056n2};
        LL = c056nArr;
        LLILLJJLI = new C2254308sP(c056nArr);
    }

    public static C056N[] values() {
        return (C056N[]) LL.clone();
    }

    public static C056N valueOf(String str) {
        return (C056N) C08FF.LIZ(C056N.class, str);
    }

    public C056N(String str, int i) {
    }
}
