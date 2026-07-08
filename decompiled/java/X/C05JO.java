package X;

import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.widget.SeaPdpHeadNavBarWidget;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05JO, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.widget.SeaPdpHeadNavBarWidget$showFavoriteTip$2", f = "SeaPdpHeadNavBarWidget.kt", l = {1145}, m = "invokeSuspend")
public final class C05JO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ SeaPdpHeadNavBarWidget LLILLL;
    public final /* synthetic */ View LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05JO(long j, SeaPdpHeadNavBarWidget seaPdpHeadNavBarWidget, View view, InterfaceC1364105Vn<? super C05JO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = j;
        this.LLILLL = seaPdpHeadNavBarWidget;
        this.LLILZ = view;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05JO(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SeaPdpHeadNavBarWidget@d989.showFavoriteTip$2");
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
            long j = this.LLILLJJLI;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("SeaPdpHeadNavBarWidget@d989.showFavoriteTip$2");
                return objLJFF;
            }
        }
        this.LLILLL.LJJI(R.raw.icon_ellipsis_horizontal, this.LLILZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SeaPdpHeadNavBarWidget@d989.showFavoriteTip$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
