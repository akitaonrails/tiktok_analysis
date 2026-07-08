package X;

/* JADX INFO: renamed from: X.0wjF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public enum EnumC1791830wjF {
    GOOGLE("GP"),
    AMAZON("amazon"),
    UNKNOWN("UNKNOWN");

    public final String channelName;

    public static EnumC1791830wjF valueOf(String str) {
        return (EnumC1791830wjF) C08FF.LIZ(EnumC1791830wjF.class, str);
    }

    EnumC1791830wjF(String str) {
        this.channelName = str;
    }
}
