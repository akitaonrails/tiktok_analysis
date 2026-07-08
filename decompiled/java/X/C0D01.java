package X;

import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.recommend.dto.RecommendApiRequestDto;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.recommend.model.UcpRecommendationItem;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0D01, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ucp.impl.data.recommend.RecommendRepository$fetchRecommendationSeedsByShopId$2", f = "RecommendRepository.kt", l = {125}, m = "invokeSuspend")
public final class C0D01 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends List<? extends UcpRecommendationItem>>>, Object> {
    public int LL;
    public final /* synthetic */ C0D0E LLILLJJLI;
    public final /* synthetic */ Map<String, String> LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0D01(C0D0E c0d0e, Map<String, String> map, String str, InterfaceC1364105Vn<? super C0D01> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0d0e;
        this.LLILLL = map;
        this.LLILZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0D01(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLJIIIIZZ;
        C1C7U.LIZ("RecommendRepository@cb16.fetchRecommendationSeedsByShopId$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
                objLJIIIIZZ = ((C189200o6) obj).m10unboximpl();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C0D0E c0d0e = this.LLILLJJLI;
            String str = this.LLILLL.get("external_product_id");
            if (str == null) {
                str = "";
            }
            String str2 = this.LLILZ;
            Map<String, String> map = this.LLILLL;
            c0d0e.getClass();
            RecommendApiRequestDto recommendApiRequestDtoLIZ = C0D0E.LIZ(str, null, str2, map);
            C0D0E c0d0e2 = this.LLILLJJLI;
            this.LL = 1;
            objLJIIIIZZ = c0d0e2.LJIIIIZZ(recommendApiRequestDtoLIZ, "shop", this);
            if (objLJIIIIZZ == objLJFF) {
                C1C7U.LIZIZ("RecommendRepository@cb16.fetchRecommendationSeedsByShopId$2");
                return objLJFF;
            }
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objLJIIIIZZ);
        C1C7U.LIZIZ("RecommendRepository@cb16.fetchRecommendationSeedsByShopId$2");
        return c189200o6M1boximpl;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends List<? extends UcpRecommendationItem>>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
