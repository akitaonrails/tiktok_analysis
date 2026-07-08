package X;

import com.ss.android.ugc.aweme.comment.longpresspanel.ui.CommentLongPressFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08pG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.comment.longpresspanel.ui.CommentLongPressFragment$awaitCommentShareInfo$2$2$1", f = "CommentLongPressFragment.kt", l = {}, m = "invokeSuspend")
public final class C2234808pG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ CommentLongPressFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2234808pG(CommentLongPressFragment commentLongPressFragment, InterfaceC1364105Vn<? super C2234808pG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = commentLongPressFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2234808pG(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CommentLongPressFragment@922.awaitCommentShareInfo$2$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1389890mGx c1389890mGx = new C1389890mGx(this.LL);
        c1389890mGx.LJIIIZ(2131829222);
        c1389890mGx.LJIIJJI();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CommentLongPressFragment@922.awaitCommentShareInfo$2$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
