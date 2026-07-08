package X;

import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.ui.powercell.MessageRequestChatListSingleCell;
import com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.ui.powercell.MessageRequestHeaderCell;
import com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.ui.powercell.MessageRequestSelectAllCell;
import com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.ui.powercell.MessageRequestStoryAggregationCell;
import com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.vm.BaseMessageRequestListVM;
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
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Z7c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C894460Z7c extends AbstractC1906720ziY implements InterfaceC724530SbT {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public final RecyclerView.LayoutManager LLIZLLLIL;
    public final AssemVMLazy LLJ;
    public final AssemVMLazy LLJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C894460Z7c.class, "newListVM", "getNewListVM()Lcom/ss/android/ugc/aweme/im/chatlist/impl/feature/messagerequest/vm/MessageRequestListVMV2;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C894460Z7c.class, "listVM", "getListVM()Lcom/ss/android/ugc/aweme/im/chatlist/impl/feature/messagerequest/vm/MessageRequestListVM;", 0);
        c09r3.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
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
        LJIILIIL(MessageRequestChatListSingleCell.class, MessageRequestStoryAggregationCell.class, MessageRequestSelectAllCell.class, MessageRequestHeaderCell.class);
        BaseMessageRequestListVM baseMessageRequestListVMLJJ = LJJ();
        selectSubscribe(baseMessageRequestListVMLJJ, new C2217381BqS() { // from class: X.0Ysc
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C885430YoP) obj).LLILLL;
            }
        }, new C2217381BqS() { // from class: X.0YsQ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C885430YoP) obj).LLILLJJLI;
            }
        }, new C2217381BqS() { // from class: X.0YsP
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C885430YoP) obj).LL;
            }
        }, new C2217381BqS() { // from class: X.0Ysa
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C885430YoP) obj).LLILZIL;
            }
        }, C736820SvI.LIZIZ(baseMessageRequestListVMLJJ.usedInReusedScene), null, new C914220Ztk(this, 1));
    }

    public final BaseMessageRequestListVM LJJ() {
        if (C300860Bqm.LIZ()) {
            AssemVMLazy assemVMLazy = this.LLJ;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJIJIL;
            return (BaseMessageRequestListVM) assemVMLazy.getValue();
        }
        AssemVMLazy assemVMLazy2 = this.LLJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = LLJIJIL;
        return (BaseMessageRequestListVM) assemVMLazy2.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C894460Z7c(RecyclerView.LayoutManager layoutManager) {
        AssemVMLazy assemVMLazy;
        Function0 awS558S0100000_14;
        HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory;
        Function0 awS558S0100000_142;
        HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory2;
        AssemVMLazy assemVMLazy2;
        Function0 awS558S0100000_143;
        HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory3;
        Function0 awS558S0100000_144;
        HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory4;
        Function0 awS558S0100000_145;
        HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory5;
        Function0 awS558S0100000_146;
        HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory6;
        this.LLIZLLLIL = layoutManager;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MessageRequestListVMV2.class);
        AwS558S0100000_14 awS558S0100000_147 = new AwS558S0100000_14(c19719912DlLIZ, 1722);
        AFwS248S0000000_14 aFwS248S0000000_14 = AFwS248S0000000_14.get$arr$(564);
        C01D1 c01d1 = C01D1.LIZ;
        if (Intrinsics.LJFF(obj, c01d1)) {
            AwS558S0100000_14 awS558S0100000_148 = new AwS558S0100000_14(c19719912DlLIZ, 1709);
            AFwS201S0000000_14 aFwS201S0000000_14 = AFwS201S0000000_14.get$arr$(606);
            AwS558S0100000_14 awS558S0100000_149 = new AwS558S0100000_14((C03K6) this, 1699);
            AwS558S0100000_14 awS558S0100000_1410 = new AwS558S0100000_14((C03K6) this, 1710);
            if ((this instanceof HasDefaultViewModelProviderFactory) && (hasDefaultViewModelProviderFactory6 = (HasDefaultViewModelProviderFactory) this) != null) {
                awS558S0100000_146 = new AwS558S0100000_14(hasDefaultViewModelProviderFactory6, 1713);
            } else {
                awS558S0100000_146 = C1143000fqk.LIZ;
            }
            assemVMLazy = new AssemVMLazy(awS558S0100000_148, awS558S0100000_147, aFwS201S0000000_14, awS558S0100000_149, awS558S0100000_1410, awS558S0100000_146, aFwS248S0000000_14, new AwS558S0100000_14((C03K6) this, 1716), null, new AwS558S0100000_14((C03K6) this, 1719));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS558S0100000_14 awS558S0100000_1411 = new AwS558S0100000_14((C03K6) this, 1695);
            if ((this instanceof HasDefaultViewModelProviderFactory) && (hasDefaultViewModelProviderFactory2 = (HasDefaultViewModelProviderFactory) this) != null) {
                awS558S0100000_142 = new AwS558S0100000_14(hasDefaultViewModelProviderFactory2, 1697);
            } else {
                awS558S0100000_142 = C1143000fqk.LIZ;
            }
            AwS558S0100000_14 awS558S0100000_1412 = new AwS558S0100000_14(c19719912DlLIZ, 1700);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS415S0200000_14((InterfaceC451590HnJ) obj, awS558S0100000_1411, 134));
            AwS558S0100000_14 awS558S0100000_1413 = new AwS558S0100000_14(c01gwLIZIZ, 1705);
            AwS558S0100000_14 awS558S0100000_1414 = new AwS558S0100000_14(c01gwLIZIZ, 1708);
            AwS558S0100000_14 awS558S0100000_1415 = new AwS558S0100000_14(c01gwLIZIZ, 1711);
            AwS558S0100000_14 awS558S0100000_1416 = new AwS558S0100000_14(c01gwLIZIZ, 1714);
            AwS558S0100000_14 awS558S0100000_1417 = new AwS558S0100000_14(c01gwLIZIZ, 1717);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS558S0100000_1412, awS558S0100000_147, new C452080Ho6(), awS558S0100000_1413, awS558S0100000_1414, awS558S0100000_142, aFwS248S0000000_14, awS558S0100000_1415, awS558S0100000_1416, awS558S0100000_1417);
        } else if (Intrinsics.LJFF(obj, obj)) {
            AwS558S0100000_14 awS558S0100000_1418 = new AwS558S0100000_14(c19719912DlLIZ, 1720);
            AFwS201S0000000_14 aFwS201S0000000_142 = AFwS201S0000000_14.get$arr$(605);
            AwS558S0100000_14 awS558S0100000_1419 = new AwS558S0100000_14((C03K6) this, 1724);
            AwS558S0100000_14 awS558S0100000_1420 = new AwS558S0100000_14((C03K6) this, 1726);
            if ((this instanceof HasDefaultViewModelProviderFactory) && (hasDefaultViewModelProviderFactory = (HasDefaultViewModelProviderFactory) this) != null) {
                awS558S0100000_14 = new AwS558S0100000_14(hasDefaultViewModelProviderFactory, 1728);
            } else {
                awS558S0100000_14 = C1143000fqk.LIZ;
            }
            assemVMLazy = new AssemVMLazy(awS558S0100000_1418, awS558S0100000_147, aFwS201S0000000_142, awS558S0100000_1419, awS558S0100000_1420, awS558S0100000_14, aFwS248S0000000_14, new AwS558S0100000_14((C03K6) this, 1730), null, new AwS558S0100000_14((C03K6) this, 1732));
        } else if (Intrinsics.LJFF(obj, C03IJ.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS558S0100000_14(c19719912DlLIZ, 1733), awS558S0100000_147, AFwS201S0000000_14.get$arr$(607), new AwS558S0100000_14((C03K6) this, 1735), new AwS558S0100000_14((C03K6) this, 1737), new AwS558S0100000_14((C03K6) this, 1687), aFwS248S0000000_14, null, null, new AwS558S0100000_14((C03K6) this, 1689));
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Don't support this VMScope: ");
            sbLIZ.append(obj);
            sbLIZ.append(" there");
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
        this.LLJ = assemVMLazy;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(MessageRequestListVM.class);
        AwS558S0100000_14 awS558S0100000_1421 = new AwS558S0100000_14(c19719912DlLIZ2, 1691);
        AFwS248S0000000_14 aFwS248S0000000_142 = AFwS248S0000000_14.get$arr$(565);
        if (Intrinsics.LJFF(obj, c01d1)) {
            AwS558S0100000_14 awS558S0100000_1422 = new AwS558S0100000_14(c19719912DlLIZ2, 1694);
            AFwS201S0000000_14 aFwS201S0000000_143 = AFwS201S0000000_14.get$arr$(604);
            AwS558S0100000_14 awS558S0100000_1423 = new AwS558S0100000_14((C03K6) this, 1698);
            AwS558S0100000_14 awS558S0100000_1424 = new AwS558S0100000_14((C03K6) this, 1701);
            if ((this instanceof HasDefaultViewModelProviderFactory) && (hasDefaultViewModelProviderFactory5 = (HasDefaultViewModelProviderFactory) this) != null) {
                awS558S0100000_145 = new AwS558S0100000_14(hasDefaultViewModelProviderFactory5, 1703);
            } else {
                awS558S0100000_145 = C1143000fqk.LIZ;
            }
            assemVMLazy2 = new AssemVMLazy(awS558S0100000_1422, awS558S0100000_1421, aFwS201S0000000_143, awS558S0100000_1423, awS558S0100000_1424, awS558S0100000_145, aFwS248S0000000_142, new AwS558S0100000_14((C03K6) this, 1706), null, new AwS558S0100000_14((C03K6) this, 1712));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS558S0100000_14 awS558S0100000_1425 = new AwS558S0100000_14((C03K6) this, 1715);
            if ((this instanceof HasDefaultViewModelProviderFactory) && (hasDefaultViewModelProviderFactory4 = (HasDefaultViewModelProviderFactory) this) != null) {
                awS558S0100000_144 = new AwS558S0100000_14(hasDefaultViewModelProviderFactory4, 1718);
            } else {
                awS558S0100000_144 = C1143000fqk.LIZ;
            }
            AwS558S0100000_14 awS558S0100000_1426 = new AwS558S0100000_14(c19719912DlLIZ2, 1721);
            C01GW c01gwLIZIZ2 = C452501pT.LIZIZ(new AwS415S0200000_14((InterfaceC451590HnJ) obj, awS558S0100000_1425, 135));
            AwS558S0100000_14 awS558S0100000_1427 = new AwS558S0100000_14(c01gwLIZIZ2, 1723);
            AwS558S0100000_14 awS558S0100000_1428 = new AwS558S0100000_14(c01gwLIZIZ2, 1725);
            AwS558S0100000_14 awS558S0100000_1429 = new AwS558S0100000_14(c01gwLIZIZ2, 1727);
            AwS558S0100000_14 awS558S0100000_1430 = new AwS558S0100000_14(c01gwLIZIZ2, 1729);
            AwS558S0100000_14 awS558S0100000_1431 = new AwS558S0100000_14(c01gwLIZIZ2, 1731);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = C737910Sx3.LIZ;
            assemVMLazy2 = new AssemVMLazy(awS558S0100000_1426, awS558S0100000_1421, new C452080Ho6(), awS558S0100000_1427, awS558S0100000_1428, awS558S0100000_144, aFwS248S0000000_142, awS558S0100000_1429, awS558S0100000_1430, awS558S0100000_1431);
        } else if (Intrinsics.LJFF(obj, obj)) {
            AwS558S0100000_14 awS558S0100000_1432 = new AwS558S0100000_14(c19719912DlLIZ2, 1734);
            AFwS201S0000000_14 aFwS201S0000000_144 = AFwS201S0000000_14.get$arr$(608);
            AwS558S0100000_14 awS558S0100000_1433 = new AwS558S0100000_14((C03K6) this, 1736);
            AwS558S0100000_14 awS558S0100000_1434 = new AwS558S0100000_14((C03K6) this, 1686);
            if ((this instanceof HasDefaultViewModelProviderFactory) && (hasDefaultViewModelProviderFactory3 = (HasDefaultViewModelProviderFactory) this) != null) {
                awS558S0100000_143 = new AwS558S0100000_14(hasDefaultViewModelProviderFactory3, 1688);
            } else {
                awS558S0100000_143 = C1143000fqk.LIZ;
            }
            assemVMLazy2 = new AssemVMLazy(awS558S0100000_1432, awS558S0100000_1421, aFwS201S0000000_144, awS558S0100000_1433, awS558S0100000_1434, awS558S0100000_143, aFwS248S0000000_142, new AwS558S0100000_14((C03K6) this, 1690), null, new AwS558S0100000_14((C03K6) this, 1692));
        } else if (Intrinsics.LJFF(obj, C03IJ.LIZ)) {
            assemVMLazy2 = new AssemVMLazy(new AwS558S0100000_14(c19719912DlLIZ2, 1693), awS558S0100000_1421, AFwS201S0000000_14.get$arr$(603), new AwS558S0100000_14((C03K6) this, 1696), new AwS558S0100000_14((C03K6) this, 1702), new AwS558S0100000_14((C03K6) this, 1704), aFwS248S0000000_142, null, null, new AwS558S0100000_14((C03K6) this, 1707));
        } else {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Don't support this VMScope: ");
            sbLIZ2.append(obj);
            sbLIZ2.append(" there");
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
        }
        this.LLJI = assemVMLazy2;
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
