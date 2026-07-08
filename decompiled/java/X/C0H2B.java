package X;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.ui.fragment.PostModeCommentListFragmentV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0H2B, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ui.fragment.PostModeCommentListFragmentV2$onLayoutComplete$1$1", f = "PostModeCommentListFragmentV2.kt", l = {}, m = "invokeSuspend")
public final class C0H2B extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ PostModeCommentListFragmentV2 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0H2B(PostModeCommentListFragmentV2 postModeCommentListFragmentV2, InterfaceC1364105Vn<? super C0H2B> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = postModeCommentListFragmentV2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0H2B(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        LinearLayoutManager linearLayoutManager;
        AbstractC21673619ry adapter;
        C0SU0 c0su0;
        C1C7U.LIZ("PostModeCommentListFragmentV2@35e6.onLayoutComplete$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0SU0 c0su02 = this.LL.LLJILJIL;
        RecyclerView.LayoutManager layoutManager = null;
        if (c0su02 != null) {
            layoutManager = c0su02.getLayoutManager();
        }
        if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
            int iFindLastCompletelyVisibleItemPosition = linearLayoutManager.findLastCompletelyVisibleItemPosition();
            PostModeCommentListFragmentV2 postModeCommentListFragmentV2 = this.LL;
            C0SU0 c0su03 = postModeCommentListFragmentV2.LLJILJIL;
            if ((c0su03 != null && (adapter = c0su03.getAdapter()) != null && adapter.getItemCount() == 1 && (c0su0 = postModeCommentListFragmentV2.LLJILJIL) != null && c0su0.canScrollVertically(-1)) || iFindLastCompletelyVisibleItemPosition > 0) {
                postModeCommentListFragmentV2.kS(false);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PostModeCommentListFragmentV2@35e6.onLayoutComplete$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
