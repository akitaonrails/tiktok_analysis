package X;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.09l1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C2463309l1 implements IInterface {
    public final IBinder LL;

    public C2463309l1(IBinder iBinder) {
        this.LL = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.LL;
    }

    public final void LJJJZ(int i, Parcel parcel) {
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
