package X;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.android.ugc.aweme.ecommercebase.network.BaseResponse;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.business.audience.api.AudienceProductCountApi;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.business.audience.api.data.ProductCount;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.01xj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.audience.common.shoppingbag.ECAudienceShopBagIconWidget$handleProductNumberChange$1$response$1$1", f = "ECAudienceShopBagIconWidget.kt", l = {1188}, m = "invokeSuspend")
public final class C503701xj extends C09AX implements Function2<Boolean, InterfaceC1364105Vn<? super Pair<? extends BaseResponse<ProductCount>, ? extends String>>, Object> {
    public int LL;
    public /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ C21212117zj LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C503701xj(C21212117zj c21212117zj, InterfaceC1364105Vn<? super C503701xj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c21212117zj;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C503701xj c503701xj = new C503701xj(this.LLILLL, interfaceC1364105Vn);
        c503701xj.LLILLJJLI = ((Boolean) obj).booleanValue();
        return c503701xj;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Long lLJFF;
        String currentUserID;
        String string;
        Object productsCount = obj;
        C1C7U.LIZ("ECAudienceShopBagIconWidget@216e.handleProductNumberChange$1$response$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(productsCount);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(productsCount);
            boolean z = this.LLILLJJLI;
            AudienceProductCountApi audienceProductCountApi = (AudienceProductCountApi) C0NSL.LIZ().create(AudienceProductCountApi.class);
            Room room = this.LLILLL.LLJILJIL;
            if (room != null) {
                lLJFF = C2286608xc.LJFF(room.getId());
            } else {
                lLJFF = null;
            }
            String strValueOf = String.valueOf(lLJFF);
            this.LLILLL.getClass();
            IUserService iUserService = (IUserService) PluggableExtentionKt.pluggableSpi$default(IUserService.class, false, false, false, 14, null);
            if (iUserService == null || (currentUserID = iUserService.getCurrentUserID()) == null) {
                currentUserID = "";
            }
            Room room2 = this.LLILLL.LLJILJIL;
            if (room2 != null) {
                string = C2286608xc.LJFF(room2.getOwnerUserId()).toString();
            } else {
                string = null;
            }
            boolean zLJFF = Intrinsics.LJFF(currentUserID, string);
            this.LL = 1;
            productsCount = audienceProductCountApi.getProductsCount(strValueOf, zLJFF, z, this);
            if (productsCount == objLJFF) {
                C1C7U.LIZIZ("ECAudienceShopBagIconWidget@216e.handleProductNumberChange$1$response$1$1");
                return objLJFF;
            }
        }
        Pair pair = new Pair(productsCount, null);
        C1C7U.LIZIZ("ECAudienceShopBagIconWidget@216e.handleProductNumberChange$1$response$1$1");
        return pair;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Boolean bool, InterfaceC1364105Vn<? super Pair<? extends BaseResponse<ProductCount>, ? extends String>> interfaceC1364105Vn) {
        return ((a) create(Boolean.valueOf(bool.booleanValue()), interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
