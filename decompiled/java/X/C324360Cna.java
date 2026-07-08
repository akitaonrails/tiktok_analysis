package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Cna, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.sea.billboard.utils.SeaLiveEffectBillboardBizUtil$getBannerEffect$2", f = "SeaLiveEffectBillboardBizUtil.kt", l = {87}, m = "invokeSuspend")
public final class C324360Cna extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super LiveEffect>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC1728700v5Q LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C324360Cna(InterfaceC1728700v5Q interfaceC1728700v5Q, String str, String str2, String str3, InterfaceC1364105Vn<? super C324360Cna> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC1728700v5Q;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = str3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C324360Cna(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SeaLiveEffectBillboardBizUtil@236.getBannerEffect$2");
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
            InterfaceC1728700v5Q interfaceC1728700v5Q = this.LLILLJJLI;
            String str = this.LLILLL;
            String str2 = this.LLILZ;
            String str3 = this.LLILZIL;
            this.LL = 1;
            obj = interfaceC1728700v5Q.LJFF(str, str2, str3, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("SeaLiveEffectBillboardBizUtil@236.getBannerEffect$2");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("SeaLiveEffectBillboardBizUtil@236.getBannerEffect$2");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super LiveEffect> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
