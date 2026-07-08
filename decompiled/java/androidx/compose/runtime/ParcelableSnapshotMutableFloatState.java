package androidx.compose.runtime;

import X.C13FI;
import X.C1697330uGp;
import X.C1698130uI7;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes26.dex */
public final class ParcelableSnapshotMutableFloatState extends C13FI implements Parcelable {
    public static final C1697330uGp Companion = new Object() { // from class: X.0uGp
    };
    public static final Parcelable.Creator<ParcelableSnapshotMutableFloatState> CREATOR = new C1698130uI7(0);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public ParcelableSnapshotMutableFloatState(float f) {
        super(f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(LIZIZ());
    }
}
