package X;

/* JADX INFO: renamed from: X.0Oc9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.repository.BulletinCommentRepository$_operator$1", f = "BulletinCommentRepository.kt", l = {143}, m = "deleteComment")
public final class C623030Oc9 extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C623010Oc7 LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C623030Oc9(C623010Oc7 c623010Oc7, InterfaceC1364105Vn<? super C623030Oc9> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c623010Oc7;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BulletinCommentRepository@599a._operator$1$deleteComment$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objDeleteComment = this.LLILLJJLI.deleteComment(null, this);
        C1C7U.LIZIZ("BulletinCommentRepository@599a._operator$1$deleteComment$1");
        return objDeleteComment;
    }
}
