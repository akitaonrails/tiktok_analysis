package X;

import Y.ARunnableS125S0100000_25;
import android.webkit.URLUtil;
import com.bytedance.ttnet.TTNetInit;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialog;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.tiktok.tools.performance.api.services.IVEVideoStreamDownloadService;
import com.ss.android.ugc.tiktok.tools.performance.api.settings.DuetVideoDownloadOptConfig;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS139S1100000_25;
import kotlin.jvm.internal.AwS426S0200000_25;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS604S0100000_25;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0tAu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1655220tAu extends AbstractC2255721DQs<InterfaceC1648050szL> implements InterfaceC1648050szL, InterfaceC379610EuV {
    public static final C1655240tAw LLJJI;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIII;
    public static final int LLJJIJI;
    public static final int LLJJIJIIJIL = 100;
    public final C1DRG LL;
    public C09AE LLJI;
    public InterfaceC1663080tNa LLJIJIL;
    public String LLJILJIL;
    public volatile int LLJILJILJ;
    public Function0<Unit> LLJILLL;
    public final InterfaceC1731706qJ LLILLJJLI = C1664770tQJ.LIZ(getDiContainer(), C19EG.class, null);
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1648570t0B.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), ShortVideoContext.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1630630sXF.class, null);
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1650230t2r.class, null);
    public final SafeHandler LLIZ = new SafeHandler(this);
    public final InterfaceC497601wk LLIZLLLIL = C2296808zG.LIZ(C0PEM.LIZJ.plus(C2296908zH.LIZ()));
    public final AtomicBoolean LLJ = new AtomicBoolean(false);
    public final C01GW LLJJ = C452501pT.LIZIZ(new AwS569S0100000_25(this, 267));

    /* JADX WARN: Type inference failed for: r0v11, types: [X.0tAw] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1655220tAu.class, "activity", "getActivity()Landroidx/fragment/app/FragmentActivity;", 0);
        C13LE.LIZ.getClass();
        LLJJIII = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C1655220tAu.class, "recordController", "getRecordController()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0), new C2217381BqS(C1655220tAu.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0), new C2217381BqS(C1655220tAu.class, "controlProgressApi", "getControlProgressApi()Lcom/ss/android/ugc/gamora/recorder/progress/LighteningControlProgressApiComponent;", 0), new C2217381BqS(C1655220tAu.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0)};
        LLJJI = new Object() { // from class: X.0tAw
        };
        LLJJIJI = 8;
    }

    public InterfaceC1648050szL Z1() {
        return this;
    }

    private final InterfaceC1648570t0B G2() {
        return (InterfaceC1648570t0B) this.LLILLL.getValue(this, LLJJIII[1]);
    }

    private final InterfaceC1650230t2r getCameraApiComponent() {
        return (InterfaceC1650230t2r) this.LLILZLL.getValue(this, LLJJIII[4]);
    }

    private final void v3() {
        String str = this.LLJILJIL;
        if (str == null) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("stopStreamDownload url=");
        sbLIZ.append(str);
        W2(C2188811AlT.LIZIZ(sbLIZ));
        IVEVideoStreamDownloadService iVEVideoStreamDownloadService = (IVEVideoStreamDownloadService) PluggableExtentionKt.pluggableSpi$default(IVEVideoStreamDownloadService.class, false, false, false, 14, null);
        if (iVEVideoStreamDownloadService != null) {
            iVEVideoStreamDownloadService.LIZIZ(str);
        }
        this.LLJILJIL = null;
    }

    @Override // X.InterfaceC1648050szL
    public void Mc0() {
        if (this.LLJILLL == null) {
            return;
        }
        W2("record button reset, abort pending + dismiss loading + reset button(incl. long-press PAUSE) to idle + restore controls");
        this.LLJILLL = null;
        if (w2().isShowing()) {
            w2().dismiss();
        }
        G2().z80(0L);
        InterfaceC1650230t2r cameraApiComponent = getCameraApiComponent();
        if (cameraApiComponent != null) {
            cameraApiComponent.Zl0(new C1663770tOh(true, false, false));
        }
        this.LLIZ.post(new ARunnableS125S0100000_25(this, 20));
    }

    public final C19EG getActivity() {
        return (C19EG) this.LLILLJJLI.getValue(this, LLJJIII[0]);
    }

    public final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LLILZ.getValue(this, LLJJIII[2]);
    }

    public final void m3() {
        Function0<Unit> function0 = this.LLJILLL;
        if (function0 == null) {
            return;
        }
        this.LLJILLL = null;
        W2("resume pending record");
        function0.invoke();
    }

    public final InterfaceC1630630sXF o2() {
        return (InterfaceC1630630sXF) this.LLILZIL.getValue(this, LLJJIII[3]);
    }

    public final CreativeLoadingDialog w2() {
        return (CreativeLoadingDialog) this.LLJJ.getValue();
    }

    private final void H2() {
        String str = getShortVideoContext().cameraComponentModel.duetContext.duetVideoPath;
        if (str == null || a0.LJJJIL(str)) {
            W2("duet no duetVideoPath, skip");
            this.LLJ.set(true);
            return;
        }
        if (URLUtil.isNetworkUrl(str)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("duet streaming wait completion path=");
            sbLIZ.append(str);
            W2(C2188811AlT.LIZIZ(sbLIZ));
            c3(str, new AwS604S0100000_25(this, 145), new AwS139S1100000_25(this, str, 3), new AwS569S0100000_25(this, 266));
            q3();
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("duet local path=");
        sbLIZ2.append(str);
        sbLIZ2.append(", generate aigcInfo directly");
        W2(C2188811AlT.LIZIZ(sbLIZ2));
        this.LLJ.set(true);
        if (C1383720m70.LIZ().loadAigcInfoInRecord) {
            B3(str);
        }
    }

    private final boolean W1() {
        return getShortVideoContext().LJI().isEmpty();
    }

    private final void q3() {
        if (C1383720m70.LIZ().showRecordLoading) {
            G2().Iv2(new InterfaceC579090MnT() { // from class: X.0tAv
                @Override // X.InterfaceC579090MnT
                public final void LIZ(AwS426S0200000_25 awS426S0200000_25) {
                    if (this.LIZ.LLJ.get()) {
                        this.LIZ.X1();
                        awS426S0200000_25.invoke();
                        return;
                    }
                    DuetVideoDownloadOptConfig duetVideoDownloadOptConfigLIZ = C1383720m70.LIZ();
                    C1661300tKi.LIZ.getClass();
                    int effectiveConnectionType = TTNetInit.getEffectiveConnectionType();
                    if (effectiveConnectionType >= duetVideoDownloadOptConfigLIZ.showLoadingNetLevel && this.LIZ.LLJILJILJ >= duetVideoDownloadOptConfigLIZ.showLoadingProgressLevel) {
                        awS426S0200000_25.invoke();
                        return;
                    }
                    C1655220tAu c1655220tAu = this.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("intercept record: stream not ready, show loading and hold record. netLevel=");
                    sbLIZ.append(effectiveConnectionType);
                    sbLIZ.append(" progress=");
                    sbLIZ.append(this.LIZ.LLJILJILJ);
                    c1655220tAu.W2(C2188811AlT.LIZIZ(sbLIZ));
                    C1655220tAu c1655220tAu2 = this.LIZ;
                    c1655220tAu2.LLJILLL = awS426S0200000_25;
                    if (!c1655220tAu2.w2().isShowing()) {
                        this.LIZ.w2().show();
                    }
                }
            });
        }
    }

    public final void X1() {
        G2().Iv2(null);
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        if (C1443960ngA.LJII(getShortVideoContext())) {
            H2();
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        InterfaceC1663080tNa interfaceC1663080tNa = this.LLJIJIL;
        if (interfaceC1663080tNa != null) {
            IVEVideoStreamDownloadService iVEVideoStreamDownloadService = (IVEVideoStreamDownloadService) PluggableExtentionKt.pluggableSpi$default(IVEVideoStreamDownloadService.class, false, false, false, 14, null);
            if (iVEVideoStreamDownloadService != null) {
                iVEVideoStreamDownloadService.LIZ(interfaceC1663080tNa);
            }
            this.LLJIJIL = null;
        }
        v3();
        X1();
        this.LLJILLL = null;
        if (w2().isShowing()) {
            w2().dismiss();
        }
        C2296808zG.LIZJ(this.LLIZLLLIL, null);
    }

    @Override // X.AbstractC2255721DQs
    public void onResume() {
        super.onResume();
        Mc0();
    }

    @Override // X.AbstractC2255721DQs
    public void onStop() {
        super.onStop();
        Mc0();
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

    public C1655220tAu(C1DRG c1drg) {
        this.LL = c1drg;
    }

    private final void B3(String str) {
        if (((Boolean) C275790ArR.LIZ.getValue()).booleanValue() && C275780ArQ.LIZJ()) {
            C09AE c09ae = this.LLJI;
            if (c09ae != null) {
                c09ae.LIZIZ(null);
            }
            this.LLJI = C23250099c.LIZLLL(this.LLIZLLLIL, null, null, new C2401709b5(str, this, null), 3);
            return;
        }
        W2("C2PADuetExperiment disabled, skip aigcInfo");
    }

    public final void W2(String str) {
        C201955140j.LIZLLL(C20102213l6.LIZIZ, "VEVideoStream：RecordVideoStreamLoadComponent", str);
    }

    public final void T2(String str, String str2) {
        if (!this.LLJ.compareAndSet(false, true)) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handleDuetStreamFinished originUrl=");
        sbLIZ.append(str);
        sbLIZ.append(" localPath=");
        sbLIZ.append(str2);
        W2(C2188811AlT.LIZIZ(sbLIZ));
        if (W1()) {
            getShortVideoContext().cameraComponentModel.duetContext.duetVideoPath = str2;
            getShortVideoContext().cameraComponentModel.duetContext.duetAudioPath = str2;
            getShortVideoContext().cameraComponentModel.duetContext.duetOriginId = str2;
            W2("duet path replaced (duetVideoPath/duetAudioPath/duetOriginId)");
        }
        B3(str2);
        if (w2().isShowing()) {
            w2().dismiss();
        }
        X1();
        m3();
    }

    private final void c3(String str, Function1<? super Float, Unit> function1, Function1<? super String, Unit> function12, Function0<Unit> function0) {
        IVEVideoStreamDownloadService iVEVideoStreamDownloadService = (IVEVideoStreamDownloadService) PluggableExtentionKt.pluggableSpi$default(IVEVideoStreamDownloadService.class, false, false, false, 14, null);
        if (iVEVideoStreamDownloadService == null) {
            W2("no IVEVideoStreamDownloadService SPI, fallback by url");
            function12.invoke(str);
        } else {
            C1661520tL4 c1661520tL4 = new C1661520tL4(str, function1, function12, function0);
            this.LLJIJIL = c1661520tL4;
            this.LLJILJIL = str;
            iVEVideoStreamDownloadService.LIZJ(c1661520tL4);
        }
    }
}
