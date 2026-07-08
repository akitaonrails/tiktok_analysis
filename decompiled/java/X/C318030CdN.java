package X;

/* JADX INFO: renamed from: X.0CdN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.effect.EffectProfileListRepository", f = "EffectProfileListRepository.kt", l = {130}, m = "fetchDraftCard")
public final class C318030CdN extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C318050CdP LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C318030CdN(C318050CdP c318050CdP, InterfaceC1364105Vn<? super C318030CdN> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c318050CdP;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EffectProfileListRepository@4ea9.fetchDraftCard$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLJJLI.LIZ(this);
        C1C7U.LIZIZ("EffectProfileListRepository@4ea9.fetchDraftCard$1");
        return objLIZ;
    }
}
