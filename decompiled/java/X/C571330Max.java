package X;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: X.0Max, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C571330Max {
    public static final <T extends Parcelable> T LIZ(T t) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeValue(t);
        parcelObtain.setDataPosition(0);
        T t2 = (T) parcelObtain.readValue(t.getClass().getClassLoader());
        parcelObtain.recycle();
        return t2;
    }
}
