package X;

import android.os.RemoteException;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.1B5s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2199301B5s implements InterfaceC2199321B5u {
    public final /* synthetic */ InterfaceC2199311B5t LIZ;

    public C2199301B5s(InterfaceC2199311B5t interfaceC2199311B5t) {
        this.LIZ = interfaceC2199311B5t;
    }

    public final boolean LIZ(InterfaceC2199261B5o interfaceC2199261B5o) {
        BinderC2199231B5l binderC2199231B5l;
        try {
            InterfaceC2199311B5t interfaceC2199311B5t = this.LIZ;
            if (interfaceC2199261B5o == null) {
                binderC2199231B5l = null;
            } else {
                binderC2199231B5l = new BinderC2199231B5l(interfaceC2199261B5o);
            }
            return interfaceC2199311B5t.H(binderC2199231B5l);
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }
}
