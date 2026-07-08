package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.128V, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C128V {
    public static final /* synthetic */ C128V[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C128V SUB_TYPE_CLICK;
    public static final C128V SUB_TYPE_CTA;
    public static final C128V SUB_TYPE_DISAPPEAR;
    public static final C128V SUB_TYPE_FOLD;
    public static final C128V SUB_TYPE_HOT_AREA;
    public static final C128V SUB_TYPE_SLIDE;
    public static final C128V SUB_TYPE_SLIDE_UP;
    public final String LL;

    public static InterfaceC2044707zh<C128V> getEntries() {
        return LLILLL;
    }

    static {
        C128V c128v = new C128V("SUB_TYPE_CLICK", 0, "click");
        SUB_TYPE_CLICK = c128v;
        C128V c128v2 = new C128V("SUB_TYPE_SLIDE", 1, "slide");
        SUB_TYPE_SLIDE = c128v2;
        C128V c128v3 = new C128V("SUB_TYPE_DISAPPEAR", 2, "disappear");
        SUB_TYPE_DISAPPEAR = c128v3;
        C128V c128v4 = new C128V("SUB_TYPE_FOLD", 3, "fold");
        SUB_TYPE_FOLD = c128v4;
        C128V c128v5 = new C128V("SUB_TYPE_CTA", 4, "click_cta");
        SUB_TYPE_CTA = c128v5;
        C128V c128v6 = new C128V("SUB_TYPE_HOT_AREA", 5, "hot_area");
        SUB_TYPE_HOT_AREA = c128v6;
        C128V c128v7 = new C128V("SUB_TYPE_SLIDE_UP", 6, "slide_up");
        SUB_TYPE_SLIDE_UP = c128v7;
        C128V[] c128vArr = {c128v, c128v2, c128v3, c128v4, c128v5, c128v6, c128v7};
        LLILLJJLI = c128vArr;
        LLILLL = new C2254308sP(c128vArr);
    }

    public static C128V[] values() {
        return (C128V[]) LLILLJJLI.clone();
    }

    public final String getType() {
        return this.LL;
    }

    public static C128V valueOf(String str) {
        return (C128V) C08FF.LIZ(C128V.class, str);
    }

    public C128V(String str, int i, String str2) {
        this.LL = str2;
    }
}
