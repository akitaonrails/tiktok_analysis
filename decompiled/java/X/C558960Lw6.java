package X;

import Y.AObserverS212S0100000_8;
import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.LiveData;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.aigc.quality.mob.business.AIGCEntranceInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.common.UsageStatus;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.theater.model.AITheaterCreationModel;
import com.ss.android.ugc.aweme.theater.model.AITheaterGenerationModel;
import com.ss.android.ugc.aweme.theater.model.AITheaterModel;
import com.ss.android.ugc.aweme.theater.service.IAITheaterCreationLauncher;
import com.ss.android.ugc.aweme.theater.service.IAITheaterFeatureService;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.AwS409S0200000_8;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS96S0110000_8;

/* JADX INFO: renamed from: X.0Lw6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C558960Lw6 extends AbstractC2255721DQs<InterfaceC1456730o0l> implements InterfaceC1456730o0l, InterfaceC379610EuV {
    public static final C558970Lw7 LLJIJIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public static final int LLJILJILJ;
    public final C1DRG LL;
    public boolean LLIZ;
    public final InterfaceC1456730o0l LLILLJJLI = this;
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1453420nvQ.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1455610nyx.class, null);
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1446740nke.class, null);
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 616));
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS552S0100000_8(this, 615));
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS552S0100000_8(this, 614));

    /* JADX WARN: Type inference failed for: r0v9, types: [X.0Lw7] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C558960Lw6.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C13LE.LIZ.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C558960Lw6.class, "editExitApi", "getEditExitApi()Lcom/ss/android/ugc/gamora/editor/exit/EditExitApiComponent;", 0), new C2217381BqS(C558960Lw6.class, "editToolbarApi", "getEditToolbarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/BaseEditToolbarApi;", 0), new C2217381BqS(C558960Lw6.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/gamora/editor/preview/TiktokEditPreviewApi;", 0)};
        LLJIJIL = new Object() { // from class: X.0Lw7
        };
        LLJILJILJ = 8;
    }

    private final InterfaceC1446740nke JY0() {
        return (InterfaceC1446740nke) this.LLILZLL.getValue(this, LLJILJIL[3]);
    }

    private final InterfaceC1453420nvQ X1() {
        return (InterfaceC1453420nvQ) this.LLILZ.getValue(this, LLJILJIL[1]);
    }

    private final InterfaceC1455610nyx Z1() {
        return (InterfaceC1455610nyx) this.LLILZIL.getValue(this, LLJILJIL[2]);
    }

    private final IAITheaterCreationLauncher.EnterParams o2() {
        return (IAITheaterCreationLauncher.EnterParams) this.LLJI.getValue();
    }

    @Override // X.InterfaceC1456730o0l
    public void A40() {
        C548880Lfq c548880Lfq = C548880Lfq.LIZ;
        C1E3D c1e3d = C1E3D.LJIIIIZZ;
        AIGCEntranceInfo aIGCEntranceInfoW2 = w2();
        AFwS239S0000000_8 aFwS239S0000000_8 = AFwS239S0000000_8.get$arr$(260);
        c548880Lfq.getClass();
        C548880Lfq.LIZLLL(c1e3d, aIGCEntranceInfoW2, aFwS239S0000000_8);
    }

    public final CreativeModel G2() {
        return (CreativeModel) this.LLIZLLLIL.getValue();
    }

    public final VideoPublishEditModel getEditModel() {
        return (VideoPublishEditModel) this.LLILLL.getValue(this, LLJILJIL[0]);
    }

    public final AIGCEntranceInfo w2() {
        return (AIGCEntranceInfo) this.LLJ.getValue();
    }

    private final void H2() {
        AITheaterCreationModel creationModel;
        AITheaterGenerationModel aITheaterGenerationModel;
        AITheaterModel aITheaterModel = getEditModel().getAIGCBusinessModel().aiTheaterModel;
        if (aITheaterModel == null) {
            return;
        }
        AITheaterModel aITheaterModel2 = getEditModel().getAIGCBusinessModel().aiTheaterModel;
        if (aITheaterModel2 == null || (creationModel = aITheaterModel2.getCreationModel()) == null || (aITheaterGenerationModel = creationModel.generationModel) == null) {
            return;
        }
        String clientTaskId = aITheaterGenerationModel.getClientTaskId();
        if (clientTaskId == null || clientTaskId.length() == 0) {
            return;
        }
        UsageStatus usageStatus = UsageStatus.SUCCESS_APPLY;
        if (C1697810uHb.LJIIJJI(usageStatus, UsageStatus.FAIL).contains(aITheaterGenerationModel.getStatus())) {
            Keva keva = C548360Lf0.LIZ;
            if (C548360Lf0.LIZ(aITheaterGenerationModel.getClientTaskId(), aITheaterGenerationModel.getServerTaskId())) {
                InterfaceC548750Lfd interfaceC548750LfdLIZ = C548910Lft.LIZ(getEditModel().creativeModel);
                InterfaceC548750Lfd interfaceC548750LfdLIZ2 = interfaceC548750LfdLIZ != null ? C548790Lfh.LIZ(interfaceC548750LfdLIZ, aITheaterModel) : null;
                boolean z = aITheaterGenerationModel.getStatus() == usageStatus;
                C548880Lfq c548880Lfq = C548880Lfq.LIZ;
                C2274991E2v c2274991E2v = C2274991E2v.LJIIIIZZ;
                AwS96S0110000_8 awS96S0110000_8 = new AwS96S0110000_8(z, aITheaterGenerationModel, 13);
                c548880Lfq.getClass();
                C548880Lfq.LIZLLL(c2274991E2v, interfaceC548750LfdLIZ2, awS96S0110000_8);
            }
        }
    }

    public final void T2() {
        String str;
        AITheaterModel aITheaterModel = getEditModel().getAIGCBusinessModel().aiTheaterModel;
        if (aITheaterModel == null || this.LLIZ || !C547980LeO.LJI(aITheaterModel)) {
            return;
        }
        if (aITheaterModel.getCreationModel().generationModel.GO() == UsageStatus.LOADING) {
            this.LLIZ = true;
            C546230LbZ c546230LbZLIZ = C546330Lbj.LIZ(C0LOK.LIZ);
            C546400Lbq<Object> c546400LbqLIZJ = c546230LbZLIZ != null ? c546230LbZLIZ.LIZJ() : null;
            InterfaceC1453420nvQ interfaceC1453420nvQX1 = X1();
            if (interfaceC1453420nvQX1 != null) {
                if (c546400LbqLIZJ == null || (str = c546400LbqLIZJ.LIZ) == null) {
                    str = "";
                }
                interfaceC1453420nvQX1.Ys0(str, c546400LbqLIZJ != null ? c546400LbqLIZJ.LIZIZ : 0, AFwS194S0000000_8.get$arr$(283), AFwS194S0000000_8.get$arr$(284), new AwS409S0200000_8(aITheaterModel, this, 80));
            }
        }
    }

    @Override // X.InterfaceC1456730o0l
    public void fq() {
        IAITheaterCreationLauncher.EnterParams enterParamsO2;
        InterfaceC1460000o62 interfaceC1460000o62;
        IAITheaterCreationLauncher iAITheaterCreationLauncherLIZ;
        Context context = (Context) getDiContainer().LJIIL(null, Activity.class);
        if (context == null || (enterParamsO2 = o2()) == null) {
            return;
        }
        T2();
        C548880Lfq c548880Lfq = C548880Lfq.LIZ;
        C1E3C c1e3c = C1E3C.LJIIIIZZ;
        AIGCEntranceInfo aIGCEntranceInfoW2 = w2();
        AFwS239S0000000_8 aFwS239S0000000_8 = AFwS239S0000000_8.get$arr$(260);
        c548880Lfq.getClass();
        C548880Lfq.LIZLLL(c1e3c, aIGCEntranceInfoW2, aFwS239S0000000_8);
        IAITheaterFeatureService.LIZ.getClass();
        IAITheaterFeatureService iAITheaterFeatureServiceLIZ = C549720LhC.LIZ();
        if (iAITheaterFeatureServiceLIZ != null && (iAITheaterCreationLauncherLIZ = iAITheaterFeatureServiceLIZ.LIZ()) != null) {
            iAITheaterCreationLauncherLIZ.LJFF(enterParamsO2, context, true);
        }
        InterfaceC1455610nyx interfaceC1455610nyxZ1 = Z1();
        if (!(interfaceC1455610nyxZ1 instanceof InterfaceC1460000o62) || (interfaceC1460000o62 = (InterfaceC1460000o62) interfaceC1455610nyxZ1) == null) {
            return;
        }
        interfaceC1460000o62.Kv2();
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        LiveData<Void> liveDataWw2;
        super.onCreate();
        InterfaceC1446740nke interfaceC1446740nkeJY0 = JY0();
        if (interfaceC1446740nkeJY0 != null && (liveDataWw2 = interfaceC1446740nkeJY0.ww2()) != null) {
            liveDataWw2.observe(this, new AObserverS212S0100000_8(this, 63));
        }
        H2();
    }

    public InterfaceC1456730o0l W1() {
        return this.LLILLJJLI;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C558960Lw6(C1DRG c1drg) {
        this.LL = c1drg;
    }
}
