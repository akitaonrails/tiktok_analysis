package androidx.lifecycle;

import X.AbstractC1563340qmi;
import X.C099R;
import X.C09AX;
import X.C09DV;
import X.C0PEM;
import X.C155000ia;
import X.C1565730qqZ;
import X.C199Y;
import X.C19EG;
import X.C1DFH;
import X.C2107308Nj;
import X.C23118094a;
import X.C23250099c;
import X.EnumC682280QpW;
import X.InterfaceC1364105Vn;
import X.InterfaceC497601wk;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: loaded from: classes22.dex */
public final class LifecycleCoroutineScopeImpl extends LifecycleCoroutineScope implements LifecycleEventObserver {
    public final CoroutineContext coroutineContext;
    public final Lifecycle lifecycle;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        androidx_lifecycle_LifecycleCoroutineScopeImpl_com_ss_android_ugc_aweme_main_lancet_SAFTikTokLancet_lifecycleCoroutineOnStateChanged(this, lifecycleOwner, event);
    }

    public final void register() {
        androidx_lifecycle_LifecycleCoroutineScopeImpl_com_ss_android_ugc_aweme_main_lancet_SAFTikTokLancet_register(this);
    }

    public final void androidx_lifecycle_LifecycleCoroutineScopeImpl__register$___twin___() {
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(this, C2107308Nj.LIZ.LLIILII(), null, new AnonymousClass1(null), 2);
    }

    @Override // androidx.lifecycle.LifecycleCoroutineScope, X.InterfaceC497601wk
    public CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }

    @Override // androidx.lifecycle.LifecycleCoroutineScope
    public Lifecycle getLifecycle$lifecycle_common() {
        return this.lifecycle;
    }

    /* JADX INFO: renamed from: androidx.lifecycle.LifecycleCoroutineScopeImpl$register$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes.dex */
    @C09DV(c = "androidx.lifecycle.LifecycleCoroutineScopeImpl$register$1", f = "Lifecycle.kt", l = {}, m = "invokeSuspend")
    public final class AnonymousClass1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
        public /* synthetic */ Object L$0;
        public int label;

        public AnonymousClass1(InterfaceC1364105Vn<? super AnonymousClass1> interfaceC1364105Vn) {
            super(2, interfaceC1364105Vn);
        }

        @Override // njp.a
        public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
            AnonymousClass1 anonymousClass1 = LifecycleCoroutineScopeImpl.this.new AnonymousClass1(interfaceC1364105Vn);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
            return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
        }

        @Override // njp.a
        public final Object invokeSuspend(Object obj) {
            C099R.LJFF();
            if (this.label == 0) {
                C155000ia.LIZIZ(obj);
                InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.L$0;
                if (LifecycleCoroutineScopeImpl.this.getLifecycle$lifecycle_common().getCurrentState().compareTo(Lifecycle.State.INITIALIZED) >= 0) {
                    LifecycleCoroutineScopeImpl.this.getLifecycle$lifecycle_common().addObserver(LifecycleCoroutineScopeImpl.this);
                } else {
                    C23118094a.LIZJ(interfaceC497601wk.getCoroutineContext(), null);
                }
                return Unit.LIZ;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public static void androidx_lifecycle_LifecycleCoroutineScopeImpl_com_ss_android_ugc_aweme_main_lancet_SAFTikTokLancet_register(LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl) {
        Lifecycle lifecycle = lifecycleCoroutineScopeImpl.lifecycle;
        if (lifecycle instanceof AbstractC1563340qmi) {
            AbstractC1563340qmi abstractC1563340qmi = (AbstractC1563340qmi) lifecycle;
            EnumC682280QpW enumC682280QpW = EnumC682280QpW.MAIN;
            if (abstractC1563340qmi.LJI(enumC682280QpW)) {
                Object obj = abstractC1563340qmi.LL;
                if (obj instanceof C199Y) {
                    Integer numLIZ = C1565730qqZ.LIZ(enumC682280QpW.getValue(), (Context) obj);
                    if (numLIZ != null) {
                        lifecycleCoroutineScopeImpl.androidx_lifecycle_LifecycleCoroutineScopeImpl__register$___twin___();
                        C1565730qqZ.LIZIZ(numLIZ.intValue(), (Context) abstractC1563340qmi.LL);
                        return;
                    }
                }
            }
        }
        lifecycleCoroutineScopeImpl.androidx_lifecycle_LifecycleCoroutineScopeImpl__register$___twin___();
    }

    public LifecycleCoroutineScopeImpl(Lifecycle lifecycle, CoroutineContext coroutineContext) {
        this.lifecycle = lifecycle;
        this.coroutineContext = coroutineContext;
        if (getLifecycle$lifecycle_common().getCurrentState() == Lifecycle.State.DESTROYED) {
            C23118094a.LIZJ(getCoroutineContext(), null);
        }
    }

    public void androidx_lifecycle_LifecycleCoroutineScopeImpl__onStateChanged$___twin___(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (getLifecycle$lifecycle_common().getCurrentState().compareTo(Lifecycle.State.DESTROYED) <= 0) {
            getLifecycle$lifecycle_common().removeObserver(this);
            C23118094a.LIZJ(getCoroutineContext(), null);
        }
    }

    public static void androidx_lifecycle_LifecycleCoroutineScopeImpl_com_ss_android_ugc_aweme_main_lancet_SAFTikTokLancet_lifecycleCoroutineOnStateChanged(LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        Context context;
        Integer numLIZ;
        Lifecycle lifecycle = lifecycleCoroutineScopeImpl.lifecycle;
        if (lifecycle instanceof AbstractC1563340qmi) {
            AbstractC1563340qmi abstractC1563340qmi = (AbstractC1563340qmi) lifecycle;
            EnumC682280QpW enumC682280QpW = EnumC682280QpW.GET_CURRENT_STATE;
            if (abstractC1563340qmi.LJI(enumC682280QpW)) {
                Object obj = abstractC1563340qmi.LL;
                if ((obj instanceof C19EG) && (numLIZ = C1565730qqZ.LIZ(enumC682280QpW.getValue(), (context = (Context) obj))) != null) {
                    lifecycleCoroutineScopeImpl.androidx_lifecycle_LifecycleCoroutineScopeImpl__onStateChanged$___twin___(lifecycleOwner, event);
                    C1565730qqZ.LIZIZ(numLIZ.intValue(), context);
                    return;
                }
            }
        }
        lifecycleCoroutineScopeImpl.androidx_lifecycle_LifecycleCoroutineScopeImpl__onStateChanged$___twin___(lifecycleOwner, event);
    }
}
