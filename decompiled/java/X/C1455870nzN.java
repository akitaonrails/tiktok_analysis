package X;

import X.InterfaceC1455860nzM;
import Y.AObjectS245S0100000_22;
import Y.ARunnableS105S0100000_5;
import Y.ARunnableS122S0100000_22;
import android.graphics.Bitmap;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.als.LiveEvent;
import com.bytedance.creativex.editor.preview.IAudioEffectParam;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.services.video.VEVolumeChangeOp;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import com.ss.android.vesdk.filterparam.VEBaseFilterParam;
import dmt.av.video.ReplayLiveData;
import dmt.av.video.StoredLiveData;
import dmt.av.video.VEEditorAutoStartStopArbiter;
import dmt.av.video.VEPreviewMusicParams;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AwS119S1100000_5;
import kotlin.jvm.internal.AwS231S0300000_22;
import kotlin.jvm.internal.AwS371S0200000_5;
import kotlin.jvm.internal.AwS423S0200000_22;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.AwS601S0100000_22;
import kotlin.jvm.internal.AwS9S0200001_5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineExceptionHandler;
import v7.o;

/* JADX INFO: renamed from: X.0nzN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public class C1455870nzN<T extends InterfaceC1455860nzM> extends AbstractC2255721DQs<T> implements InterfaceC1455860nzM, InterfaceC379610EuV, InterfaceC1166920gTK {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLZL;
    public final C1DRG LL;
    public InterfaceC574340Mfo LLILLJJLI;
    public final C01GW LLILLL;
    public final C1455930nzT LLILZ;
    public C1452630nu9 LLILZIL;
    public final CoroutineExceptionHandler LLILZLL;
    public final InterfaceC497601wk LLIZ;
    public final C01GW LLIZLLLIL;
    public final InterfaceC1731706qJ LLJ;
    public final C01GW LLJI;
    public AbstractC1452680nuE LLJIJIL;
    public final C01GW LLJILJIL;
    public final MutableLiveData<C1403050mcB> LLJILJILJ;
    public final C01GW LLJILLL;
    public boolean LLJJ;
    public final MutableLiveData<C1453000nuk> LLJJI;
    public final C01GW LLJJIII;
    public final C01GW LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public final C01GW LLJJJ;
    public final C01GW LLJJJIL;
    public final C01GW LLJJJJ;
    public final C01GW LLJJJJJIL;
    public final C01GW LLJJJJLIIL;
    public final MutableLiveData<Pair<Boolean, C1456940o16>> LLJJL;
    public final MutableLiveData<Unit> LLJJLIIIJLLLLLLLZ;
    public final MutableLiveData<Unit> LLJL;
    public final MutableLiveData<Unit> LLJLIL;
    public final MutableLiveData<Boolean> LLJLILLLLZIIL;
    public final MutableLiveData<Unit> LLJLL;
    public final MutableLiveData<Unit> LLJLLIL;
    public final MutableLiveData<Unit> LLJLLL;
    public final MutableLiveData<Pair<Unit, String>> LLJZ;
    public final MutableLiveData<Pair<Unit, String>> LLJZIJLIL;
    public final MutableLiveData<Pair<Unit, String>> LLL;
    public final MutableLiveData<Pair<Boolean, Integer>> LLLF;
    public final MutableLiveData<Pair<Boolean, Integer>> LLLFF;
    public final MutableLiveData<Pair<Boolean, Integer>> LLLFFI;
    public final MutableLiveData<Pair<Unit, String>> LLLFZ;
    public final MutableLiveData<Unit> LLLI;
    public final MutableLiveData<Pair<Boolean, Integer>> LLLII;
    public final MutableLiveData<Boolean> LLLIIII;
    public final MutableLiveData<String> LLLIIIIL;
    public final MutableLiveData<Integer> LLLIIIL;
    public final MutableLiveData<Integer> LLLIIL;
    public final MutableLiveData<Boolean> LLLIILIL;
    public final ConcurrentHashMap<Integer, MutableLiveData<String>> LLLIL;
    public boolean LLLILZ;
    public int LLLILZJ;
    public int LLLILZLLLI;
    public C15O7<Unit> LLLIZZ;
    public o<Unit> LLLJ;
    public boolean LLLJIL;
    public boolean LLLJL;
    public final boolean LLLL;
    public final MutableLiveData<Boolean> LLLLII;
    public final MutableLiveData<Void> LLLLIIIILLL;
    public final MutableLiveData<Void> LLLLIIL;
    public final MutableLiveData<Void> LLLLIILL;
    public final MutableLiveData<Boolean> LLLLIILLL;
    public final C01GW LLLLIL;
    public final C01GW LLLLILI;
    public final LiveData<SurfaceView> LLLLJ;
    public final MutableLiveData<Boolean> LLLLJI;
    public final ReplayLiveData<C0EYM> LLLLL;
    public final StoredLiveData<C1452720nuI> LLLLLIL;
    public final ArrayList<EffectPointModel> LLLLLILLIL;
    public final MutableLiveData<Boolean> LLLLLJIL;
    public final MutableLiveData<C1452720nuI> LLLLLJLJLL;
    public final MutableLiveData<Integer> LLLLLL;
    public final MutableLiveData<IAudioEffectParam> LLLLLLIL;
    public final MutableLiveData<C1452730nuJ> LLLLLLJ;
    public final MutableLiveData<VEPreviewMusicParams> LLLLLLL;
    public final C560530Lyd<VEPreviewMusicParams> LLLLLLLLL;
    public int LLLLLLLLLL;
    public MutableLiveData<Integer> LLLLLLLZIL;
    public final C01GW LLLLLLZ;
    public final C01GW LLLLLLZZ;
    public final MutableLiveData<C1453160nv0> LLLLLZ;
    public final C01GW LLLLLZIL;
    public boolean LLLLLZL;
    public boolean LLLLZ;
    public SurfaceView LLLLZI;
    public ImageView LLLLZIL;
    public volatile boolean LLLLZLL;
    public FrameLayout LLLLZLLIL;
    public FrameLayout LLLLZLLLI;
    public final boolean LLLZ;
    public boolean LLLZI;
    public final Function1<Surface, Unit> LLLZIIL;
    public C364400EQk LLLZIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1455870nzN.class, "reuseSurfaceApiComponent", "getReuseSurfaceApiComponent()Lcom/bytedance/uicomponent/ReuseSurfaceApiComponent;", 0);
        C13LE.LIZ.getClass();
        LLLZL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public void E4() {
    }

    public void EH2(boolean z) {
    }

    public void J00(float f, float f2) {
    }

    public void W1() {
    }

    public T W2() {
        return this;
    }

    @Override // X.InterfaceC1455860nzM
    public void ad2() {
    }

    public void cv0(C346940Diu c346940Diu, boolean z) {
    }

    public void fu1(C346940Diu c346940Diu) {
    }

    @Override // X.InterfaceC960503pD, X.C11E6
    public LifecycleOwner getLifecycleOwner() {
        return this;
    }

    @Override // X.C11E9
    public C11E6 getLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.C11DL
    public InterfaceC960503pD getReceiver() {
        return this;
    }

    @Override // X.C11E9
    public C11DL<InterfaceC960503pD> getReceiverHolder() {
        return this;
    }

    @Override // X.C11E9
    public boolean getUniqueOnlyGlobal() {
        return true;
    }

    public void gx2() {
    }

    public void j9() {
    }

    public void kw0(C346940Diu c346940Diu) {
    }

    public SurfaceView n7() {
        return null;
    }

    public void o7(Integer num) {
    }

    public void rG2(boolean z, boolean z2, Function0<Unit> function0) {
    }

    public void tU0() {
    }

    public void w9() {
    }

    public void z8() {
        this.LLLJL = true;
        AwS423S0200000_22 awS423S0200000_22 = new AwS423S0200000_22(this, new AwS566S0100000_22((C1455870nzN) this, 326), 32);
        u7(new AwS566S0100000_22(awS423S0200000_22, 325));
        I7(new AwS423S0200000_22(this, awS423S0200000_22, 31));
    }

    private final MutableLiveData<Boolean> D5() {
        return (MutableLiveData) this.LLJJJJ.getValue();
    }

    private final MutableLiveData<C1456890o11> E5() {
        return (MutableLiveData) this.LLLLLZIL.getValue();
    }

    private final MutableLiveData<C1450150nq9> H5() {
        return (MutableLiveData) this.LLJJJIL.getValue();
    }

    private final MutableLiveData<VEVolumeChangeOp> R5() {
        return (MutableLiveData) this.LLJJIJI.getValue();
    }

    private final void S5() {
        a9(new FrameLayout(getActivity()));
        T6();
        T8(new ImageView(getActivity()));
        C786410Ut5.c6(H3(), new FrameLayout.LayoutParams(-1, -1));
        Q3().addView(H3());
        H3().setScaleType(ImageView.ScaleType.FIT_XY);
        if (this.LLLZ) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            FrameLayout frameLayout = new FrameLayout(LJIJJLI().getContext());
            frameLayout.setBackgroundColor(ColorProtector.parseColor("#80FF0000"));
            C786410Ut5.a6(frameLayout, layoutParams);
            Q3().addView(this.LLLLZLLLI);
            this.LLLLZLLLI = frameLayout;
        }
    }

    private final MutableLiveData<VEEditorAutoStartStopArbiter> Z4() {
        return (MutableLiveData) this.LLJJJJLIIL.getValue();
    }

    private final MutableLiveData<InterfaceC1453220nv6> d5() {
        return (MutableLiveData) this.LLJJIII.getValue();
    }

    private final void m6() {
        L7(new C1453000nuk(this.LLILZIL.LIZ, (String) null, true, false, false, true));
    }

    private final MutableLiveData<List<C1450120nq6>> n5() {
        return (MutableLiveData) this.LLJJIJIIJIL.getValue();
    }

    private final MutableLiveData<Boolean> t5() {
        return (MutableLiveData) this.LLJJJ.getValue();
    }

    private final MutableLiveData<C1450120nq6> v5() {
        return (MutableLiveData) this.LLJJIJIL.getValue();
    }

    @Override // X.InterfaceC1455860nzM
    public FilterBean Bi2() {
        return this.LLILZIL.LIZ;
    }

    public AbstractC1452680nuE G2() {
        C1441900ncq c1441900ncq = this.LLILZ.LJFF;
        C807400Vlq.LJ();
        return new C574170MfX(c1441900ncq);
    }

    public final ImageView H3() {
        ImageView imageView = this.LLLLZIL;
        if (imageView != null) {
            return imageView;
        }
        return null;
    }

    public final SurfaceView LJIJJLI() {
        SurfaceView surfaceView = this.LLLLZI;
        if (surfaceView != null) {
            return surfaceView;
        }
        return null;
    }

    public final MutableLiveData<InterfaceC1452170ntP> M5() {
        return (MutableLiveData) this.LLJJJJJIL.getValue();
    }

    public final MutableLiveData<C1404120mdu> N5() {
        return (MutableLiveData) this.LLJILLL.getValue();
    }

    @Override // X.InterfaceC1455860nzM
    public C352350Drd OC0() {
        return (C352350Drd) this.LLIZLLLIL.getValue();
    }

    @Override // X.InterfaceC1455860nzM
    public void PI0() {
        this.LLLI.setValue(Unit.LIZ);
    }

    @Override // X.InterfaceC1455860nzM
    public void PO2() {
        this.LLJLILLLLZIIL.setValue(Boolean.FALSE);
    }

    @Override // X.InterfaceC1455860nzM
    public MutableLiveData<Boolean> Ps() {
        return (MutableLiveData) this.LLLLIL.getValue();
    }

    public final FrameLayout Q3() {
        FrameLayout frameLayout = this.LLLLZLLIL;
        if (frameLayout != null) {
            return frameLayout;
        }
        return null;
    }

    @Override // X.InterfaceC1455860nzM
    public MutableLiveData<C348470DlN> X21() {
        return (MutableLiveData) this.LLLLLLZ.getValue();
    }

    @Override // X.InterfaceC1455860nzM
    public void bk2() {
        C01TT.LIZLLL(new AwS566S0100000_22((C1455870nzN) this, 318));
    }

    @Override // X.InterfaceC1455860nzM
    public void fA1() {
        this.LLJLIL.setValue(Unit.LIZ);
    }

    @Override // X.InterfaceC1455860nzM
    public void finish() {
        this.LLJLLIL.setValue(Unit.LIZ);
    }

    @Override // X.InterfaceC1455860nzM
    public void gI2() {
        C01TT.LIZLLL(new AwS566S0100000_22((C1455870nzN) this, 319));
    }

    @Override // X.InterfaceC1455860nzM
    public AbstractC1452680nuE gc() {
        return (AbstractC1452680nuE) this.LLJI.getValue();
    }

    public final C19EG getActivity() {
        return (C19EG) this.LLILLL.getValue();
    }

    public final void h8() {
        int i = this.LLLILZJ;
        if (i > 0 && i == this.LLLILZLLLI && this.LLILZ.LIZJ.invoke().booleanValue()) {
            this.LLLILZ = false;
            if (this.LLILZ.LJFF.LJIIIIZZ) {
                AbstractC1452680nuE abstractC1452680nuEGc = gc();
                if (abstractC1452680nuEGc != null) {
                    abstractC1452680nuEGc.LJIJJLI().submit(new ARunnableS122S0100000_22(this, 36));
                }
            } else {
                InterfaceC1452170ntP interfaceC1452170ntPO4 = O4();
                if (interfaceC1452170ntPO4 != null) {
                    interfaceC1452170ntPO4.Xe();
                }
                F32(true);
                InterfaceC1463990oCT interfaceC1463990oCTLIZLLL = C2219091BtD.LIZLLL();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("AudioFadeout || all tasks have been finished, finishNum:");
                sbLIZ.append(this.LLLILZJ);
                interfaceC1463990oCTLIZLLL.d(C2188811AlT.LIZIZ(sbLIZ));
            }
            this.LLLJ.LIZJ(null);
        }
    }

    public final MutableLiveData<InterfaceC358220E2q> k5() {
        return (MutableLiveData) this.LLJILJIL.getValue();
    }

    @Override // X.InterfaceC1455860nzM
    public MutableLiveData<Bitmap> lk() {
        return (MutableLiveData) this.LLLLILI.getValue();
    }

    @Override // X.InterfaceC1455860nzM
    public void ml1() {
        this.LLJL.setValue(Unit.LIZ);
    }

    public final void o2() {
        this.LLILZ.getClass();
    }

    @Override // X.InterfaceC1455860nzM
    public MutableLiveData<Boolean> oP() {
        return (MutableLiveData) this.LLLLLLZZ.getValue();
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        J8(new AwS566S0100000_22((C1455870nzN) this, 312));
        super.onDestroy();
    }

    @Override // X.AbstractC2255721DQs
    public void onResume() {
        J8(new AwS566S0100000_22((C1455870nzN) this, 313));
        super.onResume();
    }

    @Override // X.AbstractC2255721DQs
    public void onStop() {
        J8(new AwS566S0100000_22((C1455870nzN) this, 316));
        super.onStop();
    }

    public void r8() {
        this.LLILZ.LJIIJJI.invoke(new AbstractC1456460o0K() { // from class: X.0o0N
        }, new ARunnableS122S0100000_22(this, 37));
    }

    public void u8() {
        I7(new AwS566S0100000_22((C1455870nzN) this, 321));
    }

    @Override // X.InterfaceC1455860nzM
    public void uM1() {
        this.LLJLLL.setValue(Unit.LIZ);
    }

    @Override // X.InterfaceC1455860nzM
    public void vK2() {
        this.LLJLL.setValue(Unit.LIZ);
    }

    @Override // X.InterfaceC1455860nzM
    public void wi0() {
        this.LLJJLIIIJLLLLLLLZ.setValue(Unit.LIZ);
    }

    public void y8() {
        I7(new AwS566S0100000_22((C1455870nzN) this, 324));
        C1455930nzT c1455930nzT = this.LLILZ;
        if (c1455930nzT.LJFF.LJIIIIZZ) {
            AbstractC1452680nuE abstractC1452680nuEGc = gc();
            if (abstractC1452680nuEGc != null) {
                abstractC1452680nuEGc.LJIJJLI().submit(new ARunnableS122S0100000_22(this, 38));
                return;
            }
            return;
        }
        if (!this.LLLZI) {
            if (c1455930nzT.LJIIIIZZ) {
                W1();
            }
        } else {
            j9();
            AbstractC1452680nuE abstractC1452680nuEGc2 = gc();
            if (abstractC1452680nuEGc2 != null) {
                abstractC1452680nuEGc2.LJJIIJ(true);
            }
            F32(false);
            C2219091BtD.LIZLLL().i("AudioFadeout || EditPreviewComponent#onStart prepare");
        }
    }

    public final InterfaceC1452360nti z4() {
        return (InterfaceC1452360nti) this.LLJ.getValue(this, LLLZL[0]);
    }

    @Override // X.InterfaceC1455860nzM
    public void zI2() {
        C01TT.LIZLLL(new AwS566S0100000_22((C1455870nzN) this, 320));
    }

    private final void J6() {
        oP().observe(this, new AObjectS245S0100000_22(this, 75));
    }

    private final void K6() {
        n5().observe(this, new AObjectS245S0100000_22(this, 66));
        n5().observe(this, new C1453940nwG());
    }

    private final void N6() {
        vW1().observe(this, new AObjectS245S0100000_22(this, 68));
    }

    private final void P6() {
        D5().observe(this, new AObjectS245S0100000_22(this, 69));
    }

    private final void S6() {
        H5().observe(this, new AObjectS245S0100000_22(this, 70));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0nzg, android.view.SurfaceView] */
    private final void T6() {
        SurfaceView surfaceViewN7 = n7();
        if (surfaceViewN7 != null) {
            q9(surfaceViewN7);
            return;
        }
        final C19EG activity = getActivity();
        ?? r1 = new SurfaceView(activity) { // from class: X.0nzg
            public SurfaceHolderC2263411DiV LL = new SurfaceHolderC2263411DiV(super.getHolder());

            @Override // android.view.SurfaceView
            public SurfaceHolder getHolder() {
                return this.LL;
            }

            public void setEditorOptimizer(InterfaceC1456950o17 interfaceC1456950o17) {
                SurfaceHolderC2263411DiV surfaceHolderC2263411DiV = this.LL;
                if (surfaceHolderC2263411DiV != null) {
                    surfaceHolderC2263411DiV.getClass();
                }
            }
        };
        this.LLILZ.getClass();
        r1.setEditorOptimizer(null);
        q9(r1);
        C786410Ut5.U5(LJIJJLI(), new FrameLayout.LayoutParams(-1, -1));
        Q3().addView(LJIJJLI());
    }

    private final void d6() {
        AbstractC1452680nuE abstractC1452680nuEGc = gc();
        if (abstractC1452680nuEGc != null) {
            abstractC1452680nuEGc.LIZLLL = this.LLLLLLIL;
        }
        y7();
        AbstractC1452680nuE abstractC1452680nuEGc2 = gc();
        if (abstractC1452680nuEGc2 != null) {
            abstractC1452680nuEGc2.LJ = dt();
        }
        ZB2().observe(this, new InterfaceC1462580oAC(this) { // from class: X.0nue
            public final /* synthetic */ C1455870nzN<T> LIZ;

            {
                this.LIZ = this;
            }

            @Override // X.InterfaceC1462580oAC
            public final void LIZ(Object obj, Object obj2) {
                C1452720nuI c1452720nuI = (C1452720nuI) obj;
                C1452720nuI c1452720nuI2 = (C1452720nuI) obj2;
                InterfaceC1452170ntP interfaceC1452170ntPO4 = this.LIZ.O4();
                if (interfaceC1452170ntPO4 != null) {
                    C391360FWc.LIZLLL("EditPreviewComponent#changeTimeEffect", interfaceC1452170ntPO4, new AwS231S0300000_22((C1455870nzN) this.LIZ, (C1455870nzN<Object>) c1452720nuI, c1452720nuI2, (C1452720nuI) 13));
                }
            }
        });
        ZB2().observe(this, new C1453940nwG());
        AbstractC1452680nuE abstractC1452680nuEGc3 = gc();
        if (abstractC1452680nuEGc3 != null) {
            abstractC1452680nuEGc3.LIZIZ = this.LLLLLJIL;
        }
        AbstractC1452680nuE abstractC1452680nuEGc4 = gc();
        if (abstractC1452680nuEGc4 != null) {
            abstractC1452680nuEGc4.LIZJ = this.LLLLLJLJLL;
        }
    }

    private final void d7() {
        R5().observe(this, new AObjectS245S0100000_22(this, 71));
        R5().observe(this, new C1453940nwG());
    }

    private final void u6() {
        k5().setValue(w2(this.LLILZ.LIZLLL.invoke()));
        AbstractC1452680nuE abstractC1452680nuEGc = gc();
        if (abstractC1452680nuEGc != null) {
            abstractC1452680nuEGc.LJIILJJIL = k5().getValue();
        }
        d5().setValue(new InterfaceC1453220nv6(this) { // from class: X.0E4i
            public final /* synthetic */ C1455870nzN<T> LIZ;

            {
                this.LIZ = this;
            }

            @Override // X.InterfaceC1453220nv6
            public final float LIZ(FilterBean filterBean) {
                float fLIZLLL = C1643880ssc.LIZLLL(filterBean);
                if (fLIZLLL == 0.0f) {
                    return this.LIZ.i3(filterBean.getFilterFolder());
                }
                return fLIZLLL;
            }
        });
        this.LLJJI.observe(this, new C1453940nwG());
        this.LLJJI.observe(this, new AObjectS245S0100000_22(this, 74));
    }

    public void L6() {
        v5().observe(this, new AObjectS245S0100000_22(this, 67));
        v5().observe(this, new C1453940nwG());
    }

    public final InterfaceC1452170ntP O4() {
        AbstractC1452680nuE abstractC1452680nuEGc = gc();
        if (abstractC1452680nuEGc != null) {
            return abstractC1452680nuEGc.LJJ();
        }
        return null;
    }

    @Override // X.InterfaceC1455860nzM
    /* JADX INFO: renamed from: T4, reason: merged with bridge method [inline-methods] */
    public MutableLiveData<VEVolumeChangeOp> Lb2() {
        return R5();
    }

    @Override // X.InterfaceC1455860nzM
    public FrameLayout UZ() {
        return Q3();
    }

    @Override // X.InterfaceC1455860nzM
    public int VF0() {
        return LJIJJLI().getHeight();
    }

    @Override // X.InterfaceC1455860nzM
    public LiveData<C1450150nq9> VG1() {
        return H5();
    }

    public int W6() {
        AbstractC1452680nuE abstractC1452680nuEGc = gc();
        if (abstractC1452680nuEGc != null) {
            abstractC1452680nuEGc.LJJ = new InterfaceC1452850nuV(this) { // from class: X.0nu6
                public final /* synthetic */ C1455870nzN<T> LIZ;

                {
                    this.LIZ = this;
                }

                @Override // X.InterfaceC1452850nuV
                public final void LIZ() {
                    this.LIZ.w9();
                    C1455870nzN<T> c1455870nzN = this.LIZ;
                    if (!c1455870nzN.LLLLLZL) {
                        c1455870nzN.LLLLLZL = true;
                        C2219091BtD.LIZLLL().d("receive prepare done event");
                        this.LIZ.LLILZ.LJFF.getClass();
                        this.LIZ.LLLLIIIILLL.postValue(null);
                    }
                    this.LIZ.LLILZ.LIZIZ.getClass();
                }
            };
        }
        AbstractC1452680nuE abstractC1452680nuEGc2 = gc();
        if (abstractC1452680nuEGc2 != null) {
            abstractC1452680nuEGc2.LJJI = new InterfaceC1452800nuQ(this) { // from class: X.0nuB
                public final /* synthetic */ C1455870nzN<T> LIZ;

                {
                    this.LIZ = this;
                }

                @Override // X.InterfaceC1452800nuQ
                public final void LIZ(float f) {
                    C1403050mcB c1403050mcBLIZ;
                    MutableLiveData<C1403050mcB> mutableLiveData = this.LIZ.LLJILJILJ;
                    C1403050mcB value = mutableLiveData.getValue();
                    if (value != null) {
                        c1403050mcBLIZ = C1403050mcB.LIZ(value, 0.0f, 0, 0, f, 7);
                    } else {
                        c1403050mcBLIZ = null;
                    }
                    mutableLiveData.postValue(c1403050mcBLIZ);
                }

                @Override // X.InterfaceC1452800nuQ
                public final void LIZIZ(float f) {
                    C1403050mcB c1403050mcBLIZ;
                    MutableLiveData<C1403050mcB> mutableLiveData = this.LIZ.LLJILJILJ;
                    C1403050mcB value = mutableLiveData.getValue();
                    if (value != null) {
                        c1403050mcBLIZ = C1403050mcB.LIZ(value, f, 0, 0, 0.0f, 14);
                    } else {
                        c1403050mcBLIZ = null;
                    }
                    mutableLiveData.postValue(c1403050mcBLIZ);
                }

                @Override // X.InterfaceC1452800nuQ
                public final void LIZJ(int i) {
                    C1403050mcB c1403050mcBLIZ;
                    MutableLiveData<C1403050mcB> mutableLiveData = this.LIZ.LLJILJILJ;
                    C1403050mcB value = mutableLiveData.getValue();
                    if (value != null) {
                        c1403050mcBLIZ = C1403050mcB.LIZ(value, 0.0f, 0, i, 0.0f, 11);
                    } else {
                        c1403050mcBLIZ = null;
                    }
                    mutableLiveData.postValue(c1403050mcBLIZ);
                }

                @Override // X.InterfaceC1452800nuQ
                public final void LIZLLL(int i) {
                    C1403050mcB c1403050mcBLIZ;
                    MutableLiveData<C1403050mcB> mutableLiveData = this.LIZ.LLJILJILJ;
                    C1403050mcB value = mutableLiveData.getValue();
                    if (value != null) {
                        c1403050mcBLIZ = C1403050mcB.LIZ(value, 0.0f, i, 0, 0.0f, 13);
                    } else {
                        c1403050mcBLIZ = null;
                    }
                    mutableLiveData.postValue(c1403050mcBLIZ);
                }
            };
        }
        AbstractC1452680nuE abstractC1452680nuEGc3 = gc();
        if (abstractC1452680nuEGc3 != null) {
            abstractC1452680nuEGc3.LJJIFFI = new InterfaceC1452860nuW(this) { // from class: X.0nu5
                public final /* synthetic */ C1455870nzN<T> LIZ;

                {
                    this.LIZ = this;
                }

                @Override // X.InterfaceC1452860nuW
                public final void LIZ(int i, int i2, int i3) {
                    this.LIZ.N5().postValue(new C1404120mdu(i, i2, i3));
                }
            };
        }
        AbstractC1452680nuE abstractC1452680nuEGc4 = gc();
        if (abstractC1452680nuEGc4 != null) {
            return abstractC1452680nuEGc4.LJJII(getActivity(), this.LLILLJJLI, LJIJJLI(), this);
        }
        return -1;
    }

    public final void W7() {
        Z7();
        IAudioEffectParam veAudioEffectParam = this.LLILLJJLI.getVeAudioEffectParam();
        if (veAudioEffectParam != null) {
            C391360FWc.LJ("EditPreviewComponent#veAudioEffectParam", new AwS423S0200000_22(veAudioEffectParam, (IAudioEffectParam) this, 30));
        }
        MutableLiveData<InterfaceC1452170ntP> mutableLiveDataM5 = M5();
        AbstractC1452680nuE abstractC1452680nuEGc = gc();
        mutableLiveDataM5.setValue(abstractC1452680nuEGc != null ? abstractC1452680nuEGc.LJJ() : null);
        InterfaceC1452170ntP value = M5().getValue();
        if (value != null) {
            value.Ef(this.LLLZIIL);
        }
        Z4().setValue(c3());
        if (gc() != null) {
            vW1();
        }
    }

    @Override // X.InterfaceC1455860nzM
    public LiveData<C1456890o11> Yh() {
        return E5();
    }

    public void Z7() {
        AbstractC1452680nuE abstractC1452680nuEGc = gc();
        if (abstractC1452680nuEGc != null) {
            abstractC1452680nuEGc.LJIJ().df(new C1452220ntU(abstractC1452680nuEGc));
        }
        AbstractC1452680nuE abstractC1452680nuEGc2 = gc();
        if (abstractC1452680nuEGc2 != null) {
            C391360FWc.LIZIZ(abstractC1452680nuEGc2, "setEffectMessageCenterCallback", abstractC1452680nuEGc2.LJIJ(), new AwS584S0100000_5(this.LLLIL, (Map<EnumC373450EkZ, C373430EkX>) 895));
        }
        AbstractC1452680nuE abstractC1452680nuEGc3 = gc();
        if (abstractC1452680nuEGc3 != null) {
            abstractC1452680nuEGc3.LJJIIJ(e4());
        }
    }

    @Override // X.InterfaceC1455860nzM
    public LiveData<VEEditorAutoStartStopArbiter> b10() {
        return Z4();
    }

    @Override // X.InterfaceC1455860nzM
    public LiveData<C1450120nq6> b22() {
        return v5();
    }

    public final VEEditorAutoStartStopArbiter c3() {
        AbstractC1452680nuE abstractC1452680nuEGc = gc();
        if (abstractC1452680nuEGc != null) {
            return abstractC1452680nuEGc.LJFF;
        }
        return null;
    }

    @Override // X.InterfaceC1455860nzM
    public ViewGroup.MarginLayoutParams ej() {
        return (ViewGroup.MarginLayoutParams) LJIJJLI().getLayoutParams();
    }

    @Override // X.InterfaceC1455860nzM
    public LiveData<InterfaceC1452170ntP> g() {
        return M5();
    }

    @Override // X.InterfaceC1455860nzM
    public int k52() {
        return LJIJJLI().getWidth();
    }

    @Override // X.InterfaceC1455860nzM
    public LiveData<C1404120mdu> kJ2() {
        return N5();
    }

    @Override // X.InterfaceC1455860nzM
    public LiveData<Boolean> oC0() {
        return D5();
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        W6();
        W7();
        u6();
        if (this.LLILZ.LJI) {
            m6();
        }
        d6();
        N6();
        d7();
        L6();
        K6();
        S6();
        J6();
        P6();
        ge().setValue(LJIJJLI());
    }

    @Override // X.AbstractC2255721DQs
    public void onStart() {
        super.onStart();
        J8(new AwS566S0100000_22((C1455870nzN) this, 314));
    }

    public void p8() {
        W7();
        u6();
        m6();
    }

    @Override // X.InterfaceC1455860nzM
    public LiveData<Boolean> rV() {
        return t5();
    }

    @Override // X.InterfaceC1455860nzM
    public void u() {
        FilterBean filterBean;
        AbstractC1452680nuE abstractC1452680nuEGc = gc();
        if (abstractC1452680nuEGc == null || (filterBean = abstractC1452680nuEGc.LJJIIZI) == null || !C1643880ssc.LJ(filterBean)) {
            return;
        }
        C391360FWc.LIZIZ(abstractC1452680nuEGc, "", abstractC1452680nuEGc.LJIJ(), new AwS371S0200000_5(abstractC1452680nuEGc, filterBean, 220));
    }

    @Override // X.InterfaceC1455860nzM
    public LiveData<InterfaceC358220E2q> xq1() {
        return k5();
    }

    public void y7() {
        dS1().observe(this, new AObjectS245S0100000_22(this, 72));
        dS1().observe(this, new C1453940nwG());
    }

    @Override // X.InterfaceC1455860nzM
    public LiveData<InterfaceC1453220nv6> zj2() {
        return d5();
    }

    @Override // X.InterfaceC1455860nzM
    public LiveData<Unit> Ac0() {
        return this.LLJLLL;
    }

    public MutableLiveData<Void> B3() {
        return this.LLLLIIIILLL;
    }

    public final MutableLiveData<VEPreviewMusicParams> C5() {
        return this.LLLLLLL;
    }

    @Override // X.InterfaceC1455860nzM
    public LiveData<Unit> Cq0() {
        return this.LLJLL;
    }

    public MutableLiveData<Void> E3() {
        return this.LLLLIIL;
    }

    public final InterfaceC497601wk F4() {
        return this.LLIZ;
    }

    @Override // X.InterfaceC1455860nzM
    public LiveData<C1452720nuI> G9() {
        return this.LLLLLJLJLL;
    }

    @Override // X.InterfaceC1455860nzM
    public boolean GF() {
        return this.LLLZI;
    }

    @Override // X.InterfaceC1455860nzM
    public LiveData<Boolean> Gt0() {
        return this.LLJLILLLLZIIL;
    }

    public boolean H4() {
        return this.LLLL;
    }

    @Override // X.InterfaceC1455860nzM
    public MutableLiveData<Integer> Hn0() {
        return this.LLLLLL;
    }

    public final Function1<Surface, Unit> K4() {
        return this.LLLZIIL;
    }

    @Override // X.InterfaceC1455860nzM
    public LiveData<Unit> Lv2() {
        return this.LLLI;
    }

    @Override // X.InterfaceC1455860nzM
    public MutableLiveData<C1453160nv0> MW1() {
        return this.LLLLLZ;
    }

    @Override // X.InterfaceC1455860nzM
    public LiveData<Pair<Unit, String>> NC1() {
        return this.LLJZ;
    }

    @Override // X.InterfaceC1455860nzM
    public LiveData<Pair<Unit, String>> NZ0() {
        return this.LLJZIJLIL;
    }

    public final MutableLiveData<Boolean> O3() {
        return this.LLLLII;
    }

    @Override // X.InterfaceC1455860nzM
    public boolean OO2() {
        return this.LLJJ;
    }

    @Override // X.InterfaceC1455860nzM
    public /* bridge */ /* synthetic */ LiveData Ov0() {
        return this.LLLLIIL;
    }

    public final FrameLayout P4() {
        return this.LLLLZLLLI;
    }

    @Override // X.InterfaceC1455860nzM
    public InterfaceC574340Mfo QD1() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC1455860nzM
    public int RB0() {
        return this.LLLLLLLLLL;
    }

    @Override // X.InterfaceC1455860nzM
    public LiveData<Boolean> UL0() {
        return this.LLLIILIL;
    }

    @Override // X.InterfaceC1455860nzM
    public LiveData<Pair<Boolean, C1456940o16>> Up() {
        return this.LLJJL;
    }

    @Override // X.InterfaceC1455860nzM
    public LiveData<Pair<Boolean, Integer>> XO0() {
        return this.LLLFFI;
    }

    @Override // X.InterfaceC1455860nzM
    public LiveData<Pair<Boolean, Integer>> Yx1() {
        return this.LLLII;
    }

    @Override // X.InterfaceC1455860nzM
    public MutableLiveData<Boolean> Z90() {
        return this.LLLLJI;
    }

    @Override // X.InterfaceC1455860nzM
    public StoredLiveData<C1452720nuI> ZB2() {
        return this.LLLLLIL;
    }

    @Override // X.InterfaceC1455860nzM
    public MutableLiveData<C1403050mcB> Zu1() {
        return this.LLJILJILJ;
    }

    @Override // X.InterfaceC1455860nzM
    public LiveData<Pair<Boolean, Integer>> a80() {
        return this.LLLF;
    }

    @Override // X.InterfaceC1455860nzM
    public boolean aN1() {
        return this.LLLJIL;
    }

    @Override // X.InterfaceC1455860nzM
    public LiveData<IAudioEffectParam> d02() {
        return this.LLLLLLIL;
    }

    @Override // X.InterfaceC1455860nzM
    public ReplayLiveData<C0EYM> dS1() {
        return this.LLLLL;
    }

    @Override // X.InterfaceC1455860nzM
    public ArrayList<EffectPointModel> dt() {
        return this.LLLLLILLIL;
    }

    public boolean e4() {
        return this.LLLLZ;
    }

    @Override // X.InterfaceC1455860nzM
    public /* bridge */ /* synthetic */ LiveData eC2() {
        return this.LLLLIILLL;
    }

    @Override // X.InterfaceC1455860nzM
    public LiveData<Pair<Boolean, Integer>> gS0() {
        return this.LLLFF;
    }

    @Override // X.InterfaceC1455860nzM
    public LiveData<SurfaceView> ge() {
        return this.LLLLJ;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        W2();
        return this;
    }

    @Override // X.InterfaceC1455860nzM
    public LiveData<Integer> getBottomTabHeight() {
        return this.LLLIIL;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    @Override // X.C11DL
    public /* bridge */ /* synthetic */ InterfaceC874803bO getReceiver() {
        getReceiver();
        return this;
    }

    @Override // X.InterfaceC1455860nzM
    public LiveData<C1453000nuk> gq1() {
        return this.LLJJI;
    }

    @Override // X.InterfaceC1455860nzM
    public MutableLiveData<Integer> iM0() {
        return this.LLLLLLLZIL;
    }

    public MutableLiveData<Boolean> k7() {
        return this.LLLLIILLL;
    }

    @Override // X.InterfaceC1455860nzM
    public LiveData<Boolean> kF0() {
        return this.LLLIIII;
    }

    public final C1455930nzT m3() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC1455860nzM
    public LiveData<VEPreviewMusicParams> mL() {
        return this.LLLLLLL;
    }

    @Override // X.InterfaceC1455860nzM
    public /* bridge */ /* synthetic */ LiveData nK2() {
        return this.LLLLIIIILLL;
    }

    public final C1452630nu9 o4() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC1455860nzM
    public LiveData<Unit> oG2() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    @Override // X.InterfaceC1455860nzM
    public LiveData<Unit> op() {
        return this.LLJLIL;
    }

    public final boolean q3() {
        return this.LLLLZLL;
    }

    @Override // X.InterfaceC1455860nzM
    public LiveData<Unit> s20() {
        return this.LLJL;
    }

    @Override // X.InterfaceC1455860nzM
    public LiveData<Boolean> sc1() {
        return this.LLLLLJIL;
    }

    @Override // X.InterfaceC1455860nzM
    public LiveData<Integer> tg0() {
        return this.LLLIIIL;
    }

    @Override // X.InterfaceC1455860nzM
    public LiveData<Pair<Unit, String>> uA2() {
        return this.LLLFZ;
    }

    @Override // X.InterfaceC1455860nzM
    public LiveData<Unit> ub0() {
        return this.LLJLLIL;
    }

    public MutableLiveData<Void> v3() {
        return this.LLLLIILL;
    }

    @Override // X.InterfaceC1455860nzM
    public MutableLiveData<C1452730nuJ> vW1() {
        return this.LLLLLLJ;
    }

    @Override // X.InterfaceC1455860nzM
    public /* bridge */ /* synthetic */ LiveData ww2() {
        return this.LLLLIILL;
    }

    public final C560530Lyd<VEPreviewMusicParams> x5() {
        return this.LLLLLLLLL;
    }

    @Override // X.InterfaceC1455860nzM
    public LiveData<Pair<Unit, String>> yJ1() {
        return this.LLL;
    }

    @Override // X.InterfaceC1455860nzM
    public LiveEvent<VEPreviewMusicParams> yr0() {
        return this.LLLLLLLLL;
    }

    private final void I7(Function0<Unit> function0) {
        C1455930nzT c1455930nzT = this.LLILZ;
        if (c1455930nzT.LJII) {
            c1455930nzT.getClass();
            this.LLILZ.getClass();
            function0.invoke();
        }
    }

    private final void T2(Function0<Unit> function0) {
        if (this.LLILZ.LJFF.LJIIIIZZ) {
            AbstractC1452680nuE abstractC1452680nuEGc = gc();
            if (abstractC1452680nuEGc != null) {
                abstractC1452680nuEGc.LJIJJLI().submit(new ARunnableS105S0100000_5(function0, (Function0<Unit>) 18));
                return;
            }
            return;
        }
        function0.invoke();
    }

    private final void U5(C1456920o14 c1456920o14) {
        X21().observe(this, new AObjectS245S0100000_22(this, 73));
    }

    private final void u7(Function0<Unit> function0) {
        C1455930nzT c1455930nzT = this.LLILZ;
        if (!c1455930nzT.LJII) {
            c1455930nzT.getClass();
            this.LLILZ.getClass();
            function0.invoke();
        }
    }

    @Override // X.InterfaceC1455860nzM
    public void EY0(VEVolumeChangeOp vEVolumeChangeOp) {
        C0MS9.LIZ(R5(), vEVolumeChangeOp);
    }

    @Override // X.InterfaceC1455860nzM
    public void F32(boolean z) {
        C2219091BtD.LIZLLL().d("AudioFadeout || EditPreviewComponent#markEngineReleaseState");
        this.LLLZI = z;
    }

    @Override // X.InterfaceC1455860nzM
    public void FJ(boolean z) {
        VEEditorAutoStartStopArbiter vEEditorAutoStartStopArbiterC3 = c3();
        if (vEEditorAutoStartStopArbiterC3 != null) {
            vEEditorAutoStartStopArbiterC3.LIZJ(z, false, false);
        }
    }

    @Override // X.InterfaceC1455860nzM
    public void HV(boolean z) {
        this.LLJJ = z;
    }

    public final void J8(Function0<Unit> function0) {
        if (!H4()) {
            function0.invoke();
        } else {
            if (!Intrinsics.LJFF(this.LLLLII.getValue(), Boolean.TRUE)) {
                return;
            }
            function0.invoke();
        }
    }

    public final void L7(C1453000nuk c1453000nuk) {
        this.LLJJI.postValue(c1453000nuk);
        FilterBean filterBean = c1453000nuk.LIZIZ;
        if (filterBean != null) {
            this.LLILZIL.LIZ = filterBean;
        }
    }

    @Override // X.InterfaceC1455860nzM
    public void MZ(int i) {
        this.LLLLLLLLLL = i;
    }

    public final void P8(boolean z) {
        this.LLLLZLL = z;
    }

    @Override // X.InterfaceC1455860nzM
    public void SQ0(boolean z) {
        VEEditorAutoStartStopArbiter vEEditorAutoStartStopArbiterC3 = c3();
        if (vEEditorAutoStartStopArbiterC3 != null) {
            vEEditorAutoStartStopArbiterC3.LIZJ(z, false, false);
        }
    }

    @Override // X.InterfaceC1455860nzM
    public void SX(C1450120nq6 c1450120nq6) {
        v5().setValue(c1450120nq6);
    }

    public final void T8(ImageView imageView) {
        this.LLLLZIL = imageView;
    }

    @Override // X.InterfaceC1455860nzM
    public void Wb1(C1450150nq9 c1450150nq9) {
        H5().setValue(c1450150nq9);
    }

    @Override // X.InterfaceC1455860nzM
    public void XN(int i) {
        gc();
    }

    public void Z1(C1453000nuk c1453000nuk) {
        if (c1453000nuk != null) {
            if (!c1453000nuk.LIZJ) {
                AbstractC1452680nuE abstractC1452680nuEGc = gc();
                if (abstractC1452680nuEGc != null) {
                    abstractC1452680nuEGc.LJIIJ(c1453000nuk.LIZIZ, this.LLILZ.LIZ.invoke().booleanValue());
                    return;
                }
                return;
            }
            FilterBean filterBean = c1453000nuk.LIZIZ;
            if (filterBean == null) {
                return;
            }
            X1(filterBean, c1453000nuk.LIZLLL);
        }
    }

    public final void a9(FrameLayout frameLayout) {
        this.LLLLZLLIL = frameLayout;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1455860nzM
    public void aI0(List<? extends C1450120nq6> list) {
        n5().setValue(list);
    }

    @Override // X.InterfaceC1455860nzM
    public void aM0(C1453160nv0 c1453160nv0) {
        MW1().setValue(c1453160nv0);
    }

    public void c9(boolean z) {
        this.LLLLZ = z;
    }

    @Override // X.InterfaceC1455860nzM
    public void cF2(List<? extends VEPreviewMusicParams> list) {
        AbstractC1452680nuE abstractC1452680nuEGc = gc();
        if (abstractC1452680nuEGc != null) {
            C391360FWc.LIZIZ(abstractC1452680nuEGc, "veEditor#addMusics", abstractC1452680nuEGc.LJIJ(), new AwS601S0100000_22(list, (List<CreateAnchorInfo>) 633));
        }
    }

    @Override // X.InterfaceC1455860nzM
    public void cL(MutableLiveData<Integer> mutableLiveData) {
        this.LLLLLLLZIL = mutableLiveData;
    }

    public final void d8(InterfaceC574340Mfo interfaceC574340Mfo) {
        this.LLILLJJLI = interfaceC574340Mfo;
    }

    @Override // X.InterfaceC1455860nzM
    public void dh1(C348470DlN c348470DlN) {
        X21().setValue(c348470DlN);
    }

    @Override // X.InterfaceC1455860nzM
    public void eL(boolean z) {
        oP().setValue(Boolean.valueOf(z));
    }

    @Override // X.InterfaceC1455860nzM
    public void gM(String str) {
        this.LLJZ.setValue(new Pair<>(Unit.LIZ, str));
    }

    public <VM1 extends JediViewModel<S1>, S1 extends C004I> S1 getState(VM1 vm1) {
        return (S1) C1170060gYO.LIZ(this, vm1);
    }

    @Override // X.InterfaceC1455860nzM
    public void hi0(int i) {
        this.LLLIIL.setValue(Integer.valueOf(i));
    }

    public float i3(String str) {
        InterfaceC1452170ntP value = M5().getValue();
        if (value != null) {
            return value.getColorFilterIntensity(str);
        }
        return 0.0f;
    }

    @Override // X.InterfaceC1455860nzM
    public LiveData<String> im1(int i) {
        if (this.LLLIL.get(Integer.valueOf(i)) == null) {
            this.LLLIL.put(Integer.valueOf(i), new MutableLiveData<>());
        }
        return this.LLLIL.get(Integer.valueOf(i));
    }

    @Override // X.InterfaceC1455860nzM
    public void iw0(boolean z) {
        t5().setValue(Boolean.valueOf(z));
    }

    public void l4(boolean z) {
        FilterBean filterBean;
        AbstractC1452680nuE abstractC1452680nuEGc = gc();
        if (abstractC1452680nuEGc != null) {
            C1453000nuk value = this.LLJJI.getValue();
            if (value != null) {
                filterBean = value.LIZIZ;
            } else {
                filterBean = null;
            }
            C391360FWc.LIZIZ(abstractC1452680nuEGc, "", abstractC1452680nuEGc.LJIJ(), new AwS584S0100000_5(filterBean, 898));
        }
        this.LLILZIL.LIZ = C1638720skI.LIZLLL();
    }

    @Override // X.InterfaceC1455860nzM
    public void mw0(boolean z) {
        D5().setValue(Boolean.valueOf(z));
    }

    public final void n9(C1452630nu9 c1452630nu9) {
        this.LLILZIL = c1452630nu9;
    }

    @Override // X.InterfaceC1455860nzM
    public void nC1(int i) {
        this.LLLIIIL.setValue(Integer.valueOf(i));
    }

    public void nM0(boolean z) {
        this.LLLJIL = z;
    }

    @Override // X.InterfaceC1455860nzM
    public void ne1(String str) {
        this.LLJZIJLIL.setValue(new Pair<>(Unit.LIZ, str));
    }

    public final void o8(boolean z) {
        if (!OC0().LJIIIZ) {
            return;
        }
        C2216241Boc.LIZ.LIZ("AudioFadeout || EditPreviewComponent#resetAudioFadeout");
        OC0().LIZLLL(z);
    }

    @Override // X.InterfaceC1455860nzM
    public void oH2(boolean z) {
        this.LLJLILLLLZIIL.setValue(Boolean.valueOf(z));
    }

    @Override // X.InterfaceC1455860nzM
    public void pn2(C1453000nuk c1453000nuk) {
        this.LLJJI.setValue(c1453000nuk);
        FilterBean filterBean = c1453000nuk.LIZIZ;
        if (filterBean != null) {
            this.LLILZIL.LIZ = filterBean;
        }
    }

    public final void q9(SurfaceView surfaceView) {
        this.LLLLZI = surfaceView;
    }

    @Override // X.InterfaceC1455860nzM
    public void sn1(String str) {
        this.LLL.setValue(new Pair<>(Unit.LIZ, str));
    }

    public final void t9(FrameLayout frameLayout) {
        this.LLLLZLLLI = frameLayout;
    }

    public void tH1(C364400EQk c364400EQk) {
        AbstractC1452680nuE abstractC1452680nuEGc = gc();
        if (abstractC1452680nuEGc != null) {
            this.LLILZ.LJ.invoke();
            abstractC1452680nuEGc.LJIIIIZZ(c364400EQk);
        }
        this.LLLZIL = c364400EQk;
    }

    @Override // X.InterfaceC1455860nzM
    public void uG0(boolean z) {
        this.LLLIILIL.setValue(Boolean.valueOf(z));
    }

    public InterfaceC358220E2q w2(String str) {
        return C1456510o0P.LIZ(str);
    }

    @Override // X.InterfaceC1455860nzM
    public void w80(String str) {
        this.LLLFZ.setValue(new Pair<>(Unit.LIZ, str));
    }

    @Override // X.InterfaceC1455860nzM
    public void Ae1(boolean z, int i) {
        this.LLLFFI.setValue(new Pair<>(Boolean.valueOf(z), Integer.valueOf(i)));
    }

    @Override // X.InterfaceC1455860nzM
    public void DV1(boolean z, int i) {
        this.LLLF.setValue(new Pair<>(Boolean.valueOf(z), Integer.valueOf(i)));
    }

    public void H2(AbstractC1452680nuE abstractC1452680nuE, C1450120nq6 c1450120nq6) {
        if (abstractC1452680nuE != null) {
            abstractC1452680nuE.LJIILL(c1450120nq6);
        }
    }

    public boolean JA2(VEPreviewMusicParams vEPreviewMusicParams, List<? extends VEPreviewMusicParams> list) {
        C0MS9.LIZ(this.LLLLLLL, vEPreviewMusicParams);
        C0MS9.LIZIZ(this.LLLLLLLLL, vEPreviewMusicParams);
        AbstractC1452680nuE abstractC1452680nuEGc = gc();
        if (abstractC1452680nuEGc != null) {
            return abstractC1452680nuEGc.LJIIJJI(vEPreviewMusicParams, list);
        }
        return false;
    }

    @Override // X.InterfaceC1455860nzM
    public void UD2(boolean z, int i) {
        this.LLLIIII.setValue(Boolean.valueOf(z));
        this.LLLII.setValue(new Pair<>(Boolean.valueOf(z), Integer.valueOf(i)));
    }

    public String X1(FilterBean filterBean, String str) {
        AbstractC1452680nuE abstractC1452680nuEGc = gc();
        if (abstractC1452680nuEGc == null || filterBean == null) {
            return null;
        }
        C391360FWc.LIZIZ(abstractC1452680nuEGc, "", abstractC1452680nuEGc.LJIJ(), new AwS119S1100000_5(abstractC1452680nuEGc, str, 9));
        return abstractC1452680nuEGc.LJJIII;
    }

    @Override // X.InterfaceC1455860nzM
    public void eT(boolean z, C1456940o16 c1456940o16) {
        this.LLJJL.setValue(new Pair<>(Boolean.valueOf(z), c1456940o16));
    }

    @Override // X.InterfaceC1455860nzM
    public void setPreviewFps(int i, boolean z) {
        AbstractC1452680nuE abstractC1452680nuEGc = gc();
        if (abstractC1452680nuEGc != null && abstractC1452680nuEGc.LJII != null) {
            abstractC1452680nuEGc.LJIJ().setPreviewFps(i, z);
        }
    }

    @Override // X.InterfaceC1455860nzM
    public void updateTrackFilterParam(int i, VEBaseFilterParam vEBaseFilterParam) {
        AbstractC1452680nuE abstractC1452680nuEGc = gc();
        if (abstractC1452680nuEGc != null) {
            abstractC1452680nuEGc.LJJ().updateTrackFilterParam(i, vEBaseFilterParam);
        }
    }

    @Override // X.InterfaceC1455860nzM
    public void vA(boolean z, int i) {
        this.LLLFF.setValue(new Pair<>(Boolean.valueOf(z), Integer.valueOf(i)));
    }

    @Override // X.C11E9
    public <VM1 extends JediViewModel<S1>, S1 extends C004I, R> R withState(VM1 vm1, Function1<? super S1, ? extends R> function1) {
        return function1.invoke(vm1.FQ2());
    }

    public <M1 extends C11E5<S1, PROP1>, PROP1 extends C004I, S1 extends C004I, R> R withSubstate(C11E5<S1, PROP1> c11e5, Function1<? super PROP1, ? extends R> function1) {
        return (R) C1171740gb6.LJIIIIZZ(c11e5, function1);
    }

    @Override // X.InterfaceC1455860nzM
    public void Oe(int i, int i2, VEBaseFilterParam vEBaseFilterParam) {
        AbstractC1452680nuE abstractC1452680nuEGc = gc();
        if (abstractC1452680nuEGc != null) {
            abstractC1452680nuEGc.LJJ().Oe(i, i2, vEBaseFilterParam);
        }
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [X.0E4h] */
    public void rt1(FilterBean filterBean, FilterBean filterBean2, float f) {
        float fAbs;
        if (filterBean != null && filterBean2 != null) {
            if (f < 0.0f) {
                fAbs = Math.abs(f);
            } else {
                fAbs = 1 - f;
            }
            InterfaceC1452170ntP value = M5().getValue();
            if (value != null) {
                if (this.LLILZ.LIZ.invoke().booleanValue()) {
                    C391360FWc.LIZLLL("EditPreviewComponent.setFilterOnFling_new", value, new C355520Dwk(filterBean, filterBean2, fAbs, this, new InterfaceC1453220nv6(this) { // from class: X.0E4h
                        public final /* synthetic */ C1455870nzN<T> LIZ;

                        {
                            this.LIZ = this;
                        }

                        @Override // X.InterfaceC1453220nv6
                        public final float LIZ(FilterBean filterBean3) {
                            float fLIZLLL = C1643880ssc.LIZLLL(filterBean3);
                            if (fLIZLLL == 0.0f) {
                                return this.LIZ.i3(filterBean3.getFilterFolder());
                            }
                            return fLIZLLL;
                        }
                    }));
                } else {
                    C391360FWc.LIZLLL("EditPreviewComponent.setFilterOnFling", value, new AwS9S0200001_5(filterBean, filterBean2, fAbs, 1));
                }
            }
        }
    }

    @Override // X.C11E9
    public <S extends C004I> InterfaceC420801kM subscribe(JediViewModel<S> jediViewModel, C1765020w20<S> c1765020w20, Function2<? super InterfaceC960503pD, ? super S, Unit> function2) {
        return C11EA.LJIIJJI(this, jediViewModel, c1765020w20, function2);
    }

    public <VM1 extends JediViewModel<S1>, S1 extends C004I, VM2 extends JediViewModel<S2>, S2 extends C004I, R> R withState(VM1 vm1, VM2 vm2, Function2<? super S1, ? super S2, ? extends R> function2) {
        return (R) C1171740gb6.LIZLLL(vm1, vm2, function2);
    }

    public <M1 extends C11E5<S1, PROP1>, PROP1 extends C004I, S1 extends C004I, M2 extends C11E5<S2, PROP2>, PROP2 extends C004I, S2 extends C004I, R> R withSubstate(C11E5<S1, PROP1> c11e5, C11E5<S2, PROP2> c11e52, Function2<? super PROP1, ? super PROP2, ? extends R> function2) {
        return (R) C1171740gb6.LJII(c11e5, c11e52, function2);
    }

    public C1455870nzN(C1DRG c1drg, InterfaceC574340Mfo interfaceC574340Mfo, Function1<? super C1455930nzT, Unit> function1, C1452630nu9 c1452630nu9) {
        this.LL = c1drg;
        this.LLILLJJLI = interfaceC574340Mfo;
        this.LLILLL = C452501pT.LIZIZ(new AwS566S0100000_22((C1455870nzN) this, 315));
        C1455930nzT c1455930nzT = new C1455930nzT();
        this.LLILZ = c1455930nzT;
        C1466920oHC c1466920oHC = new C1466920oHC(CoroutineExceptionHandler.LJJLIL, 2);
        this.LLILZLL = c1466920oHC;
        C1DFH c1dfh = C0PEM.LIZ;
        this.LLIZ = C2296808zG.LIZ(C2107308Nj.LIZ.plus(C2296908zH.LIZ()).plus(c1466920oHC));
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS566S0100000_22((C1455870nzN) this, 317));
        this.LLJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1452360nti.class, null);
        if (function1 != null) {
            function1.invoke(c1455930nzT);
        }
        S5();
        this.LLILZIL = c1452630nu9 == null ? new C1452630nu9() : c1452630nu9;
        this.LLJI = C452501pT.LIZIZ(new AwS566S0100000_22((C1455870nzN) this, 311));
        this.LLJILJIL = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(142));
        MutableLiveData<C1403050mcB> mutableLiveData = new MutableLiveData<>();
        mutableLiveData.setValue(new C1403050mcB(0));
        this.LLJILJILJ = mutableLiveData;
        this.LLJILLL = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(150));
        this.LLJJ = true;
        this.LLJJI = new MutableLiveData<>();
        this.LLJJIII = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(141));
        this.LLJJIJI = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(151));
        this.LLJJIJIIJIL = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(143));
        this.LLJJIJIL = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(145));
        this.LLJJJ = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(144));
        this.LLJJJIL = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(148));
        this.LLJJJJ = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(146));
        this.LLJJJJJIL = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(149));
        this.LLJJJJLIIL = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(140));
        this.LLJJL = new MutableLiveData<>();
        this.LLJJLIIIJLLLLLLLZ = new MutableLiveData<>();
        this.LLJL = new MutableLiveData<>();
        this.LLJLIL = new MutableLiveData<>();
        this.LLJLILLLLZIIL = new MutableLiveData<>();
        this.LLJLL = new MutableLiveData<>();
        this.LLJLLIL = new MutableLiveData<>();
        this.LLJLLL = new MutableLiveData<>();
        this.LLJZ = new MutableLiveData<>();
        this.LLJZIJLIL = new MutableLiveData<>();
        this.LLL = new MutableLiveData<>();
        this.LLLF = new MutableLiveData<>();
        this.LLLFF = new MutableLiveData<>();
        this.LLLFFI = new MutableLiveData<>();
        this.LLLFZ = new MutableLiveData<>();
        this.LLLI = new MutableLiveData<>();
        this.LLLII = new MutableLiveData<>();
        this.LLLIIII = new MutableLiveData<>();
        this.LLLIIIIL = new MutableLiveData<>();
        this.LLLIIIL = new MutableLiveData<>();
        this.LLLIIL = new MutableLiveData<>();
        this.LLLIILIL = new MutableLiveData<>();
        this.LLLIL = new ConcurrentHashMap<>();
        this.LLLIZZ = C15O7.LJIIJ(null);
        this.LLLJ = new o<>();
        this.LLLLII = new MutableLiveData<>();
        this.LLLLIIIILLL = new MutableLiveData<>();
        this.LLLLIIL = new MutableLiveData<>();
        this.LLLLIILL = new MutableLiveData<>();
        this.LLLLIILLL = new MutableLiveData<>();
        this.LLLLIL = C452501pT.LIZIZ(new AwS566S0100000_22((C1455870nzN) this, 323));
        this.LLLLILI = C452501pT.LIZIZ(new AwS566S0100000_22((C1455870nzN) this, 322));
        this.LLLLJ = new MutableLiveData();
        this.LLLLJI = new MutableLiveData<>();
        this.LLLLL = new ReplayLiveData<>();
        this.LLLLLIL = new StoredLiveData<>();
        this.LLLLLILLIL = new ArrayList<>();
        this.LLLLLJIL = new MutableLiveData<>();
        this.LLLLLJLJLL = new MutableLiveData<>();
        this.LLLLLL = new MutableLiveData<>();
        this.LLLLLLIL = new MutableLiveData<>();
        this.LLLLLLJ = new MutableLiveData<>();
        this.LLLLLLL = new MutableLiveData<>();
        this.LLLLLLLLL = new C560530Lyd<>();
        this.LLLLLLLZIL = new MutableLiveData<>();
        this.LLLLLLZ = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(152));
        this.LLLLLLZZ = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(153));
        this.LLLLLZ = new MutableLiveData<>();
        this.LLLLLZIL = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(147));
        this.LLLLZ = true;
        this.LLLZIIL = new AwS601S0100000_22(this, 210);
    }

    @Override // X.InterfaceC1166920gTK
    public <S extends C004I, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1765020w20<C11EC<A>> c1765020w20, Function2<? super InterfaceC1166920gTK, ? super A, Unit> function2) {
        C1170060gYO.LIZIZ(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2);
    }

    @Override // X.C11E9
    public <S extends C004I, A> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1765020w20<C11EC<A>> c1765020w20, Function2<? super InterfaceC960503pD, ? super A, Unit> function2) {
        return C11EA.LJI(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2);
    }

    @Override // X.InterfaceC1455860nzM
    public void sendEffectMsg(int i, long j, long j2, String str) {
        AbstractC1452680nuE abstractC1452680nuEGc = gc();
        if (abstractC1452680nuEGc != null) {
            C391360FWc.LIZIZ(abstractC1452680nuEGc, "sendEffectMsg", abstractC1452680nuEGc.LJIJ(), new C0F1V(i, j, j2, str));
        }
    }

    @Override // X.InterfaceC1166920gTK
    public <S extends C004I, A> void subscribeEvent(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends C0LCS<? extends A>> interfaceC2217241BqE, C1765020w20<C11EC<C0LCS<A>>> c1765020w20, Function2<? super InterfaceC1166920gTK, ? super A, Unit> function2) {
        C1170060gYO.LIZLLL(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2);
    }

    public <VM1 extends JediViewModel<S1>, S1 extends C004I, VM2 extends JediViewModel<S2>, S2 extends C004I, VM3 extends JediViewModel<S3>, S3 extends C004I, R> R withState(VM1 vm1, VM2 vm2, VM3 vm3, InterfaceC1631620sYq<? super S1, ? super S2, ? super S3, ? extends R> interfaceC1631620sYq) {
        return (R) C1171740gb6.LIZJ(vm1, vm2, vm3, interfaceC1631620sYq);
    }

    public <M1 extends C11E5<S1, PROP1>, PROP1 extends C004I, S1 extends C004I, M2 extends C11E5<S2, PROP2>, PROP2 extends C004I, S2 extends C004I, M3 extends C11E5<S3, PROP3>, PROP3 extends C004I, S3 extends C004I, R> R withSubstate(C11E5<S1, PROP1> c11e5, C11E5<S2, PROP2> c11e52, C11E5<S3, PROP3> c11e53, InterfaceC1631620sYq<? super PROP1, ? super PROP2, ? super PROP3, ? extends R> interfaceC1631620sYq) {
        return (R) C1171740gb6.LJI(c11e5, c11e52, c11e53, interfaceC1631620sYq);
    }

    public void x7(boolean z, boolean z2, boolean z3, boolean z4) {
        E5().setValue(new C1456890o11(z, z2, z3, z4));
    }

    @Override // X.InterfaceC1455860nzM
    public void LH1(VEPreviewMusicParams vEPreviewMusicParams, long j, long j2, long j3, long j4) {
        C1450140nq8 c1450140nq8;
        int i;
        int i2;
        AbstractC1452680nuE abstractC1452680nuEGc = gc();
        if (abstractC1452680nuEGc != null) {
            int i3 = vEPreviewMusicParams.mOutPoint;
            if (i3 <= 0) {
                int i4 = vEPreviewMusicParams.mShootDuration;
                if (i4 > 0 && Math.abs(vEPreviewMusicParams.mDuration - i4) >= 1000) {
                    i = vEPreviewMusicParams.mInPoint;
                    i2 = vEPreviewMusicParams.mShootDuration;
                } else {
                    i = vEPreviewMusicParams.mInPoint;
                    i2 = vEPreviewMusicParams.mDuration;
                }
                i3 = i + i2;
            }
            if (vEPreviewMusicParams.mPath != null && (c1450140nq8 = abstractC1452680nuEGc.LJIIL) != null) {
                int i5 = c1450140nq8.LIZJ;
                if (i5 != 0) {
                    C1450130nq7.LIZ(i5, j, j2, j3, j4, new C1466950oHF(c1450140nq8, 4));
                } else {
                    c1450140nq8.LIZ = vEPreviewMusicParams.mInPoint;
                    c1450140nq8.LIZIZ = i3;
                }
            }
        }
    }

    @Override // X.C11E9
    public <S extends C004I, A, B> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1765020w20<C11EF<A, B>> c1765020w20, InterfaceC1631620sYq<? super InterfaceC960503pD, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C11EA.LJFF(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, c1765020w20, interfaceC1631620sYq);
    }

    public <VM1 extends JediViewModel<S1>, S1 extends C004I, VM2 extends JediViewModel<S2>, S2 extends C004I, VM3 extends JediViewModel<S3>, S3 extends C004I, VM4 extends JediViewModel<S4>, S4 extends C004I, R> R withState(VM1 vm1, VM2 vm2, VM3 vm3, VM4 vm4, InterfaceC1631630sYr<? super S1, ? super S2, ? super S3, ? super S4, ? extends R> interfaceC1631630sYr) {
        return (R) C1171740gb6.LIZIZ(vm1, vm2, vm3, vm4, interfaceC1631630sYr);
    }

    public <M1 extends C11E5<S1, PROP1>, PROP1 extends C004I, S1 extends C004I, M2 extends C11E5<S2, PROP2>, PROP2 extends C004I, S2 extends C004I, M3 extends C11E5<S3, PROP3>, PROP3 extends C004I, S3 extends C004I, M4 extends C11E5<S4, PROP4>, PROP4 extends C004I, S4 extends C004I, R> R withSubstate(C11E5<S1, PROP1> c11e5, C11E5<S2, PROP2> c11e52, C11E5<S3, PROP3> c11e53, C11E5<S4, PROP4> c11e54, InterfaceC1631630sYr<? super PROP1, ? super PROP2, ? super PROP3, ? super PROP4, ? extends R> interfaceC1631630sYr) {
        return (R) C1171740gb6.LJFF(c11e5, c11e52, c11e53, c11e54, interfaceC1631630sYr);
    }

    public /* synthetic */ C1455870nzN(C1DRG c1drg, InterfaceC574340Mfo interfaceC574340Mfo, Function1 function1, C1452630nu9 c1452630nu9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c1drg, interfaceC574340Mfo, (i & 4) != 0 ? null : function1, (i & 8) != 0 ? null : c1452630nu9);
    }

    @Override // X.C11E9
    public <S extends C004I, T> InterfaceC420801kM asyncSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends AbstractC1252750ihl<? extends T>> interfaceC2217241BqE, C1765020w20<C11EC<AbstractC1252750ihl<T>>> c1765020w20, Function2<? super InterfaceC960503pD, ? super Throwable, Unit> function2, Function1<? super InterfaceC960503pD, Unit> function1, Function2<? super InterfaceC960503pD, ? super T, Unit> function22) {
        return C11EA.LIZ(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2, function1, function22);
    }

    @Override // X.C11E9
    public <S extends C004I, A, B, C> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1765020w20<C1634100scq<A, B, C>> c1765020w20, InterfaceC1631630sYr<? super InterfaceC960503pD, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C11EA.LJ(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1765020w20, interfaceC1631630sYr);
    }

    public <VM1 extends JediViewModel<S1>, S1 extends C004I, VM2 extends JediViewModel<S2>, S2 extends C004I, VM3 extends JediViewModel<S3>, S3 extends C004I, VM4 extends JediViewModel<S4>, S4 extends C004I, VM5 extends JediViewModel<S5>, S5 extends C004I, R> R withState(VM1 vm1, VM2 vm2, VM3 vm3, VM4 vm4, VM5 vm5, InterfaceC1685420txc<? super S1, ? super S2, ? super S3, ? super S4, ? super S5, ? extends R> interfaceC1685420txc) {
        return (R) C1171740gb6.LIZ(vm1, vm2, vm3, vm4, vm5, interfaceC1685420txc);
    }

    public <M1 extends C11E5<S1, PROP1>, PROP1 extends C004I, S1 extends C004I, M2 extends C11E5<S2, PROP2>, PROP2 extends C004I, S2 extends C004I, M3 extends C11E5<S3, PROP3>, PROP3 extends C004I, S3 extends C004I, M4 extends C11E5<S4, PROP4>, PROP4 extends C004I, S4 extends C004I, M5 extends C11E5<S5, PROP5>, PROP5 extends C004I, S5 extends C004I, R> R withSubstate(C11E5<S1, PROP1> c11e5, C11E5<S2, PROP2> c11e52, C11E5<S3, PROP3> c11e53, C11E5<S4, PROP4> c11e54, C11E5<S5, PROP5> c11e55, InterfaceC1685420txc<? super PROP1, ? super PROP2, ? super PROP3, ? super PROP4, ? super PROP5, ? extends R> interfaceC1685420txc) {
        return (R) C1171740gb6.LJ(c11e5, c11e52, c11e53, c11e54, c11e55, interfaceC1685420txc);
    }

    @Override // X.C11E9
    public <S extends C004I, A, B, C, D> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1765020w20<C1644460stY<A, B, C, D>> c1765020w20, InterfaceC1685420txc<? super InterfaceC960503pD, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C11EA.LIZLLL(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1765020w20, interfaceC1685420txc);
    }

    public <S extends C004I, A, B, C, D, E> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, InterfaceC2217241BqE<S, ? extends E> interfaceC2217241BqE5, C1765020w20<C11EE<A, B, C, D, E>> c1765020w20, InterfaceC1685430txd<? super InterfaceC960503pD, ? super A, ? super B, ? super C, ? super D, ? super E, Unit> interfaceC1685430txd) {
        return C11EA.LIZJ(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, interfaceC2217241BqE5, c1765020w20, interfaceC1685430txd);
    }
}
