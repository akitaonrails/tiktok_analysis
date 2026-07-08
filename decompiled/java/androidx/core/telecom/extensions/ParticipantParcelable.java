package androidx.core.telecom.extensions;

import X.C2188811AlT;
import X.C2325341G0m;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.Objects;
import java.util.StringJoiner;

/* JADX INFO: loaded from: classes36.dex */
public class ParticipantParcelable implements Parcelable {
    public static final Parcelable.Creator<ParticipantParcelable> CREATOR = new C2325341G0m(1);
    public String id;
    public CharSequence name;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int hashCode() {
        return Arrays.deepHashCode(Arrays.asList(this.id, this.name).toArray());
    }

    public final String toString() {
        StringJoiner stringJoiner = new StringJoiner(", ", "{", "}");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("id: ");
        sbLIZ.append(Objects.toString(this.id));
        stringJoiner.add(C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("name: ");
        sbLIZ2.append(Objects.toString(this.name));
        stringJoiner.add(C2188811AlT.LIZIZ(sbLIZ2));
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("ParticipantParcelable");
        sbLIZ3.append(stringJoiner.toString());
        return C2188811AlT.LIZIZ(sbLIZ3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ParticipantParcelable)) {
            return false;
        }
        ParticipantParcelable participantParcelable = (ParticipantParcelable) obj;
        if (Objects.deepEquals(this.id, participantParcelable.id) && Objects.deepEquals(this.name, participantParcelable.name)) {
            return true;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iDataPosition = parcel.dataPosition();
        parcel.writeInt(0);
        parcel.writeString(this.id);
        if (this.name != null) {
            parcel.writeInt(1);
            TextUtils.writeToParcel(this.name, parcel, i);
        } else {
            parcel.writeInt(0);
        }
        int iDataPosition2 = parcel.dataPosition();
        parcel.setDataPosition(iDataPosition);
        parcel.writeInt(iDataPosition2 - iDataPosition);
        parcel.setDataPosition(iDataPosition2);
    }
}
