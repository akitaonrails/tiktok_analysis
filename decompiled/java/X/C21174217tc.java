package X;

import com.bytedance.android.livesdk.model.message.AtmosphereTagInfo;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.AtmosphereTag;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.17tc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.common.infra.popcard.slot.ECExplanationCardSlotV4$onProductRefresh$2$5$1$1", f = "ECExplanationCardSlotV4.kt", l = {}, m = "invokeSuspend")
public final class C21174217tc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ AbstractC21197117xJ LL;
    public final /* synthetic */ AtmosphereTagInfo LLILLJJLI;
    public final /* synthetic */ AtmosphereTag LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21174217tc(AbstractC21197117xJ abstractC21197117xJ, AtmosphereTagInfo atmosphereTagInfo, AtmosphereTag atmosphereTag, InterfaceC1364105Vn<? super C21174217tc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = abstractC21197117xJ;
        this.LLILLJJLI = atmosphereTagInfo;
        this.LLILLL = atmosphereTag;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C21174217tc(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ECExplanationCardSlotV4@5327.onProductRefresh$2$5$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LJJIJ(this.LLILLJJLI.tagType, this.LLILLL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ECExplanationCardSlotV4@5327.onProductRefresh$2$5$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
