package X;

import android.os.IBinder;
import android.os.Parcel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.socialbase.downloader.model.DownloadInfo;

/* JADX INFO: renamed from: X.1B68, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public class C1B68 implements C1B6B {
    public final IBinder LL;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.LL;
    }

    public C1B68(IBinder iBinder) {
        this.LL = iBinder;
    }

    @Override // X.C1B6B
    public final boolean LLI(DownloadInfo downloadInfo) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.INotificationClickAidlCallback");
            boolean z = true;
            if (downloadInfo == null) {
                parcelObtain.writeInt(0);
            } else {
                parcelObtain.writeInt(1);
                downloadInfo.writeToParcel(parcelObtain, 0);
            }
            this.LL.transact(2, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            if (parcelObtain2.readInt() == 0) {
                z = false;
            }
            parcelObtain2.recycle();
            parcelObtain.recycle();
            return z;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // X.C1B6B
    public final boolean LLLLLJIL(DownloadInfo downloadInfo) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.INotificationClickAidlCallback");
            boolean z = true;
            if (downloadInfo == null) {
                parcelObtain.writeInt(0);
            } else {
                parcelObtain.writeInt(1);
                downloadInfo.writeToParcel(parcelObtain, 0);
            }
            this.LL.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            if (parcelObtain2.readInt() == 0) {
                z = false;
            }
            parcelObtain2.recycle();
            parcelObtain.recycle();
            return z;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // X.C1B6B
    public final boolean t0(DownloadInfo downloadInfo) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.INotificationClickAidlCallback");
            boolean z = true;
            if (downloadInfo == null) {
                parcelObtain.writeInt(0);
            } else {
                parcelObtain.writeInt(1);
                downloadInfo.writeToParcel(parcelObtain, 0);
            }
            this.LL.transact(3, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            if (parcelObtain2.readInt() == 0) {
                z = false;
            }
            parcelObtain2.recycle();
            parcelObtain.recycle();
            return z;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }
}
