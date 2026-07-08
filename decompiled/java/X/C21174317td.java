package X;

import com.bytedance.android.livesdk.model.message.AtmosphereTagInfo;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.AtmosphereTag;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.17td, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.slot.UsECExplanationCardSlot$onProductRefresh$2$5$1$1", f = "UsECExplanationCardSlot.kt", l = {}, m = "invokeSuspend")
public final class C21174317td extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ AbstractC21197217xK LL;
    public final /* synthetic */ AtmosphereTagInfo LLILLJJLI;
    public final /* synthetic */ AtmosphereTag LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21174317td(AbstractC21197217xK abstractC21197217xK, AtmosphereTagInfo atmosphereTagInfo, AtmosphereTag atmosphereTag, InterfaceC1364105Vn<? super C21174317td> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = abstractC21197217xK;
        this.LLILLJJLI = atmosphereTagInfo;
        this.LLILLL = atmosphereTag;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C21174317td(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("UsECExplanationCardSlot@7c95.onProductRefresh$2$5$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LJJIII(this.LLILLJJLI.tagType, this.LLILLL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("UsECExplanationCardSlot@7c95.onProductRefresh$2$5$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
