package X;

/* JADX INFO: renamed from: X.0rrW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.avatar.repo.SocPubStatusApiHelper", f = "SocPubStatusApiHelper.kt", l = {67}, m = "fetchGroupStoryStatus")
public final class C1604760rrW extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1604750rrV LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1604760rrW(C1604750rrV c1604750rrV, InterfaceC1364105Vn<? super C1604760rrW> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c1604750rrV;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SocPubStatusApiHelper@424c.fetchGroupStoryStatus$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLL.LIZ(null, null, this);
        C1C7U.LIZIZ("SocPubStatusApiHelper@424c.fetchGroupStoryStatus$1");
        return objLIZ;
    }
}
