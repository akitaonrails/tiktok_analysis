package X;

import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: renamed from: X.08lU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.login.auth.ui.login.SOTLFragment$observeTokenState$1$1$1", f = "SOTLFragment.kt", l = {}, m = "invokeSuspend")
public final class C2211408lU extends C09AX implements InterfaceC1631620sYq<AbstractC845670XFl, Boolean, InterfaceC1364105Vn<? super Pair<? extends AbstractC845670XFl, ? extends Boolean>>, Object> {
    public /* synthetic */ AbstractC845670XFl LL;
    public /* synthetic */ boolean LLILLJJLI;

    public C2211408lU(InterfaceC1364105Vn<? super C2211408lU> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SOTLFragment@9567.observeTokenState$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Pair pair = new Pair(this.LL, Boolean.valueOf(this.LLILLJJLI));
        C1C7U.LIZIZ("SOTLFragment@9567.observeTokenState$1$1$1");
        return pair;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(AbstractC845670XFl abstractC845670XFl, Boolean bool, InterfaceC1364105Vn<? super Pair<? extends AbstractC845670XFl, ? extends Boolean>> interfaceC1364105Vn) {
        boolean zBooleanValue = bool.booleanValue();
        C2211408lU c2211408lU = new C2211408lU(interfaceC1364105Vn);
        c2211408lU.LL = abstractC845670XFl;
        c2211408lU.LLILLJJLI = zBooleanValue;
        return c2211408lU.invokeSuspend(Unit.LIZ);
    }
}
