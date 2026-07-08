package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.mall.recommend.video.VideoDetailLoadImpl;
import com.ss.android.ugc.aweme.ecommerce.mall.service.video.RecommendItemsResponse;
import com.ss.android.ugc.aweme.ecommerce.mall.service.video.VideoDetailRequestParams;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05eI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.mall.recommend.video.VideoDetailLoadImpl$preloadDetail$2$3$2", f = "VideoDetailLoadImpl.kt", l = {63}, m = "invokeSuspend")
public final class C1402405eI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ VideoDetailLoadImpl LLILLJJLI;
    public final /* synthetic */ VideoDetailRequestParams LLILLL;
    public final /* synthetic */ List<String> LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1402405eI(VideoDetailLoadImpl videoDetailLoadImpl, VideoDetailRequestParams videoDetailRequestParams, List<String> list, String str, InterfaceC1364105Vn<? super C1402405eI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = videoDetailLoadImpl;
        this.LLILLL = videoDetailRequestParams;
        this.LLILZ = list;
        this.LLILZIL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1402405eI(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C1C7U.LIZ("VideoDetailLoadImpl@ad2f.preloadDetail$2$3$2");
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
                VideoDetailLoadImpl videoDetailLoadImpl = this.LLILLJJLI;
                VideoDetailRequestParams videoDetailRequestParams = this.LLILLL;
                this.LL = 1;
                obj = videoDetailLoadImpl.LIZLLL(videoDetailRequestParams, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("VideoDetailLoadImpl@ad2f.preloadDetail$2$3$2");
                    return objLJFF;
                }
            }
            List<RecommendItemsResponse.DetailItem> list = (List) obj;
            if (list != null) {
                VideoDetailLoadImpl videoDetailLoadImpl2 = this.LLILLJJLI;
                String str = this.LLILZIL;
                for (RecommendItemsResponse.DetailItem detailItem : list) {
                    String str2 = detailItem.id;
                    if (str2 == null || str2.length() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        videoDetailLoadImpl2.getClass();
                        VideoDetailLoadImpl.LIZJ(str, detailItem);
                        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("EcAwemeStruct VideoDetailLoadImpl preloadDetail cacheId=");
                        sbLIZ.append(detailItem.id);
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        c2341109Fh.getClass();
                        C2341109Fh.LIZ(strLIZIZ);
                    }
                }
            }
            List<String> list2 = this.LLILZ;
            VideoDetailLoadImpl videoDetailLoadImpl3 = this.LLILLJJLI;
            for (String str3 : list2) {
                C19719512Dh.LIZJ(videoDetailLoadImpl3.LIZ).remove(str3);
                C2341109Fh c2341109Fh2 = C2341109Fh.LIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("EcAwemeStruct VideoDetailLoadImpl preloadDetail fetchJobs.remove key=");
                sbLIZ2.append(str3);
                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                c2341109Fh2.getClass();
                C2341109Fh.LIZ(strLIZIZ2);
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("VideoDetailLoadImpl@ad2f.preloadDetail$2$3$2");
            return unit;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            List<String> list3 = this.LLILZ;
            VideoDetailLoadImpl videoDetailLoadImpl4 = this.LLILLJJLI;
            for (String str4 : list3) {
                C19719512Dh.LIZJ(videoDetailLoadImpl4.LIZ).remove(str4);
                C2341109Fh c2341109Fh3 = C2341109Fh.LIZ;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("EcAwemeStruct VideoDetailLoadImpl preloadDetail fetchJobs.remove key=");
                sbLIZ3.append(str4);
                String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ3);
                c2341109Fh3.getClass();
                C2341109Fh.LIZ(strLIZIZ3);
            }
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
