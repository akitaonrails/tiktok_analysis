package X;

/* JADX INFO: renamed from: X.0wOr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public abstract class AbstractC1779190wOr extends C1779230wOv {
    public AbstractC1779190wOr() {
    }

    public AbstractC1779190wOr(InterfaceC1779210wOt... interfaceC1779210wOtArr) {
        if (interfaceC1779210wOtArr != null && interfaceC1779210wOtArr.length != 0) {
            AbstractC1779220wOu abstractC1779220wOu = new AbstractC1779220wOu() { // from class: X.0wOs
                @Override // X.AbstractC1779220wOu
                public final void LIZJ(int i, InterfaceC1779210wOt interfaceC1779210wOt) {
                    this.LL.notifyChange();
                }
            };
            for (InterfaceC1779210wOt interfaceC1779210wOt : interfaceC1779210wOtArr) {
                interfaceC1779210wOt.addOnPropertyChangedCallback(abstractC1779220wOu);
            }
        }
    }
}
