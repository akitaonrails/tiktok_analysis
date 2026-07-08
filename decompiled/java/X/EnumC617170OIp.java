package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0OIp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC617170OIp {
    public static final EnumC617170OIp AUTO_SHARE_LIVE_EVENT_TO_BULLETIN_BOARD;
    public static final EnumC617170OIp AUTO_SHARE_LIVE_ROOM_TO_BULLETIN_BOARD;
    public static final EnumC617170OIp AUTO_SHARE_POSTS_TO_BULLETIN_BOARD;
    public static final EnumC617170OIp LIVE_TOOLS_PARENT;
    public static final /* synthetic */ EnumC617170OIp[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC617170OIp SHOW_CHANNEL_IN_PROFILE;
    public static final EnumC617170OIp UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC617170OIp> getEntries() {
        return LLILLL;
    }

    static {
        EnumC617170OIp enumC617170OIp = new EnumC617170OIp("UNKNOWN", 0, 0);
        UNKNOWN = enumC617170OIp;
        EnumC617170OIp enumC617170OIp2 = new EnumC617170OIp("SHOW_CHANNEL_IN_PROFILE", 1, 1);
        SHOW_CHANNEL_IN_PROFILE = enumC617170OIp2;
        EnumC617170OIp enumC617170OIp3 = new EnumC617170OIp("LIVE_TOOLS_PARENT", 2, 2);
        LIVE_TOOLS_PARENT = enumC617170OIp3;
        EnumC617170OIp enumC617170OIp4 = new EnumC617170OIp("AUTO_SHARE_LIVE_ROOM_TO_BULLETIN_BOARD", 3, 3);
        AUTO_SHARE_LIVE_ROOM_TO_BULLETIN_BOARD = enumC617170OIp4;
        EnumC617170OIp enumC617170OIp5 = new EnumC617170OIp("AUTO_SHARE_LIVE_EVENT_TO_BULLETIN_BOARD", 4, 4);
        AUTO_SHARE_LIVE_EVENT_TO_BULLETIN_BOARD = enumC617170OIp5;
        EnumC617170OIp enumC617170OIp6 = new EnumC617170OIp("AUTO_SHARE_POSTS_TO_BULLETIN_BOARD", 5, 5);
        AUTO_SHARE_POSTS_TO_BULLETIN_BOARD = enumC617170OIp6;
        EnumC617170OIp[] enumC617170OIpArr = {enumC617170OIp, enumC617170OIp2, enumC617170OIp3, enumC617170OIp4, enumC617170OIp5, enumC617170OIp6};
        LLILLJJLI = enumC617170OIpArr;
        LLILLL = new C2254308sP(enumC617170OIpArr);
    }

    public static EnumC617170OIp[] values() {
        return (EnumC617170OIp[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static EnumC617170OIp valueOf(String str) {
        return (EnumC617170OIp) C08FF.LIZ(EnumC617170OIp.class, str);
    }

    public EnumC617170OIp(String str, int i, int i2) {
        this.LL = i2;
    }
}
