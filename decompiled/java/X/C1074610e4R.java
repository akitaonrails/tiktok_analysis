package X;

import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.relation.auth.widget.cell.ContactMaFCell;
import com.ss.android.ugc.aweme.relation.auth.widget.cell.ContactUnRegisterCell;
import com.ss.android.ugc.aweme.relation.auth.widget.contact.ContactMaFWidgetVM;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS382S0200000_16;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS595S0100000_16;
import kotlin.jvm.internal.AwS630S0100000_16;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0e4R, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1074610e4R extends AbstractC1071680dzi implements InterfaceC724530SbT, InterfaceC19341710lj {
    public C03DU LL;
    public C03DU LLILLJJLI;
    public C0FG1 LLILLL;
    public C481090Itn LLILZ;
    public C1749280vcc LLILZIL;
    public C1074630e4T LLJ;
    public int LLJILJIL;
    public Function0<Boolean> LLJILJILJ;
    public ContactMaFWidgetVM LLJILLL;
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 484));
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS560S0100000_16(this, 482));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 483));
    public final C1074570e4N LLJI = new C1074550e4L(new Class[]{ContactMaFCell.class}) { // from class: X.0e4N
    };
    public final C1074550e4L LLJIJIL = new C1074550e4L(ContactUnRegisterCell.class);

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

    public final ViewOnAttachStateChangeListenerC20604515jv LIZIZ() {
        return (ViewOnAttachStateChangeListenerC20604515jv) this.LLIZLLLIL.getValue();
    }

    public final void LIZLLL() {
        C1074550e4L c1074550e4L = this.LLJIJIL;
        C03DU c03du = this.LLILLJJLI;
        if (!c1074550e4L.LLILLL) {
            c1074550e4L.LLJIJIL = null;
        } else if (c03du != null) {
            c1074550e4L.LJIIJ().LJIIL(Collections.singletonList(c03du));
        }
        C1074570e4N c1074570e4N = this.LLJI;
        C03DU c03du2 = this.LL;
        if (!c1074570e4N.LLILLL) {
            c1074570e4N.LLJIJIL = null;
        } else if (c03du2 != null) {
            c1074570e4N.LJIIJ().LJIIL(Collections.singletonList(c03du2));
        }
        C1749280vcc c1749280vcc = this.LLILZIL;
        C1074630e4T c1074630e4T = this.LLJ;
        if (!(c1074630e4T == null ? null : c1074630e4T).LJIIL || c1749280vcc == null) {
            return;
        }
        C1722300uv6 c1722300uv6 = (c1074630e4T != null ? c1074630e4T : null).LJIILL;
        if (c1722300uv6 == null) {
            c1722300uv6 = new C1722300uv6();
            c1722300uv6.LJI = C20642515q3.LJI(2131836505);
            c1722300uv6.LJIIIIZZ = C20642515q3.LJI(2131833897);
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_large_person;
            c419910GdJ.LJ = Integer.valueOf(R.attr.a1j);
            c1722300uv6.LIZJ = 0;
            c1722300uv6.LIZIZ = c419910GdJ;
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(72));
            int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(72));
            c1722300uv6.LIZLLL = iLIZIZ;
            c1722300uv6.LJ = iLIZIZ2;
        }
        c1749280vcc.setStatus(c1722300uv6);
        C786410Ut5.LJLLLLLL(0, c1749280vcc);
    }

    @Override // X.InterfaceC19341710lj
    public final void LJFF() {
        Function0<Boolean> function0 = this.LLJILJILJ;
        if (function0 == null || !function0.invoke().booleanValue()) {
            LJI();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0029, code lost:
    
        if (r2 != null) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI() {
        /*
            r6 = this;
            com.ss.android.ugc.aweme.relation.auth.widget.contact.ContactMaFWidgetVM r5 = r6.LLJILLL
            r4 = 0
            if (r5 != 0) goto L6
            r5 = r4
        L6:
            X.002o r0 = r5.getState()
            X.0e4c r0 = (X.C1074720e4c) r0
            X.06Xk<X.0e4o> r0 = r0.LLILLL
            boolean r0 = r0 instanceof X.C1623706Xj
            if (r0 != 0) goto L35
            r5.vQ2()
            X.0e4T r1 = r5.LL
            boolean r0 = r1.LIZLLL
            if (r0 == 0) goto L39
            boolean r0 = r1.LJIIIZ
            if (r0 == 0) goto L36
            boolean r0 = r1.LJIIIIZZ
            if (r0 != 0) goto L36
            X.0e4c r2 = com.ss.android.ugc.aweme.relation.auth.widget.contact.ContactMaFWidgetVM.LLILZLL
            if (r2 != 0) goto L2b
            X.0e4c r2 = com.ss.android.ugc.aweme.relation.auth.widget.contact.ContactMaFWidgetVM.LLIZ
        L29:
            if (r2 == 0) goto L39
        L2b:
            kotlin.jvm.internal.AwS595S0100000_16 r1 = new kotlin.jvm.internal.AwS595S0100000_16
            r0 = 463(0x1cf, float:6.49E-43)
            r1.<init>(r2, r0)
            r5.setState(r1)
        L35:
            return
        L36:
            X.0e4c r2 = com.ss.android.ugc.aweme.relation.auth.widget.contact.ContactMaFWidgetVM.LLIZ
            goto L29
        L39:
            X.01wk r3 = r5.getAssemVMScope()
            X.1DEx r2 = r5.LLILZIL
            X.0e4D r1 = new X.0e4D
            r1.<init>(r5, r4)
            r0 = 2
            X.C23250099c.LIZLLL(r3, r2, r4, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1074610e4R.LJI():void");
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        ContactMaFWidgetVM contactMaFWidgetVM = this.LLJILLL;
        if (contactMaFWidgetVM == null) {
            contactMaFWidgetVM = null;
        }
        return contactMaFWidgetVM.getLifecycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ(AbstractC1623806Xk<C1074840e4o> abstractC1623806Xk) {
        C481090Itn c481090Itn;
        ContactMaFWidgetVM contactMaFWidgetVM = this.LLJILLL;
        if (contactMaFWidgetVM == null) {
            contactMaFWidgetVM = null;
        }
        contactMaFWidgetVM.getClass();
        if (Intrinsics.LJFF(abstractC1623806Xk, C491101vh.LIZ)) {
            contactMaFWidgetVM.setState(new AwS595S0100000_16(contactMaFWidgetVM, 460));
        } else if (abstractC1623806Xk instanceof C1623706Xj) {
            contactMaFWidgetVM.vQ2();
        } else if (abstractC1623806Xk instanceof C1623606Xi) {
            contactMaFWidgetVM.vQ2();
            contactMaFWidgetVM.setState(new AwS382S0200000_16(contactMaFWidgetVM, (C1074840e4o) ((C1623606Xi) abstractC1623806Xk).LIZ, 40));
        } else if (abstractC1623806Xk instanceof C491001vg) {
            contactMaFWidgetVM.setState(new AwS595S0100000_16(((C491001vg) abstractC1623806Xk).LIZ, 462));
        } else {
            throw new C1954807lC();
        }
        if ((abstractC1623806Xk instanceof C1623606Xi) && (c481090Itn = this.LLILZ) != null && c481090Itn.LLLFF) {
            c481090Itn.setRefreshing(false);
            C481090Itn c481090Itn2 = this.LLILZ;
            if (c481090Itn2 != null) {
                C786410Ut5.LJLLLLLL(0, c481090Itn2);
            }
        }
    }

    public final void LIZJ(Object obj) {
        C1074630e4T c1074630e4T = (C1074630e4T) obj;
        this.LLJ = c1074630e4T;
        ContactMaFWidgetVM contactMaFWidgetVMLIZ = C1074760e4g.LIZ(c1074630e4T);
        this.LLJILLL = contactMaFWidgetVMLIZ;
        ContactMaFWidgetVM contactMaFWidgetVM = null;
        C736680Sv4.LJIIIIZZ(this, contactMaFWidgetVMLIZ, new C2217381BqS() { // from class: X.0e4Y
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C1074720e4c) obj2).LLILLL;
            }
        }, null, new AwS630S0100000_16(this, 110), 6);
        ContactMaFWidgetVM contactMaFWidgetVM2 = this.LLJILLL;
        AttributeSet attributeSet = null;
        if (contactMaFWidgetVM2 == null) {
            contactMaFWidgetVM2 = null;
        }
        C1074620e4S c1074620e4S = new C1074620e4S(this);
        AssemViewModel.asyncSubscribe$default(contactMaFWidgetVM2, new C2217381BqS() { // from class: X.0e4Z
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C1074720e4c) obj2).LLILLL;
            }
        }, null, new C1074640e4U(this), new C1074650e4V(this), c1074620e4S, 2, null);
        if (c1074630e4T.LJIIIIZZ || C296060Bj2.LIZIZ) {
            ContactMaFWidgetVM contactMaFWidgetVM3 = this.LLJILLL;
            if (contactMaFWidgetVM3 == null) {
                contactMaFWidgetVM3 = null;
            }
            AssemViewModel.asyncSubscribe$default(contactMaFWidgetVM3, new C2217381BqS() { // from class: X.0e4b
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj2) {
                    return ((C1074720e4c) obj2).LL;
                }
            }, null, null, null, new AwS595S0100000_16(this, 459), 14, null);
        }
        if (c1074630e4T.LJIIIZ || C296060Bj2.LIZIZ) {
            ContactMaFWidgetVM contactMaFWidgetVM4 = this.LLJILLL;
            if (contactMaFWidgetVM4 == null) {
                contactMaFWidgetVM4 = null;
            }
            AssemViewModel.asyncSubscribe$default(contactMaFWidgetVM4, new C2217381BqS() { // from class: X.0e4d
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj2) {
                    return ((C1074720e4c) obj2).LLILLJJLI;
                }
            }, null, null, null, new AwS595S0100000_16(this, 458), 14, null);
        }
        if (c1074630e4T.LJII) {
            ContactMaFWidgetVM contactMaFWidgetVM5 = this.LLJILLL;
            if (contactMaFWidgetVM5 != null) {
                contactMaFWidgetVM = contactMaFWidgetVM5;
            }
            C736680Sv4.LJIIIIZZ(this, contactMaFWidgetVM, new C2217381BqS() { // from class: X.0e4a
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj2) {
                    return ((C1074720e4c) obj2).LLILZ;
                }
            }, null, new AwS630S0100000_16(this, 109), 6);
        }
        Integer num = c1074630e4T.LJIIJ;
        int i = 0;
        int i2 = 6;
        if (num != null) {
            int iIntValue = num.intValue();
            if (c1074630e4T.LJIIIIZZ) {
                C03DU c03du = new C03DU(c1074630e4T.LIZ, attributeSet, i2, i);
                this.LL = c03du;
                c03du.setTitleText(iIntValue);
            } else {
                "you config register chunk title but not show chunk??".toString();
                throw new IllegalArgumentException("you config register chunk title but not show chunk??");
            }
        }
        Integer num2 = c1074630e4T.LJIIJJI;
        if (num2 != null) {
            int iIntValue2 = num2.intValue();
            if (c1074630e4T.LJIIIZ) {
                C03DU c03du2 = new C03DU(c1074630e4T.LIZ, attributeSet, i2, i);
                this.LLILLJJLI = c03du2;
                c03du2.setTitleText(iIntValue2);
                return;
            }
            "you config unregister chunk title but not show chunk??".toString();
            throw new IllegalArgumentException("you config unregister chunk title but not show chunk??");
        }
    }

    public final void LJ(View view) {
        final LinearLayoutManager linearLayoutManager;
        TextView textView = (TextView) view.findViewById(R.id.kks);
        RecyclerView.LayoutManager layoutManager = LIZIZ().getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            linearLayoutManager = (LinearLayoutManager) layoutManager;
        } else {
            linearLayoutManager = null;
        }
        final C0FG1 c0fg1 = (C0FG1) view.findViewById(R.id.kl0);
        C786410Ut5.LJLLLLLL(0, c0fg1);
        c0fg1.setIndexLetterTv(textView);
        c0fg1.setOnLetterTouchListener(new C0FG2() { // from class: X.0e4W
            @Override // X.C0FG2
            public final void LIZ(int i) {
                LinearLayoutManager linearLayoutManager2 = linearLayoutManager;
                if (linearLayoutManager2 != null) {
                    C0FG1 c0fg12 = c0fg1;
                    int iIntValue = 0;
                    for (int i2 = 0; i2 < ((ArrayList) c0fg12.LLILZ).size() && i2 < i; i2++) {
                        iIntValue += ((Integer) ListProtector.get(c0fg12.LLILZ, i2)).intValue();
                    }
                    linearLayoutManager2.scrollToPositionWithOffset(iIntValue + this.LLJILJIL, 0);
                }
            }
        });
        this.LLILLL = c0fg1;
        LIZIZ().addOnScrollListener(new AbstractC1585810rMx() { // from class: X.0e4X
            @Override // X.AbstractC1585810rMx
            public final void LJJIIZI(RecyclerView recyclerView, int i, int i2) {
                int iFindFirstVisibleItemPosition;
                C0FG1 c0fg12 = this.LL.LLILLL;
                if (c0fg12 != null) {
                    LinearLayoutManager linearLayoutManager2 = linearLayoutManager;
                    if (linearLayoutManager2 != null) {
                        iFindFirstVisibleItemPosition = linearLayoutManager2.findFirstVisibleItemPosition() - this.LL.LLJILJIL;
                    } else {
                        iFindFirstVisibleItemPosition = 0;
                    }
                    c0fg12.setRecycleViewPos(iFindFirstVisibleItemPosition);
                }
            }
        });
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
