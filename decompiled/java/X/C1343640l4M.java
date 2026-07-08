package X;

import Y.ACallableS426S0100000_21;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.perfmonitor.CommentPerfMonitorUtil;
import com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.CommentDeleteVM;
import com.ss.android.ugc.aweme.commentv2.commentpage.commonvideo.ICommentPageAbility;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0l4M, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.CommentDeleteVM$deleteComment$1$3$1", f = "CommentDeleteVM.kt", l = {}, m = "invokeSuspend")
public final class C1343640l4M extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ CommentDeleteVM LL;
    public final /* synthetic */ Throwable LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1343640l4M(CommentDeleteVM commentDeleteVM, Throwable th, InterfaceC1364105Vn<? super C1343640l4M> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = commentDeleteVM;
        this.LLILLJJLI = th;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1343640l4M(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C23112093u c23112093u;
        Fragment fragment;
        ICommentPageAbility iCommentPageAbility;
        C1C7U.LIZ("CommentDeleteVM@9d4.deleteComment$1$3$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        CommentPerfMonitorUtil.LIZ.getClass();
        C1345400l7C c1345400l7C = CommentPerfMonitorUtil.LIZLLL;
        c1345400l7C.LJ = System.currentTimeMillis();
        C15O7.LIZJ(new ACallableS426S0100000_21(c1345400l7C, 10));
        CommentDeleteVM commentDeleteVM = this.LL;
        Throwable th = this.LLILLJJLI;
        commentDeleteVM.getClass();
        if ((th instanceof C0XIR) && (c23112093u = (C23112093u) th) != null) {
            int errorCode = c23112093u.getErrorCode();
            if (errorCode != 3056) {
                if (errorCode == 3002042) {
                    C844470XAv.LIZ.getClass();
                    C1354920lMY.LIZLLL(C844470XAv.LIZ(), th, 2131829237);
                    CommentContextSource commentContextSourceWQ2 = commentDeleteVM.wQ2();
                    if (commentContextSourceWQ2 != null) {
                        commentContextSourceWQ2.innerRefreshCommentStatus(true);
                    }
                    InterfaceC665370Q7z interfaceC665370Q7z = commentDeleteVM.LL;
                    if (interfaceC665370Q7z != null && (iCommentPageAbility = (ICommentPageAbility) C1558520qew.LIZ(interfaceC665370Q7z, ICommentPageAbility.class, null)) != null) {
                        iCommentPageAbility.LP0();
                    }
                }
            } else {
                WeakReference<Fragment> weakReference = commentDeleteVM.LLILLJJLI;
                if (weakReference != null && (fragment = weakReference.get()) != null) {
                    C1389890mGx c1389890mGx = new C1389890mGx(fragment);
                    c1389890mGx.LJIIIZ(2131829141);
                    c1389890mGx.LJIIJJI();
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CommentDeleteVM@9d4.deleteComment$1$3$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
