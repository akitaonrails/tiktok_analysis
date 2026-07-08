package X;

import android.os.IBinder;
import android.os.Parcel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Vr4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C810640Vr4 implements C0V8X {
    public final IBinder LL;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.LL;
    }

    public C810640Vr4(IBinder iBinder) {
        this.LL = iBinder;
    }

    @Override // X.C0V8X
    public final void LJJIJLIJ(String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.bytedance.apm6.traffic.ITrafficTransportInterface");
            parcelObtain.writeString(str);
            this.LL.transact(2, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            parcelObtain2.recycle();
            parcelObtain.recycle();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // X.C0V8X
    public final void LJJLIIIJ(String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.bytedance.apm6.traffic.ITrafficTransportInterface");
            parcelObtain.writeString(str);
            this.LL.transact(3, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            parcelObtain2.recycle();
            parcelObtain.recycle();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // X.C0V8X
    public final void LJLIIL(String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.bytedance.apm6.traffic.ITrafficTransportInterface");
            parcelObtain.writeString(str);
            this.LL.transact(5, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            parcelObtain2.recycle();
            parcelObtain.recycle();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // X.C0V8X
    public final void LJJLJLI(String str, boolean z) {
        int i;
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.bytedance.apm6.traffic.ITrafficTransportInterface");
            parcelObtain.writeString(str);
            if (z) {
                i = 1;
            } else {
                i = 0;
            }
            parcelObtain.writeInt(i);
            this.LL.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            parcelObtain2.recycle();
            parcelObtain.recycle();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // X.C0V8X
    public final void LLILII(String str, String str2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.bytedance.apm6.traffic.ITrafficTransportInterface");
            parcelObtain.writeString(str);
            parcelObtain.writeString(str2);
            this.LL.transact(6, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            parcelObtain2.recycle();
            parcelObtain.recycle();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // X.C0V8X
    public final void Q(long j, String str, String str2, String str3, String str4, String str5) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.bytedance.apm6.traffic.ITrafficTransportInterface");
            parcelObtain.writeLong(j);
            parcelObtain.writeString(str);
            parcelObtain.writeString(str2);
            parcelObtain.writeString(str3);
            parcelObtain.writeString(str4);
            parcelObtain.writeString(str5);
            this.LL.transact(4, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            parcelObtain2.recycle();
            parcelObtain.recycle();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }
}
