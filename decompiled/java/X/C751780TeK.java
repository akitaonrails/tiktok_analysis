package X;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.lemon.postmode.ui.fragment.Lemon8PostCommentListFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0TeK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.ss.android.ugc.aweme.lemon.postmode.ui.fragment.Lemon8PostCommentListFragment$onLayoutComplete$1$1", f = "Lemon8PostCommentListFragment.kt", l = {}, m = "invokeSuspend")
public final class C751780TeK extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Lemon8PostCommentListFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C751780TeK(Lemon8PostCommentListFragment lemon8PostCommentListFragment, InterfaceC1364105Vn<? super C751780TeK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = lemon8PostCommentListFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C751780TeK(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        LinearLayoutManager linearLayoutManager;
        AbstractC21673619ry adapter;
        C1355930lOB c1355930lOB;
        C1C7U.LIZ("Lemon8PostCommentListFragment@54ef.onLayoutComplete$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1355930lOB c1355930lOB2 = this.LL.LLIZ;
        RecyclerView.LayoutManager layoutManager = null;
        if (c1355930lOB2 != null) {
            layoutManager = c1355930lOB2.getLayoutManager();
        }
        if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
            int iFindLastCompletelyVisibleItemPosition = linearLayoutManager.findLastCompletelyVisibleItemPosition();
            Lemon8PostCommentListFragment lemon8PostCommentListFragment = this.LL;
            C1355930lOB c1355930lOB3 = lemon8PostCommentListFragment.LLIZ;
            if ((c1355930lOB3 != null && (adapter = c1355930lOB3.getAdapter()) != null && adapter.getItemCount() == 1 && (c1355930lOB = lemon8PostCommentListFragment.LLIZ) != null && c1355930lOB.canScrollVertically(-1)) || iFindLastCompletelyVisibleItemPosition > 0) {
                lemon8PostCommentListFragment.OR();
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("Lemon8PostCommentListFragment@54ef.onLayoutComplete$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
