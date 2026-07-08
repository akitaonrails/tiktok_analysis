package X;

import Y.AfS156S0200000_21;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.now.interaction.api.InteractionApiService;
import com.ss.android.ugc.now.interaction.assem.CommentItem;
import com.ss.android.ugc.now.interaction.assem.CommentListVM;
import java.util.concurrent.ExecutionException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0lJ8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class C1352800lJ8 extends C2217421BqW implements Function1<CommentItem, Unit> {
    public C1352800lJ8(CommentListVM commentListVM) {
        super(1, commentListVM, CommentListVM.class, "deleteComment", "deleteComment(Lcom/ss/android/ugc/now/interaction/assem/CommentItem;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(CommentItem commentItem) {
        CommentItem commentItem2 = commentItem;
        CommentListVM commentListVM = (CommentListVM) this.receiver;
        commentListVM.getClass();
        try {
            InteractionApiService.LIZIZ.LIZ(commentItem2.getComment().getCid()).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS156S0200000_21(commentListVM, commentItem2, 23), new C09JN() { // from class: X.00PY
                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    C1C7U.LIZ("CommentListVM@76ac.deleteComment$data$2");
                    C1C7U.LIZIZ("CommentListVM@76ac.deleteComment$data$2");
                }
            });
            return Unit.LIZ;
        } catch (ExecutionException e) {
            TryCatchGuardChecker.doCheck(e);
            throw AbstractC2126608Uu.getCompatibleException(e);
        }
    }
}
