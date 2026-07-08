package X;

import com.bytedance.android.livesdk.model.message.DispersionInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommercebase.network.BaseResponse;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.business.audience.api.data.ProductCount;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONException;

/* JADX INFO: renamed from: X.17u6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.audience.common.shoppingbag.ECAudienceShopBagIconWidget$handleProductNumberChange$1", f = "ECAudienceShopBagIconWidget.kt", l = {1183}, m = "invokeSuspend")
public final class C21177217u6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C21212117zj LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21177217u6(C21212117zj c21212117zj, int i, InterfaceC1364105Vn<? super C21177217u6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c21212117zj;
        this.LLILLL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C21177217u6(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        int iIntValue;
        ProductCount productCount;
        Integer num;
        String idStr;
        Long lLJFF;
        Long lLJFF2;
        Object objLJI = obj;
        C1C7U.LIZ("ECAudienceShopBagIconWidget@216e.handleProductNumberChange$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        BaseResponse baseResponse = null;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(objLJI);
            } else {
                C155000ia.LIZIZ(objLJI);
                C21212117zj c21212117zj = this.LLILLJJLI;
                EnumC21192817wc enumC21192817wc = EnumC21192817wc.REQUEST_PRODUCT_NUM;
                Room room = c21212117zj.LLJILJIL;
                if (room != null) {
                    idStr = room.getIdStr();
                } else {
                    idStr = null;
                }
                C21196417xC.LIZ(enumC21192817wc, idStr, null, null, null, c21212117zj.LLLIIII, null, null, 220);
                C054G c054g = c21212117zj.LLLIIIL;
                Room room2 = c21212117zj.LLJILJIL;
                if (room2 != null) {
                    lLJFF = C2286608xc.LJFF(room2.getId());
                } else {
                    lLJFF = null;
                }
                String strValueOf = String.valueOf(lLJFF);
                Room room3 = c21212117zj.LLJILJIL;
                if (room3 != null) {
                    lLJFF2 = C2286608xc.LJFF(room3.getId());
                } else {
                    lLJFF2 = null;
                }
                DispersionInfo dispersionInfoLIZIZ = C598410NdX.LIZIZ(5, String.valueOf(lLJFF2));
                C503701xj c503701xj = new C503701xj(c21212117zj, null);
                this.LL = 1;
                objLJI = C598360NdS.LIZ.LJI(c054g, strValueOf, dispersionInfoLIZIZ, null, c503701xj, this);
                if (objLJI == objLJFF) {
                    C1C7U.LIZIZ("ECAudienceShopBagIconWidget@216e.handleProductNumberChange$1");
                    return objLJFF;
                }
            }
            baseResponse = (BaseResponse) objLJI;
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        C21212117zj c21212117zj2 = this.LLILLJJLI;
        if (baseResponse != null && (productCount = (ProductCount) baseResponse.getData()) != null && (num = productCount.total) != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = this.LLILLL;
        }
        c21212117zj2.LJJIL(iIntValue);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ECAudienceShopBagIconWidget@216e.handleProductNumberChange$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
