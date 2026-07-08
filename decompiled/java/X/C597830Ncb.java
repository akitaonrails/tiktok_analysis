package X;

import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.api.ShowcaseApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0Ncb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.showcase.showcase.ShowcasePrefetchEntity$tryPrefetchData$1$1$1$result$1", f = "ShowcaseNativePrefetchManager.kt", l = {103}, m = "invokeSuspend")
public final class C597830Ncb extends C09AX implements Function1<InterfaceC1364105Vn<? super Response<n>>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C597830Ncb(String str, String str2, InterfaceC1364105Vn<? super C597830Ncb> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C597830Ncb(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Response<n>> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ShowcasePrefetchEntity@b8f7.tryPrefetchData$1$1$1$result$1");
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
            ShowcaseApi showcaseApi = (ShowcaseApi) C0NSL.LIZ().create(ShowcaseApi.class);
            String str = this.LLILLJJLI;
            String str2 = "";
            if (str == null) {
                str = "";
            }
            String str3 = this.LLILLL;
            if (str3 != null) {
                str2 = str3;
            }
            this.LL = 1;
            obj = showcaseApi.getCreatorInfo(str, str2, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("ShowcasePrefetchEntity@b8f7.tryPrefetchData$1$1$1$result$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("ShowcasePrefetchEntity@b8f7.tryPrefetchData$1$1$1$result$1");
        return obj;
    }
}
