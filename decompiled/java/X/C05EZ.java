package X;

import com.mammon.audiosdk.enums.SAMICoreVopState;

/* JADX INFO: renamed from: X.05EZ, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C05EZ {
    public static String LIZ = "";

    public static C05HK LIZ(String str) {
        if (!C0CHQ.LIZ().getAccountService().isLogin()) {
            return null;
        }
        C05HM c05hm = C05HM.LIZIZ;
        int iInit = c05hm.init(str);
        if (iInit == 0) {
            if (c05hm.getCurrentState() != SAMICoreVopState.COMPLETED.getValue()) {
                return null;
            }
            return c05hm.getSpeakerInfo();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("voice clone InstantVopCloneService.init failed! result code: ");
        sbLIZ.append(iInit);
        C2188811AlT.LIZIZ(sbLIZ);
        return null;
    }
}
