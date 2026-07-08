package X;

import com.ss.android.ugc.aweme.tools.draft.migratedraft.provider.pack.DraftPackService;

/* JADX INFO: renamed from: X.0WIw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.migratedraft.provider.pack.DraftPackService", f = "DraftPackService.kt", l = {70}, m = "packageDraftFileZip")
public final class C821080WIw extends AbstractC23140094w {
    public Object LL;
    public C821110WIz LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public Object LLILZIL;
    public Object LLILZLL;
    public InterfaceC821090WIx LLIZ;
    public /* synthetic */ Object LLIZLLLIL;
    public final /* synthetic */ DraftPackService LLJ;
    public int LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C821080WIw(DraftPackService draftPackService, InterfaceC1364105Vn<? super C821080WIw> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLJ = draftPackService;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DraftPackService@b42d.packageDraftFileZip$1");
        this.LLIZLLLIL = obj;
        this.LLJI |= Integer.MIN_VALUE;
        Object objLJ = this.LLJ.LJ(null, null, false, null, 0L, this);
        C1C7U.LIZIZ("DraftPackService@b42d.packageDraftFileZip$1");
        return objLJ;
    }
}
