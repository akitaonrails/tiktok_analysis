package androidx.appcompat.widget;

import X.C2189641Amo;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* JADX INFO: loaded from: classes34.dex */
public class AppCompatSpinner$SavedState extends View.BaseSavedState {
    public static final Parcelable.Creator<AppCompatSpinner$SavedState> CREATOR = new C2189641Amo(8);
    public boolean LL;

    public AppCompatSpinner$SavedState(Parcel parcel) {
        boolean z;
        super(parcel);
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.LL = z;
    }

    public AppCompatSpinner$SavedState(Parcelable parcelable) {
        super(parcelable);
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.LL ? (byte) 1 : (byte) 0);
    }
}
