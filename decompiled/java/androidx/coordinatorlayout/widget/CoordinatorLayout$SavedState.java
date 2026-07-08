package androidx.coordinatorlayout.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.coordinatorlayout.widget.CoordinatorLayout$SavedState;
import androidx.customview.view.AbsSavedState;

/* JADX INFO: loaded from: classes33.dex */
public class CoordinatorLayout$SavedState extends AbsSavedState {
    public static final Parcelable.Creator<CoordinatorLayout$SavedState> CREATOR = new Parcelable.ClassLoaderCreator<CoordinatorLayout$SavedState>() { // from class: X.19GG
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            return new CoordinatorLayout$SavedState(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CoordinatorLayout$SavedState[i];
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public final CoordinatorLayout$SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new CoordinatorLayout$SavedState(parcel, classLoader);
        }
    };
    public SparseArray<Parcelable> LL;

    public CoordinatorLayout$SavedState(Parcelable parcelable) {
        super(parcelable);
    }

    public CoordinatorLayout$SavedState(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int i = parcel.readInt();
        int[] iArr = new int[i];
        parcel.readIntArray(iArr);
        Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
        this.LL = new SparseArray<>(i);
        for (int i2 = 0; i2 < i; i2++) {
            this.LL.append(iArr[i2], parcelableArray[i2]);
        }
    }

    @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int size;
        super.writeToParcel(parcel, i);
        SparseArray<Parcelable> sparseArray = this.LL;
        if (sparseArray != null) {
            size = sparseArray.size();
        } else {
            size = 0;
        }
        parcel.writeInt(size);
        int[] iArr = new int[size];
        Parcelable[] parcelableArr = new Parcelable[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = this.LL.keyAt(i2);
            parcelableArr[i2] = this.LL.valueAt(i2);
        }
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i);
    }
}
