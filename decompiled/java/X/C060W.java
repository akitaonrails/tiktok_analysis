package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.060W, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.org.permissions.SentInvitePageKt$SentInvitePage$3$1", f = "SentInvitePage.kt", l = {}, m = "invokeSuspend")
public final class C060W extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ DialogC1389620mGW LL;
    public final /* synthetic */ C05P1<Boolean> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C060W(DialogC1389620mGW dialogC1389620mGW, C05P1<Boolean> c05p1, InterfaceC1364105Vn<? super C060W> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = dialogC1389620mGW;
        this.LLILLJJLI = c05p1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C060W(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SentInvitePageKt@ed91.SentInvitePage$3$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LLILLJJLI.getValue().booleanValue()) {
            C786410Ut5.J4(this.LL);
        } else {
            C0FNV.LIZ(this.LL);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SentInvitePageKt@ed91.SentInvitePage$3$1");
        return unit;
    }
}
