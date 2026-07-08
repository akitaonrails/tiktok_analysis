package X;

import com.ss.android.ugc.aweme.ecommercelive.audience.common.business.settings.ShopBagIconGuidanceAnimConfigSettings;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.15Oi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.audience.common.business.audience.productguide.MultiProductGuidanceDataManager$setTimeOutJob$1", f = "GuidanceDataManager.kt", l = {81}, m = "invokeSuspend")
public final class C20512615Oi extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ ShopBagIconGuidanceAnimConfigSettings.ECShopBagAnimConfig LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20512615Oi(ShopBagIconGuidanceAnimConfigSettings.ECShopBagAnimConfig eCShopBagAnimConfig, InterfaceC1364105Vn<? super C20512615Oi> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = eCShopBagAnimConfig;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C20512615Oi(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C21212917zr c21212917zrLIZIZ;
        C1C7U.LIZ("MultiProductGuidanceDataManager@ab28.setTimeOutJob$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            long jLongValue = this.LLILLJJLI.waitRequestTime.longValue();
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(jLongValue, this) == objLJFF) {
                C1C7U.LIZIZ("MultiProductGuidanceDataManager@ab28.setTimeOutJob$1");
                return objLJFF;
            }
        }
        InterfaceC20533915Wn interfaceC20533915Wn = C20533615Wk.LJFF;
        if (interfaceC20533915Wn != null) {
            interfaceC20533915Wn.onFail();
        }
        C20533615Wk.LIZ.getClass();
        if (C20533615Wk.LJFF != null && (c21212917zrLIZIZ = C21213217zu.LIZ.LIZIZ(Long.valueOf(C20533615Wk.LIZIZ))) != null) {
            c21212917zrLIZIZ.LIZLLL("before_show", "image_download_time_out", false);
        }
        C20533615Wk.LJI();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MultiProductGuidanceDataManager@ab28.setTimeOutJob$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
