package X;

import com.ss.android.ugc.aweme.explore.data.ExploreTopicAwemeListResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NMj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.explore.performance.chunk.ExploreTopicFeedChunkProcessRequest$exploreFeedRequestByChunk$firstResponse$2", f = "ExploreTopicFeedChunkProcessRequest.kt", l = {}, m = "invokeSuspend")
public final class C592670NMj extends C09AX implements Function2<ExploreTopicAwemeListResponse, InterfaceC1364105Vn<? super Boolean>, Object> {
    public /* synthetic */ Object LL;

    public C592670NMj(InterfaceC1364105Vn<? super C592670NMj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C592670NMj c592670NMj = new C592670NMj(interfaceC1364105Vn);
        c592670NMj.LL = obj;
        return c592670NMj;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C1C7U.LIZ("ExploreTopicFeedChunkProcessRequest@8a90.exploreFeedRequestByChunk$firstResponse$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List<Aweme> list = ((ExploreTopicAwemeListResponse) this.LL).items;
        if (list != null && !list.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        Boolean boolValueOf = Boolean.valueOf(!z);
        C1C7U.LIZIZ("ExploreTopicFeedChunkProcessRequest@8a90.exploreFeedRequestByChunk$firstResponse$2");
        return boolValueOf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ExploreTopicAwemeListResponse exploreTopicAwemeListResponse, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(exploreTopicAwemeListResponse, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
