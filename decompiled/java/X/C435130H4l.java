package X;

import com.ss.android.ugc.aweme.ui.fragment.PostModeCommentListFragmentV2;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0H4l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ui.fragment.PostModeCommentListFragmentV2$onCommentAreaClicked$1$1", f = "PostModeCommentListFragmentV2.kt", l = {}, m = "invokeSuspend")
public final class C435130H4l extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ PostModeCommentListFragmentV2 LL;
    public final /* synthetic */ C1127210fRH LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C435130H4l(PostModeCommentListFragmentV2 postModeCommentListFragmentV2, C1127210fRH c1127210fRH, InterfaceC1364105Vn<? super C435130H4l> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = postModeCommentListFragmentV2;
        this.LLILLJJLI = c1127210fRH;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C435130H4l(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PostModeCommentListFragmentV2@35e6.onCommentAreaClicked$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        WrapLinearLayoutManager wrapLinearLayoutManager = this.LL.LLJJI;
        if (wrapLinearLayoutManager != null) {
            wrapLinearLayoutManager.startSmoothScroll(this.LLILLJJLI);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PostModeCommentListFragmentV2@35e6.onCommentAreaClicked$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
