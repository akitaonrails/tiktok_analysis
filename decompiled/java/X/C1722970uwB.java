package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.home.repo.network.WalletHomeApi;
import com.ss.android.ugc.aweme.home.repo.network.data.HomepageInfoResponse;
import com.ss.android.ugc.aweme.home.repo.network.data.NewUserGuideInfoResponse;
import com.ss.android.ugc.aweme.home.repo.network.data.ServiceComponentResponse;
import com.ss.android.ugc.aweme.home.repo.network.data.ServiceInfoResponse;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0uwB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.home.usecase.GetPageDataUseCase$internalInvoke$2", f = "GetPageDataUseCase.kt", l = {52}, m = "invokeSuspend")
public final class C1722970uwB extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super AbstractC989720brW<? extends C1723000uwE>>, Object> {
    public int LL;
    public final /* synthetic */ C1722790uvt LLILLJJLI;
    public final /* synthetic */ C759410Tqd LLILLL;
    public final /* synthetic */ C1722980uwC LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1722970uwB(C1722790uvt c1722790uvt, C1722980uwC c1722980uwC, C759410Tqd c759410Tqd, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1722790uvt;
        this.LLILLL = c759410Tqd;
        this.LLILZ = c1722980uwC;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1722970uwB(this.LLILLJJLI, this.LLILZ, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GetPageDataUseCase@d833.internalInvoke$2");
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
                C1722790uvt c1722790uvt = this.LLILLJJLI;
                if (c1722790uvt != null && c1722790uvt.LIZ() && this.LLILLL != null) {
                    WalletHomeApi walletHomeApiLIZ = WalletHomeApi.LIZ.LIZ(this.LLILLJJLI.LLILZ);
                    String str = this.LLILLJJLI.LLILLJJLI;
                    this.LL = 1;
                    obj = walletHomeApiLIZ.getHomePageInfo(str, C2222691Bz1.LIZ(), this);
                    if (obj == objLJFF) {
                        C1C7U.LIZIZ("GetPageDataUseCase@d833.internalInvoke$2");
                        return objLJFF;
                    }
                } else {
                    C989700brU c989700brU = new C989700brU(new C1035210d2t());
                    C1C7U.LIZIZ("GetPageDataUseCase@d833.internalInvoke$2");
                    return c989700brU;
                }
            }
            AbstractC989720brW abstractC989720brWLIZ = C1002410cBz.LIZ((C0X52) obj);
            if (abstractC989720brWLIZ instanceof C989710brV) {
                HomepageInfoResponse homepageInfoResponse = (HomepageInfoResponse) ((C989710brV) abstractC989720brWLIZ).LIZIZ;
                ArrayList arrayList = new ArrayList();
                NewUserGuideInfoResponse newUserGuideInfoResponse = homepageInfoResponse.newUserGuideInfo;
                if (newUserGuideInfoResponse != null) {
                    this.LLILZ.getClass();
                    C1723030uwH c1723030uwHLIZIZ = C1722980uwC.LIZIZ(newUserGuideInfoResponse);
                    if (c1723030uwHLIZIZ != null && this.LLILZ.LIZ.LJLJJL(c1723030uwHLIZIZ.LJFF)) {
                        arrayList.add(c1723030uwHLIZIZ);
                    }
                }
                arrayList.add(this.LLILLL);
                ServiceInfoResponse serviceInfoResponse = homepageInfoResponse.serviceInfo;
                if (serviceInfoResponse != null) {
                    C1722980uwC c1722980uwC = this.LLILZ;
                    ArrayList arrayList2 = new ArrayList();
                    List<ServiceComponentResponse> list = serviceInfoResponse.components;
                    if (list != null) {
                        for (ServiceComponentResponse serviceComponentResponse : list) {
                            c1722980uwC.getClass();
                            C1723010uwF c1723010uwFLIZJ = C1722980uwC.LIZJ(serviceComponentResponse);
                            if (c1723010uwFLIZJ != null) {
                                arrayList2.add(c1723010uwFLIZJ);
                            }
                        }
                    }
                    if (arrayList2.size() > 0) {
                        Boolean.valueOf(arrayList.add(new C1723020uwG(serviceInfoResponse.title, arrayList2)));
                    }
                }
                C989710brV c989710brV = new C989710brV(new C1723000uwE(arrayList));
                C1C7U.LIZIZ("GetPageDataUseCase@d833.internalInvoke$2");
                return c989710brV;
            }
            if (abstractC989720brWLIZ instanceof C991340bu8) {
                C1C7U.LIZIZ("GetPageDataUseCase@d833.internalInvoke$2");
                return abstractC989720brWLIZ;
            }
            if (abstractC989720brWLIZ instanceof C989700brU) {
                C1C7U.LIZIZ("GetPageDataUseCase@d833.internalInvoke$2");
                return abstractC989720brWLIZ;
            }
            throw new C1954807lC();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C989700brU c989700brU2 = new C989700brU(th);
            C1C7U.LIZIZ("GetPageDataUseCase@d833.internalInvoke$2");
            return c989700brU2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super AbstractC989720brW<? extends C1723000uwE>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
