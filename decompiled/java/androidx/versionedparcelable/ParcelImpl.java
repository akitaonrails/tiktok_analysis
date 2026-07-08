package androidx.versionedparcelable;

import X.C0W0H;
import X.C854630Xfp;
import X.InterfaceC815410Vyl;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes14.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new C854630Xfp(3);
    public final InterfaceC815410Vyl mParcel;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public ParcelImpl(Parcel parcel) {
        this.mParcel = new C0W0H(parcel).LJIILIIL();
    }

    public ParcelImpl(InterfaceC815410Vyl interfaceC815410Vyl) {
        this.mParcel = interfaceC815410Vyl;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) throws Throwable {
        new C0W0H(parcel).LJIL(this.mParcel);
    }
}
