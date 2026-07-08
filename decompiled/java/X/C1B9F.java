package X;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.1B9F, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public class C1B9F implements IInterface {
    public final IBinder LL;
    public final String LLILLJJLI;

    public C1B9F(IBinder iBinder, String str) {
        this.LL = iBinder;
        this.LLILLJJLI = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.LL;
    }

    public final Parcel LJJJZ() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.LLILLJJLI);
        return parcelObtain;
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

    public final void LLLLII(int i, Parcel parcel) {
        try {
            this.LL.transact(i, parcel, null, 1);
            parcel.recycle();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            parcel.recycle();
            throw th;
        }
    }
}
