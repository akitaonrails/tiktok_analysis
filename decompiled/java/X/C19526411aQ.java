package X;

/* JADX INFO: renamed from: X.11aQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.audioservice.pipeline.handler.PPBaseHandler", f = "PPBaseHandler.kt", l = {154}, m = "processWithCache")
public final class C19526411aQ extends AbstractC23140094w {
    public C11ZU LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ AbstractC19526011aM LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19526411aQ(AbstractC19526011aM abstractC19526011aM, InterfaceC1364105Vn<? super C19526411aQ> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = abstractC19526011aM;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PPBaseHandler@19d7.processWithCache$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLJJII = this.LLILZIL.LJJII(null, null, null, this);
        C1C7U.LIZIZ("PPBaseHandler@19d7.processWithCache$1");
        return objLJJII;
    }
}
