package X;

/* JADX INFO: renamed from: X.0jdK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public enum EnumC1288440jdK {
    IMAGE_DIR_NAME(1),
    IMAGE_FILE_NAME(2),
    IMAGE_WIDTH(3),
    IMAGE_HEIGHT(4),
    FONT_FAMILY(101),
    FONT_STYLE(102),
    FONT_ASCENT(103),
    FONT_PATH(104),
    VIDEO_DIR_NAME(201),
    VIDEO_FILE_NAME(202),
    VIDEO_WIDTH(203),
    VIDEO_HEIGHT(204);

    public final int LL;

    public int getValue() {
        return this.LL;
    }

    public static EnumC1288440jdK valueOf(String str) {
        return (EnumC1288440jdK) C08FF.LIZ(EnumC1288440jdK.class, str);
    }

    EnumC1288440jdK(int i) {
        this.LL = i;
    }
}
