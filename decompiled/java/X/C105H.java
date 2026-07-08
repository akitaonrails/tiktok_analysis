package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.locationservices.LocationServicesManager;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS607S0100000_28;

/* JADX INFO: renamed from: X.105H, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C105H extends C109C implements InterfaceC724530SbT {
    public final C191848103q LLILZLL;
    public final Lifecycle LLIZ;

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

    @Override // X.C109C
    public final AnonymousClass1098 LJIIZILJ() {
        AnonymousClass1098 anonymousClass1098 = new AnonymousClass1098();
        anonymousClass1098.LIZIZ = new C105X(null, new C191884105a(102), 0, 11);
        return anonymousClass1098;
    }

    @Override // X.C109C, X.AbstractC191843103l
    public final void LJII() {
        super.LJII();
        LocationServicesManager locationServicesManager = LocationServicesManager.LIZ;
        AwS607S0100000_28 awS607S0100000_28 = new AwS607S0100000_28(this, 294);
        locationServicesManager.getClass();
        LocationServicesManager.LIZLLL(this, awS607S0100000_28);
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.LLIZ;
    }

    @Override // X.C109C
    public final List<AbstractC191840103i> LJIILIIL(List<AbstractC191840103i> list) {
        ArrayList arrayList = (ArrayList) list;
        if (arrayList.isEmpty()) {
            return list;
        }
        arrayList.add(new C191847103p(this.LLILZLL.LIZ.getString(2131844782), new C105C(this)));
        return list;
    }

    @Override // X.C109C
    public final boolean LJIILL(boolean z) {
        C1208440hYI.LIZ.getClass();
        if (C1208440hYI.LIZIZ.LJIIJ() && z) {
            return true;
        }
        return false;
    }

    public C105H(C191848103q c191848103q, C107N c107n) {
        String str = c107n.LIZ;
        AwS607S0100000_28 awS607S0100000_28 = new AwS607S0100000_28(c107n, 293);
        C105L c105l = new C105L();
        c105l.LIZ = str;
        awS607S0100000_28.invoke(c105l);
        super(c105l, c191848103q);
        this.LLILZLL = c191848103q;
        this.LLIZ = c191848103q.LIZJ.getLifecycle();
    }

    @Override // X.C109C
    public final boolean LJIJ(int i, View view) {
        String string;
        Activity activityLIZ = C1388190mED.LIZ(this.LLILZLL.LIZ);
        if (activityLIZ != null) {
            if (i != 1) {
                if (i == 2) {
                    LocationServicesManager.LIZ.getClass();
                    LocationServicesManager.LJI(activityLIZ);
                }
            } else {
                LocationServicesManager locationServicesManager = LocationServicesManager.LIZ;
                Bundle bundle = this.LLILZLL.LJ;
                if (bundle == null || (string = bundle.getString("enter_from")) == null) {
                    string = "";
                }
                locationServicesManager.getClass();
                LocationServicesManager.LJII(activityLIZ, string);
                return true;
            }
        }
        return true;
    }

    @Override // X.C109C
    public final CharSequence LJIILJJIL(Context context, CharSequence charSequence, int i) {
        if (i == 2) {
            LocationServicesManager locationServicesManager = LocationServicesManager.LIZ;
            LifecycleOwner lifecycleOwner = this.LLILZLL.LIZJ;
            locationServicesManager.getClass();
            return LocationServicesManager.LIZ(context, lifecycleOwner, context.getString(2131839200), context.getString(2131844779), LocationServicesManager.LIZJ);
        }
        return charSequence;
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
