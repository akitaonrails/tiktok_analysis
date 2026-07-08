package X;

import com.bytedance.touchpoint.api.interfaces.INetworkApi;
import com.bytedance.touchpoint.api.model.DramaBottomButton;
import com.bytedance.touchpoint.api.model.TaskDoneReponse;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.common.util.concurrent.ListenableFuture;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0S0Q, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.aweme.service.ShortDramaService$showDramaBottomButton$2", f = "ShortDramaService.kt", l = {}, m = "invokeSuspend")
public final class C0S0Q extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ DramaBottomButton LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0S0Q(DramaBottomButton dramaBottomButton, InterfaceC1364105Vn<? super C0S0Q> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = dramaBottomButton;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0S0Q c0s0q = new C0S0Q(this.LLILLJJLI, interfaceC1364105Vn);
        c0s0q.LL = obj;
        return c0s0q;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        ListenableFuture<TaskDoneReponse> listenableFutureRequestOnNotificationAction;
        INetworkApi iNetworkApiLIZJ;
        int iIntValue;
        C1C7U.LIZ("ShortDramaService@2b20.showDramaBottomButton$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        DramaBottomButton dramaBottomButton = this.LLILLJJLI;
        if (dramaBottomButton != null && (str = dramaBottomButton.notificationId) != null) {
            try {
                InterfaceC1897260zTI interfaceC1897260zTILIZIZ = C1619720sFe.LIZ.LIZIZ();
                if (interfaceC1897260zTILIZIZ != null && (iNetworkApiLIZJ = interfaceC1897260zTILIZIZ.LIZJ()) != null) {
                    Integer num = dramaBottomButton.showTimes;
                    if (num != null) {
                        iIntValue = num.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    listenableFutureRequestOnNotificationAction = iNetworkApiLIZJ.requestOnNotificationAction(str, 2, "short_drama_feed_bottom_button", "", iIntValue, 0, null);
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
        C1C7U.LIZIZ("ShortDramaService@2b20.showDramaBottomButton$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
