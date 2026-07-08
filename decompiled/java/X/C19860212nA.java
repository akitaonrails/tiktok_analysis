package X;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.12nA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C19860212nA implements InterfaceC19860412nC {
    public final IBinder LL;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.LL;
    }

    public C19860212nA(IBinder iBinder) {
        this.LL = iBinder;
    }

    @Override // X.InterfaceC19860412nC
    public final Uri LLLLLIL(String str, String str2) {
        Uri uri;
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadAidlFileProvider");
            parcelObtain.writeString(str);
            parcelObtain.writeString(str2);
            this.LL.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            if (parcelObtain2.readInt() != 0) {
                uri = (Uri) Uri.CREATOR.createFromParcel(parcelObtain2);
            } else {
                uri = null;
            }
            parcelObtain2.recycle();
            parcelObtain.recycle();
            return uri;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }
}
