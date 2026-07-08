package androidx.core.widget;

import X.C16HI;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* JADX INFO: loaded from: classes32.dex */
public class NestedScrollView$SavedState extends View.BaseSavedState {
    public static final Parcelable.Creator<NestedScrollView$SavedState> CREATOR = new C16HI(0);
    public int scrollPosition;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("HorizontalScrollView.SavedState{");
        sbLIZ.append(Integer.toHexString(System.identityHashCode(this)));
        sbLIZ.append(" scrollPosition=");
        sbLIZ.append(this.scrollPosition);
        sbLIZ.append("}");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public NestedScrollView$SavedState(Parcel parcel) {
        super(parcel);
        this.scrollPosition = parcel.readInt();
    }

    public NestedScrollView$SavedState(Parcelable parcelable) {
        super(parcelable);
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.scrollPosition);
    }
}
