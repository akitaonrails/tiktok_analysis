package Y;

import X.C1440005kM;
import X.C1B21;
import X.C1BJG;
import X.C1BLC;
import X.C1BLG;
import X.C1BLL;
import X.C1BLM;
import X.C1BLQ;
import X.C1C7U;
import X.C2193501At2;
import X.C2193521At4;
import X.C2193571At9;
import X.C2193641AtG;
import X.C2193801AtW;
import X.C2218121Bre;
import X.InterfaceC20279414Wq;
import X.InterfaceC2193631AtF;
import Y.ARunnableS103S0200000_34;
import android.content.Intent;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.aabplugin.core.base.view.DFInstallBlankActivity;
import com.ss.android.ugc.aweme.setting.services.IStorageService;
import com.ss.android.ugc.aweme.setting.services.StorageServiceImpl;
import com.ss.android.ugc.profile.business.user.creator.product.hybrid.activity.AuthTransitActivity;
import com.ss.android.vesdk.VEAudioCaptureSettings;
import com.tts.oecverify.BdTuring;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import kotlin.Unit;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes35.dex */
public class ACallableS257S0200000_34 implements Callable {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            case 2:
                return call$2(this);
            case 3:
                return call$3(this);
            case 4:
                return call$4(this);
            case 5:
                return call$5(this);
            case 6:
                return call$6(this);
            case 7:
                return call$7(this);
            case 8:
                return call$8(this);
            case BdTuring.TYPE_ECAF /* 9 */:
                return call$9(this);
            default:
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [X.1AtW] */
    /* JADX WARN: Type inference failed for: r9v0, types: [X.1At9, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Exception] */
    public static final Object call$0(ACallableS257S0200000_34 aCallableS257S0200000_34) {
        Boolean bool;
        String lowerCase;
        Integer numValueOf;
        String message;
        String string;
        C1C7U.LIZ("YoutubePresenter@d036.onActivityResult$1");
        C2193521At4 c2193521At4LIZIZ = C2193521At4.LIZIZ((Intent) aCallableS257S0200000_34.l0);
        if (c2193521At4LIZIZ == null) {
            ?? FromIntent = C2193571At9.fromIntent((Intent) aCallableS257S0200000_34.l0);
            String message2 = null;
            if (FromIntent != 0 && (message = FromIntent.getMessage()) != null && (string = a0.LJLIIIL(message).toString()) != null) {
                lowerCase = string.toLowerCase(Locale.ROOT);
            } else {
                lowerCase = null;
            }
            boolean zLJJIIZI = false;
            if (lowerCase != null) {
                zLJJIIZI = a0.LJJIIZI(lowerCase, "cancelled", false);
            }
            ?? r5 = (C2193801AtW) aCallableS257S0200000_34.l1;
            if (FromIntent != 0) {
                numValueOf = Integer.valueOf(FromIntent.code);
                message2 = FromIntent.getMessage();
            } else {
                numValueOf = null;
            }
            if (FromIntent == 0) {
                FromIntent = new Exception("AuthorizationResponse is null");
            }
            r5.LIZ(zLJJIIZI, numValueOf, message2, FromIntent, null, "redirect_and_get_token");
            bool = Boolean.TRUE;
        } else {
            C2193641AtG c2193641AtG = new C2193641AtG(((C2193801AtW) aCallableS257S0200000_34.l1).LL);
            C2193501At2 c2193501At2LIZ = c2193521At4LIZIZ.LIZ();
            final C2193801AtW c2193801AtW = (C2193801AtW) aCallableS257S0200000_34.l1;
            c2193641AtG.LIZJ(c2193501At2LIZ, new InterfaceC2193631AtF() { // from class: X.1AtO
                @Override // X.InterfaceC2193631AtF
                public final void LIZ(C2193491At1 c2193491At1, C2193571At9 c2193571At9) {
                    if (c2193571At9 != null) {
                        C2193801AtW.LIZIZ(c2193801AtW, c2193571At9, null, "redirect_and_get_token", null, 10);
                    } else if (c2193491At1 == null) {
                        C2193801AtW.LIZIZ(c2193801AtW, new Exception("Token exchange completed with null TokenResponse"), null, "redirect_and_get_token", null, 10);
                    } else {
                        C09UZ.LIZ(new ARunnableS103S0200000_34(c2193801AtW, c2193491At1, 1));
                    }
                }
            });
            bool = Boolean.TRUE;
        }
        C1C7U.LIZIZ("YoutubePresenter@d036.onActivityResult$1");
        return bool;
    }

