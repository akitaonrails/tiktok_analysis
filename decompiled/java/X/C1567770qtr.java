package X;

/* JADX INFO: renamed from: X.0qtr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.effect.EffectLoader", f = "EffectLoader.kt", l = {96, 106}, m = "awaitResult-BWLJW6A")
public final class C1567770qtr extends AbstractC23140094w {
    public AnonymousClass0957 LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1599950rjl LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1567770qtr(C1599950rjl c1599950rjl, InterfaceC1364105Vn<? super C1567770qtr> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c1599950rjl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EffectLoader@fcd0.awaitResult$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLL.LIZ(false, null, null, this);
        if (objLIZ == C099R.LJFF()) {
            C1C7U.LIZIZ("EffectLoader@fcd0.awaitResult$1");
            return objLIZ;
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objLIZ);
        C1C7U.LIZIZ("EffectLoader@fcd0.awaitResult$1");
        return c189200o6M1boximpl;
    }
}
