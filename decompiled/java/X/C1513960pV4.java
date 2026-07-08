package X;

/* JADX INFO: renamed from: X.0pV4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ml.tars.task.ByteNNNativeTask", f = "ByteNNNativeTask.kt", l = {146, 164}, m = "asyncSingle")
public final class C1513960pV4 extends AbstractC23140094w {
    public C882890YkJ LL;
    public Object LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C1513910pUz LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1513960pV4(C1513910pUz c1513910pUz, InterfaceC1364105Vn<? super C1513960pV4> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c1513910pUz;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ByteNNNativeTask@77bc.asyncSingle$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLJIILIIL = this.LLILZ.LJIILIIL(null, this);
        C1C7U.LIZIZ("ByteNNNativeTask@77bc.asyncSingle$1");
        return objLJIILIIL;
    }
}
