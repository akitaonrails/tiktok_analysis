package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.03Hu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC818803Hu {
    public static final EnumC818803Hu ADD_ADDRESS_CLICK_ADD;
    public static final EnumC818803Hu ENTER_PAGE;
    public static final EnumC818803Hu IDENTITY_MODULE_CLICK;
    public static final /* synthetic */ EnumC818803Hu[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC818803Hu PLACE_ORDER;
    public static final EnumC818803Hu POPUP_CLICK_ADD;
    public final String LL;

    public static InterfaceC2044707zh<EnumC818803Hu> getEntries() {
        return LLILLL;
    }

    static {
        EnumC818803Hu enumC818803Hu = new EnumC818803Hu("ENTER_PAGE", 0, "enter_page");
        ENTER_PAGE = enumC818803Hu;
        EnumC818803Hu enumC818803Hu2 = new EnumC818803Hu("PLACE_ORDER", 1, "place_order");
        PLACE_ORDER = enumC818803Hu2;
        EnumC818803Hu enumC818803Hu3 = new EnumC818803Hu("ADD_ADDRESS_CLICK_ADD", 2, "order_submit_page_click_add");
        ADD_ADDRESS_CLICK_ADD = enumC818803Hu3;
        EnumC818803Hu enumC818803Hu4 = new EnumC818803Hu("POPUP_CLICK_ADD", 3, "order_submit_popup_click_add");
        POPUP_CLICK_ADD = enumC818803Hu4;
        EnumC818803Hu enumC818803Hu5 = new EnumC818803Hu("IDENTITY_MODULE_CLICK", 4, "click_order_submit_module");
        IDENTITY_MODULE_CLICK = enumC818803Hu5;
        EnumC818803Hu[] enumC818803HuArr = {enumC818803Hu, enumC818803Hu2, enumC818803Hu3, enumC818803Hu4, enumC818803Hu5};
        LLILLJJLI = enumC818803HuArr;
        LLILLL = new C2254308sP(enumC818803HuArr);
    }

    public static EnumC818803Hu[] values() {
        return (EnumC818803Hu[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC818803Hu valueOf(String str) {
        return (EnumC818803Hu) C08FF.LIZ(EnumC818803Hu.class, str);
    }

    public EnumC818803Hu(String str, int i, String str2) {
        this.LL = str2;
    }
}
