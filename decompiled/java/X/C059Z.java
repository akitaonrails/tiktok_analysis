package X;

import com.ss.android.ugc.aweme.tools.draft.migratedraft.provider.query.DraftQueryService;

/* JADX INFO: renamed from: X.059Z, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.migratedraft.provider.query.DraftQueryService", f = "IDraftQueryService.kt", l = {75}, m = "doQueryDraftCountAndSize")
public final class C059Z extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ DraftQueryService LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C059Z(DraftQueryService draftQueryService, InterfaceC1364105Vn<? super C059Z> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = draftQueryService;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DraftQueryService@3808.doQueryDraftCountAndSize$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILZIL.LIZIZ(null, null, null, this);
        C1C7U.LIZIZ("DraftQueryService@3808.doQueryDraftCountAndSize$1");
        return objLIZIZ;
    }
}
