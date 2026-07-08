package X;

/* JADX INFO: renamed from: X.08pA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.comment.longpresspanel.api.CommentReusePermissionChecker", f = "CommentReusePermissionChecker.kt", l = {77, 81}, m = "request")
public final class C2234208pA extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C2234308pB LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2234208pA(C2234308pB c2234308pB, InterfaceC1364105Vn<? super C2234208pA> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c2234308pB;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CommentReusePermissionChecker@c77b.request$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILLJJLI.LIZIZ(null, this);
        C1C7U.LIZIZ("CommentReusePermissionChecker@c77b.request$1");
        return objLIZIZ;
    }
}
