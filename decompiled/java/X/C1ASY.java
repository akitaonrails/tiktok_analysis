package X;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: X.1ASY, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public abstract class C1ASY extends Binder implements C1ASX {
    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    public C1ASY() {
        attachInterface(this, "com.sec.android.app.samsungapps.downloadservice.aidl.IGalaxyStoreDownloadCallback");
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i >= 1) {
            if (i <= 16777215) {
                parcel.enforceInterface("com.sec.android.app.samsungapps.downloadservice.aidl.IGalaxyStoreDownloadCallback");
            } else if (i == 1598968902) {
                parcel2.writeString("com.sec.android.app.samsungapps.downloadservice.aidl.IGalaxyStoreDownloadCallback");
                return true;
            }
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        LLLZLL(parcel.readLong(), parcel.readString(), parcel.readFloat());
                        return true;
                    }
                } else {
                    LJJJJI(parcel.readString(), parcel.readInt());
                    return true;
                }
            } else {
                O(parcel.readInt(), parcel.readString(), parcel.readString());
                return true;
            }
        }
        return super.onTransact(i, parcel, parcel2, i2);
    }
}
