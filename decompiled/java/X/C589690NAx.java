package X;

import Y.ARunnableS78S0200000_9;
import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS440S0200000_4;

/* JADX INFO: renamed from: X.0NAx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C589690NAx {
    public static final Executor LIZ;

    static {
        LIZ = C0BDO.LIZ() == 0 ? C823050WQl.LIZIZ() : C0BDO.LIZ() == 1 ? C786410Ut5.h4() : C786410Ut5.d4(C0BDO.LIZ());
    }

    public static void LIZ(C1325710kbR c1325710kbR, Context context, final Function0 function0, C589710NAz c589710NAz, Function2 function2) {
        C1325540kbA c1325540kbALIZ = C1322200kVm.LIZ();
        C1325700kbQ c1325700kbQLIZIZ = C1325700kbQ.LIZIZ(c1325710kbR);
        c1325700kbQLIZIZ.LIZIZ = EnumC1320950kTl.DISK_CACHE;
        AbstractC1321260kUG abstractC1321260kUGLJIIZILJ = c1325540kbALIZ.LJIIZILJ(c1325700kbQLIZIZ.LIZ(), context);
        if (c589710NAz != null) {
            c589710NAz.LIZ(abstractC1321260kUGLJIIZILJ);
        }
        final AwS440S0200000_4 awS440S0200000_4 = new AwS440S0200000_4(new AtomicBoolean(false), (AtomicBoolean) function2, (Function2<? super Boolean, ? super Throwable, Unit>) 9);
        final ScheduledFuture<?> scheduledFutureSchedule = C823050WQl.LJ().schedule(new ARunnableS78S0200000_9(abstractC1321260kUGLJIIZILJ, awS440S0200000_4, 47), 3000L, TimeUnit.MILLISECONDS);
        abstractC1321260kUGLJIIZILJ.LIZJ(new AbstractC589670NAv() { // from class: X.0NAw
            @Override // X.AbstractC589670NAv
            public final void LJFF() {
                ScheduledFuture<?> scheduledFuture = scheduledFutureSchedule;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                function0.invoke();
                awS440S0200000_4.invoke(Boolean.TRUE, null);
            }

            @Override // X.AbstractC589670NAv
            public final void LJ(InterfaceC1320200kSY<Void> interfaceC1320200kSY) {
                Throwable exc;
                ScheduledFuture<?> scheduledFuture = scheduledFutureSchedule;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                if (interfaceC1320200kSY == null || (exc = ((AbstractC1321260kUG) interfaceC1320200kSY).LIZLLL()) == null) {
                    exc = new Exception("Memory prefetch failed");
                }
                awS440S0200000_4.invoke(Boolean.FALSE, exc);
            }
        }, LIZ);
    }
}
