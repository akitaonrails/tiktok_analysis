package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.usertrust.UserTrustItemDescriptionChunk;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.Intrinsics;
import poa.a0;

/* JADX INFO: renamed from: X.03Gj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C815103Gj extends AbstractC2172971A2l<C809503Ef, C816703Gz> implements InterfaceC724530SbT {
    public final OrderSubmitAssemViewModel LLILLJJLI;
    public final Lifecycle LLILLL;

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
        return this.LLILLL;
    }

    public C815103Gj(OrderSubmitAssemViewModel orderSubmitAssemViewModel, Lifecycle lifecycle) {
        super(new AbstractC339510DSr<C809503Ef>() { // from class: X.03Eg
            @Override // X.AbstractC339510DSr
            public final boolean LIZ(C809503Ef c809503Ef, C809503Ef c809503Ef2) {
                return Intrinsics.LJFF(c809503Ef, c809503Ef2);
            }

            @Override // X.AbstractC339510DSr
            public final boolean LIZIZ(C809503Ef c809503Ef, C809503Ef c809503Ef2) {
                return Intrinsics.LJFF(C809503Ef.class, C809503Ef.class);
            }
        });
        this.LLILLJJLI = orderSubmitAssemViewModel;
        this.LLILLL = lifecycle;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        a0 a0Var;
        a0 a0Var2;
        List<UserTrustItemDescriptionChunk> list;
        C809503Ef c809503EfLLLFZ = LLLFZ(i);
        View view = ((C816703Gz) viewHolder).LL;
        if (((RecyclerView) view.findViewById(R.id.us_order_submit_user_trust_container)).getAdapter() == null && (list = c809503EfLLLFZ.LIZIZ) != null) {
            a0 a0Var3 = new a0(list, R.attr.a1j, new AwS580S0100000_1(this, 801));
            ((RecyclerView) view.findViewById(R.id.us_order_submit_user_trust_container)).setLayoutManager(new LinearLayoutManager(view.getContext()));
            ((RecyclerView) view.findViewById(R.id.us_order_submit_user_trust_container)).addItemDecoration(new C819603Ic(16));
            ((RecyclerView) view.findViewById(R.id.us_order_submit_user_trust_container)).setAdapter(a0Var3);
            ((RecyclerView) view.findViewById(R.id.us_order_submit_user_trust_container)).setItemAnimator(null);
        }
        C0H1U.LJIIL((TextView) view.findViewById(R.id.us_order_submit_user_trust_title), c809503EfLLLFZ.LIZ, true);
        AbstractC21673619ry adapter = ((RecyclerView) view.findViewById(R.id.us_order_submit_user_trust_container)).getAdapter();
        if (adapter instanceof a0) {
            a0Var = (a0) adapter;
        } else {
            a0Var = null;
        }
        if (a0Var != null) {
            a0.LLLIIIIL(a0Var, null, false, 30);
        }
        List<UserTrustItemDescriptionChunk> list2 = c809503EfLLLFZ.LIZIZ;
        if (list2 != null) {
            AbstractC21673619ry adapter2 = ((RecyclerView) view.findViewById(R.id.us_order_submit_user_trust_container)).getAdapter();
            if ((adapter2 instanceof a0) && (a0Var2 = (a0) adapter2) != null) {
                a0Var2.LLILLJJLI = list2;
                a0Var2.LLLI(list2);
            }
        }
        if (c809503EfLLLFZ.LIZJ) {
            C786410Ut5.LJLLLLLL(0, view.findViewById(R.id.us_order_submit_user_trust_split_line));
            C0H1U.LJII(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)), view.findViewById(R.id.us_order_submit_user_trust_layout));
        } else {
            C786410Ut5.LJLLLLLL(8, view.findViewById(R.id.us_order_submit_user_trust_split_line));
            C0H1U.LJII(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), view.findViewById(R.id.us_order_submit_user_trust_layout));
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C816703Gz c816703Gz = new C816703Gz(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.an1, viewGroup, false));
        try {
            View view = c816703Gz.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c816703Gz.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c816703Gz.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C816703Gz.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c816703Gz.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c816703Gz.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C816703Gz.class.getName();
        return c816703Gz;
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
