package X;

import X.InterfaceC1650190t2n;
import Y.AObjectS130S0000000_35;
import Y.AObjectS377S0100000_35;
import Y.AObjectS409S0100000_35;
import Y.ARunnableS135S0100000_35;
import Y.ARunnableS46S0101000_35;
import Y.AfS188S0100000_19;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.graphics.Rect;
import android.opengl.EGLContext;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.als.LiveEvent;
import com.bytedance.als.h0;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ttve.nativePort.TEBundle;
import com.ss.android.ugc.asve.recorder.ASMediaSegment;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.ClientCherEffectParam;
import com.ss.android.ugc.aweme.shortvideo.DuetContext;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import com.ss.android.ugc.aweme.shortvideo.record.AudioRecordModule;
import com.ss.android.ugc.aweme.shortvideo.record.k2;
import com.ss.android.ugc.aweme.shortvideo.ui.EmbaddedWindowInfo;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.aweme.sticker.SavePhotoStickerInfo;
import com.ss.android.ugc.effectmanager.DownloadableModelSupport;
import com.ss.android.ugc.effectmanager.IFetchResourceListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.vesdk.VECameraSettings;
import com.ss.android.vesdk.VEDisplaySettings;
import com.ss.android.vesdk.VEFocusSettings;
import com.ss.android.vesdk.VERecorder;
import com.ss.android.vesdk.VESize;
import com.ss.android.vesdk.lens.VELumaDetectParams;
import com.ss.android.vesdk.lens.VEOneKeyProcessParams;
import com.ss.android.vesdk.lens.VETaintSceneDetectParams;
import com.ss.android.vesdk.runtime.VERuntime;
import dn3.k;
import java.io.File;
import java.lang.ref.WeakReference;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS281S0000000_34;
import kotlin.jvm.internal.AwS140S0101000_35;
import kotlin.jvm.internal.AwS401S0200000_35;
import kotlin.jvm.internal.AwS579S0100000_35;
import pyl.q;
import pyl.s;
import xbk.f;
import xbk.h;

