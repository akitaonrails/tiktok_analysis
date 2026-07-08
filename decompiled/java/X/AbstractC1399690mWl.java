package X;

/* JADX INFO: renamed from: X.0mWl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public abstract class AbstractC1399690mWl implements InterfaceC1399350mWD {
    public final InterfaceC655270Pn3 LL;

    @Override // X.InterfaceC1399350mWD
    public final /* synthetic */ boolean Fi() {
        return false;
    }

    public AbstractC1399690mWl(InterfaceC655270Pn3 interfaceC655270Pn3) {
        this.LL = interfaceC655270Pn3;
    }

    public final void LIZ(boolean z) {
        if (z) {
            this.LL.registerActivityOnKeyDownListener(this);
        } else {
            this.LL.unRegisterActivityOnKeyDownListener(this);
        }
    }
}
