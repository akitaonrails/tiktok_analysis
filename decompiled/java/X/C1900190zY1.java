package X;

import android.app.Activity;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.touchpoint.api.interfaces.INetworkApi;
import com.bytedance.touchpoint.api.model.InviteCodeResponse;
import com.bytedance.touchpoint.core.invitecode.InviteCodeViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.LinkedHashMap;
import java.util.concurrent.ExecutionException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AFwS271S0000000_28;
import kotlin.jvm.internal.AFwS315S0000000_28;
import kotlin.jvm.internal.AwS607S0100000_28;

/* JADX INFO: renamed from: X.0zY1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1900190zY1 implements InterfaceC724530SbT, InterfaceC1895290zQ7 {
    public static final C1900190zY1 LL;
    public static boolean LLILLJJLI;
    public static boolean LLILLL;
    public static String LLILZ;
    public static String LLILZIL;
    public static final C01GW LLILZLL;
    public static final C736950SvV LLIZ;

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

    static {
        C1900190zY1 c1900190zY1 = new C1900190zY1();
        LL = c1900190zY1;
        LLILZLL = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(3));
        LifecycleOwner lifecycleOwner = C0J3E.LL;
        C736950SvV c736950SvV = new C736950SvV(C13LE.LIZ(InviteCodeViewModel.class), null, new C452070Ho5(), C724750Sbp.LJII(lifecycleOwner), C1220000hqw.LIZ(lifecycleOwner instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) lifecycleOwner : null), AFwS271S0000000_28.get$arr$(1), null, null, null);
        LLIZ = c736950SvV;
        C736680Sv4.LJIIIIZZ(c1900190zY1, c736950SvV.getValue(), new C2217381BqS() { // from class: X.0zY5
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1900220zY4) obj).LL;
            }
        }, C736820SvI.LIZLLL(), new C1897310zTN(), 4);
        C736680Sv4.LJIIIIZZ(c1900190zY1, c736950SvV.getValue(), new C2217381BqS() { // from class: X.0zY6
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1900220zY4) obj).LLILLJJLI;
            }
        }, C736820SvI.LIZLLL(), AFwS315S0000000_28.get$arr$(0), 4);
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return C0J3E.LL.getLifecycleRegistry();
    }

    @Override // X.InterfaceC1895290zQ7
    public final void LJIIIIZZ(EnumC1895270zQ5 enumC1895270zQ5) {
        LLIZ.getValue();
    }

    public static void LIZ(Activity activity, final String str) {
        LLILLJJLI = true;
        AwS607S0100000_28 awS607S0100000_28 = new AwS607S0100000_28(activity, 2);
        AwS607S0100000_28 awS607S0100000_282 = new AwS607S0100000_28(activity, 1);
        LLILZLL.getValue().getClass();
        C11NZ.LJIJJLI(new InterfaceC1478005qU() { // from class: X.0zUW
            @Override // X.InterfaceC1478005qU
            public final void subscribe(C09AJ<C1898050zUZ> c09aj) {
                INetworkApi iNetworkApiLIZJ;
                ListenableFuture<InviteCodeResponse> listenableFuturePostInviterCode;
                int iIntValue;
                Integer num;
                C1C7U.LIZ("InviteCodeReporter@4afa.report$1");
                try {
                    InterfaceC1897260zTI interfaceC1897260zTILIZIZ = C1619720sFe.LIZ.LIZIZ();
                    if (interfaceC1897260zTILIZIZ != null && (iNetworkApiLIZJ = interfaceC1897260zTILIZIZ.LIZJ()) != null && (listenableFuturePostInviterCode = iNetworkApiLIZJ.postInviterCode(str)) != null) {
                        InviteCodeResponse inviteCodeResponse = listenableFuturePostInviterCode.get();
                        if (inviteCodeResponse != null && inviteCodeResponse.status_code == 0) {
                            InviteCodeResponse.Data data = inviteCodeResponse.data;
                            if (data != null && (num = data.inviterBindStatus) != null) {
                                iIntValue = num.intValue();
                            } else {
                                iIntValue = -1;
                            }
                            c09aj.onNext(new C1898050zUZ(iIntValue, inviteCodeResponse));
                        }
                    }
                } catch (InterruptedException e) {
                    TryCatchGuardChecker.doCheck(e);
                    c09aj.onNext(new C1898050zUZ(100000, null));
                } catch (ExecutionException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    c09aj.onNext(new C1898050zUZ(100000, null));
                } catch (Exception e3) {
                    TryCatchGuardChecker.doCheck(e3);
                    c09aj.onNext(new C1898050zUZ(100000, null));
                }
                C1C7U.LIZIZ("InviteCodeReporter@4afa.report$1");
            }
        }).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LIZIZ(new C19336410ks(awS607S0100000_28, awS607S0100000_282, 0));
        C1893790zNh c1893790zNh = C1893790zNh.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        c1893790zNh.getClass();
        C1893790zNh.LJIIJ("inc_enter_activity", null, linkedHashMap);
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
}
