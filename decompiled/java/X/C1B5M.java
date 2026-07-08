package X;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.socialbase.downloader.model.DownloadInfo;

/* JADX INFO: renamed from: X.1B5M, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public abstract class C1B5M extends Binder implements C1B5O {
    public static final /* synthetic */ int LL = 0;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    public C1B5M() {
        attachInterface(this, "com.ss.android.socialbase.downloader.depend.IDownloadNotificationEventAidlListener");
    }

    public static C1B5O LJJJZ(final IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.ss.android.socialbase.downloader.depend.IDownloadNotificationEventAidlListener");
        if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof C1B5O)) {
            return (C1B5O) iInterfaceQueryLocalInterface;
        }
        return new C1B5O(iBinder) { // from class: X.1B5L
            public final IBinder LL;

            @Override // X.C1B5O
            public final String M() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadNotificationEventAidlListener");
                    this.LL.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    String string = parcelObtain2.readString();
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    return string;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th;
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.LL;
            }

            {
                this.LL = iBinder;
            }

            @Override // X.C1B5O
            public final boolean LLLILZ(boolean z) {
                int i;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadNotificationEventAidlListener");
                    boolean z2 = true;
                    if (z) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    parcelObtain.writeInt(i);
                    this.LL.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    if (parcelObtain2.readInt() == 0) {
                        z2 = false;
                    }
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    return z2;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th;
                }
            }

            @Override // X.C1B5O
            public final void r0(int i, DownloadInfo downloadInfo, String str, String str2) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadNotificationEventAidlListener");
                    parcelObtain.writeInt(i);
                    if (downloadInfo != null) {
                        parcelObtain.writeInt(1);
                        downloadInfo.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    this.LL.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th;
                }
            }
        };
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        DownloadInfo downloadInfoCreateFromParcel;
        boolean z;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 1598968902) {
                        return super.onTransact(i, parcel, parcel2, i2);
                    }
                    parcel2.writeString("com.ss.android.socialbase.downloader.depend.IDownloadNotificationEventAidlListener");
                    return true;
                }
                parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadNotificationEventAidlListener");
                String strM = ((C1B5N) this).M();
                parcel2.writeNoException();
                parcel2.writeString(strM);
                return true;
            }
            parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadNotificationEventAidlListener");
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            boolean zLLLILZ = ((C1B5N) this).LLLILZ(z);
            parcel2.writeNoException();
            parcel2.writeInt(zLLLILZ ? 1 : 0);
            return true;
        }
        parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadNotificationEventAidlListener");
        int i3 = parcel.readInt();
        if (parcel.readInt() != 0) {
            downloadInfoCreateFromParcel = DownloadInfo.CREATOR.createFromParcel(parcel);
        } else {
            downloadInfoCreateFromParcel = null;
        }
        ((C1B5N) this).r0(i3, downloadInfoCreateFromParcel, parcel.readString(), parcel.readString());
        parcel2.writeNoException();
        return true;
    }
}
