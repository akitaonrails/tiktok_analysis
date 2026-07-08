package X;

import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: X.0Vv2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C813100Vv2 {
    public static final /* synthetic */ int LIZ = 0;

    static {
        C813100Vv2.class.getClassLoader();
    }

    public static void LIZIZ(Parcel parcel) {
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail <= 0) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Parcel data not fully consumed, unread size: ");
        sbLIZ.append(iDataAvail);
        throw new BadParcelableException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static Parcelable LIZ(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }
}
