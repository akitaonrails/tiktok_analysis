package X;

import Y.AObjectS246S0100000_25;
import android.view.View;
import android.view.animation.Animation;
import android.widget.ImageView;
import com.bytedance.als.LiveEvent;
import com.bytedance.als.h0;
import com.ss.android.ugc.aweme.shortvideo.RetakeVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.component.a;
import com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0t1p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1649590t1p extends AbstractC2255721DQs<InterfaceC1649660t1w> implements InterfaceC1649660t1w, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJL;
    public static final int LLJJLIIIJLLLLLLLZ;
    public final C1DRG LL;
    public final C19A3 LLILLJJLI;
    public final int LLILLL;
    public final InterfaceC1649660t1w LLILZ = this;
    public final h0<Boolean> LLILZIL;
    public final h0<Boolean> LLILZLL;
    public final h0<Long> LLIZ;
    public final h0<Boolean> LLIZLLLIL;
    public final h0<Pair<List<TimeSpeedModelExtension>, Long>> LLJ;
    public final h0<C443120HZe<List<TimeSpeedModelExtension>, Long, TimeSpeedModelExtension>> LLJI;
    public final h0<Integer> LLJIJIL;
    public final h0<RetakeVideoContext> LLJILJIL;
    public final h0<Pair<List<TimeSpeedModelExtension>, Long>> LLJILJILJ;
    public final h0<C443120HZe<List<TimeSpeedModelExtension>, Long, TimeSpeedModelExtension>> LLJILLL;
    public final C19EG LLJJ;
    public final InterfaceC1731706qJ LLJJI;
    public final InterfaceC1648510t05 LLJJIII;
    public final InterfaceC1731706qJ LLJJIJI;
    public final InterfaceC1731706qJ LLJJIJIIJIL;
    public final InterfaceC1731706qJ LLJJIJIL;
    public final InterfaceC1731706qJ LLJJJ;
    public final InterfaceC1731706qJ LLJJJIL;
    public final InterfaceC1731706qJ LLJJJJ;
    public final int LLJJJJJIL;
    public final C1649560t1m LLJJJJLIIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1649590t1p.class, "planCUIApiComponent", "getPlanCUIApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/component/PlanCUIApiComponent;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1649590t1p.class, "bottomTabApiComponent", "getBottomTabApiComponent()Lcom/ss/android/ugc/gamora/recorder/bottom/BottomTabApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1649590t1p.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C1649590t1p.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C1649590t1p.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(C1649590t1p.class, "fragmentActivity", "getFragmentActivity()Landroidx/fragment/app/FragmentActivity;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS7 = new C2217381BqS(C1649590t1p.class, "recordModeApi", "getRecordModeApi()Lcom/ss/android/ugc/aweme/shortvideo/ui/component/RecordModeApiComponent;", 0);
        c09r3.getClass();
        LLJJL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6, c2217381BqS7};
        LLJJLIIIJLLLLLLLZ = 8;
    }

    private final C1649570t1n W1() {
        C1649570t1n c1649570t1n = new C1649570t1n();
        c1649570t1n.LIZ = getCameraApiComponent();
        c1649570t1n.LIZIZ = getRecordControlApi();
        c1649570t1n.LIZJ = getShortVideoContext();
        c1649570t1n.LIZLLL = this.LLIZ;
        c1649570t1n.LJFF = this.LLJI;
        c1649570t1n.LJ = this.LLJ;
        c1649570t1n.LJI = this.LLJIJIL;
        c1649570t1n.LJII = this.LLJILJIL;
        c1649570t1n.LJIIIIZZ = this.LLJILJILJ;
        c1649570t1n.LJIIIZ = this.LLJILLL;
        c1649570t1n.LJIIJ = this.LLIZLLLIL;
        a planCUIApiComponent = getPlanCUIApiComponent();
        c1649570t1n.LJIIJJI = planCUIApiComponent != null ? planCUIApiComponent.sK0() : null;
        a planCUIApiComponent2 = getPlanCUIApiComponent();
        c1649570t1n.LJIIL = planCUIApiComponent2 != null ? planCUIApiComponent2.va() : null;
        InterfaceC1648510t05 interfaceC1648510t05 = this.LLJJIII;
        c1649570t1n.LJIILIIL = interfaceC1648510t05 != null ? interfaceC1648510t05.JS0() : null;
        InterfaceC1648510t05 interfaceC1648510t052 = this.LLJJIII;
        c1649570t1n.LJIILJJIL = interfaceC1648510t052 != null ? interfaceC1648510t052.Px0() : null;
        return c1649570t1n;
    }

    private final InterfaceC1650230t2r getCameraApiComponent() {
        return (InterfaceC1650230t2r) this.LLJJIJIIJIL.getValue(this, LLJJL[2]);
    }

    private final InterfaceC1621970sJH getRecordModeApi() {
        return (InterfaceC1621970sJH) this.LLJJJJ.getValue(this, LLJJL[6]);
    }

    public final InterfaceC1648020szI Op() {
        return (InterfaceC1648020szI) this.LLJJIJI.getValue(this, LLJJL[1]);
    }

    @Override // X.InterfaceC1649660t1w
    public void T5() {
        ViewOnTouchListenerC1649580t1o viewOnTouchListenerC1649580t1o = this.LLJJJJLIIL.LLJJ;
        if (viewOnTouchListenerC1649580t1o == null) {
            viewOnTouchListenerC1649580t1o = null;
        }
        int i = viewOnTouchListenerC1649580t1o.LLILZ;
        if (i == 1) {
            viewOnTouchListenerC1649580t1o.LJIIIIZZ(2);
            viewOnTouchListenerC1649580t1o.invalidate();
        } else if (i == 3 || i == 2) {
            viewOnTouchListenerC1649580t1o.LJIIIIZZ(4);
        }
    }

    public final C19EG Z1() {
        return (C19EG) this.LLJJJIL.getValue(this, LLJJL[5]);
    }

    public final a getPlanCUIApiComponent() {
        return (a) this.LLJJI.getValue(this, LLJJL[0]);
    }

    public final InterfaceC1648570t0B getRecordControlApi() {
        return (InterfaceC1648570t0B) this.LLJJIJIL.getValue(this, LLJJL[3]);
    }

    public final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LLJJJ.getValue(this, LLJJL[4]);
    }

    @Override // X.InterfaceC1649660t1w
    public int n91() {
        ViewOnTouchListenerC1649580t1o viewOnTouchListenerC1649580t1o = this.LLJJJJLIIL.LLJJ;
        if (viewOnTouchListenerC1649580t1o == null) {
            viewOnTouchListenerC1649580t1o = null;
        }
        return viewOnTouchListenerC1649580t1o.getCurrentScaleMode();
    }

    @Override // X.InterfaceC1649660t1w
    public void rS1() {
        ViewOnTouchListenerC1649580t1o viewOnTouchListenerC1649580t1o = this.LLJJJJLIIL.LLJJ;
        if (viewOnTouchListenerC1649580t1o == null) {
            viewOnTouchListenerC1649580t1o = null;
        }
        int i = viewOnTouchListenerC1649580t1o.LLJJJJ;
        if (i != -1) {
            viewOnTouchListenerC1649580t1o.LLILZIL = i;
            viewOnTouchListenerC1649580t1o.LLJJJJ = -1;
            viewOnTouchListenerC1649580t1o.invalidate();
        }
        int i2 = viewOnTouchListenerC1649580t1o.LLILZ;
        if (i2 == 3 || i2 == 2) {
            viewOnTouchListenerC1649580t1o.LJIIIIZZ(4);
            viewOnTouchListenerC1649580t1o.LLLIIL = false;
            viewOnTouchListenerC1649580t1o.invalidate();
        }
    }

    public final long o2() {
        if (getShortVideoContext().LJJJJLL()) {
            return 3000L;
        }
        if (getShortVideoContext().cameraComponentModel.isRetakeMode) {
            return getShortVideoContext().cameraComponentModel.mRetakeDuration;
        }
        if (getShortVideoContext().cameraComponentModel.editorProRecordUsedForPip) {
            return 0L;
        }
        return C566050MHz.LIZIZ();
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        C385670FAf<Boolean> c385670FAfCP1;
        LiveEvent<Boolean> liveEventFU0;
        C385670FAf<Boolean> c385670FAfRS;
        super.onCreate();
        this.LLILLJJLI.add(this.LLILLL, this.LLJJJJLIIL, "FTCRecordControlProgressScene");
        this.LLILZIL.LIZ(this, new AObjectS246S0100000_25(this, 86));
        this.LLILZLL.LIZ(this, new AObjectS246S0100000_25(this, 87));
        a planCUIApiComponent = getPlanCUIApiComponent();
        if (planCUIApiComponent != null && (c385670FAfRS = planCUIApiComponent.RS()) != null) {
            c385670FAfRS.LIZ(this, new AObjectS246S0100000_25(this, 88));
        }
        a planCUIApiComponent2 = getPlanCUIApiComponent();
        if (planCUIApiComponent2 != null && (liveEventFU0 = planCUIApiComponent2.FU0()) != null) {
            liveEventFU0.LIZ(this, new AObjectS246S0100000_25(this, 89));
        }
        getRecordControlApi().xk1().LJ(this, new AObjectS246S0100000_25(this, 90));
        getRecordControlApi().xM2().LIZ(this, new AObjectS246S0100000_25(this, 91));
        getRecordControlApi().pU1().LIZ(this, new AObjectS246S0100000_25(this, 92));
        getRecordControlApi().Vt0().LIZ(this, new AObjectS246S0100000_25(this, 93));
        getRecordControlApi().cJ0().LIZ(this, new AObjectS246S0100000_25(this, 94));
        getRecordControlApi().lC2().LIZ(this, new AObjectS246S0100000_25(this, 76));
        getRecordControlApi().Bp2().LIZ(this, new AObjectS246S0100000_25(this, 77));
        getRecordControlApi().zx2().LIZ(this, new AObjectS246S0100000_25(this, 78));
        InterfaceC1621970sJH recordModeApi = getRecordModeApi();
        if (recordModeApi != null && (c385670FAfCP1 = recordModeApi.CP1()) != null) {
            c385670FAfCP1.LIZ(this, new AObjectS246S0100000_25(this, 79));
        }
        getCameraApiComponent().yj1().LIZ(this, new AObjectS246S0100000_25(this, 80));
        getRecordControlApi().nZ().LIZ(this, new AObjectS246S0100000_25(this, 81));
        if (getShortVideoContext().cameraComponentModel.isRetakeMode && getShortVideoContext().LJIIZILJ() != null && getShortVideoContext().LJIIZILJ().stitchParams != null) {
            getShortVideoContext().LJJII(getShortVideoContext().LJIIZILJ().stitchParams);
        }
        getRecordControlApi().yI2((!getShortVideoContext().LJJJJLL() || getShortVideoContext().stitchContext.stitchClip == null) ? C1649650t1v.LIZ(getShortVideoContext().LJII(), getShortVideoContext().LJI(), true) : C1649650t1v.LIZIZ(getShortVideoContext().LJI(), getShortVideoContext().LJII(), getShortVideoContext().stitchContext.stitchClip));
        if (getShortVideoContext().LJJJJLL()) {
            long j = getShortVideoContext().cameraComponentModel.mMaxDuration;
            StitchParams stitchParams = getShortVideoContext().stitchContext.stitchParams;
            getRecordControlApi().ht1(new C531060KsC(j + (stitchParams != null ? Long.valueOf(stitchParams.getDuration()) : null).longValue()));
        } else {
            getRecordControlApi().ht1(new C531060KsC(getShortVideoContext().cameraComponentModel.mMaxDuration));
        }
        getCameraApiComponent().bu2().LIZ(this, new AObjectS246S0100000_25(this, 82));
        getCameraApiComponent().Dm2().LIZ(this, new AObjectS246S0100000_25(this, 83));
        getRecordControlApi().Y91().LIZ(this, new AObjectS246S0100000_25(this, 84));
        getRecordControlApi().kT0().LIZ(this, new AObjectS246S0100000_25(this, 85));
    }

    public InterfaceC1649660t1w X1() {
        return this.LLILZ;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public final C19A3 getParentScene() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC1649660t1w
    public void FY0(int i) {
        ImageView imageView = this.LLJJJJLIIL.LLJJIII;
        if (imageView == null) {
            imageView = null;
        }
        C786410Ut5.LJZI(i, imageView);
    }

    public final void G2(boolean z) {
        this.LLIZLLLIL.LJII(Boolean.valueOf(z));
    }

    public final void H2(C1649650t1v c1649650t1v) {
        if (c1649650t1v.LIZJ != null) {
            if (getShortVideoContext().cameraComponentModel.isRetakeMode) {
                qd(new C443120HZe<>(c1649650t1v.LIZ, Long.valueOf(c1649650t1v.LIZIZ), c1649650t1v.LIZJ));
                return;
            } else {
                zc(new C443120HZe<>(c1649650t1v.LIZ, Long.valueOf(c1649650t1v.LIZIZ), c1649650t1v.LIZJ));
                return;
            }
        }
        if (getShortVideoContext().cameraComponentModel.isRetakeMode) {
            Rk(new Pair<>(c1649650t1v.LIZ, Long.valueOf(c1649650t1v.LIZIZ)));
        } else {
            vr(new Pair<>(c1649650t1v.LIZ, Long.valueOf(c1649650t1v.LIZIZ)));
        }
    }

    @Override // X.InterfaceC1649660t1w
    public void Ik2(boolean z) {
        this.LLILZIL.LJII(Boolean.valueOf(z));
    }

    @Override // X.InterfaceC1649660t1w
    public void Op1(Animation animation) {
        C1649560t1m c1649560t1m = this.LLJJJJLIIL;
        ViewOnTouchListenerC1649580t1o viewOnTouchListenerC1649580t1o = c1649560t1m.LLJJ;
        ViewOnTouchListenerC1649580t1o viewOnTouchListenerC1649580t1o2 = null;
        if (viewOnTouchListenerC1649580t1o == null) {
            viewOnTouchListenerC1649580t1o = null;
        }
        C12ES.LIZ(viewOnTouchListenerC1649580t1o);
        ViewOnTouchListenerC1649580t1o viewOnTouchListenerC1649580t1o3 = c1649560t1m.LLJJ;
        if (viewOnTouchListenerC1649580t1o3 != null) {
            viewOnTouchListenerC1649580t1o2 = viewOnTouchListenerC1649580t1o3;
        }
        viewOnTouchListenerC1649580t1o2.startAnimation(animation);
    }

    @Override // X.InterfaceC1649660t1w
    public void Qb(RetakeVideoContext retakeVideoContext) {
        this.LLJILJIL.LJII(retakeVideoContext);
    }

    @Override // X.InterfaceC1649660t1w
    public void Rk(Pair<? extends List<? extends TimeSpeedModelExtension>, Long> pair) {
        this.LLJILJILJ.LJII(pair);
    }

    @Override // X.InterfaceC1649660t1w
    public void V2(boolean z) {
        ViewOnTouchListenerC1649580t1o viewOnTouchListenerC1649580t1o = this.LLJJJJLIIL.LLJJ;
        if (viewOnTouchListenerC1649580t1o == null) {
            viewOnTouchListenerC1649580t1o = null;
        }
        viewOnTouchListenerC1649580t1o.setEnabled(z);
    }

    @Override // X.InterfaceC1649660t1w
    public void W9(boolean z) {
        this.LLILZLL.LJII(Boolean.valueOf(z));
    }

    @Override // X.InterfaceC1649660t1w
    public void dd(boolean z) {
        ViewOnTouchListenerC1649580t1o viewOnTouchListenerC1649580t1o = this.LLJJJJLIIL.LLJJ;
        if (viewOnTouchListenerC1649580t1o == null) {
            viewOnTouchListenerC1649580t1o = null;
        }
        viewOnTouchListenerC1649580t1o.LLLIIL = z;
    }

    @Override // X.InterfaceC1649660t1w
    public void eg2(boolean z) {
        ImageView imageView = this.LLJJJJLIIL.LLJJIII;
        if (imageView == null) {
            imageView = null;
        }
        imageView.setSelected(z);
    }

    @Override // X.InterfaceC1649660t1w
    public void qd(C443120HZe<? extends List<? extends TimeSpeedModelExtension>, Long, ? extends TimeSpeedModelExtension> c443120HZe) {
        this.LLJILLL.LJII(c443120HZe);
    }

    @Override // X.InterfaceC1649660t1w
    public void so(int i) {
        this.LLJIJIL.LJII(Integer.valueOf(i));
    }

    @Override // X.InterfaceC1649660t1w
    public void tv(int i) {
        ViewOnTouchListenerC1649580t1o viewOnTouchListenerC1649580t1o = this.LLJJJJLIIL.LLJJ;
        if (viewOnTouchListenerC1649580t1o == null) {
            viewOnTouchListenerC1649580t1o = null;
        }
        viewOnTouchListenerC1649580t1o.LJIIJ(i);
    }

    @Override // X.InterfaceC1649660t1w
    public void vA0(int i) {
        ViewOnTouchListenerC1649580t1o viewOnTouchListenerC1649580t1o = this.LLJJJJLIIL.LLJJ;
        if (viewOnTouchListenerC1649580t1o == null) {
            viewOnTouchListenerC1649580t1o = null;
        }
        viewOnTouchListenerC1649580t1o.setCurrentScaleMode(i);
    }

    @Override // X.InterfaceC1649660t1w
    public void vr(Pair<? extends List<? extends TimeSpeedModelExtension>, Long> pair) {
        this.LLJ.LJII(pair);
    }

    public final void w2(long j) {
        this.LLIZ.LJII(Long.valueOf(j));
    }

    @Override // X.InterfaceC1649660t1w
    public void y31(int i) {
        View view = this.LLJJJJLIIL.LLJJI;
        if (view == null) {
            view = null;
        }
        C786410Ut5.LJLLLLLL(i, view);
    }

    @Override // X.InterfaceC1649660t1w
    public void zc(C443120HZe<? extends List<? extends TimeSpeedModelExtension>, Long, ? extends TimeSpeedModelExtension> c443120HZe) {
        this.LLJI.LJII(c443120HZe);
    }

    @Override // X.InterfaceC1649660t1w
    public void Hn(int i, boolean z) {
        ViewOnTouchListenerC1649580t1o viewOnTouchListenerC1649580t1o = this.LLJJJJLIIL.LLJJ;
        if (viewOnTouchListenerC1649580t1o == null) {
            viewOnTouchListenerC1649580t1o = null;
        }
        viewOnTouchListenerC1649580t1o.LJIIJJI(i, z);
    }

    public C1649590t1p(C1DRG c1drg, C19A3 c19a3, int i) {
        this.LL = c1drg;
        this.LLILLJJLI = c19a3;
        this.LLILLL = i;
        Boolean bool = Boolean.TRUE;
        this.LLILZIL = new h0<>(bool);
        this.LLILZLL = new h0<>(bool);
        this.LLIZ = new h0<>(0L);
        this.LLIZLLLIL = new h0<>(bool);
        this.LLJ = new h0<>(null);
        this.LLJI = new h0<>(null);
        this.LLJIJIL = new h0<>(-1);
        this.LLJILJIL = new h0<>(null);
        this.LLJILJILJ = new h0<>(null);
        this.LLJILLL = new h0<>(null);
        this.LLJJ = (C19EG) getDiContainer().LJII(C19EG.class, null);
        this.LLJJI = C1664770tQJ.LIZIZ(getDiContainer(), a.class, null);
        this.LLJJIII = (InterfaceC1648510t05) getDiContainer().LJIIL(null, InterfaceC1648510t05.class);
        this.LLJJIJI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1648020szI.class, null);
        this.LLJJIJIIJIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1650230t2r.class, null);
        this.LLJJIJIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1648570t0B.class, null);
        this.LLJJJ = C1664770tQJ.LIZ(getDiContainer(), ShortVideoContext.class, null);
        this.LLJJJIL = C1664770tQJ.LIZ(getDiContainer(), C19EG.class, null);
        this.LLJJJJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1621970sJH.class, null);
        this.LLJJJJJIL = 15000;
        this.LLJJJJLIIL = new C1649560t1m(W1(), getDiContainer());
    }
}
