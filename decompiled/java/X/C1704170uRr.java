package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.influencer.ecommercelive.us.billboard.model.EffectRootData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0uRr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.us.billboard.utils.BillboardBannerEffectHelper$realDisplayBanner$imageFilepath$1", f = "BillboardBannerEffectHelper.kt", l = {39}, m = "invokeSuspend")
public final class C1704170uRr extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super String>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ C1728380v4u LLILLL;
    public final /* synthetic */ EffectRootData LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1704170uRr(String str, C1728380v4u c1728380v4u, EffectRootData effectRootData, InterfaceC1364105Vn<? super C1704170uRr> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = c1728380v4u;
        this.LLILZ = effectRootData;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1704170uRr(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C1C7U.LIZ("BillboardBannerEffectHelper@9438.realDisplayBanner$imageFilepath$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1728380v4u c1728380v4u = this.LLILLL;
            String message = e.getMessage();
            EffectRootData effectRootData = this.LLILZ;
            c1728380v4u.getClass();
            C1728380v4u.LIZ("download_effect_resource_fail", message, effectRootData);
        }
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            if (C123100dR.LIZ(this.LLILLJJLI)) {
                String str2 = this.LLILLJJLI;
                this.LL = 1;
                obj = C1722260uv2.LIZ(5, str2, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("BillboardBannerEffectHelper@9438.realDisplayBanner$imageFilepath$1");
                    return objLJFF;
                }
            }
            str = null;
            C1C7U.LIZIZ("BillboardBannerEffectHelper@9438.realDisplayBanner$imageFilepath$1");
            return str;
        }
        str = (String) obj;
        C1C7U.LIZIZ("BillboardBannerEffectHelper@9438.realDisplayBanner$imageFilepath$1");
        return str;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
