package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.mall.service.video.IVideoDetailLoadService;
import com.ss.android.ugc.aweme.ecommerce.mall.service.video.VideoDetailRequestParams;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05za, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.video.vo.ECAwemeListModel$loadAweme$2", f = "ECAwemeListModel.kt", l = {263}, m = "invokeSuspend")
public final class C1534405za extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ C1525405y8 LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1534405za(String str, C1525405y8 c1525405y8, InterfaceC1364105Vn<? super C1534405za> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = str;
        this.LLILZ = c1525405y8;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1534405za c1534405za = new C1534405za(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c1534405za.LLILLJJLI = obj;
        return c1534405za;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Unit unit;
        VideoDetailRequestParams.Item item;
        C1C7U.LIZ("ECAwemeListModel@117f.loadAweme$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            String str = this.LLILLL;
            C1525405y8 c1525405y8 = this.LLILZ;
            C1227904rF.LIZ.getClass();
            VideoDetailRequestParams videoDetailRequestParams = (VideoDetailRequestParams) C1227904rF.LIZIZ(str, VideoDetailRequestParams.class);
            List<VideoDetailRequestParams.Item> list = videoDetailRequestParams.items;
            unit = null;
            if (list != null && (item = list.get(0)) != null) {
                Integer num = videoDetailRequestParams.detailBizCode;
                new VideoDetailRequestParams.Item(item.id, item.feedType, item.subFeedType, null);
                VideoDetailRequestParams videoDetailRequestParams2 = new VideoDetailRequestParams(num, C1697810uHb.LJ(item));
                c1525405y8.LLIZ = videoDetailRequestParams2;
                IVideoDetailLoadService iVideoDetailLoadServiceLIZ = C1181304jj.LIZ();
                if (iVideoDetailLoadServiceLIZ != null) {
                    this.LL = 1;
                    if (iVideoDetailLoadServiceLIZ.preloadDetail(videoDetailRequestParams2, false, null, this) == objLJFF) {
                        C1C7U.LIZIZ("ECAwemeListModel@117f.loadAweme$2");
                        return objLJFF;
                    }
                }
            }
            C189200o6.m2constructorimpl(unit);
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("ECAwemeListModel@117f.loadAweme$2");
            return unit2;
        }
        unit = Unit.LIZ;
        C189200o6.m2constructorimpl(unit);
        Unit unit22 = Unit.LIZ;
        C1C7U.LIZIZ("ECAwemeListModel@117f.loadAweme$2");
        return unit22;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
