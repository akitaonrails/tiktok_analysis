package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0rFl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1581350rFl {
    public static final EnumC1581350rFl CLICK_BOTTOM;
    public static final EnumC1581350rFl CLICK_TOP;
    public static final /* synthetic */ EnumC1581350rFl[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1581350rFl PULL_DOWN_REFRESH;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1581350rFl> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1581350rFl enumC1581350rFl = new EnumC1581350rFl("CLICK_TOP", 0, "top_tab");
        CLICK_TOP = enumC1581350rFl;
        EnumC1581350rFl enumC1581350rFl2 = new EnumC1581350rFl("CLICK_BOTTOM", 1, "bottom_tab");
        CLICK_BOTTOM = enumC1581350rFl2;
        EnumC1581350rFl enumC1581350rFl3 = new EnumC1581350rFl("PULL_DOWN_REFRESH", 2, "pull_down");
        PULL_DOWN_REFRESH = enumC1581350rFl3;
        EnumC1581350rFl[] enumC1581350rFlArr = {enumC1581350rFl, enumC1581350rFl2, enumC1581350rFl3};
        LLILLJJLI = enumC1581350rFlArr;
        LLILLL = new C2254308sP(enumC1581350rFlArr);
    }

    public static EnumC1581350rFl[] values() {
        return (EnumC1581350rFl[]) LLILLJJLI.clone();
    }

    public final String getMobName() {
        return this.LL;
    }

    public static EnumC1581350rFl valueOf(String str) {
        return (EnumC1581350rFl) C08FF.LIZ(EnumC1581350rFl.class, str);
    }

    public EnumC1581350rFl(String str, int i, String str2) {
        this.LL = str2;
    }
}