    public static final Object call$1(ACallableS257S0200000_34 aCallableS257S0200000_34) {
        Boolean bool;
        String lowerCase;
        boolean zLJJIIZI;
        String str;
        String message;
        String string;
        C1C7U.LIZ("AuthTransitActivity@7912.handleYoutubeResult$1");
        C2193521At4 c2193521At4LIZIZ = C2193521At4.LIZIZ((Intent) aCallableS257S0200000_34.l0);
        if (c2193521At4LIZIZ == null) {
            C2193571At9 c2193571At9FromIntent = C2193571At9.fromIntent((Intent) aCallableS257S0200000_34.l0);
            if (c2193571At9FromIntent != null && (message = c2193571At9FromIntent.getMessage()) != null && (string = a0.LJLIIIL(message).toString()) != null) {
                lowerCase = string.toLowerCase(Locale.ROOT);
            } else {
                lowerCase = null;
            }
            String str2 = AuthTransitActivity._pnsPageId;
            int i = 0;
            if (lowerCase != null) {
                zLJJIIZI = a0.LJJIIZI(lowerCase, "cancelled", false);
            } else {
                zLJJIIZI = false;
            }
            AuthTransitActivity authTransitActivity = (AuthTransitActivity) aCallableS257S0200000_34.l1;
            if (zLJJIIZI) {
                i = -7;
            }
            if (zLJJIIZI) {
                str = "cancel";
            } else {
                str = "error";
            }
            C1B21 c1b21 = new C1B21(i, str, "AuthorizationResponse is null", null, null, null, null, null);
            authTransitActivity.getClass();
            C1440005kM.LIZ(c1b21);
            bool = Boolean.TRUE;
        } else {
            C2193641AtG c2193641AtG = new C2193641AtG((AuthTransitActivity) aCallableS257S0200000_34.l1);
            C2193501At2 c2193501At2LIZ = c2193521At4LIZIZ.LIZ();
            final AuthTransitActivity authTransitActivity2 = (AuthTransitActivity) aCallableS257S0200000_34.l1;
            c2193641AtG.LIZJ(c2193501At2LIZ, new InterfaceC2193631AtF() { // from class: X.1AtN
                @Override // X.InterfaceC2193631AtF
                public final void LIZ(C2193491At1 c2193491At1, C2193571At9 c2193571At9) {
                    if (c2193571At9 != null) {
                        AuthTransitActivity authTransitActivity3 = authTransitActivity2;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("exception in redirect_and_get_token ");
                        sbLIZ.append(c2193571At9.getMessage());
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        authTransitActivity3.getClass();
                        AuthTransitActivity.LLLLLZL(strLIZIZ);
                        return;
                    }
                    if (c2193491At1 == null) {
                        authTransitActivity2.getClass();
                        AuthTransitActivity.LLLLLZL("Token exchange completed with null TokenResponse");
                    } else {
                        C09UZ.LIZ(new ARunnableS103S0200000_34(authTransitActivity2, c2193491At1, 12));
                    }
                }
            });
            bool = Boolean.TRUE;
        }
        C1C7U.LIZIZ("AuthTransitActivity@7912.handleYoutubeResult$1");
        return bool;
    }

    public static final Object call$2(ACallableS257S0200000_34 aCallableS257S0200000_34) {
        C1BLL c1bll = (C1BLL) aCallableS257S0200000_34.l0;
        C1BLC c1blc = (C1BLC) aCallableS257S0200000_34.l1;
        c1bll.getClass();
        C1C7U.LIZ("DFDownloader@b801.download$1L");
        if (c1blc == null) {
            Boolean bool = Boolean.FALSE;
            C1C7U.LIZIZ("DFDownloader@b801.download$1L");
            return bool;
        }
        C1BLQ.LIZIZ(c1blc, 0, null);
        if (c1blc.LJIIIIZZ == 2) {
            Boolean boolValueOf = Boolean.valueOf(c1bll.LIZLLL(c1blc));
            C1C7U.LIZIZ("DFDownloader@b801.download$1L");
            return boolValueOf;
        }
        c1bll.LIZJ(c1blc, c1bll.LLILLJJLI);
        c1bll.LJIILJJIL();
        Boolean bool2 = Boolean.FALSE;
        C1C7U.LIZIZ("DFDownloader@b801.download$1L");
        return bool2;
    }

