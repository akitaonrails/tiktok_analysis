package android.support.v4.os;

import X.BinderC19865412o0;
import X.C20307314d5;
import X.InterfaceC19865512o1;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes31.dex */
public class ResultReceiver implements Parcelable {
    public static final Parcelable.Creator<ResultReceiver> CREATOR = new C20307314d5(0);
    public InterfaceC19865512o1 LL;

    public void LIZ(int i, Bundle bundle) {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public ResultReceiver(Parcel parcel) {
        InterfaceC19865512o1 interfaceC19865512o1;
        final IBinder strongBinder = parcel.readStrongBinder();
        if (strongBinder == null) {
            interfaceC19865512o1 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(InterfaceC19865512o1.LIZ);
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof InterfaceC19865512o1)) {
                interfaceC19865512o1 = (InterfaceC19865512o1) iInterfaceQueryLocalInterface;
            } else {
                interfaceC19865512o1 = new InterfaceC19865512o1(strongBinder) { // from class: X.12ny
                    public final IBinder LL;

                    @Override // android.os.IInterface
                    public final IBinder asBinder() {
                        return this.LL;
                    }

                    {
                        this.LL = strongBinder;
                    }

                    @Override // X.InterfaceC19865512o1
                    public final void LLL(int i, Bundle bundle) {
                        Parcel parcelObtain = Parcel.obtain();
                        try {
                            parcelObtain.writeInterfaceToken(InterfaceC19865512o1.LIZ);
                            parcelObtain.writeInt(i);
                            if (bundle != null) {
                                parcelObtain.writeInt(1);
                                bundle.writeToParcel(parcelObtain, 0);
                            } else {
                                parcelObtain.writeInt(0);
                            }
                            this.LL.transact(1, parcelObtain, null, 1);
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
        this.LL = interfaceC19865512o1;
    }

    public final void LIZIZ(int i, Bundle bundle) {
        InterfaceC19865512o1 interfaceC19865512o1 = this.LL;
        if (interfaceC19865512o1 != null) {
            try {
                interfaceC19865512o1.LLL(i, bundle);
            } catch (RemoteException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            try {
                if (this.LL == null) {
                    this.LL = new BinderC19865412o0(this);
                }
                parcel.writeStrongBinder(this.LL.asBinder());
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
