package X;

import android.os.RemoteException;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;

/* JADX INFO: renamed from: X.1B5r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class BinderC2199291B5r extends AbstractBinderC2199271B5p {
    public final /* synthetic */ InterfaceC2199321B5u LLILLJJLI;

    public BinderC2199291B5r(InterfaceC2199321B5u interfaceC2199321B5u) {
        this.LLILLJJLI = interfaceC2199321B5u;
    }

    @Override // X.InterfaceC2199311B5t
    public final boolean H(final InterfaceC2199241B5m interfaceC2199241B5m) {
        InterfaceC2199261B5o interfaceC2199261B5o;
        InterfaceC2199321B5u interfaceC2199321B5u = this.LLILLJJLI;
        if (interfaceC2199241B5m == null) {
            interfaceC2199261B5o = null;
        } else {
            interfaceC2199261B5o = new InterfaceC2199261B5o() { // from class: X.1B5n
                @Override // X.InterfaceC2199261B5o
                public final boolean LJLIIIL() {
                    try {
                        return interfaceC2199241B5m.LJLIIIL();
                    } catch (RemoteException e) {
                        TryCatchGuardChecker.doCheck(e);
                        return false;
                    }
                }

                @Override // X.InterfaceC2199261B5o
                public final void LJJIZ(List<String> list) {
                    try {
                        interfaceC2199241B5m.LJJIZ(list);
                    } catch (RemoteException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            };
        }
        return ((C2199301B5s) interfaceC2199321B5u).LIZ(interfaceC2199261B5o);
    }
}
