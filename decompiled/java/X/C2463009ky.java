package X;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.play.core.appupdate.s;
import com.google.android.play.core.appupdate.t;

/* JADX INFO: renamed from: X.09ky, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2463009ky extends C2463109kz implements InterfaceC2462709kv {
    public C2463009ky(IBinder iBinder) {
        super(iBinder);
    }

    @Override // X.InterfaceC2462709kv
    public final void LLZLI(String str, Bundle bundle, s sVar) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
        parcelObtain.writeString(str);
        parcelObtain.writeInt(1);
        bundle.writeToParcel(parcelObtain, 0);
        parcelObtain.writeStrongBinder(sVar);
        try {
            this.LL.transact(3, parcelObtain, null, 1);
            parcelObtain.recycle();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // X.InterfaceC2462709kv
    public final void LLZZLLIL(String str, Bundle bundle, t tVar) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
        parcelObtain.writeString(str);
        parcelObtain.writeInt(1);
        bundle.writeToParcel(parcelObtain, 0);
        parcelObtain.writeStrongBinder(tVar);
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
