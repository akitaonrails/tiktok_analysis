package X;

import android.os.BadParcelableException;
import android.os.Parcel;

/* JADX INFO: renamed from: X.09ls, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2468609ls {
    public static final /* synthetic */ int LIZ = 0;

    static {
        C2468609ls.class.getClassLoader();
    }

    public static void LIZ(Parcel parcel) {
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail <= 0) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Parcel data not fully consumed, unread size: ");
        sbLIZ.append(iDataAvail);
        throw new BadParcelableException(C2188811AlT.LIZIZ(sbLIZ));
    }
}
