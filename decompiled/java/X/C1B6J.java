package X;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: X.1B6J, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public abstract class C1B6J extends Binder implements C1B6N {
    public static final /* synthetic */ int LL = 0;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    public C1B6J() {
        attachInterface(this, "com.ss.android.socialbase.downloader.depend.IRetryDelayTimeAidlCalculator");
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel2.writeString("com.ss.android.socialbase.downloader.depend.IRetryDelayTimeAidlCalculator");
            return true;
        }
        parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IRetryDelayTimeAidlCalculator");
        long jLJJJJZI = ((C1B6O) this).LJJJJZI(parcel.readInt(), parcel.readInt());
        parcel2.writeNoException();
        parcel2.writeLong(jLJJJJZI);
        return true;
    }
}
