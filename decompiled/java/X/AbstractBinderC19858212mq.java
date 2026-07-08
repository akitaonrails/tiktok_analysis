package X;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.12mq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractBinderC19858212mq extends Binder implements InterfaceC19858412ms {
    public static final /* synthetic */ int LL = 0;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    public AbstractBinderC19858212mq() {
        attachInterface(this, "com.ss.android.ugc.cut_downloader.IDownloadService");
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        InterfaceC19858112mp interfaceC19858112mp;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 1598968902) {
                        return super.onTransact(i, parcel, parcel2, i2);
                    }
                    parcel2.writeString("com.ss.android.ugc.cut_downloader.IDownloadService");
                    return true;
                }
                parcel.enforceInterface("com.ss.android.ugc.cut_downloader.IDownloadService");
                ((BinderC19857812mm) this).LJJJZ(parcel.readString());
                return true;
            }
            parcel.enforceInterface("com.ss.android.ugc.cut_downloader.IDownloadService");
            ((BinderC19857812mm) this).f0(parcel.readString(), parcel.readString());
            return true;
        }
        parcel.enforceInterface("com.ss.android.ugc.cut_downloader.IDownloadService");
        final IBinder strongBinder = parcel.readStrongBinder();
        if (strongBinder == null) {
            interfaceC19858112mp = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.ss.android.ugc.cut_downloader.IDownloadCallback");
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof InterfaceC19858112mp)) {
                interfaceC19858112mp = (InterfaceC19858112mp) iInterfaceQueryLocalInterface;
            } else {
                interfaceC19858112mp = new InterfaceC19858112mp(strongBinder) { // from class: X.12mr
                    public final IBinder LL;

                    @Override // android.os.IInterface
                    public final IBinder asBinder() {
                        return this.LL;
                    }

                    {
                        this.LL = strongBinder;
                    }

                    @Override // X.InterfaceC19858112mp
                    public final void LJJI(String str, String str2) {
                        Parcel parcelObtain = Parcel.obtain();
                        try {
                            parcelObtain.writeInterfaceToken("com.ss.android.ugc.cut_downloader.IDownloadCallback");
                            parcelObtain.writeString(str);
                            parcelObtain.writeString(str2);
                            this.LL.transact(1, parcelObtain, null, 1);
                            parcelObtain.recycle();
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            parcelObtain.recycle();
                            throw th;
                        }
                    }

                    @Override // X.InterfaceC19858112mp
                    public final void LJJJJI(String str, int i3) {
                        Parcel parcelObtain = Parcel.obtain();
                        try {
                            parcelObtain.writeInterfaceToken("com.ss.android.ugc.cut_downloader.IDownloadCallback");
                            parcelObtain.writeString(str);
                            parcelObtain.writeInt(i3);
                            this.LL.transact(2, parcelObtain, null, 1);
                            parcelObtain.recycle();
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            parcelObtain.recycle();
                            throw th;
                        }
                    }
                };
            }
        }
        ((BinderC19857812mm) this).J(interfaceC19858112mp);
        return true;
    }
}
