package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.als.h0;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.scene.Scene;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import pyl.s;

/* JADX INFO: renamed from: X.0t9k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1654500t9k extends Scene implements InterfaceC1166920gTK {
    public static final /* synthetic */ int LLJJI = 0;
    public final InterfaceC1654560t9q LLJI;
    public final C385670FAf<s> LLJIJIL;
    public final C560530Lyd<C1644460stY<Integer, Integer, Integer, Integer>> LLJILJIL;
    public final C560530Lyd<Pair<Integer, Integer>> LLJILJILJ;
    public final C1652680t6o LLJILLL;
    public final Map<Integer, Integer> LLJJ = C2097608Jq.LJIIIIZZ(new Pair(4, 2131858068), new Pair(3, 2131848342), new Pair(2, 2131848764), new Pair(1, 2131834424), new Pair(0, 2131858066));

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

    public static int LLLIIIIL(s sVar) {
        int i = C1654490t9j.LIZ[sVar.ordinal()];
        if (i == 1) {
            return 4;
        }
        if (i != 2) {
            if (i != 3) {
                if (i != 4) {
                    if (i != 5) {
                        return -1;
                    }
                    return 0;
                }
                return 1;
            }
            return 2;
        }
        return 3;
    }

    public final void LLLII(int i) {
        s sVarLIZJ = this.LLJIJIL.LIZJ();
        getClass();
        int iLLLIIIIL = LLLIIIIL(sVarLIZJ) + i;
        if (iLLLIIIIL > this.LLJJ.size() - 1) {
            iLLLIIIIL = this.LLJJ.size() - 1;
        }
        if (iLLLIIIIL < 0) {
            iLLLIIIIL = 0;
        }
        LLLIL(iLLLIIIIL);
    }

    public final void LLLIL(int i) {
        s sVar;
        s sVarLIZJ = this.LLJIJIL.LIZJ();
        getClass();
        if (i == LLLIIIIL(sVarLIZJ)) {
            return;
        }
        InterfaceC1654560t9q interfaceC1654560t9q = this.LLJI;
        if (i == 4) {
            sVar = s.EPIC;
        } else if (i == 3) {
            sVar = s.SLOW;
        } else if (i == 2) {
            sVar = s.NORMAL;
        } else if (i == 1) {
            sVar = s.FAST;
        } else if (i == 0) {
            sVar = s.LAPSE;
        } else {
            sVar = s.NORMAL;
        }
        interfaceC1654560t9q.LIZIZ(sVar);
        new C1351210lGZ(requireSceneContext()).LIZIZ(12, 120);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x009d  */
    @Override // com.bytedance.scene.Scene
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onActivityCreated(android.os.Bundle r11) {
        /*
            r10 = this;
            super.onActivityCreated(r11)
            X.0t6o r1 = r10.LLJILLL
            android.view.View r0 = r1.LIZ
            if (r0 == 0) goto La3
            android.view.View r3 = r10.mView
            boolean r0 = r3 instanceof X.C1654510t9l
            if (r0 == 0) goto La3
            X.0t9l r3 = (X.C1654510t9l) r3
            if (r3 == 0) goto La3
            r3.LJI(r1)
            java.util.Map<java.lang.Integer, java.lang.Integer> r0 = r10.LLJJ
            java.util.Set r0 = r0.keySet()
            java.util.List r0 = X.C13LP.LJLLJ(r0)
            java.util.Iterator r2 = r0.iterator()
        L24:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto La3
            java.lang.Object r0 = r2.next()
            java.lang.Number r0 = (java.lang.Number) r0
            int r7 = r0.intValue()
            java.util.Map<java.lang.Integer, java.lang.Integer> r1 = r10.LLJJ
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            java.lang.Object r0 = r1.get(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            java.lang.String r4 = r10.getString(r0)
            X.0FAf<pyl.s> r0 = r10.LLJIJIL
            java.lang.Object r0 = r0.LIZJ()
            pyl.s r0 = (pyl.s) r0
            r10.getClass()
            int r0 = LLLIIIIL(r0)
            r1 = 1
            if (r7 != r0) goto La1
            r8 = 1
        L5b:
            if (r7 != 0) goto L79
            if (r8 == 0) goto L75
            r5 = 2130969540(0x7f0403c4, float:1.7547765E38)
        L62:
            if (r8 == 0) goto L71
            r6 = 2131230825(0x7f080069, float:1.8077714E38)
        L67:
            kotlin.jvm.internal.AwS163S0101000_25 r9 = new kotlin.jvm.internal.AwS163S0101000_25
            r0 = 5
            r9.<init>(r7, r10, r0)
            r3.LIZ(r4, r5, r6, r7, r8, r9)
            goto L24
        L71:
            r6 = 2131232150(0x7f080596, float:1.8080401E38)
            goto L67
        L75:
            r5 = 2130969541(0x7f0403c5, float:1.7547767E38)
            goto L62
        L79:
            java.util.Map<java.lang.Integer, java.lang.Integer> r0 = r10.LLJJ
            int r0 = r0.size()
            int r0 = r0 - r1
            if (r7 != r0) goto L88
            if (r8 == 0) goto L88
            r5 = 2130969536(0x7f0403c0, float:1.7547757E38)
            goto L62
        L88:
            java.util.Map<java.lang.Integer, java.lang.Integer> r0 = r10.LLJJ
            int r0 = r0.size()
            int r0 = r0 - r1
            if (r7 != r0) goto L97
            if (r8 != 0) goto L9d
            r5 = 2130969537(0x7f0403c1, float:1.7547759E38)
            goto L62
        L97:
            if (r8 != 0) goto L9d
            r5 = 2130969539(0x7f0403c3, float:1.7547763E38)
            goto L62
        L9d:
            r5 = 2130969538(0x7f0403c2, float:1.754776E38)
            goto L62
        La1:
            r8 = 0
            goto L5b
        La3:
            X.0Lyd<X.0stY<java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer>> r2 = r10.LLJILJIL
            Y.AObjectS246S0100000_25 r1 = new Y.AObjectS246S0100000_25
            r0 = 532(0x214, float:7.45E-43)
            r1.<init>(r10, r0)
            r2.LIZ(r10, r1)
            X.0Lyd<kotlin.Pair<java.lang.Integer, java.lang.Integer>> r2 = r10.LLJILJILJ
            Y.AObjectS246S0100000_25 r1 = new Y.AObjectS246S0100000_25
            r0 = 533(0x215, float:7.47E-43)
            r1.<init>(r10, r0)
            r2.LIZ(r10, r1)
            X.0FAf<pyl.s> r2 = r10.LLJIJIL
            Y.AObjectS246S0100000_25 r1 = new Y.AObjectS246S0100000_25
            r0 = 534(0x216, float:7.48E-43)
            r1.<init>(r10, r0)
            r2.LIZ(r10, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1654500t9k.onActivityCreated(android.os.Bundle):void");
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

    public C1654500t9k(C1652670t6n c1652670t6n, h0 h0Var, C560530Lyd c560530Lyd, C560530Lyd c560530Lyd2, C1652680t6o c1652680t6o) {
        this.LLJI = c1652670t6n;
        this.LLJIJIL = h0Var;
        this.LLJILJIL = c560530Lyd;
        this.LLJILJILJ = c560530Lyd2;
        this.LLJILLL = c1652680t6o;
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
