package X;

import android.os.Bundle;
import android.os.Messenger;
import android.os.Parcel;
import android.os.ResultReceiver;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import joo.f;

/* JADX INFO: renamed from: X.0Wuj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C838390Wuj {
    public static final Bundle LIZ(byte[] bArr) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.unmarshall(bArr, 0, bArr.length);
        parcelObtain.setDataPosition(0);
        Bundle bundle = parcelObtain.readBundle(f.class.getClassLoader());
        parcelObtain.recycle();
        if (bundle == null) {
            return new Bundle();
        }
        return bundle;
    }

    public static final void LIZIZ(Bundle bundle) {
        Object obj;
        for (String str : bundle.keySet()) {
            try {
                obj = bundle.get(str);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                obj = null;
            } catch (OutOfMemoryError e2) {
                TryCatchGuardChecker.doCheck(e2);
                obj = null;
            }
            if (!(obj instanceof Messenger) && !(obj instanceof ResultReceiver) && !(obj instanceof android.support.v4.os.ResultReceiver)) {
                if (obj instanceof Bundle) {
                    LIZIZ((Bundle) obj);
                }
            } else {
                boolean z = false;
                if (C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_find_bundleutil_issue", true) == 1) {
                    z = true;
                }
                if (z) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("You can't put a Parcel that contained Binder objects, please check key ");
                    sbLIZ.append(str);
                    C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ));
                } else {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("You can't put a Parcel that contained Binder objects, please check key ");
                    sbLIZ2.append(str);
                    throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
                }
            }
        }
    }

    public static final int LIZJ(Bundle bundle) {
        try {
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeBundle(bundle);
            int iDataSize = parcelObtain.dataSize();
            parcelObtain.recycle();
            return iDataSize;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return 0;
        }
    }

    public static final byte[] LIZLLL(Bundle bundle) {
        C0MZY.LIZ.getClass();
        C0MZY.LIZJ();
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_find_bundleutil_issue", true) == 1) {
            LIZIZ(bundle);
        }
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeBundle(bundle);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        return bArrMarshall;
    }
}
