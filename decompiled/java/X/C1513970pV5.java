package X;

/* JADX INFO: renamed from: X.0pV5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ml.tars.task.ByteNNNativeTask", f = "ByteNNNativeTask.kt", l = {46, 48}, m = "async")
public final class C1513970pV5 extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1513910pUz LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1513970pV5(C1513910pUz c1513910pUz, InterfaceC1364105Vn<? super C1513970pV5> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c1513910pUz;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ByteNNNativeTask@77bc.async$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZJ = this.LLILLJJLI.LIZJ(null, this);
        C1C7U.LIZIZ("ByteNNNativeTask@77bc.async$1");
        return objLIZJ;
    }
}
