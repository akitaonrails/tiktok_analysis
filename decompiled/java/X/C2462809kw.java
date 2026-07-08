package X;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.09kw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C2462809kw extends C2462909kx implements InterfaceC2460809kc {
    public C2462809kw(IBinder iBinder) {
        super(iBinder);
    }

    @Override // X.InterfaceC2460809kc
    public final void LLJJJ(String str, Bundle bundle, BinderC2460909kd binderC2460909kd) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.LLILLJJLI);
        parcelObtain.writeString(str);
        parcelObtain.writeInt(1);
        bundle.writeToParcel(parcelObtain, 0);
        parcelObtain.writeStrongBinder(binderC2460909kd);
        try {
            this.LL.transact(1, parcelObtain, null, 1);
            parcelObtain.recycle();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            parcelObtain.recycle();
            throw th;
        }
    }
}
