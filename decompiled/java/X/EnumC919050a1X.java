package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0a1X, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC919050a1X {
    public static final EnumC919050a1X GROUP_LIVE;
    public static final EnumC919050a1X LINE_UP;
    public static final EnumC919050a1X LINK_MIC_ANCHOR;
    public static final EnumC919050a1X LINK_MIC_GUEST;
    public static final EnumC919050a1X LINK_MIC_PK;
    public static final /* synthetic */ EnumC919050a1X[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC919050a1X NORMAL_VIDEO;
    public final String LL;

    public static InterfaceC2044707zh<EnumC919050a1X> getEntries() {
        return LLILLL;
    }

    static {
        EnumC919050a1X enumC919050a1X = new EnumC919050a1X("NORMAL_VIDEO", 0, "normal_video_live");
        NORMAL_VIDEO = enumC919050a1X;
        EnumC919050a1X enumC919050a1X2 = new EnumC919050a1X("GROUP_LIVE", 1, "group_live");
        GROUP_LIVE = enumC919050a1X2;
        EnumC919050a1X enumC919050a1X3 = new EnumC919050a1X("LINE_UP", 2, "video_anchor_order");
        LINE_UP = enumC919050a1X3;
        EnumC919050a1X enumC919050a1X4 = new EnumC919050a1X("LINK_MIC_ANCHOR", 3, "video_anchor_connect");
        LINK_MIC_ANCHOR = enumC919050a1X4;
        EnumC919050a1X enumC919050a1X5 = new EnumC919050a1X("LINK_MIC_PK", 4, "video_anchor_pk");
        LINK_MIC_PK = enumC919050a1X5;
        EnumC919050a1X enumC919050a1X6 = new EnumC919050a1X("LINK_MIC_GUEST", 5, "video_anchor_guest_connect");
        LINK_MIC_GUEST = enumC919050a1X6;
        EnumC919050a1X[] enumC919050a1XArr = {enumC919050a1X, enumC919050a1X2, enumC919050a1X3, enumC919050a1X4, enumC919050a1X5, enumC919050a1X6};
        LLILLJJLI = enumC919050a1XArr;
        LLILLL = new C2254308sP(enumC919050a1XArr);
    }

    public static EnumC919050a1X[] values() {
        return (EnumC919050a1X[]) LLILLJJLI.clone();
    }

    public final String getDesc() {
        return this.LL;
    }

    public static EnumC919050a1X valueOf(String str) {
        return (EnumC919050a1X) C08FF.LIZ(EnumC919050a1X.class, str);
    }

    public EnumC919050a1X(String str, int i, String str2) {
        this.LL = str2;
    }
}
