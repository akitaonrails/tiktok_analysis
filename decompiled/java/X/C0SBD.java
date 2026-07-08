package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0SBD, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SBD {
    public static final C0SBD FEED_PAGE;
    public static final C0SBD FULL_PAGE;
    public static final /* synthetic */ C0SBD[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0SBD LONG_PRESS_PANEL;

    public static InterfaceC2044707zh<C0SBD> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0SBD c0sbd = new C0SBD("FULL_PAGE", 0);
        FULL_PAGE = c0sbd;
        C0SBD c0sbd2 = new C0SBD("FEED_PAGE", 1);
        FEED_PAGE = c0sbd2;
        C0SBD c0sbd3 = new C0SBD("LONG_PRESS_PANEL", 2);
        LONG_PRESS_PANEL = c0sbd3;
        C0SBD[] c0sbdArr = {c0sbd, c0sbd2, c0sbd3};
        LL = c0sbdArr;
        LLILLJJLI = new C2254308sP(c0sbdArr);
    }

    public static C0SBD[] values() {
        return (C0SBD[]) LL.clone();
    }

    public static C0SBD valueOf(String str) {
        return (C0SBD) C08FF.LIZ(C0SBD.class, str);
    }

    public C0SBD(String str, int i) {
    }
}
