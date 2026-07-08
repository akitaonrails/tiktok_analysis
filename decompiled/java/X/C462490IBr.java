package X;

import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.model.CommentContextSourceKt;
import com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.CommentDeleteVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0IBr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.CommentDeleteVM$innerBatchDeleteComment$1$2$5", f = "CommentDeleteVM.kt", l = {}, m = "invokeSuspend")
public final class C462490IBr extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ CommentDeleteVM LL;
    public final /* synthetic */ CommentContextSource LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ C118300cf LLILZ;
    public final /* synthetic */ CommentContextSource LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C462490IBr(CommentDeleteVM commentDeleteVM, CommentContextSource commentContextSource, boolean z, C118300cf c118300cf, CommentContextSource commentContextSource2, InterfaceC1364105Vn<? super C462490IBr> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = commentDeleteVM;
        this.LLILLJJLI = commentContextSource;
        this.LLILLL = z;
        this.LLILZ = c118300cf;
        this.LLILZIL = commentContextSource2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C462490IBr(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String aid;
        long j;
        Aweme aweme;
        C1C7U.LIZ("CommentDeleteVM@9d4.innerBatchDeleteComment$1$2$5");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL.getLifecycleRef().get() == null) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("CommentDeleteVM@9d4.innerBatchDeleteComment$1$2$5");
            return unit;
        }
        AssemViewModel value = this.LL.LLILZ.getValue();
        CommentContextSource commentContextSource = this.LLILLJJLI;
        Aweme aweme2 = null;
        if (commentContextSource != null && (aweme = CommentContextSourceKt.aweme(commentContextSource)) != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        CommentContextSource commentContextSource2 = this.LLILLJJLI;
        if (commentContextSource2 != null) {
            aweme2 = CommentContextSourceKt.aweme(commentContextSource2);
        }
        if (this.LLILLL) {
            j = -this.LLILZ.element;
        } else {
            j = 0;
        }
        value.setState(new C462480IBq(j, aweme2, aid, CommentContextSourceKt.isSocialFeed(this.LLILZIL)));
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("CommentDeleteVM@9d4.innerBatchDeleteComment$1$2$5");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
