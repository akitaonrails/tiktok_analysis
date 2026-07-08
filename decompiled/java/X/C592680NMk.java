package X;

import com.ss.android.ugc.aweme.explore.data.ExploreTopicAwemeListResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0NMk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.explore.performance.chunk.ExploreTopicFeedChunkProcessRequest$observeState$2$3", f = "ExploreTopicFeedChunkProcessRequest.kt", l = {}, m = "invokeSuspend")
public final class C592680NMk extends C09AX implements InterfaceC1631620sYq<InterfaceC346701Wf<? super ExploreTopicAwemeListResponse>, Throwable, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ Function1<Throwable, Unit> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C592680NMk(Function1<? super Throwable, Unit> function1, InterfaceC1364105Vn<? super C592680NMk> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LLILLJJLI = function1;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ExploreTopicFeedChunkProcessRequest@8a90.observeState$2$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LLILLJJLI.invoke((Throwable) this.LL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ExploreTopicFeedChunkProcessRequest@8a90.observeState$2$3");
        return unit;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(InterfaceC346701Wf<? super ExploreTopicAwemeListResponse> interfaceC346701Wf, Throwable th, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        C592680NMk c592680NMk = new C592680NMk(this.LLILLJJLI, interfaceC1364105Vn);
        c592680NMk.LL = th;
        return c592680NMk.invokeSuspend(Unit.LIZ);
    }
}
