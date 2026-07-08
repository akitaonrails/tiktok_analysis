package X;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: X.0WnH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C833770WnH {
    public static final /* synthetic */ int LIZ = 0;

    static {
        C833770WnH.class.getClassLoader();
    }

    public static Parcelable LIZ(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    public static void LIZIZ(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }
}
