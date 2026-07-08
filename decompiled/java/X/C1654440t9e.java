package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.scene.Scene;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import mn3.e0;
import pyl.s;

/* JADX INFO: renamed from: X.0t9e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1654440t9e extends Scene implements InterfaceC1166920gTK {
    public final InterfaceC1652730t6t LLJI;
    public final C560530Lyd<C1644460stY<Integer, Integer, Integer, Integer>> LLJIJIL;
    public final C560530Lyd<Pair<Integer, Integer>> LLJILJIL;
    public final C1652680t6o LLJILJILJ;
    public final Map<Integer, Integer> LLJILLL = C2097608Jq.LJIIIIZZ(new Pair(4, 2131858068), new Pair(3, 2131848342), new Pair(2, 2131848764), new Pair(1, 2131834424), new Pair(0, 2131858066));
    public e0 LLJJ;

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

    public final int LLLIIIIL() {
        e0 e0Var = this.LLJJ;
        if (e0Var == null) {
            e0Var = null;
        }
        int i = C1654450t9f.LIZ[e0Var.getSpeed().ordinal()];
        if (i == 1) {
            return 4;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 3) {
            return 2;
        }
        if (i != 4) {
            return i != 5 ? -1 : 0;
        }
        return 1;
    }

    public static final s LLLIILIL(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return s.NORMAL;
                        }
                        return s.EPIC;
                    }
                    return s.SLOW;
                }
                return s.NORMAL;
            }
            return s.FAST;
        }
        return s.LAPSE;
    }

    public final void LLLII(int i) {
        int iLLLIIIIL = LLLIIIIL() + i;
        if (iLLLIIIIL > this.LLJILLL.size() - 1) {
            iLLLIIIIL = this.LLJILLL.size() - 1;
        }
        if (iLLLIIIIL < 0) {
            iLLLIIIIL = 0;
        }
        LLLIL(iLLLIIIIL);
    }

    public final void LLLIL(int i) {
        C1654510t9l c1654510t9l;
        if (i == LLLIIIIL()) {
            return;
        }
        View view = this.mView;
        e0 e0Var = null;
        if ((view instanceof C1654510t9l) && (c1654510t9l = (C1654510t9l) view) != null) {
            c1654510t9l.LJIIIIZZ(i);
        }
        e0 e0Var2 = this.LLJJ;
        if (e0Var2 != null) {
            e0Var = e0Var2;
        }
        e0Var.NF(LLLIILIL(i));
        this.LLJI.LIZIZ(LLLIILIL(i));
        new C1351210lGZ(requireSceneContext()).LIZIZ(12, 120);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x009a  */
    @Override // com.bytedance.scene.Scene
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onActivityCreated(android.os.Bundle r11) {
        /*
            r10 = this;
            super.onActivityCreated(r11)
            android.app.Activity r0 = r10.mActivity
            com.ss.android.ugc.aweme.ftc.FTCVideoRecordNewActivity r0 = (com.ss.android.ugc.aweme.ftc.FTCVideoRecordNewActivity) r0
            mn3.e0 r0 = r0.LLJZ
            r10.LLJJ = r0
            X.0t6o r1 = r10.LLJILJILJ
            android.view.View r0 = r1.LIZ
            if (r0 == 0) goto La0
            android.view.View r3 = r10.mView
            boolean r0 = r3 instanceof X.C1654510t9l
            if (r0 == 0) goto La0
            X.0t9l r3 = (X.C1654510t9l) r3
            if (r3 == 0) goto La0
            r3.LJI(r1)
            java.util.Map<java.lang.Integer, java.lang.Integer> r0 = r10.LLJILLL
            java.util.Set r0 = r0.keySet()
            java.util.List r0 = X.C13LP.LJLLJ(r0)
            java.util.Iterator r2 = r0.iterator()
        L2c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto La0
            java.lang.Object r0 = r2.next()
            java.lang.Number r0 = (java.lang.Number) r0
            int r7 = r0.intValue()
            java.util.Map<java.lang.Integer, java.lang.Integer> r1 = r10.LLJILLL
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            java.lang.Object r0 = r1.get(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            java.lang.String r4 = r10.getString(r0)
            int r0 = r10.LLLIIIIL()
            r1 = 1
            if (r7 != r0) goto L9e
            r8 = 1
        L58:
            if (r7 != 0) goto L76
            if (r8 == 0) goto L72
            r5 = 2130969540(0x7f0403c4, float:1.7547765E38)
        L5f:
            if (r8 == 0) goto L6e
            r6 = 2131230825(0x7f080069, float:1.8077714E38)
        L64:
            kotlin.jvm.internal.AwS163S0101000_25 r9 = new kotlin.jvm.internal.AwS163S0101000_25
            r0 = 2
            r9.<init>(r7, r10, r0)
            r3.LIZ(r4, r5, r6, r7, r8, r9)
            goto L2c
        L6e:
            r6 = 2131232150(0x7f080596, float:1.8080401E38)
            goto L64
        L72:
            r5 = 2130969541(0x7f0403c5, float:1.7547767E38)
            goto L5f
        L76:
            java.util.Map<java.lang.Integer, java.lang.Integer> r0 = r10.LLJILLL
            int r0 = r0.size()
            int r0 = r0 - r1
            if (r7 != r0) goto L85
            if (r8 == 0) goto L85
            r5 = 2130969536(0x7f0403c0, float:1.7547757E38)
            goto L5f
        L85:
            java.util.Map<java.lang.Integer, java.lang.Integer> r0 = r10.LLJILLL
            int r0 = r0.size()
            int r0 = r0 - r1
            if (r7 != r0) goto L94
            if (r8 != 0) goto L9a
            r5 = 2130969537(0x7f0403c1, float:1.7547759E38)
            goto L5f
        L94:
            if (r8 != 0) goto L9a
            r5 = 2130969539(0x7f0403c3, float:1.7547763E38)
            goto L5f
        L9a:
            r5 = 2130969538(0x7f0403c2, float:1.754776E38)
            goto L5f
        L9e:
            r8 = 0
            goto L58
        La0:
            X.0Lyd<X.0stY<java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer>> r2 = r10.LLJIJIL
            Y.AObjectS246S0100000_25 r1 = new Y.AObjectS246S0100000_25
            r0 = 109(0x6d, float:1.53E-43)
            r1.<init>(r10, r0)
            r2.LIZ(r10, r1)
            X.0Lyd<kotlin.Pair<java.lang.Integer, java.lang.Integer>> r2 = r10.LLJILJIL
            Y.AObjectS246S0100000_25 r1 = new Y.AObjectS246S0100000_25
            r0 = 110(0x6e, float:1.54E-43)
            r1.<init>(r10, r0)
            r2.LIZ(r10, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1654440t9e.onActivityCreated(android.os.Bundle):void");
    }

    @Override // X.C11E9
    public final <VM1 extends JediViewModel<S1>, S1 extends C004I, R> R withState(VM1 vm1, Function1<? super S1, ? extends R> function1) {
        return function1.invoke(vm1.FQ2());
    }

    @Override // com.bytedance.scene.Scene
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.i9f, viewGroup, false);
    }

    @Override // X.C11E9
    public final <S extends C004I> InterfaceC420801kM subscribe(JediViewModel<S> jediViewModel, C1765020w20<S> c1765020w20, Function2<? super InterfaceC960503pD, ? super S, Unit> function2) {
        return C11EA.LJIIJJI(this, jediViewModel, c1765020w20, function2);
    }

    public C1654440t9e(InterfaceC1652730t6t interfaceC1652730t6t, C560530Lyd c560530Lyd, C560530Lyd c560530Lyd2, C1652680t6o c1652680t6o) {
        this.LLJI = interfaceC1652730t6t;
        this.LLJIJIL = c560530Lyd;
        this.LLJILJIL = c560530Lyd2;
        this.LLJILJILJ = c1652680t6o;
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
