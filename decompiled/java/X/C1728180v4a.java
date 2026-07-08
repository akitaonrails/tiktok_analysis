package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.ImageItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.viewmodel.ImageListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0v4a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.viewmodel.ImageListViewModel$cancelDisplay$1$resp$1", f = "ImageListViewModel.kt", l = {527}, m = "invokeSuspend")
public final class C1728180v4a extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C0X52<Response<Object>>>, Object> {
    public int LL;
    public final /* synthetic */ ImageListViewModel LLILLJJLI;
    public final /* synthetic */ C1728990v5t LLILLL;
    public final /* synthetic */ ImageItem LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1728180v4a(ImageListViewModel imageListViewModel, C1728990v5t c1728990v5t, ImageItem imageItem, InterfaceC1364105Vn<? super C1728180v4a> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = imageListViewModel;
        this.LLILLL = c1728990v5t;
        this.LLILZ = imageItem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1728180v4a(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C0X52 c0x52;
        C1C7U.LIZ("ImageListViewModel@65ae.cancelDisplay$1$resp$1");
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
                C1728220v4e c1728220v4e = this.LLILLJJLI.LL.LLILLJJLI;
                String str = this.LLILLL.LL.authorId;
                String str2 = this.LLILZ.imageId;
                this.LL = 1;
                obj = c1728220v4e.LL.LL.cancelDisplay(str, str2, 1, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("ImageListViewModel@65ae.cancelDisplay$1$resp$1");
                    return objLJFF;
                }
            }
            c0x52 = (C0X52) obj;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c0x52 = null;
        }
        C1C7U.LIZIZ("ImageListViewModel@65ae.cancelDisplay$1$resp$1");
        return c0x52;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C0X52<Response<Object>>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
