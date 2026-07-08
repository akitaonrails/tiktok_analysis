package androidx.compose.runtime;

import X.C13FM;
import X.C13FR;
import X.C20307314d5;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes31.dex */
public final class ParcelableSnapshotMutableDoubleState extends C13FM implements Parcelable {
    public static final C13FR Companion = new Object() { // from class: X.13FR
    };
    public static final Parcelable.Creator<ParcelableSnapshotMutableDoubleState> CREATOR = new C20307314d5(1);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public ParcelableSnapshotMutableDoubleState(double d) {
        super(d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(LJIJI());
    }
}
