package X;

/* JADX INFO: renamed from: X.18Kd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public enum EnumC21266118Kd {
    NORMAL("normal"),
    ABNORMAL("abnormal"),
    VIRTUAL("virtual");

    public final String LL;

    public static EnumC21266118Kd valueOf(String str) {
        return (EnumC21266118Kd) C08FF.LIZ(EnumC21266118Kd.class, str);
    }

    public final String getValue() {
        return this.LL;
    }

    EnumC21266118Kd(String str) {
        this.LL = str;
    }
}
