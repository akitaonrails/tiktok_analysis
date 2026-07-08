package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.search.result.api.EcSearchApi;
import com.ss.android.ugc.aweme.ecommerce.search.result.vertical.video.model.VideoVerticalResponse;
import java.util.concurrent.ExecutionException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0QdU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.result.vertical.video.vm.VideoVerticalViewModel$sendRequest$response$1", f = "VideoVerticalViewModel.kt", l = {}, m = "invokeSuspend")
public final class C674820QdU extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super VideoVerticalResponse>, Object> {
    public final /* synthetic */ C674800QdS LL;
    public final /* synthetic */ C675050Qdr LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C674820QdU(C674800QdS c674800QdS, C675050Qdr c675050Qdr, InterfaceC1364105Vn<? super C674820QdU> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c674800QdS;
        this.LLILLJJLI = c675050Qdr;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C674820QdU(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws InterruptedException {
        C1C7U.LIZ("VideoVerticalViewModel@3606.sendRequest$response$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        EcSearchApi ecSearchApi = EcSearchApi.LIZ;
        C674800QdS c674800QdS = this.LL;
        C675050Qdr c675050Qdr = this.LLILLJJLI;
        try {
            EcSearchApi.RealApi realApiLIZJ = EcSearchApi.LIZJ();
            String str = c674800QdS.keyword;
            int i = c674800QdS.count;
            int i2 = c675050Qdr.LIZ;
            String str2 = c674800QdS.source;
            String str3 = c674800QdS.searchSource;
            String str4 = c674800QdS.searchChannel;
            if (str4 == null) {
                str4 = "";
            }
            VideoVerticalResponse videoVerticalResponse = realApiLIZJ.searchDynamicVideoList(str, i, i2, str2, str3, str4, c674800QdS.enterFrom, c674800QdS.searchContext, c674800QdS.trafficSourceList, c674800QdS.searchId, c674800QdS.lastSearchId, c674800QdS.searchSessionId, c674800QdS.endToEndSearchSessionId, c674800QdS.hotSearch, c674800QdS.correctType, c674800QdS.isNonPersonalizedSearch()).get();
            C1C7U.LIZIZ("VideoVerticalViewModel@3606.sendRequest$response$1");
            return videoVerticalResponse;
        } catch (ExecutionException e) {
            TryCatchGuardChecker.doCheck(e);
            throw AbstractC2126608Uu.getCompatibleException(e);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super VideoVerticalResponse> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
