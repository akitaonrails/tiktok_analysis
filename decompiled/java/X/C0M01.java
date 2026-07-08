package X;

/* JADX INFO: renamed from: X.0M01, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.draftbox.data.DraftLoader", f = "DraftLoader.kt", l = {130}, m = "getTotalPageFreeUpSpace-BWLJW6A")
public final class C0M01 extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C0M03 LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0M01(C0M03 c0m03, InterfaceC1364105Vn<? super C0M01> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c0m03;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("DraftLoader@8d42.getTotalPageFreeUpSpace$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZLLL = this.LLILLJJLI.LIZLLL(null, null, null, this);
        if (objLIZLLL == C099R.LJFF()) {
            C1C7U.LIZIZ("DraftLoader@8d42.getTotalPageFreeUpSpace$1");
            return objLIZLLL;
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objLIZLLL);
        C1C7U.LIZIZ("DraftLoader@8d42.getTotalPageFreeUpSpace$1");
        return c189200o6M1boximpl;
    }
}
