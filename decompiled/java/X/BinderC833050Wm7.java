package X;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: renamed from: X.0Wm7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class BinderC833050Wm7 extends Binder implements IInterface {
    public BinderC833050Wm7() {
        attachInterface(this, "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverResultCallback");
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        boolean zOnTransact;
        Status statusCreateFromParcel;
        if (i > 16777215) {
            zOnTransact = super.onTransact(i, parcel, parcel2, i2);
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
            zOnTransact = false;
        }
        if (zOnTransact) {
            return true;
        }
        AbstractBinderC833130WmF abstractBinderC833130WmF = (AbstractBinderC833130WmF) this;
        if (i != 1) {
            return false;
        }
        Parcelable.Creator<Status> creator = Status.CREATOR;
        if (parcel.readInt() == 0) {
            statusCreateFromParcel = null;
        } else {
            statusCreateFromParcel = creator.createFromParcel(parcel);
        }
        C832640WlS.LIZ(statusCreateFromParcel, null, ((BinderC833110WmD) abstractBinderC833130WmF).LL.LIZLLL);
        return true;
    }
}
