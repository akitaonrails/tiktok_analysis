package X;

import com.ss.android.ugc.aweme.base.ImageUrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.15VD, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.ss.android.ugc.aweme.explore.performance.image.ExploreCoverCacheHelper$resolveAsync$1", f = "ExploreCoverCacheHelper.kt", l = {}, m = "invokeSuspend")
public final class C15VD extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C20530015Va LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15VD(C20530015Va c20530015Va, InterfaceC1364105Vn<? super C15VD> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c20530015Va;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C15VD(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String aid;
        List<String> urls;
        String str;
        C1C7U.LIZ("ExploreCoverCacheHelper@dea7.resolveAsync$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Aweme aweme = this.LL.LIZJ;
        if (aweme != null && (aid = aweme.getAid()) != null) {
            ConcurrentHashMap<String, String> concurrentHashMap = C15VC.LIZ;
            String str2 = "explore_feed_image_cache";
            if (Intrinsics.LJFF(concurrentHashMap.get(aid), "explore_feed_image_cache")) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("ExploreCoverCacheHelper@dea7.resolveAsync$1");
                return unit;
            }
            ImageUrlModel imageUrlModel = this.LL.LIZIZ;
            if (imageUrlModel != null && (urls = imageUrlModel.getUrls()) != null && (str = (String) C13LP.LJJJLL(urls)) != null) {
                if (!C15VJ.LIZIZ(str, "explore_feed_image_cache") && C15VJ.LIZIZ(str, "photomode_image_cache_v2")) {
                    str2 = "photomode_image_cache_v2";
                }
                concurrentHashMap.put(aid, str2);
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("ExploreCoverCacheHelper@dea7.resolveAsync$1");
                return unit2;
            }
            Unit unit3 = Unit.LIZ;
            C1C7U.LIZIZ("ExploreCoverCacheHelper@dea7.resolveAsync$1");
            return unit3;
        }
        Unit unit4 = Unit.LIZ;
        C1C7U.LIZIZ("ExploreCoverCacheHelper@dea7.resolveAsync$1");
        return unit4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
