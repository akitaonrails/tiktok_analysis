package X;

import Y.AgS211S0200000_28;
import com.ss.android.ugc.aweme.inbox.widget.v2.ability.NotificationAbilityCenter;
import com.ss.android.ugc.aweme.notification.v2.viewmodel.NotificationCreatorResultViewModel;
import com.ss.android.ugc.aweme.notification.v2.widget.container.NotificationWidgetContainer;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0zHG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.ss.android.ugc.aweme.notification.v2.widget.container.NotificationWidgetContainer$initFilterButtonAssem$1$1", f = "NotificationWidgetContainer.kt", l = {280}, m = "invokeSuspend")
public final class C1889800zHG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ NotificationWidgetContainer LLILLJJLI;
    public final /* synthetic */ NotificationCreatorResultViewModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1889800zHG(NotificationWidgetContainer notificationWidgetContainer, NotificationCreatorResultViewModel notificationCreatorResultViewModel, InterfaceC1364105Vn<? super C1889800zHG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = notificationWidgetContainer;
        this.LLILLL = notificationCreatorResultViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1889800zHG(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C2252321DDq c2252321DDqX71;
        C1C7U.LIZ("NotificationWidgetContainer@b896.initFilterButtonAssem$1$1");
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
            NotificationAbilityCenter.INotificationFragmentAbility iNotificationFragmentAbilityBp = this.LLILLJJLI.bp();
            if (iNotificationFragmentAbilityBp != null && (c2252321DDqX71 = iNotificationFragmentAbilityBp.X71()) != null) {
                AgS211S0200000_28 agS211S0200000_28 = new AgS211S0200000_28(this.LLILLJJLI, this.LLILLL, 0);
                this.LL = 1;
                if (c2252321DDqX71.collect(agS211S0200000_28, this) == objLJFF) {
                    C1C7U.LIZIZ("NotificationWidgetContainer@b896.initFilterButtonAssem$1$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("NotificationWidgetContainer@b896.initFilterButtonAssem$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
