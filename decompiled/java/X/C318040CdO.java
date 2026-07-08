package X;

/* JADX INFO: renamed from: X.0CdO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.effect.EffectProfileListRepository", f = "EffectProfileListRepository.kt", l = {154}, m = "fetchDraftList")
public final class C318040CdO extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C318050CdP LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C318040CdO(C318050CdP c318050CdP, InterfaceC1364105Vn<? super C318040CdO> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c318050CdP;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EffectProfileListRepository@4ea9.fetchDraftList$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILLJJLI.LIZIZ(this);
        C1C7U.LIZIZ("EffectProfileListRepository@4ea9.fetchDraftList$1");
        return objLIZIZ;
    }
}
