package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0f6m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1114500f6m {
    public static final EnumC1114500f6m COMMENT_WIDGET;
    public static final EnumC1114500f6m GIFT_SEND;
    public static final /* synthetic */ EnumC1114500f6m[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1114500f6m WALLET_WEBSOCKET_INAPP;
    public static final EnumC1114500f6m WALLET_WEBSOCKET_WEB;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1114500f6m> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1114500f6m enumC1114500f6m = new EnumC1114500f6m("GIFT_SEND", 0, "gift_send");
        GIFT_SEND = enumC1114500f6m;
        EnumC1114500f6m enumC1114500f6m2 = new EnumC1114500f6m("COMMENT_WIDGET", 1, "comment_widget");
        COMMENT_WIDGET = enumC1114500f6m2;
        EnumC1114500f6m enumC1114500f6m3 = new EnumC1114500f6m("WALLET_WEBSOCKET_INAPP", 2, "wallet_ws_inapp");
        WALLET_WEBSOCKET_INAPP = enumC1114500f6m3;
        EnumC1114500f6m enumC1114500f6m4 = new EnumC1114500f6m("WALLET_WEBSOCKET_WEB", 3, "wallet_ws_web");
        WALLET_WEBSOCKET_WEB = enumC1114500f6m4;
        EnumC1114500f6m[] enumC1114500f6mArr = {enumC1114500f6m, enumC1114500f6m2, enumC1114500f6m3, enumC1114500f6m4};
        LLILLJJLI = enumC1114500f6mArr;
        LLILLL = new C2254308sP(enumC1114500f6mArr);
    }

    public static EnumC1114500f6m[] values() {
        return (EnumC1114500f6m[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1114500f6m valueOf(String str) {
        return (EnumC1114500f6m) C08FF.LIZ(EnumC1114500f6m.class, str);
    }

    public EnumC1114500f6m(String str, int i, String str2) {
        this.LL = str2;
    }
}
