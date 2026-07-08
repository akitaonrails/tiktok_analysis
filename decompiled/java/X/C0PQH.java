package X;

import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.model.EcClickRecommendProductsResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0PQH, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.general.clickrecommend.network.EcClickRecommendDataExecutor$sendRequest$1$1$5", f = "EcClickRecommendDataExecutor.kt", l = {}, m = "invokeSuspend")
public final class C0PQH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ EcClickRecommendProductsResponse LLILZ;
    public final /* synthetic */ Function1<C0PQX, Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0PQH(String str, String str2, int i, EcClickRecommendProductsResponse ecClickRecommendProductsResponse, Function1<? super C0PQX, Unit> function1, InterfaceC1364105Vn<? super C0PQH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = i;
        this.LLILZ = ecClickRecommendProductsResponse;
        this.LLILZIL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0PQH(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EcClickRecommendDataExecutor@c268.sendRequest$1$1$5");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LLILZIL.invoke(new C0PQX(EnumC645610PTz.VIDEO_IN_MIX_FEED, this.LL, this.LLILLJJLI, this.LLILLL, (String) null, (C0QRC) null, (C0QRC) null, new C0QRC(this.LLILZ), (C0PUB) null, 0, 1808));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EcClickRecommendDataExecutor@c268.sendRequest$1$1$5");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
