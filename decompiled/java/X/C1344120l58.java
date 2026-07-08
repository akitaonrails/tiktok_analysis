package X;

import com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.CommentPublishViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0l58, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.CommentPublishViewModel$publishComment$2$3$1", f = "CommentPublishViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1344120l58 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ CommentPublishViewModel LL;
    public final /* synthetic */ C1345120l6k LLILLJJLI;
    public final /* synthetic */ Throwable LLILLL;
    public final /* synthetic */ C0O8X LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1344120l58(CommentPublishViewModel commentPublishViewModel, C1345120l6k c1345120l6k, Throwable th, C0O8X c0o8x, InterfaceC1364105Vn<? super C1344120l58> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = commentPublishViewModel;
        this.LLILLJJLI = c1345120l6k;
        this.LLILLL = th;
        this.LLILZ = c0o8x;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1344120l58(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C23112093u c23112093u;
        int errorCode;
        C1C7U.LIZ("CommentPublishViewModel@7f7.publishComment$2$3$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        CommentPublishViewModel commentPublishViewModel = this.LL;
        C1345120l6k c1345120l6k = this.LLILLJJLI;
        Throwable th = this.LLILLL;
        if (th instanceof C23112093u) {
            c23112093u = (C23112093u) th;
        } else {
            c23112093u = null;
        }
        if (c23112093u != null) {
            errorCode = c23112093u.getErrorCode();
        } else {
            errorCode = 0;
        }
        commentPublishViewModel.GQ2(c1345120l6k, false, false, errorCode);
        CommentPublishViewModel commentPublishViewModel2 = this.LL;
        C0O8X c0o8x = this.LLILZ;
        Throwable th2 = this.LLILLL;
        commentPublishViewModel2.getClass();
        CommentPublishViewModel.LQ2(c0o8x, th2);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CommentPublishViewModel@7f7.publishComment$2$3$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
