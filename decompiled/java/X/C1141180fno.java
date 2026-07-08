package X;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0fno, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1141180fno implements InterfaceC1137750fiH {
    public static final /* synthetic */ int LLILLJJLI = 0;
    public final WeakReference<InterfaceC1137750fiH> LL;

    public C1141180fno(C1141130fnj c1141130fnj) {
        this.LL = new WeakReference<>(c1141130fnj);
    }

    @Override // X.InterfaceC1137750fiH
    public final void LJJIJIIJI(String str) {
        InterfaceC1137750fiH interfaceC1137750fiH = this.LL.get();
        if (interfaceC1137750fiH != null) {
            interfaceC1137750fiH.LJJIJIIJI(str);
        }
    }

    @Override // X.InterfaceC1137750fiH
    public final void onMessageReceived(int i, int i2, int i3, String str) {
        InterfaceC1137750fiH interfaceC1137750fiH = this.LL.get();
        if (interfaceC1137750fiH != null) {
            interfaceC1137750fiH.onMessageReceived(i, i2, i3, str);
        }
    }
}
