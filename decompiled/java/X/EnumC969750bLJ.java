package X;

/* JADX INFO: renamed from: X.0bLJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public enum EnumC969750bLJ {
    Video,
    Audio;

    public static final C969760bLK Companion = new Object() { // from class: X.0bLK
    };

    public static EnumC969750bLJ valueOf(String str) {
        return (EnumC969750bLJ) C08FF.LIZ(EnumC969750bLJ.class, str);
    }

    public final EnumC2232071CXt into() {
        int i = C969740bLI.LIZ[ordinal()];
        if (i == 1) {
            return EnumC2232071CXt.VAR_LINK_MIC_MULTI_BIZ_JOIN_DIRECT_LINK_TYPE_VIDEO;
        }
        if (i == 2) {
            return EnumC2232071CXt.VAR_LINK_MIC_MULTI_BIZ_JOIN_DIRECT_LINK_TYPE_AUDIO;
        }
        throw new C1954807lC();
    }

    public final int intoInt() {
        int i = C969740bLI.LIZ[ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            throw new C1954807lC();
        }
        return 1;
    }
}
