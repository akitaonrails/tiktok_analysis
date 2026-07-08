package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.RootData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0v4X, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.utils.BillboardBannerEffectHelper$cancelBannerToServer$resp$1", f = "BillboardBannerEffectHelper.kt", l = {164}, m = "invokeSuspend")
public final class C1728150v4X extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C0X52<Response<Object>>>, Object> {
    public int LL;
    public final /* synthetic */ C1728330v4p LLILLJJLI;
    public final /* synthetic */ RootData LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1728150v4X(C1728330v4p c1728330v4p, RootData rootData, InterfaceC1364105Vn<? super C1728150v4X> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1728330v4p;
        this.LLILLL = rootData;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1728150v4X(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C0X52 c0x52;
        C1C7U.LIZ("BillboardBannerEffectHelper@f22d.cancelBannerToServer$resp$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                C1728220v4e c1728220v4e = this.LLILLJJLI.LIZ.LLILLJJLI;
                RootData rootData = this.LLILLL;
                String str = rootData.authorId;
                String str2 = rootData.roomId;
                this.LL = 1;
                obj = c1728220v4e.LL.LL.cancelDisplayBanner(str, str2, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("BillboardBannerEffectHelper@f22d.cancelBannerToServer$resp$1");
                    return objLJFF;
                }
            }
            c0x52 = (C0X52) obj;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c0x52 = null;
        }
        C1C7U.LIZIZ("BillboardBannerEffectHelper@f22d.cancelBannerToServer$resp$1");
        return c0x52;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C0X52<Response<Object>>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
