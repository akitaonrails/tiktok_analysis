package X;

/* JADX INFO: renamed from: X.0pV3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ml.tars.task.ByteNNNativeTask", f = "ByteNNNativeTask.kt", l = {60}, m = "asyncBatch")
public final class C1513950pV3 extends AbstractC23140094w {
    public C882890YkJ LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1513910pUz LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1513950pV3(C1513910pUz c1513910pUz, InterfaceC1364105Vn<? super C1513950pV3> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c1513910pUz;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ByteNNNativeTask@77bc.asyncBatch$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJIIL = this.LLILLL.LJIIL(null, this);
        C1C7U.LIZIZ("ByteNNNativeTask@77bc.asyncBatch$1");
        return objLJIIL;
    }
}
