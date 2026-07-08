package X;

/* JADX INFO: renamed from: X.13Wa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public enum EnumC20023013Wa {
    Launcher("launcher"),
    Push("push"),
    Deeplink("deeplink"),
    ClickPushCold("click_push_cold"),
    ClickPushWarm("click_push_warm"),
    Other("other");

    public final String LL;

    public static EnumC20023013Wa valueOf(String str) {
        return (EnumC20023013Wa) C08FF.LIZ(EnumC20023013Wa.class, str);
    }

    EnumC20023013Wa(String str) {
        this.LL = str;
    }
}
