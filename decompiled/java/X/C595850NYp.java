package X;

import com.ss.android.ugc.aweme.im.activestatus.impl.IMActiveStatusImpl;
import com.ss.android.ugc.aweme.im.activity.status.sdk.api.ActivityStatusService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NYp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.activestatus.impl.IMActiveStatusImpl$fetchActivityStatus$1", f = "IMActiveStatusImpl.kt", l = {}, m = "invokeSuspend")
public final class C595850NYp extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ IMActiveStatusImpl LL;
    public final /* synthetic */ AbstractC595720NYc LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C595850NYp(IMActiveStatusImpl iMActiveStatusImpl, AbstractC595720NYc abstractC595720NYc, InterfaceC1364105Vn<? super C595850NYp> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = iMActiveStatusImpl;
        this.LLILLJJLI = abstractC595720NYc;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C595850NYp(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMActiveStatusImpl@eff9.fetchActivityStatus$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LJIILLIIL();
        ActivityStatusService.LIZ.getClass();
        C595830NYn.LIZ().LJI(this.LLILLJJLI);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IMActiveStatusImpl@eff9.fetchActivityStatus$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
