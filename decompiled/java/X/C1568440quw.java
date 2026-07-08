package X;

import com.ss.android.ugc.aweme.explore.data.ExploreTopicAwemeListResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: renamed from: X.0quw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.explore.performance.chunk.ExploreTopicFeedChunkProcessRequest$exploreFeedRequestByChunk$firstResponse$1", f = "ExploreTopicFeedChunkProcessRequest.kt", l = {102}, m = "invokeSuspend")
public final class C1568440quw extends C09AX implements InterfaceC1631620sYq<InterfaceC346701Wf<? super ExploreTopicAwemeListResponse>, Throwable, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C15TZ LLILLL;
    public final /* synthetic */ Function1<Throwable, Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1568440quw(C15TZ c15tz, InterfaceC1364105Vn interfaceC1364105Vn, Function1 function1) {
        super(3, interfaceC1364105Vn);
        this.LLILLL = c15tz;
        this.LLILZ = function1;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Throwable th;
        C1C7U.LIZ("ExploreTopicFeedChunkProcessRequest@8a90.exploreFeedRequestByChunk$firstResponse$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            th = (Throwable) this.LLILLJJLI;
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            th = (Throwable) this.LLILLJJLI;
            C2153908cD c2153908cD = C2153908cD.LIZ;
            AwS568S0100000_24 awS568S0100000_24 = new AwS568S0100000_24(th, 1818);
            c2153908cD.getClass();
            C2153908cD.LIZ("explore_topic_feed_chunk_process_request", awS568S0100000_24);
            C1AF0.LJFF(th, "explore_topic_feed_chunk_process_request: message error");
            this.LLILLL.LIZ.set(EnumC1568470quz.CHUNK_COMPLETE);
            C2252331DDr c2252331DDr = this.LLILLL.LIZJ;
            ExploreTopicAwemeListResponse exploreTopicAwemeListResponse = new ExploreTopicAwemeListResponse();
            this.LLILLJJLI = th;
            this.LL = 1;
            if (c2252331DDr.emit(exploreTopicAwemeListResponse, this) == objLJFF) {
                C1C7U.LIZIZ("ExploreTopicFeedChunkProcessRequest@8a90.exploreFeedRequestByChunk$firstResponse$1");
                return objLJFF;
            }
        }
        this.LLILZ.invoke(th);
        throw th;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(InterfaceC346701Wf<? super ExploreTopicAwemeListResponse> interfaceC346701Wf, Throwable th, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        C1568440quw c1568440quw = new C1568440quw(this.LLILLL, interfaceC1364105Vn, this.LLILZ);
        c1568440quw.LLILLJJLI = th;
        return c1568440quw.invokeSuspend(Unit.LIZ);
    }
}