    public static final Object call$3(ACallableS257S0200000_34 aCallableS257S0200000_34) {
        C1C7U.LIZ("DynamicModuleStateListener@72c0.morpheusStateListener$1$1");
        ((C1BLG) aCallableS257S0200000_34.l0).LIZJ((C1BLM) aCallableS257S0200000_34.l1);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DynamicModuleStateListener@72c0.morpheusStateListener$1$1");
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.1BLJ] */
    public static final Object call$4(ACallableS257S0200000_34 aCallableS257S0200000_34) {
        C1C7U.LIZ("DFInstallBlankActivity@74da.goClearStorageAndRestartTask$1");
        final IStorageService iStorageServiceLIZLLL = StorageServiceImpl.LIZLLL();
        final C1BLC c1blc = (C1BLC) aCallableS257S0200000_34.l1;
        final DFInstallBlankActivity dFInstallBlankActivity = (DFInstallBlankActivity) aCallableS257S0200000_34.l0;
        iStorageServiceLIZLLL.LIZIZ(new InterfaceC20279414Wq() { // from class: X.1BLJ
            @Override // X.InterfaceC20279414Wq
            public final void LIZLLL() {
                if (C1BLK.LIZ(c1blc.LJIIJ)) {
                    C1BLL.LJ().LJI(c1blc);
                } else {
                    DFInstallBlankActivity dFInstallBlankActivity2 = dFInstallBlankActivity;
                    C1BLC c1blc2 = c1blc;
                    dFInstallBlankActivity2.getClass();
                    DFInstallBlankActivity.LLLLZI(c1blc2, false);
                }
                iStorageServiceLIZLLL.LIZJ(this);
            }
        });
        SmartRouter.buildRoute((DFInstallBlankActivity) aCallableS257S0200000_34.l0, "//setting/diskmanager_compose").open();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DFInstallBlankActivity@74da.goClearStorageAndRestartTask$1");
        return unit;
    }

    public static final Object call$5(ACallableS257S0200000_34 aCallableS257S0200000_34) {
        C2218121Bre c2218121Bre = (C2218121Bre) aCallableS257S0200000_34.l0;
        Cert cert = (Cert) aCallableS257S0200000_34.l1;
        c2218121Bre.getClass();
        C1C7U.LIZ("TEBufferedAudioCaptureRecorder@bec1.unInit$1L");
        c2218121Bre.LIZIZ.release(cert);
        C1C7U.LIZIZ("TEBufferedAudioCaptureRecorder@bec1.unInit$1L");
        return 0;
    }

    public static final Object call$6(ACallableS257S0200000_34 aCallableS257S0200000_34) {
        C2218121Bre c2218121Bre = (C2218121Bre) aCallableS257S0200000_34.l0;
        VEAudioCaptureSettings vEAudioCaptureSettings = (VEAudioCaptureSettings) aCallableS257S0200000_34.l1;
        c2218121Bre.getClass();
        C1C7U.LIZ("TEBufferedAudioCaptureRecorder@bec1.init$1L");
        Integer numValueOf = Integer.valueOf(c2218121Bre.LIZIZ.init(vEAudioCaptureSettings));
        C1C7U.LIZIZ("TEBufferedAudioCaptureRecorder@bec1.init$1L");
        return numValueOf;
    }

    public static final Object call$7(ACallableS257S0200000_34 aCallableS257S0200000_34) {
        C2218121Bre c2218121Bre = (C2218121Bre) aCallableS257S0200000_34.l0;
        Cert cert = (Cert) aCallableS257S0200000_34.l1;
        c2218121Bre.getClass();
        C1C7U.LIZ("TEBufferedAudioCaptureRecorder@bec1.stopRecording$1L");
        Integer numValueOf = Integer.valueOf(c2218121Bre.LIZIZ.stop(cert));
        C1C7U.LIZIZ("TEBufferedAudioCaptureRecorder@bec1.stopRecording$1L");
        return numValueOf;
    }

    public static final Object call$8(ACallableS257S0200000_34 aCallableS257S0200000_34) {
        C2218121Bre c2218121Bre = (C2218121Bre) aCallableS257S0200000_34.l0;
        Cert cert = (Cert) aCallableS257S0200000_34.l1;
        c2218121Bre.getClass();
        C1C7U.LIZ("TEBufferedAudioCaptureRecorder@bec1.startRecording$1L");
        Integer numValueOf = Integer.valueOf(c2218121Bre.LIZIZ.start(cert));
        C1C7U.LIZIZ("TEBufferedAudioCaptureRecorder@bec1.startRecording$1L");
        return numValueOf;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    public static final Object call$9(ACallableS257S0200000_34 aCallableS257S0200000_34) {
        C1BJG c1bjg = (C1BJG) aCallableS257S0200000_34.l0;
        Callable callable = (Callable) aCallableS257S0200000_34.l1;
        C1C7U.LIZ("LockOnGetVariable@33d.<init>$1L");
        try {
            c1bjg.LIZ = callable.call();
            CountDownLatch countDownLatch = c1bjg.LIZIZ;
            if (countDownLatch != null) {
                countDownLatch.countDown();
            }
            C1C7U.LIZIZ("LockOnGetVariable@33d.<init>$1L");
            return null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            CountDownLatch countDownLatch2 = c1bjg.LIZIZ;
            if (countDownLatch2 != null) {
                countDownLatch2.countDown();
            }
            throw th;
        }
    }

    public ACallableS257S0200000_34(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
