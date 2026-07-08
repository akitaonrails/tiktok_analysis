package X;

import Y.ARunnableS116S0100000_16;
import android.content.Context;
import android.os.PowerManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.MiniCardModel;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0cmM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public abstract class AbstractC1024960cmM {
    public String LIZ = "non_clicked";
    public String LIZIZ = "close";
    public InterfaceC1024990cmP LIZJ;
    public Context LIZLLL;
    public int LJ;

    public abstract boolean LJIIJJI(Context context, AwemeRawAd awemeRawAd, String str);

    public final AwemeRawAd LJII() {
        InterfaceC1025000cmQ interfaceC1025000cmQLIZ;
        InterfaceC1024990cmP interfaceC1024990cmP = this.LIZJ;
        if (interfaceC1024990cmP == null || (interfaceC1025000cmQLIZ = interfaceC1024990cmP.LIZ()) == null) {
            return null;
        }
        return interfaceC1025000cmQLIZ.LIZIZ();
    }

    public final void LJIIIZ() {
        InterfaceC1025030cmT interfaceC1025030cmTLIZIZ;
        InterfaceC1025000cmQ interfaceC1025000cmQLIZ;
        this.LJ++;
        AwemeRawAd awemeRawAdLJII = LJII();
        if (awemeRawAdLJII == null || C1017180cZo.LJIIJ(awemeRawAdLJII) != this.LJ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("registerVideoPlayComplete() videoPlayTimes = ");
            sbLIZ.append(this.LJ);
            sbLIZ.append(",limitTimes = ");
            AwemeRawAd awemeRawAdLJII2 = LJII();
            sbLIZ.append(awemeRawAdLJII2 != null ? Integer.valueOf(C1017180cZo.LJIIJ(awemeRawAdLJII2)) : null);
            sbLIZ.append(",condition don't match");
            C2188811AlT.LIZIZ(sbLIZ);
            return;
        }
        if (Intrinsics.LJFF(this.LIZIZ, "open")) {
            return;
        }
        Context context = this.LIZLLL;
        InterfaceC1024990cmP interfaceC1024990cmP = this.LIZJ;
        if (LJIIJJI(context, (interfaceC1024990cmP == null || (interfaceC1025000cmQLIZ = interfaceC1024990cmP.LIZ()) == null) ? null : interfaceC1025000cmQLIZ.LIZIZ(), "is_showed_after_video_completed")) {
            this.LIZIZ = "open";
            if (Intrinsics.LJFF(this.LIZ, "is_clicked")) {
                return;
            }
            this.LIZ = "is_clicked";
            InterfaceC1024990cmP interfaceC1024990cmP2 = this.LIZJ;
            if (interfaceC1024990cmP2 == null || (interfaceC1025030cmTLIZIZ = interfaceC1024990cmP2.LIZIZ()) == null) {
                return;
            }
            interfaceC1025030cmTLIZIZ.LIZ("auto_show_feedfinish");
        }
    }

    public final void LJIIJ(boolean z) {
        PowerManager powerManager;
        if (z && Intrinsics.LJFF(this.LIZIZ, "open")) {
            new Object() { // from class: X.0cmU
            }.getClass();
            try {
                Object objH2 = C786410Ut5.H2(C20642515q3.LIZ(), "power");
                if ((objH2 instanceof PowerManager) && (powerManager = (PowerManager) objH2) != null) {
                    if (powerManager.isScreenOn()) {
                        this.LIZIZ = "close";
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
    }

    public final void LJIIIIZZ(Context context, InterfaceC1024990cmP interfaceC1024990cmP) {
        MiniCardModel miniCardModel;
        InterfaceC1024990cmP interfaceC1024990cmP2;
        InterfaceC1025010cmR interfaceC1025010cmRLIZJ;
        int autoShowSecond;
        InterfaceC1024990cmP interfaceC1024990cmP3;
        InterfaceC1025010cmR interfaceC1025010cmRLIZJ2;
        MiniCardModel miniCardModel2;
        InterfaceC1025000cmQ interfaceC1025000cmQLIZ;
        Video videoLIZ;
        this.LIZ = "non_clicked";
        this.LIZIZ = "close";
        this.LJ = 0;
        this.LIZLLL = context;
        this.LIZJ = interfaceC1024990cmP;
        AwemeRawAd awemeRawAdLJII = LJII();
        if (awemeRawAdLJII != null && (miniCardModel = awemeRawAdLJII.getMiniCardModel()) != null && miniCardModel.getEnableAutoShow() && (interfaceC1024990cmP2 = this.LIZJ) != null && (interfaceC1025010cmRLIZJ = interfaceC1024990cmP2.LIZJ()) != null) {
            long videoLength = interfaceC1025010cmRLIZJ.getVideoLength();
            if (videoLength <= 0) {
                InterfaceC1024990cmP interfaceC1024990cmP4 = this.LIZJ;
                if (interfaceC1024990cmP4 != null && (interfaceC1025000cmQLIZ = interfaceC1024990cmP4.LIZ()) != null && (videoLIZ = interfaceC1025000cmQLIZ.LIZ()) != null) {
                    videoLength = videoLIZ.getVideoLength();
                } else {
                    return;
                }
            }
            AwemeRawAd awemeRawAdLJII2 = LJII();
            if (awemeRawAdLJII2 != null && (miniCardModel2 = awemeRawAdLJII2.getMiniCardModel()) != null) {
                autoShowSecond = miniCardModel2.getAutoShowSecond();
            } else {
                autoShowSecond = 0;
            }
            int i = autoShowSecond * LSPassThroughRecordSizeConfig.DEFAULT;
            if (i < videoLength && (interfaceC1024990cmP3 = this.LIZJ) != null && (interfaceC1025010cmRLIZJ2 = interfaceC1024990cmP3.LIZJ()) != null) {
                C988300bpE c988300bpE = new C988300bpE("GPMiniCardDisplay");
                c988300bpE.LIZIZ(videoLength);
                c988300bpE.LIZJ = i;
                c988300bpE.LIZLLL = new ARunnableS116S0100000_16(this, 10);
                c988300bpE.LJ = false;
                interfaceC1025010cmRLIZJ2.LIZ(c988300bpE.LIZ());
            }
        }
    }
}
