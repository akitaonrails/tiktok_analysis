package X;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.heytap.mcs.liquid.model.SeedingRequestResult;

/* JADX INFO: renamed from: X.0VvL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public abstract class AbstractBinderC813290VvL extends Binder implements InterfaceC813300VvM {
    public AbstractBinderC813290VvL() {
        attachInterface(this, "com.heytap.mcs.liquid.service.download.result.ILiquidBatchCallback");
    }

    public static InterfaceC813300VvM asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.heytap.mcs.liquid.service.download.result.ILiquidBatchCallback");
        return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC813300VvM)) ? new C813310VvN(iBinder) : (InterfaceC813300VvM) iInterfaceQueryLocalInterface;
    }

    public static InterfaceC813300VvM getDefaultImpl() {
        return C813310VvN.LLILLJJLI;
    }

    public static boolean setDefaultImpl(InterfaceC813300VvM interfaceC813300VvM) {
        if (C813310VvN.LLILLJJLI != null || interfaceC813300VvM == null) {
            return false;
        }
        C813310VvN.LLILLJJLI = interfaceC813300VvM;
        return true;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel2.writeString("com.heytap.mcs.liquid.service.download.result.ILiquidBatchCallback");
            return true;
        }
        parcel.enforceInterface("com.heytap.mcs.liquid.service.download.result.ILiquidBatchCallback");
        onFailed(parcel.createTypedArrayList(SeedingRequestResult.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
