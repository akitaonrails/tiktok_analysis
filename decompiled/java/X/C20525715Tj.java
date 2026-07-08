package X;

import com.ss.android.ugc.aweme.explore.data.ExploreAwemeList;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.15Tj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.ss.android.ugc.aweme.explore.performance.chunk.ExploreMainTopicChunkProcessRequest", f = "ExploreMainTopicChunkProcessRequest.kt", l = {113, 117, 122}, m = "exploreFeedRequestByChunk")
public final class C20525715Tj extends AbstractC23140094w {
    public boolean LL;
    public int LLILLJJLI;
    public Object LLILLL;
    public Function1 LLILZ;
    public ExploreAwemeList LLILZIL;
    public /* synthetic */ Object LLILZLL;
    public final /* synthetic */ C20524815Ta LLIZ;
    public int LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20525715Tj(C20524815Ta c20524815Ta, InterfaceC1364105Vn<? super C20525715Tj> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLIZ = c20524815Ta;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ExploreMainTopicChunkProcessRequest@d89c.exploreFeedRequestByChunk$1");
        this.LLILZLL = obj;
        this.LLIZLLLIL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLIZ.LIZ(false, false, null, 0, null, null, null, null, null, null, this);
        C1C7U.LIZIZ("ExploreMainTopicChunkProcessRequest@d89c.exploreFeedRequestByChunk$1");
        return objLIZ;
    }
}
