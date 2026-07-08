package X;

/* JADX INFO: renamed from: X.0ihf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.api.ProfileFollowService$follow$$inlined$map$1$2", f = "ProfileFollowService.kt", l = {223}, m = "emit")
public final class C1252690ihf extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ C1252670ihd LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1252690ihf(C1252670ihd c1252670ihd, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c1252670ihd;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ProfileFollowService@f9b9.follow$$inlined$map$1$2$1");
        this.LL = obj;
        this.LLILLJJLI |= Integer.MIN_VALUE;
        Object objEmit = this.LLILLL.emit(null, this);
        C1C7U.LIZIZ("ProfileFollowService@f9b9.follow$$inlined$map$1$2$1");
        return objEmit;
    }
}
