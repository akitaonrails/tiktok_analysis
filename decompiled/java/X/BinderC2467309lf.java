package X;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: X.09lf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class BinderC2467309lf extends Binder implements IInterface {
    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    public BinderC2467309lf() {
        attachInterface(this, "com.google.android.play.core.appupdate.protocol.IAppUpdateServiceCallback");
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
        AbstractBinderC2467209le abstractBinderC2467209le = (AbstractBinderC2467209le) this;
        Parcelable parcelable = null;
        if (i != 2) {
            if (i != 3) {
                return false;
            }
            Parcelable.Creator creator = Bundle.CREATOR;
            if (parcel.readInt() != 0) {
                parcelable = (Parcelable) creator.createFromParcel(parcel);
            }
            C2468509lr.LIZ(parcel);
            abstractBinderC2467209le.LJJZZIII((Bundle) parcelable);
            return true;
        }
        Parcelable.Creator creator2 = Bundle.CREATOR;
        if (parcel.readInt() != 0) {
            parcelable = (Parcelable) creator2.createFromParcel(parcel);
        }
        C2468509lr.LIZ(parcel);
        abstractBinderC2467209le.LJJZ((Bundle) parcelable);
        return true;
    }
}
