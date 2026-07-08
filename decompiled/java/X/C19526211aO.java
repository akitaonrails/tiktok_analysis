package X;

/* JADX INFO: renamed from: X.11aO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.audioservice.pipeline.handler.PPBaseHandler", f = "PPBaseHandler.kt", l = {102, 115, 131}, m = "process$suspendImpl")
public final class C19526211aO extends AbstractC23140094w {
    public AbstractC19526011aM LL;
    public InterfaceC19526511aR LLILLJJLI;
    public Object LLILLL;
    public C11ZU LLILZ;
    public C19527011aW LLILZIL;
    public C19525911aL LLILZLL;
    public /* synthetic */ Object LLIZ;
    public final /* synthetic */ AbstractC19526011aM LLIZLLLIL;
    public int LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19526211aO(AbstractC19526011aM abstractC19526011aM, InterfaceC1364105Vn<? super C19526211aO> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLIZLLLIL = abstractC19526011aM;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PPBaseHandler@19d7.process$1");
        this.LLIZ = obj;
        this.LLJ |= Integer.MIN_VALUE;
        Object objLJJIFFI = AbstractC19526011aM.LJJIFFI(this.LLIZLLLIL, null, null, null, this);
        C1C7U.LIZIZ("PPBaseHandler@19d7.process$1");
        return objLJJIFFI;
    }
}
