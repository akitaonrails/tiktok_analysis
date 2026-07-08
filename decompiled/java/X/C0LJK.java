package X;

import com.ss.android.ugc.aweme.comment.image.CommentImageEditRootScene;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LJK, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.comment.image.CommentImageEditRootScene$finishBefore$1", f = "CommentImageEditRootScene.kt", l = {}, m = "invokeSuspend")
public final class C0LJK extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ CommentImageEditRootScene LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LJK(CommentImageEditRootScene commentImageEditRootScene, InterfaceC1364105Vn<? super C0LJK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = commentImageEditRootScene;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0LJK(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CommentImageEditRootScene@9de3.finishBefore$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1450600nqs c1450600nqs = this.LL.LLJLLIL;
        if (c1450600nqs != null) {
            C08QA.LJIIZILJ(new C0VSJ(C0CHQ.LIZ().LJJIIJZLJL().getPathService().LIZIZ(c1450600nqs.videoPublishEditModel.getCreativeInfo())));
            C08QA.LJIIZILJ(new C0VSJ(C0CHQ.LIZ().LJJIIJZLJL().getPathService().LIZLLL(c1450600nqs.videoPublishEditModel.getCreativeInfo())));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CommentImageEditRootScene@9de3.finishBefore$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
