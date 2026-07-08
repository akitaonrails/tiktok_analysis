package X;

import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.model.CommentContextSourceKt;
import com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.CommentPublishViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0l3E, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.CommentPublishViewModel$onCommentPublishSuccess$2$1", f = "CommentPublishViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1342940l3E extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ CommentPublishViewModel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1342940l3E(CommentPublishViewModel commentPublishViewModel, InterfaceC1364105Vn<? super C1342940l3E> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = commentPublishViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1342940l3E(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String aid;
        Aweme aweme;
        C1C7U.LIZ("CommentPublishViewModel@7f7.onCommentPublishSuccess$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        AssemViewModel assemViewModel = (AssemViewModel) this.LL.LLIZLLLIL.getValue();
        CommentContextSource commentContextSourceYQ2 = this.LL.yQ2();
        Aweme aweme2 = null;
        if (commentContextSourceYQ2 == null || (aweme = CommentContextSourceKt.aweme(commentContextSourceYQ2)) == null || (aid = aweme.getAid()) == null) {
            aid = "";
        }
        CommentContextSource commentContextSourceYQ22 = this.LL.yQ2();
        if (commentContextSourceYQ22 != null) {
            aweme2 = CommentContextSourceKt.aweme(commentContextSourceYQ22);
        }
        assemViewModel.setState(new C462480IBq(1L, aweme2, aid, CommentContextSourceKt.isSocialFeed(this.LL.yQ2())));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CommentPublishViewModel@7f7.onCommentPublishSuccess$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
