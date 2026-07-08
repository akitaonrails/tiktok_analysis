package X;

import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import com.google.android.gms.cloudmessaging.zzd;

/* JADX INFO: renamed from: X.0Vu5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C812510Vu5 {
    public final Messenger LIZ;
    public final zzd LIZIZ;

    public C812510Vu5(IBinder iBinder) throws RemoteException {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if ("android.os.IMessenger".equals(interfaceDescriptor)) {
            this.LIZ = new Messenger(iBinder);
            this.LIZIZ = null;
        } else if ("com.google.android.gms.iid.IMessengerCompat".equals(interfaceDescriptor)) {
            this.LIZIZ = new zzd(iBinder);
            this.LIZ = null;
        } else {
            String strValueOf = String.valueOf(interfaceDescriptor);
            if (strValueOf.length() != 0) {
                "Invalid interface descriptor: ".concat(strValueOf);
            }
            throw new RemoteException();
        }
    }
}
