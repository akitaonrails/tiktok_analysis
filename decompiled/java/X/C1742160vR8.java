package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.cart.cache.CartPreloadConfig;
import com.ss.android.ugc.aweme.ecommerce.base.cart.repository.dto.GetCartRequest;
import com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.FieldContext;
import com.ss.android.ugc.aweme.ecommercebase.pagesource.PageSourceInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0vR8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.cart.cache.CartCacheManager$executeCartCacheStrategy$1$1", f = "CartCacheManager.kt", l = {186}, m = "invokeSuspend")
public final class C1742160vR8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ List<Integer> LLILLL;
    public final /* synthetic */ Map<String, Object> LLILZ;
    public final /* synthetic */ C013C LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1742160vR8(String str, List<Integer> list, Map<String, ? extends Object> map, C013C c013c, InterfaceC1364105Vn<? super C1742160vR8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = list;
        this.LLILZ = map;
        this.LLILZIL = c013c;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1742160vR8(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String strLJIIIIZZ;
        String strLJIIIIZZ2;
        Object obj2;
        String str;
        Map<String, Object> map;
        Object obj3;
        Object objLIZIZ = obj;
        C1C7U.LIZ("CartCacheManager@5d34.executeCartCacheStrategy$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        boolean z = true;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLIZIZ);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLIZIZ);
            String str2 = this.LLILLJJLI;
            C973303rH.LL.getClass();
            List listLJII = C973303rH.LJII(new ArrayList(C973303rH.LLILLL));
            List<Integer> list = this.LLILLL;
            PageSourceInfo pageSourceInfoLJ = C1766860w4y.LJ(C1766860w4y.LIZ, null, 3);
            if (pageSourceInfoLJ != null) {
                strLJIIIIZZ = C1741890vQh.LJIIIIZZ(pageSourceInfoLJ);
            } else {
                strLJIIIIZZ = null;
            }
            String strLIZ = C1742130vR5.LIZ();
            Integer numLJ = C2286608xc.LJ(10);
            try {
                CartPreloadConfig cartPreloadConfigLIZIZ = C1742130vR5.LIZIZ();
                if (cartPreloadConfigLIZIZ != null) {
                    map = cartPreloadConfigLIZIZ.extraRequestParams;
                } else {
                    map = null;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1AF0.LJFF(e, "getAbClientParams get Failed!");
            }
            if (map != null && (obj3 = map.get("client_ab_param")) != null) {
                strLJIIIIZZ2 = C1741890vQh.LJIIIIZZ(obj3);
            } else {
                strLJIIIIZZ2 = null;
            }
            Map<String, Object> map2 = this.LLILZ;
            if (map2 == null || (obj2 = map2.get("lineup_room_id")) == null) {
                Map<String, Object> map3 = this.LLILZ;
                if (map3 != null) {
                    obj2 = map3.get("room_id");
                } else {
                    obj2 = null;
                }
            }
            if (obj2 instanceof String) {
                str = (String) obj2;
            } else {
                str = null;
            }
            GetCartRequest getCartRequest = new GetCartRequest(true, null, str2, listLJII, list, strLJIIIIZZ, strLIZ, numLJ, strLJIIIIZZ2, new FieldContext(str));
            C04HK c04hk = C04HJ.LIZ;
            z = true;
            this.LL = 1;
            objLIZIZ = c04hk.LIZIZ(getCartRequest, this);
            if (objLIZIZ == objLJFF) {
                C1C7U.LIZIZ("CartCacheManager@5d34.executeCartCacheStrategy$1$1");
                return objLJFF;
            }
        }
        Response response = (Response) objLIZIZ;
        if (response.isCodeOK()) {
            this.LLILZIL.element = z;
            C1742190vRB c1742190vRB = C1742190vRB.LIZ;
            String strValueOf = String.valueOf(response.data);
            c1742190vRB.getClass();
            C1742190vRB.LIZLLL(strValueOf);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CartCacheManager@5d34.executeCartCacheStrategy$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
