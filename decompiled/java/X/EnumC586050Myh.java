package X;

/* JADX INFO: renamed from: X.0Myh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public enum EnumC586050Myh {
    Video("fyp_video"),
    AD("fyp_ad"),
    Photo("fyp_photo"),
    Live("fyp_live");

    public final String LL;

    public static EnumC586050Myh valueOf(String str) {
        return (EnumC586050Myh) C08FF.LIZ(EnumC586050Myh.class, str);
    }

    EnumC586050Myh(String str) {
        this.LL = str;
    }
}
