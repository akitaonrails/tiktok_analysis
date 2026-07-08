package X;

/* JADX INFO: renamed from: X.0FDU, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.sticker.core.text.resource.TextResourceRepository", f = "TextResourceRepository.kt", l = {42}, m = "fetchEffectList-0E7RQCE")
public final class C0FDU extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C0FDM LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0FDU(C0FDM c0fdm, InterfaceC1364105Vn<? super C0FDU> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c0fdm;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TextResourceRepository@b217.fetchEffectList$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJI = this.LLILLJJLI.LJI(null, false, this);
        if (objLJI == C099R.LJFF()) {
            C1C7U.LIZIZ("TextResourceRepository@b217.fetchEffectList$1");
            return objLJI;
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objLJI);
        C1C7U.LIZIZ("TextResourceRepository@b217.fetchEffectList$1");
        return c189200o6M1boximpl;
    }
}
