package X;

/* JADX INFO: renamed from: X.0frF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public enum EnumC1143310frF {
    Room("ttlive_room"),
    Gift("ttlive_gift"),
    PushStream("ttlive_pushstream"),
    PullStream("ttlive_pullstream"),
    Net("ttlive_net"),
    Click("ttlive_click"),
    Feed("ttlive_feed"),
    Msg("ttlive_msg"),
    Exception("ttlive_exception"),
    Page("ttlive_page"),
    Recharge("ttlive_recharge"),
    Pk("ttlive_pk"),
    Screen_Shot("ttlive_screenshot");

    public String info;

    public static EnumC1143310frF valueOf(String str) {
        return (EnumC1143310frF) C08FF.LIZ(EnumC1143310frF.class, str);
    }

    EnumC1143310frF(String str) {
        this.info = str;
    }
}
