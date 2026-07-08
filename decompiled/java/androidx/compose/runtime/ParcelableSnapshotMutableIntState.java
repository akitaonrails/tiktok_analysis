package androidx.compose.runtime;

import X.C13FG;
import X.C13FQ;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;

/* JADX INFO: loaded from: classes31.dex */
public final class ParcelableSnapshotMutableIntState extends C13FG implements Parcelable {
    public static final C13FQ Companion = new Object() { // from class: X.13FQ
    };
    public static final Parcelable.Creator<ParcelableSnapshotMutableIntState> CREATOR = new Parcelable.Creator<ParcelableSnapshotMutableIntState>() { // from class: X.13FP
        @Override // android.os.Parcelable.Creator
        public final ParcelableSnapshotMutableIntState createFromParcel(Parcel parcel) {
            return new ParcelableSnapshotMutableIntState(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final ParcelableSnapshotMutableIntState[] newArray(int i) {
            return new ParcelableSnapshotMutableIntState[i];
        }
    };

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public ParcelableSnapshotMutableIntState(int i) {
        super(i);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(LIZLLL());
    }
}
