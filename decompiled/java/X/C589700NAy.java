package X;

import Y.ARunnableS78S0200000_9;
import android.content.Context;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AFwS285S0000000_2;
import kotlin.jvm.internal.AwS44S0500000_9;

/* JADX INFO: renamed from: X.0NAy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C589700NAy {
    public static final Executor LIZ;

    static {
        C01GW c01gw = C0AZA.LIZ;
        LIZ = ((Number) c01gw.getValue()).intValue() == 0 ? C823050WQl.LIZIZ() : ((Number) c01gw.getValue()).intValue() == 1 ? C786410Ut5.h4() : C786410Ut5.d4(((Number) c01gw.getValue()).intValue());
    }

    public static void LIZ(String str, Context context) {
        AFwS285S0000000_2 aFwS285S0000000_2 = AFwS285S0000000_2.get$arr$(49);
        AFwS195S0000000_9 aFwS195S0000000_9 = AFwS195S0000000_9.get$arr$(458);
        AFwS195S0000000_9 aFwS195S0000000_92 = AFwS195S0000000_9.get$arr$(459);
        C1325700kbQ c1325700kbQLIZLLL = C1325700kbQ.LIZLLL(UriProtector.parse(str));
        c1325700kbQLIZLLL.LJIIZILJ = null;
        C1325710kbR c1325710kbRLIZ = c1325700kbQLIZLLL.LIZ();
        final AwS44S0500000_9 awS44S0500000_9 = new AwS44S0500000_9(context, c1325710kbRLIZ, aFwS195S0000000_92, aFwS195S0000000_9, aFwS285S0000000_2, 2);
        C1322200kVm.LIZ().LJIILIIL(c1325710kbRLIZ).LIZJ(new C0HWJ() { // from class: X.0HWK
            @Override // X.C0HWJ
            public final void LJ(InterfaceC1320200kSY<Boolean> interfaceC1320200kSY) {
                awS44S0500000_9.invoke(Boolean.FALSE);
            }

            @Override // X.C0HWJ
            public final void LJFF(boolean z) {
                awS44S0500000_9.invoke(Boolean.valueOf(z));
            }
        }, LIZ);
    }

    public static void LIZIZ(C1325710kbR c1325710kbR, Context context, final Function0 function0, final Function2 function2) {
        C1325540kbA c1325540kbALIZ = C1322200kVm.LIZ();
        C1325700kbQ c1325700kbQLIZIZ = C1325700kbQ.LIZIZ(c1325710kbR);
        c1325700kbQLIZIZ.LIZIZ = EnumC1320950kTl.DISK_CACHE;
        AbstractC1321260kUG abstractC1321260kUGLJIIZILJ = c1325540kbALIZ.LJIIZILJ(c1325700kbQLIZIZ.LIZ(), context);
        final ScheduledFuture<?> scheduledFutureSchedule = C823050WQl.LJ().schedule(new ARunnableS78S0200000_9(abstractC1321260kUGLJIIZILJ, function2, 62), 3000L, TimeUnit.MILLISECONDS);
        abstractC1321260kUGLJIIZILJ.LIZJ(new AbstractC589620NAq() { // from class: X.0NAr
            @Override // X.AbstractC589620NAq
            public final void LJFF() {
                ScheduledFuture<?> scheduledFuture = scheduledFutureSchedule;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                function0.invoke();
                function2.invoke(Boolean.TRUE, null);
            }

            @Override // X.AbstractC589620NAq
            public final void LJ(InterfaceC1320200kSY<Void> interfaceC1320200kSY) {
                Throwable exc;
                ScheduledFuture<?> scheduledFuture = scheduledFutureSchedule;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                if (interfaceC1320200kSY == null || (exc = ((AbstractC1321260kUG) interfaceC1320200kSY).LIZLLL()) == null) {
                    exc = new Exception("Memory prefetch failed");
                }
                function2.invoke(Boolean.FALSE, exc);
            }
        }, LIZ);
    }
}
