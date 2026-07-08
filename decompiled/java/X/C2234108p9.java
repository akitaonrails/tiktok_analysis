package X;

import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.story.model.ContentReuseResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.08p9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.comment.longpresspanel.api.CommentReusePermissionChecker$fetch$1", f = "CommentReusePermissionChecker.kt", l = {70}, m = "invokeSuspend")
public final class C2234108p9 extends C09AX implements Function1<InterfaceC1364105Vn<? super ContentReuseResponse>, Object> {
    public int LL;
    public final /* synthetic */ Comment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2234108p9(Comment comment, InterfaceC1364105Vn<? super C2234108p9> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = comment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2234108p9(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super ContentReuseResponse> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CommentReusePermissionChecker@c77b.fetch$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C2234308pB c2234308pB = C2234308pB.LIZ;
            Comment comment = this.LLILLJJLI;
            this.LL = 1;
            obj = c2234308pB.LIZIZ(comment, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("CommentReusePermissionChecker@c77b.fetch$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("CommentReusePermissionChecker@c77b.fetch$1");
        return obj;
    }
}
