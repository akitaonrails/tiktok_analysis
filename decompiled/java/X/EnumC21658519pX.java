package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.19pX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class EnumC21658519pX {
    public static final EnumC21658519pX AUTO;
    public static final EnumC21658519pX FIT_CONTENT;
    public static final EnumC21658519pX FIX_HEIGHT;
    public static final EnumC21658519pX FULL_PAGE;
    public static final /* synthetic */ EnumC21658519pX[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC21658519pX> getEntries() {
        return LLILLL;
    }

    static {
        EnumC21658519pX enumC21658519pX = new EnumC21658519pX("AUTO", 0, "auto");
        AUTO = enumC21658519pX;
        EnumC21658519pX enumC21658519pX2 = new EnumC21658519pX("FIT_CONTENT", 1, "fit_content");
        FIT_CONTENT = enumC21658519pX2;
        EnumC21658519pX enumC21658519pX3 = new EnumC21658519pX("FIX_HEIGHT", 2, "fix_height");
        FIX_HEIGHT = enumC21658519pX3;
        EnumC21658519pX enumC21658519pX4 = new EnumC21658519pX("FULL_PAGE", 3, "full_page");
        FULL_PAGE = enumC21658519pX4;
        EnumC21658519pX[] enumC21658519pXArr = {enumC21658519pX, enumC21658519pX2, enumC21658519pX3, enumC21658519pX4};
        LLILLJJLI = enumC21658519pXArr;
        LLILLL = new C2254308sP(enumC21658519pXArr);
    }

    public static EnumC21658519pX[] values() {
        return (EnumC21658519pX[]) LLILLJJLI.clone();
    }

    public final String getDes() {
        return this.LL;
    }

    public static EnumC21658519pX valueOf(String str) {
        return (EnumC21658519pX) C08FF.LIZ(EnumC21658519pX.class, str);
    }

    public EnumC21658519pX(String str, int i, String str2) {
        this.LL = str2;
    }
}
