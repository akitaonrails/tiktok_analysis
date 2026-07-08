package X;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.chatdetail.redesign.detailpage.cell.GroupDetailBottomCell;
import com.ss.android.ugc.aweme.chatdetail.redesign.detailpage.cell.GroupDetailMemberCell;
import com.ss.android.ugc.aweme.chatdetail.redesign.detailpage.viewmodel.group.GroupDetailViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS415S0200000_14;
import kotlin.jvm.internal.AwS450S0200000_14;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZJ4, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZJ4 extends AbstractC1906720ziY implements InterfaceC724530SbT {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public final AssemVMLazy LLIZLLLIL;
    public TuxTextView LLJ;
    public C897520ZIw LLJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0ZJ4.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/chatdetail/redesign/detailpage/viewmodel/group/GroupDetailViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
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
        LJIILIIL(GroupDetailMemberCell.class);
        LJIILIIL(GroupDetailBottomCell.class);
        Context context = getContext();
        if (context == null) {
            return;
        }
        C897520ZIw c897520ZIw = null;
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(context), R.layout.cmg, null, false);
        this.LLJ = (TuxTextView) viewTd.findViewById(R.id.p6d);
        if (C300830Bqj.LIZ()) {
            TuxTextView tuxTextView = this.LLJ;
            if (tuxTextView != null) {
                tuxTextView.setTuxFont(61);
            }
            TuxTextView tuxTextView2 = this.LLJ;
            if (tuxTextView2 != null) {
                tuxTextView2.setTextColorRes(R.attr.a1k);
            }
        } else {
            TuxTextView tuxTextView3 = this.LLJ;
            if (tuxTextView3 != null) {
                tuxTextView3.setTuxFont(102);
            }
            TuxTextView tuxTextView4 = this.LLJ;
            if (tuxTextView4 != null) {
                tuxTextView4.setTextColorRes(R.attr.a1h);
            }
        }
        LJII(viewTd);
        GroupDetailViewModel groupDetailViewModelLJJ = LJJ();
        groupDetailViewModelLJJ.LLJILLL = true;
        String strWQ2 = groupDetailViewModelLJJ.wQ2();
        C0Z2F c0z2f = (C0Z2F) groupDetailViewModelLJJ.LLJI.getValue();
        if (c0z2f != null) {
            C1658206eS.LIZ(c0z2f, strWQ2, groupDetailViewModelLJJ.LLJJI);
        }
        if (LJJ().AQ2()) {
            InterfaceC897380ZIi.LIZIZ.getClass();
            C897520ZIw c897520ZIwLJI = C897370ZIh.LIZ().LJI(EnumC1910450zoZ.GROUP_SETTING, false);
            if (c897520ZIwLJI != null) {
                c897520ZIwLJI.LIZIZ(false, new C0NYY() { // from class: X.0ZIj
                    @Override // X.C0NYY
                    public final Object k3(Map<String, C595660NXw> map, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
                        C0ZJ4 c0zj4 = this.LL;
                        List<InterfaceC1891350zJl> listLJII = c0zj4.LLILZLL.LJII();
                        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJII, 10));
                        for (Object c897400ZIk : (ArrayList) listLJII) {
                            if (c897400ZIk instanceof C897400ZIk) {
                                C897400ZIk c897400ZIk2 = (C897400ZIk) c897400ZIk;
                                if (map.containsKey(c897400ZIk2.LL.getUid())) {
                                    c897400ZIk = new C897400ZIk(c897400ZIk2.LL, c897400ZIk2.LLILLJJLI, C896480ZEw.LIZJ(map.get(c897400ZIk2.LL.getUid())));
                                }
                            }
                            arrayList.add(c897400ZIk);
                        }
                        c0zj4.LLILZLL.LJIILL(arrayList, null);
                        return Unit.LIZ;
                    }
                });
                c897520ZIw = c897520ZIwLJI;
            }
        }
        this.LLJI = c897520ZIw;
        LJJ().LLJILJIL = this.LLJI;
        C736680Sv4.LJIIIIZZ(this, LJJ(), new C2217381BqS() { // from class: X.0ZC7
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1729206pu) obj).LLIZLLLIL;
            }
        }, null, new AwS450S0200000_14(this, context, 18), 6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0ZJ4() {
        AssemVMLazy assemVMLazy;
        HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory;
        HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory2;
        HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory3;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(GroupDetailViewModel.class);
        AwS558S0100000_14 awS558S0100000_14 = new AwS558S0100000_14(c19719912DlLIZ, 1537);
        AFwS248S0000000_14 aFwS248S0000000_14 = AFwS248S0000000_14.get$arr$(498);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS558S0100000_14(c19719912DlLIZ, 1548), awS558S0100000_14, AFwS201S0000000_14.get$arr$(510), new AwS558S0100000_14((C03K6) this, 1523), new AwS558S0100000_14((C03K6) this, 1525), (!(this instanceof HasDefaultViewModelProviderFactory) || (hasDefaultViewModelProviderFactory3 = (HasDefaultViewModelProviderFactory) this) == null) ? C1143000fqk.LIZ : new AwS558S0100000_14(hasDefaultViewModelProviderFactory3, 1527), aFwS248S0000000_14, new AwS558S0100000_14((C03K6) this, 1529), null, new AwS558S0100000_14((C03K6) this, 1530));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS558S0100000_14 awS558S0100000_142 = new AwS558S0100000_14((C03K6) this, 1524);
            Function0 awS558S0100000_143 = (!(this instanceof HasDefaultViewModelProviderFactory) || (hasDefaultViewModelProviderFactory2 = (HasDefaultViewModelProviderFactory) this) == null) ? C1143000fqk.LIZ : new AwS558S0100000_14(hasDefaultViewModelProviderFactory2, 1526);
            AwS558S0100000_14 awS558S0100000_144 = new AwS558S0100000_14(c19719912DlLIZ, 1528);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS415S0200000_14((InterfaceC451590HnJ) obj, awS558S0100000_142, 111));
            AwS558S0100000_14 awS558S0100000_145 = new AwS558S0100000_14(c01gwLIZIZ, 1531);
            AwS558S0100000_14 awS558S0100000_146 = new AwS558S0100000_14(c01gwLIZIZ, 1532);
            AwS558S0100000_14 awS558S0100000_147 = new AwS558S0100000_14(c01gwLIZIZ, 1533);
            AwS558S0100000_14 awS558S0100000_148 = new AwS558S0100000_14(c01gwLIZIZ, 1534);
            AwS558S0100000_14 awS558S0100000_149 = new AwS558S0100000_14(c01gwLIZIZ, 1535);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS558S0100000_144, awS558S0100000_14, new C452080Ho6(), awS558S0100000_145, awS558S0100000_146, awS558S0100000_143, aFwS248S0000000_14, awS558S0100000_147, awS558S0100000_148, awS558S0100000_149);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS558S0100000_14(c19719912DlLIZ, 1536), awS558S0100000_14, AFwS201S0000000_14.get$arr$(508), new AwS558S0100000_14((C03K6) this, 1538), new AwS558S0100000_14((C03K6) this, 1539), (!(this instanceof HasDefaultViewModelProviderFactory) || (hasDefaultViewModelProviderFactory = (HasDefaultViewModelProviderFactory) this) == null) ? C1143000fqk.LIZ : new AwS558S0100000_14(hasDefaultViewModelProviderFactory, 1540), aFwS248S0000000_14, new AwS558S0100000_14((C03K6) this, 1541), null, new AwS558S0100000_14((C03K6) this, 1542));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS558S0100000_14(c19719912DlLIZ, 1543), awS558S0100000_14, AFwS201S0000000_14.get$arr$(509), new AwS558S0100000_14((C03K6) this, 1544), new AwS558S0100000_14((C03K6) this, 1545), new AwS558S0100000_14((C03K6) this, 1546), aFwS248S0000000_14, null, null, new AwS558S0100000_14((C03K6) this, 1547));
        }
        this.LLIZLLLIL = assemVMLazy;
    }

    public final GroupDetailViewModel LJJ() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJIJIL;
        return (GroupDetailViewModel) assemVMLazy.getValue();
    }

    @Override // X.AbstractC1906720ziY, X.InterfaceC1906750zib
    public final void onStart() {
        C897520ZIw c897520ZIw = this.LLJI;
        if (c897520ZIw != null) {
            c897520ZIw.LJ();
        }
    }

    @Override // X.AbstractC1906720ziY, X.InterfaceC1906750zib
    public final void onStop() {
        C897520ZIw c897520ZIw;
        if (!C2157308cl.LIZ() || (c897520ZIw = this.LLJI) == null) {
            return;
        }
        c897520ZIw.LJII();
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
