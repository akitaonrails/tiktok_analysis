package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.search.vision.record.model.SysRecommendFeedItem;
import com.ss.android.ugc.aweme.ecommerce.search.vision.record.model.SysRecommendModel;
import com.ss.android.ugc.aweme.ecommerce.search.vision.record.sysrecommend.api.PhotoSearchSysRecommendApi;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0kBN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.vision.record.model.EcPhotoSearchAlbumVM$exposureReport$1", f = "EcPhotoSearchAlbumVM.kt", l = {126}, m = "invokeSuspend")
public final class C1309550kBN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ SysRecommendModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1309550kBN(SysRecommendModel sysRecommendModel, InterfaceC1364105Vn<? super C1309550kBN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = sysRecommendModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1309550kBN(this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        ?? arrayList;
        C1C7U.LIZ("EcPhotoSearchAlbumVM@fd2.exposureReport$1");
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
                SysRecommendModel sysRecommendModel = this.LLILLJJLI;
                PhotoSearchSysRecommendApi.LIZ.getClass();
                PhotoSearchSysRecommendApi photoSearchSysRecommendApi = C1309560kBO.LIZIZ;
                List<SysRecommendFeedItem> list = sysRecommendModel.feedList;
                if (list != null) {
                    arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                    for (SysRecommendFeedItem sysRecommendFeedItem : list) {
                        arrayList.add(new PhotoSearchSysRecommendApi.ExposureRecommendItem(sysRecommendFeedItem.id, sysRecommendFeedItem.type, sysRecommendFeedItem.feedItemSourceType));
                    }
                } else {
                    arrayList = C13BV.INSTANCE;
                }
                PhotoSearchSysRecommendApi.SysRecommendWriteParams sysRecommendWriteParams = new PhotoSearchSysRecommendApi.SysRecommendWriteParams("shooting_page", "default", arrayList, new PhotoSearchSysRecommendApi.SessionInfo(sysRecommendModel.sessionId));
                this.LL = 1;
                obj = photoSearchSysRecommendApi.exposureRecommendProducts(sysRecommendWriteParams, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("EcPhotoSearchAlbumVM@fd2.exposureReport$1");
                    return objLJFF;
                }
            }
            C189200o6.m2constructorimpl((C0X52) obj);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EcPhotoSearchAlbumVM@fd2.exposureReport$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
