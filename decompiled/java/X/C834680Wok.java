package X;

import android.os.BadParcelableException;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: renamed from: X.0Wok, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C834680Wok {
    static {
        C834680Wok.class.getClassLoader();
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

    public static void LIZJ(Parcel parcel, AbstractSafeParcelable abstractSafeParcelable) {
        if (abstractSafeParcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            abstractSafeParcelable.writeToParcel(parcel, 0);
        }
    }

    public static void LIZLLL(Parcel parcel, IInterface iInterface) {
        parcel.writeStrongBinder(iInterface.asBinder());
    }
}
