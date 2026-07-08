package androidx.compose.runtime;

import X.C13FK;
import X.C13KI;
import X.C20307314d5;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes31.dex */
public final class ParcelableSnapshotMutableLongState extends C13FK implements Parcelable {
    public static final C13KI Companion = new Object() { // from class: X.13KI
    };
    public static final Parcelable.Creator<ParcelableSnapshotMutableLongState> CREATOR = new C20307314d5(2);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public ParcelableSnapshotMutableLongState(long j) {
        super(j);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(LIZ());
    }
}
