package X;

import Y.ACListenerS153S0100000_18;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.scene.Scene;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS569S0100000_25;

/* JADX INFO: renamed from: X.0gTW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1167040gTW extends Scene implements InterfaceC1166920gTK {
    public final boolean LLJI;
    public final InterfaceC1650230t2r LLJIJIL;
    public final Function0<Unit> LLJILJIL;
    public View LLJILJILJ;
    public ImageView LLJILLL;
    public TextView LLJJ;
    public C197039127h LLJJI;

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

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        String strLIZ;
        super.onViewCreated(view, bundle);
        this.LLJILLL = (ImageView) findViewById(R.id.gv3);
        this.LLJJ = (TextView) findViewById(R.id.qf2);
        this.LLJJI = (C197039127h) findViewById(R.id.yld);
        this.LLJILJILJ = findViewById(R.id.ts1);
        final ImageView imageView = this.LLJILLL;
        if (imageView != null) {
            imageView.setBackgroundColor(-12303292);
            final LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
            this.LLJIJIL.xF1().LIZ(this, new InterfaceC1441305kZ() { // from class: X.0gTX
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    InterfaceC1650230t2r interfaceC1650230t2r = this.LL.LLJIJIL;
                    int width = imageView.getWidth();
                    int height = imageView.getHeight();
                    final LifecycleCoroutineScope lifecycleCoroutineScope = lifecycleScope;
                    final ImageView imageView2 = imageView;
                    interfaceC1650230t2r.qf0(width, height, false, false, new InterfaceC2173471A4j() { // from class: X.05nW
                        @Override // X.InterfaceC2173471A4j
                        public final void LIZ(int i, Bitmap bitmap) {
                            if (i == 0 && bitmap != null) {
                                C23250099c.LIZLLL(lifecycleCoroutineScope, null, null, new C1459405nU(imageView2, bitmap, null), 3);
                            }
                        }
                    }, false);
                }
            });
            C786410Ut5.Q7(imageView, new View.OnClickListener() { // from class: X.0gTY
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                }
            });
        }
        TextView textView = this.LLJJ;
        int i = 2131831693;
        if (textView != null) {
            Object[] objArr = new Object[1];
            if (this.LLJI) {
                strLIZ = C0MTD.LIZ(2131831693);
            } else {
                strLIZ = C0MTD.LIZ(2131831694);
            }
            objArr[0] = strLIZ;
            textView.setText(getString(2131831791, objArr));
        }
        C197039127h c197039127h = this.LLJJI;
        if (c197039127h != null) {
            Object[] objArr2 = new Object[1];
            if (!this.LLJI) {
                i = 2131831694;
            }
            objArr2[0] = Integer.valueOf(i);
            c197039127h.setText(getString(2131831793, objArr2));
            C786410Ut5.U8(c197039127h, new ACListenerS153S0100000_18(this, 127));
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(C1383370m6R.LJFF(R.attr.zi));
            gradientDrawable.setCornerRadius(C418440Gaw.LIZIZ(200));
            c197039127h.setBackground(gradientDrawable);
        }
        View view2 = this.LLJILJILJ;
        if (view2 != null) {
            C1461700o8m.LIZIZ(view2);
        }
    }

    @Override // X.C11E9
    public final <VM1 extends JediViewModel<S1>, S1 extends C004I, R> R withState(VM1 vm1, Function1<? super S1, ? extends R> function1) {
        return function1.invoke(vm1.FQ2());
    }

    public C1167040gTW(boolean z, InterfaceC1650230t2r interfaceC1650230t2r, AwS569S0100000_25 awS569S0100000_25) {
        this.LLJI = z;
        this.LLJIJIL = interfaceC1650230t2r;
        this.LLJILJIL = awS569S0100000_25;
    }

    @Override // com.bytedance.scene.Scene
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.i8w, viewGroup, false);
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
