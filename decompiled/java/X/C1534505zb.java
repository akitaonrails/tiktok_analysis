package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.ecommerce.mall.service.video.IVideoDetailLoadService;
import com.ss.android.ugc.aweme.ecommerce.mall.service.video.VideoDetailRequestParams;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05zb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.ug.outofapp.sharevideo.manager.EcUgSharedVideoRefluxManager$preloadShopVideoList$1", f = "EcUgSharedVideoRefluxManager.kt", l = {242}, m = "invokeSuspend")
public final class C1534505zb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1534505zb(String str, InterfaceC1364105Vn<? super C1534505zb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1534505zb(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        VideoDetailRequestParams.Item item;
        C1C7U.LIZ("EcUgSharedVideoRefluxManager@178c.preloadShopVideoList$1");
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
            C1227904rF c1227904rF = C1227904rF.LIZ;
            String str = this.LLILLJJLI;
            c1227904rF.getClass();
            VideoDetailRequestParams videoDetailRequestParams = (VideoDetailRequestParams) C1227904rF.LIZIZ(str, VideoDetailRequestParams.class);
            List<VideoDetailRequestParams.Item> list = videoDetailRequestParams.items;
            if (list != null && (item = (VideoDetailRequestParams.Item) ListProtector.get(list, 0)) != null) {
                Integer num = videoDetailRequestParams.detailBizCode;
                new VideoDetailRequestParams.Item(item.id, item.feedType, item.subFeedType, null);
                VideoDetailRequestParams videoDetailRequestParams2 = new VideoDetailRequestParams(num, C1697810uHb.LJ(item));
                IVideoDetailLoadService iVideoDetailLoadServiceLIZ = C1181304jj.LIZ();
                if (iVideoDetailLoadServiceLIZ != null) {
                    this.LL = 1;
                    if (iVideoDetailLoadServiceLIZ.preloadDetail(videoDetailRequestParams2, false, null, this) == objLJFF) {
                        C1C7U.LIZIZ("EcUgSharedVideoRefluxManager@178c.preloadShopVideoList$1");
                        return objLJFF;
                    }
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EcUgSharedVideoRefluxManager@178c.preloadShopVideoList$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
