package X;

import android.app.Activity;
import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NRr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.common.infra.popcard.click.CouponCardClickListener$toastMsg$2", f = "CouponCardClickListener.kt", l = {}, m = "invokeSuspend")
public final class C594050NRr extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C594180NSe LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Integer LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C594050NRr(C594180NSe c594180NSe, String str, Integer num, InterfaceC1364105Vn<? super C594050NRr> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c594180NSe;
        this.LLILLJJLI = str;
        this.LLILLL = num;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C594050NRr(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Unit unit;
        Context context;
        Activity activityLIZ;
        C1C7U.LIZ("CouponCardClickListener@b2d3.toastMsg$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        T t = this.LL.LIZIZ.LLILZIL;
        if (t != 0 && (context = t.getContext()) != null && (activityLIZ = C1388190mED.LIZ(context)) != null) {
            String string = this.LLILLJJLI;
            Integer num = this.LLILLL;
            if (string.length() == 0 && num != null) {
                string = activityLIZ.getResources().getString(num.intValue());
            }
            C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
            c1389890mGx.LJIIJ(string);
            c1389890mGx.LJIIJJI();
            unit = Unit.LIZ;
        } else {
            unit = null;
        }
        C1C7U.LIZIZ("CouponCardClickListener@b2d3.toastMsg$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
