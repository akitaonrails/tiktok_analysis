package X;

/* JADX INFO: renamed from: X.0KuE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipeline.service.NLETemplateModelLoader", f = "NLETemplateModelLoader.kt", l = {54, 57, 68, 70}, m = "load")
public final class C532320KuE extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C532310KuD LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C532320KuE(C532310KuD c532310KuD, InterfaceC1364105Vn<? super C532320KuE> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c532310KuD;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("NLETemplateModelLoader@5d3a.load$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILLJJLI.LIZIZ(null, null, null, null, false, this);
        C1C7U.LIZIZ("NLETemplateModelLoader@5d3a.load$1");
        return objLIZIZ;
    }
}
