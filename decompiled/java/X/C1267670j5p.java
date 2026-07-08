package X;

import Y.ARunnableS120S0100000_20;
import Y.ARunnableS28S0400000_20;
import android.content.Context;
import android.content.Intent;
import android.media.projection.MediaProjection;
import android.media.projection.MediaProjectionManager;
import android.os.Bundle;
import android.os.Handler;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.ttlivestreamer.core.utils.AVLog;

/* JADX INFO: renamed from: X.0j5p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1267670j5p implements InterfaceC1266680j4E {
    public Context LL;
    public Intent LLILLJJLI;
    public final InterfaceC1267470j5V LLILLL;
    public Handler LLILZ;
    public MediaProjectionManager LLILZIL;
    public final C1267660j5o LLILZLL;
    public MediaProjection LLIZ;
    public C1270180j9s LLIZLLLIL;
    public C1270280jA2 LLJ;
    public boolean LLJI;

    @Override // X.InterfaceC1266680j4E
    public final void LIZLLL(C1267940j6G c1267940j6G) {
    }

    public final void LIZIZ() {
        MediaProjectionManager mediaProjectionManager;
        try {
            Cert certFindCert = CertProviderManagerKt.findCert("ttls_screen_video_record_start_record", 1476411393);
            Intent intent = this.LLILLJJLI;
            MediaProjection mediaProjectionLIZLLL = (intent == null || (mediaProjectionManager = this.LLILZIL) == null) ? null : C0TPX.LIZLLL(mediaProjectionManager, -1, intent, certFindCert);
            this.LLIZ = mediaProjectionLIZLLL;
            if (mediaProjectionLIZLLL != null) {
                mediaProjectionLIZLLL.registerCallback(this.LLILZLL, this.LLILZ);
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("createMediaProjection mediaProjection: ");
            sbLIZ.append(this.LLIZ);
            sbLIZ.append(" screenIntent: ");
            sbLIZ.append(this.LLILLJJLI);
            AVLog.logKibana(4, "ScreenCaptureManager", C2188811AlT.LIZIZ(sbLIZ), null);
            if (this.LLIZ != null || this.LLJI) {
                return;
            }
            InterfaceC1267470j5V interfaceC1267470j5V = this.LLILLL;
            if (interfaceC1267470j5V != null) {
                ((C1266850j4V) interfaceC1267470j5V).LIZ.LJI(-203, new Exception("mediaProjection is null, please check permission"));
            }
            this.LLJI = true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("MediaProjectionManager getMediaProjection fail(): ");
            sbLIZ2.append(e.getMessage());
            AVLog.logKibana(6, "ScreenCaptureManager", C2188811AlT.LIZIZ(sbLIZ2), e);
            if (this.LLJI) {
                return;
            }
            InterfaceC1267470j5V interfaceC1267470j5V2 = this.LLILLL;
            if (interfaceC1267470j5V2 != null) {
                ((C1266850j4V) interfaceC1267470j5V2).LIZ.LJI(-202, e);
            }
            this.LLJI = true;
        }
    }

    public final void LIZJ() {
        MediaProjection mediaProjection = this.LLIZ;
        if (mediaProjection != null) {
            mediaProjection.unregisterCallback(this.LLILZLL);
        }
        try {
            AVLog.logKibana(4, "ScreenCaptureManager", "releaseMediaProject " + this.LLIZ + ' ', null);
            MediaProjection mediaProjection2 = this.LLIZ;
            if (mediaProjection2 != null) {
                C2204961BRm.LJLJJL(mediaProjection2, new C0WZX("dzBzEhEpEd7IWV43QAGQdGXVEhh91RAp2lK4EDHBvFmo/rwPIuZwS1+MJa5o/vU2esQN04GcqykL9qVuzp0u", null));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            AVLog.logKibana(6, "ScreenCaptureManager", "MediaProjection stop exception: " + e.getMessage(), e);
        }
        this.LLIZ = null;
        this.LLJI = false;
    }

    @Override // X.InterfaceC1266680j4E
    public final void LIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("startVideoCapture ");
        sbLIZ.append(this.LLIZ);
        AVLog.logKibana(4, "ScreenCaptureManager", C2188811AlT.LIZIZ(sbLIZ), null);
        if (this.LLIZ == null) {
            LIZIZ();
        }
        C1270180j9s c1270180j9s = this.LLIZLLLIL;
        if (c1270180j9s != null) {
            c1270180j9s.LLJJJJ = this.LLIZ;
            Handler handler = c1270180j9s.LLILZ;
            if (handler != null) {
                C786410Ut5.LJJZZIII(handler, new ARunnableS120S0100000_20(c1270180j9s, 432));
            }
        }
    }

    @Override // X.InterfaceC1266680j4E
    public final void LJIILL() {
        Handler handler;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("stopVideoCapture ");
        sbLIZ.append(this.LLIZ);
        AVLog.logKibana(4, "ScreenCaptureManager", C2188811AlT.LIZIZ(sbLIZ), null);
        LIZJ();
        C1270180j9s c1270180j9s = this.LLIZLLLIL;
        if (c1270180j9s != null) {
            synchronized (c1270180j9s) {
                C1283100jUi.LIZIZ(c1270180j9s.LLILZ, new ARunnableS120S0100000_20(c1270180j9s, 416));
            }
        }
        C1270280jA2 c1270280jA2 = this.LLJ;
        if (c1270280jA2 == null || (handler = c1270280jA2.LJI) == null) {
            return;
        }
        C786410Ut5.LJJZZIII(handler, new ARunnableS120S0100000_20(c1270280jA2, 449));
    }

    @Override // X.InterfaceC1266680j4E
    public final void LJ(Bundle bundle, C777170UeB c777170UeB, InterfaceC1270140j9o interfaceC1270140j9o) {
        Handler handler;
        C1270180j9s c1270180j9s = this.LLIZLLLIL;
        if (c1270180j9s != null && interfaceC1270140j9o != null && bundle.getInt("mode", -1) == 2 && (handler = c1270180j9s.LLILZ) != null) {
            C786410Ut5.LJJZZIII(handler, new ARunnableS28S0400000_20(c1270180j9s, bundle, c777170UeB, interfaceC1270140j9o, 19));
        }
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [X.0j5o] */
    public C1267670j5p(C1267500j5Y c1267500j5Y, C1266350j3h c1266350j3h, Context context, Intent intent, InterfaceC1267470j5V interfaceC1267470j5V, C1269730j99 c1269730j99) {
        Handler handlerLIZ;
        Object objH2;
        C1269160j8E c1269160j8E;
        C1270180j9s c1270180j9s;
        this.LL = context;
        this.LLILLJJLI = intent;
        this.LLILLL = interfaceC1267470j5V;
        C1268700j7U c1268700j7U = (C1268700j7U) c1267500j5Y.LIZJ.getService(C1268700j7U.class);
        if (c1268700j7U != null) {
            handlerLIZ = c1268700j7U.LIZ();
        } else {
            handlerLIZ = null;
        }
        this.LLILZ = handlerLIZ;
        Context context2 = this.LL;
        if (context2 != null) {
            objH2 = C786410Ut5.H2(context2, "media_projection");
        } else {
            objH2 = null;
        }
        this.LLILZIL = (MediaProjectionManager) objH2;
        this.LLILZLL = new MediaProjection.Callback() { // from class: X.0j5o
            @Override // android.media.projection.MediaProjection.Callback
            public final void onStop() {
                InterfaceC1267470j5V interfaceC1267470j5V2 = this.LIZ.LLILLL;
                if (interfaceC1267470j5V2 != null) {
                    ((C1266850j4V) interfaceC1267470j5V2).LIZ.LJI(-201, new Exception("mediaProjection session is no longer valid"));
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onStop mediaProjection: ");
                sbLIZ.append(this.LIZ.LLIZ);
                AVLog.logKibana(4, "ScreenCaptureManager", C2188811AlT.LIZIZ(sbLIZ), null);
                C1270180j9s c1270180j9s2 = this.LIZ.LLIZLLLIL;
                if (c1270180j9s2 != null) {
                    synchronized (c1270180j9s2) {
                        C1283100jUi.LIZIZ(c1270180j9s2.LLILZ, new ARunnableS120S0100000_20(c1270180j9s2, 416));
                    }
                }
                MediaProjection mediaProjection = this.LIZ.LLIZ;
                if (mediaProjection != null) {
                    mediaProjection.unregisterCallback(this);
                }
            }
        };
        this.LLIZLLLIL = new C1270180j9s(c1267500j5Y, this.LLILZ, interfaceC1267470j5V, c1269730j99);
        this.LLJ = new C1270280jA2(c1267500j5Y);
        if (c1266350j3h != null && (c1269160j8E = c1266350j3h.LLILZLL) != null && (c1270180j9s = this.LLIZLLLIL) != null) {
            int iLJJIIZI = c1269160j8E.LJJIIZI();
            int iLJJIIJ = c1269160j8E.LJJIIJ();
            int iLJJIII = c1269160j8E.LJJIII();
            c1270180j9s.LLJJ = iLJJIIZI;
            c1270180j9s.LLJJI = iLJJIIJ;
            c1270180j9s.LLJJIII = iLJJIII;
            c1270180j9s.LLJILJILJ = LSPassThroughRecordSizeConfig.DEFAULT / iLJJIII;
            c1270180j9s.LLJJIJIIJIL = false;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setVideoCaptureParams width: ");
            sbLIZ.append(iLJJIIZI);
            sbLIZ.append(" height: ");
            sbLIZ.append(iLJJIIJ);
            sbLIZ.append(" fps: ");
            sbLIZ.append(iLJJIII);
            AVLog.logKibana(4, "ScreenVideoNode", C2188811AlT.LIZIZ(sbLIZ), null);
        }
    }
}
