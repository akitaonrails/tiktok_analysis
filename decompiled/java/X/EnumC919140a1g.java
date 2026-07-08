package X;

/* JADX INFO: renamed from: X.0a1g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public enum EnumC919140a1g {
    LegacyInvitee,
    InviteeList;

    public static final C919150a1h Companion = new Object() { // from class: X.0a1h
    };

    public static EnumC919140a1g valueOf(String str) {
        return (EnumC919140a1g) C08FF.LIZ(EnumC919140a1g.class, str);
    }

    public final EnumC2232111CXx into() {
        int i = C919130a1f.LIZ[ordinal()];
        if (i == 1) {
            return EnumC2232111CXx.VAR_LINK_MIC_INVITE_TYPE_LEGACY_INVITEE;
        }
        if (i == 2) {
            return EnumC2232111CXx.VAR_LINK_MIC_INVITE_TYPE_INVITEE_LIST;
        }
        throw new C1954807lC();
    }

    public final int intoInt() {
        int i = C919130a1f.LIZ[ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            throw new C1954807lC();
        }
        return 1;
    }
}
