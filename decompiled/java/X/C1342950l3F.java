package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.commentv2.commentlist.powercell.StatusFooterCell;
import com.ss.android.ugc.aweme.service.proactive.IActiveLoginCommentService;
import java.lang.ref.WeakReference;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0l3F, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commentv2.commentlist.powercell.StatusFooterCell$attachSignupButton$1$1", f = "StatusFooterCell.kt", l = {}, m = "invokeSuspend")
public final class C1342950l3F extends C09AX implements InterfaceC1631620sYq<InterfaceC497601wk, View, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ StatusFooterCell LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1342950l3F(StatusFooterCell statusFooterCell, InterfaceC1364105Vn<? super C1342950l3F> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LL = statusFooterCell;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C19EG c19egLIZIZ;
        C1C7U.LIZ("StatusFooterCell@61b0.attachSignupButton$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1342970l3H c1342970l3H = C1342970l3H.LIZ;
        Context context = this.LL.getContext();
        if (context != null) {
            c19egLIZIZ = C1388190mED.LIZIZ(context);
        } else {
            c19egLIZIZ = null;
        }
        WeakReference weakReference = new WeakReference(c19egLIZIZ);
        this.LL.getContext();
        C1342970l3H.LIZLLL = this.LL;
        IActiveLoginCommentService iActiveLoginCommentService = C1342970l3H.LIZIZ;
        iActiveLoginCommentService.LJ(c1342970l3H);
        iActiveLoginCommentService.LIZIZ(weakReference, C1342970l3H.LJ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StatusFooterCell@61b0.attachSignupButton$1$1");
        return unit;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, View view, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C1342950l3F(this.LL, interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
