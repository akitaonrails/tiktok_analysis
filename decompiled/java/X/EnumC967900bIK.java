package X;

/* JADX INFO: renamed from: X.0bIK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public enum EnumC967900bIK {
    None,
    LinkedList,
    AppliedList,
    InvitedList,
    ContentPositionList;

    public static final C968270bIv Companion = new Object() { // from class: X.0bIv
    };

    public static EnumC967900bIK valueOf(String str) {
        return (EnumC967900bIK) C08FF.LIZ(EnumC967900bIK.class, str);
    }

    public final EnumC972790bQD into() {
        int i = C967890bIJ.LIZ[ordinal()];
        if (i == 1) {
            return EnumC972790bQD.VAR_LINK_MIC_LIST_CHANGE_TYPE_NONE;
        }
        if (i == 2) {
            return EnumC972790bQD.VAR_LINK_MIC_LIST_CHANGE_TYPE_LINKED_LIST;
        }
        if (i == 3) {
            return EnumC972790bQD.VAR_LINK_MIC_LIST_CHANGE_TYPE_APPLIED_LIST;
        }
        if (i == 4) {
            return EnumC972790bQD.VAR_LINK_MIC_LIST_CHANGE_TYPE_INVITED_LIST;
        }
        if (i == 5) {
            return EnumC972790bQD.VAR_LINK_MIC_LIST_CHANGE_TYPE_CONTENT_POSITION_LIST;
        }
        throw new C1954807lC();
    }

    public final int intoInt() {
        int i = C967890bIJ.LIZ[ordinal()];
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
