package X;

import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.ui.powercell.MessageRequestChatListSingleCell;
import com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.ui.powercell.MessageRequestHeaderCell;
import com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.ui.powercell.MessageRequestLoadingCell;
import com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.vm.MessageRequestListVM;
import com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.vm.MessageRequestListVMV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS415S0200000_14;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.AwS628S0100000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Z7d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C894470Z7d extends AbstractC1906720ziY implements InterfaceC724530SbT {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public final AssemVMLazy LLIZLLLIL;
    public final AssemVMLazy LLJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C894470Z7d.class, "newListVM", "getNewListVM()Lcom/ss/android/ugc/aweme/im/chatlist/impl/feature/messagerequest/vm/MessageRequestListVMV2;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C894470Z7d.class, "listVM", "getListVM()Lcom/ss/android/ugc/aweme/im/chatlist/impl/feature/messagerequest/vm/MessageRequestListVM;", 0);
        c09r3.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
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
        AssemViewModel value;
        LJIILIIL(MessageRequestChatListSingleCell.class, MessageRequestLoadingCell.class, MessageRequestHeaderCell.class);
        if (C300860Bqm.LIZ()) {
            AssemVMLazy assemVMLazy = this.LLIZLLLIL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJI;
            value = assemVMLazy.getValue();
        } else {
            AssemVMLazy assemVMLazy2 = this.LLJ;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = LLJI;
            value = assemVMLazy2.getValue();
        }
        C736680Sv4.LJIIIIZZ(this, value, new C2217381BqS() { // from class: X.0Ysl
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C885430YoP) obj).LLILZIL;
            }
        }, null, new AwS628S0100000_14(this, 114), 6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C894470Z7d() {
        AssemVMLazy assemVMLazy;
        HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory;
        HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory2;
        AssemVMLazy assemVMLazy2;
        HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory3;
        HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory4;
        HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory5;
        HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory6;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MessageRequestListVMV2.class);
        AwS558S0100000_14 awS558S0100000_14 = new AwS558S0100000_14(c19719912DlLIZ, 1776);
        AFwS248S0000000_14 aFwS248S0000000_14 = AFwS248S0000000_14.get$arr$(567);
        C01D1 c01d1 = C01D1.LIZ;
        if (Intrinsics.LJFF(obj, c01d1)) {
            assemVMLazy = new AssemVMLazy(new AwS558S0100000_14(c19719912DlLIZ, 1763), awS558S0100000_14, AFwS201S0000000_14.get$arr$(612), new AwS558S0100000_14((C03K6) this, 1753), new AwS558S0100000_14((C03K6) this, 1764), (!(this instanceof HasDefaultViewModelProviderFactory) || (hasDefaultViewModelProviderFactory6 = (HasDefaultViewModelProviderFactory) this) == null) ? C1143000fqk.LIZ : new AwS558S0100000_14(hasDefaultViewModelProviderFactory6, 1767), aFwS248S0000000_14, new AwS558S0100000_14((C03K6) this, 1770), null, new AwS558S0100000_14((C03K6) this, 1773));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS558S0100000_14 awS558S0100000_142 = new AwS558S0100000_14((C03K6) this, 1749);
            Function0 awS558S0100000_143 = (!(this instanceof HasDefaultViewModelProviderFactory) || (hasDefaultViewModelProviderFactory2 = (HasDefaultViewModelProviderFactory) this) == null) ? C1143000fqk.LIZ : new AwS558S0100000_14(hasDefaultViewModelProviderFactory2, 1751);
            AwS558S0100000_14 awS558S0100000_144 = new AwS558S0100000_14(c19719912DlLIZ, 1754);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS415S0200000_14((InterfaceC451590HnJ) obj, awS558S0100000_142, 136));
            AwS558S0100000_14 awS558S0100000_145 = new AwS558S0100000_14(c01gwLIZIZ, 1759);
            AwS558S0100000_14 awS558S0100000_146 = new AwS558S0100000_14(c01gwLIZIZ, 1762);
            AwS558S0100000_14 awS558S0100000_147 = new AwS558S0100000_14(c01gwLIZIZ, 1765);
            AwS558S0100000_14 awS558S0100000_148 = new AwS558S0100000_14(c01gwLIZIZ, 1768);
            AwS558S0100000_14 awS558S0100000_149 = new AwS558S0100000_14(c01gwLIZIZ, 1771);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS558S0100000_144, awS558S0100000_14, new C452080Ho6(), awS558S0100000_145, awS558S0100000_146, awS558S0100000_143, aFwS248S0000000_14, awS558S0100000_147, awS558S0100000_148, awS558S0100000_149);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS558S0100000_14(c19719912DlLIZ, 1774), awS558S0100000_14, AFwS201S0000000_14.get$arr$(611), new AwS558S0100000_14((C03K6) this, 1778), new AwS558S0100000_14((C03K6) this, 1780), (!(this instanceof HasDefaultViewModelProviderFactory) || (hasDefaultViewModelProviderFactory = (HasDefaultViewModelProviderFactory) this) == null) ? C1143000fqk.LIZ : new AwS558S0100000_14(hasDefaultViewModelProviderFactory, 1782), aFwS248S0000000_14, new AwS558S0100000_14((C03K6) this, 1784), null, new AwS558S0100000_14((C03K6) this, 1786));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS558S0100000_14(c19719912DlLIZ, 1787), awS558S0100000_14, AFwS201S0000000_14.get$arr$(613), new AwS558S0100000_14((C03K6) this, 1789), new AwS558S0100000_14((C03K6) this, 1791), new AwS558S0100000_14((C03K6) this, 1794), aFwS248S0000000_14, null, null, new AwS558S0100000_14((C03K6) this, 1796));
        }
        this.LLIZLLLIL = assemVMLazy;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(MessageRequestListVM.class);
        AwS558S0100000_14 awS558S0100000_1410 = new AwS558S0100000_14(c19719912DlLIZ2, 1745);
        AFwS248S0000000_14 aFwS248S0000000_142 = AFwS248S0000000_14.get$arr$(566);
        if (Intrinsics.LJFF(obj, c01d1)) {
            assemVMLazy2 = new AssemVMLazy(new AwS558S0100000_14(c19719912DlLIZ2, 1748), awS558S0100000_1410, AFwS201S0000000_14.get$arr$(610), new AwS558S0100000_14((C03K6) this, 1752), new AwS558S0100000_14((C03K6) this, 1755), (!(this instanceof HasDefaultViewModelProviderFactory) || (hasDefaultViewModelProviderFactory5 = (HasDefaultViewModelProviderFactory) this) == null) ? C1143000fqk.LIZ : new AwS558S0100000_14(hasDefaultViewModelProviderFactory5, 1757), aFwS248S0000000_142, new AwS558S0100000_14((C03K6) this, 1760), null, new AwS558S0100000_14((C03K6) this, 1766));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS558S0100000_14 awS558S0100000_1411 = new AwS558S0100000_14((C03K6) this, 1769);
            Function0 awS558S0100000_1412 = (!(this instanceof HasDefaultViewModelProviderFactory) || (hasDefaultViewModelProviderFactory4 = (HasDefaultViewModelProviderFactory) this) == null) ? C1143000fqk.LIZ : new AwS558S0100000_14(hasDefaultViewModelProviderFactory4, 1772);
            AwS558S0100000_14 awS558S0100000_1413 = new AwS558S0100000_14(c19719912DlLIZ2, 1775);
            C01GW c01gwLIZIZ2 = C452501pT.LIZIZ(new AwS415S0200000_14((InterfaceC451590HnJ) obj, awS558S0100000_1411, 137));
            AwS558S0100000_14 awS558S0100000_1414 = new AwS558S0100000_14(c01gwLIZIZ2, 1777);
            AwS558S0100000_14 awS558S0100000_1415 = new AwS558S0100000_14(c01gwLIZIZ2, 1779);
            AwS558S0100000_14 awS558S0100000_1416 = new AwS558S0100000_14(c01gwLIZIZ2, 1781);
            AwS558S0100000_14 awS558S0100000_1417 = new AwS558S0100000_14(c01gwLIZIZ2, 1783);
            AwS558S0100000_14 awS558S0100000_1418 = new AwS558S0100000_14(c01gwLIZIZ2, 1785);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = C737910Sx3.LIZ;
            assemVMLazy2 = new AssemVMLazy(awS558S0100000_1413, awS558S0100000_1410, new C452080Ho6(), awS558S0100000_1414, awS558S0100000_1415, awS558S0100000_1412, aFwS248S0000000_142, awS558S0100000_1416, awS558S0100000_1417, awS558S0100000_1418);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy2 = new AssemVMLazy(new AwS558S0100000_14(c19719912DlLIZ2, 1788), awS558S0100000_1410, AFwS201S0000000_14.get$arr$(614), new AwS558S0100000_14((C03K6) this, 1790), new AwS558S0100000_14((C03K6) this, 1792), (!(this instanceof HasDefaultViewModelProviderFactory) || (hasDefaultViewModelProviderFactory3 = (HasDefaultViewModelProviderFactory) this) == null) ? C1143000fqk.LIZ : new AwS558S0100000_14(hasDefaultViewModelProviderFactory3, 1793), aFwS248S0000000_142, new AwS558S0100000_14((C03K6) this, 1795), null, new AwS558S0100000_14((C03K6) this, 1746));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Don't support this VMScope: ");
                sbLIZ2.append(obj);
                sbLIZ2.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
            }
            assemVMLazy2 = new AssemVMLazy(new AwS558S0100000_14(c19719912DlLIZ2, 1747), awS558S0100000_1410, AFwS201S0000000_14.get$arr$(609), new AwS558S0100000_14((C03K6) this, 1750), new AwS558S0100000_14((C03K6) this, 1756), new AwS558S0100000_14((C03K6) this, 1758), aFwS248S0000000_142, null, null, new AwS558S0100000_14((C03K6) this, 1761));
        }
        this.LLJ = assemVMLazy2;
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
