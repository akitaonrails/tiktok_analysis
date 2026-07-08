package X;

import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0W2R, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.storage.perf.FullUpdateMonitor", f = "FullUpdateMonitor.kt", l = {52, 54, 56}, m = "measure")
public final class C0W2R extends AbstractC23140094w {
    public Function2 LL;
    public long LLILLJJLI;
    public long LLILLL;
    public boolean LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ C0W2P LLILZLL;
    public int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0W2R(C0W2P c0w2p, InterfaceC1364105Vn<? super C0W2R> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZLL = c0w2p;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FullUpdateMonitor@67c.measure$1");
        this.LLILZIL = obj;
        this.LLIZ |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILZLL.LIZ(null, this);
        C1C7U.LIZIZ("FullUpdateMonitor@67c.measure$1");
        return objLIZ;
    }
}
