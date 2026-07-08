package X;

/* JADX INFO: renamed from: X.1CXL, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public enum C1CXL {
    Unknown,
    InviteGroup,
    ReplyGroup,
    ApplyGroup,
    PermitGroup;

    public static final C2232241CYk Companion = new Object() { // from class: X.1CYk
    };

    public static C1CXL valueOf(String str) {
        return (C1CXL) C08FF.LIZ(C1CXL.class, str);
    }

    public final C1CXQ into() {
        int i = C2232131CXz.LIZ[ordinal()];
        if (i == 1) {
            return C1CXQ.VAR_LINK_MIC_DROPPED_IM_TYPE_UNKNOWN;
        }
        if (i == 2) {
            return C1CXQ.VAR_LINK_MIC_DROPPED_IM_TYPE_INVITE_GROUP;
        }
        if (i == 3) {
            return C1CXQ.VAR_LINK_MIC_DROPPED_IM_TYPE_REPLY_GROUP;
        }
        if (i == 4) {
            return C1CXQ.VAR_LINK_MIC_DROPPED_IM_TYPE_APPLY_GROUP;
        }
        if (i == 5) {
            return C1CXQ.VAR_LINK_MIC_DROPPED_IM_TYPE_PERMIT_GROUP;
        }
        throw new C1954807lC();
    }

    public final int intoInt() {
        int i = C2232131CXz.LIZ[ordinal()];
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
