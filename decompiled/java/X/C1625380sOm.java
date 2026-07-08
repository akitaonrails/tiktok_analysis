package X;

import android.app.Activity;
import android.os.Bundle;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS569S0100000_25;

/* JADX INFO: renamed from: X.0sOm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1625380sOm implements InterfaceC1628180sTI, InterfaceC379610EuV {
    public final C1DRG LL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS569S0100000_25(this, 815));

    @Override // X.InterfaceC1628180sTI
    public final void LIZIZ() {
    }

    @Override // X.InterfaceC1628180sTI
    public final boolean isLogin() {
        return C0CHQ.LIZ().getAccountService().isLogin();
    }

    @Override // X.InterfaceC1628180sTI
    public final void LIZJ() {
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LL;
    }

    public C1625380sOm(C1DRG c1drg) {
        this.LL = c1drg;
    }

    @Override // X.InterfaceC1628180sTI
    public final void LIZ(Activity activity, String str, int i, Bundle bundle, final Function0<Unit> function0) {
        String str2;
        if (i != 241) {
            if (i == 242) {
                str2 = "click_favorite_prop";
            } else {
                "not support favorite login method".toString();
                throw new IllegalStateException("not support favorite login method");
            }
        } else {
            str2 = "click_my_prop";
        }
        C0CHQ.LIZ().getAccountService().LJIIIIZZ(activity, str, str2, bundle, new InterfaceC19305710fv() { // from class: X.0sOn
            @Override // X.InterfaceC19305710fv
            public final void onCancel() {
            }

            @Override // X.InterfaceC19305710fv
            public final void onSuccess() {
                function0.invoke();
            }
        });
    }
}
