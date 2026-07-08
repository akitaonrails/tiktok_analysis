package X;

/* JADX INFO: renamed from: X.0OcB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.repository.BulletinCommentRepository$_operator$1", f = "BulletinCommentRepository.kt", l = {71}, m = "fetchFirstlyCommentList")
public final class C623050OcB extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C623010Oc7 LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C623050OcB(C623010Oc7 c623010Oc7, InterfaceC1364105Vn<? super C623050OcB> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c623010Oc7;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BulletinCommentRepository@599a._operator$1$fetchFirstlyCommentList$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objN = this.LLILLJJLI.N(0, null, 0, 0, this);
        C1C7U.LIZIZ("BulletinCommentRepository@599a._operator$1$fetchFirstlyCommentList$1");
        return objN;
    }
}
