package X;

/* JADX INFO: renamed from: X.0CdM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.effect.EffectProfileListRepository", f = "EffectProfileListRepository.kt", l = {98}, m = "fetchStickerItemList-IoAF18A")
public final class C318020CdM extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C318050CdP LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C318020CdM(C318050CdP c318050CdP, InterfaceC1364105Vn<? super C318020CdM> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c318050CdP;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EffectProfileListRepository@4ea9.fetchStickerItemList$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZLLL = this.LLILLJJLI.LIZLLL(this);
        if (objLIZLLL == C099R.LJFF()) {
            C1C7U.LIZIZ("EffectProfileListRepository@4ea9.fetchStickerItemList$1");
            return objLIZLLL;
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objLIZLLL);
        C1C7U.LIZIZ("EffectProfileListRepository@4ea9.fetchStickerItemList$1");
        return c189200o6M1boximpl;
    }
}
