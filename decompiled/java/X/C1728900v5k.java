package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.settings.TtecLiveBannerResourceIdSettings;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0v5k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.utils.BillboardBannerEffectHelper$realCancelEffect$result$1", f = "BillboardBannerEffectHelper.kt", l = {186}, m = "invokeSuspend")
public final class C1728900v5k extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC1728700v5Q LLILLJJLI;
    public final /* synthetic */ LiveEffect LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1728900v5k(InterfaceC1728700v5Q interfaceC1728700v5Q, LiveEffect liveEffect, InterfaceC1364105Vn<? super C1728900v5k> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC1728700v5Q;
        this.LLILLL = liveEffect;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1728900v5k(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BillboardBannerEffectHelper@f22d.realCancelEffect$result$1");
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
            String str = TtecLiveBannerResourceIdSettings.LIZ().resourceId;
            if (str == null) {
                str = "";
            }
            String str2 = TtecLiveBannerResourceIdSettings.LIZ().panel;
            if (str2 == null) {
                str2 = "live_ec_top_atmosphere";
            }
            String str3 = TtecLiveBannerResourceIdSettings.LIZ().categoryId;
            if (str3 == null) {
                str3 = "top_atmosphere";
            }
            InterfaceC1728700v5Q interfaceC1728700v5Q = this.LLILLJJLI;
            LiveEffect liveEffect = this.LLILLL;
            this.LL = 1;
            obj = interfaceC1728700v5Q.LJ(str, str2, str3, liveEffect, null, false, null, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("BillboardBannerEffectHelper@f22d.realCancelEffect$result$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("BillboardBannerEffectHelper@f22d.realCancelEffect$result$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
