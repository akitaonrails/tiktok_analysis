package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0PXG, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PXG {
    public static final /* synthetic */ C0PXG[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0PXG SCENE_COMMENT_TOP_RELATED;
    public static final C0PXG SCENE_FEED_BOX;
    public static final C0PXG SCENE_INFLOW_RS;
    public static final C0PXG SCENE_VISUAL;
    public final String LL;

    public static InterfaceC2044707zh<C0PXG> getEntries() {
        return LLILLL;
    }

    static {
        C0PXG c0pxg = new C0PXG("SCENE_FEED_BOX", 0, "SceneFeedBox");
        SCENE_FEED_BOX = c0pxg;
        C0PXG c0pxg2 = new C0PXG("SCENE_INFLOW_RS", 1, "SceneInflowRS");
        SCENE_INFLOW_RS = c0pxg2;
        C0PXG c0pxg3 = new C0PXG("SCENE_VISUAL", 2, "SceneVisual");
        SCENE_VISUAL = c0pxg3;
        C0PXG c0pxg4 = new C0PXG("SCENE_COMMENT_TOP_RELATED", 3, "SceneCommentTopRelated");
        SCENE_COMMENT_TOP_RELATED = c0pxg4;
        C0PXG[] c0pxgArr = {c0pxg, c0pxg2, c0pxg3, c0pxg4};
        LLILLJJLI = c0pxgArr;
        LLILLL = new C2254308sP(c0pxgArr);
    }

    public static C0PXG[] values() {
        return (C0PXG[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C0PXG valueOf(String str) {
        return (C0PXG) C08FF.LIZ(C0PXG.class, str);
    }

    public C0PXG(String str, int i, String str2) {
        this.LL = str2;
    }
}
