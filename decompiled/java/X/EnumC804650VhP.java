package X;

/* JADX INFO: renamed from: X.0VhP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public enum EnumC804650VhP {
    WIFI("wifi"),
    MOBILE("mobile"),
    OTHERS("other");

    public final String LL;

    public String getKey() {
        return this.LL;
    }

    public static EnumC804650VhP fromNetworkTypeInt(int i) {
        if (i != EnumC804620VhM.WIFI.getValue() && i != EnumC804620VhM.WIFI_24GHZ.getValue() && i != EnumC804620VhM.WIFI_5GHZ.getValue()) {
            if (i != EnumC804620VhM.MOBILE.getValue() && i != EnumC804620VhM.MOBILE_2G.getValue() && i != EnumC804620VhM.MOBILE_3G.getValue() && i != EnumC804620VhM.MOBILE_4G.getValue() && i != EnumC804620VhM.MOBILE_5G.getValue() && i != EnumC804620VhM.MOBILE_3G_H.getValue() && i != EnumC804620VhM.MOBILE_3G_HP.getValue()) {
                return OTHERS;
            }
            return MOBILE;
        }
        return WIFI;
    }

    public static EnumC804650VhP valueOf(String str) {
        return (EnumC804650VhP) C08FF.LIZ(EnumC804650VhP.class, str);
    }

    EnumC804650VhP(String str) {
        this.LL = str;
    }
}
