package X;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0OAC, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.comment.vm.BulletinCommentActionViewModel$updateCommentDigg$2$1", f = "BulletinCommentActionViewModel.kt", l = {}, m = "invokeSuspend")
public final class C0OAC extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ Context LLILLJJLI;
    public final /* synthetic */ AbstractC1623806Xk<Unit> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0OAC(int i, Context context, AbstractC1623806Xk<Unit> abstractC1623806Xk, InterfaceC1364105Vn<? super C0OAC> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = i;
        this.LLILLJJLI = context;
        this.LLILLL = abstractC1623806Xk;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0OAC(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int i;
        C1C7U.LIZ("BulletinCommentActionViewModel@c42c.updateCommentDigg$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL == 1) {
            i = 2131827932;
        } else {
            i = 2131827933;
        }
        Boolean boolValueOf = Boolean.valueOf(C1354920lMY.LIZLLL(this.LLILLJJLI, ((C491001vg) this.LLILLL).LIZ, i));
        C1C7U.LIZIZ("BulletinCommentActionViewModel@c42c.updateCommentDigg$2$1");
        return boolValueOf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
