package X;

/* JADX INFO: renamed from: X.0bFk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public enum EnumC966300bFk {
    Unknown,
    OverlappingFlow,
    OverlappingFixed,
    GridFlow,
    GridFixed;

    public static final C968280bIw Companion = new Object() { // from class: X.0bIw
    };

    public static EnumC966300bFk valueOf(String str) {
        return (EnumC966300bFk) C08FF.LIZ(EnumC966300bFk.class, str);
    }

    public final EnumC972810bQF into() {
        int i = C966290bFj.LIZ[ordinal()];
        if (i == 1) {
            return EnumC972810bQF.VAR_LINK_MIC_LAYOUT_STYLE_UNKNOWN;
        }
        if (i == 2) {
            return EnumC972810bQF.VAR_LINK_MIC_LAYOUT_STYLE_OVERLAPPING_FLOW;
        }
        if (i == 3) {
            return EnumC972810bQF.VAR_LINK_MIC_LAYOUT_STYLE_OVERLAPPING_FIXED;
        }
        if (i == 4) {
            return EnumC972810bQF.VAR_LINK_MIC_LAYOUT_STYLE_GRID_FLOW;
        }
        if (i == 5) {
            return EnumC972810bQF.VAR_LINK_MIC_LAYOUT_STYLE_GRID_FIXED;
        }
        throw new C1954807lC();
    }

    public final int intoInt() {
        int i = C966290bFj.LIZ[ordinal()];
        int i2 = 1;
        if (i == 1) {
            return 0;
        }
        int i3 = 2;
        if (i != 2) {
            i2 = 3;
            if (i != 3) {
                i3 = 4;
                if (i != 4) {
                    if (i != 5) {
                        throw new C1954807lC();
                    }
                }
            }
            return i3;
        }
        return i2;
    }
}
