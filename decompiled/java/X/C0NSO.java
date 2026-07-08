package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NSO, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.common.api.ProductListApi$deleteProducts$2", f = "ProductListApi.kt", l = {}, m = "invokeSuspend")
public final class C0NSO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C0NSP>, Object> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ C0NSR LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NSO(boolean z, String str, String str2, C0NSR c0nsr, InterfaceC1364105Vn<? super C0NSO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = z;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = c0nsr;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0NSO(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C0NSP c0nsp;
        Map<String, String> mapLIZJ;
        C1C7U.LIZ("ProductListApi@b7ce.deleteProducts$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            if (!this.LL) {
                mapLIZJ = C2097608Jq.LJIIIIZZ(new Pair("room_id", this.LLILLJJLI), new Pair("product_ids", this.LLILLL), new Pair("delete_mode", CardStruct.IStatusCode.DEFAULT));
            } else {
                mapLIZJ = C2097908Jt.LIZJ(new Pair("delete_mode", "1"));
            }
            c0nsp = new C0NSP(this.LLILZ.LIZ.deleteProducts(mapLIZJ).execute().LIZIZ, this.LLILLL, 4);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            c0nsp = new C0NSP(null);
        }
        C1C7U.LIZIZ("ProductListApi@b7ce.deleteProducts$2");
        return c0nsp;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C0NSP> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
