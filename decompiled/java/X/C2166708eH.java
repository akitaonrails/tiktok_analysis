package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONException;

/* JADX INFO: renamed from: X.08eH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.bytedance.ies.ugc.aweme.commercialize.search.util.SearchAdAnchorPromotionFetcher$fetchPromotionInfo$1$3$1", f = "SearchAdAnchorPromotionFetcher.kt", l = {}, m = "invokeSuspend")
public final class C2166708eH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1007730cKZ LL;
    public final /* synthetic */ Integer LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2166708eH(C1007730cKZ c1007730cKZ, Integer num, String str, InterfaceC1364105Vn<? super C2166708eH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1007730cKZ;
        this.LLILLJJLI = num;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2166708eH(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        C1C7U.LIZ("SearchAdAnchorPromotionFetcher@9806.fetchPromotionInfo$1$3$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LIZ(this.LLILLJJLI);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchAdAnchorPromotionFetcher@9806.fetchPromotionInfo$1$3$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
