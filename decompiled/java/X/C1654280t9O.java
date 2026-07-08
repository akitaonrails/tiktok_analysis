package X;

import Y.AObjectS246S0100000_25;
import Y.ARunnableS125S0100000_25;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.scene.Scene;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS569S0100000_25;

/* JADX INFO: renamed from: X.0t9O, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1654280t9O extends Scene implements InterfaceC1166920gTK {
    public final C1652440t6Q LLJI;
    public final C385670FAf<Boolean> LLJIJIL;
    public C1654290t9P LLJILJILJ;
    public C0P0T LLJILLL;
    public ShortVideoContextViewModel LLJJ;
    public TuxIconView LLJJI;
    public TextView LLJJIII;
    public RelativeLayout LLJJIJI;
    public final boolean LLJILJIL = true;
    public final C01GW LLJJIJIIJIL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 159));

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

    /* JADX WARN: Removed duplicated region for block: B:22:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLII(boolean r5) {
        /*
            r4 = this;
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel r1 = r4.LLJJ
            r3 = 0
            if (r1 != 0) goto L2e
            r0 = r3
        L6:
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r0.LL
            boolean r0 = r0.isPhotoMvMode
            r2 = 0
            if (r0 == 0) goto L2c
            if (r1 != 0) goto L10
            r1 = r3
        L10:
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r1.LL
            boolean r0 = r0.mIsFromDraft
            if (r0 == 0) goto L2c
            r0 = 1
        L17:
            r1 = 8
            if (r0 == 0) goto L30
            com.bytedance.tux.icon.TuxIconView r0 = r4.LLJJI
            if (r0 != 0) goto L20
            r0 = r3
        L20:
            X.C786410Ut5.LLLLLLZZ(r0, r1)
            android.widget.TextView r0 = r4.LLJJIII
            if (r0 == 0) goto L28
            r3 = r0
        L28:
            X.C786410Ut5.LLIL(r3, r1)
            return
        L2c:
            r0 = 0
            goto L17
        L2e:
            r0 = r1
            goto L6
        L30:
            if (r5 == 0) goto L51
            boolean r0 = r4.LLJILJIL
            if (r0 == 0) goto L51
            android.widget.TextView r0 = r4.LLJJIII
            if (r0 == 0) goto L3b
            r3 = r0
        L3b:
            X.C786410Ut5.LLIL(r3, r2)
            X.01GW r0 = r4.LLJJIJIIJIL
            java.lang.Object r2 = r0.getValue()
            android.os.Handler r2 = (android.os.Handler) r2
            Y.ARunnableS125S0100000_25 r1 = new Y.ARunnableS125S0100000_25
            r0 = 13
            r1.<init>(r4, r0)
            r2.post(r1)
            return
        L51:
            android.widget.TextView r0 = r4.LLJJIII
            if (r0 == 0) goto L56
            r3 = r0
        L56:
            X.C786410Ut5.LLIL(r3, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1654280t9O.LLLII(boolean):void");
    }

    public C1654280t9O(C1652440t6Q c1652440t6Q, C385670FAf<Boolean> c385670FAf) {
        this.LLJI = c1652440t6Q;
        this.LLJIJIL = c385670FAf;
    }

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.LLJJIJI = (RelativeLayout) requireViewById(R.id.top);
        this.LLJJI = (TuxIconView) requireViewById(R.id.lbm);
        this.LLJJIII = (TextView) requireViewById(R.id.zdk);
        ((Handler) this.LLJJIJIIJIL.getValue()).post(new ARunnableS125S0100000_25(this, 12));
        ShortVideoContextViewModel shortVideoContextViewModel = null;
        Typeface typefaceLIZIZ = C1697580uHE.LIZIZ(0.0f, 500, 17.0f, 0.0f, Float.valueOf(16.0f), 0.0f, 0, null, 224);
        ShortVideoContextViewModel shortVideoContextViewModel2 = null;
        if (typefaceLIZIZ != null) {
            TextView textView = this.LLJJIII;
            if (textView == null) {
                textView = null;
            }
            textView.setTypeface(typefaceLIZIZ);
        }
        this.LLJJ = (ShortVideoContextViewModel) ViewModelProviders.of((C19EG) this.mActivity).get(ShortVideoContextViewModel.class);
        this.LLJIJIL.LIZ(this, new AObjectS246S0100000_25(this, 64));
        this.LLJI.LJII.LIZ(this, new AObjectS246S0100000_25(this, 65));
        this.LLJI.LJIIIIZZ.LIZ(this, new AObjectS246S0100000_25(this, 66));
        this.LLJI.LJFF.LIZ(this, new AObjectS246S0100000_25(this, 67));
        this.LLJI.LJI.LIZ(this, new AObjectS246S0100000_25(this, 68));
        this.LLJI.LJ.LIZ(this, new AObjectS246S0100000_25(this, 69));
        this.LLJI.LIZIZ.LIZ(this, new AObjectS246S0100000_25(this, 70));
        this.LLJI.LIZJ.LIZ(this, new AObjectS246S0100000_25(this, 62));
        this.LLJI.LJIIIZ.LIZ(this, new AObjectS246S0100000_25(this, 63));
        ShortVideoContextViewModel shortVideoContextViewModel3 = this.LLJJ;
        if (shortVideoContextViewModel3 != null) {
            shortVideoContextViewModel = shortVideoContextViewModel3;
        }
        if (shortVideoContextViewModel.LL.isPhotoMvMode) {
            if (shortVideoContextViewModel3 != null) {
                shortVideoContextViewModel2 = shortVideoContextViewModel3;
            }
            if (shortVideoContextViewModel2.LL.mIsFromDraft) {
                LLLII(false);
            }
        }
    }

    @Override // X.C11E9
    public final <VM1 extends JediViewModel<S1>, S1 extends C004I, R> R withState(VM1 vm1, Function1<? super S1, ? extends R> function1) {
        return function1.invoke(vm1.FQ2());
    }

    @Override // com.bytedance.scene.Scene
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.ccc, viewGroup, false);
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
