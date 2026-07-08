package X;

import com.ss.android.ugc.aweme.explore.data.ExploreAwemeList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: renamed from: X.0qur, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.explore.performance.chunk.ExploreMainTopicChunkProcessRequest$exploreFeedRequestByChunk$firstResponse$1", f = "ExploreMainTopicChunkProcessRequest.kt", l = {109}, m = "invokeSuspend")
public final class C1568390qur extends C09AX implements InterfaceC1631620sYq<InterfaceC346701Wf<? super ExploreAwemeList>, Throwable, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ Function1<Throwable, Unit> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1568390qur(Function1<? super Throwable, Unit> function1, InterfaceC1364105Vn<? super C1568390qur> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LLILLL = function1;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Throwable th;
        C1C7U.LIZ("ExploreMainTopicChunkProcessRequest@d89c.exploreFeedRequestByChunk$firstResponse$1");
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
            AwS568S0100000_24 awS568S0100000_24 = new AwS568S0100000_24(th, 1817);
            c2153908cD.getClass();
            C2153908cD.LIZ("explore_main_topic_chunk_process_request", awS568S0100000_24);
            C1AF0.LJFF(th, "explore_main_topic_chunk_process_request: message error");
            C20524815Ta.LIZIZ.set(EnumC1568420quu.CHUNK_COMPLETE);
            C2252331DDr c2252331DDr = C20524815Ta.LIZLLL;
            ExploreAwemeList exploreAwemeList = new ExploreAwemeList();
            this.LLILLJJLI = th;
            this.LL = 1;
            if (c2252331DDr.emit(exploreAwemeList, this) == objLJFF) {
                C1C7U.LIZIZ("ExploreMainTopicChunkProcessRequest@d89c.exploreFeedRequestByChunk$firstResponse$1");
                return objLJFF;
            }
        }
        this.LLILLL.invoke(th);
        throw th;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(InterfaceC346701Wf<? super ExploreAwemeList> interfaceC346701Wf, Throwable th, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        C1568390qur c1568390qur = new C1568390qur(this.LLILLL, interfaceC1364105Vn);
        c1568390qur.LLILLJJLI = th;
        return c1568390qur.invokeSuspend(Unit.LIZ);
    }
}
