package X;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Wt0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C837320Wt0 extends C837370Wt5 implements InterfaceC837360Wt4 {
    public C837320Wt0(IBinder iBinder) {
        super(iBinder);
    }

    @Override // X.InterfaceC837360Wt4
    public final void p0(Bundle bundle, BinderC837350Wt3 binderC837350Wt3) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.play.core.integrity.protocol.IIntegrityService");
        parcelObtain.writeInt(1);
        bundle.writeToParcel(parcelObtain, 0);
        parcelObtain.writeStrongBinder(binderC837350Wt3);
        try {
            this.LL.transact(2, parcelObtain, null, 1);
            parcelObtain.recycle();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            parcelObtain.recycle();
            throw th;
        }
    }
}
