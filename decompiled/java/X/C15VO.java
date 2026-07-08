package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.15VO, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15VO {
    public static final C15VO BIND_DATA;
    public static final C15VO COVER_LOAD_FAIL;
    public static final C15VO COVER_LOAD_START;
    public static final C15VO COVER_LOAD_SUCCESS;
    public static final /* synthetic */ C15VO[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C15VO ON_CREATE_VIEW;
    public static final C15VO ON_VIEW_ATTACHED;
    public static final C15VO ON_VIEW_CREATED;
    public static final C15VO ON_VIEW_DETACHED;
    public static final C15VO ON_VIEW_RECYCLED;
    public final String LL;

    public static InterfaceC2044707zh<C15VO> getEntries() {
        return LLILLL;
    }

    static {
        C15VO c15vo = new C15VO("ON_CREATE_VIEW", 0, "card_create_view");
        ON_CREATE_VIEW = c15vo;
        C15VO c15vo2 = new C15VO("ON_VIEW_CREATED", 1, "card_view_created");
        ON_VIEW_CREATED = c15vo2;
        C15VO c15vo3 = new C15VO("ON_VIEW_ATTACHED", 2, "card_view_attached");
        ON_VIEW_ATTACHED = c15vo3;
        C15VO c15vo4 = new C15VO("BIND_DATA", 3, "card_bind_data");
        BIND_DATA = c15vo4;
        C15VO c15vo5 = new C15VO("COVER_LOAD_START", 4, "cover_load_start");
        COVER_LOAD_START = c15vo5;
        C15VO c15vo6 = new C15VO("COVER_LOAD_SUCCESS", 5, "cover_load_success");
        COVER_LOAD_SUCCESS = c15vo6;
        C15VO c15vo7 = new C15VO("COVER_LOAD_FAIL", 6, "cover_load_fail");
        COVER_LOAD_FAIL = c15vo7;
        C15VO c15vo8 = new C15VO("ON_VIEW_DETACHED", 7, "card_view_detached");
        ON_VIEW_DETACHED = c15vo8;
        C15VO c15vo9 = new C15VO("ON_VIEW_RECYCLED", 8, "card_view_recycled");
        ON_VIEW_RECYCLED = c15vo9;
        C15VO[] c15voArr = {c15vo, c15vo2, c15vo3, c15vo4, c15vo5, c15vo6, c15vo7, c15vo8, c15vo9};
        LLILLJJLI = c15voArr;
        LLILLL = new C2254308sP(c15voArr);
    }

    public static C15VO[] values() {
        return (C15VO[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C15VO valueOf(String str) {
        return (C15VO) C08FF.LIZ(C15VO.class, str);
    }

    public C15VO(String str, int i, String str2) {
        this.LL = str2;
    }
}
