package X;

/* JADX INFO: renamed from: X.1Alj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public enum EnumC2188971Alj {
    Origin,
    Gecko,
    GeckoCdn,
    Cache,
    Local,
    Sei;

    public static final C2188981Alk Companion = new Object() { // from class: X.1Alk
    };

    public static EnumC2188971Alj valueOf(String str) {
        return (EnumC2188971Alj) C08FF.LIZ(EnumC2188971Alj.class, str);
    }

    public final EnumC2188991All into() {
        switch (C2188961Ali.LIZ[ordinal()]) {
            case 1:
                return EnumC2188991All.VAR_LINK_MIC_DSL_SOURCE_ORIGIN;
            case 2:
                return EnumC2188991All.VAR_LINK_MIC_DSL_SOURCE_GECKO;
            case 3:
                return EnumC2188991All.VAR_LINK_MIC_DSL_SOURCE_GECKO_CDN;
            case 4:
                return EnumC2188991All.VAR_LINK_MIC_DSL_SOURCE_CACHE;
            case 5:
                return EnumC2188991All.VAR_LINK_MIC_DSL_SOURCE_LOCAL;
            case 6:
                return EnumC2188991All.VAR_LINK_MIC_DSL_SOURCE_SEI;
            default:
                throw new C1954807lC();
        }
    }

    public final int intoInt() {
        switch (C2188961Ali.LIZ[ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            default:
                throw new C1954807lC();
        }
    }
}
