package X;

/* JADX INFO: renamed from: X.0y9E, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public enum EnumC1846380y9E {
    ROOM("room"),
    FEED("feed"),
    GIFT("gift"),
    BROADCAST("broadcast"),
    RANK_LIST("rank_list"),
    REPORT("report"),
    LINK_MIC("link_mic"),
    PCS("pcs"),
    OTHER("other");

    public final String key;

    public static EnumC1846380y9E valueOf(String str) {
        return (EnumC1846380y9E) C08FF.LIZ(EnumC1846380y9E.class, str);
    }

    EnumC1846380y9E(String str) {
        this.key = str;
    }
}
