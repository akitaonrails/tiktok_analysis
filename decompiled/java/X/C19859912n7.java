package X;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.12n7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C19859912n7 extends C19860012n8 implements InterfaceC19859712n5 {
    public C19859912n7(IBinder iBinder) {
        super(iBinder);
    }

    @Override // X.InterfaceC19859712n5
    public final Bundle LLJJIJIIJIL(Bundle bundle) {
        Parcelable parcelable;
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.LLILLJJLI);
        parcelObtain.writeInt(1);
        bundle.writeToParcel(parcelObtain, 0);
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                this.LL.transact(1, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                parcelObtain.recycle();
                Parcelable.Creator creator = Bundle.CREATOR;
                if (parcelObtain2.readInt() == 0) {
                    parcelable = null;
                } else {
                    parcelable = (Parcelable) creator.createFromParcel(parcelObtain2);
                }
                Bundle bundle2 = (Bundle) parcelable;
                parcelObtain2.recycle();
                return bundle2;
            } catch (RuntimeException e) {
                TryCatchGuardChecker.doCheck(e);
                parcelObtain2.recycle();
                throw e;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            parcelObtain.recycle();
            throw th;
        }
    }
}
