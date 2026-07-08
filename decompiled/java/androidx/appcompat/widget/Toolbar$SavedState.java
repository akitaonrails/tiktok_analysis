package androidx.appcompat.widget;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.widget.Toolbar$SavedState;
import androidx.customview.view.AbsSavedState;

/* JADX INFO: loaded from: classes34.dex */
public class Toolbar$SavedState extends AbsSavedState {
    public static final Parcelable.Creator<Toolbar$SavedState> CREATOR = new Parcelable.ClassLoaderCreator<Toolbar$SavedState>() { // from class: X.19VS
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            return new Toolbar$SavedState(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Toolbar$SavedState[i];
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public final Toolbar$SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new Toolbar$SavedState(parcel, classLoader);
        }
    };
    public int LL;
    public boolean LLILLJJLI;

    public Toolbar$SavedState(Parcelable parcelable) {
        super(parcelable);
    }

    public Toolbar$SavedState(Parcel parcel, ClassLoader classLoader) {
        boolean z;
        super(parcel, classLoader);
        this.LL = parcel.readInt();
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.LLILLJJLI = z;
    }

    @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.LL);
        parcel.writeInt(this.LLILLJJLI ? 1 : 0);
    }
}
