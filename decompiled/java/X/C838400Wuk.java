package X;

import android.os.Bundle;
import android.os.Parcel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Wuk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C838400Wuk {
    public static final Bundle LIZ(byte[] bArr) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.unmarshall(bArr, 0, bArr.length);
        parcelObtain.setDataPosition(0);
        Bundle bundle = parcelObtain.readBundle(C1701250uN9.class.getClassLoader());
        parcelObtain.recycle();
        if (bundle == null) {
            return new Bundle();
        }
        return bundle;
    }

    public static final int LIZIZ(Bundle bundle) {
        try {
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeBundle(bundle);
            int iDataSize = parcelObtain.dataSize();
            parcelObtain.recycle();
            return iDataSize;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return 0;
        }
    }
}
