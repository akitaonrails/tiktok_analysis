package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0NKX, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NKX {
    public static final C0NKX ANIMATION_COMPLETE;
    public static final C0NKX ANIMATION_INTERRUPTION_BY_VSA;
    public static final C0NKX BOTTOM_ICON_PREPARE_SHOW;
    public static final C0NKX IMAGE_LOADING_FAILED;
    public static final /* synthetic */ C0NKX[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0NKX UNKNOWN;
    public final String LL;

    public static InterfaceC2044707zh<C0NKX> getEntries() {
        return LLILLL;
    }

    static {
        C0NKX c0nkx = new C0NKX("IMAGE_LOADING_FAILED", 0, "image_loading_failed");
        IMAGE_LOADING_FAILED = c0nkx;
        C0NKX c0nkx2 = new C0NKX("ANIMATION_COMPLETE", 1, "animation_complete");
        ANIMATION_COMPLETE = c0nkx2;
        C0NKX c0nkx3 = new C0NKX("ANIMATION_INTERRUPTION_BY_VSA", 2, "animation_interruption_by_vsa");
        ANIMATION_INTERRUPTION_BY_VSA = c0nkx3;
        C0NKX c0nkx4 = new C0NKX("BOTTOM_ICON_PREPARE_SHOW", 3, "bottom_icon_prepare_to_show");
        BOTTOM_ICON_PREPARE_SHOW = c0nkx4;
        C0NKX c0nkx5 = new C0NKX("UNKNOWN", 4, "unknown");
        UNKNOWN = c0nkx5;
        C0NKX[] c0nkxArr = {c0nkx, c0nkx2, c0nkx3, c0nkx4, c0nkx5};
        LLILLJJLI = c0nkxArr;
        LLILLL = new C2254308sP(c0nkxArr);
    }

    public static C0NKX[] values() {
        return (C0NKX[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C0NKX valueOf(String str) {
        return (C0NKX) C08FF.LIZ(C0NKX.class, str);
    }

    public C0NKX(String str, int i, String str2) {
        this.LL = str2;
    }
}
