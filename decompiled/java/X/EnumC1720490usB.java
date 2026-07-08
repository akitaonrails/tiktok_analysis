package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0usB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1720490usB {
    public static final EnumC1720490usB CAROUSEL_PAGE_CHANGE;
    public static final EnumC1720490usB CLOSE_CONTENT;
    public static final EnumC1720490usB DIALOG;
    public static final /* synthetic */ EnumC1720490usB[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1720490usB REDIRECT;
    public static final EnumC1720490usB SHEET;
    public static final EnumC1720490usB TOAST;
    public static final EnumC1720490usB TOGGLE_PRICE;
    public static final EnumC1720490usB TOOLTIP;
    public static final EnumC1720490usB UPDATE_WEB_VIEW_HEIGHT;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1720490usB> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1720490usB enumC1720490usB = new EnumC1720490usB("TOGGLE_PRICE", 0, -1);
        TOGGLE_PRICE = enumC1720490usB;
        EnumC1720490usB enumC1720490usB2 = new EnumC1720490usB("UPDATE_WEB_VIEW_HEIGHT", 1, -2);
        UPDATE_WEB_VIEW_HEIGHT = enumC1720490usB2;
        EnumC1720490usB enumC1720490usB3 = new EnumC1720490usB("CAROUSEL_PAGE_CHANGE", 2, -3);
        CAROUSEL_PAGE_CHANGE = enumC1720490usB3;
        EnumC1720490usB enumC1720490usB4 = new EnumC1720490usB("DIALOG", 3, 1);
        DIALOG = enumC1720490usB4;
        EnumC1720490usB enumC1720490usB5 = new EnumC1720490usB("TOAST", 4, 2);
        TOAST = enumC1720490usB5;
        EnumC1720490usB enumC1720490usB6 = new EnumC1720490usB("REDIRECT", 5, 3);
        REDIRECT = enumC1720490usB6;
        EnumC1720490usB enumC1720490usB7 = new EnumC1720490usB("CLOSE_CONTENT", 6, 4);
        CLOSE_CONTENT = enumC1720490usB7;
        EnumC1720490usB enumC1720490usB8 = new EnumC1720490usB("SHEET", 7, 5);
        SHEET = enumC1720490usB8;
        EnumC1720490usB enumC1720490usB9 = new EnumC1720490usB("TOOLTIP", 8, 6);
        TOOLTIP = enumC1720490usB9;
        EnumC1720490usB[] enumC1720490usBArr = {enumC1720490usB, enumC1720490usB2, enumC1720490usB3, enumC1720490usB4, enumC1720490usB5, enumC1720490usB6, enumC1720490usB7, enumC1720490usB8, enumC1720490usB9};
        LLILLJJLI = enumC1720490usBArr;
        LLILLL = new C2254308sP(enumC1720490usBArr);
    }

    public static EnumC1720490usB[] values() {
        return (EnumC1720490usB[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1720490usB valueOf(String str) {
        return (EnumC1720490usB) C08FF.LIZ(EnumC1720490usB.class, str);
    }

    public EnumC1720490usB(String str, int i, int i2) {
        this.LL = i2;
    }
}
