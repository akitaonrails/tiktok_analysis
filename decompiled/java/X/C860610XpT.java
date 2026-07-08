package X;

import Y.AgS308S0100000_28;
import com.ss.android.ugc.aweme.inbox.widget.v2.ability.NotificationAbilityCenter;
import com.ss.android.ugc.aweme.notification.v2.widget.container.NotificationUserCardWidgetContainer;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0XpT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.notification.v2.widget.container.NotificationUserCardWidgetContainer$onCreate$1", f = "NotificationUserCardWidgetContainer.kt", l = {81}, m = "invokeSuspend")
public final class C860610XpT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ NotificationUserCardWidgetContainer LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C860610XpT(NotificationUserCardWidgetContainer notificationUserCardWidgetContainer, InterfaceC1364105Vn<? super C860610XpT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = notificationUserCardWidgetContainer;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C860610XpT(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC332260D0u interfaceC332260D0uRK1;
        C1C7U.LIZ("NotificationUserCardWidgetContainer@2904.onCreate$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            NotificationAbilityCenter.INotificationWidgetContainerAbility iNotificationWidgetContainerAbility = (NotificationAbilityCenter.INotificationWidgetContainerAbility) this.LLILLJJLI.LLJJ.getValue();
            if (iNotificationWidgetContainerAbility != null && (interfaceC332260D0uRK1 = iNotificationWidgetContainerAbility.RK1()) != null) {
                AgS308S0100000_28 agS308S0100000_28 = new AgS308S0100000_28(this.LLILLJJLI, 11);
                this.LL = 1;
                if (interfaceC332260D0uRK1.collect(agS308S0100000_28, this) == objLJFF) {
                    C1C7U.LIZIZ("NotificationUserCardWidgetContainer@2904.onCreate$1");
                    return objLJFF;
                }
            } else {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("NotificationUserCardWidgetContainer@2904.onCreate$1");
                return unit;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
