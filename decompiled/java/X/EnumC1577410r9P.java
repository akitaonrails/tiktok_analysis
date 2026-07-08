package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0r9P, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1577410r9P {
    public static final EnumC1577410r9P CARD_SHOW;
    public static final EnumC1577410r9P CLIENT_FORCE_INSERT;
    public static final EnumC1577410r9P DISPERSION;
    public static final EnumC1577410r9P FEED_CARD_REQUEST;
    public static final EnumC1577410r9P FEED_CARD_RESPONSE;
    public static final /* synthetic */ EnumC1577410r9P[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1577410r9P RECEIVE_ATTRIBUTION;
    public static final EnumC1577410r9P REMOVE_CARD;
    public static final EnumC1577410r9P TAB_CONFIG_REQUEST;
    public static final EnumC1577410r9P TAB_CONFIG_RESPONSE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1577410r9P> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1577410r9P enumC1577410r9P = new EnumC1577410r9P("RECEIVE_ATTRIBUTION", 0, "receive_attribution");
        RECEIVE_ATTRIBUTION = enumC1577410r9P;
        EnumC1577410r9P enumC1577410r9P2 = new EnumC1577410r9P("FEED_CARD_REQUEST", 1, "feed_card_request");
        FEED_CARD_REQUEST = enumC1577410r9P2;
        EnumC1577410r9P enumC1577410r9P3 = new EnumC1577410r9P("FEED_CARD_RESPONSE", 2, "feed_card_response");
        FEED_CARD_RESPONSE = enumC1577410r9P3;
        EnumC1577410r9P enumC1577410r9P4 = new EnumC1577410r9P("CLIENT_FORCE_INSERT", 3, "client_force_insert");
        CLIENT_FORCE_INSERT = enumC1577410r9P4;
        EnumC1577410r9P enumC1577410r9P5 = new EnumC1577410r9P("DISPERSION", 4, "dispersion");
        DISPERSION = enumC1577410r9P5;
        EnumC1577410r9P enumC1577410r9P6 = new EnumC1577410r9P("REMOVE_CARD", 5, "remove_card");
        REMOVE_CARD = enumC1577410r9P6;
        EnumC1577410r9P enumC1577410r9P7 = new EnumC1577410r9P("CARD_SHOW", 6, "card_show");
        CARD_SHOW = enumC1577410r9P7;
        EnumC1577410r9P enumC1577410r9P8 = new EnumC1577410r9P("TAB_CONFIG_REQUEST", 7, "tab_config_request");
        TAB_CONFIG_REQUEST = enumC1577410r9P8;
        EnumC1577410r9P enumC1577410r9P9 = new EnumC1577410r9P("TAB_CONFIG_RESPONSE", 8, "tab_config_response");
        TAB_CONFIG_RESPONSE = enumC1577410r9P9;
        EnumC1577410r9P[] enumC1577410r9PArr = {enumC1577410r9P, enumC1577410r9P2, enumC1577410r9P3, enumC1577410r9P4, enumC1577410r9P5, enumC1577410r9P6, enumC1577410r9P7, enumC1577410r9P8, enumC1577410r9P9};
        LLILLJJLI = enumC1577410r9PArr;
        LLILLL = new C2254308sP(enumC1577410r9PArr);
    }

    public static EnumC1577410r9P[] values() {
        return (EnumC1577410r9P[]) LLILLJJLI.clone();
    }

    public final String getStage() {
        return this.LL;
    }

    public static EnumC1577410r9P valueOf(String str) {
        return (EnumC1577410r9P) C08FF.LIZ(EnumC1577410r9P.class, str);
    }

    public EnumC1577410r9P(String str, int i, String str2) {
        this.LL = str2;
    }
}
