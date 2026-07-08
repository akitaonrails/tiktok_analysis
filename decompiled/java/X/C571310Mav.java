package X;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: renamed from: X.0Mav, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C571310Mav {
    public static final Bundle LIZ(Bundle bundle) {
        if (bundle == null) {
            return new Bundle();
        }
        Parcel parcelObtain = Parcel.obtain();
        bundle.writeToParcel(parcelObtain, 0);
        parcelObtain.setDataPosition(0);
        Bundle bundle2 = parcelObtain.readBundle(C571310Mav.class.getClassLoader());
        if (bundle2 != null) {
            parcelObtain.recycle();
            return bundle2;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }
}
