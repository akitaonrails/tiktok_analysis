package X;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: X.0W0K, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0W0K {
    public static final /* synthetic */ int LIZ = 0;

    static {
        C0W0K.class.getClassLoader();
    }

    public static <T extends Parcelable> T LIZ(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return creator.createFromParcel(parcel);
    }
}
