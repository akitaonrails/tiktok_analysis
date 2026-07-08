package androidx.compose.foundation.lazy.layout;

import X.C1778720wO6;
import X.C1864730ycp;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes28.dex */
public final class DefaultLazyKey implements Parcelable {
    public final int index;
    public static final C1778720wO6 Companion = new Object() { // from class: X.0wO6
    };
    public static final Parcelable.Creator<DefaultLazyKey> CREATOR = new C1864730ycp(0);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DefaultLazyKey) && this.index == ((DefaultLazyKey) obj).index;
    }

    public final int hashCode() {
        return this.index;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DefaultLazyKey(index=");
        sbLIZ.append(this.index);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public DefaultLazyKey(int i) {
        this.index = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.index);
    }
}
