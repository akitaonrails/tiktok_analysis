package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0nzc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1456020nzc implements InterfaceC1456650o0d, Function0<C1DRG> {
    public final Function0<C1DRG> LL;

    @Override // X.InterfaceC1456650o0d
    public final void S3(boolean z) {
    }

    @Override // X.InterfaceC1456650o0d
    public final void p2(boolean z) {
    }

    @Override // kotlin.jvm.functions.Function0
    public final C1DRG invoke() {
        return this.LL.invoke();
    }

    public C1456020nzc(Function0<C1DRG> function0) {
        this.LL = function0;
    }

    @Override // X.InterfaceC1456650o0d
    public final void LIZ(int i, int i2) {
        C1DRG c1drgInvoke = this.LL.invoke();
        if (c1drgInvoke != null) {
            C579830Mof.LIZIZ(c1drgInvoke, InterfaceC1457600o2A.class, new C1456030nzd(i, this, i2));
        }
    }
}
