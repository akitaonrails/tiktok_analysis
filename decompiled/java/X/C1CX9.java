package X;

/* JADX INFO: renamed from: X.1CX9, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public enum C1CX9 {
    Undefined,
    Stream,
    LiveStudioStreamPortrait,
    LiveStudioStreamLandscape,
    CohostQuickInviteSlot,
    JustDance;

    public static final C2232391CYz Companion = new Object() { // from class: X.1CYz
    };

    public static C1CX9 valueOf(String str) {
        return (C1CX9) C08FF.LIZ(C1CX9.class, str);
    }

    public final C1CXP into() {
        switch (C2232061CXs.LIZ[ordinal()]) {
            case 1:
                return C1CXP.VAR_LINK_MIC_CONTENT_TYPE_UNDEFINED;
            case 2:
                return C1CXP.VAR_LINK_MIC_CONTENT_TYPE_STREAM;
            case 3:
                return C1CXP.VAR_LINK_MIC_CONTENT_TYPE_LIVE_STUDIO_STREAM_PORTRAIT;
            case 4:
                return C1CXP.VAR_LINK_MIC_CONTENT_TYPE_LIVE_STUDIO_STREAM_LANDSCAPE;
            case 5:
                return C1CXP.VAR_LINK_MIC_CONTENT_TYPE_COHOST_QUICK_INVITE_SLOT;
            case 6:
                return C1CXP.VAR_LINK_MIC_CONTENT_TYPE_JUST_DANCE;
            default:
                throw new C1954807lC();
        }
    }

    public final int intoInt() {
        switch (C2232061CXs.LIZ[ordinal()]) {
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
