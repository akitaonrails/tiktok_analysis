package X;

import com.ss.android.ugc.aweme.explore.domian.ExploreCustomTopicDataSource;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0y1a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.explore.domian.ExploreCustomTopicDataSource", f = "ExploreCustomTopicDataSource.kt", l = {218}, m = "processApi")
public final class C1841640y1a extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ ExploreCustomTopicDataSource LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1841640y1a(ExploreCustomTopicDataSource exploreCustomTopicDataSource, InterfaceC1364105Vn<? super C1841640y1a> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = exploreCustomTopicDataSource;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        C1C7U.LIZ("ExploreCustomTopicDataSource@ab86.processApi$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objProcessApi = this.LLILLJJLI.processApi(this);
        C1C7U.LIZIZ("ExploreCustomTopicDataSource@ab86.processApi$1");
        return objProcessApi;
    }
}
