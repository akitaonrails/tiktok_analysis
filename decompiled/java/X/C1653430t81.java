package X;

import Y.AObjectS246S0100000_25;
import Y.ARunnableS125S0100000_25;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.bytedance.als.LiveEvent;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.vesdk.runtime.VEMem;
import kotlin.jvm.internal.AFwS214S0000000_25;
import mn3.e0;

/* JADX INFO: renamed from: X.0t81, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1653430t81 extends AbstractC2255721DQs<InterfaceC1646630sx3> implements InterfaceC1646630sx3, InterfaceC379610EuV {
    public static final C1653440t82 LLJI;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public static final int LLJILJIL;
    public final C19A3 LL;
    public final C1DRG LLILLJJLI;
    public boolean LLILZLL;
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZIZ(getDiContainer(), e0.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), ShortVideoContext.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZIZ(getDiContainer(), C565600MGg.class, null);
    public final Handler LLIZ = new BPEAHandler(Looper.getMainLooper());
    public Runnable LLIZLLLIL = new ARunnableS125S0100000_25(this, 15);
    public final InterfaceC1646630sx3 LLJ = this;

    /* JADX WARN: Type inference failed for: r0v7, types: [X.0t82] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1653430t81.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/TikTokCameraApiComponent;", 0);
        C13LE.LIZ.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C1653430t81.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0), new C2217381BqS(C1653430t81.class, "componentizationConfig", "getComponentizationConfig()Lcom/ss/android/ugc/aweme/shortvideo/ui/RecordContainerComponentizationConfig;", 0)};
        LLJI = new Object() { // from class: X.0t82
        };
        LLJILJIL = 8;
    }

    private final C565600MGg getComponentizationConfig() {
        return (C565600MGg) this.LLILZIL.getValue(this, LLJIJIL[2]);
    }

    public final e0 getCameraApiComponent() {
        return (e0) this.LLILLL.getValue(this, LLJIJIL[0]);
    }

    public final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LLILZ.getValue(this, LLJIJIL[1]);
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        LiveEvent<Long> liveEventXF1;
        super.onCreate();
        e0 cameraApiComponent = getCameraApiComponent();
        if (cameraApiComponent != null && (liveEventXF1 = cameraApiComponent.xF1()) != null) {
            liveEventXF1.LIZ(this, new AObjectS246S0100000_25(this, 121));
        }
        C565600MGg componentizationConfig = getComponentizationConfig();
        if (componentizationConfig == null || !componentizationConfig.LIZ) {
            return;
        }
        C1457570o27.LJ(getShortVideoContext().creativeInfo.getCreationId(), "video_shoot_page", "video_shoot_page", getShortVideoContext().LJJJJZI());
    }

    @Override // X.AbstractC2255721DQs
    public void onPause() {
        super.onPause();
        C565600MGg componentizationConfig = getComponentizationConfig();
        if (componentizationConfig == null || !componentizationConfig.LIZ) {
            return;
        }
        VEMem.getInstance().uploadVirtualMemSize(1);
    }

    @Override // X.AbstractC2255721DQs
    public void onResume() {
        super.onResume();
        C565600MGg componentizationConfig = getComponentizationConfig();
        if (componentizationConfig == null || !componentizationConfig.LIZ) {
            return;
        }
        VEMem.getInstance().uploadVirtualMemSize(0);
    }

    public InterfaceC1646630sx3 W1() {
        return this.LLJ;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLJ;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLILLJJLI;
    }

    public final C19A3 getParentScene() {
        return this.LL;
    }

    @Override // X.InterfaceC1646630sx3
    public void fD0(View view) {
        C830490Whz<String, C1653210t7f> c830490Whz = C1650090t2d.LIZIZ;
        C1653210t7f c1653210t7f = c830490Whz.get("click_switch_record_mode");
        if (c1653210t7f != null) {
            C1653260t7k.LJ("click_switch_record_mode", c1653210t7f);
            c830490Whz.remove("click_switch_record_mode");
        }
        this.LLIZ.removeCallbacks(this.LLIZLLLIL);
        this.LLILZLL = true;
        C1653260t7k.LIZ("click_switch_record_mode");
        C0T6J.LIZ(view, AFwS214S0000000_25.get$arr$(120));
        C786410Ut5.LJLIIL(Mp4ScreenVideoLoadTimeout.CONTROL, this.LLIZ, this.LLIZLLLIL);
    }

    public C1653430t81(C19A3 c19a3, C1DRG c1drg) {
        this.LL = c19a3;
        this.LLILLJJLI = c1drg;
    }
}
