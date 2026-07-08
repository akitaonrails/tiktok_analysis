package X;

import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.ecommercebase.network.BaseResponse;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.api.UsProductListApi;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.PopProductResp;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import webcast.data.oec_msg.CommerceInfo;
import webcast.data.oec_msg.PopCardInfo;

/* JADX INFO: renamed from: X.0NSG, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.request.UsPopCardRefreshManager$requestPop$resp$1", f = "UsPopCardRefreshManager.kt", l = {546, 554}, m = "invokeSuspend")
public final class C0NSG extends C09AX implements Function2<Boolean, InterfaceC1364105Vn<? super C0X52<BaseResponse<PopProductResp>>>, Object> {
    public int LL;
    public /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ C259800zU<String> LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ long LLIZ;
    public final /* synthetic */ CommerceInfo LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ String LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NSG(boolean z, C259800zU<String> c259800zU, String str, String str2, long j, CommerceInfo commerceInfo, String str3, String str4, InterfaceC1364105Vn<? super C0NSG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = z;
        this.LLILZ = c259800zU;
        this.LLILZIL = str;
        this.LLILZLL = str2;
        this.LLIZ = j;
        this.LLIZLLLIL = commerceInfo;
        this.LLJ = str3;
        this.LLJI = str4;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0NSG c0nsg = new C0NSG(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, interfaceC1364105Vn);
        c0nsg.LLILLJJLI = ((Boolean) obj).booleanValue();
        return c0nsg;
    }

    /* JADX WARN: Type inference failed for: r2v15, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v3, types: [T, java.lang.String] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Long lLJFF;
        PopCardInfo popCardInfo;
        PopCardInfo popCardInfo2;
        long jLongValue;
        Object objQueryPinV2 = obj;
        C1C7U.LIZ("UsPopCardRefreshManager@7978.requestPop$resp$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1 || i == 2) {
                C155000ia.LIZIZ(objQueryPinV2);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objQueryPinV2);
            boolean z = this.LLILLJJLI;
            if (this.LLILLL) {
                this.LLILZ.element = C598410NdX.LIZ(this.LLILZIL);
                UsProductListApi usProductListApi = (UsProductListApi) C0NSL.LIZ().create(UsProductListApi.class);
                String str = this.LLILZ.element;
                Long lLJIILIIL = C2095008Iq.LJIILIIL(this.LLILZIL);
                if (lLJIILIIL != null) {
                    jLongValue = lLJIILIIL.longValue();
                } else {
                    jLongValue = 0;
                }
                Long lLJIILIIL2 = C2095008Iq.LJIILIIL(this.LLILZLL);
                Long lLJFF2 = C2286608xc.LJFF(this.LLIZ);
                this.LL = 1;
                objQueryPinV2 = usProductListApi.getPopFromBroadcastV2(str, jLongValue, lLJIILIIL2, lLJFF2, this);
                if (objQueryPinV2 == objLJFF) {
                    C1C7U.LIZIZ("UsPopCardRefreshManager@7978.requestPop$resp$1");
                    return objLJFF;
                }
            } else {
                this.LLILZ.element = C598410NdX.LJFF(this.LLILZIL);
                UsProductListApi usProductListApi2 = (UsProductListApi) C0NSL.LIZ().create(UsProductListApi.class);
                String str2 = this.LLILZ.element;
                long j = CastLongProtector.parseLong(this.LLILZIL);
                CommerceInfo commerceInfo = this.LLIZLLLIL;
                Integer numLJ = null;
                if (commerceInfo != null && (popCardInfo2 = commerceInfo.popCardInfo) != null) {
                    lLJFF = C2286608xc.LJFF(popCardInfo2.popCardId);
                } else {
                    lLJFF = null;
                }
                CommerceInfo commerceInfo2 = this.LLIZLLLIL;
                if (commerceInfo2 != null && (popCardInfo = commerceInfo2.popCardInfo) != null) {
                    numLJ = C2286608xc.LJ(popCardInfo.popCardType);
                }
                String str3 = this.LLJ;
                String str4 = this.LLJI;
                this.LL = 2;
                objQueryPinV2 = usProductListApi2.queryPinV2(str2, j, lLJFF, numLJ, 1, str3, 0, 1, z, str4, this);
                if (objQueryPinV2 == objLJFF) {
                    C1C7U.LIZIZ("UsPopCardRefreshManager@7978.requestPop$resp$1");
                    return objLJFF;
                }
            }
        }
        C1C7U.LIZIZ("UsPopCardRefreshManager@7978.requestPop$resp$1");
        return objQueryPinV2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Boolean bool, InterfaceC1364105Vn<? super C0X52<BaseResponse<PopProductResp>>> interfaceC1364105Vn) {
        return ((a) create(Boolean.valueOf(bool.booleanValue()), interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
