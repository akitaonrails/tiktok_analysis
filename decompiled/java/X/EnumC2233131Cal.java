package X;

/* JADX INFO: renamed from: X.1Cal, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public enum EnumC2233131Cal {
    Ok,
    InvalidArgument,
    InvalidToken,
    Response,
    RemoteKicked,
    NotSupport;

    public static final C2233151Can Companion = new Object() { // from class: X.1Can
    };

    public static EnumC2233131Cal valueOf(String str) {
        return (EnumC2233131Cal) C08FF.LIZ(EnumC2233131Cal.class, str);
    }

    public final C1CXT into() {
        switch (C2233141Cam.LIZ[ordinal()]) {
            case 1:
                return C1CXT.VAR_LINK_MIC_INTERACT_FORWARD_STREAM_ERROR_OK;
            case 2:
                return C1CXT.VAR_LINK_MIC_INTERACT_FORWARD_STREAM_ERROR_INVALID_ARGUMENT;
            case 3:
                return C1CXT.VAR_LINK_MIC_INTERACT_FORWARD_STREAM_ERROR_INVALID_TOKEN;
            case 4:
                return C1CXT.VAR_LINK_MIC_INTERACT_FORWARD_STREAM_ERROR_RESPONSE;
            case 5:
                return C1CXT.VAR_LINK_MIC_INTERACT_FORWARD_STREAM_ERROR_REMOTE_KICKED;
            case 6:
                return C1CXT.VAR_LINK_MIC_INTERACT_FORWARD_STREAM_ERROR_NOT_SUPPORT;
            default:
                throw new C1954807lC();
        }
    }

    public final int intoInt() {
        switch (C2233141Cam.LIZ[ordinal()]) {
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
