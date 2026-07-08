package X;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: X.12nz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractBinderC19865312nz extends Binder implements InterfaceC19865512o1 {
    public static final /* synthetic */ int LL = 0;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    public AbstractBinderC19865312nz() {
        attachInterface(this, InterfaceC19865512o1.LIZ);
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        Object objCreateFromParcel;
        String str = InterfaceC19865512o1.LIZ;
        if (i >= 1) {
            if (i <= 16777215) {
                parcel.enforceInterface(str);
            } else if (i == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i == 1) {
                int i3 = parcel.readInt();
                Parcelable.Creator creator = Bundle.CREATOR;
                if (parcel.readInt() != 0) {
                    objCreateFromParcel = creator.createFromParcel(parcel);
                } else {
                    objCreateFromParcel = null;
                }
                ((BinderC19865412o0) this).LLL(i3, (Bundle) objCreateFromParcel);
                return true;
            }
        }
        return super.onTransact(i, parcel, parcel2, i2);
    }
}
