package X;

import com.ss.android.ugc.aweme.search.csi.profile.api.SearchCSIProfilerBannerAPIV3;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08cy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.csi.profile.repo.SearchCSIProfileBannerRepoV3$requestBannerData$response$1", f = "SearchCSIProfileBannerRepoV3.kt", l = {1584}, m = "invokeSuspend")
public final class C2158608cy extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super SearchCSIProfilerBannerAPIV3.BannerListResponseV3>, Object> {
    public int LL;
    public final /* synthetic */ C2158908d1 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2158608cy(C2158908d1 c2158908d1, InterfaceC1364105Vn<? super C2158608cy> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c2158908d1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2158608cy(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("SearchCSIProfileBannerRepoV3@3eb2.requestBannerData$response$1");
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
            C2158908d1 c2158908d1 = this.LLILLJJLI;
            this.LL = 1;
            obj = C23250099c.LJI(this, C0PEM.LIZJ, new C2158708cz(c2158908d1, null));
            if (obj == objLJFF) {
                C1C7U.LIZIZ("SearchCSIProfileBannerRepoV3@3eb2.requestBannerData$response$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("SearchCSIProfileBannerRepoV3@3eb2.requestBannerData$response$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super SearchCSIProfilerBannerAPIV3.BannerListResponseV3> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
