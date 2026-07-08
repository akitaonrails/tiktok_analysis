package X;

import com.ss.android.ugc.aweme.tako.ui.TakoChatActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CoV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.ui.TakoChatActivity$attachChatFragmentWithLoading$5$4$5$1", f = "TakoChatActivity.kt", l = {}, m = "invokeSuspend")
public final class C324930CoV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ TakoChatActivity LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ C013C LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C324930CoV(TakoChatActivity takoChatActivity, long j, C013C c013c, InterfaceC1364105Vn<? super C324930CoV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = takoChatActivity;
        this.LLILLJJLI = j;
        this.LLILLL = c013c;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C324930CoV(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoChatActivity@1b1a.attachChatFragmentWithLoading$5$4$5$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (!this.LL.isFinishing() && !this.LL.isDestroyed()) {
            this.LL.LLLLLZL(this.LLILLJJLI, this.LLILLL.element);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("TakoChatActivity@1b1a.attachChatFragmentWithLoading$5$4$5$1");
            return unit;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("TakoChatActivity@1b1a.attachChatFragmentWithLoading$5$4$5$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
