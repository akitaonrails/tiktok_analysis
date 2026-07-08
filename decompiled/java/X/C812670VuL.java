package X;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0VuL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C812670VuL implements IInterface {
    public final IBinder LL;
    public final String LLILLJJLI = "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService";

    public C812670VuL(IBinder iBinder) {
        this.LL = iBinder;
    }

    public final Parcel LJJJZ(int i, Parcel parcel) {
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

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.LL;
    }
}
