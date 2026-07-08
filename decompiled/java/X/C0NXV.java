package X;

import com.ss.android.ugc.aweme.im.activity.status.sdk.core.ActivityStatusContainer;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NXV, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.activity.status.sdk.core.ActivityStatusContainer$initService$1", f = "ActivityStatusContainer.kt", l = {}, m = "invokeSuspend")
public final class C0NXV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InterfaceC595670NXx LL;
    public final /* synthetic */ ActivityStatusContainer LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NXV(InterfaceC595670NXx interfaceC595670NXx, ActivityStatusContainer activityStatusContainer, InterfaceC1364105Vn<? super C0NXV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = interfaceC595670NXx;
        this.LLILLJJLI = activityStatusContainer;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0NXV(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ActivityStatusContainer@bcc.initService$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LIZIZ(this.LLILLJJLI);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ActivityStatusContainer@bcc.initService$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
