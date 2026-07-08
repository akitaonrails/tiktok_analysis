package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.im.activestatus.impl.analytics.ActivityStatusDelegate;
import com.ss.android.ugc.aweme.im.saas.host.api.main.IMMainSAFLifecycle;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0ZE5, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.activestatus.impl.analytics.ActivityStatusAnalyticsImpl$trackActiveStatusShow$1$1", f = "ActivityStatusAnalyticsImpl.kt", l = {}, m = "invokeSuspend")
public final class C0ZE5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0ZE7 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0ZE5(C0ZE7 c0ze7, InterfaceC1364105Vn<? super C0ZE5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0ze7;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0ZE5(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        LifecycleOwner lifecycleOwnerLIZ;
        Lifecycle lifecycle;
        C1C7U.LIZ("ActivityStatusAnalyticsImpl@69d1.trackActiveStatusShow$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0ZE8 c0ze8 = C0ZE8.LIZ;
        C0ZE7 c0ze7 = this.LL;
        c0ze8.getClass();
        if (!C1572306Dp.LIZ(c0ze7.LIZJ)) {
            if (!Intrinsics.LJFF(c0ze7.LIZIZ, EnumC1910440zoY.INNER_PUSH.getValue()) && !Intrinsics.LJFF(c0ze7.LIZIZ, EnumC1910440zoY.DM_INNER_PUSH.getValue())) {
                LifecycleOwner lifecycleOwner = c0ze7.LIZ;
                if (lifecycleOwner != null) {
                    IMMainSAFLifecycle.LIZ.getClass();
                    IMMainSAFLifecycle value = C892550Yzt.LIZIZ.getValue();
                    if (value != null && (lifecycleOwnerLIZ = value.LIZ(lifecycleOwner)) != null && (lifecycle = lifecycleOwnerLIZ.getLifecycle()) != null && lifecycle.getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
                        Map<LifecycleOwner, C0ZE6> map = C0ZE8.LIZJ;
                        C0ZE6 activityStatusDelegate = (C0ZE6) ((LinkedHashMap) map).get(lifecycleOwner);
                        if (activityStatusDelegate == null) {
                            activityStatusDelegate = new ActivityStatusDelegate(lifecycleOwner);
                        }
                        map.put(lifecycleOwner, activityStatusDelegate);
                        activityStatusDelegate.LIZJ(new AwS558S0100000_14(lifecycleOwner, 1516));
                        if (Intrinsics.LJFF(c0ze7.LJII, Boolean.TRUE)) {
                            activityStatusDelegate.LIZLLL(c0ze7);
                        }
                        if (Intrinsics.LJFF(c0ze7.LIZIZ, EnumC1910440zoY.CHAT_CELL.getValue()) || Intrinsics.LJFF(c0ze7.LIZIZ, EnumC1910440zoY.CHAT_ROOM.getValue())) {
                            activityStatusDelegate.LJ(c0ze7);
                        }
                    }
                }
            } else {
                C0ZEB.LIZ(c0ze7);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ActivityStatusAnalyticsImpl@69d1.trackActiveStatusShow$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
