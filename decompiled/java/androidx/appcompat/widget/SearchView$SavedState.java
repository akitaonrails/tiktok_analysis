package androidx.appcompat.widget;

import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.widget.SearchView$SavedState;
import androidx.customview.view.AbsSavedState;

/* JADX INFO: loaded from: classes33.dex */
public class SearchView$SavedState extends AbsSavedState {
    public static final Parcelable.Creator<SearchView$SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SearchView$SavedState>() { // from class: X.190A
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            return new SearchView$SavedState(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SearchView$SavedState[i];
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public final SearchView$SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new SearchView$SavedState(parcel, classLoader);
        }
    };
    public boolean LL;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchView.SavedState{");
        sbLIZ.append(Integer.toHexString(System.identityHashCode(this)));
        sbLIZ.append(" isIconified=");
        sbLIZ.append(this.LL);
        sbLIZ.append("}");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SearchView$SavedState(Parcelable parcelable) {
        super(parcelable);
    }

    public SearchView$SavedState(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.LL = ((Boolean) parcel.readValue(null)).booleanValue();
    }

    @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeValue(Boolean.valueOf(this.LL));
    }
}
