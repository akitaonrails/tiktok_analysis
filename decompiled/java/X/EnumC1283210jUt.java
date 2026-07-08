package X;

/* JADX INFO: renamed from: X.0jUt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public enum EnumC1283210jUt {
    EmptySlot,
    RtcUserId,
    RtcStreamId,
    LiveUserId;

    public static final C1283220jUu Companion = new Object() { // from class: X.0jUu
    };

    public static EnumC1283210jUt valueOf(String str) {
        return (EnumC1283210jUt) C08FF.LIZ(EnumC1283210jUt.class, str);
    }

    public final EnumC1283240jUw into() {
        int i = C1283200jUs.LIZ[ordinal()];
        if (i == 1) {
            return EnumC1283240jUw.VAR_LINK_MIC_POS_IDENTITY_TYPE_EMPTY_SLOT;
        }
        if (i == 2) {
            return EnumC1283240jUw.VAR_LINK_MIC_POS_IDENTITY_TYPE_RTC_USER_ID;
        }
        if (i == 3) {
            return EnumC1283240jUw.VAR_LINK_MIC_POS_IDENTITY_TYPE_RTC_STREAM_ID;
        }
        if (i == 4) {
            return EnumC1283240jUw.VAR_LINK_MIC_POS_IDENTITY_TYPE_LIVE_USER_ID;
        }
        throw new C1954807lC();
    }

    public final int intoInt() {
        int i = C1283200jUs.LIZ[ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        if (i != 4) {
            throw new C1954807lC();
        }
        return 3;
    }
}
