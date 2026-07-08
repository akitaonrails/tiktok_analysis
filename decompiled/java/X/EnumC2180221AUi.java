package X;

/* JADX INFO: renamed from: X.1AUi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public enum EnumC2180221AUi {
    VIDEO_LIVE("video_live"),
    SCREEN_SHARE("screen_share");

    public String name;

    public static EnumC2180221AUi valueOf(String str) {
        return (EnumC2180221AUi) C08FF.LIZ(EnumC2180221AUi.class, str);
    }

    EnumC2180221AUi(String str) {
        this.name = str;
    }
}
