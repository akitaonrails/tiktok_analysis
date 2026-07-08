package X;

import android.os.Parcel;
import android.util.Base64;

/* JADX INFO: renamed from: X.0uAj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1693550uAj {
    public final Parcel LIZ;

    public final int LIZ() {
        return this.LIZ.dataAvail();
    }

    public final float LIZIZ() {
        return this.LIZ.readFloat();
    }

    public final long LIZJ() {
        byte b = this.LIZ.readByte();
        long j = b == 1 ? 4294967296L : b == 2 ? 8589934592L : 0L;
        return C1682450tsp.LIZ(j, 0L) ? C1682440tso.LIZJ : C1682430tsn.LJFF(LIZIZ(), j);
    }

    public C1693550uAj(String str) {
        Parcel parcelObtain = Parcel.obtain();
        this.LIZ = parcelObtain;
        byte[] bArrDecode = Base64.decode(str, 0);
        parcelObtain.unmarshall(bArrDecode, 0, bArrDecode.length);
        parcelObtain.setDataPosition(0);
    }
}
