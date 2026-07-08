package X;

import kotlin.jvm.internal.AwS604S0100000_25;

/* JADX INFO: renamed from: X.0uA8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public abstract class AbstractC1693180uA8 implements InterfaceC1692040u8I {
    public InterfaceC1694690uCZ LIZ;

    @Override // X.InterfaceC1692040u8I
    public /* synthetic */ void LIZJ() {
    }

    @Override // X.InterfaceC1692040u8I
    public /* synthetic */ void LJ(C1686970u07 c1686970u07, InterfaceC1692600u9C interfaceC1692600u9C, C1692150u8T c1692150u8T, AwS604S0100000_25 awS604S0100000_25, C1683130ttv c1683130ttv, C1683130ttv c1683130ttv2) {
    }

    @Override // X.InterfaceC1692040u8I
    public /* synthetic */ void LJI(C1683130ttv c1683130ttv) {
    }

    public abstract void LJIIIIZZ();

    @Override // X.InterfaceC1692040u8I
    public final void LJFF() {
        InterfaceC1679450tnz softwareKeyboardController;
        InterfaceC1694690uCZ interfaceC1694690uCZ = this.LIZ;
        if (interfaceC1694690uCZ == null || (softwareKeyboardController = interfaceC1694690uCZ.getSoftwareKeyboardController()) == null) {
            return;
        }
        softwareKeyboardController.hide();
    }

    @Override // X.InterfaceC1692040u8I
    public final void LJII() {
        InterfaceC1679450tnz softwareKeyboardController;
        InterfaceC1694690uCZ interfaceC1694690uCZ = this.LIZ;
        if (interfaceC1694690uCZ == null || (softwareKeyboardController = interfaceC1694690uCZ.getSoftwareKeyboardController()) == null) {
            return;
        }
        softwareKeyboardController.show();
    }

    public final void LJIIIZ(InterfaceC1694690uCZ interfaceC1694690uCZ) {
        if (this.LIZ != interfaceC1694690uCZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Expected textInputModifierNode to be ");
            sbLIZ.append(interfaceC1694690uCZ);
            sbLIZ.append(" but was ");
            sbLIZ.append(this.LIZ);
            C1691080u6k.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
        }
        this.LIZ = null;
    }
}
