package X;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0WmS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C833260WmS implements IInterface {
    public final IBinder LL;
    public final String LLILLJJLI;

    public C833260WmS(IBinder iBinder, String str) {
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

    public final void LLILLIZIL(int i, Parcel parcel) {
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
