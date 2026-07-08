package X;

/* JADX INFO: renamed from: X.0hqX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.audioservice.pipeline.handler.PPSingleProcessHandler", f = "PPSingleProcessHandler.kt", l = {23, 35}, m = "doProcess$suspendImpl")
public final class C1219750hqX extends AbstractC23140094w {
    public AbstractC1219760hqY LL;
    public Object LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ AbstractC1219760hqY LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1219750hqX(AbstractC1219760hqY abstractC1219760hqY, InterfaceC1364105Vn<? super C1219750hqX> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = abstractC1219760hqY;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("PPSingleProcessHandler@7710.doProcess$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLJJIJIIJIL = AbstractC1219760hqY.LJJIJIIJIL(this.LLILZ, null, null, null, this);
        C1C7U.LIZIZ("PPSingleProcessHandler@7710.doProcess$1");
        return objLJJIJIIJIL;
    }
}
