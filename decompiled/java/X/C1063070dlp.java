package X;

import com.ss.android.ugc.aweme.ad.feed.ibe.CommerceIBEService;
import com.ss.android.ugc.aweme.ad.feed.ibe.ICommerceIBEService;
import com.ss.android.ugc.aweme.commerce.IBEInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0dlp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ad.feed.ibe.IBEPreloadTask$preloadIBEGecko$1$1$1", f = "IBEPreloadTask.kt", l = {58}, m = "invokeSuspend")
public final class C1063070dlp extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ IBEInfo LLILLJJLI;
    public final /* synthetic */ C1063150dlx LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1063070dlp(IBEInfo iBEInfo, C1063150dlx c1063150dlx, InterfaceC1364105Vn<? super C1063070dlp> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = iBEInfo;
        this.LLILLL = c1063150dlx;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1063070dlp(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IBEPreloadTask@6d30.preloadIBEGecko$1$1$1");
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
            ICommerceIBEService iCommerceIBEServiceLJFF = CommerceIBEService.LJFF();
            IBEInfo iBEInfo = this.LLILLJJLI;
            C1057930ddX c1057930ddX = new C1057930ddX(this.LLILLL, this.LLILLJJLI);
            this.LL = 1;
            if (iCommerceIBEServiceLJFF.LJ(iBEInfo, c1057930ddX, this) == objLJFF) {
                C1C7U.LIZIZ("IBEPreloadTask@6d30.preloadIBEGecko$1$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IBEPreloadTask@6d30.preloadIBEGecko$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
