package X;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.ss.android.socialbase.downloader.model.DownloadInfo;

/* JADX INFO: renamed from: X.1B5w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public abstract class AbstractBinderC2199341B5w extends Binder implements InterfaceC2199371B5z {
    public static final /* synthetic */ int LL = 0;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    public AbstractBinderC2199341B5w() {
        attachInterface(this, "com.ss.android.socialbase.downloader.depend.IDownloadCompleteAidlHandler");
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        DownloadInfo downloadInfoCreateFromParcel = null;
        if (i != 1) {
            if (i != 2) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString("com.ss.android.socialbase.downloader.depend.IDownloadCompleteAidlHandler");
                return true;
            }
            parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadCompleteAidlHandler");
            if (parcel.readInt() != 0) {
                downloadInfoCreateFromParcel = DownloadInfo.CREATOR.createFromParcel(parcel);
            }
            boolean zLJJLL = ((BinderC2199351B5x) this).LJJLL(downloadInfoCreateFromParcel);
            parcel2.writeNoException();
            parcel2.writeInt(zLJJLL ? 1 : 0);
            return true;
        }
        parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadCompleteAidlHandler");
        if (parcel.readInt() != 0) {
            downloadInfoCreateFromParcel = DownloadInfo.CREATOR.createFromParcel(parcel);
        }
        ((BinderC2199351B5x) this).LJJLIIJ(downloadInfoCreateFromParcel);
        parcel2.writeNoException();
        return true;
    }
}
