package X;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: X.0WGD, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public class C0WGD extends Binder implements IInterface {
    public boolean LJJJZ(int i, Parcel parcel, Parcel parcel2) {
        throw null;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    public C0WGD(String str) {
        attachInterface(this, str);
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i > 16777215) {
            if (super.onTransact(i, parcel, parcel2, i2)) {
                return true;
            }
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
        }
        return LJJJZ(i, parcel, parcel2);
    }
}
