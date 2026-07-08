package X;

import com.ss.android.ugc.aweme.explore.data.ExploreTopicAwemeListResponse;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.15Tk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.ss.android.ugc.aweme.explore.performance.chunk.ExploreTopicFeedChunkProcessRequest", f = "ExploreTopicFeedChunkProcessRequest.kt", l = {106, 110, 114}, m = "exploreFeedRequestByChunk")
public final class C20525815Tk extends AbstractC23140094w {
    public Object LL;
    public Function1 LLILLJJLI;
    public ExploreTopicAwemeListResponse LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ C15TZ LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20525815Tk(C15TZ c15tz, InterfaceC1364105Vn<? super C20525815Tk> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = c15tz;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ExploreTopicFeedChunkProcessRequest@8a90.exploreFeedRequestByChunk$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILZIL.LIZ(null, 0L, null, null, null, null, null, null, null, this);
        C1C7U.LIZIZ("ExploreTopicFeedChunkProcessRequest@8a90.exploreFeedRequestByChunk$1");
        return objLIZ;
    }
}
