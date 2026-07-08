package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.008j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0299008j {
    public static final EnumC0299008j BUBBLE;
    public static final EnumC0299008j DIVERSION_ASSEM;
    public static final EnumC0299008j JSB_EVENT;
    public static final EnumC0299008j JSB_METHOD;
    public static final /* synthetic */ EnumC0299008j[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC0299008j PENDANT_LAYER;
    public static final EnumC0299008j POPUP_TASK;
    public static final EnumC0299008j RUNTIME_CARD;
    public static final EnumC0299008j SHOPPING_CART;
    public static final EnumC0299008j TRACK_EVENT;
    public final String LL;

    public static InterfaceC2044707zh<EnumC0299008j> getEntries() {
        return LLILLL;
    }

    static {
        EnumC0299008j enumC0299008j = new EnumC0299008j("DIVERSION_ASSEM", 0, "DiversionAssem");
        DIVERSION_ASSEM = enumC0299008j;
        EnumC0299008j enumC0299008j2 = new EnumC0299008j("TRACK_EVENT", 1, "TrackEvent");
        TRACK_EVENT = enumC0299008j2;
        EnumC0299008j enumC0299008j3 = new EnumC0299008j("JSB_EVENT", 2, "JsbEvent");
        JSB_EVENT = enumC0299008j3;
        EnumC0299008j enumC0299008j4 = new EnumC0299008j("JSB_METHOD", 3, "JsbMethod");
        JSB_METHOD = enumC0299008j4;
        EnumC0299008j enumC0299008j5 = new EnumC0299008j("RUNTIME_CARD", 4, "RuntimeCard");
        RUNTIME_CARD = enumC0299008j5;
        EnumC0299008j enumC0299008j6 = new EnumC0299008j("PENDANT_LAYER", 5, "PendantLayer");
        PENDANT_LAYER = enumC0299008j6;
        EnumC0299008j enumC0299008j7 = new EnumC0299008j("POPUP_TASK", 6, "PopupTask");
        POPUP_TASK = enumC0299008j7;
        EnumC0299008j enumC0299008j8 = new EnumC0299008j("BUBBLE", 7, "Bubble");
        BUBBLE = enumC0299008j8;
        EnumC0299008j enumC0299008j9 = new EnumC0299008j("SHOPPING_CART", 8, "ShoppingCart");
        SHOPPING_CART = enumC0299008j9;
        EnumC0299008j[] enumC0299008jArr = {enumC0299008j, enumC0299008j2, enumC0299008j3, enumC0299008j4, enumC0299008j5, enumC0299008j6, enumC0299008j7, enumC0299008j8, enumC0299008j9};
        LLILLJJLI = enumC0299008jArr;
        LLILLL = new C2254308sP(enumC0299008jArr);
    }

    public static EnumC0299008j[] values() {
        return (EnumC0299008j[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC0299008j valueOf(String str) {
        return (EnumC0299008j) C08FF.LIZ(EnumC0299008j.class, str);
    }

    public EnumC0299008j(String str, int i, String str2) {
        this.LL = str2;
    }
}
