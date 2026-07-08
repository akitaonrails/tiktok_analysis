package X;

/* JADX INFO: renamed from: X.0i6t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.util.PublicGroupListRepo", f = "PublicGroupListRepo.kt", l = {117}, m = "hasExistPublicGroupForSelf")
public final class C1229890i6t extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1229870i6r LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1229890i6t(C1229870i6r c1229870i6r, InterfaceC1364105Vn<? super C1229890i6t> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c1229870i6r;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PublicGroupListRepo@b58.hasExistPublicGroupForSelf$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZLLL = this.LLILLJJLI.LIZLLL(null, this);
        C1C7U.LIZIZ("PublicGroupListRepo@b58.hasExistPublicGroupForSelf$1");
        return objLIZLLL;
    }
}
