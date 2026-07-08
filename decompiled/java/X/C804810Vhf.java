package X;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.ICrashCallback;
import com.bytedance.crash.Npth;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Vhf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.checkpoint.CheckPointExitInfoHelper$getExitInfoAndResetRepo$1", f = "CheckPointExitService.kt", l = {}, m = "invokeSuspend")
public final class C804810Vhf extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C804810Vhf(InterfaceC1364105Vn<? super C804810Vhf> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C804810Vhf(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CheckPointExitInfoHelper@daaa.getExitInfoAndResetRepo$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C804770Vhb c804770Vhb = C804770Vhb.LIZ;
        C804770Vhb.LJI().clear();
        Npth.registerCrashCallback(new ICrashCallback() { // from class: X.0Vha
            @Override // com.bytedance.crash.ICrashCallback
            public final void onCrash(CrashType crashType, String str, Thread thread) {
                C804770Vhb c804770Vhb2 = C804770Vhb.LIZ;
                C804770Vhb.LJI().storeLong("exit_by_exception_time", System.currentTimeMillis());
                int i = C803980VgK.LIZ[crashType.ordinal()];
                int i2 = 2;
                if (i != 1) {
                    if (i != 2) {
                        i2 = 1;
                    } else {
                        i2 = 3;
                    }
                }
                C804770Vhb.LJI().storeInt("exit_exception", i2);
            }
        }, CrashType.ALL);
        C2214201BlK.LIZLLL().LJJLJLI(new C09JN() { // from class: X.0Vhc
            @Override // X.C09JN
            public final void accept(Object obj2) {
                C1C7U.LIZ("CheckPointExitInfoHelper@daaa.resetRepo$disposable$1");
                Boolean bool = (Boolean) obj2;
                if (!Intrinsics.LJFF(bool, Boolean.valueOf(C804770Vhb.LJIIIIZZ))) {
                    C804770Vhb.LJIIIIZZ = bool.booleanValue();
                    C804770Vhb c804770Vhb2 = C804770Vhb.LIZ;
                    C804770Vhb.LJI().storeLong("in_background_time", System.currentTimeMillis());
                }
                if (!bool.booleanValue() && C804770Vhb.LJIIIZ) {
                    C804770Vhb.LJIIIZ = false;
                    C804770Vhb c804770Vhb3 = C804770Vhb.LIZ;
                    C804770Vhb.LJI().storeBoolean("low_memory", false);
                }
                C1C7U.LIZIZ("CheckPointExitInfoHelper@daaa.resetRepo$disposable$1");
            }
        });
        Activity topActivity = ActivityStack.getTopActivity();
        if (topActivity != null) {
            C786410Ut5.u4(topActivity.getApplication(), new ComponentCallbacks2() { // from class: X.0Vhe
                @Override // android.content.ComponentCallbacks
                public final void onConfigurationChanged(Configuration configuration) {
                }

                @Override // android.content.ComponentCallbacks
                public final void onLowMemory() {
                }

                @Override // android.content.ComponentCallbacks2
                public final void onTrimMemory(int i) {
                    if (i >= 80 && !C804770Vhb.LJIIIZ) {
                        C804770Vhb.LJIIIZ = true;
                        C804770Vhb c804770Vhb2 = C804770Vhb.LIZ;
                        C804770Vhb.LJI().storeBoolean("low_memory", true);
                    }
                    C804770Vhb c804770Vhb3 = C804770Vhb.LIZ;
                    C804770Vhb.LJI().storeLong("low_memory_time", System.currentTimeMillis());
                }
            });
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CheckPointExitInfoHelper@daaa.getExitInfoAndResetRepo$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C804810Vhf(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
