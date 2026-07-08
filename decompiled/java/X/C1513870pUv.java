package X;

/* JADX INFO: renamed from: X.0pUv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ml.tars.task.PitayaServiceTask", f = "PitayaServiceTask.kt", l = {108}, m = "asyncBatch")
public final class C1513870pUv extends AbstractC23140094w {
    public C882890YkJ LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1513840pUs LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1513870pUv(C1513840pUs c1513840pUs, InterfaceC1364105Vn<? super C1513870pUv> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c1513840pUs;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws C892820Z0u {
        C1C7U.LIZ("PitayaServiceTask@e9fa.asyncBatch$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJIIL = this.LLILLL.LJIIL(null, this);
        C1C7U.LIZIZ("PitayaServiceTask@e9fa.asyncBatch$1");
        return objLJIIL;
    }
}
