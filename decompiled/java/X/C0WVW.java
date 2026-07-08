package X;

import android.os.SystemClock;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.utils.AttributionData;
import com.ss.android.ugc.aweme.utils.AttributionInfoData;
import com.ss.android.ugc.aweme.utils.AttributionLandingData;
import com.ss.android.ugc.aweme.utils.NewUserLandingApi;
import com.ss.android.ugc.aweme.utils.UploadAttributionDataRes;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0WVW, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.utils.NewUserLandingApiUtil$uploadDataToServer$1", f = "NewUserLandingApiUtil.kt", l = {}, m = "invokeSuspend")
public final class C0WVW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0WVW(String str, String str2, String str3, String str4, String str5, String str6, InterfaceC1364105Vn<? super C0WVW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = str4;
        this.LLILZIL = str5;
        this.LLILZLL = str6;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0WVW(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("NewUserLandingApiUtil@90de.uploadDataToServer$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C10UP.LIZ.getClass();
        String strLIZIZ = C10UP.LIZIZ(true);
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        C11O8 c11o8LJJJLZIJ = ((NewUserLandingApi) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).LIZ("https://tiktokv.com").create(NewUserLandingApi.class)).LIZ(new AttributionData(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LL, this.LLILZIL), strLIZIZ).LJL(C11S5.LIZ()).LJJJLZIJ(C11S5.LIZ());
        final String str = this.LLILZLL;
        final String str2 = this.LL;
        c11o8LJJJLZIJ.LIZIZ(new InterfaceC626120Oh8<UploadAttributionDataRes>() { // from class: X.10UU
            @Override // X.InterfaceC626120Oh8
            public final void onComplete() {
            }

            @Override // X.InterfaceC626120Oh8
            public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
            }

            @Override // X.InterfaceC626120Oh8
            public final void onError(Throwable th) {
                C10SW.LIZ.getClass();
                C10SW.LJFF("request_failed");
            }

            @Override // X.InterfaceC626120Oh8
            public final void onNext(UploadAttributionDataRes uploadAttributionDataRes) {
                AttributionInfoData attributionInfoData;
                UploadAttributionDataRes uploadAttributionDataRes2 = uploadAttributionDataRes;
                if (uploadAttributionDataRes2.errCode == 0) {
                    C10UP c10up = C10UP.LIZ;
                    AttributionLandingData attributionLandingData = uploadAttributionDataRes2.data;
                    if (attributionLandingData != null) {
                        attributionInfoData = attributionLandingData.landingData;
                    } else {
                        attributionInfoData = null;
                    }
                    long j = jElapsedRealtime;
                    String str3 = str;
                    String str4 = str2;
                    c10up.getClass();
                    C10UP.LIZJ(0, attributionInfoData, false, j, str3, str4);
                }
            }
        });
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("NewUserLandingApiUtil@90de.uploadDataToServer$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
