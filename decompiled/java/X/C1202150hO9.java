package X;

import com.bytedance.bpea.basics.Cert;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.tiktok.location.serviceimpl.LocationServiceImpl;
import com.ss.android.ugc.tiktok.location_api.service.ILocationService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0hO9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.tiktok.location.serviceimpl.LocationServiceImpl$fetchLocationNew$1$onSuccess$1", f = "LocationServiceImpl.kt", l = {}, m = "invokeSuspend")
public final class C1202150hO9 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ LocationServiceImpl LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Cert LLILZ;
    public final /* synthetic */ Cert LLILZIL;
    public final /* synthetic */ InterfaceC687820QyS LLILZLL;
    public final /* synthetic */ Long LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1202150hO9(LocationServiceImpl locationServiceImpl, String str, String str2, Cert cert, Cert cert2, InterfaceC687820QyS interfaceC687820QyS, Long l, InterfaceC1364105Vn<? super C1202150hO9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = locationServiceImpl;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = cert;
        this.LLILZIL = cert2;
        this.LLILZLL = interfaceC687820QyS;
        this.LLIZ = l;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1202150hO9(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LocationServiceImpl@d607.fetchLocationNew$1$onSuccess$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        ((ILocationService) ServiceManager.get().getService(ILocationService.class)).LJIILL(new C1202170hOB(this.LLILZ, this.LLILZIL, this.LL, this.LLILZLL, this.LLIZ, this.LLILLJJLI, this.LLILLL));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LocationServiceImpl@d607.fetchLocationNew$1$onSuccess$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
