package X;

/* JADX INFO: renamed from: X.0jMY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public enum EnumC1278040jMY {
    VeLiveAudioCodecFdkAAC("aacFdk"),
    VeLiveAudioCodecMediaCodecAAC("aacMediaCodec"),
    VeLiveAudioCodecFFmpegAAC("aacFFmpeg");

    public static final C1278720jNe Companion = new Object() { // from class: X.0jNe
    };
    public final String LL;

    public static EnumC1278040jMY valueOf(String str) {
        return (EnumC1278040jMY) C08FF.LIZ(EnumC1278040jMY.class, str);
    }

    public final String getTag() {
        return this.LL;
    }

    EnumC1278040jMY(String str) {
        this.LL = str;
    }
}
