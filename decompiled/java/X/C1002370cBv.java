package X;

/* JADX INFO: renamed from: X.0cBv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.auth.contact.handler.ContactBaseHandler", f = "ContactBaseHandler.kt", l = {35}, m = "handle")
public final class C1002370cBv extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ AbstractC1002380cBw LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1002370cBv(AbstractC1002380cBw abstractC1002380cBw, InterfaceC1364105Vn<? super C1002370cBv> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = abstractC1002380cBw;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ContactBaseHandler@cc97.handle$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILLJJLI.LIZIZ(this);
        C1C7U.LIZIZ("ContactBaseHandler@cc97.handle$1");
        return objLIZIZ;
    }
}
