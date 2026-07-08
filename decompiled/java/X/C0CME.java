package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0CME, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CME {
    public static final C0CME FIRST_UI_FRAME;
    public static final C0CME FIRST_VIDEO_BIND;
    public static final C0CME FIRST_VIDEO_FORBID;
    public static final C0CME FIRST_VIDEO_HAS_LEFT;
    public static final C0CME FIRST_VIDEO_SHOW;
    public static final C0CME FIRST_VIDEO_WILL_LEAVE;
    public static final /* synthetic */ C0CME[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0CME NEVER_EXECUTE;
    public static final C0CME SCROLL_END;
    public static final C0CME SCROLL_ON_PAGE_SELECTED;
    public static final C0CME SECOND_VIDEO_HAS_LEFT;
    public static final C0CME START_UP_END;
    public final C0CML LL;

    public static InterfaceC2044707zh<C0CME> getEntries() {
        return LLILLL;
    }

    static {
        C0CME c0cme = new C0CME("FIRST_VIDEO_SHOW", 0, new C0CML());
        FIRST_VIDEO_SHOW = c0cme;
        C0CME c0cme2 = new C0CME("FIRST_UI_FRAME", 1, new C0CML());
        FIRST_UI_FRAME = c0cme2;
        C0CME c0cme3 = new C0CME("FIRST_VIDEO_FORBID", 2, new C0CML());
        FIRST_VIDEO_FORBID = c0cme3;
        C0CME c0cme4 = new C0CME("SCROLL_END", 3, new C0CML());
        SCROLL_END = c0cme4;
        C0CME c0cme5 = new C0CME("START_UP_END", 4, new C0CML());
        START_UP_END = c0cme5;
        C0CME c0cme6 = new C0CME("NEVER_EXECUTE", 5, new C0CML());
        NEVER_EXECUTE = c0cme6;
        C0CME c0cme7 = new C0CME("FIRST_VIDEO_WILL_LEAVE", 6, new C0CML());
        FIRST_VIDEO_WILL_LEAVE = c0cme7;
        C0CME c0cme8 = new C0CME("FIRST_VIDEO_HAS_LEFT", 7, new C0CML());
        FIRST_VIDEO_HAS_LEFT = c0cme8;
        C0CME c0cme9 = new C0CME("SECOND_VIDEO_HAS_LEFT", 8, new C0CML());
        SECOND_VIDEO_HAS_LEFT = c0cme9;
        C0CME c0cme10 = new C0CME("SCROLL_ON_PAGE_SELECTED", 9, new C0CML());
        SCROLL_ON_PAGE_SELECTED = c0cme10;
        C0CME c0cme11 = new C0CME("FIRST_VIDEO_BIND", 10, new C0CML());
        FIRST_VIDEO_BIND = c0cme11;
        C0CME[] c0cmeArr = {c0cme, c0cme2, c0cme3, c0cme4, c0cme5, c0cme6, c0cme7, c0cme8, c0cme9, c0cme10, c0cme11};
        LLILLJJLI = c0cmeArr;
        LLILLL = new C2254308sP(c0cmeArr);
    }

    public static C0CME[] values() {
        return (C0CME[]) LLILLJJLI.clone();
    }

    public final boolean isCoreScene() {
        return this == FIRST_VIDEO_SHOW || this == FIRST_UI_FRAME || this == SCROLL_END || this == FIRST_VIDEO_WILL_LEAVE || this == FIRST_VIDEO_HAS_LEFT || this == SECOND_VIDEO_HAS_LEFT || this == START_UP_END;
    }

    public final C0CML getCache$launcher_lazy_util_release() {
        return this.LL;
    }

    public static C0CME valueOf(String str) {
        return (C0CME) C08FF.LIZ(C0CME.class, str);
    }

    public C0CME(String str, int i, C0CML c0cml) {
        this.LL = c0cml;
    }
}
