package X;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: X.0wPL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1779490wPL {
    public static final /* synthetic */ int LIZ = 0;

    static {
        C1779490wPL.class.getClassLoader();
    }

    public static Parcelable LIZ(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }
}
