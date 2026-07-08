package X;

/* JADX INFO: renamed from: X.0jVd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public enum EnumC1283670jVd {
    CHANNEL_PROFILE_COMMUNICATION(0),
    CHANNEL_PROFILE_LIVE_BROADCASTING(1),
    CHANNEL_PROFILE_GAME(2),
    CHANNEL_PROFILE_CLOUD_GAME(3);

    public final int LL;

    public String getStringNum() {
        return Integer.toString(this.LL);
    }

    public static EnumC1283670jVd valueOf(String str) {
        return (EnumC1283670jVd) C08FF.LIZ(EnumC1283670jVd.class, str);
    }

    EnumC1283670jVd(int i) {
        this.LL = i;
    }
}
