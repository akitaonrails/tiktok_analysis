package X;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: X.09l5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractBinderC2463709l5 extends Binder implements IInterface {
    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    public AbstractBinderC2463709l5() {
        attachInterface(this, "android.support.customtabs.IPostMessageService");
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        Bundle bundle = null;
        if (i != 2) {
            if (i != 3) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString("android.support.customtabs.IPostMessageService");
                return true;
            }
            parcel.enforceInterface("android.support.customtabs.IPostMessageService");
            InterfaceC2463809l6 interfaceC2463809l6LJJJZ = C0W55.LJJJZ(parcel.readStrongBinder());
            String string = parcel.readString();
            if (parcel.readInt() != 0) {
                bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
            }
            interfaceC2463809l6LJJJZ.LLLFZ(bundle, string);
            parcel2.writeNoException();
            return true;
        }
        parcel.enforceInterface("android.support.customtabs.IPostMessageService");
        InterfaceC2463809l6 interfaceC2463809l6LJJJZ2 = C0W55.LJJJZ(parcel.readStrongBinder());
        if (parcel.readInt() != 0) {
            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
        }
        interfaceC2463809l6LJJJZ2.LLJILJILJ(bundle);
        parcel2.writeNoException();
        return true;
    }
}
