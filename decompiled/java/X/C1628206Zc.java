package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.streak.StreakAnimFeature;
import com.ss.android.ugc.aweme.im.service.viewmodel.ChatRoomStreakViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS438S0200000_2;

/* JADX INFO: renamed from: X.06Zc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1628206Zc {
    /* JADX WARN: Type inference failed for: r0v6, types: [T, X.0ZP4] */
    public static C2252321DDq LIZ(final UIContentAssem uIContentAssem, ChatRoomStreakViewModel chatRoomStreakViewModel) {
        InterfaceC724530SbT interfaceC724530SbT = new InterfaceC724530SbT(uIContentAssem) { // from class: X.03HM
            public final LifecycleRegistry LL;

            @Override // X.InterfaceC724530SbT, X.InterfaceC736810SvH
            public final LifecycleOwner getActualLifecycleOwner() {
                return this;
            }

            @Override // X.InterfaceC725030ScH
            public final InterfaceC736810SvH getActualLifecycleOwnerHolder() {
                return this;
            }

            @Override // X.InterfaceC725050ScJ
            public final C03H5 getActualReceiver() {
                return this;
            }

            @Override // X.InterfaceC725030ScH
            public final InterfaceC725050ScJ<C03H5> getActualReceiverHolder() {
                return this;
            }

            @Override // X.InterfaceC725030ScH
            public final LifecycleOwner getHostLifecycleOwner() {
                return null;
            }

            @Override // X.InterfaceC725030ScH
            public final LifecycleOwner getOwnLifecycleOwner() {
                return this;
            }

            @Override // X.InterfaceC725030ScH
            public final C03H5 getReceiverForHostVM() {
                return null;
            }

            @Override // X.InterfaceC725030ScH
            public final boolean getUniqueOnlyDefault() {
                return true;
            }

            @Override // androidx.lifecycle.LifecycleOwner
            public final Lifecycle getLifecycle() {
                return this.LL;
            }

            {
                this.LL = uIContentAssem.getLifecycle();
            }

            @Override // X.InterfaceC725030ScH
            public final <S extends InterfaceC0148002o> C0ZP4 subscribe(AssemViewModel<S> assemViewModel, C1770850wBP<S> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super S, Unit> function2) {
                return C736680Sv4.LJIILLIIL(this, assemViewModel, c1770850wBP, function1, function2);
            }

            @Override // X.InterfaceC725030ScH
            public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
                return C736680Sv4.LJ(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
            }

            @Override // X.InterfaceC725030ScH
            public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
                return C736680Sv4.LJIILJJIL(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
            }

            @Override // X.InterfaceC725030ScH
            public final <S extends InterfaceC0148002o, A, B> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1770850wBP<C19474211Gy<A, B>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631620sYq<? super C03H5, ? super A, ? super B, Unit> interfaceC1631620sYq) {
                return C736680Sv4.LIZLLL(assemViewModel, this, c1770850wBP, function1, interfaceC1631620sYq, interfaceC2217241BqE, interfaceC2217241BqE2);
            }

            @Override // X.InterfaceC725030ScH
            public final <S extends InterfaceC0148002o, A, B, C> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1770850wBP<C11H7<A, B, C>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631630sYr<? super C03H5, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
                return C736680Sv4.LJFF(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1770850wBP, function1, interfaceC1631630sYr);
            }

            @Override // X.InterfaceC725030ScH
            public final <S extends InterfaceC0148002o, A, B, C, D> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1770850wBP<C11H6<A, B, C, D>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685420txc<? super C03H5, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
                return C736680Sv4.LJI(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1770850wBP, function1, interfaceC1685420txc);
            }

            @Override // X.InterfaceC725030ScH
            public final <S extends InterfaceC0148002o, A, B, C, D, E> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, InterfaceC2217241BqE<S, ? extends E> interfaceC2217241BqE5, C1770850wBP<C11H2<A, B, C, D, E>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685430txd<? super C03H5, ? super A, ? super B, ? super C, ? super D, ? super E, Unit> interfaceC1685430txd) {
                return C736680Sv4.LJII(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, interfaceC2217241BqE5, c1770850wBP, function1, interfaceC1685430txd);
            }
        };
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(Boolean.FALSE);
        if (C06GX.LIZ()) {
            C06QW c06qw = StreakAnimFeature.LIZ;
            c06qw.getClass();
            if (C06QW.LIZJ.getValue(c06qw, C06QW.LIZIZ[0]) != null) {
                C259800zU c259800zU = new C259800zU();
                c259800zU.element = C736680Sv4.LJIIIIZZ(interfaceC724530SbT, chatRoomStreakViewModel, new C2217381BqS() { // from class: X.06Zd
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj) {
                        return ((C06PY) obj).LL;
                    }
                }, null, new AwS438S0200000_2(c2252321DDqLIZ, c259800zU, 10), 6);
            }
        }
        return c2252321DDqLIZ;
    }
}
