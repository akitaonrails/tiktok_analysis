package X;

import android.graphics.drawable.Animatable;

/* JADX INFO: renamed from: X.0sg3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1636090sg3 extends C1320700kTM<InterfaceC1330440kj4> {
    public final /* synthetic */ InterfaceC1624480sNK LIZIZ;
    public final /* synthetic */ InterfaceC1636100sg4 LIZJ;

    public C1636090sg3(InterfaceC1624480sNK interfaceC1624480sNK, C1636080sg2 c1636080sg2) {
        this.LIZIZ = interfaceC1624480sNK;
        this.LIZJ = c1636080sg2;
    }

    @Override // X.C1320700kTM, X.InterfaceC1320650kTH
    public final void LJ(String str, Object obj, Animatable animatable) {
        InterfaceC1624480sNK interfaceC1624480sNK = this.LIZIZ;
        if (interfaceC1624480sNK != null) {
            interfaceC1624480sNK.LJJLIIIJJI(interfaceC1624480sNK.LJIILJJIL() - 1);
            if (this.LIZIZ.LJIILJJIL() <= 0) {
                InterfaceC1636100sg4 interfaceC1636100sg4 = this.LIZJ;
                if (interfaceC1636100sg4 != null) {
                    C1636070sg1.LIZ(this.LIZIZ.LJJIJIL());
                    interfaceC1636100sg4.onSuccess();
                }
                InterfaceC1624480sNK interfaceC1624480sNK2 = this.LIZIZ;
                C1636070sg1.LIZJ.clear();
                C1636070sg1.LIZLLL.LJ(0);
                if (interfaceC1624480sNK2.LJIILJJIL() <= 0) {
                    interfaceC1624480sNK2.LJJLIIIJJI(C1636070sg1.LIZIZ);
                }
            }
        }
    }
}
