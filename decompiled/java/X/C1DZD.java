package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1DZD, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DZD {
    public static final C1DZD DRAG;
    public static final C1DZD FREEZE;
    public static final /* synthetic */ C1DZD[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C1DZD PAUSE;
    public static final C1DZD RELEASE;
    public static final C1DZD RENDER_FIRST;
    public static final C1DZD RESUME;
    public static final C1DZD SEARCH_SEEK;
    public static final C1DZD TIMEOUT;
    public static final C1DZD UNFREEZE;
    public static final C1DZD VIDEO_CHANGE;

    public static InterfaceC2044707zh<C1DZD> getEntries() {
        return LLILLJJLI;
    }

    static {
        C1DZD c1dzd = new C1DZD("PAUSE", 0);
        PAUSE = c1dzd;
        C1DZD c1dzd2 = new C1DZD("RESUME", 1);
        RESUME = c1dzd2;
        C1DZD c1dzd3 = new C1DZD("DRAG", 2);
        DRAG = c1dzd3;
        C1DZD c1dzd4 = new C1DZD("RELEASE", 3);
        RELEASE = c1dzd4;
        C1DZD c1dzd5 = new C1DZD("TIMEOUT", 4);
        TIMEOUT = c1dzd5;
        C1DZD c1dzd6 = new C1DZD("FREEZE", 5);
        FREEZE = c1dzd6;
        C1DZD c1dzd7 = new C1DZD("UNFREEZE", 6);
        UNFREEZE = c1dzd7;
        C1DZD c1dzd8 = new C1DZD("VIDEO_CHANGE", 7);
        VIDEO_CHANGE = c1dzd8;
        C1DZD c1dzd9 = new C1DZD("RENDER_FIRST", 8);
        RENDER_FIRST = c1dzd9;
        C1DZD c1dzd10 = new C1DZD("SEARCH_SEEK", 9);
        SEARCH_SEEK = c1dzd10;
        C1DZD[] c1dzdArr = {c1dzd, c1dzd2, c1dzd3, c1dzd4, c1dzd5, c1dzd6, c1dzd7, c1dzd8, c1dzd9, c1dzd10};
        LL = c1dzdArr;
        LLILLJJLI = new C2254308sP(c1dzdArr);
    }

    public static C1DZD[] values() {
        return (C1DZD[]) LL.clone();
    }

    public static C1DZD valueOf(String str) {
        return (C1DZD) C08FF.LIZ(C1DZD.class, str);
    }

    public C1DZD(String str, int i) {
    }
}
