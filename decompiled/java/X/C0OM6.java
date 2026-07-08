package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0OM6, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OM6 {
    public static final C0OM6 ACTIVITY_POST_BUBBLE;
    public static final C0OM6 ACTIVITY_SKIN_BUBBLE;
    public static final C0OM6 BAR_ENTRANCE_BUBBLE;
    public static final C0OM6 BB_FYP_BUTTON;
    public static final C0OM6 BB_FYP_CARD;
    public static final C0OM6 GUIDE_ACTIVITY;
    public static final C0OM6 GUIDE_COMMENT;
    public static final C0OM6 GUIDE_CSI_RECOMM;
    public static final C0OM6 GUIDE_LIVE_EVENT;
    public static final C0OM6 GUIDE_MUSIC;
    public static final C0OM6 GUIDE_PINTOP;
    public static final C0OM6 GUIDE_POST;
    public static final C0OM6 GUIDE_SAYHI;
    public static final /* synthetic */ C0OM6[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0OM6 TOP_BANNER_DATA_ANALYSIS;
    public static final C0OM6 UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<C0OM6> getEntries() {
        return LLILLL;
    }

    static {
        C0OM6 c0om6 = new C0OM6("UNKNOWN", 0, 0);
        UNKNOWN = c0om6;
        C0OM6 c0om62 = new C0OM6("BB_FYP_CARD", 1, 1);
        BB_FYP_CARD = c0om62;
        C0OM6 c0om63 = new C0OM6("BB_FYP_BUTTON", 2, 2);
        BB_FYP_BUTTON = c0om63;
        C0OM6 c0om64 = new C0OM6("GUIDE_SAYHI", 3, 3);
        GUIDE_SAYHI = c0om64;
        C0OM6 c0om65 = new C0OM6("GUIDE_LIVE_EVENT", 4, 4);
        GUIDE_LIVE_EVENT = c0om65;
        C0OM6 c0om66 = new C0OM6("GUIDE_MUSIC", 5, 5);
        GUIDE_MUSIC = c0om66;
        C0OM6 c0om67 = new C0OM6("GUIDE_POST", 6, 6);
        GUIDE_POST = c0om67;
        C0OM6 c0om68 = new C0OM6("GUIDE_PINTOP", 7, 7);
        GUIDE_PINTOP = c0om68;
        C0OM6 c0om69 = new C0OM6("GUIDE_ACTIVITY", 8, 8);
        GUIDE_ACTIVITY = c0om69;
        C0OM6 c0om610 = new C0OM6("ACTIVITY_POST_BUBBLE", 9, 9);
        ACTIVITY_POST_BUBBLE = c0om610;
        C0OM6 c0om611 = new C0OM6("ACTIVITY_SKIN_BUBBLE", 10, 10);
        ACTIVITY_SKIN_BUBBLE = c0om611;
        C0OM6 c0om612 = new C0OM6("GUIDE_COMMENT", 11, 11);
        GUIDE_COMMENT = c0om612;
        C0OM6 c0om613 = new C0OM6("GUIDE_CSI_RECOMM", 12, 12);
        GUIDE_CSI_RECOMM = c0om613;
        C0OM6 c0om614 = new C0OM6("BAR_ENTRANCE_BUBBLE", 13, 13);
        BAR_ENTRANCE_BUBBLE = c0om614;
        C0OM6 c0om615 = new C0OM6("TOP_BANNER_DATA_ANALYSIS", 14, 14);
        TOP_BANNER_DATA_ANALYSIS = c0om615;
        C0OM6[] c0om6Arr = {c0om6, c0om62, c0om63, c0om64, c0om65, c0om66, c0om67, c0om68, c0om69, c0om610, c0om611, c0om612, c0om613, c0om614, c0om615};
        LLILLJJLI = c0om6Arr;
        LLILLL = new C2254308sP(c0om6Arr);
    }

    public static C0OM6[] values() {
        return (C0OM6[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C0OM6 valueOf(String str) {
        return (C0OM6) C08FF.LIZ(C0OM6.class, str);
    }

    public C0OM6(String str, int i, int i2) {
        this.LL = i2;
    }
}
