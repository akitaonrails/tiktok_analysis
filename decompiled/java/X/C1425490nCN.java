package X;

import Y.AObjectS245S0100000_22;
import Y.AObserverS225S0100000_22;
import Y.ARunnableS23S0101000_12;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.als.LiveEvent;
import com.bytedance.als.extensions.LifecycleOwnerExtensionsKt;
import com.bytedance.als.h0;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS566S0100000_22;

/* JADX INFO: renamed from: X.0nCN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1425490nCN extends AbstractC2255721DQs<InterfaceC1424260nAO> implements InterfaceC1424260nAO, InterfaceC379610EuV {
    public static final C1425540nCS LLJJIJIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJ;
    public final C19A3 LL;
    public final C1DRG LLILLJJLI;
    public final C1DRG LLILLL;
    public final Function0<Integer> LLILZ;
    public C1425520nCQ LLJILJIL;
    public ViewGroup LLJJI;
    public View LLJJIJI;
    public View LLJJIJIIJIL;
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 99));
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1425510nCP.class, null);
    public final InterfaceC1731706qJ LLIZ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1425550nCT.class, null);
    public final InterfaceC1731706qJ LLIZLLLIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC569560MVm.class, null);
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS566S0100000_22(this, 96));
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS566S0100000_22(this, 98));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 97));
    public final h0<Float> LLJILJILJ = new h0<>(null);
    public final h0<Float> LLJILLL = new h0<>(null);
    public final C560530Lyd<Unit> LLJJ = new C560530Lyd<>();
    public final C1424760nBC LLJJIII = new C1424760nBC(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)));

    /* JADX WARN: Type inference failed for: r0v7, types: [X.0nCS] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1425490nCN.class, "editTabStateApi", "getEditTabStateApi()Lcom/ss/android/ugc/aweme/editorpro/EditorTabStateApi;", 0);
        C13LE.LIZ.getClass();
        LLJJJ = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C1425490nCN.class, "topBarApi", "getTopBarApi()Lcom/ss/android/ugc/aweme/editorpro/topbar/EditorTabTopBarApi;", 0), new C2217381BqS(C1425490nCN.class, "bannerApi", "getBannerApi()Lcom/ss/android/ugc/aweme/editorpro/toolbanner/IEditorTabBannerApi;", 0)};
        LLJJIJIL = new Object() { // from class: X.0nCS
        };
    }

    public InterfaceC1424260nAO W1() {
        return this;
    }

    private final InterfaceC569560MVm X1() {
        return (InterfaceC569560MVm) this.LLIZLLLIL.getValue(this, LLJJJ[2]);
    }

    private final InterfaceC1422770n7z c3() {
        return (InterfaceC1422770n7z) this.LLJI.getValue();
    }

    private final InterfaceC1425550nCT m3() {
        return (InterfaceC1425550nCT) this.LLIZ.getValue(this, LLJJJ[1]);
    }

    private final void v3() {
        C385670FAf<C443120HZe<Boolean, C1419590n2r, Float>> c385670FAfQx1;
        LiveEvent<Unit> liveEventUn;
        InterfaceC1425500nCO interfaceC1425500nCOT2;
        C16FB c16fb = (C16FB) this.LL.findViewById(R.id.gu0);
        if (c16fb != null && (interfaceC1425500nCOT2 = T2()) != null) {
            interfaceC1425500nCOT2.vX0(c16fb);
        }
        InterfaceC1425500nCO interfaceC1425500nCOT22 = T2();
        if (interfaceC1425500nCOT22 != null) {
            interfaceC1425500nCOT22.QB2();
        }
        View viewFindViewById = this.LL.findViewById(R.id.b3o);
        View viewFindViewById2 = this.LL.findViewById(R.id.b3l);
        Pair<? extends FrameLayout, ? extends SmartImageView> pair = (viewFindViewById == null || viewFindViewById2 == null) ? null : new Pair<>(viewFindViewById, viewFindViewById2);
        InterfaceC1425500nCO interfaceC1425500nCOT23 = T2();
        if (interfaceC1425500nCOT23 != null) {
            interfaceC1425500nCOT23.gc2(EnumC994860bzo.EDITOR_TAB, pair, this.LLJJIII);
        }
        InterfaceC1425500nCO interfaceC1425500nCOT24 = T2();
        if (interfaceC1425500nCOT24 != null) {
            interfaceC1425500nCOT24.hK0(true);
        }
        InterfaceC1425500nCO interfaceC1425500nCOT25 = T2();
        if (interfaceC1425500nCOT25 != null && (liveEventUn = interfaceC1425500nCOT25.Un()) != null) {
            liveEventUn.LIZ(this, new AObjectS245S0100000_22(this, 15));
        }
        InterfaceC1422770n7z interfaceC1422770n7zC3 = c3();
        if (interfaceC1422770n7zC3 == null || (c385670FAfQx1 = interfaceC1422770n7zC3.qx1()) == null) {
            return;
        }
        c385670FAfQx1.LIZ(this, new AObjectS245S0100000_22(this, 16));
    }

    public final void H3() {
        ViewGroup.LayoutParams layoutParams;
        if (!this.LL.isAdded(i3())) {
            C1424760nBC c1424760nBC = this.LLJJIII;
            int i = c1424760nBC.LIZ + c1424760nBC.LIZIZ;
            Context sceneContext = this.LL.getSceneContext();
            if (sceneContext == null) {
                sceneContext = C0CHQ.LIZ;
            }
            int iLIZ = ((((C1415610mwR.LIZ() - m3().tY1()) - ScreenUtils.getStatusBarHeight(sceneContext)) - ScreenUtils.com_ss_android_ugc_aweme_shortvideo_ScreenUtils_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getNavigationBarHeight(sceneContext)) - Z1().LLJJJJLIIL().LIZJ().intValue()) + i;
            View viewFindViewById = this.LL.findViewById(R.id.gue);
            ViewGroup viewGroup = viewFindViewById instanceof ViewGroup ? (ViewGroup) viewFindViewById : null;
            this.LLJJI = viewGroup;
            if (viewGroup != null && (layoutParams = viewGroup.getLayoutParams()) != null) {
                layoutParams.height = iLIZ;
            }
            this.LL.add(R.id.gue, i3(), "RecordMVScene");
            v3();
            if (((Boolean) C283130B7v.LIZ.getValue()).booleanValue()) {
                LifecycleOwnerExtensionsKt.LIZ(this, new ARunnableS23S0101000_12(i, this, 6));
            }
            X1().C70().observe(this, new AObserverS225S0100000_22(this, 11));
        }
        this.LL.show(i3());
        i3().show();
    }

    public final InterfaceC1425500nCO T2() {
        return (InterfaceC1425500nCO) this.LLJ.getValue();
    }

    public final InterfaceC1422570n7f W2() {
        return (InterfaceC1422570n7f) this.LLJIJIL.getValue();
    }

    @Override // X.InterfaceC1424260nAO
    public Pair<Integer, Integer> Xb1() {
        View viewKs1;
        View viewKs12;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        View viewKs13;
        ViewGroup viewGroup = this.LLJJI;
        if (viewGroup == null) {
            return null;
        }
        int top = viewGroup.getTop();
        InterfaceC1425500nCO interfaceC1425500nCOT2 = T2();
        if (interfaceC1425500nCOT2 == null || (viewKs1 = interfaceC1425500nCOT2.ks1()) == null) {
            return null;
        }
        int top2 = viewKs1.getTop();
        InterfaceC1425500nCO interfaceC1425500nCOT22 = T2();
        if (interfaceC1425500nCOT22 == null || (viewKs12 = interfaceC1425500nCOT22.ks1()) == null) {
            return null;
        }
        int bottom = viewKs12.getBottom();
        InterfaceC1425500nCO interfaceC1425500nCOT23 = T2();
        ViewGroup.LayoutParams layoutParams = (interfaceC1425500nCOT23 == null || (viewKs13 = interfaceC1425500nCOT23.ks1()) == null) ? null : viewKs13.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) == null) {
            return null;
        }
        return new Pair<>(Integer.valueOf(top2 + top), Integer.valueOf(top + bottom + marginLayoutParams.bottomMargin));
    }

    public final InterfaceC1425510nCP Z1() {
        return (InterfaceC1425510nCP) this.LLILZLL.getValue(this, LLJJJ[0]);
    }

    public final C1453300nvE i3() {
        return (C1453300nvE) this.LLILZIL.getValue();
    }

    public final void q3() {
        if (this.LL.isShowing(i3())) {
            this.LL.hide(i3());
            i3().hide();
        }
    }

    private final boolean E3() {
        return (C298950Bnh.LIZ() || C298960Bni.LIZ()) && C298940Bng.LIZ();
    }

    private final void Mf() {
        Z1().zT().observe(this, new AObserverS225S0100000_22(this, 7));
        Z1().ey1(new InterfaceC21580219cu() { // from class: X.0nCR
            @Override // X.InterfaceC21580219cu
            public final void LJI() {
            }

            @Override // X.InterfaceC21580219cu
            public final void c3() {
            }

            @Override // X.InterfaceC21580219cu
            public final void b3() {
                InterfaceC1425500nCO interfaceC1425500nCOT2 = this.LIZ.T2();
                if (interfaceC1425500nCOT2 != null) {
                    interfaceC1425500nCOT2.Ax1();
                }
            }

            @Override // X.InterfaceC21580219cu
            public final void a3(int i) {
                this.LIZ.B3(i);
            }

            @Override // X.InterfaceC21580219cu
            public final void d3(int i) {
                InterfaceC1425500nCO interfaceC1425500nCOT2 = this.LIZ.T2();
                if (interfaceC1425500nCOT2 != null) {
                    interfaceC1425500nCOT2.Yj1(new C1424830nBJ(i));
                }
            }
        });
        Z1().zL2().LIZ(this, new AObjectS245S0100000_22(this, 14));
        Z1().ns2().observe(this, new AObserverS225S0100000_22(this, 8));
        Z1().EI0().observe(this, new AObserverS225S0100000_22(this, 9));
        Z1().P31().observe(this, new AObserverS225S0100000_22(this, 10));
    }

    @Override // X.InterfaceC1424260nAO
    public boolean CJ1() {
        C385670FAf<C443120HZe<Boolean, C1419590n2r, Float>> c385670FAfQx1;
        C443120HZe<Boolean, C1419590n2r, Float> c443120HZeLIZJ;
        InterfaceC1422770n7z interfaceC1422770n7zC3 = c3();
        return (interfaceC1422770n7zC3 == null || (c385670FAfQx1 = interfaceC1422770n7zC3.qx1()) == null || (c443120HZeLIZJ = c385670FAfQx1.LIZJ()) == null || !c443120HZeLIZJ.getFirst().booleanValue()) ? false : true;
    }

    @Override // X.InterfaceC1424260nAO
    public C385670FAf<C1422970n8J> Eq1() {
        C1422960n8I c1422960n8IAB1;
        InterfaceC1422570n7f interfaceC1422570n7fW2 = W2();
        if (interfaceC1422570n7fW2 == null || (c1422960n8IAB1 = interfaceC1422570n7fW2.AB1()) == null) {
            return null;
        }
        return c1422960n8IAB1.LJ;
    }

    public final Integer H2() {
        Pair<Integer, Integer> pairXb1 = Xb1();
        if (pairXb1 != null) {
            return pairXb1.getSecond();
        }
        return null;
    }

    @Override // X.InterfaceC1424260nAO
    public void jd() {
        InterfaceC1425500nCO interfaceC1425500nCOT2 = T2();
        if (interfaceC1425500nCOT2 != null) {
            interfaceC1425500nCOT2.jd();
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        Mf();
    }

    public C560530Lyd<Unit> G2() {
        return this.LLJJ;
    }

    @Override // X.InterfaceC1424260nAO
    public /* bridge */ /* synthetic */ C385670FAf GO() {
        return this.LLJILLL;
    }

    @Override // X.InterfaceC1424260nAO
    public /* bridge */ /* synthetic */ LiveEvent Un() {
        return this.LLJJ;
    }

    @Override // X.InterfaceC1424260nAO
    public /* bridge */ /* synthetic */ C385670FAf Wn() {
        return this.LLJILJILJ;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        W1();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLILLJJLI;
    }

    public h0<Float> o2() {
        return this.LLJILLL;
    }

    public h0<Float> w2() {
        return this.LLJILJILJ;
    }

    public final void B3(int i) {
        View viewKs1;
        Float fLIZ;
        Float fValueOf;
        InterfaceC1425500nCO interfaceC1425500nCOT2 = T2();
        if (interfaceC1425500nCOT2 != null && (viewKs1 = interfaceC1425500nCOT2.ks1()) != null) {
            if (this.LLJILJIL == null) {
                this.LLJILJIL = new C1425520nCQ(viewKs1);
            }
            C1425520nCQ c1425520nCQ = this.LLJILJIL;
            if (c1425520nCQ != null && (fLIZ = c1425520nCQ.LIZ()) != null) {
                float fFloatValue = fLIZ.floatValue();
                this.LLJILJILJ.LJII(Float.valueOf(fFloatValue));
                h0<Float> h0Var = this.LLJILLL;
                if (E3()) {
                    fValueOf = Float.valueOf(fFloatValue);
                } else {
                    fValueOf = null;
                }
                h0Var.LJII(fValueOf);
                InterfaceC1425500nCO interfaceC1425500nCOT22 = T2();
                if (interfaceC1425500nCOT22 != null) {
                    interfaceC1425500nCOT22.s52(fFloatValue, i);
                }
            }
        }
    }

    @Override // X.InterfaceC1424260nAO
    public void MG2(boolean z) {
        InterfaceC1425500nCO interfaceC1425500nCOT2 = T2();
        if (interfaceC1425500nCOT2 != null) {
            interfaceC1425500nCOT2.mX0(z);
        }
    }

    public C1425490nCN(C19A3 c19a3, C1DRG c1drg, C1DRG c1drg2, Function0<Integer> function0) {
        this.LL = c19a3;
        this.LLILLJJLI = c1drg;
        this.LLILLL = c1drg2;
        this.LLILZ = function0;
    }
}
