package X;

/* JADX INFO: renamed from: X.0FDT, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.sticker.core.text.resource.TextResourceRepository", f = "TextResourceRepository.kt", l = {35}, m = "fetchCategoryEffectList-0E7RQCE")
public final class C0FDT extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C0FDM LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0FDT(C0FDM c0fdm, InterfaceC1364105Vn<? super C0FDT> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c0fdm;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TextResourceRepository@b217.fetchCategoryEffectList$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJFF = this.LLILLJJLI.LJFF(null, false, this);
        if (objLJFF == C099R.LJFF()) {
            C1C7U.LIZIZ("TextResourceRepository@b217.fetchCategoryEffectList$1");
            return objLJFF;
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objLJFF);
        C1C7U.LIZIZ("TextResourceRepository@b217.fetchCategoryEffectList$1");
        return c189200o6M1boximpl;
    }
}
