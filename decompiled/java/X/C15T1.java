package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.explore.data.ExplorePostItem;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.15T1, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.ss.android.ugc.aweme.explore.data.hotcache.ExploreHotCacheDataManager$cacheInnerVideo$1", f = "ExploreHotCacheDataManager.kt", l = {}, m = "invokeSuspend")
public final class C15T1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ List<ExplorePostItem> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15T1(List<ExplorePostItem> list, InterfaceC1364105Vn<? super C15T1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C15T1(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ExploreHotCacheDataManager@1354.cacheInnerVideo$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (C15T4.LIZ().enableDownloadVideo && C15T4.LIZ().enable) {
            C2153908cD c2153908cD = C2153908cD.LIZ;
            int iMin = Math.min(C15T4.LIZ().downloadVideoCnt, this.LL.size());
            for (int i = 0; i < iMin; i++) {
                C20524115St c20524115St = C20524115St.LL;
                ExplorePostItem explorePostItem = (ExplorePostItem) ListProtector.get(this.LL, i);
                c20524115St.getClass();
                Set<String> set = C591510NHx.LIZ;
                C591510NHx.LIZ(C15T4.LIZ().downloadVideoSize, explorePostItem.aweme);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ExploreHotCacheDataManager@1354.cacheInnerVideo$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
