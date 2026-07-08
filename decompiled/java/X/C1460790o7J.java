package X;

import Y.AObjectS245S0100000_22;
import Y.AObserverS225S0100000_22;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.ftc.components.sticker.core.FTCEditStickerState;
import com.ss.android.ugc.aweme.ftc.components.sticker.core.FTCEditStickerViewModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.vesdk.VESize;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS261S0000000_22;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS601S0100000_22;
import kotlin.jvm.internal.AwS636S0100000_22;

/* JADX INFO: renamed from: X.0o7J, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1460790o7J extends C19A3 implements InterfaceC1166920gTK, InterfaceC1444170ngV, InterfaceC1406950miT, InterfaceC379610EuV {
    public final C1DRG LLJILLL;
    public InterfaceC1461390o8H LLJJI;
    public C121O LLJJIII;
    public AnonymousClass1224 LLJJIJI;
    public FrameLayout LLJJJJ;
    public boolean LLJJJJJIL;
    public InterfaceC384890F7f LLJJJJLIIL;
    public InterfaceC1457400o1q LLJJLIIIJLLLLLLLZ;
    public boolean LLJLIL;
    public boolean LLJLILLLLZIIL;
    public final C01GW LLJJ = C1449630npJ.LIZ(this, InterfaceC1455860nzM.class);
    public final C01GW LLJJIJIIJIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 814));
    public final C01GW LLJJIJIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 812));
    public final C01GW LLJJJ = C452501pT.LIZIZ(new AwS566S0100000_22(this, 813));
    public final C01GW LLJJJIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 815));
    public final C01GW LLJJL = C1449630npJ.LIZ(this, InterfaceC1460770o7H.class);
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 816));

    @Override // X.InterfaceC1406950miT
    public final void Bl() {
    }

    @Override // X.InterfaceC1406950miT
    public final void L0(Effect effect, String str) {
    }

    @Override // X.InterfaceC1444170ngV
    public final void LJJJJLL() {
    }

    @Override // X.InterfaceC1444170ngV
    public final void LJLI() {
    }

    @Override // X.InterfaceC1444170ngV
    public final void LLIIIJ() {
    }

    @Override // X.InterfaceC1406950miT
    public final void Ph(Effect effect, String str) {
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

    @Override // X.InterfaceC1444170ngV
    public final boolean C1() {
        InterfaceC1457400o1q interfaceC1457400o1q = this.LLJJLIIIJLLLLLLLZ;
        return interfaceC1457400o1q != null && interfaceC1457400o1q.LJLL();
    }

    @Override // X.InterfaceC1444170ngV
    public final List<TextStickerData> LJJL() {
        List<C196925122x> listLLLLLLZZ;
        InterfaceC1457400o1q interfaceC1457400o1q = this.LLJJLIIIJLLLLLLLZ;
        if (interfaceC1457400o1q == null || (listLLLLLLZZ = interfaceC1457400o1q.LLLLLLZZ()) == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLLLLLLZZ, 10));
        Iterator<C196925122x> it2 = listLLLLLLZZ.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().LJIIJ());
        }
        return arrayList;
    }

    @Override // X.InterfaceC1444170ngV
    public final boolean LLIIIZ() {
        List<C196925122x> listLLLLLLZZ;
        InterfaceC1457400o1q interfaceC1457400o1q = this.LLJJLIIIJLLLLLLLZ;
        if (interfaceC1457400o1q == null || (listLLLLLLZZ = interfaceC1457400o1q.LLLLLLZZ()) == null || listLLLLLLZZ.isEmpty()) {
            return false;
        }
        Iterator<C196925122x> it2 = listLLLLLLZZ.iterator();
        while (it2.hasNext()) {
            TextStickerData data = it2.next().getData();
            if (data != null && data.getHasReadTextAudio()) {
                return true;
            }
        }
        return false;
    }

    public final InterfaceC1455860nzM LLLLIIIILLL() {
        return (InterfaceC1455860nzM) this.LLJJ.getValue();
    }

    public final InterfaceC1460770o7H LLLLIILL() {
        return (InterfaceC1460770o7H) this.LLJJL.getValue();
    }

    public final VideoPublishEditModel LLLLIL() {
        return (VideoPublishEditModel) this.LLJJIJIIJIL.getValue();
    }

    public final FTCEditStickerViewModel LLLLILI() {
        return (FTCEditStickerViewModel) this.LLJJJIL.getValue();
    }

    public final void LLLLJI() {
        if (this.LLJLIL) {
            return;
        }
        this.LLJLIL = true;
        LLLLIILL().show();
        LLLLIIIILLL().MW1().observe(this, new AObserverS225S0100000_22(this, 145));
    }

    @Override // X.InterfaceC1406950miT
    public final void Ho() {
        C1456140nzo.LIZIZ(LLLLIIIILLL(), false, false, false, false, 12);
    }

    @Override // X.InterfaceC1444170ngV
    public final void LJJIIZ() {
        LLLLIILL().Nm();
    }

    public final void LLLLL() {
        VESize initSize;
        InterfaceC1452170ntP value = LLLLIIIILLL().g().getValue();
        Pair<Integer, Integer> pair = (value == null || (initSize = value.getInitSize()) == null) ? null : new Pair<>(Integer.valueOf(initSize.width), Integer.valueOf(initSize.height));
        InterfaceC1457400o1q interfaceC1457400o1q = this.LLJJLIIIJLLLLLLLZ;
        if (interfaceC1457400o1q != null) {
            interfaceC1457400o1q.b(pair);
        }
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return C1664600tQ2.LJIIIZ(this);
    }

    @Override // com.bytedance.scene.Scene
    public final void onResume() {
        super.onResume();
        InterfaceC1457400o1q interfaceC1457400o1q = this.LLJJLIIIJLLLLLLLZ;
        if (interfaceC1457400o1q != null) {
            interfaceC1457400o1q.Md();
        }
        this.LLJJJJJIL = false;
    }

    public C1460790o7J(C1DRG c1drg) {
        this.LLJILLL = c1drg;
    }

    @Override // X.InterfaceC1444170ngV
    public final void LJJJJIZL(C1453040nuo c1453040nuo) {
        InterfaceC1457400o1q interfaceC1457400o1q = this.LLJJLIIIJLLLLLLLZ;
        if (interfaceC1457400o1q != null) {
            interfaceC1457400o1q.i();
        }
    }

    @Override // com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        C560530Lyd<Boolean> c560530LydC2;
        C560530Lyd<Pair<Boolean, Boolean>> c560530LydU2;
        C560530Lyd<Unit> c560530LydH1;
        super.onActivityCreated(bundle);
        C1654320t9S.LIZIZ(this, AFwS261S0000000_22.get$arr$(253));
        C1664590tQ1.LIZLLL(this, null, false, new AwS601S0100000_22(this, 628), 3);
        C1664600tQ2.LIZ(this, null, new AwS601S0100000_22(this, 629));
        this.LLJJLIIIJLLLLLLLZ = (InterfaceC1457400o1q) C1664600tQ2.LJIIIZ(this).LJII(InterfaceC1457400o1q.class, null);
        LLLLILI().zP1().observe(this, new AObserverS225S0100000_22(this, 147));
        LLLLILI().CQ0().observe(this, new AObserverS225S0100000_22(this, 149));
        LLLLILI().fz0().observe(this, new AObserverS225S0100000_22(this, 150));
        subscribeEvent(LLLLILI(), new C2217381BqS() { // from class: X.0o7V
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((FTCEditStickerState) obj).getPollTextAnimEvent();
            }
        }, new C1765020w20(), new AwS636S0100000_22(this, 37));
        subscribeEvent(LLLLILI(), new C2217381BqS() { // from class: X.0o7W
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((FTCEditStickerState) obj).getPollTextLayoutEvent();
            }
        }, new C1765020w20(), new AwS636S0100000_22(this, 38));
        selectNonNullSubscribe(LLLLILI(), new C2217381BqS() { // from class: X.0o7X
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((FTCEditStickerState) obj).getViewRenderStickerVisibleEvent();
            }
        }, new C1765020w20(), new AwS636S0100000_22(this, 39));
        selectNonNullSubscribe(LLLLILI(), new C2217381BqS() { // from class: X.0o7S
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((FTCEditStickerState) obj).getVideoLengthUpdateEvent();
            }
        }, new C1765020w20(), new AwS636S0100000_22(this, 34));
        selectNonNullSubscribe(LLLLILI(), new C2217381BqS() { // from class: X.0o7T
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((FTCEditStickerState) obj).getRefreshVideoSource();
            }
        }, new C1765020w20(), new AwS636S0100000_22(this, 35));
        selectNonNullSubscribe(LLLLILI(), new C2217381BqS() { // from class: X.0o7U
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((FTCEditStickerState) obj).getUpdateStickerTime();
            }
        }, new C1765020w20(), new AwS636S0100000_22(this, 36));
        InterfaceC1457400o1q interfaceC1457400o1q = this.LLJJLIIIJLLLLLLLZ;
        if (interfaceC1457400o1q != null && (c560530LydH1 = interfaceC1457400o1q.H1()) != null) {
            c560530LydH1.LIZ(this, new AObjectS245S0100000_22(this, 263));
        }
        LLLLILI().rb().observe(this, new AObserverS225S0100000_22(this, 146));
        InterfaceC1457400o1q interfaceC1457400o1q2 = this.LLJJLIIIJLLLLLLLZ;
        if (interfaceC1457400o1q2 != null) {
            interfaceC1457400o1q2.Z3(LLLLILI().rb());
        }
        InterfaceC1457400o1q interfaceC1457400o1q3 = this.LLJJLIIIJLLLLLLLZ;
        if (interfaceC1457400o1q3 != null && (c560530LydU2 = interfaceC1457400o1q3.u2()) != null) {
            c560530LydU2.LIZ(this, new AObjectS245S0100000_22(this, 264));
        }
        InterfaceC1457400o1q interfaceC1457400o1q4 = this.LLJJLIIIJLLLLLLLZ;
        if (interfaceC1457400o1q4 != null && (c560530LydC2 = interfaceC1457400o1q4.c2()) != null) {
            c560530LydC2.LIZ(this, new AObjectS245S0100000_22(this, 265));
        }
        LLLLIIIILLL().MW1().observe(this, new AObserverS225S0100000_22(this, 148));
        if (this.LLJJIJI == null) {
            AnonymousClass1224 anonymousClass1224 = new AnonymousClass1224();
            this.LLJJIJI = anonymousClass1224;
            add(R.id.tv_sticker_hint_container, anonymousClass1224, "StickerHintTextScene");
        }
    }

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.LLJJJJ = (FrameLayout) requireViewById(R.id.xqt);
    }

    @Override // X.C11E9
    public final <VM1 extends JediViewModel<S1>, S1 extends C004I, R> R withState(VM1 vm1, Function1<? super S1, ? extends R> function1) {
        return function1.invoke(vm1.FQ2());
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C15O7<kotlin.Unit> LLLLJ(X.InterfaceC1452170ntP r9, X.InterfaceC384890F7f r10, kotlin.jvm.functions.Function2<? super java.lang.String, ? super X.EnumC20228214Cy, java.lang.String> r11) {
        /*
            r8 = this;
            X.0o1q r0 = r8.LLJJLIIIJLLLLLLLZ
            if (r0 == 0) goto L72
            boolean r1 = r0.LJLL()
            r0 = 1
            if (r1 != r0) goto L72
            if (r11 == 0) goto L19
            java.lang.String r1 = "text_sticker"
            X.14Cy r0 = X.EnumC20228214Cy.TEXT_STICKER
            java.lang.Object r3 = r11.invoke(r1, r0)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 != 0) goto L2f
        L19:
            X.1Ds4 r0 = X.C0CHQ.LIZ()
            X.0Moe r0 = r0.LJJIIJZLJL()
            X.0o7a r2 = r0.getPathAdapter()
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r1 = r8.LLLLIL()
            java.lang.String r0 = ""
            java.lang.String r3 = r2.LJIJ(r1, r0)
        L2f:
            X.0ngR r0 = r10.LLJIJIL()
            int r4 = r0.LJFF()
            X.0ngR r0 = r10.LLJIJIL()
            int r5 = r0.LIZJ()
            com.ss.android.vesdk.VESize r0 = r9.getInitSize()
            int r6 = r0.width
            com.ss.android.vesdk.VESize r0 = r9.getInitSize()
            int r7 = r0.height
            X.0o1q r1 = r8.LLJJLIIIJLLLLLLLZ
            if (r1 == 0) goto L5f
            X.123e r2 = new X.123e
            r2.<init>(r3, r4, r5, r6, r7)
            android.widget.FrameLayout r0 = r8.LLJJJJ
            if (r0 != 0) goto L59
            r0 = 0
        L59:
            X.15O7 r2 = r1.jT1(r2, r0)
            if (r2 != 0) goto L65
        L5f:
            X.05XF<V> r0 = new java.util.concurrent.Callable() { // from class: X.05XF
                static {
                    /*
                        X.05XF r0 = new X.05XF
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:X.05XF<V>) X.05XF.LL X.05XF
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C05XF.<clinit>():void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C05XF.<init>():void");
                }

                @Override // java.util.concurrent.Callable
                public final java.lang.Object call() {
                    /*
                        r2 = this;
                        java.lang.String r1 = "FTCEditStickerScene@9f08.compileText$1"
                        X.C1C7U.LIZ(r1)
                        X.13BV r0 = X.C13BV.INSTANCE
                        X.C1C7U.LIZIZ(r1)
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C05XF.call():java.lang.Object");
                }
            }
            X.15O7 r2 = X.C15O7.LIZ(r0)
        L65:
            X.0FXB r1 = new X.0FXB
            r0 = 1
            r1.<init>(r9, r10, r0)
            X.08kh r0 = X.C15O7.LJIIIIZZ
            X.15O7 r0 = r2.LJIIZILJ(r1, r0)
            return r0
        L72:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.15O7 r0 = X.C15O7.LJIIJ(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1460790o7J.LLLLJ(X.0ntP, X.0F7f, kotlin.jvm.functions.Function2):X.15O7");
    }

    @Override // X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.eq1, viewGroup, false);
    }

    @Override // X.C11E9
    public final <S extends C004I> InterfaceC420801kM subscribe(JediViewModel<S> jediViewModel, C1765020w20<S> c1765020w20, Function2<? super InterfaceC960503pD, ? super S, Unit> function2) {
        return C11EA.LJIIJJI(this, jediViewModel, c1765020w20, function2);
    }

    @Override // X.C19A3, com.bytedance.scene.Scene
    public final /* bridge */ /* synthetic */ View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return onCreateView(layoutInflater, viewGroup, bundle);
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
