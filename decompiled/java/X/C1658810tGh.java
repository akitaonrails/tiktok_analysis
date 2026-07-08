package X;

import Y.AObserverS227S0100000_25;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.tools.beauty.env.BeautyContext;
import com.ss.android.ugc.aweme.tools.beauty.impl.view.InternalBeautyPanel;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS604S0100000_25;
import kotlin.jvm.internal.AwS608S0100000_29;
import kotlin.jvm.internal.AwS639S0100000_25;
import ln3.a;

/* JADX INFO: renamed from: X.0tGh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1658810tGh extends Scene implements InterfaceC1166920gTK, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJ;
    public final C1DRG LLJI;
    public final C1664750tQH LLJIJIL;
    public final C1664750tQH LLJILJIL;
    public final C1664740tQG LLJILJILJ;
    public C1658720tGY LLJILLL;
    public Drawable LLJJ;
    public final C1658820tGi LLJJI;
    public final C01GW LLJJIII;
    public TextView LLJJIJI;
    public final C19733012Im LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public InterfaceC1658800tGg LLJJJ;
    public final AwS608S0100000_29 LLJJJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1658810tGh.class, "beautyApi", "getBeautyApi()Lcom/bytedance/creativex/recorder/beauty/api/BeautyApiComponent;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1658810tGh.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1658810tGh.class, "gestureApiComponent", "getGestureApiComponent()Lcom/bytedance/creativex/recorder/gesture/api/GestureApiComponent;", 0);
        c09r3.getClass();
        LLJJJJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
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

    public final a LLLII() {
        return (a) this.LLJIJIL.getValue(this, LLJJJJ[0]);
    }

    @Override // com.bytedance.scene.Scene
    public final void onDestroyView() {
        super.onDestroyView();
        InterfaceC524950KiL interfaceC524950KiLLIZ = C0MWZ.LIZ(this);
        if (interfaceC524950KiLLIZ != null) {
            interfaceC524950KiLLIZ.b8((InterfaceC362610EJn) this.LLJJIII.getValue());
        }
        ((InterfaceC1650190t2n) this.LLJILJIL.getValue(this, LLJJJJ[1])).Zl0(new C1663770tOh(true, false, false));
        InterfaceC1658800tGg interfaceC1658800tGg = this.LLJJJ;
        if (interfaceC1658800tGg != null) {
            interfaceC1658800tGg.hide();
        }
        this.LLJJJ = null;
        this.LLJJIJIIJIL.LIZ.St2().getEffectController().so();
        BeautyContext.INSTANCE.destroy();
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLJI;
    }

    @Override // com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        boolean z;
        InternalBeautyPanel internalBeautyPanelLIZ;
        super.onActivityCreated(bundle);
        BeautyContext beautyContext = BeautyContext.INSTANCE;
        C1658820tGi c1658820tGi = this.LLJJI;
        if (c1658820tGi.LJ && !c1658820tGi.LJII) {
            z = true;
        } else {
            z = false;
        }
        beautyContext.setSupportSeekClear(z);
        beautyContext.setToastImpl(new InterfaceC19734612Jc() { // from class: X.0tGj
            @Override // X.InterfaceC19734612Jc
            public final void LIZ(Context context, String str) {
                C21366318jV.LIZLLL.getClass();
                new C21366318jV(context, str, 0, 2).LIZ();
            }
        });
        beautyContext.setDmtToastImpl(new AwS639S0100000_25(this, 9));
        C12JZ c12jz = this.LLJJI.LIZJ;
        if (c12jz == null) {
            c12jz = new C12JZ() { // from class: X.0tGl
            };
        }
        beautyContext.setBeautyDialog(c12jz);
        ViewGroup viewGroup = (ViewGroup) this.mView.findViewById(R.id.sy_);
        InterfaceC1658800tGg interfaceC1658800tGg = this.LLJJJ;
        if (interfaceC1658800tGg == null) {
            InterfaceC1631620sYq<? super C12I9, ? super C1658890tGp, ? super Function1<? super C12J0, Unit>, ? extends InterfaceC1658840tGk> interfaceC1631620sYq = this.LLJJI.LJFF;
            if (interfaceC1631620sYq != null) {
                internalBeautyPanelLIZ = interfaceC1631620sYq.invoke(LLLII().je(), this.LLJJI.LIZIZ, this.LLJJJIL).LIZ(requireActivity(), viewGroup, (C12J7) this.LLJJIJIL.getValue(), beautyContext.enableQuickShootExperiment());
            } else {
                final C12I9 c12i9Je = LLLII().je();
                final C1658890tGp c1658890tGp = this.LLJJI.LIZIZ;
                final AwS608S0100000_29 awS608S0100000_29 = this.LLJJJIL;
                internalBeautyPanelLIZ = new InterfaceC1658840tGk(c12i9Je, c1658890tGp, awS608S0100000_29) { // from class: X.12Ij
                    public final C12I9 LIZ;
                    public final C1658890tGp LIZIZ;
                    public final C12J0 LIZJ;

                    {
                        this.LIZ = c12i9Je;
                        this.LIZIZ = c1658890tGp;
                        C12J0 c12j0 = new C12J0();
                        this.LIZJ = c12j0;
                        awS608S0100000_29.invoke(c12j0);
                    }

                    @Override // X.InterfaceC1658840tGk
                    public final InternalBeautyPanel LIZ(Context context, ViewGroup viewGroup2, C12J7 c12j7, boolean z2) {
                        C12J5 c12j5 = new C12J5(context, viewGroup2, this.LIZ);
                        c12j5.LJFF = this.LIZIZ;
                        C12J0 c12j0 = this.LIZJ;
                        c12j0.LIZ = z2;
                        c12j5.LIZLLL = c12j0;
                        c12j5.LJ = c12j7;
                        InternalBeautyPanel internalBeautyPanel = new InternalBeautyPanel(c12j5.LIZ, c12j5.LIZIZ, c12j5.LIZJ, c12j5.LIZLLL);
                        internalBeautyPanel.setContainer(viewGroup2);
                        C12J7 c12j72 = c12j5.LJ;
                        internalBeautyPanel.LLJJ = c12j72;
                        C12J9 c12j9 = internalBeautyPanel.LLILZIL;
                        C12JK c12jk = null;
                        if (c12j9 == null) {
                            c12j9 = null;
                        }
                        c12j9.LIZJ = c12j72;
                        C12IT c12it = internalBeautyPanel.LLJIJIL;
                        if (c12it == null) {
                            c12it = null;
                        }
                        c12it.LIZIZ = c12j72;
                        C12IS c12is = internalBeautyPanel.LLJ;
                        if (c12is == null) {
                            c12is = null;
                        }
                        c12is.LIZIZ = c12j72;
                        C12JK c12jk2 = internalBeautyPanel.LLJILJILJ;
                        if (c12jk2 != null) {
                            c12jk = c12jk2;
                        }
                        c12jk.LIZIZ = c12j72;
                        internalBeautyPanel.LLJJIII.LIZ = c12j5.LJFF;
                        return internalBeautyPanel;
                    }
                }.LIZ(requireActivity(), viewGroup, (C12J7) this.LLJJIJIL.getValue(), beautyContext.enableQuickShootExperiment());
            }
            this.LLJJJ = internalBeautyPanelLIZ;
        } else {
            interfaceC1658800tGg.setContainer(viewGroup);
        }
        this.LLJJI.LIZIZ.LJIIJJI();
        InterfaceC1658800tGg interfaceC1658800tGg2 = this.LLJJJ;
        if (interfaceC1658800tGg2 != null) {
            interfaceC1658800tGg2.show();
        }
        C19733012Im c19733012Im = this.LLJJIJIIJIL;
        c19733012Im.LIZIZ.je().Te().safeObserve(this, new AObserverS227S0100000_25(c19733012Im, 3));
        InterfaceC524950KiL interfaceC524950KiLLIZ = C0MWZ.LIZ(this);
        if (interfaceC524950KiLLIZ != null) {
            interfaceC524950KiLLIZ.kF((InterfaceC362610EJn) this.LLJJIII.getValue());
        }
    }

    public C1658810tGh(C1DRG c1drg, Function1<? super C1658820tGi, Unit> function1) {
        this.LLJI = c1drg;
        this.LLJIJIL = C1664770tQJ.LIZ(c1drg, a.class, null);
        C1664750tQH c1664750tQHLIZ = C1664770tQJ.LIZ(c1drg, InterfaceC1650230t2r.class, null);
        this.LLJILJIL = c1664750tQHLIZ;
        this.LLJILJILJ = C1664770tQJ.LIZIZ(c1drg, InterfaceC1648510t05.class, null);
        C1658820tGi c1658820tGi = new C1658820tGi(null);
        this.LLJJI = c1658820tGi;
        if (function1 != null) {
            function1.invoke(c1658820tGi);
        }
        this.LLJJIII = C452501pT.LIZIZ(new AwS569S0100000_25(this, 75));
        this.LLJJIJIIJIL = new C19733012Im((InterfaceC1650230t2r) c1664750tQHLIZ.getValue(this, LLJJJJ[1]), LLLII(), new AwS604S0100000_25(this, 58));
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 76));
        this.LLJJJIL = new AwS608S0100000_29(this, 38);
    }

    @Override // X.C11E9
    public final <VM1 extends JediViewModel<S1>, S1 extends C004I, R> R withState(VM1 vm1, Function1<? super S1, ? extends R> function1) {
        return function1.invoke(vm1.FQ2());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [X.12JH] */
    @Override // com.bytedance.scene.Scene
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.i90, viewGroup, false);
        this.LLJJIJI = (TextView) viewTd.findViewById(R.id.zbo);
        final C19733012Im c19733012Im = this.LLJJIJIIJIL;
        c19733012Im.LIZ.St2().getEffectController().Vn(new InterfaceC19735512Jl() { // from class: X.12JH
            @Override // X.InterfaceC19735512Jl
            public final void LIZ(C2178481ANq[] c2178481ANqArr) {
                boolean z;
                boolean z2;
                C19733012Im c19733012Im2 = c19733012Im;
                if (c2178481ANqArr != null) {
                    if (c2178481ANqArr.length == 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    z = !z2;
                } else {
                    z = false;
                }
                c19733012Im2.LJ = z;
                if (System.currentTimeMillis() - c19733012Im2.LJII >= 1000) {
                    c19733012Im2.LJII = System.currentTimeMillis();
                    C19733012Im c19733012Im3 = c19733012Im;
                    c19733012Im3.getClass();
                    C01TT.LIZLLL(new AwS573S0100000_29(c19733012Im3, 38));
                }
            }
        });
        return viewTd;
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
