package X;

import android.net.Uri;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: X.12nB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractBinderC19860312nB extends Binder implements InterfaceC19860412nC {
    public static final /* synthetic */ int LL = 0;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    public AbstractBinderC19860312nB() {
        attachInterface(this, "com.ss.android.socialbase.downloader.depend.IDownloadAidlFileProvider");
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel2.writeString("com.ss.android.socialbase.downloader.depend.IDownloadAidlFileProvider");
            return true;
        }
        parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlFileProvider");
        Uri uriLLLLLIL = ((BinderC19860512nD) this).LLLLLIL(parcel.readString(), parcel.readString());
        parcel2.writeNoException();
        if (uriLLLLLIL != null) {
            parcel2.writeInt(1);
            uriLLLLLIL.writeToParcel(parcel2, 1);
            return true;
        }
        parcel2.writeInt(0);
        return true;
    }
}
