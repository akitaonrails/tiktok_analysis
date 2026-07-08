package X;

/* JADX INFO: renamed from: X.0apK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public enum EnumC949920apK {
    NormalApply,
    DirectAgree;

    public static final C949930apL Companion = new Object() { // from class: X.0apL
    };

    public static EnumC949920apK valueOf(String str) {
        return (EnumC949920apK) C08FF.LIZ(EnumC949920apK.class, str);
    }

    public final EnumC2232081CXu into() {
        int i = C949910apJ.LIZ[ordinal()];
        if (i == 1) {
            return EnumC2232081CXu.VAR_LINK_MIC_APPLY_INTENT_NORMAL_APPLY;
        }
        if (i == 2) {
            return EnumC2232081CXu.VAR_LINK_MIC_APPLY_INTENT_DIRECT_AGREE;
        }
        throw new C1954807lC();
    }

    public final int intoInt() {
        int i = C949910apJ.LIZ[ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            throw new C1954807lC();
        }
        return 1;
    }
}
