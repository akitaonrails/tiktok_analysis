package X;

import com.ss.android.ugc.aweme.explore.data.ExploreAwemeList;
import com.ss.android.ugc.aweme.explore.data.ExplorePostItem;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Cuu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.explore.performance.chunk.ExploreMainTopicChunkProcessRequest$exploreFeedRequestByChunk$firstResponse$2", f = "ExploreMainTopicChunkProcessRequest.kt", l = {}, m = "invokeSuspend")
public final class C328900Cuu extends C09AX implements Function2<ExploreAwemeList, InterfaceC1364105Vn<? super Boolean>, Object> {
    public /* synthetic */ Object LL;

    public C328900Cuu(InterfaceC1364105Vn<? super C328900Cuu> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C328900Cuu c328900Cuu = new C328900Cuu(interfaceC1364105Vn);
        c328900Cuu.LL = obj;
        return c328900Cuu;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C1C7U.LIZ("ExploreMainTopicChunkProcessRequest@d89c.exploreFeedRequestByChunk$firstResponse$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List<ExplorePostItem> list = ((ExploreAwemeList) this.LL).items;
        if (list != null && !list.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        Boolean boolValueOf = Boolean.valueOf(!z);
        C1C7U.LIZIZ("ExploreMainTopicChunkProcessRequest@d89c.exploreFeedRequestByChunk$firstResponse$2");
        return boolValueOf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ExploreAwemeList exploreAwemeList, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(exploreAwemeList, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
