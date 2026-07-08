package X;

import com.bytedance.touchpoint.api.interfaces.INetworkApi;
import com.bytedance.touchpoint.api.model.Bubble;
import com.bytedance.touchpoint.api.model.TaskDoneReponse;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.common.util.concurrent.ListenableFuture;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0S0R, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.bytedance.touchpoint.core.bubble.BubbleManagerV2$reportNotification$1$1", f = "BubbleManagerV2.kt", l = {}, m = "invokeSuspend")
public final class C0S0R extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ Bubble LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0S0R(Bubble bubble, int i, InterfaceC1364105Vn<? super C0S0R> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = bubble;
        this.LLILLL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0S0R c0s0r = new C0S0R(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
        c0s0r.LL = obj;
        return c0s0r;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        ListenableFuture<TaskDoneReponse> listenableFutureRequestOnNotificationAction;
        INetworkApi iNetworkApiLIZJ;
        C1C7U.LIZ("BubbleManagerV2@6066.reportNotification$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Bubble bubble = this.LLILLJJLI;
        if (bubble != null && (str = bubble.notificationId) != null) {
            int i = this.LLILLL;
            try {
                InterfaceC1897260zTI interfaceC1897260zTILIZIZ = C1619720sFe.LIZ.LIZIZ();
                if (interfaceC1897260zTILIZIZ != null && (iNetworkApiLIZJ = interfaceC1897260zTILIZIZ.LIZJ()) != null) {
                    String str2 = bubble.notificationName;
                    if (str2 == null) {
                        str2 = "";
                    }
                    listenableFutureRequestOnNotificationAction = iNetworkApiLIZJ.requestOnNotificationAction(str, i, str2, "", 1, 0, null);
                } else {
                    listenableFutureRequestOnNotificationAction = null;
                }
                C189200o6.m2constructorimpl(listenableFutureRequestOnNotificationAction);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BubbleManagerV2@6066.reportNotification$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
