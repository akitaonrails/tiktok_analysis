package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.ss.android.ugc.aweme.edit.Cut2EditTransferModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.services.audio.IVoiceDetectorService;
import com.ss.android.ugc.aweme.services.audio.VoiceDetectionParam;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editor.music.experiment.AutoMusicRecommendConfig;
import com.ss.android.ugc.gamora.editor.services.IMusicEditService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0o19, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1456970o19 extends AbstractC2255721DQs<InterfaceC1452470ntt> implements InterfaceC1452470ntt, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZLLLIL;
    public final C1DRG LL;
    public int LLILZLL;
    public final InterfaceC1731706qJ LLILLJJLI = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1455860nzM.class, null);
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1455850nzL.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1455620nyy.class, null);
    public final C01GW LLIZ = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(201));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1456970o19.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1456970o19.class, "publishEditModel", "getPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1456970o19.class, "editAdapterApi", "getEditAdapterApi()Lcom/ss/android/ugc/gamora/editor/adapter/EditAdapterApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C1456970o19.class, "silentAutoCaptionApiComponent", "getSilentAutoCaptionApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/subtitle/SilentAutoCaptionApiComponent;", 0);
        c09r3.getClass();
        LLIZLLLIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4};
    }

    public InterfaceC1452470ntt X1() {
        return this;
    }

    private final InterfaceC1455620nyy G2() {
        return (InterfaceC1455620nyy) this.LLILZIL.getValue(this, LLIZLLLIL[3]);
    }

    private final VideoPublishEditModel LJJJLIIL() {
        return (VideoPublishEditModel) this.LLILLL.getValue(this, LLIZLLLIL[1]);
    }

    private final InterfaceC1455850nzL Z1() {
        return (InterfaceC1455850nzL) this.LLILZ.getValue(this, LLIZLLLIL[2]);
    }

    private final InterfaceC1455860nzM o2() {
        return (InterfaceC1455860nzM) this.LLILLJJLI.getValue(this, LLIZLLLIL[0]);
    }

    private final IMusicEditService w2() {
        return (IMusicEditService) this.LLIZ.getValue();
    }

    private final void W1() {
        ((IVoiceDetectorService) ServiceManager.get().getService(IVoiceDetectorService.class)).clearVoiceActivityDetection(1);
    }

    @Override // X.InterfaceC1452470ntt
    public void RJ0() {
        InterfaceC1452170ntP value;
        NLEModel nLEModelLIZ;
        Cut2EditTransferModel cut2EditTransferModel;
        C1402840mbq shareContext;
        if (C289270BVl.LIZ()) {
            return;
        }
        if (((Boolean) C0BNB.LIZ.getValue()).booleanValue()) {
            C1429890nJT mainBusinessContext = LJJJLIIL().getMainBusinessContext();
            if (Intrinsics.LJFF((mainBusinessContext == null || (shareContext = mainBusinessContext.getShareContext()) == null) ? null : shareContext.mAppName, "CapCut") && !C1416310mxZ.LJIIIZ(LJJJLIIL())) {
                return;
            }
        }
        if ((((Boolean) C0B9Z.LIZ.getValue()).booleanValue() && (cut2EditTransferModel = LJJJLIIL().getCut2EditTransferModel()) != null && cut2EditTransferModel.getMusicSyncMode()) || (value = o2().g().getValue()) == null || (nLEModelLIZ = C352130DrH.LIZ(value)) == null) {
            return;
        }
        C0CHQ.LIZ().initDownloadableModel();
        H2(nLEModelLIZ);
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        InterfaceC1455850nzL interfaceC1455850nzLZ1 = Z1();
        if (interfaceC1455850nzLZ1 != null) {
            interfaceC1455850nzLZ1.R71(this);
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        W1();
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        X1();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C1456970o19(C1DRG c1drg) {
        this.LL = c1drg;
    }

    private final void H2(NLEModel nLEModel) {
        eg1(NLEModel.dynamicCast(nLEModel.deepClone(false)), null);
    }

    @Override // X.InterfaceC1452470ntt
    public void eg1(NLEModel nLEModel, Function0<Unit> function0) {
        boolean z;
        InterfaceC1455620nyy interfaceC1455620nyyG2;
        C01GW c01gw = C1456990o1B.LIZIZ;
        String str = ((AutoMusicRecommendConfig) c01gw.getValue()).aedCheckBusinessType;
        double d = ((AutoMusicRecommendConfig) c01gw.getValue()).aedCheckThresh;
        if (!C1456990o1B.LIZ() && !C1416310mxZ.LJIIIZ(LJJJLIIL())) {
            z = true;
        } else {
            z = false;
        }
        long duration = nLEModel.getDuration() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        int i = this.LLILZLL + 1;
        this.LLILZLL = i;
        VoiceDetectionParam voiceDetectionParam = new VoiceDetectionParam(1, str, d, z, 0L, duration, i, "", 0L, LJJJLIIL().getCreationId(), LJJJLIIL().getMusicId());
        IMusicEditService iMusicEditServiceW2 = w2();
        if (iMusicEditServiceW2 != null) {
            ((IVoiceDetectorService) ServiceManager.get().getService(IVoiceDetectorService.class)).startDetectVoiceActivity(voiceDetectionParam, iMusicEditServiceW2.LIZIZ(System.currentTimeMillis(), nLEModel, LJJJLIIL()), function0);
            if (C1416310mxZ.LJIIIZ(LJJJLIIL()) && (interfaceC1455620nyyG2 = G2()) != null) {
                interfaceC1455620nyyG2.Mf();
                return;
            }
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }
}
