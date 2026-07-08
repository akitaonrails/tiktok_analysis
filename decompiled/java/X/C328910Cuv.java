package X;

import com.ss.android.ugc.aweme.explore.data.ExploreAwemeList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Cuv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.explore.performance.chunk.ExploreMainTopicChunkProcessRequest$observeState$2$3", f = "ExploreMainTopicChunkProcessRequest.kt", l = {}, m = "invokeSuspend")
public final class C328910Cuv extends C09AX implements InterfaceC1631620sYq<InterfaceC346701Wf<? super ExploreAwemeList>, Throwable, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ Function1<Throwable, Unit> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C328910Cuv(Function1<? super Throwable, Unit> function1, InterfaceC1364105Vn<? super C328910Cuv> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LLILLJJLI = function1;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ExploreMainTopicChunkProcessRequest@d89c.observeState$2$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LLILLJJLI.invoke((Throwable) this.LL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ExploreMainTopicChunkProcessRequest@d89c.observeState$2$3");
        return unit;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(InterfaceC346701Wf<? super ExploreAwemeList> interfaceC346701Wf, Throwable th, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        C328910Cuv c328910Cuv = new C328910Cuv(this.LLILLJJLI, interfaceC1364105Vn);
        c328910Cuv.LL = th;
        return c328910Cuv.invokeSuspend(Unit.LIZ);
    }
}
