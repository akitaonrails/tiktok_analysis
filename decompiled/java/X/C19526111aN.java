package X;

/* JADX INFO: renamed from: X.11aN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.audioservice.pipeline.handler.PPBaseHandler", f = "PPBaseHandler.kt", l = {282, 342}, m = "onFinished$suspendImpl")
public final class C19526111aN extends AbstractC23140094w {
    public AbstractC19526011aM LL;
    public InterfaceC19526511aR LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public Object LLILZIL;
    public InterfaceC19524311a5 LLILZLL;
    public Object LLIZ;
    public Object LLIZLLLIL;
    public Object LLJ;
    public /* synthetic */ Object LLJI;
    public final /* synthetic */ AbstractC19526011aM LLJIJIL;
    public int LLJILJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19526111aN(AbstractC19526011aM abstractC19526011aM, InterfaceC1364105Vn<? super C19526111aN> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLJIJIL = abstractC19526011aM;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PPBaseHandler@19d7.onFinished$1");
        this.LLJI = obj;
        this.LLJILJIL |= Integer.MIN_VALUE;
        Object objLJJI = AbstractC19526011aM.LJJI(this.LLJIJIL, null, null, null, null, this);
        C1C7U.LIZIZ("PPBaseHandler@19d7.onFinished$1");
        return objLJJI;
    }
}
