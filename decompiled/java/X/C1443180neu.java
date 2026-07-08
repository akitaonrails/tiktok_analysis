package X;

import Y.AfS191S0100000_22;
import androidx.lifecycle.Lifecycle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.ImageSurfaceData;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.port.internal.IInternalDraftSizeCalculator;
import com.ss.android.ugc.aweme.port.internal.IPublishGuideDraftService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS601S0100000_22;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: renamed from: X.0neu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1443180neu extends AbstractC2255721DQs<InterfaceC559500Lwy> implements InterfaceC559500Lwy, InterfaceC379610EuV {
    public static final C1443190nev LLJILJILJ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILLL;
    public static final int LLJJ;
    public final C1DRG LL;
    public volatile boolean LLILLJJLI;
    public boolean LLILLL;
    public InterfaceC420801kM LLIZ;
    public VideoPublishEditModel LLIZLLLIL;
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1450920nrO.class, null);
    public final C11RK<Boolean> LLILZLL = new C11RK<>();
    public final InterfaceC1731706qJ LLJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1451320ns2.class, null);
    public final InterfaceC1731706qJ LLJI = C1664770tQJ.LIZIZ(getDiContainer(), C0EB6.class, null);
    public final InterfaceC1731706qJ LLJIJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC377540ErA.class, null);
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 460));

    /* JADX WARN: Type inference failed for: r0v11, types: [X.0nev] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1443180neu.class, "publishEditModel", "getPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C13LE.LIZ.getClass();
        LLJILLL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C1443180neu.class, "imageIsolateClipEditApi", "getImageIsolateClipEditApi()Lcom/ss/android/ugc/aweme/image/base/ImageIsolateClipEditApi;", 0), new C2217381BqS(C1443180neu.class, "photoTemplateApi", "getPhotoTemplateApi()Lcom/ss/android/ugc/aweme/image/phototemplate/PhotoTemplateApi;", 0), new C2217381BqS(C1443180neu.class, "epPanelApi", "getEpPanelApi()Lcom/ss/android/ugc/gamora/editorpro/framework/panel/EPPanelApiComponent;", 0), new C2217381BqS(C1443180neu.class, "editorProApi", "getEditorProApi()Lcom/ss/android/ugc/gamora/editorpro/EditorProApi;", 0)};
        LLJILJILJ = new Object() { // from class: X.0nev
        };
        LLJJ = 8;
    }

    public InterfaceC559500Lwy Z1() {
        return this;
    }

    @Override // X.InterfaceC559500Lwy
    public boolean fz() {
        return false;
    }

    @Override // X.InterfaceC559500Lwy
    public void wQ1() {
        this.LLILLL = true;
    }

    private final C0EB6 G2() {
        return (C0EB6) this.LLJI.getValue(this, LLJILLL[3]);
    }

    private final InterfaceC1450920nrO H2() {
        return (InterfaceC1450920nrO) this.LLILZIL.getValue(this, LLJILLL[1]);
    }

    private final VideoPublishEditModel LJJJLIIL() {
        return (VideoPublishEditModel) this.LLILZ.getValue(this, LLJILLL[0]);
    }

    private final InterfaceC1451320ns2 T2() {
        return (InterfaceC1451320ns2) this.LLJ.getValue(this, LLJILLL[2]);
    }

    private final C0E48 o2() {
        return (C0E48) this.LLJILJIL.getValue();
    }

    private final InterfaceC377540ErA w2() {
        return (InterfaceC377540ErA) this.LLJIJIL.getValue(this, LLJILLL[4]);
    }

    @Override // X.InterfaceC559500Lwy
    public void Rm2() {
        InterfaceC420801kM interfaceC420801kM = this.LLIZ;
        if (interfaceC420801kM == null || interfaceC420801kM.isDisposed()) {
            return;
        }
        interfaceC420801kM.dispose();
    }

    private final boolean W2() {
        InterfaceC1451320ns2 interfaceC1451320ns2T2 = T2();
        return interfaceC1451320ns2T2 != null && interfaceC1451320ns2T2.LJJII();
    }

    @Override // X.InterfaceC559500Lwy
    public void Bw0() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ImageEditAutoSaveDraftComponent recoverDraft ");
        sbLIZ.append(this.LLIZLLLIL);
        C201955140j.LJIIL(C2188811AlT.LIZIZ(sbLIZ));
        Rm2();
        VideoPublishEditModel videoPublishEditModel = this.LLIZLLLIL;
        if (videoPublishEditModel != null) {
            if (videoPublishEditModel.getImageAlbumData() == null) {
                C201955140j.LJ("ImageEditAutoSaveDraftComponent recoverDraft imageAlbumData null");
            } else {
                C23250099c.LIZLLL(C2296808zG.LIZ(C576120Mig.LIZ), null, null, new C1443160nes(videoPublishEditModel, this, null), 3);
            }
        }
    }

    public final void W1() {
        if (C275500Aqy.LIZ() && C1428520nHG.LJJJJJ(LJJJLIIL())) {
            LJJJLIIL().setCreationMode(2);
            ImageAlbumData imageAlbumData = LJJJLIIL().getImageAlbumData();
            if (imageAlbumData != null) {
                imageAlbumData.setSingleWhenInit(true);
            }
        }
    }

    public final void X1() {
        if (C275500Aqy.LIZ() && C1428520nHG.LJJJJJ(LJJJLIIL())) {
            LJJJLIIL().setCreationMode(1);
            ImageAlbumData imageAlbumData = LJJJLIIL().getImageAlbumData();
            if (imageAlbumData != null) {
                imageAlbumData.setSingleWhenInit(false);
            }
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        C201955140j.LJIIL("ImageEditAutoSaveDraftComponent onCreate");
        if (LJJJLIIL().creativeModel.draftInfoModel.isDraft && !LJJJLIIL().isFromRestoreRecover()) {
            EventBus.LIZLLL().LJIJJ(this);
            this.LLIZLLLIL = VideoPublishEditModel.makeCopy(LJJJLIIL());
        }
        this.LLIZ = this.LLILZLL.LJIL(((Number) C0BRV.LIZ.getValue()).longValue(), TimeUnit.MILLISECONDS).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS191S0100000_22(this, 19));
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        Rm2();
        EventBus.LIZLLL().LJJI(this);
        super.onDestroy();
    }

    @Override // X.AbstractC2255721DQs
    public void onResume() {
        super.onResume();
        this.LLILLL = false;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        Z1();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C1443180neu(C1DRG c1drg) {
        this.LL = c1drg;
    }

    private final void c3(boolean z) {
        if (this.LLILLJJLI) {
            return;
        }
        this.LLILZLL.onNext(Boolean.valueOf(z));
    }

    @Override // X.InterfaceC559500Lwy
    public void Qk(boolean z) {
        if (!this.LLILLJJLI && !W2()) {
            InterfaceC420801kM interfaceC420801kM = this.LLIZ;
            if (interfaceC420801kM != null && interfaceC420801kM.isDisposed()) {
                return;
            }
            this.LLILZLL.onNext(Boolean.valueOf(z));
        }
    }

    public final void m3(C540340LHc c540340LHc) {
        this.LLILLJJLI = false;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ImageEditAutoSaveDraftComponent saveDraftInternal save draft done ");
        sbLIZ.append(c540340LHc.LIZ.isSuc());
        C201955140j.LJIIL(C2188811AlT.LIZIZ(sbLIZ));
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onEvent(C856010Xi3 c856010Xi3) {
        Bw0();
    }

    public final void q3(boolean z) {
        InterfaceC1450920nrO interfaceC1450920nrOH2;
        VideoPublishEditModel videoPublishEditModelLJJJLIIL;
        ImageSurfaceData surfaceData;
        Unit unit;
        IInternalDraftSizeCalculator iInternalDraftSizeCalculatorLIZIZ;
        if (!z && !getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.RESUMED)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ImageEditAutoSaveDraftComponent saveDraftInternal ");
            sbLIZ.append(getLifecycle().getCurrentState());
            C201955140j.LJIIL(C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        if (this.LLILLL) {
            C201955140j.LJIIL("ImageEditAutoSaveDraftComponent saveDraftInternal be canceled");
            return;
        }
        try {
            IPublishGuideDraftService iPublishGuideDraftService = (IPublishGuideDraftService) PluggableExtentionKt.pluggableSpi$default(IPublishGuideDraftService.class, false, false, false, 14, null);
            if (iPublishGuideDraftService != null && (iInternalDraftSizeCalculatorLIZIZ = iPublishGuideDraftService.LIZIZ()) != null) {
                iInternalDraftSizeCalculatorLIZIZ.LJFF(LJJJLIIL());
                unit = Unit.LIZ;
            } else {
                unit = null;
            }
            C189200o6.m2constructorimpl(unit);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        this.LLILLJJLI = true;
        if ((!C275500Aqy.LIZ() || !C1428520nHG.LJJJJJ(LJJJLIIL())) && (interfaceC1450920nrOH2 = H2()) != null) {
            interfaceC1450920nrOH2.T22(false, null);
        }
        ImageAlbumData imageAlbumData = LJJJLIIL().getImageAlbumData();
        if (imageAlbumData != null && (surfaceData = imageAlbumData.getSurfaceData()) != null) {
            C574070MfN.LJIIIZ(surfaceData);
        }
        if (C1428470nHB.LJJJLIIL(LJJJLIIL())) {
            C201955140j.LJIIL("ImageEditAutoSaveDraftComponent saveDraftInternal check point");
            W1();
            C573960MfC.LIZ(C0CHQ.LIZ().LJIIJ(), LJJJLIIL(), LJJJLIIL().getCreationId(), 4, new AwS601S0100000_22(this, 322), 8);
        } else {
            C201955140j.LJIIL("ImageEditAutoSaveDraftComponent saveDraftInternal save draft");
            if (((Boolean) C0BDY.LIZ.getValue()).booleanValue()) {
                videoPublishEditModelLJJJLIIL = LJJJLIIL().clone();
            } else {
                videoPublishEditModelLJJJLIIL = LJJJLIIL();
            }
            videoPublishEditModelLJJJLIIL.creativeModel.draftInfoModel.saveDraftScene = "silence";
            C23250099c.LIZLLL(C2296808zG.LIZ(C576120Mig.LIZ), null, null, new C1443170net(videoPublishEditModelLJJJLIIL, this, null), 3);
        }
    }
}
