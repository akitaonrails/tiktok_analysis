package X;

/* JADX INFO: renamed from: X.13vL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.auth.contact.filter.PsiTask", f = "ContactFilterByPsi.kt", l = {496, 506, 508}, m = "findIntersect")
public final class C20165713vL extends AbstractC23140094w {
    public C20165213vG LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C20165313vH LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20165713vL(C20165313vH c20165313vH, InterfaceC1364105Vn<? super C20165713vL> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c20165313vH;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PsiTask@40e6.findIntersect$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJI = this.LLILLL.LJI(null, null, this);
        C1C7U.LIZIZ("PsiTask@40e6.findIntersect$1");
        return objLJI;
    }
}
