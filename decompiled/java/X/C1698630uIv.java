package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.videoarch.liveplayer.VideoLiveManager;
import com.ss.videoarch.liveplayer.log.LiveLoggerService;

/* JADX INFO: renamed from: X.0uIv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public class C1698630uIv {
    public long LJIJ;
    public final /* synthetic */ VideoLiveManager LJIJJ;
    public long LIZ = -1;
    public long LIZIZ = -1;
    public long LIZJ = -1;
    public long LIZLLL = -1;
    public long LJ = -1;
    public long LJFF = -1;
    public long LJI = -1;
    public long LJII = -1;
    public long LJIIIIZZ = -1;
    public long LJIIIZ = -1;
    public long LJIIJ = -1;
    public long LJIIJJI = -1;
    public String LJIIL = "none";
    public String LJIILIIL = "none";
    public String LJIILJJIL = "";
    public String LJIILL = "";
    public String LJIILLIIL = "";
    public String LJIIZILJ = "";
    public String LJIJI = "";

    public final void LIZ() {
        this.LIZ = -1L;
        this.LIZIZ = -1L;
        this.LIZJ = -1L;
        this.LIZLLL = -1L;
        this.LJ = -1L;
        this.LJFF = -1L;
        this.LJI = -1L;
        this.LJII = -1L;
        this.LJIIIIZZ = -1L;
        this.LJIIIZ = -1L;
        this.LJIIJ = -1L;
        this.LJIIJJI = -1L;
        this.LJIIL = "none";
        this.LJIILIIL = "none";
        this.LJIILL = "";
        this.LJIILLIIL = "";
        this.LJIIZILJ = "";
        this.LJIJ = 0L;
        this.LJIJI = "";
    }

    public final void LIZIZ() {
        String str = this.LJIJJ.Q0;
        if (str == null) {
            return;
        }
        C1476650oWt c1476650oWt = C1476660oWu.LIZ;
        this.LIZ = c1476650oWt.LIZLLL(str, 1101);
        this.LIZIZ = c1476650oWt.LIZLLL(this.LJIJJ.Q0, 1102);
        this.LIZJ = c1476650oWt.LIZLLL(this.LJIJJ.Q0, 1103);
        this.LJFF = c1476650oWt.LIZLLL(this.LJIJJ.Q0, 1126);
        this.LJI = c1476650oWt.LIZLLL(this.LJIJJ.Q0, 1127);
        this.LJII = c1476650oWt.LIZLLL(this.LJIJJ.Q0, 1128);
        this.LJIIIIZZ = c1476650oWt.LIZLLL(this.LJIJJ.Q0, 1131);
        this.LJIIIZ = c1476650oWt.LIZLLL(this.LJIJJ.Q0, 1133);
        this.LJIIL = c1476650oWt.LJ(this.LJIJJ.Q0, 1134);
        this.LJIILIIL = c1476650oWt.LJ(this.LJIJJ.Q0, 1191);
        this.LJIILJJIL = c1476650oWt.LJ(this.LJIJJ.Q0, 1168);
        this.LJIILL = c1476650oWt.LJ(this.LJIJJ.Q0, 1135);
        this.LJIIZILJ = c1476650oWt.LJ(this.LJIJJ.Q0, 1132);
        this.LJIILLIIL = c1476650oWt.LJ(this.LJIJJ.Q0, 1130);
        this.LJIIJ = c1476650oWt.LIZLLL(this.LJIJJ.Q0, 1145);
        this.LJIIJJI = c1476650oWt.LIZLLL(this.LJIJJ.Q0, 1144);
        this.LJIJ = c1476650oWt.LIZLLL(this.LJIJJ.Q0, 1197);
        this.LJIJI = c1476650oWt.LJ(this.LJIJJ.Q0, 1198);
        LiveLoggerService liveLoggerService = this.LJIJJ.LJIILLIIL;
        liveLoggerService.LLJJIJIL = this.LJIILL;
        liveLoggerService.LLJJJ = true;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("liveio updateLogInfo, PlayerDNSTimestamp: ");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", TcpConnectTimestamp: ");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", TcpFirstPacketTimestamp: ");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", RtmSendRequestTimestamp: ");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", RtmSignalConnectedTimestamp: ");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", HitCDNCache: ");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", CDNBackToSourceRequestTime: ");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", CDNBackToSourceToTalTime: ");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", RedirectTimestamp: ");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", mHttpNotFoundTime: ");
        sbLIZ.append(this.LJIIJ);
        sbLIZ.append(", mTaskDispatchCost: ");
        sbLIZ.append(this.LJIIJJI);
        sbLIZ.append(", RaceResult: ");
        sbLIZ.append(this.LJIIL);
        sbLIZ.append(", mFirstRaceResult: ");
        sbLIZ.append(this.LJIILIIL);
        sbLIZ.append(", RaceConnectCost: ");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(", RaceResultUrl: ");
        sbLIZ.append(this.LJIILJJIL);
        sbLIZ.append(", RaceResultIP: ");
        sbLIZ.append(this.LJIILL);
        sbLIZ.append(", RealIP: ");
        sbLIZ.append(this.LJIILLIIL);
        sbLIZ.append(", RedirectURL: ");
        sbLIZ.append(this.LJIIZILJ);
        C2188811AlT.LIZIZ(sbLIZ);
        C1698940uJQ.LIZ();
        VideoLiveManager videoLiveManager = this.LJIJJ;
        if (videoLiveManager.LLLLII) {
            if (videoLiveManager.LJIILLIIL == null) {
                C1698940uJQ.LJ();
                return;
            }
            if (TextUtils.isEmpty(videoLiveManager.Q0)) {
                return;
            }
            LiveLoggerService liveLoggerService2 = videoLiveManager.LJIILLIIL;
            synchronized (liveLoggerService2) {
                if (liveLoggerService2.LLLILZ) {
                    long j = liveLoggerService2.LLLIL;
                    if (j > 0) {
                        if (System.currentTimeMillis() - j < 1000) {
                            return;
                        }
                    }
                }
                try {
                    String str2 = videoLiveManager.Q0;
                    if (TextUtils.isEmpty(str2)) {
                        return;
                    }
                    String strLJ = c1476650oWt.LJ(str2, 1187);
                    if (TextUtils.isEmpty(strLJ)) {
                        return;
                    }
                    videoLiveManager.LLLF(strLJ);
                } catch (IllegalStateException e) {
                    TryCatchGuardChecker.doCheck(e);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("[DNS_Refactor] LiveIO state error. ");
                    sbLIZ2.append(e.getMessage());
                    C2188811AlT.LIZIZ(sbLIZ2);
                    C1698940uJQ.LIZIZ();
                } catch (SecurityException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("[DNS_Refactor] Security error fetching DNS info. ");
                    sbLIZ3.append(e2.getMessage());
                    C2188811AlT.LIZIZ(sbLIZ3);
                    C1698940uJQ.LIZIZ();
                } catch (Exception e3) {
                    TryCatchGuardChecker.doCheck(e3);
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("[DNS_Refactor] Unexpected error fetching DNS info. ");
                    sbLIZ4.append(e3.getMessage());
                    C2188811AlT.LIZIZ(sbLIZ4);
                    C1698940uJQ.LIZIZ();
                }
            }
        }
    }

    public final void LIZJ() {
    }

    public C1698630uIv(VideoLiveManager videoLiveManager) {
        this.LJIJJ = videoLiveManager;
    }
}
