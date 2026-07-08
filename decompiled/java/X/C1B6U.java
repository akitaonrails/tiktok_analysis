package X;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: X.1B6U, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public abstract class C1B6U extends Binder implements InterfaceC2199491B6l {
    public static final /* synthetic */ int LL = 0;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    public C1B6U() {
        attachInterface(this, "com.ss.android.socialbase.downloader.depend.IDownloadAidlMonitorDepend");
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 1598968902) {
                        return super.onTransact(i, parcel, parcel2, i2);
                    }
                    parcel2.writeString("com.ss.android.socialbase.downloader.depend.IDownloadAidlMonitorDepend");
                    return true;
                }
                parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlMonitorDepend");
                int[] iArrB1 = ((C1B6V) this).b1();
                parcel2.writeNoException();
                parcel2.writeIntArray(iArrB1);
                return true;
            }
            parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlMonitorDepend");
            String eventPage = ((C1B6V) this).getEventPage();
            parcel2.writeNoException();
            parcel2.writeString(eventPage);
            return true;
        }
        parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlMonitorDepend");
        ((C1B6V) this).Q0(parcel.readString());
        parcel2.writeNoException();
        return true;
    }
}
