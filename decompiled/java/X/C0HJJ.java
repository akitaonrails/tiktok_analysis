package X;

import com.ss.android.ugc.aweme.im.b2c.replies.ui.IMQuickReplyManageFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HJJ, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.b2c.replies.ui.IMQuickReplyManageFragment$showLoading$1$1", f = "IMQuickReplyManageFragment.kt", l = {552}, m = "invokeSuspend")
public final class C0HJJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ IMQuickReplyManageFragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HJJ(IMQuickReplyManageFragment iMQuickReplyManageFragment, InterfaceC1364105Vn<? super C0HJJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = iMQuickReplyManageFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0HJJ(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMQuickReplyManageFragment@b31d.showLoading$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(1500L, this) == objLJFF) {
                C1C7U.LIZIZ("IMQuickReplyManageFragment@b31d.showLoading$1$1");
                return objLJFF;
            }
        }
        C1390410mHn c1390410mHn = this.LLILLJJLI.LLJILLL;
        if (c1390410mHn != null) {
            C786410Ut5.LLLZZIL(c1390410mHn, 0);
        }
        C1390410mHn c1390410mHn2 = this.LLILLJJLI.LLJILLL;
        if (c1390410mHn2 != null) {
            c1390410mHn2.LIZJ();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IMQuickReplyManageFragment@b31d.showLoading$1$1");
        return unit;
    }
}
