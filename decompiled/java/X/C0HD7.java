package X;

import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.commentv2.commentlist.ui.CommentListFragmentV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HD7, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commentv2.commentlist.ui.CommentListFragmentV2$sendCloseCommentEvent$1", f = "CommentListFragmentV2.kt", l = {}, m = "invokeSuspend")
public final class C0HD7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ CommentListFragmentV2 LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ long LLILZIL;
    public final /* synthetic */ C1343080l3S LLILZLL;
    public final /* synthetic */ long LLIZ;
    public final /* synthetic */ long LLIZLLLIL;
    public final /* synthetic */ long LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HD7(CommentListFragmentV2 commentListFragmentV2, long j, String str, String str2, long j2, C1343080l3S c1343080l3S, long j3, long j4, long j5, InterfaceC1364105Vn<? super C0HD7> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = commentListFragmentV2;
        this.LLILLJJLI = j;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = j2;
        this.LLILZLL = c1343080l3S;
        this.LLIZ = j3;
        this.LLIZLLLIL = j4;
        this.LLJ = j5;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0HD7(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CommentListFragmentV2@8fe4.sendCloseCommentEvent$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        CommentContextSource commentContextSourceGL = this.LL.GL();
        long j = this.LLILLJJLI;
        String str = this.LLILLL;
        if (str == null) {
            str = "";
        }
        C1350920lG6.LJJLIIIJLJLI(commentContextSourceGL, j, str, this.LLILZ, this.LLILZIL, 0L, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, 72);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CommentListFragmentV2@8fe4.sendCloseCommentEvent$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
