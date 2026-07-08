package X;

import Y.ARunnableS116S0100000_16;
import Y.ARunnableS24S0400000_16;
import Y.ARunnableS42S0300000_9;
import android.app.Activity;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.ugc.aweme.commercialize.search.service.ISearchAdMainService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.vast.model.AdVerification;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.commercialize.measurement.IMeasurementService;
import com.ss.android.ugc.aweme.commercialize.model.OmVast;
import com.ss.android.ugc.aweme.detail.ui.DetailActivity;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.ref.WeakReference;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0dJE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1045340dJE implements InterfaceC582830MtV {
    public static volatile C1045340dJE LJJIFFI;
    public final C583560Mug LJI;
    public boolean LJII;
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;
    public InterfaceC1045590dJd LJIJJ;
    public final Map<String, C1045770dJv> LIZ = Collections.synchronizedMap(new HashMap());
    public final Map<String, C1045570dJb> LIZIZ = Collections.synchronizedMap(new HashMap());
    public final Map<String, AbstractC1045430dJN> LIZJ = Collections.synchronizedMap(new HashMap());
    public final Map<String, AbstractC1045600dJe> LIZLLL = Collections.synchronizedMap(new HashMap());
    public final Map<String, String> LJ = Collections.synchronizedMap(new HashMap());
    public final Map<String, C0N4L> LJFF = Collections.synchronizedMap(new HashMap());
    public int LJIIJ = 0;
    public final BPEAHandler LJIIJJI = new BPEAHandler(Looper.getMainLooper());
    public boolean LJIIL = false;
    public boolean LJIILIIL = false;
    public boolean LJIILJJIL = false;
    public boolean LJIILL = false;
    public boolean LJIILLIIL = true;
    public long LJIIZILJ = -1;
    public WeakReference<View> LJIJ = null;
    public Aweme LJIJI = null;
    public final BPEAHandler LJIJJLI = new BPEAHandler(Looper.getMainLooper());
    public long LJIL = -1;
    public long LJJ = -1;
    public final RunnableC989090bqV LJJI = new Runnable() { // from class: X.0bqV
        public final void LIZ() {
            long jLJI = this.LL.LJI();
            long jLJIIIIZZ = this.LL.LJIIIIZZ();
            if (jLJIIIIZZ != 0) {
                C1045340dJE c1045340dJE = this.LL;
                if (c1045340dJE.LJIJJ != null) {
                    c1045340dJE.LIZ(jLJI, jLJIIIIZZ);
                    C786410Ut5.LJLIIL(C1045340dJE.LJIIJ().longValue(), this.LL.LJIJJLI, this);
                }
            } else {
                C786410Ut5.LJLIIL(C1045340dJE.LJIIJ().longValue(), this.LL.LJIJJLI, this);
            }
            if (jLJI > 0) {
                this.LL.LJJ = jLJI;
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean zLIZ;
            C1C7U.LIZ("AdOmSdkManager@a4ef.<field>$1");
            try {
                LIZ();
            } finally {
                if (!zLIZ) {
                }
            }
            C1C7U.LIZIZ("AdOmSdkManager@a4ef.<field>$1");
        }
    };

    public static InterfaceC585680My6 LJIILLIIL() {
        IMeasurementService iMeasurementService;
        if (!C293490Bet.LIZIZ || (iMeasurementService = (IMeasurementService) PluggableExtentionKt.pluggableSpi(IMeasurementService.class)) == null) {
            return null;
        }
        return iMeasurementService.LIZLLL();
    }

    public static C1045340dJE LJIJI() {
        if (LJJIFFI == null) {
            synchronized (C1045340dJE.class) {
                try {
                    if (LJJIFFI == null) {
                        LJJIFFI = new C1045340dJE();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LJJIFFI;
    }

    public final View LIZLLL() {
        WeakReference<View> weakReference = this.LJIJ;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [X.0bqV] */
    public C1045340dJE() throws Exception {
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        C583560Mug c583560Mug = new C583560Mug(contextLIZ);
        this.LJI = c583560Mug;
        c583560Mug.LIZJ = new C1046310dKn(c583560Mug);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.media.VOLUME_CHANGED_ACTION");
        intentFilter.addAction("android.media.STREAM_MUTE_CHANGED_ACTION");
        C786410Ut5.LJIJJ(contextLIZ, c583560Mug.LIZJ, intentFilter);
    }

    public static Long LJIIJ() {
        return Long.valueOf(C306380Bzg.LIZ() > 0 ? C306380Bzg.LIZ() : 200L);
    }

    public final long LJI() {
        C0RHF c0rhfLIZ = C581940Ms4.LIZ();
        InterfaceC582390Msn interfaceC582390MsnLIZ = C581740Mrk.LIZ();
        return (!this.LJIILIIL || c0rhfLIZ == null) ? (!this.LJIIL || interfaceC582390MsnLIZ == null) ? C1483410ohn.LJLJJI().getCurrentPosition() : interfaceC582390MsnLIZ.getCurrentPosition() : c0rhfLIZ.getCurrentPosition();
    }

    public final long LJIIIIZZ() {
        C0RHF c0rhfLIZ = C581940Ms4.LIZ();
        InterfaceC582390Msn interfaceC582390MsnLIZ = C581740Mrk.LIZ();
        return (!this.LJIILIIL || c0rhfLIZ == null) ? (!this.LJIIL || interfaceC582390MsnLIZ == null) ? C1483410ohn.LJLJJI().getDuration() : interfaceC582390MsnLIZ.getDuration() : c0rhfLIZ.getDuration();
    }

    public static String LJ(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        Map<String, String> searchAdExtraParams;
        if (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || (searchAdExtraParams = awemeRawAd.getSearchAdExtraParams()) == null || searchAdExtraParams.isEmpty()) {
            return null;
        }
        return searchAdExtraParams.get("bsh_card_area");
    }

    public static String LJFF(Aweme aweme) {
        if (aweme != null && aweme.getAwemeRawAd() != null && aweme.getAwemeRawAd().getOmVast() != null) {
            int i = aweme.getAwemeRawAd().getOmVast().creative_type;
            if (i == 3) {
                return "display";
            }
            if (i == 4) {
                return "video";
            }
            return "";
        }
        return "";
    }

    public static String LJIIIZ(Aweme aweme) {
        if (C1045220dJ2.LJII(aweme)) {
            return "1";
        }
        return CardStruct.IStatusCode.DEFAULT;
    }

    public static String LJIILIIL(Aweme aweme) {
        if (aweme != null && aweme.getAwemeRawAd() != null && aweme.getAwemeRawAd().getOmVast() != null) {
            int i = aweme.getAwemeRawAd().getOmVast().providerType;
            if (i == 2) {
                return "local";
            }
            if (i == 3) {
                return "dsp";
            }
            return "unknown";
        }
        return "unknown";
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static float LJIILL(android.content.Context r3) {
        /*
            android.content.Context r1 = X.C786410Ut5.N3(r3)
            java.lang.String r0 = "audio"
            java.lang.Object r3 = X.C786410Ut5.H2(r1, r0)
            android.media.AudioManager r3 = (android.media.AudioManager) r3
            r1 = 3
            r2 = -1
            if (r3 == 0) goto L15
            int r0 = r3.getStreamVolume(r1)     // Catch: java.lang.Exception -> L17
            goto L21
        L15:
            r1 = 0
            goto L2c
        L17:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.C1AF0.LJ(r0)
            r0 = -1
            if (r3 == 0) goto L25
        L21:
            int r2 = X.C786410Ut5.Z3(r3, r1)
        L25:
            if (r0 <= 0) goto L15
            if (r2 <= 0) goto L15
            float r1 = (float) r0
            float r0 = (float) r2
            float r1 = r1 / r0
        L2c:
            r0 = 1148846080(0x447a0000, float:1000.0)
            float r1 = r1 * r0
            int r0 = (int) r1
            float r1 = (float) r0
            r0 = 981668463(0x3a83126f, float:0.001)
            float r1 = r1 * r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1045340dJE.LJIILL(android.content.Context):float");
    }

    public static String LJIIZILJ(Aweme aweme) {
        Video video;
        VideoUrlModel playAddr;
        if (aweme == null || (video = aweme.getVideo()) == null || (playAddr = video.getPlayAddr()) == null) {
            return null;
        }
        return playAddr.getOriginUri();
    }

    public static List LJIJ(Aweme aweme) {
        String str;
        String str2;
        List<AdVerification> list;
        ArrayList arrayList = new ArrayList();
        String str3 = "";
        if (!C1045370dJH.LIZIZ(aweme)) {
            str = "";
        } else {
            str = C1045220dJ2.LIZLLL(aweme).javascriptResource;
        }
        if (!C1045370dJH.LIZIZ(aweme)) {
            str2 = "";
        } else {
            str2 = C1045220dJ2.LIZLLL(aweme).vender;
        }
        if (C1045370dJH.LIZIZ(aweme)) {
            str3 = C1045220dJ2.LIZLLL(aweme).verificationParameters;
        }
        C1045900dK8 c1045900dK8LIZIZ = LIZIZ(str, str2, str3);
        if (c1045900dK8LIZIZ != null) {
            arrayList.add(c1045900dK8LIZIZ);
        }
        if (aweme.getAwemeRawAd() != null && aweme.getAwemeRawAd().getOmVast() != null && (list = aweme.getAwemeRawAd().getOmVast().extraAdVerificationList) != null) {
            for (AdVerification adVerification : list) {
                C1045900dK8 c1045900dK8LIZIZ2 = LIZIZ(adVerification.javascriptResource, adVerification.vender, adVerification.verificationParameters);
                if (c1045900dK8LIZIZ2 != null) {
                    arrayList.add(c1045900dK8LIZIZ2);
                }
            }
        }
        return arrayList;
    }

    public static void LJJ(Aweme aweme) {
        if (C1045220dJ2.LJIIIZ(aweme) && C1019620cdk.LIZIZ(3, aweme)) {
            C1045220dJ2.LJIILLIIL(aweme, "start", "play");
        }
    }

    public static boolean LJJIJIL(Aweme aweme) {
        if (!((Boolean) C135200fO.LIZ.getValue()).booleanValue()) {
            return false;
        }
        return C1045220dJ2.LJII(aweme);
    }

    public final void LJJIJ(Aweme aweme) {
        C0N4L c0n4l;
        this.LJIIJ = 0;
        this.LJIJJ = null;
        this.LJI.LIZLLL = null;
        C1045380dJI.LIZ("sessionFinish");
        String strLIZLLL = C1045370dJH.LIZLLL(aweme);
        if (C294490BgV.LIZ() && (c0n4l = this.LJFF.get(strLIZLLL)) != null && !c0n4l.LJ.contains("omsdk_finish")) {
            LIZJ(c0n4l, aweme, "reset_state");
        }
        AbstractC1045430dJN abstractC1045430dJN = this.LIZJ.get(strLIZLLL);
        LJIJJ(aweme, strLIZLLL);
        AbstractC1045600dJe abstractC1045600dJe = this.LIZLLL.get(strLIZLLL);
        if (abstractC1045600dJe != null) {
            abstractC1045600dJe.LIZIZ();
        }
        LJJIIJ(C1045370dJH.LIZLLL(aweme), abstractC1045430dJN);
        this.LJIJJLI.removeCallbacks(this.LJJI);
        AwemeExtKt.getAwemeRawAdIdStr(aweme);
        this.LJII = false;
        this.LJIIIIZZ = false;
        this.LJIIIZ = false;
        this.LJIILJJIL = false;
        this.LJIILL = false;
    }

    public final void LJJIJIIJIL(EnumC1045470dJR enumC1045470dJR) {
        int i = C1045450dJP.LIZ[enumC1045470dJR.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    this.LJIIIZ = true;
                    return;
                }
                return;
            }
            this.LJIIIIZZ = true;
            return;
        }
        this.LJII = true;
    }

    public final void LJJIL(Aweme aweme) {
        this.LJIILIIL = C1017070cZd.LJLJLJ(aweme);
        this.LJIIL = C1017070cZd.LLIIIZ(aweme);
        C1045380dJI.LIZ = aweme;
        this.LJIJJLI.removeCallbacks(this.LJJI);
        C786410Ut5.LJLIIL(LJIIJ().longValue(), this.LJIJJLI, this.LJJI);
    }

    public static void LJIJJLI(Aweme aweme, String str) {
        String desc;
        if (!C1045220dJ2.LJIIIIZZ(aweme)) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(": aweme= ");
        if (aweme != null) {
            desc = aweme.getDesc();
        } else {
            desc = "null";
        }
        sbLIZ.append(desc);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void LIZ(long j, long j2) {
        long j3 = this.LJIL;
        if (j != j3 && j2 != 0) {
            InterfaceC1045590dJd interfaceC1045590dJd = this.LJIJJ;
            if (interfaceC1045590dJd != null) {
                float f = j2;
                float f2 = j / f;
                float f3 = j3 / f;
                if (f2 >= 0.25f && f3 < 0.25f && f3 > 0.0f) {
                    interfaceC1045590dJd.LIZ(j);
                }
                if (f2 >= 0.5f && f3 < 0.5f && f3 > 0.0f) {
                    this.LJIJJ.LIZJ(j);
                }
                if (f2 >= 0.75f && f3 < 0.75f && f3 > 0.0f) {
                    this.LJIJJ.LIZIZ(j);
                }
                this.LJIJJ.LIZLLL(this.LJIL, j, j2);
            }
            this.LJIL = j;
        }
    }

    public final AbstractC1045430dJN LJIIL(Context context, Aweme aweme) {
        EnumC1045420dJM enumC1045420dJM;
        EnumC1045410dJL enumC1045410dJL;
        InterfaceC585680My6 interfaceC585680My6LJIILLIIL;
        if (aweme == null) {
            return null;
        }
        if ((C293490Bet.LIZIZ && (interfaceC585680My6LJIILLIIL = LJIILLIIL()) != null && interfaceC585680My6LJIILLIIL.LJIILL(aweme)) || !C1045220dJ2.LJIIIIZZ(aweme) || (C1010120cOQ.LJIJI(aweme) && !C1010120cOQ.LJJIIJZLJL(aweme))) {
            return null;
        }
        String strLIZLLL = C1045370dJH.LIZLLL(aweme);
        if (this.LIZJ.get(strLIZLLL) != null) {
            return this.LIZJ.get(strLIZLLL);
        }
        C2344809Gs.LJ("ensureOmidActivition");
        C1046020dKK c1046020dKK = C1BUQ.LIZ;
        if (!c1046020dKK.LIZ) {
            C1BUQ.LIZ(context);
            if (c1046020dKK.LIZ) {
                C1BUU.LJFF.LIZ();
            } else {
                throw new IllegalStateException("Method called before OM SDK activation");
            }
        }
        if (C1045850dK3.LIZ(aweme)) {
            C1045950dKD c1045950dKD = C1045940dKC.LIZ;
            if (!c1045950dKD.LIZ) {
                Context contextN3 = C786410Ut5.N3(context);
                if (contextN3 != null) {
                    if (!c1045950dKD.LIZ) {
                        c1045950dKD.LIZ = true;
                        C1045820dK0 c1045820dK0 = C1045820dK0.LIZLLL;
                        c1045820dK0.getClass();
                        c1045820dK0.LIZJ = new WeakReference<>(contextN3);
                        C1045550dJZ.LJ.LIZ = new WeakReference<>(contextN3);
                    }
                } else {
                    throw new IllegalArgumentException("application context cannot be null");
                }
            }
        }
        if (!c1046020dKK.LIZ) {
            return null;
        }
        try {
            C1045220dJ2.LJIJI(aweme);
            C844470XAv.LIZ.getClass();
            String strLJFF = C844470XAv.LJFF();
            C1045780dJw.LIZIZ("Bytedance", "Name is null or empty");
            C1045780dJw.LIZIZ(strLJFF, "Version is null or empty");
            C1046930dLn c1046930dLnLIZ = C1046930dLn.LIZ(new C1045960dKE(strLJFF), C08EM.LIZ(C844470XAv.LIZ()), LJIJ(aweme), this.LJ.get(strLIZLLL));
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd.getOmVast() == null) {
                enumC1045420dJM = EnumC1045420dJM.VIDEO;
            } else {
                int i = awemeRawAd.getOmVast().creative_type;
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i == 4 || i != 5) {
                                enumC1045420dJM = EnumC1045420dJM.VIDEO;
                            } else {
                                enumC1045420dJM = EnumC1045420dJM.AUDIO;
                            }
                        } else {
                            enumC1045420dJM = EnumC1045420dJM.NATIVE_DISPLAY;
                        }
                    } else {
                        enumC1045420dJM = EnumC1045420dJM.HTML_DISPLAY;
                    }
                } else {
                    enumC1045420dJM = EnumC1045420dJM.DEFINED_BY_JAVASCRIPT;
                }
            }
            AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
            if (awemeRawAd2.getOmVast() == null) {
                enumC1045410dJL = EnumC1045410dJL.BEGIN_TO_RENDER;
            } else {
                switch (awemeRawAd2.getOmVast().impression_type) {
                    case 1:
                        enumC1045410dJL = EnumC1045410dJL.DEFINED_BY_JAVASCRIPT;
                        break;
                    case 2:
                        enumC1045410dJL = EnumC1045410dJL.UNSPECIFIED;
                        break;
                    case 3:
                        enumC1045410dJL = EnumC1045410dJL.LOADED;
                        break;
                    case 4:
                        enumC1045410dJL = EnumC1045410dJL.BEGIN_TO_RENDER;
                        break;
                    case 5:
                        enumC1045410dJL = EnumC1045410dJL.ONE_PIXEL;
                        break;
                    case 6:
                        enumC1045410dJL = EnumC1045410dJL.VIEWABLE;
                        break;
                    case 7:
                        enumC1045410dJL = EnumC1045410dJL.AUDIBLE;
                        break;
                    case 8:
                        enumC1045410dJL = EnumC1045410dJL.OTHER;
                        break;
                    default:
                        enumC1045410dJL = EnumC1045410dJL.BEGIN_TO_RENDER;
                        break;
                }
            }
            EnumC1046030dKL enumC1046030dKL = EnumC1046030dKL.NATIVE;
            C1BUP c1bupLIZIZ = AbstractC1045430dJN.LIZIZ(C1045760dJu.LIZ(enumC1045420dJM, enumC1045410dJL, enumC1046030dKL, enumC1046030dKL), c1046930dLnLIZ);
            CopyOnWriteArrayList<Runnable> copyOnWriteArrayList = C794240VDq.LIZ;
            C793770VBv.LJIIJJI("OmAdSessionMonitor", 1, null);
            this.LIZJ.put(strLIZLLL, c1bupLIZIZ);
            return c1bupLIZIZ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("create ad session failed");
            sbLIZ.append(th);
            C2344809Gs.LJ(C2188811AlT.LIZIZ(sbLIZ));
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("exception_message", th.getMessage());
                StringWriter stringWriter = new StringWriter();
                th.printStackTrace(new PrintWriter(stringWriter));
                jSONObject.put("exception_stack", stringWriter.toString());
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                C1AF0.LJ(e);
            }
            CopyOnWriteArrayList<Runnable> copyOnWriteArrayList2 = C794240VDq.LIZ;
            C793770VBv.LJIIJJI("OmAdSessionMonitor", 0, jSONObject);
            return null;
        }
    }

    public final int LJIILJJIL(C1022820ciu c1022820ciu, Aweme aweme) {
        int i;
        int iLIZ;
        if (aweme == null) {
            i = this.LJIIJ;
        } else {
            if (((ISearchAdMainService) ServiceManager.get().getService(ISearchAdMainService.class)).LJIIIIZZ().LJIIIIZZ()) {
                iLIZ = C1012040cRW.LIZIZ().LJ;
            } else if (C583160Mu2.LIZIZ(aweme)) {
                c1022820ciu.LIZIZ(Integer.valueOf(C583160Mu2.LIZIZ), "story_video_type");
                iLIZ = C583160Mu2.LIZ();
            } else {
                i = this.LJIIJ;
            }
            return iLIZ + 1;
        }
        return i + 1;
    }

    public final void LJIJJ(Aweme aweme, String str) {
        int iLIZ = C2540709xV.LIZ();
        AbstractC1045430dJN abstractC1045430dJN = this.LIZJ.get(str);
        if (iLIZ > 0 && abstractC1045430dJN != null) {
            if (!this.LJIILL) {
                LJIJJLI(aweme, "triggerSkipped");
                LJJIJL(null, null, aweme);
            }
            C786410Ut5.LJLIIL(iLIZ * LSPassThroughRecordSizeConfig.DEFAULT, this.LJIIJJI, new ARunnableS24S0400000_16(this, aweme, abstractC1045430dJN, this.LJFF.get(str), 6));
        }
    }

    public final void LJJIIJ(String str, AbstractC1045430dJN abstractC1045430dJN) {
        this.LIZJ.remove(str);
        this.LIZ.remove(str);
        this.LIZLLL.remove(str);
        this.LIZIZ.remove(str);
        this.LJ.remove(str);
        this.LJFF.remove(str);
        C786410Ut5.LJLIIL(2000L, this.LJIIJJI, new ARunnableS116S0100000_16(new AbstractC1045430dJN[]{abstractC1045430dJN}, 223));
    }

    public final void LJJIIJZLJL(Context context, Aweme aweme) {
        if (aweme == null) {
            return;
        }
        C2344809Gs.LJ("AdOM playerMute ");
        C1045220dJ2.LJIILLIIL(aweme, "mute", null);
        C1019030ccn.LJJI(context, aweme, this.LJIIJ + 1);
        C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "mute", aweme.getAwemeRawAd());
        c1022820ciuLIZLLL.LIZIZ(Integer.valueOf(LJIILJJIL(c1022820ciuLIZLLL, aweme)), "play_order");
        c1022820ciuLIZLLL.LIZIZ(Float.valueOf(0.0f), "playervol");
        c1022820ciuLIZLLL.LJIIIIZZ();
    }

    public final void LJJIIZ(Context context, Aweme aweme) {
        if (aweme == null) {
            return;
        }
        C1045220dJ2.LJIILLIIL(aweme, "unmute", null);
        C1051600dTK.LIZJ(new ARunnableS42S0300000_9(this, context, aweme, 23));
        C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "unmute", aweme.getAwemeRawAd());
        c1022820ciuLIZLLL.LIZIZ(Integer.valueOf(LJIILJJIL(c1022820ciuLIZLLL, aweme)), "play_order");
        c1022820ciuLIZLLL.LIZIZ(Float.valueOf(LJIILL(context)), "playervol");
        c1022820ciuLIZLLL.LJIIIIZZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIJIIJI(android.view.View r2, com.ss.android.ugc.aweme.feed.model.Aweme r3) {
        /*
            r1 = this;
            java.lang.String r0 = "setAdViewAndAweme RenderPlay"
            LJIJJLI(r3, r0)
            boolean r0 = X.C293490Bet.LIZIZ
            if (r0 == 0) goto L18
            X.0My6 r0 = LJIILLIIL()
            if (r0 == 0) goto L18
            if (r3 == 0) goto L2a
            boolean r0 = r0.LJIILL(r3)
            if (r0 == 0) goto L1a
            return
        L18:
            if (r3 == 0) goto L2a
        L1a:
            boolean r0 = X.C1045220dJ2.LJIIIIZZ(r3)
            if (r0 == 0) goto L2a
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            r1.LJIJ = r0
            r1.LJIJI = r3
            return
        L2a:
            r0 = 0
            r1.LJIJ = r0
            r1.LJIJI = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1045340dJE.LJJIJIIJI(android.view.View, com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    public final void LJJJIL(Context context, Aweme aweme) {
        boolean z;
        AwemeRawAd awemeRawAd;
        OmVast omVast;
        C1045270dJ7 c1045270dJ7;
        Set<String> set;
        if (this.LJIIJ == 0 && C1045220dJ2.LJIIIZ(aweme)) {
            if (aweme != null && AwemeExtKt.isAdTraffic(aweme)) {
                z = true;
            } else {
                z = false;
            }
            if (z && C1019620cdk.LIZIZ(3, aweme) && (awemeRawAd = aweme.getAwemeRawAd()) != null && (omVast = awemeRawAd.getOmVast()) != null && (c1045270dJ7 = omVast.vast) != null && (set = c1045270dJ7.viewableSet) != null) {
                C1045220dJ2.LJIILL(new C1939607ik(set), new C1045290dJ9("viewable", aweme));
            }
            C1019030ccn.LJJJJ(context, "viewable", aweme, C1019030ccn.LJIIJJI(context, aweme, false, C1019030ccn.LJ(this.LJIIJ + 1)));
            C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "viewable", aweme.getAwemeRawAd());
            c1022820ciuLIZLLL.LIZIZ(Integer.valueOf(this.LJIIJ + 1), "play_order");
            c1022820ciuLIZLLL.LJIIIIZZ();
        }
    }

    public static C1045900dK8 LIZIZ(String str, String str2, String str3) {
        try {
            URL url = new URL(str);
            if (TextUtils.isEmpty(str3)) {
                str3 = "placementId=1&placementName=test";
            }
            String strValueOf = String.valueOf(System.currentTimeMillis());
            String strLJJIIZI = LJJIIZI(LJJIIZI(str3, "{TS}", strValueOf), "__TS__", strValueOf);
            String str4 = C1019270cdB.LIZ;
            return C1045900dK8.LIZ(str2, url, LJJIIZI(strLJJIIZI, "__MRC_IMPRESSION_ID__", C1019270cdB.LIZIZ(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId())));
        } catch (MalformedURLException e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
            return null;
        }
    }

    public static void LIZJ(C0N4L c0n4l, Aweme aweme, String str) {
        AwemeRawAd awemeRawAd;
        if (!C294490BgV.LIZ() || c0n4l == null || c0n4l.LJ.contains("omsdk_finish")) {
            return;
        }
        String strLIZ = C1046770dLX.LIZ(c0n4l.LJ);
        String strLIZIZ = C1046770dLX.LIZIZ(c0n4l.LJ);
        String str2 = c0n4l.LIZLLL;
        c0n4l.LJ.add("omsdk_finish");
        c0n4l.LIZLLL = "omsdk_finish";
        C588660N6y c588660N6y = new C588660N6y("android_old_feed", c0n4l.LIZ, c0n4l.LIZIZ, c0n4l.LIZJ, LJIIIZ(aweme));
        if (aweme != null) {
            awemeRawAd = aweme.getAwemeRawAd();
        } else {
            awemeRawAd = null;
        }
        C1046770dLX.LJ(c588660N6y, awemeRawAd, strLIZ, str2, strLIZIZ, str);
    }

    public static String LJJIIZI(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3) && str.contains(str2)) {
            return str.replace(str2, str3);
        }
        return str;
    }

    public final C1045570dJb LJII(Context context, View view, final Aweme aweme) {
        AbstractC1045600dJe c1045610dJf;
        View viewFindViewById;
        C1045570dJb c1045570dJbLIZ = null;
        if (!C1045850dK3.LIZ(aweme)) {
            return null;
        }
        String strLIZLLL = C1045370dJH.LIZLLL(aweme);
        C1045570dJb c1045570dJb = this.LIZIZ.get(strLIZLLL);
        if (c1045570dJb == null) {
            LJIJJLI(aweme, "createCustomMediaEvent");
            if (C1045850dK3.LIZ(aweme)) {
                String strLIZLLL2 = C1045370dJH.LIZLLL(aweme);
                if (this.LIZLLL.get(strLIZLLL2) != null) {
                    c1045610dJf = this.LIZLLL.get(strLIZLLL2);
                    if (c1045610dJf != null) {
                    }
                } else {
                    InterfaceC1046010dKJ interfaceC1046010dKJ = new InterfaceC1046010dKJ() { // from class: X.0dJO
                        @Override // X.InterfaceC1046010dKJ
                        public final void LIZ() {
                            Aweme aweme2 = aweme;
                            if (aweme2 == null || aweme2.getAwemeRawAd() == null) {
                                return;
                            }
                            C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "viewable_2s", aweme2.getAwemeRawAd());
                            c1022820ciuLIZLLL.LIZIZ(1, "is_piv");
                            c1022820ciuLIZLLL.LJII();
                        }
                    };
                    if (C1045940dKC.LIZ.LIZ) {
                        c1045610dJf = new C1045610dJf(interfaceC1046010dKJ);
                        this.LIZLLL.put(strLIZLLL2, c1045610dJf);
                    } else {
                        throw new IllegalStateException("ViewabilitySDKManager has to be active");
                    }
                }
                if (view != null) {
                    c1045570dJbLIZ = C1045570dJb.LIZ(c1045610dJf);
                    c1045610dJf.LIZJ(view);
                    Activity activityLIZ = C06MM.LIZ(context);
                    if (activityLIZ != null) {
                        View rootView = view.getRootView();
                        int iLJIIIIZZ = C12ES.LJIIIIZZ(activityLIZ);
                        int iLJIIJ = C12ES.LJIIJ(activityLIZ);
                        ArrayList arrayList = (ArrayList) C1045370dJH.LIZJ(iLJIIIIZZ, iLJIIJ, rootView);
                        arrayList.remove(view);
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            c1045610dJf.LIZ((View) it2.next());
                        }
                        if (activityLIZ instanceof DetailActivity) {
                            View viewFindViewById2 = activityLIZ.findViewById(R.id.j2f);
                            if (viewFindViewById2 != null) {
                                viewFindViewById = viewFindViewById2.findViewById(R.id.trr);
                            }
                        } else {
                            viewFindViewById = activityLIZ.findViewById(R.id.trr);
                        }
                        if (viewFindViewById != null) {
                            Iterator it3 = ((ArrayList) C1045370dJH.LIZJ(iLJIIIIZZ, iLJIIJ, viewFindViewById)).iterator();
                            while (it3.hasNext()) {
                                c1045610dJf.LJ((View) it3.next());
                            }
                        }
                    }
                    c1045610dJf.LJFF();
                    if (c1045570dJbLIZ != null) {
                        this.LIZIZ.put(strLIZLLL, c1045570dJbLIZ);
                        return c1045570dJbLIZ;
                    }
                }
            }
            return c1045570dJbLIZ;
        }
        return c1045570dJb;
    }

    public final C1045770dJv LJIIJJI(Context context, View view, Aweme aweme) {
        AbstractC1045430dJN abstractC1045430dJNLJIIL;
        View viewFindViewById;
        String strLIZLLL = C1045370dJH.LIZLLL(aweme);
        C1045770dJv c1045770dJv = this.LIZ.get(strLIZLLL);
        if (c1045770dJv == null) {
            LJIJJLI(aweme, "createMediaEvent");
            c1045770dJv = null;
            if (this.LJIILLIIL && ((!C1010120cOQ.LJIJI(aweme) || C1010120cOQ.LJJIIJZLJL(aweme)) && (abstractC1045430dJNLJIIL = LJIIL(context, aweme)) != null && view != null)) {
                C1045770dJv c1045770dJvLIZIZ = C1045770dJv.LIZIZ(abstractC1045430dJNLJIIL);
                abstractC1045430dJNLJIIL.LIZLLL(view);
                Activity activityLIZ = C06MM.LIZ(context);
                if (activityLIZ != null) {
                    View viewFindViewById2 = activityLIZ.getWindow().getDecorView().findViewById(android.R.id.content);
                    int iLJIIIIZZ = C12ES.LJIIIIZZ(activityLIZ);
                    int iLJIIJ = C12ES.LJIIJ(activityLIZ);
                    ArrayList arrayList = (ArrayList) C1045370dJH.LIZJ(iLJIIIIZZ, iLJIIJ, viewFindViewById2);
                    arrayList.remove(view);
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        abstractC1045430dJNLJIIL.LIZ((View) it2.next(), EnumC1045490dJT.OTHER);
                    }
                    if (activityLIZ instanceof DetailActivity) {
                        View viewFindViewById3 = activityLIZ.findViewById(R.id.j2f);
                        if (viewFindViewById3 != null) {
                            viewFindViewById = viewFindViewById3.findViewById(R.id.trr);
                        }
                    } else {
                        viewFindViewById = activityLIZ.findViewById(R.id.trr);
                    }
                    if (viewFindViewById != null) {
                        Iterator it3 = ((ArrayList) C1045370dJH.LIZJ(iLJIIIIZZ, iLJIIJ, viewFindViewById)).iterator();
                        while (it3.hasNext()) {
                            abstractC1045430dJNLJIIL.LJFF((View) it3.next());
                        }
                    }
                }
                abstractC1045430dJNLJIIL.LJI();
                C1045790dJx c1045790dJxLIZ = C1045790dJx.LIZ(abstractC1045430dJNLJIIL);
                EnumC1045500dJU enumC1045500dJU = EnumC1045500dJU.STANDALONE;
                C1045780dJw.LIZ(enumC1045500dJU, "Position is null");
                C2204961BRm.LLLLZI(c1045790dJxLIZ, new C1045910dK9(enumC1045500dJU), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLLzjHDlqEz7yKMmWXXnQSEGug/mLLITyQ=", null));
                c1045790dJxLIZ.LIZIZ();
                if (C294490BgV.LIZ()) {
                    String strLIZLLL2 = C1045370dJH.LIZLLL(aweme);
                    C0N4L c0n4l = this.LJFF.get(strLIZLLL2);
                    if (c0n4l == null) {
                        c0n4l = new C0N4L();
                        c0n4l.LIZIZ = LJIILIIL(aweme);
                        c0n4l.LIZJ = LJFF(aweme);
                        this.LJFF.put(strLIZLLL2, c0n4l);
                    }
                    if (!c0n4l.LJ.contains("omsdk_impression")) {
                        c0n4l.LJ.add("omsdk_impression");
                        c0n4l.LIZLLL = "omsdk_impression";
                        C588660N6y c588660N6y = new C588660N6y("android_old_feed", c0n4l.LIZ, c0n4l.LIZIZ, c0n4l.LIZJ, LJIIIZ(aweme));
                        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                        if (C294490BgV.LIZ()) {
                            new C1020690cfT(c588660N6y, awemeRawAd).logAd(C1E6X.LIZ, awemeRawAd);
                        }
                    }
                }
                c1045770dJv = c1045770dJvLIZIZ;
                if (c1045770dJvLIZIZ != null) {
                    this.LIZ.put(strLIZLLL, c1045770dJvLIZIZ);
                    return c1045770dJv;
                }
            }
        }
        return c1045770dJv;
    }

    public final void LJJIFFI(long j, Context context, Aweme aweme) {
        AwemeRawAd awemeRawAdLJJIJL;
        C1045220dJ2.LJIILLIIL(aweme, "firstQuartile", "play_25");
        if (aweme != null) {
            if (aweme.getAwemeRawAd() != null || C1017070cZd.LJIIL(aweme)) {
                if (!C1017070cZd.LLILII(aweme)) {
                    awemeRawAdLJJIJL = aweme.getAwemeRawAd();
                } else {
                    awemeRawAdLJJIJL = C1017070cZd.LJJIJL(aweme);
                }
                C2201701BEy c2201701BEy = C2201701BEy.LIZ;
                List<String> rawAdPlayNodeTrackUrlList = AwemeExtKt.getRawAdPlayNodeTrackUrlList(aweme, 25);
                Long creativeId = awemeRawAdLJJIJL.getCreativeId();
                String logExtra = awemeRawAdLJJIJL.getLogExtra();
                c2201701BEy.getClass();
                C2201701BEy.LIZIZ("play_25", rawAdPlayNodeTrackUrlList, creativeId, logExtra, null);
                C1019030ccn.LJJJJ(context, "first_quartile", aweme, C1019030ccn.LJIIJJI(context, aweme, false, C1019030ccn.LJ(this.LJIIJ + 1)));
                C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "first_quartile", awemeRawAdLJJIJL);
                c1022820ciuLIZLLL.LIZIZ(Integer.valueOf(LJIILJJIL(c1022820ciuLIZLLL, aweme)), "play_order");
                c1022820ciuLIZLLL.LIZIZ(Long.valueOf(j), "duration");
                c1022820ciuLIZLLL.LIZIZ(0, "is_backfilled");
                c1022820ciuLIZLLL.LIZIZ(LJIIZILJ(aweme), "bsh_video_id");
                c1022820ciuLIZLLL.LJIIIIZZ();
                if (C1010120cOQ.LJIJI(aweme)) {
                    ((ISearchAdMainService) ServiceManager.get().getService(ISearchAdMainService.class)).LJIIIIZZ().LJIIJ(aweme, "first_quartile");
                }
            }
        }
    }

    public final void LJJII(long j, Context context, Aweme aweme) {
        AwemeRawAd awemeRawAdLJJIJL;
        C1045220dJ2.LJIILLIIL(aweme, "midpoint", "play_50");
        if (aweme != null) {
            if (aweme.getAwemeRawAd() != null || C1017070cZd.LJIIL(aweme)) {
                if (!C1017070cZd.LLILII(aweme)) {
                    awemeRawAdLJJIJL = aweme.getAwemeRawAd();
                } else {
                    awemeRawAdLJJIJL = C1017070cZd.LJJIJL(aweme);
                }
                C2201701BEy c2201701BEy = C2201701BEy.LIZ;
                List<String> rawAdPlayNodeTrackUrlList = AwemeExtKt.getRawAdPlayNodeTrackUrlList(aweme, 50);
                Long creativeId = awemeRawAdLJJIJL.getCreativeId();
                String logExtra = awemeRawAdLJJIJL.getLogExtra();
                c2201701BEy.getClass();
                C2201701BEy.LIZIZ("play_50", rawAdPlayNodeTrackUrlList, creativeId, logExtra, null);
                C1019030ccn.LJJJJ(context, "midpoint", aweme, C1019030ccn.LJIIJJI(context, aweme, false, C1019030ccn.LJ(this.LJIIJ + 1)));
                C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "midpoint", awemeRawAdLJJIJL);
                c1022820ciuLIZLLL.LIZIZ(Integer.valueOf(LJIILJJIL(c1022820ciuLIZLLL, aweme)), "play_order");
                c1022820ciuLIZLLL.LIZIZ(Long.valueOf(j), "duration");
                c1022820ciuLIZLLL.LIZIZ(0, "is_backfilled");
                c1022820ciuLIZLLL.LIZIZ(LJIIZILJ(aweme), "bsh_video_id");
                c1022820ciuLIZLLL.LJIIIIZZ();
                if (C1010120cOQ.LJIJI(aweme)) {
                    ((ISearchAdMainService) ServiceManager.get().getService(ISearchAdMainService.class)).LJIIIIZZ().LJIIJ(aweme, "midpoint");
                }
            }
        }
    }

    public final void LJJIII(long j, Context context, Aweme aweme) {
        AwemeRawAd awemeRawAdLJJIJL;
        C1045220dJ2.LJIILLIIL(aweme, "thirdQuartile", "play_75");
        if (aweme != null) {
            if (aweme.getAwemeRawAd() != null || C1017070cZd.LJIIL(aweme)) {
                if (!C1017070cZd.LLILII(aweme)) {
                    awemeRawAdLJJIJL = aweme.getAwemeRawAd();
                } else {
                    awemeRawAdLJJIJL = C1017070cZd.LJJIJL(aweme);
                }
                C2201701BEy c2201701BEy = C2201701BEy.LIZ;
                List<String> rawAdPlayNodeTrackUrlList = AwemeExtKt.getRawAdPlayNodeTrackUrlList(aweme, 75);
                Long creativeId = awemeRawAdLJJIJL.getCreativeId();
                String logExtra = awemeRawAdLJJIJL.getLogExtra();
                c2201701BEy.getClass();
                C2201701BEy.LIZIZ("play_75", rawAdPlayNodeTrackUrlList, creativeId, logExtra, null);
                C1019030ccn.LJJJJ(context, "third_quartile", aweme, C1019030ccn.LJIIJJI(context, aweme, false, C1019030ccn.LJ(this.LJIIJ + 1)));
                C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "third_quartile", awemeRawAdLJJIJL);
                c1022820ciuLIZLLL.LIZIZ(Integer.valueOf(LJIILJJIL(c1022820ciuLIZLLL, aweme)), "play_order");
                c1022820ciuLIZLLL.LIZIZ(Long.valueOf(j), "duration");
                c1022820ciuLIZLLL.LIZIZ(0, "is_backfilled");
                c1022820ciuLIZLLL.LIZIZ(LJIIZILJ(aweme), "bsh_video_id");
                c1022820ciuLIZLLL.LJIIIIZZ();
                if (C1010120cOQ.LJIJI(aweme)) {
                    ((ISearchAdMainService) ServiceManager.get().getService(ISearchAdMainService.class)).LJIIIIZZ().LJIIJ(aweme, "third_quartile");
                }
            }
        }
    }

    public final void LJJIJL(Context context, View view, Aweme aweme) {
        LJIJJLI(aweme, "skipped");
        if (LJJIJIL(aweme)) {
            return;
        }
        C1045380dJI.LIZ("skipped");
        if (!this.LJIILJJIL) {
            C1045770dJv c1045770dJvLJIIJJI = LJIIJJI(context, view, aweme);
            AwemeRawAd awemeRawAd = null;
            if (c1045770dJvLJIIJJI != null) {
                C1045780dJw.LIZJ(c1045770dJvLJIIJJI.LIZ);
                c1045770dJvLJIIJJI.LIZ.LJ.LIZ("skipped", null);
                this.LJIILJJIL = true;
            }
            if (C294490BgV.LIZ()) {
                C0N4L c0n4l = this.LJFF.get(C1045370dJH.LIZLLL(aweme));
                if (c0n4l != null && !c0n4l.LJ.contains("omsdk_break")) {
                    c0n4l.LJ.add("omsdk_break");
                    c0n4l.LIZLLL = "omsdk_break";
                    C588660N6y c588660N6y = new C588660N6y("android_old_feed", c0n4l.LIZ, c0n4l.LIZIZ, c0n4l.LIZJ, LJIIIZ(aweme));
                    if (aweme != null) {
                        awemeRawAd = aweme.getAwemeRawAd();
                    }
                    C1046770dLX.LIZLLL(c588660N6y, awemeRawAd);
                }
            }
            C1045570dJb c1045570dJbLJII = LJII(context, view, aweme);
            if (c1045570dJbLJII != null) {
                C1045580dJc.LIZIZ(c1045570dJbLJII.LIZ);
                c1045570dJbLJII.LIZ.LJI();
            }
        }
    }

    public final void LJIL(final Context context, final View view, final Aweme aweme, boolean z) {
        InterfaceC585680My6 interfaceC585680My6LJIILLIIL;
        if (aweme == null) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPageChange, isCurrentVideo= ");
        sbLIZ.append(z);
        LJIJJLI(aweme, C2188811AlT.LIZIZ(sbLIZ));
        if (C293490Bet.LIZIZ && (interfaceC585680My6LJIILLIIL = LJIILLIIL()) != null && interfaceC585680My6LJIILLIIL.LJIILL(aweme)) {
            if (view != null && context != null) {
                interfaceC585680My6LJIILLIIL.LJIJJLI(context, view, aweme, z);
                return;
            }
            return;
        }
        if (z) {
            if (!C1017070cZd.LLIIL(aweme)) {
                LJIJJLI(aweme, "startInitListeners");
                if (C257520A7i.LIZIZ) {
                    final WeakReference weakReference = new WeakReference(aweme);
                    final WeakReference weakReference2 = new WeakReference(context);
                    final WeakReference weakReference3 = new WeakReference(view);
                    this.LJIJJ = new InterfaceC1045590dJd() { // from class: X.0dJJ
                        @Override // X.InterfaceC1045590dJd
                        public final void LIZ(long j) {
                            Aweme aweme2 = (Aweme) weakReference.get();
                            Context context2 = (Context) weakReference2.get();
                            View view2 = (View) weakReference3.get();
                            if (aweme2 != null && context2 != null && view2 != null) {
                                if (!this.LIZLLL.LJII) {
                                    this.LIZLLL.LJJIZ(aweme2, context2, view2, j);
                                }
                                C1045340dJE c1045340dJE = this.LIZLLL;
                                EnumC1045470dJR enumC1045470dJR = EnumC1045470dJR.PROGRESS_25P;
                                AwemeExtKt.getAwemeRawAdIdStr(aweme2);
                                c1045340dJE.LJJIJIIJIL(enumC1045470dJR);
                            }
                        }

                        @Override // X.InterfaceC1045590dJd
                        public final void LIZIZ(long j) {
                            Aweme aweme2 = (Aweme) weakReference.get();
                            Context context2 = (Context) weakReference2.get();
                            View view2 = (View) weakReference3.get();
                            if (aweme2 != null && context2 != null && view2 != null) {
                                if (!this.LIZLLL.LJIIIZ) {
                                    this.LIZLLL.LJJJI(aweme2, context2, view2, j);
                                }
                                C1045340dJE c1045340dJE = this.LIZLLL;
                                EnumC1045470dJR enumC1045470dJR = EnumC1045470dJR.PROGRESS_75P;
                                AwemeExtKt.getAwemeRawAdIdStr(aweme2);
                                c1045340dJE.LJJIJIIJIL(enumC1045470dJR);
                            }
                        }

                        @Override // X.InterfaceC1045590dJd
                        public final void LIZJ(long j) {
                            Aweme aweme2 = (Aweme) weakReference.get();
                            Context context2 = (Context) weakReference2.get();
                            View view2 = (View) weakReference3.get();
                            if (aweme2 != null && context2 != null && view2 != null) {
                                if (!this.LIZLLL.LJIIIIZZ) {
                                    this.LIZLLL.LJJJ(aweme2, context2, view2, j);
                                }
                                C1045340dJE c1045340dJE = this.LIZLLL;
                                EnumC1045470dJR enumC1045470dJR = EnumC1045470dJR.PROGRESS_50P;
                                AwemeExtKt.getAwemeRawAdIdStr(aweme2);
                                c1045340dJE.LJJIJIIJIL(enumC1045470dJR);
                            }
                        }

                        @Override // X.InterfaceC1045590dJd
                        public final void LIZLLL(long j, long j2, long j3) {
                            Aweme aweme2 = (Aweme) weakReference.get();
                            Context context2 = (Context) weakReference2.get();
                            Object obj = weakReference3.get();
                            if (aweme2 != null && context2 != null && obj != null) {
                                C1045220dJ2.LJIJ(j, j2, j3, aweme2);
                                C1045340dJE c1045340dJE = this.LIZLLL;
                                if (c1045340dJE.LJIIJ == 0 && j < 2000 && j2 >= 2000) {
                                    c1045340dJE.LJJJIL(context2, aweme2);
                                }
                            }
                        }
                    };
                    this.LJI.LIZLLL = new InterfaceC1046330dKp() { // from class: X.0dJS
                        @Override // X.InterfaceC1046330dKp
                        public final void LJIIJ() {
                        }

                        @Override // X.InterfaceC1046330dKp
                        public final void LIZ() {
                            Aweme aweme2 = (Aweme) weakReference.get();
                            Context context2 = (Context) weakReference2.get();
                            Object obj = weakReference3.get();
                            if (aweme2 == null || context2 == null || obj == null) {
                                return;
                            }
                            this.LIZLLL.LJJIIZ(context2, aweme2);
                        }

                        @Override // X.InterfaceC1046330dKp
                        public final void LIZIZ() {
                            Aweme aweme2 = (Aweme) weakReference.get();
                            Context context2 = (Context) weakReference2.get();
                            Object obj = weakReference3.get();
                            if (aweme2 == null || context2 == null || obj == null) {
                                return;
                            }
                            this.LIZLLL.LJJIIJZLJL(context2, aweme2);
                        }
                    };
                    return;
                }
                this.LJIJJ = new InterfaceC1045590dJd() { // from class: X.0dJK
                    @Override // X.InterfaceC1045590dJd
                    public final void LIZ(long j) {
                        if (!this.LJII) {
                            this.LJJIZ(aweme, context, view, j);
                        }
                        C1045340dJE c1045340dJE = this;
                        EnumC1045470dJR enumC1045470dJR = EnumC1045470dJR.PROGRESS_25P;
                        AwemeExtKt.getAwemeRawAdIdStr(aweme);
                        c1045340dJE.LJJIJIIJIL(enumC1045470dJR);
                    }

                    @Override // X.InterfaceC1045590dJd
                    public final void LIZIZ(long j) {
                        if (!this.LJIIIZ) {
                            this.LJJJI(aweme, context, view, j);
                        }
                        C1045340dJE c1045340dJE = this;
                        EnumC1045470dJR enumC1045470dJR = EnumC1045470dJR.PROGRESS_75P;
                        AwemeExtKt.getAwemeRawAdIdStr(aweme);
                        c1045340dJE.LJJIJIIJIL(enumC1045470dJR);
                    }

                    @Override // X.InterfaceC1045590dJd
                    public final void LIZJ(long j) {
                        if (!this.LJIIIIZZ) {
                            this.LJJJ(aweme, context, view, j);
                        }
                        C1045340dJE c1045340dJE = this;
                        EnumC1045470dJR enumC1045470dJR = EnumC1045470dJR.PROGRESS_50P;
                        AwemeExtKt.getAwemeRawAdIdStr(aweme);
                        c1045340dJE.LJJIJIIJIL(enumC1045470dJR);
                    }

                    @Override // X.InterfaceC1045590dJd
                    public final void LIZLLL(long j, long j2, long j3) {
                        C1045220dJ2.LJIJ(j, j2, j3, aweme);
                        C1045340dJE c1045340dJE = this;
                        if (c1045340dJE.LJIIJ == 0 && j < 2000 && j2 >= 2000) {
                            c1045340dJE.LJJJIL(context, aweme);
                        }
                    }
                };
                this.LJI.LIZLLL = new InterfaceC1046330dKp() { // from class: X.0dJa
                    @Override // X.InterfaceC1046330dKp
                    public final void LJIIJ() {
                    }

                    @Override // X.InterfaceC1046330dKp
                    public final void LIZ() {
                        this.LJJIIZ(context, aweme);
                    }

                    @Override // X.InterfaceC1046330dKp
                    public final void LIZIZ() {
                        this.LJJIIJZLJL(context, aweme);
                    }
                };
                return;
            }
            return;
        }
        LJJIJ(aweme);
    }

    public final void LJJI(int i, Context context, View view, Aweme aweme) {
        C0N4L c0n4l;
        InterfaceC585680My6 interfaceC585680My6LJIILLIIL;
        if (aweme == null) {
            return;
        }
        if (C293490Bet.LIZIZ && (interfaceC585680My6LJIILLIIL = LJIILLIIL()) != null && interfaceC585680My6LJIILLIIL.LJIILL(aweme)) {
            if (view != null && context != null) {
                interfaceC585680My6LJIILLIIL.LJJIIJ(i, context, aweme);
                return;
            }
            return;
        }
        C2344809Gs.LJ("AdOM onPlayComplete ");
        LJIJJLI(aweme, "onPlayComplete");
        this.LJIIJ = i - 1;
        if (i == 1) {
            C1045380dJI.LIZ("complete");
            String strLIZLLL = C1045370dJH.LIZLLL(aweme);
            C1045770dJv c1045770dJv = this.LIZ.get(strLIZLLL);
            if (c1045770dJv != null) {
                C1045780dJw.LIZJ(c1045770dJv.LIZ);
                c1045770dJv.LIZ.LJ.LIZ("complete", null);
            }
            if (C294490BgV.LIZ() && (c0n4l = this.LJFF.get(strLIZLLL)) != null && !c0n4l.LJ.contains("omsdk_over")) {
                c0n4l.LJ.add("omsdk_over");
                c0n4l.LIZLLL = "omsdk_over";
                C1046770dLX.LJFF(new C588660N6y("android_old_feed", c0n4l.LIZ, c0n4l.LIZIZ, c0n4l.LIZJ, LJIIIZ(aweme)), aweme.getAwemeRawAd(), i);
            }
            C1045570dJb c1045570dJbLJII = LJII(context, view, aweme);
            if (c1045570dJbLJII != null) {
                C1045580dJc.LIZIZ(c1045570dJbLJII.LIZ);
                c1045570dJbLJII.LIZ.LJI();
            }
            AbstractC1045430dJN abstractC1045430dJN = this.LIZJ.get(strLIZLLL);
            this.LJIILL = true;
            LJIJJ(aweme, strLIZLLL);
            AbstractC1045600dJe abstractC1045600dJe = this.LIZLLL.get(strLIZLLL);
            if (abstractC1045600dJe != null) {
                abstractC1045600dJe.LIZIZ();
            }
            LJJIIJ(strLIZLLL, abstractC1045430dJN);
            long jLJIIIIZZ = LJIIIIZZ();
            if (!C1010120cOQ.LJIJI(this.LJIJI)) {
                LIZ(jLJIIIIZZ, jLJIIIIZZ);
            }
        }
        C1045220dJ2.LJIILLIIL(aweme, "complete", "play_over");
        this.LJIIJ++;
        AwemeExtKt.getAwemeRawAdIdStr(aweme);
        this.LJII = false;
        this.LJIIIIZZ = false;
        this.LJIIIZ = false;
    }

    public final void LJJIJLIJ(Context context, View view, Aweme aweme, String str) {
        LJIJJLI(aweme, "startAdSession onViewHolderSelected");
        this.LJIILIIL = C1017070cZd.LJLJLJ(aweme);
        this.LJIIL = C1017070cZd.LLIIIZ(aweme);
        if (aweme != null && C1045220dJ2.LJIIIIZZ(aweme) && aweme.getAwemeRawAd().getOmVast().isEnableContentUrl) {
            this.LJ.put(C1045370dJH.LIZLLL(aweme), str);
        }
        C1045380dJI.LIZ = aweme;
        C1045380dJI.LIZ("sessionStart");
        if (!C04UM.LIZ() && SharePrefCache.inst().getEnableBindItemCallOMSDK().LIZ().intValue() == 0) {
            if (((Boolean) C135200fO.LIZ.getValue()).booleanValue()) {
                boolean zLJII = C1045220dJ2.LJII(aweme);
                boolean zLJJIIJZLJL = C1010120cOQ.LJJIIJZLJL(aweme);
                if (!zLJII || !zLJJIIJZLJL) {
                    return;
                }
            } else {
                return;
            }
        }
        LJIIJJI(context, view, aweme);
        LJII(context, view, aweme);
    }

    public final void LJJIZ(Aweme aweme, Context context, View view, long j) {
        if (LJJIJIL(aweme)) {
            return;
        }
        if (this.LJIIJ == 0) {
            C1045770dJv c1045770dJvLJIIJJI = LJIIJJI(context, view, aweme);
            if (c1045770dJvLJIIJJI != null) {
                C1045780dJw.LIZJ(c1045770dJvLJIIJJI.LIZ);
                c1045770dJvLJIIJJI.LIZ.LJ.LIZ("firstQuartile", null);
            }
            if (C294490BgV.LIZ()) {
                C0N4L c0n4l = this.LJFF.get(C1045370dJH.LIZLLL(aweme));
                if (c0n4l != null && !c0n4l.LJ.contains("omsdk_first_quartile")) {
                    c0n4l.LJ.add("omsdk_first_quartile");
                    c0n4l.LIZLLL = "omsdk_first_quartile";
                    C1046770dLX.LJIIIZ(new C588660N6y("android_old_feed", c0n4l.LIZ, c0n4l.LIZIZ, c0n4l.LIZJ, LJIIIZ(aweme)), aweme.getAwemeRawAd(), "omsdk_first_quartile", this.LJIIJ);
                }
            }
        }
        LJJIFFI(j, context, aweme);
    }

    public final void LJJJ(Aweme aweme, Context context, View view, long j) {
        C2344809Gs.LJ("trackSecondQuartile");
        if (LJJIJIL(aweme)) {
            return;
        }
        if (this.LJIIJ == 0) {
            C1045770dJv c1045770dJvLJIIJJI = LJIIJJI(context, view, aweme);
            if (c1045770dJvLJIIJJI != null) {
                C1045780dJw.LIZJ(c1045770dJvLJIIJJI.LIZ);
                c1045770dJvLJIIJJI.LIZ.LJ.LIZ("midpoint", null);
            }
            if (C294490BgV.LIZ()) {
                C0N4L c0n4l = this.LJFF.get(C1045370dJH.LIZLLL(aweme));
                if (c0n4l != null && !c0n4l.LJ.contains("omsdk_midpoint")) {
                    c0n4l.LJ.add("omsdk_midpoint");
                    c0n4l.LIZLLL = "omsdk_midpoint";
                    C1046770dLX.LJIIIZ(new C588660N6y("android_old_feed", c0n4l.LIZ, c0n4l.LIZIZ, c0n4l.LIZJ, LJIIIZ(aweme)), aweme.getAwemeRawAd(), "omsdk_midpoint", this.LJIIJ);
                }
            }
        }
        LJJII(j, context, aweme);
    }

    public final void LJJJI(Aweme aweme, Context context, View view, long j) {
        if (LJJIJIL(aweme)) {
            return;
        }
        if (this.LJIIJ == 0) {
            C1045770dJv c1045770dJvLJIIJJI = LJIIJJI(context, view, aweme);
            if (c1045770dJvLJIIJJI != null) {
                C1045780dJw.LIZJ(c1045770dJvLJIIJJI.LIZ);
                c1045770dJvLJIIJJI.LIZ.LJ.LIZ("thirdQuartile", null);
            }
            if (C294490BgV.LIZ()) {
                C0N4L c0n4l = this.LJFF.get(C1045370dJH.LIZLLL(aweme));
                if (c0n4l != null && !c0n4l.LJ.contains("omsdk_third_quartile")) {
                    c0n4l.LJ.add("omsdk_third_quartile");
                    c0n4l.LIZLLL = "omsdk_third_quartile";
                    C1046770dLX.LJIIIZ(new C588660N6y("android_old_feed", c0n4l.LIZ, c0n4l.LIZIZ, c0n4l.LIZJ, LJIIIZ(aweme)), aweme.getAwemeRawAd(), "omsdk_third_quartile", this.LJIIJ);
                }
            }
        }
        LJJIII(j, context, aweme);
    }
}
