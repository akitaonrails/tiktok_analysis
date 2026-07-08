package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.model.BannerDisplayInfo;
import com.ss.android.ugc.aweme.model.PhotoTopicBannerReadStatus;
import com.ss.android.ugc.aweme.model.PhotoTopicBannerResponse;
import com.ss.android.ugc.aweme.model.UpdatePhotoTopicBannerRequest;
import com.ss.android.ugc.aweme.phototopicbanner.PhotoTopicBannerApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0iuN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.phototopicbanner.PhotoTopicBannerRepository$updateBanner$1", f = "PhotoTopicBannerRepository.kt", l = {48}, m = "invokeSuspend")
public final class C1260570iuN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ PhotoTopicBannerReadStatus LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1260570iuN(PhotoTopicBannerReadStatus photoTopicBannerReadStatus, InterfaceC1364105Vn<? super C1260570iuN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = photoTopicBannerReadStatus;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1260570iuN c1260570iuN = new C1260570iuN(this.LLILLL, interfaceC1364105Vn);
        c1260570iuN.LLILLJJLI = obj;
        return c1260570iuN;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        String str;
        C1C7U.LIZ("PhotoTopicBannerRepository@b817.updateBanner$1");
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
                PhotoTopicBannerReadStatus photoTopicBannerReadStatus = this.LLILLL;
                PhotoTopicBannerApi.LIZ.getClass();
                PhotoTopicBannerApi value = C1260590iuP.LIZIZ.getValue();
                BannerDisplayInfo bannerDisplayInfo = C1260600iuQ.LIZ;
                if (bannerDisplayInfo != null) {
                    str = bannerDisplayInfo.trendId;
                } else {
                    str = null;
                }
                UpdatePhotoTopicBannerRequest updatePhotoTopicBannerRequest = new UpdatePhotoTopicBannerRequest(str, C2286608xc.LJ(photoTopicBannerReadStatus.getValue()), null, null, null);
                this.LL = 1;
                obj = value.updatePhotoTopicBanner(updatePhotoTopicBannerRequest, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("PhotoTopicBannerRepository@b817.updateBanner$1");
                    return objLJFF;
                }
            }
            c098200Yq = (PhotoTopicBannerResponse) obj;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m8isSuccessimpl(c098200Yq);
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C2344809Gs.LJI(thM5exceptionOrNullimpl);
        }
        PhotoTopicBannerReadStatus photoTopicBannerReadStatus2 = this.LLILLL;
        if (photoTopicBannerReadStatus2 == PhotoTopicBannerReadStatus.PUBLISH || photoTopicBannerReadStatus2 == PhotoTopicBannerReadStatus.DISMISS) {
            C1260600iuQ.LIZ = null;
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PhotoTopicBannerRepository@b817.updateBanner$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
