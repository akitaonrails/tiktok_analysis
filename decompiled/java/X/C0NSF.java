package X;

import com.ss.android.ugc.aweme.ecommercebase.network.BaseResponse;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.api.UsProductListApi;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.PopProductResp;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import webcast.data.oec_msg.CommerceInfo;
import webcast.data.oec_msg.PopCardInfo;

/* JADX INFO: renamed from: X.0NSF, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.request.UsPopCardRefreshManager$requestPopRefresh$2", f = "UsPopCardRefreshManager.kt", l = {592, 599}, m = "invokeSuspend")
public final class C0NSF extends C09AX implements Function2<Boolean, InterfaceC1364105Vn<? super C0X52<BaseResponse<PopProductResp>>>, Object> {
    public int LL;
    public /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ long LLILZLL;
    public final /* synthetic */ CommerceInfo LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ int LLJ;
    public final /* synthetic */ String LLJI;
    public final /* synthetic */ String LLJIJIL;
    public final /* synthetic */ String LLJILJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NSF(int i, long j, String str, String str2, String str3, String str4, String str5, String str6, InterfaceC1364105Vn interfaceC1364105Vn, CommerceInfo commerceInfo, boolean z) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = z;
        this.LLILZ = str;
        this.LLILZIL = str2;
        this.LLILZLL = j;
        this.LLIZ = commerceInfo;
        this.LLIZLLLIL = str3;
        this.LLJ = i;
        this.LLJI = str4;
        this.LLJIJIL = str5;
        this.LLJILJIL = str6;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        boolean z = this.LLILLL;
        String str = this.LLILZ;
        String str2 = this.LLILZIL;
        long j = this.LLILZLL;
        CommerceInfo commerceInfo = this.LLIZ;
        C0NSF c0nsf = new C0NSF(this.LLJ, j, str, str2, this.LLIZLLLIL, this.LLJI, this.LLJIJIL, this.LLJILJIL, interfaceC1364105Vn, commerceInfo, z);
        c0nsf.LLILLJJLI = ((Boolean) obj).booleanValue();
        return c0nsf;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Long lLJFF;
        PopCardInfo popCardInfo;
        PopCardInfo popCardInfo2;
        long jLongValue;
        Object objRefreshPinProduct = obj;
        C1C7U.LIZ("UsPopCardRefreshManager@7978.requestPopRefresh$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1 || i == 2) {
                C155000ia.LIZIZ(objRefreshPinProduct);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objRefreshPinProduct);
            boolean z = this.LLILLJJLI;
            if (this.LLILLL) {
                String strLIZ = C598410NdX.LIZ(this.LLILZ);
                UsProductListApi usProductListApi = (UsProductListApi) C0NSL.LIZ().create(UsProductListApi.class);
                Long lLJIILIIL = C2095008Iq.LJIILIIL(this.LLILZ);
                if (lLJIILIIL != null) {
                    jLongValue = lLJIILIIL.longValue();
                } else {
                    jLongValue = 0;
                }
                Long lLJIILIIL2 = C2095008Iq.LJIILIIL(this.LLILZIL);
                Long lLJFF2 = C2286608xc.LJFF(this.LLILZLL);
                this.LL = 1;
                objRefreshPinProduct = usProductListApi.getPopFromBroadcastV2(strLIZ, jLongValue, lLJIILIIL2, lLJFF2, this);
                if (objRefreshPinProduct == objLJFF) {
                    C1C7U.LIZIZ("UsPopCardRefreshManager@7978.requestPopRefresh$2");
                    return objLJFF;
                }
            } else {
                UsProductListApi usProductListApi2 = (UsProductListApi) C0NSL.LIZ().create(UsProductListApi.class);
                String str = this.LLILZ;
                CommerceInfo commerceInfo = this.LLIZ;
                Integer numLJ = null;
                if (commerceInfo != null && (popCardInfo2 = commerceInfo.popCardInfo) != null) {
                    lLJFF = C2286608xc.LJFF(popCardInfo2.popCardId);
                } else {
                    lLJFF = null;
                }
                CommerceInfo commerceInfo2 = this.LLIZ;
                if (commerceInfo2 != null && (popCardInfo = commerceInfo2.popCardInfo) != null) {
                    numLJ = C2286608xc.LJ(popCardInfo.popCardType);
                }
                Integer numLJ2 = C2286608xc.LJ(1);
                String str2 = this.LLIZLLLIL;
                Integer numLJ3 = C2286608xc.LJ(this.LLJ);
                String str3 = this.LLJI;
                String str4 = this.LLJIJIL;
                String str5 = this.LLJILJIL;
                this.LL = 2;
                objRefreshPinProduct = usProductListApi2.refreshPinProduct(str, lLJFF, numLJ, numLJ2, str2, numLJ3, null, 1, z, str3, str4, str5, this);
                if (objRefreshPinProduct == objLJFF) {
                    C1C7U.LIZIZ("UsPopCardRefreshManager@7978.requestPopRefresh$2");
                    return objLJFF;
                }
            }
        }
        C1C7U.LIZIZ("UsPopCardRefreshManager@7978.requestPopRefresh$2");
        return objRefreshPinProduct;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Boolean bool, InterfaceC1364105Vn<? super C0X52<BaseResponse<PopProductResp>>> interfaceC1364105Vn) {
        return ((a) create(Boolean.valueOf(bool.booleanValue()), interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
