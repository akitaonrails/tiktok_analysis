package X;

import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0sgW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1636380sgW implements InterfaceC1637250shv, InterfaceC379610EuV {
    public final C1DRG LL;
    public final Function0<Boolean> LLILLJJLI;

    @Override // X.InterfaceC1637250shv
    public final C1641930spT create() {
        C1DRG c1drg = this.LL;
        return new C1641930spT(c1drg, new C1631230sYD(c1drg), new C1636370sgV((LifecycleOwner) c1drg.LJII(LifecycleOwner.class, null)), new C1637330si3(this.LL, this.LLILLJJLI), new C1636420sga() { // from class: X.0sgY
        });
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LL;
    }

    public C1636380sgW(C1DRG c1drg, Function0<Boolean> function0) {
        this.LL = c1drg;
        this.LLILLJJLI = function0;
    }
}
