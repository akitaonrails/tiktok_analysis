package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.search.vision.record.model.EcPhotoSearchAlbumVM;
import com.ss.android.ugc.aweme.ecommerce.search.vision.record.model.SysRecommendModel;
import com.ss.android.ugc.aweme.ecommerce.search.vision.record.sysrecommend.api.PhotoSearchSysRecommendApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0kBM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.vision.record.model.EcPhotoSearchAlbumVM$fetchSysRecommendProducts$1", f = "EcPhotoSearchAlbumVM.kt", l = {158, 168}, m = "invokeSuspend")
public final class C1309540kBM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ EcPhotoSearchAlbumVM LLILLJJLI;
    public final /* synthetic */ Function1<SysRecommendModel, Unit> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1309540kBM(EcPhotoSearchAlbumVM ecPhotoSearchAlbumVM, Function1<? super SysRecommendModel, Unit> function1, InterfaceC1364105Vn<? super C1309540kBM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = ecPhotoSearchAlbumVM;
        this.LLILLL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1309540kBM(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        SysRecommendModel sysRecommendModel;
        Response response;
        int i;
        String str;
        Object objSysRecommendProducts = obj;
        C1C7U.LIZ("EcPhotoSearchAlbumVM@fd2.fetchSysRecommendProducts$1");
        Object objLJFF = C099R.LJFF();
        int i2 = this.LL;
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    C155000ia.LIZIZ(objSysRecommendProducts);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("EcPhotoSearchAlbumVM@fd2.fetchSysRecommendProducts$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(objSysRecommendProducts);
        } else {
            C155000ia.LIZIZ(objSysRecommendProducts);
            EcPhotoSearchAlbumVM ecPhotoSearchAlbumVM = this.LLILLJJLI;
            PhotoSearchSysRecommendApi.LIZ.getClass();
            PhotoSearchSysRecommendApi photoSearchSysRecommendApi = C1309560kBO.LIZIZ;
            SysRecommendModel value = ecPhotoSearchAlbumVM.LLILLL.getValue();
            if (value != null) {
                i = value.nextCursor;
            } else {
                i = 1;
            }
            SysRecommendModel value2 = ecPhotoSearchAlbumVM.LLILLL.getValue();
            if (value2 == null || (str = value2.sessionId) == null) {
                str = "";
            }
            PhotoSearchSysRecommendApi.SysRecommendParams sysRecommendParams = new PhotoSearchSysRecommendApi.SysRecommendParams("shooting_page", 4, i, str, ecPhotoSearchAlbumVM.yQ2());
            this.LL = 1;
            objSysRecommendProducts = photoSearchSysRecommendApi.sysRecommendProducts(sysRecommendParams, this);
            if (objSysRecommendProducts == objLJFF) {
                C1C7U.LIZIZ("EcPhotoSearchAlbumVM@fd2.fetchSysRecommendProducts$1");
                return objLJFF;
            }
        }
        c098200Yq = (C0X52) objSysRecommendProducts;
        C189200o6.m2constructorimpl(c098200Yq);
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        C0X52 c0x52 = (C0X52) c098200Yq;
        if (c0x52 != null && (response = (Response) c0x52.LIZIZ) != null) {
            sysRecommendModel = (SysRecommendModel) response.data;
        } else {
            sysRecommendModel = null;
        }
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C1309520kBK c1309520kBK = new C1309520kBK(sysRecommendModel, this.LLILLL, this.LLILLJJLI, null);
        this.LL = 2;
        if (C23250099c.LJI(this, abstractC2238408pq, c1309520kBK) == objLJFF) {
            C1C7U.LIZIZ("EcPhotoSearchAlbumVM@fd2.fetchSysRecommendProducts$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("EcPhotoSearchAlbumVM@fd2.fetchSysRecommendProducts$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
