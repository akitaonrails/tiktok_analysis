package X;

/* JADX INFO: renamed from: X.0fcQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public enum EnumC1134120fcQ {
    COMMENT("comment"),
    AT("AT"),
    INTERACT("interact"),
    GIFT("gift"),
    TASK_GIFT("task_gift"),
    RECHARGE("recharge"),
    TURNTABLE("turntable"),
    LUCKYBOX("lucky_box"),
    GUARD("guard"),
    START_LIVE("start_live"),
    COMMENT_GUIDE("comment_guide"),
    RECHARGE_GUIDE("recharge_guide");

    public final String LL;

    public String getFunc() {
        return this.LL;
    }

    public static EnumC1134120fcQ valueOf(String str) {
        return (EnumC1134120fcQ) C08FF.LIZ(EnumC1134120fcQ.class, str);
    }

    EnumC1134120fcQ(String str) {
        this.LL = str;
    }
}
