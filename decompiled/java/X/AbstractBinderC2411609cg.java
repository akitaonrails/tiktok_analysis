package X;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: X.09cg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractBinderC2411609cg extends Binder implements InterfaceC2411509cf {
    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    public AbstractBinderC2411609cg() {
        attachInterface(this, InterfaceC2411509cf.LJJL);
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        IInterface iInterfaceQueryLocalInterface;
        String str = InterfaceC2411509cf.LJJL;
        if (i >= 1) {
            if (i <= 16777215) {
                parcel.enforceInterface(str);
            } else if (i == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i == 1) {
                final IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    iInterfaceQueryLocalInterface = null;
                } else {
                    iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(InterfaceC2411709ch.LJJJZ);
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC2411709ch)) {
                        iInterfaceQueryLocalInterface = new InterfaceC2411709ch(strongBinder) { // from class: X.09ci
                            public final IBinder LL;

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
                BinderC2409609cM binderC2409609cM = (BinderC2409609cM) this;
                if (iInterfaceQueryLocalInterface != null) {
                    binderC2409609cM.LL.LIZ();
                }
                return true;
            }
        }
        return super.onTransact(i, parcel, parcel2, i2);
    }
}
