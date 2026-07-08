package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.PlaybookUtilKt;
import com.bytedance.android.live.network.response.BaseResponse;

/* JADX INFO: renamed from: X.01NB, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01NB {
    public static final C11KQ LIZ(AbstractC19484711Kz abstractC19484711Kz) {
        return abstractC19484711Kz.LJIIL(new C09JN() { // from class: X.01NC
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("IMultiGuestPlayApiKt@7d5e.handleException$1");
                C176600m4.LIZJ(new C5182020e((Throwable) obj, 618));
                C1C7U.LIZIZ("IMultiGuestPlayApiKt@7d5e.handleException$1");
            }
        });
    }

    public static final String LIZJ(String str) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            int i3 = i2 + 1;
            if (Character.isUpperCase(cCharAt) && i2 > 0) {
                sb.append('_');
                sb.append(Character.toLowerCase(cCharAt));
            } else {
                if (i2 == 0) {
                    cCharAt = Character.toLowerCase(cCharAt);
                }
                sb.append(cCharAt);
            }
            i++;
            i2 = i3;
        }
        return sb.toString();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final String LIZLLL(String str) {
        switch (str.hashCode()) {
            case -1706870136:
                if (!str.equals("GuestShowdownGuestModel")) {
                    return "";
                }
                return "guest_showdown";
            case -421877682:
                if (!str.equals("PlaybookGuestModel")) {
                    return "";
                }
                return "playbook";
            case -341331629:
                if (!str.equals("PlaybookGoLiveAnchorLisViewPresenter")) {
                    return "";
                }
                return "playbook";
            case 408552957:
                if (!str.equals("GuestShowdownAnchorModel")) {
                    return "";
                }
                return "guest_showdown";
            case 1588613367:
                if (!str.equals("PlaybookAnchorModel")) {
                    return "";
                }
                return "playbook";
            default:
                return "";
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final String LJ(String str) {
        switch (str.hashCode()) {
            case -1706870136:
                if (!str.equals("GuestShowdownGuestModel")) {
                    return "";
                }
                return "guest_showdown_";
            case -421877682:
                if (!str.equals("PlaybookGuestModel")) {
                    return "";
                }
                return "playbook_";
            case -341331629:
                if (!str.equals("PlaybookGoLiveAnchorLisViewPresenter")) {
                    return "";
                }
                return "playbook_";
            case 408552957:
                if (!str.equals("GuestShowdownAnchorModel")) {
                    return "";
                }
                return "guest_showdown_";
            case 1588613367:
                if (!str.equals("PlaybookAnchorModel")) {
                    return "";
                }
                return "playbook_";
            default:
                return "";
        }
    }

    public static final C11KQ LIZIZ(AbstractC19484711Kz abstractC19484711Kz, final String str, final String str2) {
        final long jLIZIZ = C963140bAe.LIZIZ();
        return abstractC19484711Kz.LJIILL(new C09JN() { // from class: X.01N9
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("IMultiGuestPlayApiKt@7d5e.logApi$1");
                BaseResponse baseResponse = (BaseResponse) obj;
                String strLIZIZ = C01EI.LIZIZ(str, str2);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str2);
                sbLIZ.append(" success logId=");
                sbLIZ.append(baseResponse.LIZIZ);
                C1AZW.LJIIJ(12, strLIZIZ, C2188811AlT.LIZIZ(sbLIZ), null, null);
                String strLJ = C01NB.LJ(str);
                if (strLJ.length() > 0) {
                    String strLIZLLL = C01NB.LIZLLL(str);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(strLJ);
                    sbLIZ2.append(C01NB.LIZJ(str2));
                    C01N8.LIZ(baseResponse.statusCode, strLIZLLL, C2188811AlT.LIZIZ(sbLIZ2), C963140bAe.LIZIZ() - jLIZIZ, "", "", "");
                }
                C1C7U.LIZIZ("IMultiGuestPlayApiKt@7d5e.logApi$1");
            }
        }).LJIIL(new C09JN() { // from class: X.01NA
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("IMultiGuestPlayApiKt@7d5e.logApi$2");
                Throwable th = (Throwable) obj;
                String strLJ = C01NB.LJ(str);
                if (strLJ.length() > 0) {
                    String strLIZLLL = C01NB.LIZLLL(str);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(strLJ);
                    sbLIZ.append(C01NB.LIZJ(str2));
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    int iLJIIL = PlaybookUtilKt.LJIIL(th);
                    String message = th.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    C01N8.LIZ(iLJIIL, strLIZLLL, strLIZIZ, C963140bAe.LIZIZ() - jLIZIZ, "", "", message);
                }
                if (th instanceof C477520Io2) {
                    String strLIZIZ2 = C01EI.LIZIZ(str, str2);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(str2);
                    sbLIZ2.append(" fail logId=");
                    C477520Io2 c477520Io2 = (C477520Io2) th;
                    sbLIZ2.append(c477520Io2.getxTtLogId());
                    sbLIZ2.append(" throwable.message=");
                    sbLIZ2.append(c477520Io2.getMessage());
                    C1AZW.LJFF(strLIZIZ2, C2188811AlT.LIZIZ(sbLIZ2), null, null);
                } else {
                    String strLIZIZ3 = C01EI.LIZIZ(str, str2);
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(str2);
                    sbLIZ3.append(" fail throwable.message=");
                    sbLIZ3.append(th.getMessage());
                    C1AZW.LJFF(strLIZIZ3, C2188811AlT.LIZIZ(sbLIZ3), null, null);
                }
                C1C7U.LIZIZ("IMultiGuestPlayApiKt@7d5e.logApi$2");
            }
        });
    }
}
