package X;

import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.header.PdpHeadNavBarWidget;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08gn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.header.PdpHeadNavBarWidget$showFavoriteTip$3", f = "PdpHeadNavBarWidget.kt", l = {1277}, m = "invokeSuspend")
public final class C2182308gn extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ PdpHeadNavBarWidget LLILLL;
    public final /* synthetic */ View LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2182308gn(long j, PdpHeadNavBarWidget pdpHeadNavBarWidget, View view, InterfaceC1364105Vn<? super C2182308gn> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = j;
        this.LLILLL = pdpHeadNavBarWidget;
        this.LLILZ = view;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2182308gn(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PdpHeadNavBarWidget@7218.showFavoriteTip$3");
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
                C1C7U.LIZIZ("PdpHeadNavBarWidget@7218.showFavoriteTip$3");
                return objLJFF;
            }
        }
        this.LLILLL.LJIL(R.raw.icon_ellipsis_horizontal, this.LLILZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PdpHeadNavBarWidget@7218.showFavoriteTip$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
