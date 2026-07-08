package X;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0WGu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C820540WGu implements IInterface {
    public final IBinder LL;
    public final String LLILLJJLI;

    public final Parcel LJJJZ() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.LLILLJJLI);
        return parcelObtain;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.LL;
    }

    public C820540WGu(IBinder iBinder, String str) {
        this.LL = iBinder;
        this.LLILLJJLI = str;
    }

    public final Parcel LLILLIZIL(int i, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.LL.transact(i, parcel, parcelObtain, 0);
                parcelObtain.readException();
                parcel.recycle();
                return parcelObtain;
            } catch (RuntimeException e) {
                TryCatchGuardChecker.doCheck(e);
                parcelObtain.recycle();
                throw e;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            parcel.recycle();
            throw th;
        }
    }

    public final void LLLIIL(int i, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.LL.transact(i, parcel, parcelObtain, 0);
            parcelObtain.readException();
            parcel.recycle();
            parcelObtain.recycle();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            parcel.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }
}
