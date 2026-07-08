package X;

import com.ss.android.ugc.aweme.ecommercebase.network.BaseResponse;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.PopProductResp;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NSJ, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.util.UsResponseConvertUtil$convertAndSavePopResponse$1", f = "UsResponseConvertUtil.kt", l = {}, m = "invokeSuspend")
public final class C0NSJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0X52<BaseResponse<PopProductResp>> LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NSJ(C0X52<BaseResponse<PopProductResp>> c0x52, String str, boolean z, InterfaceC1364105Vn<? super C0NSJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0x52;
        this.LLILLJJLI = str;
        this.LLILLL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0NSJ(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("UsResponseConvertUtil@51fb.convertAndSavePopResponse$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C598030Ncv c598030Ncv = C598030Ncv.LIZ;
        C0X52<BaseResponse<PopProductResp>> c0x52 = this.LL;
        String str = this.LLILLJJLI;
        boolean z = this.LLILLL;
        c598030Ncv.getClass();
        C598030Ncv.LIZIZ(c0x52, str, z);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("UsResponseConvertUtil@51fb.convertAndSavePopResponse$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
