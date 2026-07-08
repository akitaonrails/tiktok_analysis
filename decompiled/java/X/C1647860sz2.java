package X;

import Y.AObjectS246S0100000_25;
import Y.AObserverS227S0100000_25;
import android.animation.ValueAnimator;
import android.widget.FrameLayout;
import androidx.lifecycle.LiveData;
import com.bytedance.als.LiveEvent;
import com.bytedance.als.h0;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creative.model.record.FlashModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import ge.i;
import java.util.Arrays;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AwS11S0120000_25;
import kotlin.jvm.internal.AwS1S0000002_25;
import kotlin.jvm.internal.AwS37S0010000_25;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS604S0100000_25;
import nv7.c0;

/* JADX INFO: renamed from: X.0sz2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public class C1647860sz2 extends i<InterfaceC1650620t3U, C21592819ew, C21593019ey, C1647960szC> implements InterfaceC1650620t3U, InterfaceC379610EuV {
    public static final C1647980szE LLJZIJLIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLL;
    public final C1DRG LLJILJILJ;
    public boolean LLJILLL;
    public final InterfaceC1731706qJ LLJJ;
    public int LLJJI;
    public boolean LLJJIII;
    public final h0<Integer> LLJJIJI;
    public final Function0<C21593019ey> LLJJIJIIJIL;
    public final Function0<C1647960szC> LLJJIJIL;
    public final InterfaceC1731706qJ LLJJJ;
    public final InterfaceC1731706qJ LLJJJIL;
    public final InterfaceC1731706qJ LLJJJJ;
    public final InterfaceC1731706qJ LLJJJJJIL;
    public final InterfaceC1731706qJ LLJJJJLIIL;
    public final InterfaceC1731706qJ LLJJL;
    public int LLJJLIIIJLLLLLLLZ;
    public int LLJL;
    public int LLJLIL;
    public int LLJLILLLLZIIL;
    public boolean LLJLL;
    public final C01GW LLJLLIL;
    public final boolean LLJLLL;
    public ValueAnimator LLJZ;

    /* JADX WARN: Type inference failed for: r0v15, types: [X.0szE] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1647860sz2.class, "lazyBeautyFilterLogic", "getLazyBeautyFilterLogic()Lcom/ss/android/ugc/aweme/property/BeautyFilterConfig;", 0);
        C13LE.LIZ.getClass();
        LLL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C1647860sz2.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CommonCameraApiComponent;", 0), new C2217381BqS(C1647860sz2.class, "beautyApi", "getBeautyApi()Lcom/bytedance/creativex/recorder/beauty/api/BeautyPanelApiComponent;", 0), new C2217381BqS(C1647860sz2.class, "recordUIConductorApi", "getRecordUIConductorApi()Lcom/ss/android/ugc/aweme/shortvideo/ui/RecordUIConductorApi;", 0), new C2217381BqS(C1647860sz2.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0), new C2217381BqS(C1647860sz2.class, "changeCameraSpecApiComponent", "getChangeCameraSpecApiComponent()Lcom/ss/android/ugc/aweme/changemode/ChangeCameraSpecApiComponent;", 0), new C2217381BqS(C1647860sz2.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0)};
        LLJZIJLIL = new Object() { // from class: X.0szE
        };
    }

    public static /* synthetic */ void k5() {
    }

    public void U5() {
    }

    public void d6() {
    }

    private final InterfaceC1647890sz5 C5() {
        return (InterfaceC1647890sz5) this.LLJJJJ.getValue(this, LLL[3]);
    }

    private final int D5() {
        return ((Number) this.LLJLLIL.getValue()).intValue();
    }

    private final void P4() {
        if (this.LLJJIII) {
            return;
        }
        show();
        this.LLJJIII = true;
    }

    private final InterfaceC1644760su2 Z4() {
        return (InterfaceC1644760su2) this.LLJJJIL.getValue(this, LLL[2]);
    }

    private final InterfaceC1648570t0B getRecordControlApi() {
        return (InterfaceC1648570t0B) this.LLJJJJJIL.getValue(this, LLL[4]);
    }

    private final C1645380sv2 x5() {
        return (C1645380sv2) this.LLJJ.getValue(this, LLL[0]);
    }

    public final InterfaceC1646220swO Kp() {
        return (InterfaceC1646220swO) this.LLJJJJLIIL.getValue(this, LLL[5]);
    }

    public final InterfaceC1650190t2n d5() {
        return (InterfaceC1650190t2n) this.LLJJJ.getValue(this, LLL[1]);
    }

    public final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LLJJL.getValue(this, LLL[6]);
    }

    public final FrameLayout.LayoutParams t5() {
        return c0.LIZ.t2(getShortVideoContext().cameraComponentModel.mVideoWidth, (getShortVideoContext().cameraComponentModel.mVideoWidth * 16) / 9);
    }

    private final void Xi() {
        LiveData<Boolean> liveDataWW;
        LiveEvent<C1646150swH> liveEventMr1;
        d5().p92().LIZ(this, new AObjectS246S0100000_25(this, 449));
        d5().Q30().LIZ(this, new AObjectS246S0100000_25(this, 450));
        getRecordControlApi().xk1().LIZ(this, new AObjectS246S0100000_25(this, 451));
        getRecordControlApi().EP().LIZ(this, new AObjectS246S0100000_25(this, 452));
        if (C1622090sJT.LIZ(x5())) {
            whenReady(this, InterfaceC1644760su2.class, new AwS604S0100000_25(this, 359));
        } else {
            InterfaceC1644760su2 interfaceC1644760su2Z4 = Z4();
            if (interfaceC1644760su2Z4 != null && (liveDataWW = interfaceC1644760su2Z4.wW()) != null) {
                liveDataWW.observe(this, new AObserverS227S0100000_25(this, 54));
            }
        }
        C5().wm1().LIZ(this, new AObjectS246S0100000_25(this, 453));
        InterfaceC1646220swO interfaceC1646220swOKp = Kp();
        if (interfaceC1646220swOKp == null || (liveEventMr1 = interfaceC1646220swOKp.Mr1()) == null) {
            return;
        }
        liveEventMr1.LIZ(this, new AObjectS246S0100000_25(this, 454));
    }

    private final void u6() {
        Pair pair;
        if (C0BVU.LIZ()) {
            P4();
        }
        U5();
        if (ag1() == 3) {
            C01GW c01gw = C1405210mff.LIZ;
            int i = ((Keva) c01gw.getValue()).getInt("selected_color", 0);
            List<Integer> list = C1647880sz4.LIZ;
            int i2 = i < list.size() ? i : 0;
            Integer numValueOf = Integer.valueOf(((Keva) c01gw.getValue()).getInt("seekbar_progress", C1647880sz4.LIZIZ));
            Integer numLIZJ = C1308910kAL.LIZJ(((Number) ListProtector.get(list, i2)).intValue(), C1664590tQ1.LJIIIZ(this));
            pair = new Pair(numValueOf, Integer.valueOf(numLIZJ != null ? numLIZJ.intValue() : -1));
        } else {
            pair = new Pair(Integer.valueOf(C1647880sz4.LIZIZ), -1);
        }
        int iIntValue = ((Number) pair.getFirst()).intValue();
        int iIntValue2 = ((Number) pair.getSecond()).intValue();
        Pair<Float, Float> pairF4 = F4(iIntValue);
        i3(new C1647910sz7(pairF4.getFirst().floatValue(), pairF4.getSecond().floatValue(), iIntValue2));
    }

    public final void J6() {
        FlashModel flashModel = getShortVideoContext().creativeModel.flashModel;
        if (d5().Ue() && ag1() != 0) {
            flashModel.isFrontFlashOn = true;
            flashModel.frontFlashColor.add(O4(this.LLJJLIIIJLLLLLLLZ));
            flashModel.frontFlashValue.add(Integer.valueOf(((Keva) C1405210mff.LIZ.getValue()).getInt("seekbar_progress", C1647880sz4.LIZIZ)));
        }
        if (d5().Ue() || d5().getFlashMode() == 0) {
            return;
        }
        flashModel.isBackFlashOn = true;
    }

    @Override // X.InterfaceC1650620t3U
    public void No1() {
        if (getShortVideoContext().LJJJJIZL() || getShortVideoContext().cameraComponentModel.isEditorProRecordMode || n5() || this.LLJL != 2) {
            return;
        }
        d5().qh(2);
    }

    public void S5() {
        FlashModel flashModel = getShortVideoContext().creativeModel.flashModel;
        flashModel.isFrontFlashOn = false;
        flashModel.isBackFlashOn = false;
        flashModel.frontFlashColor.clear();
        flashModel.frontFlashValue.clear();
    }

    @Override // X.InterfaceC1650620t3U
    public boolean c01() {
        return ag1() != 0;
    }

    @Override // X.InterfaceC1650620t3U
    public int getNextFlashMode() {
        return ag1() == 0 ? 2 : 0;
    }

    @Override // ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        Xi();
    }

    @Override // X.AbstractC2255721DQs
    public void onPause() {
        super.onPause();
        if (M5()) {
            return;
        }
        if (!getShortVideoContext().LJJJJIZL() && !getShortVideoContext().cameraComponentModel.isEditorProRecordMode) {
            this.LLJLIL = ag1();
        }
        if (!C297780Blo.LIZ()) {
            H4(false);
        } else if (ag1() != 0) {
            H4(false);
        }
    }

    public final int E5() {
        return this.LLJLIL;
    }

    public final int H5() {
        return this.LLJL;
    }

    public boolean M5() {
        return this.LLJLL;
    }

    public final ValueAnimator T4() {
        return this.LLJZ;
    }

    @Override // X.InterfaceC1650620t3U
    public int ag1() {
        return this.LLJJI;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJILJILJ;
    }

    public boolean n5() {
        return this.LLJLLL;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C21593019ey> o2() {
        return this.LLJJIJIIJIL;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C1647960szC> w2() {
        return this.LLJJIJIL;
    }

    @Override // X.InterfaceC1650620t3U
    public C385670FAf<Integer> zu0() {
        return this.LLJJIJI;
    }

    private final Pair<Float, Float> F4(int i) {
        if (D5() == 2) {
            i *= 10;
        }
        float f = i;
        return new Pair<>(Float.valueOf(C1647880sz4.LIZJ + (C1647880sz4.LIZLLL * f)), Float.valueOf(C1647880sz4.LJ + (f * C1647880sz4.LJFF)));
    }

    private final String O4(int i) {
        return C786410Ut5.j4("#%06x", Arrays.copyOf(new Object[]{Integer.valueOf(16777215 & this.LLJJLIIIJLLLLLLLZ)}, 1));
    }

    public final void H4(boolean z) {
        i3(new AwS37S0010000_25(z, 21));
        if (!this.LLJILLL) {
            return;
        }
        this.LLJILLL = false;
        d6();
        this.LLJJI = 0;
        N6(0);
    }

    public final void K6(ValueAnimator valueAnimator) {
        this.LLJZ = valueAnimator;
    }

    public void L6(int i) {
        this.LLJJI = i;
    }

    public final void N6(int i) {
        this.LLJJIJI.LJII(Integer.valueOf(i));
    }

    public final void P6(int i) {
        this.LLJLIL = i;
    }

    public final void R5(int i) {
        if (i <= 0) {
            d6();
        } else {
            U5();
        }
        Pair<Float, Float> pairF4 = F4(i);
        i3(new AwS1S0000002_25(pairF4.getFirst().floatValue(), pairF4.getSecond().floatValue(), 1));
    }

    public final void S6(int i) {
        this.LLJL = i;
    }

    public final void m6(int i) {
        int i2;
        ShortVideoContext shortVideoContext = getShortVideoContext();
        if (D5() == 2) {
            i2 = i * 10;
        } else {
            i2 = i;
        }
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", shortVideoContext.getCreationId());
        c0lab.LJ("enter_from", shortVideoContext.enterFrom);
        c0lab.LJ("shoot_way", shortVideoContext.shootWay);
        c0lab.LIZ(i2, "value");
        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
        C2341909Fp.LIZ("adjust_flash_light", c0lab.LIZ);
        if (i <= 0) {
            i = C1647880sz4.LIZIZ;
        }
        ((Keva) C1405210mff.LIZ.getValue()).storeInt("seekbar_progress", i);
    }

    @Override // X.InterfaceC1650620t3U
    public void nR(int i) {
        if (!getShortVideoContext().LJJJJIZL() && !getShortVideoContext().cameraComponentModel.isEditorProRecordMode) {
            this.LLJL = i;
        }
    }

    @Override // X.InterfaceC1650620t3U
    public void qh(int i) {
        this.LLJJI = i;
        N6(i);
        if (i != 0) {
            if (i != 2 && i != 3) {
                return;
            }
            this.LLJILLL = true;
            u6();
            return;
        }
        this.LLJL = 0;
        if (!getShortVideoContext().LJJJJIZL() && !getShortVideoContext().cameraComponentModel.isEditorProRecordMode) {
            this.LLJLIL = 0;
        }
        K4(this, false, 1, null);
    }

    public C21592619eu v5(boolean z) {
        FrameLayout.LayoutParams layoutParamsT5 = t5();
        if (z && C1443960ngA.LJIIL(getShortVideoContext())) {
            float f = layoutParamsT5.width;
            return new C21592619eu(f, f / 0.75f, C578100Mls.LIZJ(C1664590tQ1.LJIIIZ(this)));
        }
        return new C21592619eu(layoutParamsT5.width, layoutParamsT5.height, layoutParamsT5.topMargin);
    }

    public C1647860sz2(C19A3 c19a3, C1DRG c1drg) {
        super(c19a3);
        this.LLJILJILJ = c1drg;
        this.LLJJ = C1664770tQJ.LIZIZ(getDiContainer(), C1645380sv2.class, "lazyBeautyFilter");
        this.LLJJIJI = new h0<>(0);
        this.LLJJIJIIJIL = new AwS569S0100000_25(this, 575);
        this.LLJJIJIL = new AwS569S0100000_25(this, 576);
        this.LLJJJ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1650190t2n.class, null);
        this.LLJJJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1644760su2.class, null);
        this.LLJJJJ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1647890sz5.class, null);
        this.LLJJJJJIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1648570t0B.class, null);
        this.LLJJJJLIIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1646220swO.class, null);
        this.LLJJL = C1664770tQJ.LIZ(getDiContainer(), ShortVideoContext.class, null);
        this.LLJJLIIIJLLLLLLLZ = -1;
        this.LLJLLIL = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(286));
        this.LLJZ = new ValueAnimator();
    }

    public final void N5(int i, int i2) {
        int iIntValue;
        Integer numLIZJ = C1308910kAL.LIZJ(i, C1664590tQ1.LJIIIZ(this));
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = -1;
        }
        this.LLJJLIIIJLLLLLLLZ = iIntValue;
        ShortVideoContext shortVideoContext = getShortVideoContext();
        String strO4 = O4(this.LLJJLIIIJLLLLLLLZ);
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", shortVideoContext.getCreationId());
        c0lab.LJ("enter_from", shortVideoContext.enterFrom);
        c0lab.LJ("shoot_way", shortVideoContext.shootWay);
        c0lab.LJ("color", strO4);
        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
        C2341909Fp.LIZ("choose_flash_color", c0lab.LIZ);
        ((Keva) C1405210mff.LIZ.getValue()).storeInt("selected_color", i2);
        i3(new AwS604S0100000_25(this, 360));
    }

    @Override // X.InterfaceC1650620t3U
    public void ir0(boolean z, boolean z2, boolean z3) {
        i3(new AwS11S0120000_25(this, z, z2, 1));
    }

    public static /* synthetic */ void K4(C1647860sz2 c1647860sz2, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = false;
            }
            c1647860sz2.H4(z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: closeFlash");
    }
}
