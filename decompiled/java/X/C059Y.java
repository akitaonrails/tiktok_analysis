package X;

import com.ss.android.ugc.aweme.tools.draft.migratedraft.provider.query.DraftQueryService;

/* JADX INFO: renamed from: X.059Y, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.migratedraft.provider.query.DraftQueryService", f = "IDraftQueryService.kt", l = {102}, m = "queryAIGCProcessingIds")
public final class C059Y extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ DraftQueryService LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C059Y(DraftQueryService draftQueryService, InterfaceC1364105Vn<? super C059Y> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = draftQueryService;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DraftQueryService@3808.queryAIGCProcessingIds$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZJ = this.LLILLJJLI.LIZJ(this);
        C1C7U.LIZIZ("DraftQueryService@3808.queryAIGCProcessingIds$1");
        return objLIZJ;
    }
}
