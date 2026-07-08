package X;

import android.app.Activity;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06bx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.notification.banner.vh.DMPushBannerVH$updateDMPush$1$1", f = "DMPushBannerVH.kt", l = {}, m = "invokeSuspend")
public final class C1642706bx extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1890460zIK LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1642706bx(C1890460zIK c1890460zIK, InterfaceC1364105Vn<? super C1642706bx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1890460zIK;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1642706bx(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Unit unit;
        Function0<Unit> function0;
        C1C7U.LIZ("DMPushBannerVH@faf8.updateDMPush$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1777820wMe c1777820wMe = this.LL.LLIZ;
        if (c1777820wMe != null && (function0 = c1777820wMe.LLILLJJLI) != null) {
            function0.invoke();
        }
        Activity activityLIZ = C1388190mED.LIZ(this.LL.LL.getContext());
        if (activityLIZ != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
            c1389890mGx.LJIIIZ(2131831698);
            c1389890mGx.LJFF(R.raw.icon_tick_circle_fill);
            c1389890mGx.LJII(R.attr.a1h);
            c1389890mGx.LJIIJJI();
            unit = Unit.LIZ;
        } else {
            unit = null;
        }
        C1C7U.LIZIZ("DMPushBannerVH@faf8.updateDMPush$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
