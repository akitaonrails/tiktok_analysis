package X;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0VtP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C812090VtP implements IInterface {
    public final IBinder LL;
    public final String LLILLJJLI = "com.google.android.engage.protocol.IAppEngageService";

    public C812090VtP(IBinder iBinder) {
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
