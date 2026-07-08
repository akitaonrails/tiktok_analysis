package androidx.core.telecom.extensions;

import X.C2188811AlT;
import X.C2325341G0m;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;
import java.util.StringJoiner;

/* JADX INFO: loaded from: classes36.dex */
public class Capability implements Parcelable {
    public static final Parcelable.Creator<Capability> CREATOR = new C2325341G0m(0);
    public int featureId;
    public int featureVersion;
    public int[] supportedActions;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        return Arrays.deepHashCode(Arrays.asList(Integer.valueOf(this.featureId), Integer.valueOf(this.featureVersion), this.supportedActions).toArray());
    }

    public final String toString() {
        StringJoiner stringJoiner = new StringJoiner(", ", "{", "}");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("featureId: ");
        sbLIZ.append(this.featureId);
        stringJoiner.add(C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("featureVersion: ");
        sbLIZ2.append(this.featureVersion);
        stringJoiner.add(C2188811AlT.LIZIZ(sbLIZ2));
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("supportedActions: ");
        sbLIZ3.append(Arrays.toString(this.supportedActions));
        stringJoiner.add(C2188811AlT.LIZIZ(sbLIZ3));
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("Capability");
        sbLIZ4.append(stringJoiner.toString());
        return C2188811AlT.LIZIZ(sbLIZ4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Capability)) {
            return false;
        }
        Capability capability = (Capability) obj;
        if (Objects.deepEquals(Integer.valueOf(this.featureId), Integer.valueOf(capability.featureId)) && Objects.deepEquals(Integer.valueOf(this.featureVersion), Integer.valueOf(capability.featureVersion)) && Objects.deepEquals(this.supportedActions, capability.supportedActions)) {
            return true;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iDataPosition = parcel.dataPosition();
        parcel.writeInt(0);
        parcel.writeInt(this.featureId);
        parcel.writeInt(this.featureVersion);
        parcel.writeIntArray(this.supportedActions);
        int iDataPosition2 = parcel.dataPosition();
        parcel.setDataPosition(iDataPosition);
        parcel.writeInt(iDataPosition2 - iDataPosition);
        parcel.setDataPosition(iDataPosition2);
    }
}
