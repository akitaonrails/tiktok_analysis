package X;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0W0I, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0W0I {
    public static InterfaceC815410Vyl LIZ(Bundle bundle) {
        try {
            Bundle bundle2 = (Bundle) bundle.getParcelable("android.support.v4.media.session.SESSION_TOKEN2");
            if (bundle2 == null) {
                return null;
            }
            bundle2.setClassLoader(C0W0I.class.getClassLoader());
            Parcelable parcelable = bundle2.getParcelable("a");
            if (parcelable instanceof ParcelImpl) {
                return ((ParcelImpl) parcelable).mParcel;
            }
            throw new IllegalArgumentException("Invalid parcel");
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}
