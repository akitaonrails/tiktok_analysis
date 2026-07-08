package X;

import android.os.IBinder;
import android.os.Parcel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Wm8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C833060Wm8 extends C833090WmB implements InterfaceC833120WmE {
    public C833060Wm8(IBinder iBinder) {
        super(iBinder);
    }

    @Override // X.InterfaceC833120WmE
    public final void LLLIILIL(BinderC833110WmD binderC833110WmD) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.LLILLJJLI);
        parcelObtain.writeStrongBinder(binderC833110WmD);
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            this.LL.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            parcelObtain.recycle();
            parcelObtain2.recycle();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            parcelObtain.recycle();
            parcelObtain2.recycle();
            throw th;
        }
    }
}
