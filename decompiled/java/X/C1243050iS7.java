package X;

import com.ss.android.ugc.aweme.account.org.permissions.SentInvitePageViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0iS7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.org.permissions.SentInvitePageKt$SentInvitePage$2$1", f = "SentInvitePage.kt", l = {}, m = "invokeSuspend")
public final class C1243050iS7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C05P1<AbstractC1243060iS8> LL;
    public final /* synthetic */ Function0<Unit> LLILLJJLI;
    public final /* synthetic */ SentInvitePageViewModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1243050iS7(C05P1<? extends AbstractC1243060iS8> c05p1, Function0<Unit> function0, SentInvitePageViewModel sentInvitePageViewModel, InterfaceC1364105Vn<? super C1243050iS7> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c05p1;
        this.LLILLJJLI = function0;
        this.LLILLL = sentInvitePageViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1243050iS7(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SentInvitePageKt@ed91.SentInvitePage$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        AbstractC1243060iS8 value = this.LL.getValue();
        if ((value instanceof C1243080iSA) && value != null) {
            Function0<Unit> function0 = this.LLILLJJLI;
            SentInvitePageViewModel sentInvitePageViewModel = this.LLILLL;
            function0.invoke();
            sentInvitePageViewModel.LL.setValue(C1243070iS9.LIZ);
            sentInvitePageViewModel.LLILZLL.setValue(null);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SentInvitePageKt@ed91.SentInvitePage$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
