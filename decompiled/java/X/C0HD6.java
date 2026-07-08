package X;

import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.ui.fragment.PostModeCommentListFragmentV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HD6, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ui.fragment.PostModeCommentListFragmentV2$sendCloseCommentEvent$1", f = "PostModeCommentListFragmentV2.kt", l = {}, m = "invokeSuspend")
public final class C0HD6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ PostModeCommentListFragmentV2 LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ long LLILZIL;
    public final /* synthetic */ C1343080l3S LLILZLL;
    public final /* synthetic */ long LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HD6(PostModeCommentListFragmentV2 postModeCommentListFragmentV2, long j, String str, long j2, long j3, C1343080l3S c1343080l3S, long j4, InterfaceC1364105Vn<? super C0HD6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = postModeCommentListFragmentV2;
        this.LLILLJJLI = j;
        this.LLILLL = str;
        this.LLILZ = j2;
        this.LLILZIL = j3;
        this.LLILZLL = c1343080l3S;
        this.LLIZ = j4;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0HD6(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PostModeCommentListFragmentV2@35e6.sendCloseCommentEvent$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        CommentContextSource commentContextSourceGL = this.LL.GL();
        long j = this.LLILLJJLI;
        String str = this.LLILLL;
        if (str == null) {
            str = "";
        }
        C1350920lG6.LJJLIIIJLJLI(commentContextSourceGL, j, str, null, this.LLILZ, this.LLILZIL, this.LLILZLL, 0L, this.LLIZ, 0L, 1304);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PostModeCommentListFragmentV2@35e6.sendCloseCommentEvent$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
