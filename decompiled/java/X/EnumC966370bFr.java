package X;

/* JADX INFO: renamed from: X.0bFr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public enum EnumC966370bFr {
    None,
    FullScreen,
    Fixed,
    Float;

    public static final C968290bIx Companion = new Object() { // from class: X.0bIx
    };

    public static EnumC966370bFr valueOf(String str) {
        return (EnumC966370bFr) C08FF.LIZ(EnumC966370bFr.class, str);
    }

    public final EnumC2231891CXb into() {
        int i = C966360bFq.LIZ[ordinal()];
        if (i == 1) {
            return EnumC2231891CXb.VAR_LINK_MIC_ANCHOR_WINDOWS_DISPLAY_TYPE_NONE;
        }
        if (i == 2) {
            return EnumC2231891CXb.VAR_LINK_MIC_ANCHOR_WINDOWS_DISPLAY_TYPE_FULL_SCREEN;
        }
        if (i == 3) {
            return EnumC2231891CXb.VAR_LINK_MIC_ANCHOR_WINDOWS_DISPLAY_TYPE_FIXED;
        }
        if (i == 4) {
            return EnumC2231891CXb.VAR_LINK_MIC_ANCHOR_WINDOWS_DISPLAY_TYPE_FLOAT;
        }
        throw new C1954807lC();
    }

    public final int intoInt() {
        int i = C966360bFq.LIZ[ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        if (i != 4) {
            throw new C1954807lC();
        }
        return 3;
    }
}
