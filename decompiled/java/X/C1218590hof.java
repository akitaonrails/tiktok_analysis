package X;

import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.ss.android.ugc.tiktok.im.contact.selector.api.protocol.custom.ContactSelectorCustomCellProtocol;
import com.ss.android.ugc.tiktok.im.contact.selector.impl.cell.SelectorListContactCell;
import com.ss.android.ugc.tiktok.im.contact.selector.impl.cell.SelectorListIndexCell;
import com.ss.android.ugc.tiktok.im.contact.selector.impl.vm.SelectorTabContactListVM;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS420S0200000_19;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS633S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hof, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1218590hof extends AbstractC1906720ziY implements InterfaceC724530SbT {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public final String LLIZLLLIL;
    public final C1224280hxq LLJ;
    public final AssemVMLazy LLJI;
    public final List<ContactSelectorCustomCellProtocol> LLJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1218590hof.class, "selectorTabContactListVM", "getSelectorTabContactListVM()Lcom/ss/android/ugc/tiktok/im/contact/selector/impl/vm/SelectorTabContactListVM;", 0);
        C13LE.LIZ.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
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

    @Override // X.AbstractC1906720ziY, X.InterfaceC1906750zib
    public final void onCreate() {
        LJIILIIL(SelectorListContactCell.class, SelectorListIndexCell.class);
        for (ContactSelectorCustomCellProtocol contactSelectorCustomCellProtocol : (ArrayList) this.LLJIJIL) {
            contactSelectorCustomCellProtocol.LIZ();
            LJIILIIL(contactSelectorCustomCellProtocol.LIZJ());
        }
        this.LLILZLL.LIZLLL = C0Q4Y.BUFFER;
        AssemVMLazy assemVMLazy = this.LLJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJIL;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0hog
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1218610hoh) obj).LL;
            }
        }, null, new AwS633S0100000_19(this, 224), 6);
    }

    @Override // X.AbstractC1906720ziY
    public final AbstractC329610Cw3<?> LJIIJJI() {
        AssemVMLazy assemVMLazy = this.LLJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJIL;
        AbstractC329610Cw3<?> config = ((AssemListViewModel) assemVMLazy.getValue()).getConfig();
        C1223620hwm.LIZ(C1224170hxf.LIZ(this.LLJ, this.LLIZLLLIL).LIZIZ(), config.LIZ);
        return config;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1218590hof(C1224280hxq c1224280hxq, String str) {
        AssemVMLazy assemVMLazy;
        Function0 awS563S0100000_19;
        HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory;
        Function0 awS563S0100000_192;
        HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory2;
        Function0 awS563S0100000_193;
        HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory3;
        this.LLIZLLLIL = str;
        this.LLJ = c1224280hxq;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SelectorTabContactListVM.class);
        C5182020e c5182020e = new C5182020e((C13IQ) c19719912DlLIZ, 206);
        AFwS257S0000000_19 aFwS257S0000000_19 = AFwS257S0000000_19.get$arr$(603);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            AwS563S0100000_19 awS563S0100000_194 = new AwS563S0100000_19(c19719912DlLIZ, 2836);
            AFwS207S0000000_19 aFwS207S0000000_19 = AFwS207S0000000_19.get$arr$(613);
            AwS563S0100000_19 awS563S0100000_195 = new AwS563S0100000_19((C03K6) this, 2797);
            AwS550S0100000_6 awS550S0100000_6 = new AwS550S0100000_6(this, 1084);
            if ((this instanceof HasDefaultViewModelProviderFactory) && (hasDefaultViewModelProviderFactory3 = (HasDefaultViewModelProviderFactory) this) != null) {
                awS563S0100000_193 = new AwS563S0100000_19(hasDefaultViewModelProviderFactory3, 2799);
            } else {
                awS563S0100000_193 = C1143000fqk.LIZ;
            }
            assemVMLazy = new AssemVMLazy(awS563S0100000_194, c5182020e, aFwS207S0000000_19, awS563S0100000_195, awS550S0100000_6, awS563S0100000_193, aFwS257S0000000_19, new AwS550S0100000_6(this, 1085), null, new AwS550S0100000_6(this, 1086));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS551S0100000_7 awS551S0100000_7 = new AwS551S0100000_7((C03K6) this, 580);
            if ((this instanceof HasDefaultViewModelProviderFactory) && (hasDefaultViewModelProviderFactory2 = (HasDefaultViewModelProviderFactory) this) != null) {
                awS563S0100000_192 = new AwS563S0100000_19(hasDefaultViewModelProviderFactory2, 2798);
            } else {
                awS563S0100000_192 = C1143000fqk.LIZ;
            }
            AwS563S0100000_19 awS563S0100000_196 = new AwS563S0100000_19(c19719912DlLIZ, 2800);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS420S0200000_19((InterfaceC451590HnJ) obj, awS551S0100000_7, 138));
            AwS563S0100000_19 awS563S0100000_197 = new AwS563S0100000_19(c01gwLIZIZ, 2801);
            AwS563S0100000_19 awS563S0100000_198 = new AwS563S0100000_19(c01gwLIZIZ, 2828);
            AwS563S0100000_19 awS563S0100000_199 = new AwS563S0100000_19(c01gwLIZIZ, 2829);
            AwS563S0100000_19 awS563S0100000_1910 = new AwS563S0100000_19(c01gwLIZIZ, 2830);
            AwS563S0100000_19 awS563S0100000_1911 = new AwS563S0100000_19(c01gwLIZIZ, 2831);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS563S0100000_196, c5182020e, new C452080Ho6(), awS563S0100000_197, awS563S0100000_198, awS563S0100000_192, aFwS257S0000000_19, awS563S0100000_199, awS563S0100000_1910, awS563S0100000_1911);
        } else if (Intrinsics.LJFF(obj, obj)) {
            AwS563S0100000_19 awS563S0100000_1912 = new AwS563S0100000_19(c19719912DlLIZ, 2832);
            AFwS207S0000000_19 aFwS207S0000000_192 = AFwS207S0000000_19.get$arr$(617);
            AwS563S0100000_19 awS563S0100000_1913 = new AwS563S0100000_19((C03K6) this, 2833);
            AwS550S0100000_6 awS550S0100000_62 = new AwS550S0100000_6(this, 1087);
            if ((this instanceof HasDefaultViewModelProviderFactory) && (hasDefaultViewModelProviderFactory = (HasDefaultViewModelProviderFactory) this) != null) {
                awS563S0100000_19 = new AwS563S0100000_19(hasDefaultViewModelProviderFactory, 2834);
            } else {
                awS563S0100000_19 = C1143000fqk.LIZ;
            }
            assemVMLazy = new AssemVMLazy(awS563S0100000_1912, c5182020e, aFwS207S0000000_192, awS563S0100000_1913, awS550S0100000_62, awS563S0100000_19, aFwS257S0000000_19, new AwS550S0100000_6(this, 1088), null, new AwS550S0100000_6(this, 1089));
        } else if (Intrinsics.LJFF(obj, C03IJ.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS563S0100000_19(c19719912DlLIZ, 2835), c5182020e, AFwS207S0000000_19.get$arr$(618), new AwS551S0100000_7((C03K6) this, 581), new AwS550S0100000_6(this, 1090), new AwS550S0100000_6(this, 1091), aFwS257S0000000_19, null, null, new AwS550S0100000_6(this, 1092));
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Don't support this VMScope: ");
            sbLIZ.append(obj);
            sbLIZ.append(" there");
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
        this.LLJI = assemVMLazy;
        this.LLJIJIL = new ArrayList();
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
