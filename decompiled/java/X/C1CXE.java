package X;

/* JADX INFO: renamed from: X.1CXE, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public enum C1CXE {
    None,
    ModeratorInvite,
    ModeratorCancelInvite,
    ModeratorReply,
    ModeratorPermit;

    public static final C2232311CYr Companion = new Object() { // from class: X.1CYr
    };

    public static C1CXE valueOf(String str) {
        return (C1CXE) C08FF.LIZ(C1CXE.class, str);
    }

    public final C1CXR into() {
        int i = C1CY0.LIZ[ordinal()];
        if (i == 1) {
            return C1CXR.VAR_LINK_MIC_IM_SUB_TYPE_NONE;
        }
        if (i == 2) {
            return C1CXR.VAR_LINK_MIC_IM_SUB_TYPE_MODERATOR_INVITE;
        }
        if (i == 3) {
            return C1CXR.VAR_LINK_MIC_IM_SUB_TYPE_MODERATOR_CANCEL_INVITE;
        }
        if (i == 4) {
            return C1CXR.VAR_LINK_MIC_IM_SUB_TYPE_MODERATOR_REPLY;
        }
        if (i == 5) {
            return C1CXR.VAR_LINK_MIC_IM_SUB_TYPE_MODERATOR_PERMIT;
        }
        throw new C1954807lC();
    }

    public final int intoInt() {
        int i = C1CY0.LIZ[ordinal()];
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
