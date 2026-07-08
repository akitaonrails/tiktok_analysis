package X;

import android.os.BadParcelableException;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: X.0W5q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class BinderC817640W5q extends Binder implements IInterface {
    public boolean LJJJZ(int i, Parcel parcel, Parcel parcel2) {
        throw null;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    public BinderC817640W5q(String str) {
        attachInterface(this, str);
    }

    public static void LLILLIZIL(Parcel parcel) {
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail <= 0) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Parcel data not fully consumed, unread size: ");
        sbLIZ.append(iDataAvail);
        throw new BadParcelableException(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
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
