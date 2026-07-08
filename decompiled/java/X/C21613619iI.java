package X;

import androidx.fragment.app.Fragment;
import java.util.Arrays;

/* JADX INFO: renamed from: X.19iI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21613619iI implements InterfaceC739440SzW {
    public final InterfaceC21613719iJ LIZ;
    public final InterfaceC21613919iL LIZIZ;
    public int LIZJ;

    @Override // X.InterfaceC739440SzW
    public final void block() {
        this.LIZIZ.block();
    }

    @Override // X.InterfaceC739440SzW
    public final Fragment getFragment() {
        return this.LIZ.wb();
    }

    @Override // X.InterfaceC739440SzW
    public final void reset() {
        this.LIZIZ.reset();
    }

    @Override // X.InterfaceC739440SzW
    public final void resume() {
        if (this.LIZIZ.LIZ()) {
            this.LIZIZ.resume();
        }
    }

    @Override // X.InterfaceC739440SzW
    public final void LIZ(Object... objArr) {
        if (this.LIZIZ.LIZ()) {
            InterfaceC21613719iJ interfaceC21613719iJ = this.LIZ;
            Arrays.copyOf(objArr, objArr.length);
            interfaceC21613719iJ.tA();
            return;
        }
        this.LIZ.wq(Arrays.copyOf(objArr, objArr.length));
    }

    public C21613619iI(InterfaceC21613719iJ interfaceC21613719iJ, C21614019iM c21614019iM) {
        this.LIZ = interfaceC21613719iJ;
        this.LIZIZ = c21614019iM;
    }
}
