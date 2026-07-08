package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.common.internal.GetServiceRequest;

/* JADX INFO: renamed from: X.0Wl6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class ServiceConnectionC832420Wl6 implements ServiceConnection {
    public final int LL;
    public final /* synthetic */ AbstractC832390Wl3 LLILLJJLI;

    public ServiceConnectionC832420Wl6(AbstractC832390Wl3 abstractC832390Wl3, int i) {
        this.LLILLJJLI = abstractC832390Wl3;
        this.LL = i;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.LLILLJJLI.zzq) {
            try {
                this.LLILLJJLI.zzr = null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        Handler handler = this.LLILLJJLI.zzb;
        C786410Ut5.LJLJJL(handler, handler.obtainMessage(6, this.LL, 1));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) throws Throwable {
        InterfaceC832810Wlj interfaceC832810Wlj;
        final IBinder iBinder2 = iBinder;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(11064, "com/google/android/gms/common/internal/zze", "onServiceConnected", this, new Object[]{componentName, iBinder2}, "void", new C0WZW(false, "(Landroid/content/ComponentName;Landroid/os/IBinder;)V", new C0WZX("dzBzEgU1UM3QUBkgSxaWaaw9Bz14/yz/cVtGgVoCOLFl82r4DBRtwtJa", new String[]{"016a9"})));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null) {
            Object obj = objArr[0];
            Object obj2 = objArr[1];
            if (obj2 != null) {
                iBinder2 = (IBinder) obj2;
            }
        }
        AbstractC832390Wl3 abstractC832390Wl3 = this.LLILLJJLI;
        if (iBinder2 == null) {
            AbstractC832390Wl3.zzk(abstractC832390Wl3, 16);
            return;
        }
        synchronized (abstractC832390Wl3.zzq) {
            try {
                AbstractC832390Wl3 abstractC832390Wl32 = this.LLILLJJLI;
                IInterface iInterfaceQueryLocalInterface = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof InterfaceC832810Wlj)) {
                    interfaceC832810Wlj = (InterfaceC832810Wlj) iInterfaceQueryLocalInterface;
                } else {
                    interfaceC832810Wlj = new InterfaceC832810Wlj(iBinder2) { // from class: X.0WlG
                        public final IBinder LL;

                        {
                            this.LL = iBinder2;
                        }

                        @Override // android.os.IInterface
                        public final IBinder asBinder() {
                            return this.LL;
                        }

                        @Override // X.InterfaceC832810Wlj
                        public final void Z(BinderC829070Wfh binderC829070Wfh, GetServiceRequest getServiceRequest) {
                            Parcel parcelObtain = Parcel.obtain();
                            Parcel parcelObtain2 = Parcel.obtain();
                            try {
                                parcelObtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                                parcelObtain.writeStrongBinder(binderC829070Wfh);
                                parcelObtain.writeInt(1);
                                C832410Wl5.LIZ(getServiceRequest, parcelObtain, 0);
                                this.LL.transact(46, parcelObtain, parcelObtain2, 0);
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
                abstractC832390Wl32.zzr = interfaceC832810Wlj;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        this.LLILLJJLI.zzl(0, null, this.LL);
    }
}
