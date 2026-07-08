package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0L8y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class EnumC538220L8y {
    public static final EnumC538220L8y AB_ROLL;
    public static final EnumC538220L8y AI;
    public static final EnumC538220L8y ALBUM_CAMERA;
    public static final EnumC538220L8y LIVE_RECORDINGS;
    public static final /* synthetic */ EnumC538220L8y[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC538220L8y MEDIA_STORE;
    public static final EnumC538220L8y PHOTO_PICKER;
    public static final EnumC538220L8y RECALL_MEDIA;
    public final int LL;

    public static InterfaceC2044707zh<EnumC538220L8y> getEntries() {
        return LLILLL;
    }

    static {
        EnumC538220L8y enumC538220L8y = new EnumC538220L8y("MEDIA_STORE", 0, 0);
        MEDIA_STORE = enumC538220L8y;
        EnumC538220L8y enumC538220L8y2 = new EnumC538220L8y("PHOTO_PICKER", 1, 1);
        PHOTO_PICKER = enumC538220L8y2;
        EnumC538220L8y enumC538220L8y3 = new EnumC538220L8y("RECALL_MEDIA", 2, 2);
        RECALL_MEDIA = enumC538220L8y3;
        EnumC538220L8y enumC538220L8y4 = new EnumC538220L8y("AB_ROLL", 3, 3);
        AB_ROLL = enumC538220L8y4;
        EnumC538220L8y enumC538220L8y5 = new EnumC538220L8y("AI", 4, 4);
        AI = enumC538220L8y5;
        EnumC538220L8y enumC538220L8y6 = new EnumC538220L8y("LIVE_RECORDINGS", 5, 5);
        LIVE_RECORDINGS = enumC538220L8y6;
        EnumC538220L8y enumC538220L8y7 = new EnumC538220L8y("ALBUM_CAMERA", 6, 6);
        ALBUM_CAMERA = enumC538220L8y7;
        EnumC538220L8y[] enumC538220L8yArr = {enumC538220L8y, enumC538220L8y2, enumC538220L8y3, enumC538220L8y4, enumC538220L8y5, enumC538220L8y6, enumC538220L8y7};
        LLILLJJLI = enumC538220L8yArr;
        LLILLL = new C2254308sP(enumC538220L8yArr);
    }

    public static EnumC538220L8y[] values() {
        return (EnumC538220L8y[]) LLILLJJLI.clone();
    }

    public final int getKey() {
        return this.LL;
    }

    public static EnumC538220L8y valueOf(String str) {
        return (EnumC538220L8y) C08FF.LIZ(EnumC538220L8y.class, str);
    }

    public EnumC538220L8y(String str, int i, int i2) {
        this.LL = i2;
    }
}
