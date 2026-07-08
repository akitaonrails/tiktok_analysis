package X;

/* JADX INFO: renamed from: X.0bQV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public enum EnumC972970bQV {
    JoinRtcChannel,
    PreJoinRtcChannel;

    public static final C972980bQW Companion = new Object() { // from class: X.0bQW
    };

    public static EnumC972970bQV valueOf(String str) {
        return (EnumC972970bQV) C08FF.LIZ(EnumC972970bQV.class, str);
    }

    public final EnumC2225751C9l into() {
        int i = C972960bQU.LIZ[ordinal()];
        if (i == 1) {
            return EnumC2225751C9l.VAR_LINK_MIC_TASK_SCENE_JOIN_RTC_CHANNEL;
        }
        if (i == 2) {
            return EnumC2225751C9l.VAR_LINK_MIC_TASK_SCENE_PRE_JOIN_RTC_CHANNEL;
        }
        throw new C1954807lC();
    }

    public final int intoInt() {
        int i = C972960bQU.LIZ[ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            throw new C1954807lC();
        }
        return 1;
    }
}
