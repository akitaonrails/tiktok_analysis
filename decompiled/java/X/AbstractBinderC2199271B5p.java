package X;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;

/* JADX INFO: renamed from: X.1B5p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public abstract class AbstractBinderC2199271B5p extends Binder implements InterfaceC2199311B5t {
    public static final /* synthetic */ int LL = 0;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    public AbstractBinderC2199271B5p() {
        attachInterface(this, "com.ss.android.socialbase.downloader.depend.IDownloadForbiddenAidlHandler");
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        InterfaceC2199241B5m interfaceC2199241B5m;
        if (i != 1) {
            if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel2.writeString("com.ss.android.socialbase.downloader.depend.IDownloadForbiddenAidlHandler");
            return true;
        }
        parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadForbiddenAidlHandler");
        final IBinder strongBinder = parcel.readStrongBinder();
        if (strongBinder == null) {
            interfaceC2199241B5m = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.ss.android.socialbase.downloader.depend.IDownloadForbiddenAidlCallback");
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof InterfaceC2199241B5m)) {
                interfaceC2199241B5m = (InterfaceC2199241B5m) iInterfaceQueryLocalInterface;
            } else {
                interfaceC2199241B5m = new InterfaceC2199241B5m(strongBinder) { // from class: X.1B5j
                    public final IBinder LL;

                    @Override // X.InterfaceC2199241B5m
                    public final boolean LJLIIIL() {
                        Parcel parcelObtain = Parcel.obtain();
                        Parcel parcelObtain2 = Parcel.obtain();
                        try {
                            parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadForbiddenAidlCallback");
                            this.LL.transact(2, parcelObtain, parcelObtain2, 0);
                            parcelObtain2.readException();
                            boolean z = parcelObtain2.readInt() != 0;
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

                    @Override // android.os.IInterface
                    public final IBinder asBinder() {
                        return this.LL;
                    }

                    {
                        this.LL = strongBinder;
                    }

                    @Override // X.InterfaceC2199241B5m
                    public final void LJJIZ(List<String> list) {
                        Parcel parcelObtain = Parcel.obtain();
                        Parcel parcelObtain2 = Parcel.obtain();
                        try {
                            parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadForbiddenAidlCallback");
                            parcelObtain.writeStringList(list);
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
        }
        boolean zH = ((BinderC2199291B5r) this).H(interfaceC2199241B5m);
        parcel2.writeNoException();
        parcel2.writeInt(zH ? 1 : 0);
        return true;
    }
}
