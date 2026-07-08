package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0DYt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC341090DYt {
    public static final /* synthetic */ EnumC341090DYt[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC341090DYt MALL_TAB;
    public static final EnumC341090DYt MALL_TOP_TAB;
    public final String LL;

    public static InterfaceC2044707zh<EnumC341090DYt> getEntries() {
        return LLILLL;
    }

    static {
        EnumC341090DYt enumC341090DYt = new EnumC341090DYt("MALL_TAB", 0, "mall_tab");
        MALL_TAB = enumC341090DYt;
        EnumC341090DYt enumC341090DYt2 = new EnumC341090DYt("MALL_TOP_TAB", 1, "mall_top_tab");
        MALL_TOP_TAB = enumC341090DYt2;
        EnumC341090DYt[] enumC341090DYtArr = {enumC341090DYt, enumC341090DYt2};
        LLILLJJLI = enumC341090DYtArr;
        LLILLL = new C2254308sP(enumC341090DYtArr);
    }

    public static EnumC341090DYt[] values() {
        return (EnumC341090DYt[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC341090DYt valueOf(String str) {
        return (EnumC341090DYt) C08FF.LIZ(EnumC341090DYt.class, str);
    }

    public EnumC341090DYt(String str, int i, String str2) {
        this.LL = str2;
    }
}
