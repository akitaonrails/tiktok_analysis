package X;

/* JADX INFO: renamed from: X.0jac, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public enum EnumC1286760jac {
    RenderModeDefault,
    RenderModeSingle;

    public static final C1286770jad Companion = new Object() { // from class: X.0jad
    };

    public static EnumC1286760jac valueOf(String str) {
        return (EnumC1286760jac) C08FF.LIZ(EnumC1286760jac.class, str);
    }

    public final EnumC1286780jae into() {
        int i = C1286750jab.LIZ[ordinal()];
        if (i == 1) {
            return EnumC1286780jae.VAR_LINK_MIC_RENDER_MODE_RENDER_MODE_DEFAULT;
        }
        if (i == 2) {
            return EnumC1286780jae.VAR_LINK_MIC_RENDER_MODE_RENDER_MODE_SINGLE;
        }
        throw new C1954807lC();
    }

    public final int intoInt() {
        int i = C1286750jab.LIZ[ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            throw new C1954807lC();
        }
        return 1;
    }
}