/* JADX INFO: renamed from: X.1DKj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public class C2254071DKj<T extends InterfaceC1650190t2n> extends AbstractC2255721DQs<T> implements InterfaceC379610EuV, InterfaceC1650190t2n {
    public final C1DRG LL;
    public final h0<Boolean> LLILLJJLI;
    public final h0<Boolean> LLILLL;
    public final h0<Boolean> LLILZ;
    public final C560530Lyd<Unit> LLILZIL;
    public final C560530Lyd<Unit> LLILZLL;
    public final C560530Lyd<Integer> LLIZ;
    public final C560530Lyd<C1403440mco> LLIZLLLIL;
    public final C560530Lyd<Boolean> LLJ;
    public final C560530Lyd<Boolean> LLJI;
    public final MutableLiveData<C1448140nmu> LLJIJIL;
    public final C560530Lyd<Long> LLJILJIL;
    public final h0<Long> LLJILJILJ;
    public final C560530Lyd<Long> LLJILLL;
    public final C560530Lyd<Long> LLJJ;
    public final C560530Lyd<Long> LLJJI;
    public final C560530Lyd<Unit> LLJJIII;
    public final C560530Lyd<Pair<Integer, Float>> LLJJIJI;
    public final C560530Lyd<Integer> LLJJIJIIJIL;
    public final C560530Lyd<q> LLJJIJIL;
    public final C560530Lyd<Integer> LLJJJ;
    public final C560530Lyd<Integer> LLJJJIL;
    public final C560530Lyd<C1648160szW> LLJJJJ;
    public final C560530Lyd<C1653280t7m> LLJJJJJIL;
    public final C560530Lyd<C1652620t6i> LLJJJJLIIL;
    public final C560530Lyd<Unit> LLJJL;
    public final C560530Lyd<Unit> LLJJLIIIJLLLLLLLZ;
    public s LLJL;
    public s LLJLIL;
    public final h0<Double> LLJLILLLLZIIL;
    public final C560530Lyd<Unit> LLJLL;
    public final C560530Lyd<C1634100scq<Integer, Integer, String>> LLJLLIL;
    public final C560530Lyd<Pair<Integer, Integer>> LLJLLL;
    public final MutableLiveData<Float> LLJZ;
    public final MutableLiveData<C1DLP> LLJZIJLIL;
    public final C560530Lyd<Boolean> LLL;
    public final h0<Boolean> LLLF;
    public final MutableLiveData<Boolean> LLLFF;
    public final C560530Lyd<Unit> LLLFFI;
    public final C560530Lyd<Boolean> LLLFZ;
    public final C560530Lyd<Unit> LLLI;
    public final C560530Lyd<Pair<Integer, Boolean>> LLLII;
    public final C19GS LLLIIII;
    public int LLLIIIIL;
    public Surface LLLIIIL;
    public InterfaceC2254081DKk LLLIIL;
    public VERecorder LLLIILIL;
    public final CameraComponentModel LLLIL;
    public C2177931ALn LLLILZ;
    public AudioRecordModule LLLILZJ;
    public InterfaceC576950Mk1 LLLILZLLLI;
    public SafeHandler LLLIZZ;
    public volatile boolean LLLJ;
    public boolean LLLJIL;
    public int LLLJL;
    public int LLLL;
    public boolean LLLLII;
    public final InterfaceC2187111Aij LLLLIIIILLL;
    public final C1DI3 LLLLIIL;
    public final C1A75 LLLLIILL;
    public long LLLLIILLL;
    public long LLLLIL;
    public boolean LLLLILI;
    public boolean LLLLJ;
    public boolean LLLLJI;
    public boolean LLLLL;
    public boolean LLLLLIL;
    public boolean LLLLLILLIL;
    public boolean LLLLLJIL;
    public boolean LLLLLJLJLL;
    public C2254091DKl LLLLLL;
    public final InterfaceC2253441DHy LLLLLLIL;
    public InterfaceC2253451DHz LLLLLLJ;
    public Effect LLLLLLL;
    public boolean LLLLLLLLL;
    public long LLLLLLLLLL;
    public boolean LLLLLLLZIL;
    public InterfaceC2186241AhK LLLLLLZ;
    public boolean LLLLLLZZ;
    public boolean LLLLLZ;
    public boolean LLLLLZIL;
    public boolean LLLLLZL;
    public boolean LLLLZ;
    public float LLLLZI;
    public C1DHV LLLLZIL;
    public C1DKV LLLLZLL;
    public C1DHW<?> LLLLZLLIL;
    public InterfaceC1452360nti LLLLZLLLI;
    public InterfaceC2177771AKx LLLZ;
    public C1650220t2q LLLZI;
    public C01GW<InterfaceC2253831DJl> LLLZIIL;
    public boolean LLLZIL;
    public C1DL3 LLLZL;
    public InterfaceC2253851DJn LLLZLL;
    public final C1DHZ LLLZLZ;
    public List<String> LLLZZ;
    public String LLLZZIL;
    public String LLZ;
    public Boolean LLZIL;
    public List<String> LLZILL;
    public final Handler LLZL;
    public Surface LLZLI;

    public void C5() {
    }

    public void D5(int i, int i2, double d) {
    }

    public void Da(String[] strArr, double[] dArr, boolean[] zArr) {
    }

    public void E5() {
    }

    public void H5() {
    }

    public void I7() {
    }

    public void Ka() {
    }

    public void M5(int i, int i2, String str) {
    }

    public void P6() {
    }

    @Override // X.InterfaceC1650190t2n
    public boolean PZ0() {
        return true;
    }

    public void R5() {
    }

    public void S5(int i) {
    }

    public void S6() {
    }

    public void T6() {
        H4();
        this.LLLIIL = new h(this.LLLIIII, new f(this, this.LLLLZLLIL, new AObjectS409S0100000_35(this, 5), this.LLLZIIL.getValue(), new AObjectS409S0100000_35(this, 6), new AObjectS409S0100000_35(this, 7), new AObjectS409S0100000_35(this, 8), new AObjectS377S0100000_35(this, 0)));
        InterfaceC1452360nti interfaceC1452360nti = this.LLLLZLLLI;
        SurfaceView surfaceViewLJIJJLI = interfaceC1452360nti != null ? interfaceC1452360nti.LJIJJLI() : null;
        C1DL9 c1dl9 = (C1DL9) this.LLLIIL;
        C19GS c19gs = this.LLLIIII;
        int i = this.LLLIIIIL;
        c1dl9.LIZIZ(c19gs);
        c1dl9.getFunctionApiMgr().LIZIZ(false, C1DL5.class, new AwS140S0101000_35(surfaceViewLJIJJLI, i, 0));
        c1dl9.getFunctionApiMgr().LIZIZ(true, C1DLM.class, AFwS281S0000000_34.get$arr$(24));
        this.LLLZL = W6();
    }

    public T d5() {
        return this;
    }

    public void da() {
    }

    public void dc() {
    }

    public void m6(boolean z, float f, List<Integer> list) {
    }

    public void ma(long j) {
    }

    public void oa() {
    }

    public void pa() {
    }

    public void ra(int i) {
    }

    public void sa(int i, int i2) {
    }

    public void u7() {
    }

    private void Fb() {
        this.LLLIIL.setExposureCompensationEnable(this.LLLLL && this.LLLLLIL && !this.LLLLLJLJLL);
    }

    private void H4() {
        InterfaceC2253451DHz interfaceC2253451DHz = this.LLLLLLJ;
        if (interfaceC2253451DHz != null) {
            interfaceC2253451DHz.LIZIZ("surface_create");
        }
    }

    private void U9() {
        this.LLLFFI.LJIIJ(Unit.LIZ);
    }

    private void Vb() {
        if (this.LLLIL.LJI()) {
            this.LLLIIL.setMusicPath(this.LLLIL.mWorkspace.getMusicPath());
            InterfaceC2254081DKk interfaceC2254081DKk = this.LLLIIL;
            String musicPath = this.LLLIL.mWorkspace.getMusicPath();
            long jLJ = this.LLLIL.LJ();
            long jLIZJ = this.LLLIL.LIZJ();
            CameraComponentModel cameraComponentModel = this.LLLIL;
            boolean z = cameraComponentModel.isLoopSwitchOnByAIGC || cameraComponentModel.isLoopSwitchOnByGameEffect || cameraComponentModel.isLoopSwitchOnByMusic;
            long jLIZJ2 = cameraComponentModel.LIZJ();
            int i = cameraComponentModel.maxMusicLoopDuration;
            interfaceC2254081DKk.vh(jLJ, jLIZJ, this.LLLIL.musicEndTime, (i <= 0 || jLIZJ2 > ((long) i) || jLIZJ2 > ((long) i)) ? 0 : i - ((int) jLIZJ2), musicPath, z);
            Boolean bool = Boolean.TRUE;
            this.LLLLLL.LJIL.getClass();
            if (bool.equals(Boolean.FALSE)) {
                this.LLLIIL.t1();
                this.LLLIL.isPlayingPreviewMusic = true;
            }
        }
        this.LLLIIL.Ch(this.LLLIIII, this.LLLILZJ.getAudioRecorderInterface());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.1DL2] */
    private C1DL3 W6() {
        C19GS c19gs = this.LLLIIII;
        InterfaceC2254081DKk interfaceC2254081DKk = this.LLLIIL;
        final C1DL3 c1dl3 = new C1DL3(c19gs, interfaceC2254081DKk, interfaceC2254081DKk.getCameraController());
        InterfaceC2254081DKk interfaceC2254081DKk2 = this.LLLIIL;
        final C19GS c19gs2 = this.LLLIIII;
        interfaceC2254081DKk2.getViewFunction().LIZ(new FrameLayout(c19gs2) { // from class: X.1DL2
            @Override // android.view.View
            public final boolean onTouchEvent(MotionEvent motionEvent) {
                C1DL1 c1dl1 = c1dl3.LIZ;
                c1dl1.LJ.onTouchEvent(motionEvent);
                c1dl1.LJFF.LIZ(motionEvent);
                return true;
            }
        }, new FrameLayout.LayoutParams(-1, -1));
        return c1dl3;
    }

    private C2253301DHk k5() {
        InterfaceC2253441DHy interfaceC2253441DHy = this.LLLLLLIL;
        if (interfaceC2253441DHy != null) {
            return interfaceC2253441DHy.LIZ();
        }
        return null;
    }

    private void k7() {
        Function0<Unit> function0 = this.LLLLLL.LIZ.LIZ;
        if (function0 != null) {
            function0.invoke();
        }
        this.LLLIIL.setLifecycleOwner(this);
        this.LLLIIL.zh(this.LLLLZLL, k5());
        this.LLLIILIL = this.LLLIIL.oh().LIZIZ();
        this.LLLLJ = this.LLLLZLL.LJIIZILJ().LJIJ();
        this.LLLLJI = this.LLLLZLL.LJIIZILJ().LJIILJJIL();
        Function1<? super InterfaceC2254081DKk, Unit> function1 = this.LLLLLL.LIZIZ;
        if (function1 != null) {
            function1.invoke(this.LLLIIL);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.09AY, kotlin.jvm.functions.Function0] */
    private void n7() {
        C1DGN c1dgnLIZ;
        C2254091DKl c2254091DKl = this.LLLLLL;
        Context contextO3 = C786410Ut5.O3(this.LLLIIII);
        C1DKV c1dkv = this.LLLLZLL;
        C2253301DHk c2253301DHkK5 = k5();
        InterfaceC2253851DJn interfaceC2253851DJn = this.LLLZLL;
        C1DHZ c1dhz = this.LLLZLZ;
        InterfaceC2253451DHz interfaceC2253451DHz = this.LLLLLLJ;
        AObjectS409S0100000_35 aObjectS409S0100000_35 = new AObjectS409S0100000_35(this, 1);
        Effect effect = this.LLLLLLL;
        C2253281DHi c2253281DHi = new C2253281DHi(contextO3, c1dkv, this, c2253301DHkK5, interfaceC2253851DJn, c1dhz, interfaceC2253451DHz, aObjectS409S0100000_35, effect);
        C2253271DHh c2253271DHh = new C2253271DHh(contextO3, this, c2253301DHkK5, c1dkv, interfaceC2253451DHz, aObjectS409S0100000_35, null, effect, c2254091DKl.LJJIIZI);
        ?? r0 = c2254091DKl.LJJIIZ;
        if (r0 == 0 || (c1dgnLIZ = (C1DGN) r0.invoke()) == null) {
            c1dgnLIZ = C1DGP.LIZ(new AwS401S0200000_35(c2254091DKl, c2253281DHi, 43));
        }
        k kVarCreate = c1dgnLIZ.create();
        kVarCreate.LJIILLIIL(c2253271DHh);
        kVarCreate.LJIILIIL().K0(interfaceC2253851DJn);
        kVarCreate.LJIJ(c1dhz);
        this.LLLLZLLIL = kVarCreate;
        C1211880hdq c1211880hdq = new C1211880hdq(new AObjectS409S0100000_35(this, 2), new AObjectS409S0100000_35(this, 3));
        kVarCreate.LJIIIIZZ.LIZ(kVarCreate.LIZJ().LJJLJLI(new AfS188S0100000_19(c1211880hdq, 36)));
        kVarCreate.LJIIIIZZ.LIZ(kVarCreate.LJIIZILJ().LJJLJLI(new AfS188S0100000_19(c1211880hdq, 37)));
    }

    private Surface x5() {
        return C2254141DKq.LIZIZ((C1DL9) this.LLLIIL).getSurface();
    }

    private void y7() {
        this.LLLLLL.getClass();
    }

    private void yb() {
        this.LLLIILIL.LJ = new C1DLN(this);
    }

    @Override // X.InterfaceC1650190t2n
    public boolean Af() {
        return this.LLLIIL.getCameraController().X3().Af();
    }

    public void Cb() {
        this.LLJJIII.LJIIJ(Unit.LIZ);
        this.LLLIL.mWorkspace.wQ();
        this.LLLIL.mWorkspace.LL.eb();
        for (int i = 0; i < this.LLLIL.LIZIZ().size(); i++) {
            St2().S4(null, new AObjectS130S0000000_35(0));
            C2216191BoX.LIZ.getClass();
            ((C2208821Bce) C2216191BoX.LIZIZ()).LIZIZ().LIZ(Log.getStackTraceString(new Throwable()));
        }
        this.LLLIL.LIZIZ().clear();
        CameraComponentModel cameraComponentModel = this.LLLIL;
        if (cameraComponentModel.isRetakeMode) {
            cameraComponentModel.mRetakeTime = 0L;
        } else {
            cameraComponentModel.mTotalRecordingTime = 0L;
        }
    }

    @Override // X.InterfaceC1650190t2n
    public void E0() {
        if (this.LLLIIL.getExposureCompensationEnable()) {
            this.LLLIIL.E0();
        }
    }

    @Override // X.InterfaceC1650190t2n
    public void Jd1() {
        this.LLILZLL.LJIIJ(Unit.LIZ);
    }

    @Override // X.InterfaceC1650190t2n
    public boolean KY() {
        return this.LLLIIL.getCameraController().X3().LJII();
    }

    public void L7() {
        ExtractFramesModel extractFramesModel;
        Application application = this.LLLIIII.getApplication();
        String str = this.LLLLLL.LJIIL;
        InterfaceC2254001DKc mediaController = this.LLLIIL.getMediaController();
        int videoWidth = this.LLLLIIL.getVideoWidth();
        int videoHeight = this.LLLLIIL.getVideoHeight();
        C2254091DKl c2254091DKl = this.LLLLLL;
        C1656090tCJ c1656090tCJ = new C1656090tCJ(application, str, mediaController, videoWidth, videoHeight, c2254091DKl.LJIIIZ, c2254091DKl.LJIIJ, c2254091DKl.LJIJJLI, this, c2254091DKl.LJIILIIL, c2254091DKl.LJIIJJI);
        this.LLLILZLLLI = c1656090tCJ;
        CameraComponentModel cameraComponentModel = this.LLLIL;
        if (cameraComponentModel != null) {
            c1656090tCJ.LJIJJ = cameraComponentModel.creationId;
        }
        c1656090tCJ.LJIILL = new C1656300tCe(this);
        if (cameraComponentModel != null && (extractFramesModel = cameraComponentModel.extractFramesModel) != null) {
            c1656090tCJ.LJIIJJI = extractFramesModel;
            c1656090tCJ.LJIILJJIL.LIZIZ = extractFramesModel.getExtractFramesDir();
        }
        ((C1656090tCJ) this.LLLILZLLLI).LJIIJJI.removeMultiImages();
    }

    @Override // X.InterfaceC1650190t2n
    public int LJLJJLL() {
        return this.LLLLZLLIL.LJLJJLL();
    }

    @Override // X.InterfaceC1650190t2n
    public void Ls1() {
        C786410Ut5.LJJZZIII(this.LLZL, new ARunnableS135S0100000_35(this, 14));
    }

    public void O4() {
        InterfaceC1452360nti interfaceC1452360nti = this.LLLLZLLLI;
        if (interfaceC1452360nti != null) {
            interfaceC1452360nti.d12(this.LLLZ);
        }
    }

    @Override // X.InterfaceC1650190t2n
    public InterfaceC2253331DHn Pk() {
        return this.LLLLZLLIL.Pk();
    }

    public C1DKV T4() {
        k2 k2Var = new k2(this.LLLIIII, this.LLLIL, new AObjectS409S0100000_35(this, 0));
        this.LLLLLL.getClass();
        C2254091DKl c2254091DKl = this.LLLLLL;
        k2Var.LJFF = c2254091DKl.LJIILLIIL;
        k2Var.LJI = c2254091DKl.LJIIZILJ;
        k2Var.LJII = c2254091DKl.LJIJ;
        k2Var.LJIIIIZZ = c2254091DKl.LJIJI;
        k2Var.LJIILJJIL = c2254091DKl.LJII;
        c2254091DKl.getClass();
        this.LLLLLL.getClass();
        C2254091DKl c2254091DKl2 = this.LLLLLL;
        k2Var.LJIIZILJ = c2254091DKl2.LJJIIJ;
        k2Var.LJIJI = c2254091DKl2.LJJIIJZLJL;
        Function1<? super k2, Unit> function1 = c2254091DKl2.LIZ.LIZIZ;
        if (function1 != null) {
            function1.invoke(k2Var);
        }
        return k2Var;
    }

    @Override // X.InterfaceC1650190t2n
    public boolean Ue() {
        return this.LLLLZLLIL.Ue();
    }

    public boolean Uq() {
        return this.LLLLZLLIL.Uq();
    }

    public Intent Z4() {
        return this.LLLIIII.getIntent();
    }

    @Override // X.InterfaceC1650190t2n
    public void Zi1() {
        List<String> list = this.LLLZZ;
        if (list != null) {
            list.clear();
            this.LLLZZ = null;
        }
        this.LLZ = null;
        this.LLLZZIL = null;
        this.LLZIL = Boolean.FALSE;
    }

    @Override // X.InterfaceC1650190t2n
    public void aD1() {
        if (this.LLLLLLLZIL) {
            this.LLLLLLLZIL = false;
            this.LLLIIL.getMediaController().z5();
        }
    }

    @Override // X.InterfaceC1650190t2n
    public boolean cC0() {
        return this.LLLIIL.getCameraController().X3().n();
    }

    @Override // X.InterfaceC1650190t2n
    public Point cn() {
        Point point = new Point();
        View viewFF2 = fF2();
        if (fF2().getLayoutParams() instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewFF2.getLayoutParams();
            point.x = layoutParams.width;
            point.y = layoutParams.height;
        }
        return point;
    }

    public void d7() {
        this.LLLILZJ = new AudioRecordModule(this.LLLIIII, this.LLLLIILL, new C1DLT() { // from class: X.1DLK
        });
    }

    @Override // X.InterfaceC1650190t2n
    public boolean db() {
        return this.LLLIIL.getCameraController().X3().db();
    }

    @Override // X.InterfaceC1650190t2n
    public void eY1() {
        this.LLLLZLLIL.LJIIIZ();
    }

    @Override // X.InterfaceC1650190t2n
    public C1DHU ep() {
        return this.LLLLZLLIL.ep();
    }

    @Override // X.InterfaceC1650190t2n
    public boolean fh() {
        return this.LLLIIL.fh() && !this.LLLLLLLLL;
    }

    public void finish() {
        this.LLLIIII.finish();
    }

    @Override // X.InterfaceC1650190t2n
    public int getCameraType() {
        return this.LLLLZLLIL.getCameraType();
    }

    @Override // X.InterfaceC1650190t2n
    public InterfaceC1645720sva getEffectController() {
        return this.LLLILZ.LIZ;
    }

    @Override // X.InterfaceC1650190t2n
    public int getFlashMode() {
        return this.LLLIIL.getFlashMode();
    }

    @Override // X.InterfaceC1650190t2n
    public int getNextFlashMode() {
        return this.LLLIIL.getNextFlashMode();
    }

    @Override // X.InterfaceC1650190t2n
    public View getPreviewView() {
        return C2254141DKq.LIZIZ((C1DL9) this.LLLIIL).getPreviewView();
    }

    @Override // X.InterfaceC1650190t2n
    public void h0() {
        this.LLLLZLLIL.h0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.1DI1] */
    public void hc() {
        if (this.LLLLZLLLI != null) {
            O4();
        } else {
            C2254141DKq.LIZIZ((C1DL9) this.LLLIIL).LIZ(new C1DLI() { // from class: X.1DI1
                @Override // X.C1DLI
                public final void LIZ() {
                    this.LIZ.P6();
                }

                @Override // X.C1DLI
                public final void LIZIZ(Surface surface) {
                    this.LIZ.N6(surface);
                }

                @Override // X.C1DLI
                public final void LLIIZ(int i, int i2, Surface surface) {
                    this.LIZ.L6(surface, i, i2);
                }
            });
        }
    }

    @Override // X.InterfaceC1650190t2n
    public boolean isReuseSurfaceView() {
        return this.LLLLZLLLI != null;
    }

    @Override // X.InterfaceC1650190t2n
    public void j8() {
        this.LLLLZLLIL.j8();
    }

    @Override // X.InterfaceC1650190t2n
    public boolean jk() {
        return C2254141DKq.LIZIZ((C1DL9) this.LLLIIL).jk();
    }

    @Override // X.InterfaceC1650190t2n
    public void js2() {
        this.LLILZIL.LJIIJ(Unit.LIZ);
    }

    @Override // X.InterfaceC1650190t2n
    public boolean k80() {
        InterfaceC2254081DKk interfaceC2254081DKk;
        InterfaceC2254081DKk interfaceC2254081DKk2;
        if (this.LLJJIJIIJIL.LJI() == null) {
            return (!this.LLLLLJIL || (interfaceC2254081DKk = this.LLLIIL) == null || interfaceC2254081DKk.getHasSetFocusAreas()) ? false : true;
        }
        if (!this.LLLLLJIL || (interfaceC2254081DKk2 = this.LLLIIL) == null || interfaceC2254081DKk2.getHasSetFocusAreas()) {
            return false;
        }
        return (this.LLJJIJIIJIL.LJI().intValue() == 6 && this.LLJJIJIIJIL.LJI().intValue() == 3) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [X.1DLD] */
    public void kc() {
        C1441190nbh c1441190nbhLIZIZ = this.LLLIL.LIZIZ();
        if (c1441190nbhLIZIZ.isEmpty()) {
            return;
        }
        final File fileLJ = this.LLLIL.mWorkspace.LJ();
        final ArrayList arrayList = new ArrayList();
        for (TimeSpeedModelExtension timeSpeedModelExtension : c1441190nbhLIZIZ) {
            this.LLLLLL.LJJIII.getClass();
            arrayList.add(new ASMediaSegment(timeSpeedModelExtension.getSpeed(), timeSpeedModelExtension.getDuration()));
        }
        if (arrayList.isEmpty()) {
            return;
        }
        InterfaceC2254001DKc mediaController = St2().getMediaController();
        fileLJ.getPath();
        mediaController.p5(arrayList, this.LLLIL.mMusicStart, new InterfaceC2183551Acz() { // from class: X.1DLD
            @Override // X.InterfaceC2183551Acz
            public final void onDone(int i) {
                C2254071DKj.J9(this.LIZ, arrayList, fileLJ, i);
            }
        });
    }

    @Override // X.InterfaceC1650190t2n
    public SavePhotoStickerInfo kq2() {
        if (C580130Mp9.LIZ(this.LLLZZ)) {
            return null;
        }
        return new SavePhotoStickerInfo(new ArrayList(this.LLLZZ), this.LLLZZIL, this.LLZ, this.LLZIL);
    }

    @Override // X.InterfaceC1650190t2n
    public boolean le0() {
        return this.LLLLLL.LJ;
    }

    @Override // X.InterfaceC1650190t2n
    public void ls() {
        this.LLLLZLLIL.ls();
    }

    @Override // X.InterfaceC1650190t2n
    public boolean n() {
        return this.LLLIIL.n();
    }

    public Surface n5() {
        Surface surface = this.LLZLI;
        return surface == null ? x5() : surface;
    }

    public void o7() {
        if (this.LLLIL.LJIIJJI()) {
            DuetContext duetContext = this.LLLIL.duetContext;
            C1441280nbq c1441280nbq = EmbaddedWindowInfo.CREATOR;
            int i = duetContext.duetVideoWidth;
            int i2 = duetContext.duetVideoHeight;
            c1441280nbq.getClass();
            EmbaddedWindowInfo embaddedWindowInfo = new EmbaddedWindowInfo();
            embaddedWindowInfo.x = 0;
            embaddedWindowInfo.y = 0;
            embaddedWindowInfo.width = i;
            embaddedWindowInfo.height = i2;
            embaddedWindowInfo.start = 0;
            embaddedWindowInfo.end = Integer.MAX_VALUE;
            ArrayList arrayList = new ArrayList();
            arrayList.add(embaddedWindowInfo);
            duetContext.windowInfoList = arrayList;
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        InterfaceC2177771AKx interfaceC2177771AKx;
        this.LLLLLL.LJIILJJIL.getClass();
        super.onDestroy();
        this.LLLIIL.hh(this.LLLLLLZ);
        this.LLLIIL.setDataSourceVideoCompleteListener(null);
        this.LLLIIL.setSATZoomListener(null);
        this.LLLIIL.jh();
        this.LLLIIL.N0(this.LLLZLL);
        this.LLLIIL.I0();
        this.LLLLLILLIL = false;
        this.LLLLLJIL = true;
        this.LLLLZLLIL.release();
        ((C1DL9) this.LLLIIL).onDestroy();
        this.LLLLLL.LJIILJJIL.getClass();
        InterfaceC1452360nti interfaceC1452360nti = this.LLLLZLLLI;
        if (interfaceC1452360nti != null && (interfaceC2177771AKx = this.LLLZ) != null) {
            interfaceC1452360nti.Wn2(interfaceC2177771AKx);
        }
        if (((Boolean) C273370AnX.LIZ.getValue()).booleanValue()) {
            C13SS.LIZ.getClass();
            C13SS.LIZ("MEMORY_LEAK", "release model download interface in CommonCameraLogicComponent");
            this.LLLIILIL.LJ = null;
        }
    }

    @Override // X.InterfaceC1650190t2n
    public int re1() {
        return this.LLLIIL.getLastFlashMode();
    }

    @Override // X.InterfaceC1650190t2n
    public VEDisplaySettings s1() {
        return this.LLLIIL.getMediaController().s1();
    }

    @Override // X.InterfaceC1650190t2n
    public InterfaceC2253831DJl u92() {
        return this.LLLZIIL.getValue();
    }

    @Override // X.InterfaceC1650190t2n
    public long xV1() {
        VERecorder vERecorder = this.LLLIILIL;
        if (vERecorder == null) {
            return -1L;
        }
        return vERecorder.LIZIZ.LJJIZ.LJIIIIZZ();
    }

    public void xb() {
        this.LLLLZLLIL.Lo();
    }

    @Override // X.InterfaceC1650190t2n
    public void yZ0() {
        this.LLLIIL.ph();
    }

    private void Bb() {
        St2().qh(new C650110Pej());
        if (this.LLLIL.veCherEffectParam != null) {
            St2().nk(this.LLLIL.veCherEffectParam.getMatrix(), this.LLLIL.veCherEffectParam.getDuration(), this.LLLIL.veCherEffectParam.getSegUseCher());
        }
    }

    private boolean P4() {
        long jNanoTime = System.nanoTime();
        long j = this.LLLLLLLLLL;
        if (j <= 0) {
            this.LLLLLLLLLL = jNanoTime;
            return true;
        }
        if (TimeUnit.NANOSECONDS.toMillis(jNanoTime - j) <= this.LLLLLL.LJIILL) {
            return false;
        }
        this.LLLLLLLLLL = jNanoTime;
        return true;
    }

    public void Na() {
        if (LJLJJLL() == 1) {
            zo(true);
        } else {
            qh(2);
        }
    }

    public void Oa() {
        C2219091BtD.LIZLLL().d("CameraLogicComponent => previewCamera");
        Vb();
        K4(new ARunnableS135S0100000_35(this, 17));
        if (Looper.getMainLooper() == Looper.myLooper()) {
            this.LLILLL.LJII(Boolean.TRUE);
        } else {
            this.LLILLL.LJFF(Boolean.TRUE);
        }
        this.LLLJIL = true;
    }

    @Override // X.InterfaceC1650190t2n
    public String Th2() {
        boolean z = false;
        boolean z2 = K(Ue()) && C2253291DHj.LJIIIZ(this.LLLIIII);
        boolean z3 = WE1(Ue(), false) && C2206701BYe.LIZ(this.LLLIIII).LIZ.getInt("key_camera_shake_mode", 0) == 1;
        if (this.LLJJIJI.LJI() != null && this.LLJJIJI.LJI().getFirst().intValue() == VECameraSettings.CAMERA_FACING_ID.FACING_TELEPHOTO.ordinal()) {
            z = true;
        }
        StringBuilder sb = new StringBuilder();
        if (z2) {
            sb.append(1);
        }
        if (z3) {
            if (sb.length() != 0) {
                sb.append(":");
            }
            sb.append(2);
        }
        if (z) {
            if (sb.length() != 0) {
                sb.append(":");
            }
            sb.append(3);
        }
        return sb.toString();
    }

    @Override // X.InterfaceC1650190t2n
    public long YG1() {
        long endFrameTimeUS = St2().getEndFrameTimeUS() / 1000;
        CameraComponentModel cameraComponentModel = this.LLLIL;
        long j = cameraComponentModel.isRetakeMode ? cameraComponentModel.mRetakeTime : cameraComponentModel.mTotalRecordingTime;
        return endFrameTimeUS > 0 ? j + TimeSpeedModelExtension.calculateRealTime(endFrameTimeUS, getSpeed().value()) : j;
    }

    public void cb() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.LLJJ.LJIIIZ(Long.valueOf(jCurrentTimeMillis));
        MutableLiveData<C1448140nmu> mutableLiveData = this.LLJIJIL;
        long j = this.LLLLIILLL;
        long j2 = this.LLLLIL;
        mutableLiveData.postValue(new C1448140nmu(j, jCurrentTimeMillis, j2, j2));
    }

    @Override // X.InterfaceC1650190t2n
    public View fF2() {
        return getPreviewView();
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        if (this.LLLLLL.LIZJ == EnumC1985407q8.STAGE_ON_CREATE) {
            Ka();
        }
        bc(getPreviewView(), Float.valueOf(C11VU.LIZ(20.0f)));
        Br2().LIZ(this, new InterfaceC1441305kZ() { // from class: X.1DLL
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.LL.kc();
            }
        });
        this.LLLLLL.LJIILJJIL.getClass();
    }

    @Override // X.AbstractC2255721DQs
    public void onResume() {
        super.onResume();
        this.LLLLLILLIL = true;
        this.LLLLLL.LJIILJJIL.getClass();
        yb();
        InterfaceC1452360nti interfaceC1452360nti = this.LLLLZLLLI;
        if (interfaceC1452360nti != null) {
            interfaceC1452360nti.i9(null);
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onStart() {
        super.onStart();
        O4();
    }

    public void s7() {
        St2().init();
        Bb();
        o7();
        if (this.LLLLLLZZ) {
            CameraComponentModel cameraComponentModel = this.LLLIL;
            int i = cameraComponentModel.mRestoreType;
            if ((i == 2 || i == 1) && !cameraComponentModel.LIZIZ().isEmpty()) {
                this.LLLLLLZZ = false;
                kc();
            }
        }
    }

    @Override // X.InterfaceC1650190t2n
    public C385670FAf<Boolean> A31() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC1650190t2n
    public LiveEvent<Unit> AQ0() {
        return this.LLJJL;
    }

    @Override // X.InterfaceC1650190t2n
    public C385670FAf<Double> BP2() {
        return this.LLJLILLLLZIIL;
    }

    @Override // X.InterfaceC1650190t2n
    public LiveEvent<Unit> Br2() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC1650190t2n
    public LiveEvent<Long> DB1() {
        return this.LLJJI;
    }

    @Override // X.InterfaceC1650190t2n
    public LiveEvent<Unit> DS1() {
        return this.LLLI;
    }

    @Override // X.InterfaceC1650190t2n
    public LiveEvent<C1653280t7m> Dm2() {
        return this.LLJJJJJIL;
    }

    @Override // X.InterfaceC1650190t2n
    public LiveEvent<Long> Fs0() {
        return this.LLJJ;
    }

    @Override // X.InterfaceC1650190t2n
    public LiveEvent<Unit> HE2() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    @Override // X.InterfaceC1650190t2n
    public LiveEvent<Pair<Integer, Integer>> JO1() {
        return this.LLJLLL;
    }

    public final VERecorder Jz0() {
        return this.LLLIILIL;
    }

    @Override // X.InterfaceC1650190t2n
    public LiveEvent<Long> Kg0() {
        return this.LLJILJIL;
    }

    @Override // X.InterfaceC1650190t2n
    public List<String> Lg2() {
        return this.LLZILL;
    }

    @Override // X.InterfaceC1650190t2n
    public boolean NS0() {
        return this.LLLLZ;
    }

    @Override // X.InterfaceC1650190t2n
    public LiveEvent<Unit> O71() {
        return this.LLJLL;
    }

    @Override // X.InterfaceC1650190t2n
    public AudioRecordModule OA2() {
        return this.LLLILZJ;
    }

    @Override // X.InterfaceC1650190t2n
    public LiveEvent<Boolean> Or0() {
        return this.LLL;
    }

    @Override // X.InterfaceC1650190t2n
    public LiveEvent<Pair<Integer, Boolean>> Q30() {
        return this.LLLII;
    }

    @Override // X.InterfaceC1650190t2n
    public InterfaceC2254081DKk St2() {
        return this.LLLIIL;
    }

    @Override // X.InterfaceC1650190t2n
    public LiveData<Float> Tz1() {
        return this.LLJZ;
    }

    @Override // X.InterfaceC1650190t2n
    public C2177931ALn V21() {
        return this.LLLILZ;
    }

    @Override // X.InterfaceC1650190t2n
    public LiveEvent<Unit> Wt0() {
        return this.LLJJIII;
    }

    @Override // X.InterfaceC1650190t2n
    public InterfaceC2254021DKe ZT() {
        return this.LLLLZLLIL;
    }

    @Override // X.InterfaceC1650190t2n
    public LiveData<C1DLP> bX1() {
        return this.LLJZIJLIL;
    }

    @Override // X.InterfaceC1650190t2n
    public /* bridge */ /* synthetic */ LiveEvent bu2() {
        return this.LLJJJJLIIL;
    }

    @Override // X.InterfaceC1650190t2n
    public Effect cP1() {
        return this.LLLLLLL;
    }

    @Override // X.InterfaceC1650190t2n
    public LiveEvent<Pair<Integer, Float>> f72() {
        return this.LLJJIJI;
    }

    @Override // X.InterfaceC1650190t2n
    public LiveEvent<Integer> fT0() {
        return this.LLIZ;
    }

    @Override // X.InterfaceC1650190t2n
    public boolean fp1() {
        return this.LLLLLZIL;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        d5();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    @Override // X.InterfaceC1650190t2n
    public C1DKV getRecordContext() {
        return this.LLLLZLL;
    }

    @Override // X.InterfaceC1650190t2n
    public s getSpeed() {
        return this.LLJL;
    }

    @Override // X.InterfaceC1650190t2n
    public LiveEvent<C1403440mco> h92() {
        return this.LLIZLLLIL;
    }

    @Override // X.InterfaceC1650190t2n
    public /* bridge */ /* synthetic */ C385670FAf hE2() {
        return this.LLJILJILJ;
    }

    @Override // X.InterfaceC1650190t2n
    public C1650220t2q jx2() {
        return this.LLLZI;
    }

    @Override // X.InterfaceC1650190t2n
    public LiveData<Boolean> lq0() {
        return this.LLLFF;
    }

    @Override // X.InterfaceC1650190t2n
    public LiveEvent<C1634100scq<Integer, Integer, String>> o62() {
        return this.LLJLLIL;
    }

    @Override // X.InterfaceC1650190t2n
    public LiveEvent<Integer> oN() {
        return this.LLJJIJIIJIL;
    }

    @Override // X.InterfaceC1650190t2n
    public LiveEvent<Boolean> ok0() {
        return this.LLJ;
    }

    @Override // X.InterfaceC1650190t2n
    public LiveEvent<q> p92() {
        return this.LLJJIJIL;
    }

    @Override // X.InterfaceC1650190t2n
    public LiveEvent<Unit> ph0() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC1650190t2n
    public CameraComponentModel pw0() {
        return this.LLLIL;
    }

    @Override // X.InterfaceC1650190t2n
    public LiveEvent<Integer> qB() {
        return this.LLJJJIL;
    }

    @Override // X.InterfaceC1650190t2n
    public LiveData<C1448140nmu> qF1() {
        return this.LLJIJIL;
    }

    @Override // X.InterfaceC1650190t2n
    public LiveEvent<Integer> qG2() {
        return this.LLJJJ;
    }

    @Override // X.InterfaceC1650190t2n
    public C1DHV qa() {
        return this.LLLLZIL;
    }

    @Override // X.InterfaceC1650190t2n
    public LiveEvent<Unit> r12() {
        return this.LLLFFI;
    }

    public h0<Long> t5() {
        return this.LLJILJILJ;
    }

    @Override // X.InterfaceC1650190t2n
    public C385670FAf<Boolean> tS1() {
        return this.LLILLL;
    }

    public C560530Lyd<C1652620t6i> v5() {
        return this.LLJJJJLIIL;
    }

    @Override // X.InterfaceC1650190t2n
    public LiveEvent<Boolean> vB1() {
        return this.LLJI;
    }

    @Override // X.InterfaceC1650190t2n
    public LiveEvent<C1648160szW> vC1() {
        return this.LLJJJJ;
    }

    @Override // X.InterfaceC1650190t2n
    public s wD() {
        return this.LLJLIL;
    }

    @Override // X.InterfaceC1650190t2n
    public LiveEvent<Long> xF1() {
        return this.LLJILLL;
    }

    @Override // X.InterfaceC1650190t2n
    public C385670FAf<Boolean> xl0() {
        return this.LLLF;
    }

    @Override // X.InterfaceC1650190t2n
    public boolean xs1() {
        return this.LLLLLZL;
    }

    @Override // X.InterfaceC1650190t2n
    public LiveEvent<Boolean> y82() {
        return this.LLLFZ;
    }

    @Override // X.InterfaceC1650190t2n
    public boolean yC() {
        return this.LLLLILI;
    }

    @Override // X.InterfaceC1650190t2n
    public InterfaceC576950Mk1 yP() {
        return this.LLLILZLLLI;
    }

    @Override // X.InterfaceC1650190t2n
    public C385670FAf<Boolean> yj1() {
        return this.LLILZ;
    }

    public static /* synthetic */ void T9(final C2254071DKj c2254071DKj) {
        InterfaceC2254081DKk interfaceC2254081DKk = c2254071DKj.LLLIIL;
        if (interfaceC2254081DKk != null) {
            interfaceC2254081DKk.mk(new InterfaceC1623210sLH() { // from class: X.1DLE
                @Override // X.InterfaceC1623210sLH
                public final void onResult(String[] strArr) {
                    C2254071DKj.P9(this.LIZ, strArr);
                }
            });
        }
    }

    public static /* synthetic */ Workspace W7(C2254071DKj c2254071DKj) {
        return c2254071DKj.LLLIL.mWorkspace;
    }

    public static /* synthetic */ void Z7(C2254071DKj c2254071DKj) {
        c2254071DKj.LLILLJJLI.LJII(Boolean.TRUE);
    }

    public static /* synthetic */ Unit c9(Integer num) {
        if (num.intValue() != 0) {
            InterfaceC1463990oCT interfaceC1463990oCTLIZLLL = C2219091BtD.LIZLLL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("startPreviewAsync ret = ");
            sbLIZ.append(num);
            interfaceC1463990oCTLIZLLL.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        }
        return Unit.LIZ;
    }

    public static /* synthetic */ Boolean d8(C2254071DKj c2254071DKj) {
        return Boolean.valueOf(c2254071DKj.LLLZIL);
    }

    public static /* synthetic */ void j9(C2254071DKj c2254071DKj) {
        c2254071DKj.LLLIIL.Ah(c2254071DKj.n5(), Build.DEVICE, new AObjectS130S0000000_35(2));
    }

    public static /* synthetic */ InterfaceC20520115Rf o8(C2254071DKj c2254071DKj) {
        return c2254071DKj.LLLIIL.getViewFunction();
    }

    public static /* synthetic */ Boolean u8(C2254071DKj c2254071DKj) {
        return Boolean.valueOf(c2254071DKj.LLLZIL);
    }

    public static /* synthetic */ Unit y8(C2254071DKj c2254071DKj) {
        c2254071DKj.Jd1();
        return null;
    }

    public static /* synthetic */ Unit z8(C2254071DKj c2254071DKj) {
        LiveEvent<Boolean> liveEventOk0 = c2254071DKj.ok0();
        if (liveEventOk0.LJI() != null && !liveEventOk0.LJI().booleanValue()) {
            c2254071DKj.AF2(true);
            return null;
        }
        return null;
    }

    @Override // X.InterfaceC1650190t2n
    public void AF2(boolean z) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            this.LLJ.LJIIJ(Boolean.valueOf(z));
        } else {
            this.LLJ.LJIIIZ(Boolean.valueOf(z));
        }
    }

    @Override // X.InterfaceC1650190t2n
    public void CK2(int i) {
        this.LLJJIJIIJIL.LJIIJ(Integer.valueOf(i));
    }

    @Override // X.InterfaceC1650190t2n
    public int D4(VEDisplaySettings vEDisplaySettings) {
        return this.LLLIIL.getMediaController().D4(vEDisplaySettings);
    }

    @Override // X.InterfaceC1650190t2n
    public void EV1(int i) {
        this.LLLIIL.O3(i);
        this.LLJJIJIIJIL.LJIIJ(Integer.valueOf(i));
    }

    public void Ga(int i) {
        this.LLILZ.LJII(Boolean.TRUE);
        this.LLJJL.LJIIJ(Unit.LIZ);
        InterfaceC1645720sva interfaceC1645720sva = this.LLLILZ.LIZ;
        if (interfaceC1645720sva != null) {
            interfaceC1645720sva.M4();
        }
        InterfaceC2254081DKk interfaceC2254081DKk = this.LLLIIL;
        this.LLLLLL.getClass();
        interfaceC2254081DKk.lk();
        boolean z = true;
        this.LLLIIL.setHandDetectLowpower(!this.LLLLLL.LJIIIIZZ);
        CameraComponentModel cameraComponentModel = this.LLLIL;
        if (cameraComponentModel != null) {
            InterfaceC2254081DKk interfaceC2254081DKk2 = this.LLLIIL;
            if (!cameraComponentModel.LJI() && !this.LLLIL.LJII()) {
                z = false;
            }
            interfaceC2254081DKk2.Ra(z);
        }
    }

    @Override // X.InterfaceC1650190t2n
    public void HT1(boolean z) {
        this.LLLLLILLIL = z;
        if (!z) {
            this.LLLLLJIL = true;
        }
    }

    @Override // X.InterfaceC1650190t2n
    public void I70(s sVar) {
        this.LLJLIL = sVar;
    }

    @Override // X.InterfaceC1650190t2n
    public void Ja0(boolean z) {
        this.LLJI.LJIIJ(Boolean.valueOf(z));
    }

    @Override // X.InterfaceC1650190t2n
    public boolean K(boolean z) {
        return this.LLLIIL.K(z);
    }

    public void K4(Runnable runnable) {
        runnable.run();
    }

    @Override // X.InterfaceC1650190t2n
    public void LE(boolean z) {
        this.LLLLL = z;
        Fb();
    }

    @Override // X.InterfaceC1650190t2n
    public void LJLJLLL(Surface surface) {
        St2().LJLJLLL(surface);
        this.LLZLI = surface;
    }

    @Override // X.InterfaceC1650190t2n
    public void M2(boolean z) {
        this.LLLIIL.M2(z);
    }

    public void N5(int i) {
        j8();
        if (Looper.getMainLooper() == Looper.myLooper()) {
            this.LLIZ.LJIIJ(Integer.valueOf(i));
        } else {
            this.LLIZ.LJIIIZ(Integer.valueOf(i));
        }
    }

    public void N6(Surface surface) {
        InterfaceC2253451DHz interfaceC2253451DHz = this.LLLLLLJ;
        if (interfaceC2253451DHz != null) {
            interfaceC2253451DHz.LIZIZ("surface_set_to_first_frame_render");
            this.LLLLLLJ.LIZ("surface_create", "ve_recorder_start_to_surface_create", "first_frame_captured_to_surface_created");
        }
    }

    @Override // X.InterfaceC1650190t2n
    public void NF(s sVar) {
        this.LLJL = sVar;
        this.LLJLILLLLZIIL.LJII(Double.valueOf(sVar.value()));
        this.LLJLL.LJIIJ(Unit.LIZ);
    }

    @Override // X.InterfaceC1650190t2n
    public boolean Tc2(boolean z) {
        C1DHU c1dhuEp = ep();
        c1dhuEp.getClass();
        if (!z && c1dhuEp.LIZIZ()) {
            return true;
        }
        return false;
    }

    public UUID Th(int[] iArr) {
        return this.LLLLZLLIL.Th(iArr);
    }

    @Override // X.InterfaceC1650190t2n
    public void Uj(boolean z) {
        this.LLLLZLLIL.Uj(z);
    }

    @Override // X.InterfaceC1650190t2n
    public boolean Vy2(VESize vESize) {
        return this.LLLIIL.getCameraController().i4(vESize);
    }

    @Override // X.InterfaceC1650190t2n
    public void Wl1(int i) {
        this.LLLILZ.LIZ.setDetectInterval(i);
    }

    @Override // X.InterfaceC1650190t2n
    public void X8(boolean z) {
        C2254141DKq.LIZ((C1DL9) this.LLLIIL).X8(z);
    }

    @Override // X.InterfaceC1650190t2n
    public void Yi2(float f) {
        this.LLLLZI = f;
    }

    @Override // X.InterfaceC1650190t2n
    public void ZF(boolean z) {
        this.LLLLLIL = z;
        Fb();
    }

    @Override // X.InterfaceC1650190t2n
    public void Zl0(C1663770tOh c1663770tOh) {
        C1653280t7m c1653280t7m;
        C1652620t6i c1652620t6i;
        C560530Lyd<C1652620t6i> c560530Lyd = this.LLJJJJLIIL;
        final C560530Lyd<C1653280t7m> c560530Lyd2 = this.LLJJJJJIL;
        boolean z = c1663770tOh.LIZ;
        boolean z2 = c1663770tOh.LIZIZ;
        final boolean z3 = c1663770tOh.LIZJ;
        if (z2) {
            if (c560530Lyd != null) {
                if (!z) {
                    AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                    alphaAnimation.setDuration(150L);
                    alphaAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: X.0tAr
                        @Override // android.view.animation.Animation.AnimationListener
                        public final void onAnimationRepeat(Animation animation) {
                        }

                        @Override // android.view.animation.Animation.AnimationListener
                        public final void onAnimationStart(Animation animation) {
                        }

                        @Override // android.view.animation.Animation.AnimationListener
                        public final void onAnimationEnd(Animation animation) {
                            c560530Lyd2.LJIIJ(new C1653280t7m(z3, false));
                        }
                    });
                    c1652620t6i = new C1652620t6i(alphaAnimation, false);
                } else {
                    AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
                    alphaAnimation2.setDuration(150L);
                    alphaAnimation2.setAnimationListener(new Animation.AnimationListener() { // from class: X.0tAs
                        @Override // android.view.animation.Animation.AnimationListener
                        public final void onAnimationRepeat(Animation animation) {
                        }

                        @Override // android.view.animation.Animation.AnimationListener
                        public final void onAnimationStart(Animation animation) {
                        }

                        @Override // android.view.animation.Animation.AnimationListener
                        public final void onAnimationEnd(Animation animation) {
                            c560530Lyd2.LJIIJ(new C1653280t7m(z3, true));
                        }
                    });
                    c1652620t6i = new C1652620t6i(alphaAnimation2, true);
                }
                c560530Lyd.LJIIJ(c1652620t6i);
                return;
            }
            return;
        }
        if (!z) {
            c1653280t7m = new C1653280t7m(z3, false);
        } else {
            c1653280t7m = new C1653280t7m(z3, true);
        }
        c560530Lyd2.LJIIJ(c1653280t7m);
    }

    @Override // X.InterfaceC1650190t2n
    public void br1(boolean z) {
        this.LLLLLLLLL = z;
    }

    @Override // X.InterfaceC1650190t2n
    public void c11(InterfaceC2183551Acz interfaceC2183551Acz) {
        this.LLLLLL.getClass();
        if (!this.LLLLLL.LJI) {
            interfaceC2183551Acz.onDone(-105);
        } else {
            this.LLLLLLLZIL = true;
            this.LLLIIL.getMediaController().I5(new C1DLJ(this, interfaceC2183551Acz));
        }
    }

    @Override // X.InterfaceC1650190t2n
    public void cB0(String str) {
        this.LLLZZIL = str;
    }

    @Override // X.InterfaceC1650190t2n
    public void detectDirtyLens(final Function2<? super Float, ? super Integer, Unit> function2) {
        VETaintSceneDetectParams vETaintSceneDetectParams = new VETaintSceneDetectParams();
        vETaintSceneDetectParams.detectFrequency = 1;
        vETaintSceneDetectParams.algorithmFlag = 21;
        this.LLLIILIL.LJJIII(vETaintSceneDetectParams, new InterfaceC2219671Bu9() { // from class: X.1Bu6
            @Override // X.InterfaceC2219671Bu9
            public final void LIZ(String str) {
            }

            @Override // X.InterfaceC2219671Bu9
            public final void LIZJ() {
            }

            @Override // X.InterfaceC2219671Bu9
            public final void onSuccess(int i, float f, int i2) {
                String str;
                Function2 function22 = function2;
                if (function22 != null) {
                    function22.invoke(Float.valueOf(f), Integer.valueOf(i2));
                }
                if (i2 == VECameraSettings.CAMERA_FACING_ID.FACING_FRONT.ordinal()) {
                    str = "front";
                } else if (i2 == VECameraSettings.CAMERA_FACING_ID.FACING_WIDE_ANGLE.ordinal()) {
                    str = "wide_angle";
                } else {
                    str = "rear";
                }
                InterfaceC2140108Zz interfaceC2140108ZzLJ = C2219091BtD.LJ();
                C0LAB c0lab = new C0LAB();
                c0lab.LIZJ(Float.valueOf(f), "score");
                c0lab.LJ("camera_type", str);
                interfaceC2140108ZzLJ.LIZ("dirty_camera_detect", c0lab.LIZ);
            }
        });
    }

    @Override // X.InterfaceC1650190t2n
    public void ei1(q qVar) {
        this.LLJJIJIL.LJIIJ(qVar);
        if (!qVar.LIZ) {
            qh(0);
            X8(false);
        }
    }

    public void gb(Cert cert) {
        kb(cert, false);
    }

    @Override // X.InterfaceC1650190t2n
    public void kH1(boolean z) {
        InterfaceC2254081DKk interfaceC2254081DKk = this.LLLIIL;
        C1DI4 c1di4 = C1DI4.LIZ;
        interfaceC2254081DKk.th(C1DI6.LIZ.LIZ(C1DI7.AUDIO_START_DUET, EnumC2249681D3m.DUET), z);
    }

    @Override // X.InterfaceC1650190t2n
    public int kk(float f) {
        this.LLLILZ.LIZ.kk(f);
        return 0;
    }

    @Override // X.InterfaceC1650190t2n
    public void lb1(int i) {
        this.LLLIIL.R3(i);
    }

    @Override // X.InterfaceC1650190t2n
    public void pv0(boolean z) {
        int i;
        C560530Lyd<Integer> c560530Lyd = this.LLJJJ;
        if (z) {
            i = 3;
        } else {
            i = 2;
        }
        c560530Lyd.LJIIJ(Integer.valueOf(i));
    }

    @Override // X.InterfaceC1650190t2n
    public void qh(int i) {
        int flashMode = getFlashMode();
        this.LLLIIL.LIZ(i);
        this.LLJJIJIIJIL.LJIIJ(Integer.valueOf(i));
        if (this.LLLLZ) {
            EV1(flashMode);
        }
    }

    @Override // X.InterfaceC1650190t2n
    public boolean scaleCamera(ScaleGestureDetector scaleGestureDetector) {
        return K3(scaleGestureDetector.getCurrentSpan() - scaleGestureDetector.getPreviousSpan(), scaleGestureDetector.getScaleFactor());
    }

    @Override // X.InterfaceC1650190t2n
    public void setBodyBeautyLevel(int i) {
        this.LLLIIL.setBodyBeautyLevel(i);
    }

    @Override // X.InterfaceC1650190t2n
    public void setExposureSeekBarProgress(float f) {
        if (this.LLLIIL.getExposureCompensationEnable() && this.LLLIIL.getIsExposureSeekBarShowing()) {
            this.LLLIIL.setExposureSeekBarProgress(f);
            if (this.LLLLLILLIL && this.LLLLLJIL) {
                U9();
            }
            this.LLLLLJIL = false;
        }
    }

    @Override // X.InterfaceC1650190t2n
    public void setFilter(String str) {
        this.LLLILZ.LIZ.setFilter(str);
    }

    @Override // X.InterfaceC1650190t2n
    public void tQ(boolean z) {
        this.LLJJJIL.LJIIJ(Integer.valueOf(z ? 1 : 0));
    }

    public void u6(float f) {
        this.LLJZ.postValue(Float.valueOf(f));
    }

    @Override // X.InterfaceC1650190t2n
    public void vo0(boolean z) {
        this.LLLLLJLJLL = z;
        Fb();
    }

    @Override // X.InterfaceC1650190t2n
    public void w61(C1648160szW c1648160szW) {
        C19GS c19gs = this.LLLIIII;
        CameraComponentModel cameraComponentModel = this.LLLIL;
        this.LLLLLL.getClass();
        if (cameraComponentModel.LJIIJJI()) {
            int i = c1648160szW.LIZ;
            if (i != 1) {
                if (i == 2) {
                    cameraComponentModel.isMuted = true;
                }
            } else {
                cameraComponentModel.isMuted = false;
                C21366318jV.LIZLLL.getClass();
                C1638280sja.LIZJ(2131845787, 1, c19gs).LIZ();
            }
        }
        this.LLJJJJ.LJIIJ(c1648160szW);
    }

    public C2185991Agv wr(int[] iArr) {
        return this.LLLLZLLIL.wr(iArr);
    }

    @Override // X.InterfaceC1650190t2n
    public void yN1(C1DLQ c1dlq) {
        this.LLLIIL.getCameraController().k4(new int[]{c1dlq.LIZ, c1dlq.LIZIZ});
    }

    @Override // X.InterfaceC1650190t2n
    public void zj1(boolean z) {
        this.LLLLILI = z;
    }

    @Override // X.InterfaceC1650190t2n
    public void zm2(float f) {
        this.LLLILZ.LIZ.yo(f);
    }

    @Override // X.InterfaceC1650190t2n
    public void zo(boolean z) {
        C2254141DKq.LIZ((C1DL9) this.LLLIIL).zo(z);
    }

    public static /* synthetic */ void P9(C2254071DKj c2254071DKj, String[] strArr) {
        if (strArr != null && strArr.length > 0) {
            ArrayList arrayList = new ArrayList();
            c2254071DKj.LLZILL = arrayList;
            Collections.addAll(arrayList, strArr);
            return;
        }
        c2254071DKj.LLZILL = null;
    }

    private void bc(View view, Float f) {
        view.setClipToOutline(true);
        view.setOutlineProvider(new C2189491AmZ(f, 2));
    }

    public static /* synthetic */ Unit h8(C2254071DKj c2254071DKj, Boolean bool) {
        c2254071DKj.LLLZIL = bool.booleanValue();
        return Unit.LIZ;
    }

    public void Ba(File file, int i) {
        Cb();
        if (this.LLLIL.mRestoreType == 1) {
            Context contextO3 = C786410Ut5.O3(this.LLLIIII);
            C21366318jV.LIZLLL.getClass();
            C1638280sja.LIZ(2131858142, 0, contextO3).LIZ();
            finish();
        }
    }

    @Override // X.InterfaceC1650190t2n
    public void Bh(String str, Map<Integer, Float> map) {
        this.LLLILZ.LIZ.Bh(str, map);
    }

    @Override // X.InterfaceC1650190t2n
    public void GK(float f, float f2) {
        boolean z;
        boolean zLb = Lb(fF2(), f, f2, this.LLLIIII.getResources().getDisplayMetrics().density, new C1425400nCE(new WeakReference(this.LLLIZZ), this.LLJLLL));
        if (P4() && zLb) {
            z = true;
            this.LLLIIL.M0();
            this.LLLIIL.H0((int) f, (int) f2);
            if (this.LLLIIL.getExposureCompensationEnable()) {
                this.LLLIIL.nh(f, f2);
            }
        } else {
            z = false;
        }
        this.LLLFZ.LJIIJ(Boolean.valueOf(z));
    }

    @Override // X.InterfaceC1650190t2n
    public void H31(boolean z, C560530Lyd<C1656320tCg> c560530Lyd) {
        C1660630tJd c1660630tJd = new C1660630tJd(this, z, c560530Lyd);
        VELumaDetectParams vELumaDetectParams = new VELumaDetectParams();
        vELumaDetectParams.algorithmFlag = 27;
        vELumaDetectParams.detectFrames = 1;
        this.LLLIILIL.LJJIII(vELumaDetectParams, c1660630tJd);
    }

    @Override // X.InterfaceC1650190t2n
    public boolean K3(float f, float f2) {
        return this.LLLLZLLIL.K3(f, f2);
    }

    @Override // X.InterfaceC1650190t2n
    public void Kg1(float f, float f2) {
        throw new C19376810rO("scaleRatioChange not support");
    }

    @Override // X.InterfaceC1650190t2n
    public void Nn(int i, String str) {
        this.LLLILZ.LIZ.Nn(i, str);
    }

    @Override // X.InterfaceC1650190t2n
    public void Pa(float f, float f2) {
        this.LLLILZ.LIZ.Pa(f, f2);
    }

    @Override // X.InterfaceC1650190t2n
    public int Q7(String str, float f) {
        this.LLLILZ.LIZ.Q7(str, f);
        return 0;
    }

    @Override // X.InterfaceC1650190t2n
    public void U00(Cert cert, boolean z) {
        int i;
        int i2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("policyPlaceholder: ");
        sbLIZ.append(cert);
        C1AL1.LIZ("ACTION_NAME_SWITCH_WIDE_CAMERA", C2188811AlT.LIZIZ(sbLIZ));
        int i3 = !KY() ? 1 : 0;
        this.LLLLZLLIL.LJII(cert, z);
        C560530Lyd<Integer> c560530Lyd = this.LLJJJIL;
        if (i3 != 0) {
            i = 3;
        } else {
            i = 2;
        }
        c560530Lyd.LJIIJ(Integer.valueOf(i));
        if (fh()) {
            this.LLJJJ.LJIIJ(Integer.valueOf(i3 ^ 1));
        }
        if (n()) {
            if (i3 != 0) {
                i2 = 5;
            } else {
                i2 = 6;
            }
            CK2(i2);
        }
        qh(0);
        if (this.LLLLZ) {
            lb1(0);
        }
    }

    @Override // X.InterfaceC1650190t2n
    public boolean WE1(boolean z, boolean z2) {
        C1DHU c1dhuEp = ep();
        c1dhuEp.getClass();
        if (!z && !z2 && c1dhuEp.LIZIZ()) {
            return true;
        }
        return false;
    }

    public void Ya(int i, String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.LLLLIILLL = jCurrentTimeMillis;
        this.LLJILLL.LJIIIZ(Long.valueOf(jCurrentTimeMillis));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" => asve OnFrameAvailable cost time: ");
        sbLIZ.append(this.LLLLIILLL - C1688770u31.LIZ);
        sbLIZ.append(",  mode is ");
        sbLIZ.append("normal");
        sbLIZ.append(", ext:");
        sbLIZ.append(i);
        sbLIZ.append(", msg:");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1650190t2n
    public void bp2(String[] strArr, int i) {
        this.LLLILZ.LIZ.io(i, strArr);
    }

    public void d6(int i, int i2) {
        if (!this.LLLLII) {
            this.LLLJL = i;
            this.LLLL = i2;
            this.LLLLII = true;
        }
    }

    @Override // X.InterfaceC1650190t2n
    public void iO1(String[] strArr, int i) {
        this.LLLILZ.LIZ.mo(i, strArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.1DL8] */
    @Override // X.InterfaceC1650190t2n
    public void jK(boolean z, final Rect[] rectArr) {
        long j;
        if (this.LLLLLZ != z) {
            this.LLLLLZ = z;
            VERecorder vERecorder = this.LLLIILIL;
            vERecorder.getClass();
            if (z) {
                j = 1;
            } else {
                j = 0;
            }
            C1284730jXL.LIZ(j, "te_lens_adaptive_sharpen");
            com.ss.android.vesdk.k kVar = vERecorder.LIZIZ;
            kVar.getClass();
            TEBundle tEBundleObtain = TEBundle.obtain();
            tEBundleObtain.setInt("LensFlag", 28);
            tEBundleObtain.setBool("EnableLensProcess", z);
            kVar.LJJJ.LJIL("EnableLens", tEBundleObtain);
        }
        if (z) {
            this.LLLIIL.getCameraController().C4(new InterfaceC1631620sYq() { // from class: X.1DL8
                @Override // X.InterfaceC1631620sYq
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return C2254071DKj.n9(this.LL, rectArr, (Integer) obj, (Integer) obj2, (Integer) obj3);
                }
            });
        }
    }

    public void kb(Cert cert, boolean z) {
        this.LLLLZLLIL.LJIIL(cert, z, this.LLLLZI);
    }

    @Override // X.InterfaceC1650190t2n
    public void setFilter(String str, float f) {
        this.LLLILZ.LIZ.setFilter(str, f);
    }

    public static /* synthetic */ void a9(C2254071DKj c2254071DKj, InterfaceC2183551Acz interfaceC2183551Acz, int i) {
        c2254071DKj.LLLIZZ.post(new ARunnableS46S0101000_35(interfaceC2183551Acz, i, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q9(final String str, String str2, InterfaceC2219571Btz interfaceC2219571Btz) {
        if (str != null && !str.isEmpty() && str2 != null && !str2.isEmpty()) {
            if (interfaceC2219571Btz != null) {
                final C2219541Btw c2219541Btw = new C2219541Btw(interfaceC2219571Btz);
                DownloadableModelSupport.getInstance().fetchResourcesByRequirementsAndModelNames(new String[]{str2}, C2097608Jq.LJIIJ(new Pair(str2, C1697810uHb.LJIILJJIL(str))), new IFetchResourceListener() { // from class: X.1Btt
                    @Override // com.ss.android.ugc.effectmanager.IFetchResourceListener
                    public final void onFailure(Exception exc) {
                        InterfaceC2219561Bty interfaceC2219561Bty = c2219541Btw;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("fetchResourcesByRequirementsAndModelNames onFailure: ");
                        sbLIZ.append(Log.getStackTraceString(exc));
                        C2188811AlT.LIZIZ(sbLIZ);
                        ((C2219541Btw) interfaceC2219561Bty).LIZ.getClass();
                        C2484209oO.LIZJ("VERecorder", "get model path failure!");
                        C2219091BtD.LIZIZ();
                    }

                    @Override // com.ss.android.ugc.effectmanager.IFetchResourceListener
                    public final void onSuccess(long j) {
                        try {
                            String str3 = "";
                            try {
                                String path = URI.create(C13Q5.LIZ().LIZLLL().findResourceUri(str)).getPath();
                                if (!TextUtils.isEmpty(path)) {
                                    if (new C0VSJ(path).exists()) {
                                        str3 = path;
                                    }
                                }
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                            if (str3.length() == 0) {
                                ((C2219521Btu) ((C2219541Btw) c2219541Btw).LIZ).getClass();
                                C2484209oO.LIZJ("VERecorder", "get model path failure!");
                                C2219091BtD.LIZIZ();
                            } else {
                                C2219521Btu c2219521Btu = (C2219521Btu) ((C2219541Btw) c2219541Btw).LIZ;
                                VETaintSceneDetectParams vETaintSceneDetectParams = c2219521Btu.LIZ;
                                vETaintSceneDetectParams.modelPath = str3;
                                c2219521Btu.LIZJ.LIZIZ.LJ(vETaintSceneDetectParams, c2219521Btu.LIZIZ);
                                C2219091BtD.LIZIZ();
                            }
                        } catch (Exception e2) {
                            TryCatchGuardChecker.doCheck(e2);
                            InterfaceC2219561Bty interfaceC2219561Bty = c2219541Btw;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("fetchResourcesByRequirementsAndModelNames success, but getResourceFinder appear exception ");
                            sbLIZ.append(e2);
                            C2188811AlT.LIZIZ(sbLIZ);
                            ((C2219541Btw) interfaceC2219561Bty).LIZ.getClass();
                            C2484209oO.LIZJ("VERecorder", "get model path failure!");
                            C2219091BtD.LIZIZ();
                        }
                    }
                });
                return;
            }
            return;
        }
        if (interfaceC2219571Btz != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("parameter null, modelName: ");
            sbLIZ.append(str);
            sbLIZ.append(" requirement:");
            sbLIZ.append(str2);
            C2188811AlT.LIZIZ(sbLIZ);
            C2484209oO.LIZJ("VERecorder", "get model path failure!");
        }
    }

    private /* synthetic */ void t9(String[] strArr, double[] dArr, boolean[] zArr) {
        if (strArr == null) {
            this.LLLIL.veCherEffectParam = null;
        } else {
            this.LLLIL.veCherEffectParam = new ClientCherEffectParam(strArr, dArr, zArr);
        }
        Da(strArr, dArr, zArr);
    }

    @Override // X.InterfaceC1650190t2n
    public void AJ(String str, String str2, boolean z) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        if (this.LLLZZ == null) {
            this.LLLZZ = new ArrayList();
        }
        this.LLLZZ.add(str2);
        this.LLZ = str;
        this.LLZIL = Boolean.valueOf(z);
    }

    public void L6(Surface surface, int i, int i2) {
        InterfaceC1463990oCT interfaceC1463990oCTLIZLLL = C2219091BtD.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CameraLogicComponent => surfaceChanged : width:");
        sbLIZ.append(i);
        sbLIZ.append(" height:");
        sbLIZ.append(i2);
        interfaceC1463990oCTLIZLLL.d(C2188811AlT.LIZIZ(sbLIZ));
        this.LLLIIL.LJLJLLL(surface);
    }

    public void U5(int i, int i2, String str) {
        V9(this.LLLJIL, i, i2, str);
    }

    public void aJ1(boolean z, C1AIY c1aiy, Cert cert) {
        int i;
        if (z) {
            this.LLJJJIL.LJIIJ(0);
            this.LLJJJ.LJIIJ(0);
            this.LLJJIJIIJIL.LJIIJ(5);
            this.LLLIIL.getCameraController().n4(c1aiy, cert);
            return;
        }
        C560530Lyd<Integer> c560530Lyd = this.LLJJJIL;
        if (this.LLLIIL.getCameraController().X3().LJII()) {
            i = 3;
        } else {
            i = 2;
        }
        c560530Lyd.LJIIJ(Integer.valueOf(i));
        this.LLJJJ.LJIIJ(1);
        pv0(C1DHU.LIZ(this.LLLIIII));
        this.LLJJJIL.LJIIJ(1);
        this.LLJJIJIIJIL.LJIIJ(6);
        this.LLLIIL.getCameraController().b4(cert);
    }

    @Override // X.InterfaceC1650190t2n
    public int cd0(q qVar, Cert cert, String str) {
        return A91(qVar, cert, str, false);
    }

    @Override // X.InterfaceC1650190t2n
    public int pg(String str, float f, float f2) {
        this.LLLILZ.LIZ.pg(str, f, f2);
        return 0;
    }

    @Override // X.InterfaceC1650190t2n
    public void qM(Pair<String, Float> pair, Pair<String, Float> pair2, float f) {
        float fAbs;
        if (pair != null && pair2 != null) {
            if (f < 0.0f) {
                fAbs = Math.abs(f);
            } else {
                fAbs = 1.0f - f;
            }
            this.LLLILZ.LIZ.ro(pair.getFirst(), pair2.getFirst(), fAbs, pair.getSecond().floatValue(), pair2.getSecond().floatValue());
        }
    }

    public void tb(boolean z, Cert cert, boolean z2) {
        this.LLLLZLLIL.LJIIIIZZ(z, cert, z2);
    }

    @Override // X.InterfaceC1650190t2n
    public void wr1(C1645090suZ c1645090suZ, C1645090suZ c1645090suZ2, float f) {
        throw new C19376810rO("setFilterScroll not support");
    }

    @Override // X.InterfaceC1650190t2n
    public int ya(String str, float f, float f2) {
        this.LLLILZ.LIZ.ya(str, f, f2);
        return 0;
    }

    public static /* synthetic */ void J9(final C2254071DKj c2254071DKj, List list, final File file, final int i) {
        InterfaceC1463990oCT interfaceC1463990oCTLIZLLL = C2219091BtD.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CameraLogicComponent Restore the segments");
        sbLIZ.append(list.size());
        sbLIZ.append(" dir: ");
        sbLIZ.append(file.getPath());
        sbLIZ.append("  res: ");
        sbLIZ.append(i);
        interfaceC1463990oCTLIZLLL.d(C2188811AlT.LIZIZ(sbLIZ));
        if (i != 0) {
            c2254071DKj.LLLIIII.runOnUiThread(new Runnable() { // from class: X.1DLC
                @Override // java.lang.Runnable
                public final void run() {
                    this.LL.Ba(file, i);
                }
            });
            C2216191BoX.LIZ.getClass();
            InterfaceC2216251Bod interfaceC2216251BodLIZIZ = ((C2208821Bce) C2216191BoX.LIZIZ()).LIZIZ();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("CameraLogicComponent tryRestoreAsync -> VECallListener.onDone:");
            sbLIZ2.append(i);
            interfaceC2216251BodLIZIZ.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
            ((C2208821Bce) C2216191BoX.LIZIZ()).LIZIZ().LIZ(Log.getStackTraceString(new Throwable()));
        }
    }

    public int A91(q qVar, Cert cert, String str, boolean z) {
        int iCd = this.LLLLZLLIL.Cd(z, cert, str);
        qVar.getClass();
        ei1(qVar);
        return iCd;
    }

    public void V9(boolean z, int i, int i2, String str) {
        this.LLLLIILL.LIZ(this.LLLIIII);
    }

    @Override // X.InterfaceC1650190t2n
    public void Y9(String[] strArr, int i, String[] strArr2, int i2) {
        this.LLLILZ.LIZ.Y9(strArr, i, strArr2, i2);
    }

    private boolean Lb(View view, float f, float f2, float f3, InterfaceC1427270nFF interfaceC1427270nFF) {
        return this.LLLLZLLIL.getCameraController().q4(new VEFocusSettings((int) f, (int) f2, view.getWidth(), view.getHeight(), f3, interfaceC1427270nFF));
    }

    public static /* synthetic */ Unit n9(C2254071DKj c2254071DKj, Rect[] rectArr, Integer num, Integer num2, Integer num3) {
        VEOneKeyProcessParams vEOneKeyProcessParams = new VEOneKeyProcessParams();
        vEOneKeyProcessParams.algorithmFlag = 28;
        vEOneKeyProcessParams.faceRects = rectArr;
        vEOneKeyProcessParams.iso = num.intValue();
        vEOneKeyProcessParams.minIso = num2.intValue();
        vEOneKeyProcessParams.maxIso = num3.intValue();
        c2254071DKj.LLLIILIL.LJJIII(vEOneKeyProcessParams, new InterfaceC2219671Bu9() { // from class: X.1DL6
            @Override // X.InterfaceC2219671Bu9
            public final void LIZ(String str) {
            }

            @Override // X.InterfaceC2219671Bu9
            public final void LIZJ() {
            }

            @Override // X.InterfaceC2219671Bu9
            public final void onSuccess(int i, float f, int i2) {
            }
        });
        return null;
    }

    public void J6(int i, boolean z, boolean z2, float f, final List<Integer> list) {
        this.LLJZIJLIL.postValue((C1DLP) new Object(list) { // from class: X.1DLP
            public final List<Integer> LIZ;

            {
                this.LIZ = list;
            }
        });
    }

    public void K6(EGLContext eGLContext, int i, int i2, int i3, int i4, long j) {
        C2219091BtD.LIZLLL().d("CameraLogicComponent => OnFrameAvailable");
        St2().hh(this.LLLLLLZ);
        C560530Lyd<Boolean> c560530Lyd = this.LLL;
        Boolean bool = Boolean.TRUE;
        c560530Lyd.LJIIIZ(bool);
        this.LLLF.LJFF(bool);
        if (this.LLLJ) {
            this.LLLJ = false;
            C2219091BtD.LIZLLL().d("CameraLogicComponent => addFragment Open Camera Frame Optimize");
            this.LLLIZZ.post(new ARunnableS135S0100000_35(this, 16));
        }
    }

    public C2254071DKj(C1DRG c1drg, CameraComponentModel cameraComponentModel, InterfaceC2187111Aij interfaceC2187111Aij, C1DI3 c1di3, C1A75 c1a75, C092O<C2254091DKl> c092o, InterfaceC2253441DHy interfaceC2253441DHy) {
        this(c1drg, cameraComponentModel, interfaceC2187111Aij, c1di3, c1a75, c092o, interfaceC2253441DHy, null, null);
    }

    /* JADX WARN: Type inference failed for: r0v51, types: [X.1DKp] */
    public C2254071DKj(C1DRG c1drg, CameraComponentModel cameraComponentModel, InterfaceC2187111Aij interfaceC2187111Aij, C1DI3 c1di3, C1A75 c1a75, C092O<C2254091DKl> c092o, InterfaceC2253441DHy interfaceC2253441DHy, InterfaceC2253451DHz interfaceC2253451DHz, Effect effect) {
        Boolean bool = Boolean.FALSE;
        this.LLILLJJLI = new h0<>(bool);
        this.LLILLL = new h0<>(bool);
        this.LLILZ = new h0<>(bool);
        this.LLILZIL = new C560530Lyd<>();
        this.LLILZLL = new C560530Lyd<>();
        this.LLIZ = new C560530Lyd<>();
        this.LLIZLLLIL = new C560530Lyd<>();
        this.LLJ = new C560530Lyd<>();
        this.LLJI = new C560530Lyd<>();
        this.LLJIJIL = new MutableLiveData<>();
        this.LLJILJIL = new C560530Lyd<>();
        this.LLJILJILJ = new h0<>(null);
        this.LLJILLL = new C560530Lyd<>();
        this.LLJJ = new C560530Lyd<>();
        this.LLJJI = new C560530Lyd<>();
        this.LLJJIII = new C560530Lyd<>();
        this.LLJJIJI = new C560530Lyd<>();
        this.LLJJIJIIJIL = new C560530Lyd<>();
        this.LLJJIJIL = new C560530Lyd<>();
        this.LLJJJ = new C560530Lyd<>();
        this.LLJJJIL = new C560530Lyd<>();
        this.LLJJJJ = new C560530Lyd<>();
        this.LLJJJJJIL = new C560530Lyd<>();
        this.LLJJJJLIIL = new C560530Lyd<>();
        this.LLJJL = new C560530Lyd<>();
        this.LLJJLIIIJLLLLLLLZ = new C560530Lyd<>();
        this.LLJL = s.NORMAL;
        this.LLJLIL = null;
        this.LLJLILLLLZIIL = new h0<>(Double.valueOf(r0.value()));
        this.LLJLL = new C560530Lyd<>();
        this.LLJLLIL = new C560530Lyd<>();
        this.LLJLLL = new C560530Lyd<>();
        this.LLJZ = new MutableLiveData<>();
        this.LLJZIJLIL = new MutableLiveData<>();
        this.LLL = new C560530Lyd<>();
        this.LLLF = new h0<>(bool);
        this.LLLFF = new MutableLiveData<>();
        this.LLLFFI = new C560530Lyd<>();
        this.LLLFZ = new C560530Lyd<>();
        this.LLLI = new C560530Lyd<>();
        this.LLLII = new C560530Lyd<>();
        this.LLLIZZ = new SafeHandler(this);
        this.LLLJ = true;
        this.LLLJIL = false;
        this.LLLJL = 1280;
        this.LLLL = 720;
        this.LLLLILI = false;
        this.LLLLJ = false;
        this.LLLLJI = false;
        this.LLLLL = false;
        this.LLLLLIL = true;
        this.LLLLLILLIL = false;
        this.LLLLLJIL = true;
        this.LLLLLJLJLL = false;
        this.LLLLLL = new C2254091DKl();
        this.LLLLLLLLL = false;
        this.LLLLLLLZIL = false;
        this.LLLLLLZ = new InterfaceC2186241AhK() { // from class: X.1AhL
            @Override // X.InterfaceC2185661AgO
            public final void LIZ() {
            }

            @Override // X.InterfaceC2185661AgO
            public final void LIZIZ(EGLContext eGLContext, int i, int i2, int i3, int i4, long j, long j2) {
                boolean zLJI = MethodIDManager.LJI(71951);
                this.LIZ.K6(eGLContext, i, i2, i3, i4, j);
                if (zLJI) {
                    MethodIDManager.LJ();
                }
            }
        };
        this.LLLLLLZZ = true;
        this.LLLLLZ = false;
        this.LLLLZI = 1.0f;
        this.LLLZ = null;
        this.LLLZIIL = C452501pT.LIZIZ(new AwS579S0100000_35(new AObjectS409S0100000_35(this, 4), 157));
        this.LLLZIL = false;
        this.LLLZL = null;
        this.LLLZLL = new C2254151DKr(this.LLLIZZ, new InterfaceC2253851DJn() { // from class: X.1DKp
            @Override // X.InterfaceC2253851DJn
            public final void LIZ(int i) {
                if (i < 0) {
                    C19GS c19gs = this.LIZ.LLLIIII;
                    String string = c19gs.getResources().getString(2131837901, Integer.valueOf(i));
                    C21366318jV.LIZLLL.getClass();
                    new C21366318jV(c19gs, string, 0, 2).LIZ();
                    this.LIZ.ra(i);
                    this.LIZ.finish();
                    return;
                }
                this.LIZ.Ga(i);
            }

            @Override // X.InterfaceC2253851DJn
            public final void LIZIZ(int i) {
                C2254071DKj c2254071DKj = this.LIZ;
                CameraComponentModel cameraComponentModel2 = c2254071DKj.LLLIL;
                if (cameraComponentModel2.mRestoreType == 0) {
                    cameraComponentModel2.mHardEncode = i ^ 1;
                }
                c2254071DKj.sa(i, 1);
            }
        });
        this.LLLZLZ = new C1DHZ() { // from class: X.1DKo
            @Override // X.C1DHZ
            public final void LJIIIIZZ(List list, boolean z, float f) {
            }

            @Override // X.C1DHZ
            public final void LJI() {
                this.LIZ.R5();
            }

            @Override // X.C1DHZ
            public final void LJIIIZ() {
                C2254071DKj c2254071DKj = this.LIZ;
                c2254071DKj.u6(c2254071DKj.LLLLZI);
                this.LIZ.H5();
            }

            @Override // X.C1DHZ
            public final void LIZLLL(int i) {
                this.LIZ.S5(i);
            }

            @Override // X.C1DHZ
            public final void LJIIJ(int i) {
                this.LIZ.Yi2(1.0f);
                C2254071DKj c2254071DKj = this.LIZ;
                c2254071DKj.u6(c2254071DKj.LLLLZI);
                this.LIZ.N5(i);
            }

            @Override // X.C1DHZ
            public final void LIZ(int i, int i2) {
                this.LIZ.d6(i, i2);
            }

            @Override // X.C1DHZ
            public final void LIZIZ(int i, int i2, String str) {
                this.LIZ.U5(i, i2, str);
            }

            @Override // X.C1DHZ
            public final void LJFF(float f, int i, boolean z) {
                this.LIZ.u6(f);
            }

            @Override // X.C1DHZ
            public final void LJII(int i, int i2, String str) {
                this.LIZ.M5(i, i2, str);
            }

            @Override // X.C1DHZ
            public final void LJ(long j, String str, String str2, String str3) {
                if (Looper.getMainLooper() == Looper.myLooper()) {
                    this.LIZ.LLIZLLLIL.LJIIJ(new C1403440mco(j, str, str2));
                } else {
                    this.LIZ.LLIZLLLIL.LJIIIZ(new C1403440mco(j, str, str2));
                }
            }

            @Override // X.C1DHZ
            public final void LIZJ(int i, boolean z, boolean z2, float f, List<Integer> list) {
                this.LIZ.J6(i, z, z2, f, list);
            }
        };
        this.LLLZZ = null;
        this.LLZILL = null;
        this.LLZL = new BPEAHandler(Looper.getMainLooper());
        this.LLZLI = null;
        this.LL = c1drg;
        this.LLLIIII = (C19GS) c1drg.LJII(C19GS.class, null);
        this.LLLIL = cameraComponentModel;
        interfaceC2187111Aij = interfaceC2187111Aij == null ? new C1D99() : interfaceC2187111Aij;
        this.LLLLIIIILLL = interfaceC2187111Aij;
        this.LLLLIIL = c1di3;
        this.LLLLIILL = c1a75;
        this.LLLLLLIL = interfaceC2253441DHy;
        this.LLLLLLJ = interfaceC2253451DHz;
        this.LLLLLLL = effect;
        if (c092o != null) {
            c092o.accept(this.LLLLLL);
        }
        if (this.LLLLLL.LJJIJ) {
            this.LLLLZLLLI = (InterfaceC1452360nti) c1drg.LJIIL(null, InterfaceC1452360nti.class);
        }
        if (this.LLLLZLLLI != null) {
            this.LLLZ = new InterfaceC2177771AKx() { // from class: X.1DI0
                @Override // X.InterfaceC2177771AKx
                public final void M0() {
                }

                @Override // X.InterfaceC2177771AKx
                public final void l2() {
                }

                @Override // X.InterfaceC2177771AKx
                public final void LLJLIL() {
                    this.LL.P6();
                }

                @Override // X.InterfaceC2177771AKx
                public final void WB(Surface surface) {
                    this.LL.N6(surface);
                }

                @Override // X.InterfaceC2177771AKx
                public final void LLIIZ(int i, int i2, Surface surface) {
                    this.LL.L6(surface, i, i2);
                }
            };
        }
        this.LLLLLL.getClass();
        this.LLLIIIIL = 0;
        this.LLLLZLL = T4();
        I7();
        C2187101Aii c2187101Aii = this.LLLLLL.LJJ;
        this.LLLLZIL = c2187101Aii == null ? new C2187101Aii(interfaceC2187111Aij) : c2187101Aii;
        VERuntime.getInstance().enableCameraGF(cameraComponentModel.isEnableCameraGraph);
        n7();
        T6();
        k7();
        y7();
        if (this.LLLLLL.LJII) {
            this.LLLIIL.K0(this.LLLZLL);
        }
        this.LLLILZ = new C2177931ALn(this.LLLIIL.getEffectController());
        C1DLQ c1dlq = this.LLLLLL.LJJIFFI;
        if (c1dlq.LIZ != 7 || c1dlq.LIZIZ != 30) {
            yN1(c1dlq);
        }
        if (this.LLLLLL.LIZJ == EnumC1985407q8.STAGE_CONSTRUCT) {
            Ka();
        }
        C786410Ut5.w3(this.LLLIIL.getViewFunction().getView().getViewTreeObserver(), new ViewTreeObserverOnDrawListenerC2254101DKm(this));
    }
}
