package X;

import com.ss.android.ugc.aweme.ecommercelive.common.biz.sea.billboard.model.SeaLiveBillboard;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ndd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.common.biz.sea.billboard.BaseSeaLiveBillboardWidget$displayBillboardOrEffect$1", f = "BaseSeaLiveBillboardWidget.kt", l = {}, m = "invokeSuspend")
public final class C598470Ndd extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ AbstractC1732680vBq LL;
    public final /* synthetic */ List<SeaLiveBillboard> LLILLJJLI;
    public final /* synthetic */ Number LLILLL;
    public final /* synthetic */ InterfaceC1732650vBn LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C598470Ndd(AbstractC1732680vBq abstractC1732680vBq, List<SeaLiveBillboard> list, Number number, InterfaceC1732650vBn interfaceC1732650vBn, InterfaceC1364105Vn<? super C598470Ndd> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = abstractC1732680vBq;
        this.LLILLJJLI = list;
        this.LLILLL = number;
        this.LLILZ = interfaceC1732650vBn;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C598470Ndd(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BaseSeaLiveBillboardWidget@4f6b.displayBillboardOrEffect$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.n(this.LLILLJJLI, this.LLILLL, this.LLILZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BaseSeaLiveBillboardWidget@4f6b.displayBillboardOrEffect$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
