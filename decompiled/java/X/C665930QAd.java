package X;

import com.bytedance.lighten.loader.SmartImageView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0QAd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.general.live.TopLiveProductViewNew$setPreloadCover$1", f = "TopLiveProductViewNew.kt", l = {527}, m = "invokeSuspend")
public final class C665930QAd extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0QAZ LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C665930QAd(C0QAZ c0qaz, String str, InterfaceC1364105Vn<? super C665930QAd> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0qaz;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C665930QAd(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TopLiveProductViewNew@8093.setPreloadCover$1");
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
            C099F c099f = this.LLILLJJLI.LLJLLL;
            if (c099f != null) {
                this.LL = 1;
                if (c099f.LJLIIIL(this) == objLJFF) {
                    C1C7U.LIZIZ("TopLiveProductViewNew@8093.setPreloadCover$1");
                    return objLJFF;
                }
            }
        }
        C0QAZ c0qaz = this.LLILLJJLI;
        String str = this.LLILLL;
        SmartImageView smartImageView = c0qaz.LLJJIJI;
        if (smartImageView == null) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("TopLiveProductViewNew@8093.setPreloadCover$1");
            return unit;
        }
        c0qaz.LIZLLL(smartImageView, str);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("TopLiveProductViewNew@8093.setPreloadCover$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
