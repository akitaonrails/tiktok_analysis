package X;

import org.json.JSONException;

/* JADX INFO: renamed from: X.0Z0R, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tars.impl.TarsPipelineExecution", f = "TarsPipelineExecution.kt", l = {89, 90, 107, 125}, m = "nextNode")
public final class C0Z0R extends AbstractC23140094w {
    public InterfaceC892680Z0g LL;
    public C882890YkJ LLILLJJLI;
    public C0Z0Q LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ C0Z0P LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0Z0R(C0Z0P c0z0p, InterfaceC1364105Vn<? super C0Z0R> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = c0z0p;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        C1C7U.LIZ("TarsPipelineExecution@e84c.nextNode$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLIZJ = this.LLILZIL.LIZJ(null, this);
        C1C7U.LIZIZ("TarsPipelineExecution@e84c.nextNode$1");
        return objLIZJ;
    }
}
