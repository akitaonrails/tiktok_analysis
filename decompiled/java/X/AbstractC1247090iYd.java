package X;

import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.profile.business.ur.following.vm.RelationSearchVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS420S0200000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0iYd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public abstract class AbstractC1247090iYd extends AbstractC1906720ziY implements InterfaceC724530SbT {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJILJ;
    public final AssemVMLazy LLIZLLLIL;
    public final C11RK<String> LLJ;
    public long LLJI;
    public final C11NJ LLJIJIL;
    public final C01GW LLJILJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AbstractC1247090iYd.class, "searchVM", "getSearchVM()Lcom/ss/android/ugc/profile/business/ur/following/vm/RelationSearchVM;", 0);
        C13LE.LIZ.getClass();
        LLJILJILJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

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

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC1247090iYd() {
        AssemVMLazy assemVMLazy;
        HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory;
        HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory2;
        HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory3;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(RelationSearchVM.class);
        AwS563S0100000_19 awS563S0100000_19 = new AwS563S0100000_19(c19719912DlLIZ, 2740);
        AFwS257S0000000_19 aFwS257S0000000_19 = AFwS257S0000000_19.get$arr$(552);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS563S0100000_19(c19719912DlLIZ, 2751), awS563S0100000_19, AFwS207S0000000_19.get$arr$(599), new AwS563S0100000_19((C03K6) this, 2726), new AwS563S0100000_19((C03K6) this, 2728), (!(this instanceof HasDefaultViewModelProviderFactory) || (hasDefaultViewModelProviderFactory3 = (HasDefaultViewModelProviderFactory) this) == null) ? C1143000fqk.LIZ : new AwS563S0100000_19(hasDefaultViewModelProviderFactory3, 2730), aFwS257S0000000_19, new AwS563S0100000_19((C03K6) this, 2732), null, new AwS563S0100000_19((C03K6) this, 2733));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS563S0100000_19 awS563S0100000_192 = new AwS563S0100000_19((C03K6) this, 2727);
            Function0 awS563S0100000_193 = (!(this instanceof HasDefaultViewModelProviderFactory) || (hasDefaultViewModelProviderFactory2 = (HasDefaultViewModelProviderFactory) this) == null) ? C1143000fqk.LIZ : new AwS563S0100000_19(hasDefaultViewModelProviderFactory2, 2729);
            AwS563S0100000_19 awS563S0100000_194 = new AwS563S0100000_19(c19719912DlLIZ, 2731);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS420S0200000_19((InterfaceC451590HnJ) obj, awS563S0100000_192, 128));
            AwS563S0100000_19 awS563S0100000_195 = new AwS563S0100000_19(c01gwLIZIZ, 2734);
            AwS563S0100000_19 awS563S0100000_196 = new AwS563S0100000_19(c01gwLIZIZ, 2735);
            AwS563S0100000_19 awS563S0100000_197 = new AwS563S0100000_19(c01gwLIZIZ, 2736);
            AwS563S0100000_19 awS563S0100000_198 = new AwS563S0100000_19(c01gwLIZIZ, 2737);
            AwS563S0100000_19 awS563S0100000_199 = new AwS563S0100000_19(c01gwLIZIZ, 2738);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS563S0100000_194, awS563S0100000_19, new C452080Ho6(), awS563S0100000_195, awS563S0100000_196, awS563S0100000_193, aFwS257S0000000_19, awS563S0100000_197, awS563S0100000_198, awS563S0100000_199);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS563S0100000_19(c19719912DlLIZ, 2739), awS563S0100000_19, AFwS207S0000000_19.get$arr$(600), new AwS563S0100000_19((C03K6) this, 2741), new AwS563S0100000_19((C03K6) this, 2742), (!(this instanceof HasDefaultViewModelProviderFactory) || (hasDefaultViewModelProviderFactory = (HasDefaultViewModelProviderFactory) this) == null) ? C1143000fqk.LIZ : new AwS563S0100000_19(hasDefaultViewModelProviderFactory, 2743), aFwS257S0000000_19, new AwS563S0100000_19((C03K6) this, 2744), null, new AwS563S0100000_19((C03K6) this, 2745));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS563S0100000_19(c19719912DlLIZ, 2746), awS563S0100000_19, AFwS207S0000000_19.get$arr$(601), new AwS563S0100000_19((C03K6) this, 2747), new AwS563S0100000_19((C03K6) this, 2748), new AwS563S0100000_19((C03K6) this, 2749), aFwS257S0000000_19, null, null, new AwS563S0100000_19((C03K6) this, 2750));
        }
        this.LLIZLLLIL = assemVMLazy;
        this.LLJ = new C11RK<>();
        this.LLJI = -1L;
        this.LLJIJIL = new C11NJ();
        this.LLJILJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2725));
    }

    public final RelationSearchVM LJJ() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJILJ;
        return (RelationSearchVM) assemVMLazy.getValue();
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
