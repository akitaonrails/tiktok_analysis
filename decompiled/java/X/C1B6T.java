package X;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.1B6T, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public abstract class C1B6T extends Binder implements InterfaceC2199401B6c {
    public static final /* synthetic */ int LL = 0;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    public C1B6T() {
        attachInterface(this, "com.ss.android.socialbase.downloader.depend.IDownloadDiskSpaceAidlHandler");
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        InterfaceC2199421B6e interfaceC2199421B6e;
        if (i != 1) {
            if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel2.writeString("com.ss.android.socialbase.downloader.depend.IDownloadDiskSpaceAidlHandler");
            return true;
        }
        parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadDiskSpaceAidlHandler");
        long j = parcel.readLong();
        long j2 = parcel.readLong();
        final IBinder strongBinder = parcel.readStrongBinder();
        if (strongBinder == null) {
            interfaceC2199421B6e = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.ss.android.socialbase.downloader.depend.IDownloadDiskSpaceAidlCallback");
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof InterfaceC2199421B6e)) {
                interfaceC2199421B6e = (InterfaceC2199421B6e) iInterfaceQueryLocalInterface;
            } else {
                interfaceC2199421B6e = new InterfaceC2199421B6e(strongBinder) { // from class: X.1B6W
                    public final IBinder LL;

                    @Override // X.InterfaceC2199421B6e
                    public final void LJJJLZIJ() {
                        Parcel parcelObtain = Parcel.obtain();
                        Parcel parcelObtain2 = Parcel.obtain();
                        try {
                            parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadDiskSpaceAidlCallback");
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

                    @Override // android.os.IInterface
                    public final IBinder asBinder() {
                        return this.LL;
                    }

                    {
                        this.LL = strongBinder;
                    }
                };
            }
        }
        boolean zI0 = ((C1B6Z) this).I0(j, j2, interfaceC2199421B6e);
        parcel2.writeNoException();
        parcel2.writeInt(zI0 ? 1 : 0);
        return true;
    }
}
