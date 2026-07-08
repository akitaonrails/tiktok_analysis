package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.FusedMusic;

/* JADX INFO: renamed from: X.0L81, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0L81 implements Parcelable.Creator<FusedMusic> {
    public static FusedMusic LIZ(Parcel parcel) {
        int i = parcel.readInt();
        long j = parcel.readLong();
        long j2 = parcel.readLong();
        String string = parcel.readString();
        if (string == null) {
            string = "";
        }
        long j3 = parcel.readLong();
        boolean z = true;
        if (parcel.readInt() != 1) {
            z = false;
        }
        Double d = null;
        if (parcel.dataAvail() > 0) {
            Object value = parcel.readValue(null);
            if (value instanceof Double) {
                d = (Double) value;
            }
        }
        return new FusedMusic(i, j, j2, string, j3, z, d);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ FusedMusic createFromParcel(Parcel parcel) {
        return LIZ(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final FusedMusic[] newArray(int i) {
        return new FusedMusic[i];
    }
}
