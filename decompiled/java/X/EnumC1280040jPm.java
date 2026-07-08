package X;

/* JADX INFO: renamed from: X.0jPm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public enum EnumC1280040jPm {
    Quit,
    Dropped,
    BecomeAudience;

    public static final C1280050jPn Companion = new Object() { // from class: X.0jPn
    };

    public static EnumC1280040jPm valueOf(String str) {
        return (EnumC1280040jPm) C08FF.LIZ(EnumC1280040jPm.class, str);
    }

    public final EnumC1282210jTH into() {
        int i = C1280030jPl.LIZ[ordinal()];
        if (i == 1) {
            return EnumC1282210jTH.VAR_LINK_MIC_RTC_USER_OFFLINE_REASON_QUIT;
        }
        if (i == 2) {
            return EnumC1282210jTH.VAR_LINK_MIC_RTC_USER_OFFLINE_REASON_DROPPED;
        }
        if (i == 3) {
            return EnumC1282210jTH.VAR_LINK_MIC_RTC_USER_OFFLINE_REASON_BECOME_AUDIENCE;
        }
        throw new C1954807lC();
    }

    public final int intoInt() {
        int i = C1280030jPl.LIZ[ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        throw new C1954807lC();
    }
}
