package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.165j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class EnumC207181165j {
    public static final EnumC207181165j CARD_CLOSE_CLICK;
    public static final EnumC207181165j CARD_ITEM_SHOW;
    public static final EnumC207181165j CARD_OR_ICON_CLICK;
    public static final EnumC207181165j CARD_SHOW;
    public static final EnumC207181165j CARD_SHOW_FAIL;
    public static final /* synthetic */ EnumC207181165j[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC207181165j> getEntries() {
        return LLILLL;
    }

    static {
        EnumC207181165j enumC207181165j = new EnumC207181165j("CARD_SHOW", 0, "othershow");
        CARD_SHOW = enumC207181165j;
        EnumC207181165j enumC207181165j2 = new EnumC207181165j("CARD_SHOW_FAIL", 1, "othershow_fail");
        CARD_SHOW_FAIL = enumC207181165j2;
        EnumC207181165j enumC207181165j3 = new EnumC207181165j("CARD_ITEM_SHOW", 2, "card_product_show");
        CARD_ITEM_SHOW = enumC207181165j3;
        EnumC207181165j enumC207181165j4 = new EnumC207181165j("CARD_OR_ICON_CLICK", 3, "realtime_click");
        CARD_OR_ICON_CLICK = enumC207181165j4;
        EnumC207181165j enumC207181165j5 = new EnumC207181165j("CARD_CLOSE_CLICK", 4, "close");
        CARD_CLOSE_CLICK = enumC207181165j5;
        EnumC207181165j[] enumC207181165jArr = {enumC207181165j, enumC207181165j2, enumC207181165j3, enumC207181165j4, enumC207181165j5};
        LLILLJJLI = enumC207181165jArr;
        LLILLL = new C2254308sP(enumC207181165jArr);
    }

    public static EnumC207181165j[] values() {
        return (EnumC207181165j[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC207181165j valueOf(String str) {
        return (EnumC207181165j) C08FF.LIZ(EnumC207181165j.class, str);
    }

    public EnumC207181165j(String str, int i, String str2) {
        this.LL = str2;
    }
}
