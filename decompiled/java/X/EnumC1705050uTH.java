package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0uTH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1705050uTH {
    public static final /* synthetic */ EnumC1705050uTH[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC1705050uTH TRACKING_TYPE_BACKGROUND;
    public static final EnumC1705050uTH TRACKING_TYPE_FACE;
    public static final EnumC1705050uTH TRACKING_TYPE_FACE_TATTO;
    public static final EnumC1705050uTH TRACKING_TYPE_FOREGROUND;
    public static final EnumC1705050uTH TRACKING_TYPE_HAND;
    public final String LL;
    public final int LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1705050uTH> getEntries() {
        return LLILZ;
    }

    static {
        EnumC1705050uTH enumC1705050uTH = new EnumC1705050uTH("TRACKING_TYPE_BACKGROUND", 0, "background", 13);
        TRACKING_TYPE_BACKGROUND = enumC1705050uTH;
        EnumC1705050uTH enumC1705050uTH2 = new EnumC1705050uTH("TRACKING_TYPE_FOREGROUND", 1, "foreground", 1);
        TRACKING_TYPE_FOREGROUND = enumC1705050uTH2;
        EnumC1705050uTH enumC1705050uTH3 = new EnumC1705050uTH("TRACKING_TYPE_HAND", 2, "hand", 14);
        TRACKING_TYPE_HAND = enumC1705050uTH3;
        EnumC1705050uTH enumC1705050uTH4 = new EnumC1705050uTH("TRACKING_TYPE_FACE", 3, "face", 2);
        TRACKING_TYPE_FACE = enumC1705050uTH4;
        EnumC1705050uTH enumC1705050uTH5 = new EnumC1705050uTH("TRACKING_TYPE_FACE_TATTO", 4, "facemesh", 3);
        TRACKING_TYPE_FACE_TATTO = enumC1705050uTH5;
        EnumC1705050uTH[] enumC1705050uTHArr = {enumC1705050uTH, enumC1705050uTH2, enumC1705050uTH3, enumC1705050uTH4, enumC1705050uTH5};
        LLILLL = enumC1705050uTHArr;
        LLILZ = new C2254308sP(enumC1705050uTHArr);
    }

    public static EnumC1705050uTH[] values() {
        return (EnumC1705050uTH[]) LLILLL.clone();
    }

    public final int getCkeFeatureType() {
        return this.LLILLJJLI;
    }

    public final String getTypeName() {
        return this.LL;
    }

    public static EnumC1705050uTH valueOf(String str) {
        return (EnumC1705050uTH) C08FF.LIZ(EnumC1705050uTH.class, str);
    }

    public EnumC1705050uTH(String str, int i, String str2, int i2) {
        this.LL = str2;
        this.LLILLJJLI = i2;
    }
}
