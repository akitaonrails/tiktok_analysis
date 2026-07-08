package X;

import android.app.Activity;
import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NRl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.broadcaster.duringlive.slot.popcard.click.BroadcastShoppingBagCardClickV0$pin$2$1", f = "BroadcastShoppingBagCardClickV0.kt", l = {}, m = "invokeSuspend")
public final class C593990NRl extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C594060NRs LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C593990NRl(C594060NRs c594060NRs, String str, InterfaceC1364105Vn<? super C593990NRl> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c594060NRs;
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C593990NRl(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Unit unit;
        Context context;
        Activity activityLIZ;
        C1C7U.LIZ("BroadcastShoppingBagCardClickV0@5a3.pin$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        T t = this.LL.LIZ.LLILZIL;
        if (t != 0 && (context = t.getContext()) != null && (activityLIZ = C1388190mED.LIZ(context)) != null) {
            String str = this.LLILLJJLI;
            C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
            c1389890mGx.LJIIJ(str);
            c1389890mGx.LJIIJJI();
            unit = Unit.LIZ;
        } else {
            unit = null;
        }
        C1C7U.LIZIZ("BroadcastShoppingBagCardClickV0@5a3.pin$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
