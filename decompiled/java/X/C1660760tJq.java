package X;

import Y.AObjectS245S0100000_22;
import Y.AObjectS246S0100000_25;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.effectmanager.DownloadableModelSupport;
import com.ss.android.ugc.effectmanager.IFetchResourceListener;
import com.ss.android.vesdk.VEInfo;
import com.ss.android.vesdk.VERecorder;
import com.ss.android.vesdk.filterparam.VEAudioLoudnessBalanceFilter;
import com.ss.android.vesdk.k;
import com.ss.android.vesdk.proxy.TEDuetProxy;
import gro.a;
import java.net.URI;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS261S0000000_22;
import kotlin.jvm.internal.AwS174S1100000_25;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS604S0100000_25;
import lnn.q;

/* JADX INFO: renamed from: X.0tJq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1660760tJq extends AbstractC2255721DQs<InterfaceC1646970sxb> implements InterfaceC1646970sxb, InterfaceC379610EuV {
    public static final C1660890tK3 LLJJIJIIJIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIL;
    public final C1DRG LL;
    public String LLJI;
    public boolean LLJILJIL;
    public String LLJILLL;
    public boolean LLJJ;
    public InterfaceC1437720nW6 LLJJI;
    public final InterfaceC1731706qJ LLILLJJLI = C1664770tQJ.LIZ(getDiContainer(), ShortVideoContext.class, null);
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1648570t0B.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1650230t2r.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZIZ(getDiContainer(), q.class, null);
    public final InterfaceC2254081DKk LLILZLL = getCameraApiComponent().St2();
    public int LLIZ = -1;
    public int LLIZLLLIL = -1;
    public int LLJ = -1;
    public int LLJIJIL = -1;
    public final C1663400tO6 LLJILJILJ = new C1663400tO6(new AwS569S0100000_25(this, 240), new InterfaceC1631630sYr<Integer, Integer, String, VERecorder, Unit>() { // from class: X.0tJr
        @Override // X.InterfaceC1631630sYr
        public final Unit invoke(Integer num, Integer num2, String str, VERecorder vERecorder) {
            boolean z;
            int iIntValue = num.intValue();
            int iIntValue2 = num2.intValue();
            if (iIntValue == VEInfo.TE_RECORD_INFO_MIC_AUDIO_DELAY_RET) {
                C1660760tJq c1660760tJq = this.LL;
                if (iIntValue2 == 0) {
                    z = true;
                } else {
                    z = false;
                }
                c1660760tJq.LLJILJIL = z;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("RecordBGMComponent zyc audio set delay ret=");
                sbLIZ.append(iIntValue2);
                C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            }
            C1660760tJq c1660760tJq2 = this.LL;
            if (c1660760tJq2.LLJILJIL && iIntValue == VEInfo.TE_RECORD_INFO_MIC_AUDIO_DELAY) {
                c1660760tJq2.E3(iIntValue2);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("RecordBGMComponent zyc audio set delay=");
                sbLIZ2.append(iIntValue2);
                sbLIZ2.append(" ms");
                C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
                this.LL.LLJILJIL = false;
            }
            return Unit.LIZ;
        }
    });
    public final List<String> LLJJIII = C1697810uHb.LJIILJJIL("prop_music_bind", "single_song", "sync_page_recommend");
    public final InterfaceC1646970sxb LLJJIJI = this;

    /* JADX WARN: Type inference failed for: r0v9, types: [X.0tK3] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1660760tJq.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C1660760tJq.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0), new C2217381BqS(C1660760tJq.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0), new C2217381BqS(C1660760tJq.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0)};
        LLJJIJIIJIL = new Object() { // from class: X.0tK3
        };
    }

    private final void m3() {
        a aVar;
        if (this.LLIZ == -1 || (aVar = getCameraApiComponent().u92().LIZIZ().LIZIZ.LJJIZ) == null) {
            return;
        }
        aVar.removeTrackFilter(this.LLIZ);
    }

    public final void B3() {
        if (this.LLJIJIL != -1) {
            this.LLILZLL.Dh(this.LLJILJILJ);
            int iRemoveTrackAlgorithm = this.LLILZLL.getAudioController().removeTrackAlgorithm(this.LLJIJIL);
            this.LLJIJIL = -1;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("zyc audio removeTrackAlgorithm ret=");
            sbLIZ.append(iRemoveTrackAlgorithm);
            C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public final void O3() {
        if (C1403010mc7.LIZ.getBridgeService().LJFF(C1664590tQ1.LJIIIIZZ(this))) {
            getShortVideoContext().creativeModel.ifRecordWithHeadset = true;
        }
    }

    public final InterfaceC1650230t2r getCameraApiComponent() {
        return (InterfaceC1650230t2r) this.LLILZ.getValue(this, LLJJIJIL[2]);
    }

    public final InterfaceC1648570t0B getRecordControlApi() {
        return (InterfaceC1648570t0B) this.LLILLL.getValue(this, LLJJIJIL[1]);
    }

    public final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LLILLJJLI.getValue(this, LLJJIJIL[0]);
    }

    public final q getStickerApiComponent() {
        return (q) this.LLILZIL.getValue(this, LLJJIJIL[3]);
    }

    public final void q3() {
        if (this.LLJ != -1) {
            a aVar = getCameraApiComponent().u92().LIZIZ().LIZIZ.LJJIZ;
            if (aVar != null) {
                aVar.removeTrackFilter(this.LLJ);
            }
            this.LLJ = -1;
        }
    }

    public final void v3() {
        if (this.LLIZLLLIL != -1) {
            a aVar = getCameraApiComponent().u92().LIZIZ().LIZIZ.LJJIZ;
            if (aVar != null) {
                aVar.removeTrackFilter(this.LLIZLLLIL);
            }
            this.LLIZLLLIL = -1;
        }
    }

    private final boolean H3() {
        return C1660880tK2.LIZ().enableAEC && getShortVideoContext().LJJLL() && !C1660920tK6.LJFF;
    }

    private final int W2() {
        return getShortVideoContext().recordBGMDelay;
    }

    private final void c3() {
        C1DRG diContainer = getDiContainer();
        if (C343070Dcf.LIZ()) {
            ((C0ETY) diContainer.LJII(C0ETY.class, null)).Sd(InterfaceC1628590sTx.class, new AwS604S0100000_25(this, 116));
            return;
        }
        C05YF c05yf = (C05YF) diContainer.LJIIL(null, InterfaceC1628590sTx.class);
        if (c05yf != null) {
            InterfaceC1628590sTx interfaceC1628590sTx = (InterfaceC1628590sTx) c05yf;
            interfaceC1628590sTx.Wv().LIZ(this, new AObjectS246S0100000_25(this, 131));
            interfaceC1628590sTx.Vk().LIZ(this, new AObjectS246S0100000_25(this, 132));
        }
    }

    public final boolean G2() {
        return getShortVideoContext().LJJLL() && !getShortVideoContext().cameraComponentModel.isMuted && C1660880tK2.LIZ().enableTimeAlignment && !C1660920tK6.LJFF;
    }

    public final boolean H2() {
        return getShortVideoContext().LJJLL() && !getShortVideoContext().cameraComponentModel.isMuted && C1660880tK2.LIZ().enableLoudnessNorm && !C1660920tK6.LJFF;
    }

    public final void W1() {
        AVMusic aVMusicMr0;
        C1DRG diContainer = getDiContainer();
        if (C343070Dcf.LIZ()) {
            ((C0ETY) diContainer.LJII(C0ETY.class, null)).Sd(InterfaceC1628590sTx.class, new AwS604S0100000_25(this, 115));
            return;
        }
        C05YF c05yf = (C05YF) diContainer.LJIIL(null, InterfaceC1628590sTx.class);
        if (c05yf == null || (aVMusicMr0 = ((InterfaceC1628590sTx) c05yf).mr0()) == null) {
            return;
        }
        v3();
        VERecorder vERecorderLIZIZ = getCameraApiComponent().u92().LIZIZ();
        float fLJFF = C1485020okO.LJFF(aVMusicMr0.getMusicVolumeInfo());
        float f = C1458340o3M.LIZ;
        if (!C1485020okO.LIZLLL(Float.valueOf(fLJFF)) || !C1485020okO.LIZLLL(Float.valueOf(f))) {
            aVMusicMr0.getMusicVolumeInfo();
            aVMusicMr0.getMusicId();
            return;
        }
        VEAudioLoudnessBalanceFilter vEAudioLoudnessBalanceFilter = new VEAudioLoudnessBalanceFilter();
        vEAudioLoudnessBalanceFilter.targetLoudness = f;
        vEAudioLoudnessBalanceFilter.peakLoudness = 1.0E-6d;
        vEAudioLoudnessBalanceFilter.avgLoudness = fLJFF;
        vEAudioLoudnessBalanceFilter.isOnLine = false;
        vEAudioLoudnessBalanceFilter.isBGM = true;
        this.LLIZLLLIL = vERecorderLIZIZ.LIZIZ.LJJIZ.addTrackFilter(1, vERecorderLIZIZ.LJIIIIZZ(), vEAudioLoudnessBalanceFilter, 0, Integer.MAX_VALUE);
        aVMusicMr0.getMusicVolumeInfo();
        aVMusicMr0.getMusicId();
    }

    public final void X1() {
        VERecorder vERecorderLIZIZ = getCameraApiComponent().u92().LIZIZ();
        float f = getShortVideoContext().creativeModel.musicVolumeInfoModel.duetSrcLoudness;
        float fLIZJ = C1485020okO.LIZJ();
        if (C1485020okO.LIZLLL(Float.valueOf(f)) && C1485020okO.LIZLLL(Float.valueOf(fLIZJ))) {
            k kVar = vERecorderLIZIZ.LIZIZ;
            synchronized (kVar.LJL) {
                try {
                    C1DMH c1dmh = kVar.LJJZZIII;
                    if (c1dmh == null || !(c1dmh instanceof TEDuetProxy)) {
                        return;
                    }
                    int i = ((TEDuetProxy) c1dmh).LJI;
                    if (i != -1) {
                        VEAudioLoudnessBalanceFilter vEAudioLoudnessBalanceFilter = new VEAudioLoudnessBalanceFilter();
                        vEAudioLoudnessBalanceFilter.targetLoudness = ((double) fLIZJ) + ((double) (getShortVideoContext().cameraComponentModel.isMuted ? C1461260o84.LIZ.shootingPageBgmLoudnessBiasMicOff : C1461260o84.LIZ.shootingPageBgmLoudnessBiasMicOn));
                        vEAudioLoudnessBalanceFilter.peakLoudness = 1.0E-6d;
                        vEAudioLoudnessBalanceFilter.avgLoudness = f;
                        vEAudioLoudnessBalanceFilter.isOnLine = false;
                        vEAudioLoudnessBalanceFilter.isBGM = false;
                        q3();
                        this.LLJ = vERecorderLIZIZ.LIZIZ.LJJIZ.addTrackFilter(1, i, vEAudioLoudnessBalanceFilter, 0, Integer.MAX_VALUE);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    public final void Z1() {
        VERecorder vERecorderLIZIZ = getCameraApiComponent().u92().LIZIZ();
        float fLJFF = C1485020okO.LJFF(getShortVideoContext().creativeModel.musicVolumeInfoModel.musicVolumeInfo);
        float fLIZJ = C1485020okO.LIZJ();
        if (C1485020okO.LIZLLL(Float.valueOf(fLJFF)) && C1485020okO.LIZLLL(Float.valueOf(fLIZJ))) {
            VEAudioLoudnessBalanceFilter vEAudioLoudnessBalanceFilter = new VEAudioLoudnessBalanceFilter();
            vEAudioLoudnessBalanceFilter.targetLoudness = ((double) fLIZJ) + ((double) (getShortVideoContext().cameraComponentModel.isMuted ? C1485030okP.LIZ.shootingPageBgmLoudnessBiasMicOff : C1485030okP.LIZ.shootingPageBgmLoudnessBiasMicOn));
            vEAudioLoudnessBalanceFilter.peakLoudness = 1.0E-6d;
            vEAudioLoudnessBalanceFilter.avgLoudness = fLJFF;
            vEAudioLoudnessBalanceFilter.isOnLine = false;
            vEAudioLoudnessBalanceFilter.isBGM = true;
            v3();
            getShortVideoContext();
            getShortVideoContext();
            this.LLIZLLLIL = vERecorderLIZIZ.LIZIZ.LJJIZ.addTrackFilter(1, vERecorderLIZIZ.LJIIIIZZ(), vEAudioLoudnessBalanceFilter, 0, Integer.MAX_VALUE);
        }
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [X.0tEL] */
    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        try {
            C1660920tK6.LIZIZ(C1664590tQ1.LJIIIIZZ(this));
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        if (H3()) {
            final ?? r1 = new InterfaceC1660870tK1() { // from class: X.0tEL
                @Override // X.InterfaceC1660870tK1
                public final void LIZ(boolean z) {
                }

                @Override // X.InterfaceC1660870tK1
                public final void LIZIZ(boolean z, String str, int i, Exception exc) {
                    String strLIZ;
                    int i2 = !z ? 1 : 0;
                    C543670LTx c543670LTx = new C543670LTx();
                    c543670LTx.LIZ.put("error_code", String.valueOf(i));
                    if (exc == null) {
                        strLIZ = "";
                    } else {
                        strLIZ = C1331420kke.LIZ(exc);
                    }
                    c543670LTx.LIZ.put("exception", strLIZ);
                    C1637890six.LJ("download_aec_model", i2, c543670LTx.LJ());
                    if (z) {
                        C01TT.LIZLLL(new AwS174S1100000_25(this.LIZ, str, 3));
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("RecordBGMComponent AEC download result: ");
                    sbLIZ.append(z);
                    C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                }
            };
            AbstractC1660840tJy.LIZ(new InterfaceC1660860tK0() { // from class: X.0tJt
                @Override // X.InterfaceC1660860tK0
                public final void LIZ(Exception exc) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("NormalAudioAecHelper aec model download fail:");
                    sbLIZ.append(Log.getStackTraceString(exc));
                    C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ));
                    InterfaceC1660870tK1 interfaceC1660870tK1 = r1;
                    if (interfaceC1660870tK1 != null) {
                        interfaceC1660870tK1.LIZIZ(false, null, -1, exc);
                    }
                }

                @Override // X.InterfaceC1660860tK0
                public final void onSuccess(String str) {
                    if (C2354709Kn.LIZIZ(str)) {
                        InterfaceC1660870tK1 interfaceC1660870tK1 = r1;
                        if (interfaceC1660870tK1 != null) {
                            interfaceC1660870tK1.LIZIZ(true, str, 0, null);
                        }
                        C201955140j.LIZ("aec model download success ");
                        return;
                    }
                    InterfaceC1660870tK1 interfaceC1660870tK12 = r1;
                    if (interfaceC1660870tK12 != null) {
                        interfaceC1660870tK12.LIZIZ(false, str, -1, null);
                    }
                    C201955140j.LIZ("aec model download fail , file not exit");
                }
            });
        }
        if (!C2354709Kn.LIZIZ(this.LLJI)) {
            o2(new AwS604S0100000_25(this, 117), AFwS261S0000000_22.get$arr$(85));
        }
        getRecordControlApi().me2().LIZ(this, new AObjectS246S0100000_25(this, 133));
        getRecordControlApi().tl1().LIZ(this, new AObjectS246S0100000_25(this, 134));
        getRecordControlApi().pU1().LIZ(this, new AObjectS245S0100000_22(this, 43));
        getRecordControlApi().yM2().LIZ(this, new AObjectS246S0100000_25(this, 135));
        getShortVideoContext().creativeModel.audioAlgorithmModel.shootVolumeStart = (float) C2179771ASp.LJIIIIZZ();
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        B3();
        try {
            Context context = C1660920tK6.LIZ;
            if (context != null) {
                C786410Ut5.LJJIFFI(context, C1660920tK6.LIZIZ);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C201955140j.LJI("HeadsetBroadcastReceiver.release error", e);
        }
        C1660920tK6.LJI.clear();
        C1660920tK6.LIZIZ = null;
        C1660920tK6.LIZ = null;
        C1660920tK6.LIZLLL = false;
        C1660920tK6.LJ = false;
        C1660920tK6.LIZJ = false;
        C1660920tK6.LJFF = false;
        m3();
        v3();
        q3();
        InterfaceC1437720nW6 interfaceC1437720nW6 = this.LLJJI;
        if (interfaceC1437720nW6 != null) {
            this.LLILZLL.mh(interfaceC1437720nW6);
        }
    }

    public final boolean w2() {
        return H3() && C1660880tK2.LIZ().enableAEC && getShortVideoContext().LJJLL() && !getShortVideoContext().cameraComponentModel.isMuted && !C1660920tK6.LJFF;
    }

    public InterfaceC1646970sxb T2() {
        return this.LLJJIJI;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLJJIJI;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C1660760tJq(C1DRG c1drg) {
        this.LL = c1drg;
    }

    public final void E3(int i) {
        getShortVideoContext().recordBGMDelay = i;
    }

    public final boolean i3(String str) {
        C0CHQ.LIZ().LJJIJIIJI();
        return C1458320o3K.LIZIZ(str);
    }

    private final void o2(final Function1<? super String, Unit> function1, final Function1<? super Exception, Unit> function12) {
        DownloadableModelSupport.getInstance().fetchResourcesByRequirementsAndModelNames(new String[]{"AudioTimeAlignModel"}, C2097608Jq.LJIIJ(new Pair("AudioTimeAlignModel", C1697810uHb.LJIILJJIL("time_align_44k.model"))), new IFetchResourceListener() { // from class: X.0tJs
            @Override // com.ss.android.ugc.effectmanager.IFetchResourceListener
            public final void onFailure(Exception exc) {
                function12.invoke(exc);
            }

            @Override // com.ss.android.ugc.effectmanager.IFetchResourceListener
            public final void onSuccess(long j) {
                String strRealFindResourceUri = C13Q5.LIZ().LIZLLL().realFindResourceUri(0, null, "time_align_44k.model");
                if (TextUtils.isEmpty(strRealFindResourceUri)) {
                    function1.invoke("");
                } else {
                    function1.invoke(URI.create(strRealFindResourceUri).getPath());
                }
            }
        });
    }
}
