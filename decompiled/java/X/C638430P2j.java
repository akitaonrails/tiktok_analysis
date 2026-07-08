package X;

import com.ss.android.ugc.aweme.inbox.skylight.InboxSkylightWidgetV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0P2j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.skylight.InboxSkylightWidgetV2$makeSkylightRequestViaCoordinator$1$1$2", f = "InboxSkylightWidgetV2.kt", l = {}, m = "invokeSuspend")
public final class C638430P2j extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InboxSkylightWidgetV2 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C638430P2j(InboxSkylightWidgetV2 inboxSkylightWidgetV2, InterfaceC1364105Vn<? super C638430P2j> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = inboxSkylightWidgetV2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C638430P2j(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("InboxSkylightWidgetV2@8936.makeSkylightRequestViaCoordinator$1$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.Co(C1889360zGY.LIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("InboxSkylightWidgetV2@8936.makeSkylightRequestViaCoordinator$1$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
