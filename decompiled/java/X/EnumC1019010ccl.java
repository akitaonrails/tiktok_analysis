package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ccl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1019010ccl {
    public static final EnumC1019010ccl INTERACTION;
    public static final EnumC1019010ccl INTERACTION_BOTTOM;
    public static final EnumC1019010ccl INTERACTION_LEFT;
    public static final EnumC1019010ccl INTERACTION_RIGHT;
    public static final EnumC1019010ccl INTERACTION_TOP;
    public static final /* synthetic */ EnumC1019010ccl[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1019010ccl PICTURE;
    public static final EnumC1019010ccl SLIDE_EDGE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1019010ccl> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1019010ccl enumC1019010ccl = new EnumC1019010ccl("PICTURE", 0, "pic");
        PICTURE = enumC1019010ccl;
        EnumC1019010ccl enumC1019010ccl2 = new EnumC1019010ccl("INTERACTION", 1, "interaction");
        INTERACTION = enumC1019010ccl2;
        EnumC1019010ccl enumC1019010ccl3 = new EnumC1019010ccl("INTERACTION_TOP", 2, "interaction_top");
        INTERACTION_TOP = enumC1019010ccl3;
        EnumC1019010ccl enumC1019010ccl4 = new EnumC1019010ccl("INTERACTION_BOTTOM", 3, "interaction_bottom");
        INTERACTION_BOTTOM = enumC1019010ccl4;
        EnumC1019010ccl enumC1019010ccl5 = new EnumC1019010ccl("INTERACTION_LEFT", 4, "interaction_left");
        INTERACTION_LEFT = enumC1019010ccl5;
        EnumC1019010ccl enumC1019010ccl6 = new EnumC1019010ccl("INTERACTION_RIGHT", 5, "interaction_right");
        INTERACTION_RIGHT = enumC1019010ccl6;
        EnumC1019010ccl enumC1019010ccl7 = new EnumC1019010ccl("SLIDE_EDGE", 6, "slide_edge");
        SLIDE_EDGE = enumC1019010ccl7;
        EnumC1019010ccl[] enumC1019010cclArr = {enumC1019010ccl, enumC1019010ccl2, enumC1019010ccl3, enumC1019010ccl4, enumC1019010ccl5, enumC1019010ccl6, enumC1019010ccl7};
        LLILLJJLI = enumC1019010cclArr;
        LLILLL = new C2254308sP(enumC1019010cclArr);
    }

    public static EnumC1019010ccl[] values() {
        return (EnumC1019010ccl[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1019010ccl valueOf(String str) {
        return (EnumC1019010ccl) C08FF.LIZ(EnumC1019010ccl.class, str);
    }

    public EnumC1019010ccl(String str, int i, String str2) {
        this.LL = str2;
    }
}
