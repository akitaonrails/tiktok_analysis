package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.057f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.comment.easteregg.util.CommentSurpriseCacheManager$fetchCommentSurprisePreloadData$1$3$1", f = "CommentSurpriseCacheManager.kt", l = {}, m = "invokeSuspend")
public final class C13009057f extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Throwable LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13009057f(Throwable th, InterfaceC1364105Vn<? super C13009057f> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = th;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C13009057f(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CommentSurpriseCacheManager@bb43.fetchCommentSurprisePreloadData$1$3$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CommentSurpriseCacheManager@bb43.fetchCommentSurprisePreloadData$1$3$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
