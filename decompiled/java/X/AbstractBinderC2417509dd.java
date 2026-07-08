package X;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.09dd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractBinderC2417509dd extends Binder implements InterfaceC2417909dh {
    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    public AbstractBinderC2417509dd() {
        attachInterface(this, "androidx.room.IMultiInstanceInvalidationService");
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        InterfaceC2417609de interfaceC2417609de = null;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 1598968902) {
                        return super.onTransact(i, parcel, parcel2, i2);
                    }
                    parcel2.writeString("androidx.room.IMultiInstanceInvalidationService");
                    return true;
                }
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                ((BinderC2417409dc) this).LJJJZ(parcel.readInt(), parcel.createStringArray());
                return true;
            }
            parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
            final IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
                if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof InterfaceC2417609de)) {
                    interfaceC2417609de = (InterfaceC2417609de) iInterfaceQueryLocalInterface;
                } else {
                    interfaceC2417609de = new InterfaceC2417609de(strongBinder) { // from class: X.09df
                        public final IBinder LL;

                        @Override // android.os.IInterface
                        public final IBinder asBinder() {
                            return this.LL;
                        }

                        {
                            this.LL = strongBinder;
                        }

                        @Override // X.InterfaceC2417609de
                        public final void LLJJJJJIL(String[] strArr) {
                            Parcel parcelObtain = Parcel.obtain();
                            try {
                                parcelObtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationCallback");
                                parcelObtain.writeStringArray(strArr);
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
            ((BinderC2417409dc) this).LLJJ(interfaceC2417609de, parcel.readInt());
            parcel2.writeNoException();
            return true;
        }
        parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
        final IBinder strongBinder2 = parcel.readStrongBinder();
        if (strongBinder2 != null) {
            IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
            if (iInterfaceQueryLocalInterface2 != null && (iInterfaceQueryLocalInterface2 instanceof InterfaceC2417609de)) {
                interfaceC2417609de = (InterfaceC2417609de) iInterfaceQueryLocalInterface2;
            } else {
                interfaceC2417609de = new InterfaceC2417609de(strongBinder2) { // from class: X.09df
                    public final IBinder LL;

                    @Override // android.os.IInterface
                    public final IBinder asBinder() {
                        return this.LL;
                    }

                    {
                        this.LL = strongBinder2;
                    }

                    @Override // X.InterfaceC2417609de
                    public final void LLJJJJJIL(String[] strArr) {
                        Parcel parcelObtain = Parcel.obtain();
                        try {
                            parcelObtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationCallback");
                            parcelObtain.writeStringArray(strArr);
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
        int iLLILLIZIL = ((BinderC2417409dc) this).LLILLIZIL(interfaceC2417609de, parcel.readString());
        parcel2.writeNoException();
        parcel2.writeInt(iLLILLIZIL);
        return true;
    }
}
