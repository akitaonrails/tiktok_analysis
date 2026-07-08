package X;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: X.0ViQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public abstract class AbstractBinderC805280ViQ extends Binder implements C0V8X {
    public static final /* synthetic */ int LL = 0;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    public AbstractBinderC805280ViQ() {
        attachInterface(this, "com.bytedance.apm6.traffic.ITrafficTransportInterface");
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        boolean z;
        if (i != 1598968902) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.bytedance.apm6.traffic.ITrafficTransportInterface");
                    String string = parcel.readString();
                    if (parcel.readInt() != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    ((C0V8V) this).LJJLJLI(string, z);
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("com.bytedance.apm6.traffic.ITrafficTransportInterface");
                    ((C0V8V) this).LJJIJLIJ(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface("com.bytedance.apm6.traffic.ITrafficTransportInterface");
                    ((C0V8V) this).LJJLIIIJ(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface("com.bytedance.apm6.traffic.ITrafficTransportInterface");
                    ((C0V8V) this).Q(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface("com.bytedance.apm6.traffic.ITrafficTransportInterface");
                    ((C0V8V) this).LJLIIL(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 6:
                    parcel.enforceInterface("com.bytedance.apm6.traffic.ITrafficTransportInterface");
                    ((C0V8V) this).LLILII(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
        parcel2.writeString("com.bytedance.apm6.traffic.ITrafficTransportInterface");
        return true;
    }
}
