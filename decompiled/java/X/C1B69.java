package X;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.ss.android.socialbase.downloader.model.DownloadInfo;

/* JADX INFO: renamed from: X.1B69, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public abstract class C1B69 extends Binder implements C1B6B {
    public static final /* synthetic */ int LL = 0;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    public C1B69() {
        attachInterface(this, "com.ss.android.socialbase.downloader.depend.INotificationClickAidlCallback");
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        DownloadInfo downloadInfoCreateFromParcel = null;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 1598968902) {
                        return super.onTransact(i, parcel, parcel2, i2);
                    }
                    parcel2.writeString("com.ss.android.socialbase.downloader.depend.INotificationClickAidlCallback");
                    return true;
                }
                parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.INotificationClickAidlCallback");
                if (parcel.readInt() != 0) {
                    downloadInfoCreateFromParcel = DownloadInfo.CREATOR.createFromParcel(parcel);
                }
                boolean zT0 = ((C1B6A) this).t0(downloadInfoCreateFromParcel);
                parcel2.writeNoException();
                parcel2.writeInt(zT0 ? 1 : 0);
                return true;
            }
            parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.INotificationClickAidlCallback");
            if (parcel.readInt() != 0) {
                downloadInfoCreateFromParcel = DownloadInfo.CREATOR.createFromParcel(parcel);
            }
            boolean zLLI = ((C1B6A) this).LLI(downloadInfoCreateFromParcel);
            parcel2.writeNoException();
            parcel2.writeInt(zLLI ? 1 : 0);
            return true;
        }
        parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.INotificationClickAidlCallback");
        if (parcel.readInt() != 0) {
            downloadInfoCreateFromParcel = DownloadInfo.CREATOR.createFromParcel(parcel);
        }
        boolean zLLLLLJIL = ((C1B6A) this).LLLLLJIL(downloadInfoCreateFromParcel);
        parcel2.writeNoException();
        parcel2.writeInt(zLLLLLJIL ? 1 : 0);
        return true;
    }
}
