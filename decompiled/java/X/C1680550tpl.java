package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0tpl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1680550tpl implements InterfaceC20035313aJ {
    public final Function1<C1680570tpn, InterfaceC1680560tpm> LL;
    public InterfaceC1680560tpm LLILLJJLI;

    @Override // X.InterfaceC20035313aJ
    public final void LJ() {
    }

    @Override // X.InterfaceC20035313aJ
    public final void LIZLLL() {
        InterfaceC1680560tpm interfaceC1680560tpm = this.LLILLJJLI;
        if (interfaceC1680560tpm != null) {
            interfaceC1680560tpm.dispose();
        }
        this.LLILLJJLI = null;
    }

    @Override // X.InterfaceC20035313aJ
    public final void LJFF() {
        this.LLILLJJLI = this.LL.invoke(C1680540tpk.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1680550tpl(Function1<? super C1680570tpn, ? extends InterfaceC1680560tpm> function1) {
        this.LL = function1;
    }
}
