package X;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;

/* JADX INFO: renamed from: X.1B64, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public abstract class C1B64 extends Binder implements C1B63 {
    public static final /* synthetic */ int LL = 0;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    public C1B64() {
        attachInterface(this, "com.ss.android.socialbase.downloader.depend.IDownloadAidlDepend");
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        DownloadInfo downloadInfoCreateFromParcel;
        if (i != 1) {
            if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel2.writeString("com.ss.android.socialbase.downloader.depend.IDownloadAidlDepend");
            return true;
        }
        parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlDepend");
        BaseException baseExceptionCreateFromParcel = null;
        if (parcel.readInt() != 0) {
            downloadInfoCreateFromParcel = DownloadInfo.CREATOR.createFromParcel(parcel);
        } else {
            downloadInfoCreateFromParcel = null;
        }
        if (parcel.readInt() != 0) {
            baseExceptionCreateFromParcel = BaseException.CREATOR.createFromParcel(parcel);
        }
        ((C1B65) this).monitorLogSend(downloadInfoCreateFromParcel, baseExceptionCreateFromParcel, parcel.readInt());
        parcel2.writeNoException();
        return true;
    }
}
