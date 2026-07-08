package X;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: X.1B6p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public abstract class AbstractBinderC2199531B6p extends Binder implements InterfaceC2199541B6q {
    public static final /* synthetic */ int LL = 0;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    public AbstractBinderC2199531B6p() {
        attachInterface(this, "com.ss.android.socialbase.downloader.depend.ProcessAidlCallback");
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel2.writeString("com.ss.android.socialbase.downloader.depend.ProcessAidlCallback");
            return true;
        }
        parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.ProcessAidlCallback");
        ((BinderC2199551B6r) this).LJJLIIIJJIZ(parcel.readInt(), parcel.readInt());
        parcel2.writeNoException();
        return true;
    }
}
