package X;

/* JADX INFO: renamed from: X.0jLI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public enum EnumC1277260jLI {
    PUSHER("pusher"),
    ANCHOR_NET("anchor_net"),
    LYRAX("lyrax_prober");

    public final String LL;

    public String value() {
        return this.LL;
    }

    public static EnumC1277260jLI valueOf(String str) {
        return (EnumC1277260jLI) C08FF.LIZ(EnumC1277260jLI.class, str);
    }

    EnumC1277260jLI(String str) {
        this.LL = str;
    }
}
