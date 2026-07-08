package X;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.heytap.mcs.liquid.model.ActionResult;

/* JADX INFO: renamed from: X.0Vx3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public abstract class AbstractBinderC814350Vx3 extends Binder implements InterfaceC814360Vx4 {
    public AbstractBinderC814350Vx3() {
        attachInterface(this, "com.heytap.mcs.liquid.service.download.result.ILiquidCallback");
    }

    public static InterfaceC814360Vx4 asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.heytap.mcs.liquid.service.download.result.ILiquidCallback");
        return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC814360Vx4)) ? new C814370Vx5(iBinder) : (InterfaceC814360Vx4) iInterfaceQueryLocalInterface;
    }

    public static InterfaceC814360Vx4 getDefaultImpl() {
        return C814370Vx5.LLILLJJLI;
    }

    public static boolean setDefaultImpl(InterfaceC814360Vx4 interfaceC814360Vx4) {
        if (C814370Vx5.LLILLJJLI != null || interfaceC814360Vx4 == null) {
            return false;
        }
        C814370Vx5.LLILLJJLI = interfaceC814360Vx4;
        return true;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1598968902) {
            parcel2.writeString("com.heytap.mcs.liquid.service.download.result.ILiquidCallback");
            return true;
        }
        switch (i) {
            case 1:
                parcel.enforceInterface("com.heytap.mcs.liquid.service.download.result.ILiquidCallback");
                onShow(parcel.readString(), parcel.readInt());
                break;
            case 2:
                parcel.enforceInterface("com.heytap.mcs.liquid.service.download.result.ILiquidCallback");
                onClick(parcel.readString(), parcel.readInt());
                break;
            case 3:
                parcel.enforceInterface("com.heytap.mcs.liquid.service.download.result.ILiquidCallback");
                ActionResult actionResultOnPauseClick = onPauseClick(parcel.readString());
                parcel2.writeNoException();
                if (actionResultOnPauseClick == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                actionResultOnPauseClick.writeToParcel(parcel2, 1);
                return true;
            case 4:
                parcel.enforceInterface("com.heytap.mcs.liquid.service.download.result.ILiquidCallback");
                ActionResult actionResultOnResumeClick = onResumeClick(parcel.readString());
                parcel2.writeNoException();
                if (actionResultOnResumeClick == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                actionResultOnResumeClick.writeToParcel(parcel2, 1);
                return true;
            case 5:
                parcel.enforceInterface("com.heytap.mcs.liquid.service.download.result.ILiquidCallback");
                onDismiss(parcel.readString());
                break;
            case 6:
                parcel.enforceInterface("com.heytap.mcs.liquid.service.download.result.ILiquidCallback");
                onFailed(parcel.readString(), parcel.readInt(), parcel.readInt());
                break;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
        parcel2.writeNoException();
        return true;
    }
}
