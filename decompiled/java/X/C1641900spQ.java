package X;

import Y.ACListenerS159S0100000_25;
import Y.ATListenerS457S0100000_25;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.scene.Scene;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.effectdiscover.EffectDiscoverPanelState;
import com.ss.android.ugc.aweme.shortvideo.effectdiscover.EffectDiscoverViewModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.tiktok.eventtracking.ab.EffectETGroupEnableConfig;
import com.ss.android.ugc.tools.utils.KeyboardUtils;
import com.ss.android.ugc.tools.view.widget.ViewPagerBottomSheetBehavior;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS426S0200000_25;
import kotlin.jvm.internal.AwS639S0100000_25;
import kotlin.jvm.internal.AwS674S0100000_25;
import lnn.q;

/* JADX INFO: renamed from: X.0spQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1641900spQ extends Scene implements InterfaceC1166920gTK, InterfaceC379610EuV, InterfaceC362610EJn, InterfaceC484050IyZ {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJZ;
    public final C1DRG LLJI;
    public final int LLJIJIL;
    public final C1664750tQH LLJILJIL;
    public final C1664750tQH LLJILJILJ;
    public final C1664750tQH LLJILLL;
    public final C1664740tQG LLJJ;
    public final C1664740tQG LLJJI;
    public final C1664750tQH LLJJIII;
    public final C1664740tQG LLJJIJI;
    public final C01GW LLJJIJIIJIL = C452501pT.LIZIZ(new AwS426S0200000_25(this, C13LE.LIZ(EffectDiscoverViewModel.class), 50));
    public final C11PQ<String> LLJJIJIL;
    public View LLJJJ;
    public View LLJJJIL;
    public View LLJJJJ;
    public C19656011vK LLJJJJJIL;
    public ViewPagerBottomSheetBehavior<View> LLJJJJLIIL;
    public ConstraintLayout LLJJL;
    public ConstraintLayout LLJJLIIIJLLLLLLLZ;
    public RecyclerView LLJL;
    public C418880Gbe LLJLIL;
    public TuxTextView LLJLILLLLZIIL;
    public TuxTextView LLJLL;
    public C1449130noV LLJLLIL;
    public final C19475711Hn LLJLLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1641900spQ.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1641900spQ.class, "stickPanelApi", "getStickPanelApi()Lcom/bytedance/creativex/recorder/sticker/api/StickerPanelApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1641900spQ.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C1641900spQ.class, "svcApiComponent", "getSvcApiComponent()Lcom/ss/android/ugc/gamora/recorder/voicechange/slideslip/SVCBottomAndPanelApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C1641900spQ.class, "musicPlayApiComponent", "getMusicPlayApiComponent()Lcom/ss/android/ugc/gamora/recorder/choosemusic/play/MusicPlayApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(C1641900spQ.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS7 = new C2217381BqS(C1641900spQ.class, "recommendedMusicApi", "getRecommendedMusicApi()Lcom/ss/android/ugc/gamora/recorder/choosemusic/recommend/RecommendMusicApiComponent;", 0);
        c09r3.getClass();
        LLJZ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6, c2217381BqS7};
    }

    @Override // X.InterfaceC960503pD, X.C11E6
    public final LifecycleOwner getLifecycleOwner() {
        return this;
    }

    @Override // X.C11E9
    public final C11E6 getLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.C11DL
    public final InterfaceC874803bO getReceiver() {
        return this;
    }

    @Override // X.C11E9
    public final C11DL<InterfaceC960503pD> getReceiverHolder() {
        return this;
    }

    @Override // X.C11E9
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    public final InterfaceC1650230t2r LLLII() {
        return (InterfaceC1650230t2r) this.LLJILLL.getValue(this, LLJZ[2]);
    }

    public final ShortVideoContext LLLIIIIL() {
        return (ShortVideoContext) this.LLJJIII.getValue(this, LLJZ[5]);
    }

    public final q LLLIILIL() {
        return (q) this.LLJILJIL.getValue(this, LLJZ[0]);
    }

    public final EffectDiscoverViewModel LLLIL() {
        return (EffectDiscoverViewModel) this.LLJJIJIIJIL.getValue();
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLJI;
    }

    @Override // com.bytedance.scene.Scene
    public final void LLJJL(boolean z) {
        if (C1448960noE.LIZ()) {
            LLLIILIL().kd1(z);
        }
    }

    public C1641900spQ(C1DRG c1drg, int i) {
        this.LLJI = c1drg;
        this.LLJIJIL = i;
        this.LLJILJIL = C1664770tQJ.LIZ(c1drg, q.class, null);
        this.LLJILJILJ = C1664770tQJ.LIZ(c1drg, InterfaceC579050MnP.class, null);
        this.LLJILLL = C1664770tQJ.LIZ(c1drg, InterfaceC1650230t2r.class, null);
        this.LLJJ = C1664770tQJ.LIZIZ(c1drg, InterfaceC1650930t3z.class, null);
        this.LLJJI = C1664770tQJ.LIZIZ(c1drg, InterfaceC1652470t6T.class, null);
        this.LLJJIII = C1664770tQJ.LIZ(c1drg, ShortVideoContext.class, null);
        this.LLJJIJI = C1664770tQJ.LIZIZ(c1drg, InterfaceC1624370sN9.class, null);
        C11PQ<String> c11pq = new C11PQ<>();
        this.LLJJIJIL = c11pq;
        this.LLJLLL = new C19475711Hn(c11pq);
    }

    @Override // X.InterfaceC362610EJn
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            LLLIL().hide();
            return true;
        }
        return false;
    }

    @Override // X.C11E9
    public final <VM1 extends JediViewModel<S1>, S1 extends C004I, R> R withState(VM1 vm1, Function1<? super S1, ? extends R> function1) {
        return function1.invoke(vm1.FQ2());
    }

    @Override // X.InterfaceC484050IyZ
    public final boolean onActivityResult(int i, int i2, Intent intent) {
        Effect effect;
        if (i == 10087 && i2 == -1) {
            if (intent != null && (effect = (Effect) intent.getParcelableExtra("request_code_select_effect_result")) != null) {
                effect.setSearchType("prop_panel_discover");
                C1624010sMZ.LIZLLL(LLLIILIL(), Collections.singletonList(effect), true, true, null, false, null, null, null, 32760);
                int intExtra = intent.getIntExtra("impr_position", -1);
                if (EffectETGroupEnableConfig.isEnabled()) {
                    LLLIILIL().C0().LJII().LJIIIZ(new C1449000noI(effect, -1, intExtra, false, false, false, false, (String) null, "", "", 1264));
                }
            }
            LLLIL().hide();
            return true;
        }
        return false;
    }

    @Override // com.bytedance.scene.Scene
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.epq, viewGroup, false);
        View viewFindViewById = viewTd.findViewById(R.id.w0x);
        ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
        layoutParams.height = C497820Jfg.LIZJ(viewFindViewById.getContext());
        C786410Ut5.W5(viewFindViewById, layoutParams);
        this.LLJJJIL = viewFindViewById;
        this.LLJJL = (ConstraintLayout) viewTd.findViewById(R.id.gvz);
        C786410Ut5.Q7((ImageView) viewTd.findViewById(R.id.e1v), new ACListenerS159S0100000_25(this, 6));
        this.LLJJLIIIJLLLLLLLZ = (ConstraintLayout) viewTd.findViewById(R.id.ue2);
        this.LLJL = (RecyclerView) viewTd.findViewById(R.id.ue3);
        this.LLJLIL = (C418880Gbe) viewTd.findViewById(R.id.s8t);
        this.LLJLILLLLZIIL = (TuxTextView) viewTd.findViewById(R.id.hbh);
        this.LLJLL = (TuxTextView) viewTd.findViewById(R.id.ud3);
        this.LLJJJJJIL = (C19656011vK) viewTd.findViewById(R.id.tv_search);
        this.LLJJJJ = viewTd.findViewById(R.id.coo);
        if (this.LLJIJIL == 1) {
            View viewFindViewById2 = viewTd.findViewById(R.id.tpd);
            C786410Ut5.LJLLLLLL(0, viewFindViewById2);
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.bv);
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(10));
            viewFindViewById2.setBackground(c384050F3z.LIZ(viewTd.getContext()));
            q qVarLLLIILIL = LLLIILIL();
            String creationId = LLLIIIIL().getCreationId();
            String str = LLLIIIIL().shootWay;
            if (str == null) {
                str = "";
            }
            this.LLJLLIL = new C1449130noV(qVarLLLIILIL, creationId, str, (InterfaceC1449160noY) this.LLJI.LJII(InterfaceC1449160noY.class, null), LLLIIIIL().creativeModel, new AwS639S0100000_25(this, 40));
            RecyclerView recyclerView = this.LLJL;
            if (recyclerView == null) {
                recyclerView = null;
            }
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
            recyclerView.setAdapter(this.LLJLLIL);
            C19656011vK c19656011vK = this.LLJJJJJIL;
            if (c19656011vK == null) {
                c19656011vK = null;
            }
            c19656011vK.addTextChangedListener(new C1698180uIC(this, 0));
            c19656011vK.setOnTouchListener(new ATListenerS457S0100000_25(this, 1));
            View view = this.LLJJJJ;
            if (view == null) {
                view = null;
            }
            C786410Ut5.I7(new ACListenerS159S0100000_25(this, 7), view);
            C11EA.LJIIIIZZ(this, LLLIL(), new C2217381BqS() { // from class: X.0skZ
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Boolean.valueOf(((EffectDiscoverPanelState) obj).getEmptySearchString());
                }
            }, new C2217381BqS() { // from class: X.0ska
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((EffectDiscoverPanelState) obj).getSearchState();
                }
            }, new AwS674S0100000_25(this, 17));
        }
        this.LLJJJ = viewTd;
        ViewPagerBottomSheetBehavior<View> viewPagerBottomSheetBehaviorFrom = ViewPagerBottomSheetBehavior.from(viewTd.findViewById(R.id.fpl));
        viewPagerBottomSheetBehaviorFrom.setPeekHeight(C14KQ.LJ(requireSceneContext()) + C14KQ.LIZLLL(requireSceneContext()));
        viewPagerBottomSheetBehaviorFrom.setHideable(true);
        viewPagerBottomSheetBehaviorFrom.setBottomSheetCallback(new C16BV() { // from class: X.0skg
            @Override // X.C16BV
            public final void LIZIZ(View view2, float f) {
            }

            @Override // X.C16BV
            public final void LIZJ(int i, View view2) {
                C19A3 c19a3;
                if (i == 5) {
                    C1641900spQ c1641900spQ = this.LIZ;
                    Scene scene = c1641900spQ.mParentScene;
                    if ((scene instanceof C19A3) && (c19a3 = (C19A3) scene) != null) {
                        c19a3.hide(c1641900spQ);
                    }
                    C19656011vK c19656011vK2 = c1641900spQ.LLJJJJJIL;
                    if (c19656011vK2 == null) {
                        c19656011vK2 = null;
                    }
                    KeyboardUtils.LIZ(c1641900spQ.getSceneContext(), c19656011vK2);
                    c1641900spQ.LLLII().IU1().LIZIZ(EnumC545560LaU.EFFECT_DISCOVER_SCENE, C1DPV.LIZIZ.LIZIZ(C1DPW.OPEN_CAMERA_CLOSE_EFFECT_DISCOVER, null), Boolean.FALSE);
                    C1664740tQG c1664740tQG = c1641900spQ.LLJJ;
                    InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C1641900spQ.LLJZ;
                    InterfaceC1650930t3z interfaceC1650930t3z = (InterfaceC1650930t3z) c1664740tQG.getValue(c1641900spQ, interfaceC2217461BqaArr[3]);
                    if (interfaceC1650930t3z != null) {
                        interfaceC1650930t3z.tM1();
                    }
                    if (C1624200sMs.LJIILIIL(c1641900spQ.LLLIILIL().C0().LLILIL())) {
                        c1641900spQ.LLLII().St2().t1();
                    } else {
                        InterfaceC1624370sN9 interfaceC1624370sN9 = (InterfaceC1624370sN9) c1641900spQ.LLJJIJI.getValue(c1641900spQ, interfaceC2217461BqaArr[6]);
                        if (interfaceC1624370sN9 != null) {
                            interfaceC1624370sN9.ya2(false);
                        }
                        InterfaceC1652470t6T interfaceC1652470t6T = (InterfaceC1652470t6T) c1641900spQ.LLJJI.getValue(c1641900spQ, interfaceC2217461BqaArr[4]);
                        if (interfaceC1652470t6T != null) {
                            interfaceC1652470t6T.kc2(null, false);
                        }
                    }
                    c1641900spQ.LLLIL().MB0(false);
                    InterfaceC524950KiL interfaceC524950KiLLIZ = C0MWZ.LIZ(c1641900spQ);
                    if (interfaceC524950KiLLIZ != null) {
                        interfaceC524950KiLLIZ.b8(c1641900spQ);
                        interfaceC524950KiLLIZ.T4(c1641900spQ);
                    }
                    C1641900spQ c1641900spQ2 = this.LIZ;
                    ((InterfaceC579050MnP) c1641900spQ2.LLJILJILJ.getValue(c1641900spQ2, interfaceC2217461BqaArr[1])).My0(true, false);
                }
            }
        });
        this.LLJJJJLIIL = viewPagerBottomSheetBehaviorFrom;
        View view2 = this.LLJJJ;
        if (view2 == null) {
            return null;
        }
        return view2;
    }

    @Override // X.C11E9
    public final <S extends C004I> InterfaceC420801kM subscribe(JediViewModel<S> jediViewModel, C1765020w20<S> c1765020w20, Function2<? super InterfaceC960503pD, ? super S, Unit> function2) {
        return C11EA.LJIIJJI(this, jediViewModel, c1765020w20, function2);
    }

    @Override // X.InterfaceC1166920gTK
    public final <S extends C004I, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1765020w20<C11EC<A>> c1765020w20, Function2<? super InterfaceC1166920gTK, ? super A, Unit> function2) {
        C1170060gYO.LIZIZ(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2);
    }

    @Override // X.C11E9
    public final <S extends C004I, A> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1765020w20<C11EC<A>> c1765020w20, Function2<? super InterfaceC960503pD, ? super A, Unit> function2) {
        return C11EA.LJI(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2);
    }

    @Override // X.InterfaceC1166920gTK
    public final <S extends C004I, A> void subscribeEvent(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends C0LCS<? extends A>> interfaceC2217241BqE, C1765020w20<C11EC<C0LCS<A>>> c1765020w20, Function2<? super InterfaceC1166920gTK, ? super A, Unit> function2) {
        C1170060gYO.LIZLLL(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1765020w20<C11EF<A, B>> c1765020w20, InterfaceC1631620sYq<? super InterfaceC960503pD, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C11EA.LJFF(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, c1765020w20, interfaceC1631620sYq);
    }

    @Override // X.C11E9
    public final <S extends C004I, T> InterfaceC420801kM asyncSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends AbstractC1252750ihl<? extends T>> interfaceC2217241BqE, C1765020w20<C11EC<AbstractC1252750ihl<T>>> c1765020w20, Function2<? super InterfaceC960503pD, ? super Throwable, Unit> function2, Function1<? super InterfaceC960503pD, Unit> function1, Function2<? super InterfaceC960503pD, ? super T, Unit> function22) {
        return C11EA.LIZ(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2, function1, function22);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B, C> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1765020w20<C1634100scq<A, B, C>> c1765020w20, InterfaceC1631630sYr<? super InterfaceC960503pD, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C11EA.LJ(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1765020w20, interfaceC1631630sYr);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B, C, D> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1765020w20<C1644460stY<A, B, C, D>> c1765020w20, InterfaceC1685420txc<? super InterfaceC960503pD, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C11EA.LIZLLL(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1765020w20, interfaceC1685420txc);
    }
}
