package X;

import android.view.View;
import com.bytedance.router.SmartRouter;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS228S0000000_1;

/* JADX INFO: renamed from: X.03Ky, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.module.usexpress.summary.USHalfPageOrderSummaryFragment$updateBillSummaryData$4$1$1", f = "USHalfPageOrderSummaryFragment.kt", l = {}, m = "invokeSuspend")
public final class C827003Ky extends C09AX implements InterfaceC1631620sYq<InterfaceC497601wk, View, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ View LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C827003Ky(View view, String str, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = view;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("USHalfPageOrderSummaryFragment@c17a.updateBillSummaryData$4$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1748720vbi.LIZLLL((View) this.LL, new C10516049i(), AFwS228S0000000_1.get$arr$(845));
        String str = this.LLILLJJLI;
        if (str != null) {
            SmartRouter.buildRoute(this.LLILLL.getContext(), str).open();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("USHalfPageOrderSummaryFragment@c17a.updateBillSummaryData$4$1$1");
        return unit;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, View view, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        String str = this.LLILLJJLI;
        C827003Ky c827003Ky = new C827003Ky(this.LLILLL, str, interfaceC1364105Vn);
        c827003Ky.LL = view;
        return c827003Ky.invokeSuspend(Unit.LIZ);
    }
}
