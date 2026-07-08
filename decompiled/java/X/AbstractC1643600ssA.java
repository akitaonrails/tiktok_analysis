package X;

import X.C05YF;
import android.os.Handler;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.ui_component.UiState;
import java.lang.reflect.Field;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS639S0100000_25;

/* JADX INFO: renamed from: X.0ssA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public abstract class AbstractC1643600ssA<T extends JediViewModel<? extends UiState> & LifecycleOwner & C05YF> extends AbstractC2255721DQs<T> implements InterfaceC1171660gay {
    public static final C01GW<Handler> LLILZIL = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(562));
    public static final C01GW<Field> LLILZLL = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1628));
    public final C1643620ssC LL = new C11E6(this) { // from class: X.0ssC
        public final AbstractC1643600ssA<T> LL;

        @Override // X.C11E6
        public final /* bridge */ /* synthetic */ LifecycleOwner getLifecycleOwner() {
            return this.LL;
        }

        {
            this.LL = this;
        }
    };
    public final AFwS214S0000000_25 LLILLJJLI = AFwS214S0000000_25.get$arr$(563);
    public final C01GW LLILLL;
    public final C01GW LLILZ;

    public abstract Function0<T> W1();

    public void Z1() {
    }

    @Override // X.InterfaceC960503pD, X.C11E6
    public final LifecycleOwner getLifecycleOwner() {
        return this;
    }

    public abstract C19A3 getParentScene();

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

    public abstract void o2();

    /* JADX WARN: Incorrect return type in method signature: ()TT; */
    public final JediViewModel X1() {
        return (JediViewModel) this.LLILZ.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0ssC] */
    public AbstractC1643600ssA() {
        EnumC452301pR enumC452301pR = EnumC452301pR.NONE;
        this.LLILLL = C452501pT.LIZ(enumC452301pR, new AwS569S0100000_25(this, 1093));
        this.LLILZ = C452501pT.LIZ(enumC452301pR, new AwS569S0100000_25(this, 1094));
    }

    @Override // X.AbstractC2255721DQs
    public final C05YF getApiComponent() {
        return (C05YF) X1();
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        JediViewModel jediViewModelX1 = X1();
        C1642270sq1 c1642270sq1 = new C2217381BqS() { // from class: X.0sq1
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((UiState) obj).getUi();
            }
        };
        C1765020w20 c1765020w20 = new C1765020w20();
        c1765020w20.LIZ = true;
        C11EA.LJI(this, jediViewModelX1, c1642270sq1, c1765020w20, new AwS639S0100000_25(this, 148));
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        InterfaceC569700MWa interfaceC569700MWaLIZIZ = C565530MFz.LIZIZ(getParentScene().requireActivity(), getParentScene());
        if (interfaceC569700MWaLIZIZ == null || interfaceC569700MWaLIZIZ.LJLJJI()) {
            Object value = this.LLILLL.getValue();
            this.LLILLJJLI.getClass();
            C19719512Dh.LIZJ(LLILZLL.getValue().get(value)).remove("".length() == 0 ? X1().getClass().getCanonicalName() : "");
        }
    }

    @Override // X.C11E9
    public final C11E6 getLifecycleOwnerHolder() {
        return this.LL;
    }

    @Override // X.C11E9
    public final <VM1 extends JediViewModel<S1>, S1 extends C004I, R> R withState(VM1 vm1, Function1<? super S1, ? extends R> function1) {
        return function1.invoke(vm1.FQ2());
    }

    @Override // X.C11E9
    public final <S extends C004I> InterfaceC420801kM subscribe(JediViewModel<S> jediViewModel, C1765020w20<S> c1765020w20, Function2<? super InterfaceC960503pD, ? super S, Unit> function2) {
        return C11EA.LJIIJJI(this, jediViewModel, c1765020w20, function2);
    }

    @Override // X.C11E9
    public final <S extends C004I, A> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1765020w20<C11EC<A>> c1765020w20, Function2<? super InterfaceC960503pD, ? super A, Unit> function2) {
        return C11EA.LJI(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2);
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
