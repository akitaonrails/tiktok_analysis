package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.12n1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class ServiceConnectionC19859312n1 implements ServiceConnection {
    public final MutableLiveData<InterfaceC19858412ms> LL;

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
    }

    @Override // android.content.ServiceConnection
    public final void onNullBinding(ComponentName componentName) {
    }

    public ServiceConnectionC19859312n1(MutableLiveData<InterfaceC19858412ms> mutableLiveData) {
        this.LL = mutableLiveData;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.LL.setValue(null);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) throws Throwable {
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(11064, "com/ss/android/ugc/cut_downloader/Downloader$DownloadServiceConnection", "onServiceConnected", this, new Object[]{componentName, iBinder}, "void", new C0WZW(false, "(Landroid/content/ComponentName;Landroid/os/IBinder;)V", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3ssaFg3af2mb5DP2DeRZiNk7Cn7GxVH7t0=", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null) {
            Object obj = objArr[0];
            Object obj2 = objArr[1];
            if (obj2 != null) {
                iBinder = (IBinder) obj2;
            }
        }
        if (iBinder != null) {
            MutableLiveData<InterfaceC19858412ms> mutableLiveData = this.LL;
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.ss.android.ugc.cut_downloader.IDownloadService");
            if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC19858412ms)) {
                iInterfaceQueryLocalInterface = new InterfaceC19858412ms(iBinder) { // from class: X.12mt
                    public final IBinder LL;

                    @Override // android.os.IInterface
                    public final IBinder asBinder() {
                        return this.LL;
                    }

                    {
                        this.LL = iBinder;
                    }

                    @Override // X.InterfaceC19858412ms
                    public final void J(InterfaceC19858112mp interfaceC19858112mp) {
                        IBinder iBinderAsBinder;
                        Parcel parcelObtain = Parcel.obtain();
                        try {
                            parcelObtain.writeInterfaceToken("com.ss.android.ugc.cut_downloader.IDownloadService");
                            if (interfaceC19858112mp == null) {
                                iBinderAsBinder = null;
                            } else {
                                iBinderAsBinder = interfaceC19858112mp.asBinder();
                            }
                            parcelObtain.writeStrongBinder(iBinderAsBinder);
                            this.LL.transact(1, parcelObtain, null, 1);
                            parcelObtain.recycle();
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            parcelObtain.recycle();
                            throw th;
                        }
                    }

                    @Override // X.InterfaceC19858412ms
                    public final void f0(String str, String str2) {
                        Parcel parcelObtain = Parcel.obtain();
                        try {
                            parcelObtain.writeInterfaceToken("com.ss.android.ugc.cut_downloader.IDownloadService");
                            parcelObtain.writeString(str);
                            parcelObtain.writeString(str2);
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
            mutableLiveData.setValue((InterfaceC19858412ms) iInterfaceQueryLocalInterface);
            iBinder.linkToDeath(new IBinder.DeathRecipient() { // from class: X.12n2
                @Override // android.os.IBinder.DeathRecipient
                public final void binderDied() {
                    this.LL.LL.setValue(null);
                }
            }, 0);
        }
    }
}
