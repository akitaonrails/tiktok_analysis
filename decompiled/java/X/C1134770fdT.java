package X;

import android.os.Handler;
import android.os.SystemClock;
import com.bytedance.android.livesdk.impl.revenue.strategy.base.TaskManagerV2;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0fdT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.impl.revenue.strategy.util.TaskWatchLiveDurationTracker$checkAndHandleCompletedTasks$1$1", f = "TaskWatchLiveDurationTracker.kt", l = {270}, m = "invokeSuspend")
public final class C1134770fdT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1134410fct LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ C1134790fdV LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1134770fdT(C1134410fct c1134410fct, long j, boolean z, String str, C1134790fdV c1134790fdV, InterfaceC1364105Vn<? super C1134770fdT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1134410fct;
        this.LLILLL = j;
        this.LLILZ = z;
        this.LLILZIL = str;
        this.LLILZLL = c1134790fdV;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1134770fdT(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TaskWatchLiveDurationTracker@186.checkAndHandleCompletedTasks$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            TaskManagerV2 taskManagerV2 = TaskManagerV2.LIZ;
            C1134410fct c1134410fct = this.LLILLJJLI;
            long j = this.LLILLL;
            this.LL = 1;
            obj = taskManagerV2.LJIJJLI(c1134410fct, j, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("TaskWatchLiveDurationTracker@186.checkAndHandleCompletedTasks$1$1");
                return objLJFF;
            }
        }
        final boolean zBooleanValue = ((Boolean) obj).booleanValue();
        Handler handlerLIZLLL = C1134760fdS.LIZLLL();
        final boolean z = this.LLILZ;
        final String str = this.LLILZIL;
        final C1134790fdV c1134790fdV = this.LLILZLL;
        C786410Ut5.LJJZZIII(handlerLIZLLL, new Runnable() { // from class: X.0fdU
            public final void LIZ() {
                if (zBooleanValue) {
                    if (z) {
                        C1134760fdS.LL.LJII(Collections.singletonList(str));
                        return;
                    }
                    C1134790fdV c1134790fdV2 = c1134790fdV;
                    c1134790fdV2.LIZLLL = false;
                    c1134790fdV2.LJFF = 0;
                    return;
                }
                C1134790fdV c1134790fdV3 = c1134790fdV;
                c1134790fdV3.LIZLLL = false;
                if (z) {
                    c1134790fdV3.LJ = SystemClock.elapsedRealtime() + Mp4ScreenVideoLoadTimeout.CONTROL;
                    return;
                }
                c1134790fdV3.LJFF = 0;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("checkAndHandleCompletedTasks: periodic report failed for taskId=");
                sbLIZ.append(str);
                sbLIZ.append(", dropped and wait for next interval.");
                C20441214yg.LJIIIZ("TaskWatchLiveDurationTracker", C2188811AlT.LIZIZ(sbLIZ));
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("TaskWatchLiveDurationTracker@186.checkAndHandleCompletedTasks$1$1$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("TaskWatchLiveDurationTracker@186.checkAndHandleCompletedTasks$1$1$1");
            }
        });
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TaskWatchLiveDurationTracker@186.checkAndHandleCompletedTasks$1$1");
        return unit;
    }
}
