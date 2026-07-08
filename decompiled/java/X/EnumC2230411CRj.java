package X;

/* JADX INFO: renamed from: X.1CRj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public enum EnumC2230411CRj {
    Bool,
    Integer,
    Long,
    Float,
    String;

    public static final C2230431CRl Companion = new Object() { // from class: X.1CRl
    };

    public static EnumC2230411CRj valueOf(String str) {
        return (EnumC2230411CRj) C08FF.LIZ(EnumC2230411CRj.class, str);
    }

    public final EnumC2230391CRh into() {
        int i = C2230421CRk.LIZ[ordinal()];
        if (i == 1) {
            return EnumC2230391CRh.VAR_LINK_MIC_SETTING_TYPE_BOOL;
        }
        if (i == 2) {
            return EnumC2230391CRh.VAR_LINK_MIC_SETTING_TYPE_INTEGER;
        }
        if (i == 3) {
            return EnumC2230391CRh.VAR_LINK_MIC_SETTING_TYPE_LONG;
        }
        if (i == 4) {
            return EnumC2230391CRh.VAR_LINK_MIC_SETTING_TYPE_FLOAT;
        }
        if (i == 5) {
            return EnumC2230391CRh.VAR_LINK_MIC_SETTING_TYPE_STRING;
        }
        throw new C1954807lC();
    }

    public final int intoInt() {
        int i = C2230421CRk.LIZ[ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        if (i == 4) {
            return 3;
        }
        if (i == 5) {
            return 4;
        }
        throw new C1954807lC();
    }
}
