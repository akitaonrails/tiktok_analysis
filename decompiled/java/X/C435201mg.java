package X;

import android.app.Activity;
import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01mg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.utils.TopViewUtils$topViewLiveOpen$1$onResponse$1", f = "TopViewUtils.kt", l = {}, m = "invokeSuspend")
public final class C435201mg extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Context LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C435201mg(Context context, InterfaceC1364105Vn<? super C435201mg> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C435201mg(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TopViewUtils@5e6a.topViewLiveOpen$1$onResponse$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Activity activityLIZ = C1388190mED.LIZ(this.LL);
        if (activityLIZ != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
            c1389890mGx.LJIIIZ(2131857712);
            c1389890mGx.LJIIJJI();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TopViewUtils@5e6a.topViewLiveOpen$1$onResponse$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
