package X;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: X.1B6L, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public abstract class C1B6L extends Binder implements C1B6M {
    public static final /* synthetic */ int LL = 0;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    public C1B6L() {
        attachInterface(this, "com.ss.android.socialbase.downloader.depend.IDownloadAidlInterceptor");
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel2.writeString("com.ss.android.socialbase.downloader.depend.IDownloadAidlInterceptor");
            return true;
        }
        parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlInterceptor");
        boolean zLJIILIIL = ((C1B6Q) this).LJIILIIL();
        parcel2.writeNoException();
        parcel2.writeInt(zLJIILIIL ? 1 : 0);
        return true;
    }
}
