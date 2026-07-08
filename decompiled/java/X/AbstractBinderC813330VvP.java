package X;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: X.0VvP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public abstract class AbstractBinderC813330VvP extends Binder implements InterfaceC813350VvR {
    public AbstractBinderC813330VvP() {
        attachInterface(this, "com.heytap.mcs.liquid.service.download.result.IPackageAuthCallback");
    }

    public static InterfaceC813350VvR asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.heytap.mcs.liquid.service.download.result.IPackageAuthCallback");
        return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC813350VvR)) ? new C813340VvQ(iBinder) : (InterfaceC813350VvR) iInterfaceQueryLocalInterface;
    }

    public static InterfaceC813350VvR getDefaultImpl() {
        return C813340VvQ.LLILLJJLI;
    }

    public static boolean setDefaultImpl(InterfaceC813350VvR interfaceC813350VvR) {
        if (C813340VvQ.LLILLJJLI != null || interfaceC813350VvR == null) {
            return false;
        }
        C813340VvQ.LLILLJJLI = interfaceC813350VvR;
        return true;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel2.writeString("com.heytap.mcs.liquid.service.download.result.IPackageAuthCallback");
            return true;
        }
        parcel.enforceInterface("com.heytap.mcs.liquid.service.download.result.IPackageAuthCallback");
        onAuthResult(parcel.readInt());
        parcel2.writeNoException();
        return true;
    }
}
