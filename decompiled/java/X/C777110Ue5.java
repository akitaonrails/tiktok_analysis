package X;

/* JADX INFO: renamed from: X.0Ue5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C777110Ue5 {
    public static final /* synthetic */ int LIZ = 0;

    public static int LIZ(int i, int i2) {
        switch (i) {
            case 1:
                return EnumC778100Ufg.LIVE_TIP_CONTROL_MESSAGE_SUSPENDED_TIP.ordinal();
            case 2:
                return EnumC778100Ufg.LIVE_TIP_PERCEPTION_MESSAGE_P1.ordinal();
            case 3:
                return EnumC778100Ufg.LIVE_TIP_BOTTOM_MESSAGE_CLOSE.ordinal();
            case 4:
                return EnumC778100Ufg.LIVE_TIP_BOTTOM_MESSAGE_NO_CLOSE.ordinal();
            case 5:
                return -1;
            case 6:
                return EnumC778100Ufg.LIVE_TIP_GO_APPEAL_TIPS.ordinal();
            case 7:
                return EnumC778100Ufg.LIVE_TIP_APPEAL_SUCCESS_TIPS.ordinal();
            default:
                return i2;
        }
    }

    public static boolean LIZIZ(EnumC778100Ufg enumC778100Ufg, EnumC778100Ufg enumC778100Ufg2) {
        if (enumC778100Ufg != enumC778100Ufg2 || !C13LP.LJJJJ(enumC778100Ufg, C13LQ.LJLIIL(new EnumC778100Ufg[]{EnumC778100Ufg.LIVE_TIP_PERCEPTION_MESSAGE_P1, EnumC778100Ufg.LIVE_TIP_BOTTOM_MESSAGE_NO_CLOSE, EnumC778100Ufg.LIVE_TIP_BOTTOM_MESSAGE_CLOSE, EnumC778100Ufg.LIVE_TIP_MESSAGE_WARNING_TIP, EnumC778100Ufg.LIVE_TIP_CONTROL_MESSAGE_SUSPENDED_TIP, EnumC778100Ufg.LIVE_TIP_GO_APPEAL_TIPS, EnumC778100Ufg.LIVE_TIP_APPEAL_SUCCESS_TIPS}))) {
            return false;
        }
        return true;
    }
}
