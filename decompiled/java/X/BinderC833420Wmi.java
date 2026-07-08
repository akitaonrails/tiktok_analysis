package X;

import android.app.PendingIntent;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* JADX INFO: renamed from: X.0Wmi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class BinderC833420Wmi extends Binder implements IInterface {
    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    public BinderC833420Wmi() {
        attachInterface(this, "com.google.android.gms.fido.fido2.internal.regular.IFido2AppCallbacks");
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        Status statusCreateFromParcel;
        if (i > 16777215) {
            if (super.onTransact(i, parcel, parcel2, i2)) {
                return true;
            }
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
        }
        AbstractBinderC833440Wmk abstractBinderC833440Wmk = (AbstractBinderC833440Wmk) this;
        if (i == 1) {
            Parcelable.Creator<Status> creator = Status.CREATOR;
            Parcelable parcelable = null;
            if (parcel.readInt() == 0) {
                statusCreateFromParcel = null;
            } else {
                statusCreateFromParcel = creator.createFromParcel(parcel);
            }
            Status status = statusCreateFromParcel;
            Parcelable.Creator creator2 = PendingIntent.CREATOR;
            if (parcel.readInt() != 0) {
                parcelable = (Parcelable) creator2.createFromParcel(parcel);
            }
            int iDataAvail = parcel.dataAvail();
            if (iDataAvail <= 0) {
                C832640WlS.LIZ(status, parcelable, ((BinderC833430Wmj) abstractBinderC833440Wmk).LL);
                return true;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Parcel data not fully consumed, unread size: ");
            sbLIZ.append(iDataAvail);
            throw new BadParcelableException(C2188811AlT.LIZIZ(sbLIZ));
        }
        return false;
    }
}
