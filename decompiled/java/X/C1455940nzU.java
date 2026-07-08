package X;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS566S0100000_22;

/* JADX INFO: renamed from: X.0nzU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1455940nzU implements InterfaceC1456650o0d, Function0<C1DRG> {
    public final Function0<C1DRG> LL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS566S0100000_22(this, 829));

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

    public C1455940nzU(AwS566S0100000_22 awS566S0100000_22) {
        this.LL = awS566S0100000_22;
    }

    @Override // X.InterfaceC1456650o0d
    public final void LIZ(int i, int i2) {
        InterfaceC1455860nzM interfaceC1455860nzM = (InterfaceC1455860nzM) this.LLILLJJLI.getValue();
        if (interfaceC1455860nzM != null) {
            interfaceC1455860nzM.nC1(i);
            interfaceC1455860nzM.hi0(i2);
        }
    }
}
