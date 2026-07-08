package androidx.drawerlayout.widget;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.customview.view.AbsSavedState;

/* JADX INFO: loaded from: classes34.dex */
public class DrawerLayout$SavedState extends AbsSavedState {
    public static final Parcelable.Creator<DrawerLayout$SavedState> CREATOR = new Parcelable.ClassLoaderCreator<DrawerLayout$SavedState>() { // from class: androidx.drawerlayout.widget.DrawerLayout$SavedState.1
        @Override // android.os.Parcelable.Creator
        public DrawerLayout$SavedState createFromParcel(Parcel parcel) {
            return new DrawerLayout$SavedState(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public DrawerLayout$SavedState[] newArray(int i) {
            return new DrawerLayout$SavedState[i];
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.ClassLoaderCreator
        public DrawerLayout$SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new DrawerLayout$SavedState(parcel, classLoader);
        }
    };
    public int lockModeEnd;
    public int lockModeLeft;
    public int lockModeRight;
    public int lockModeStart;
    public int openDrawerGravity;

    public DrawerLayout$SavedState(Parcelable parcelable) {
        super(parcelable);
    }

    public DrawerLayout$SavedState(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.openDrawerGravity = parcel.readInt();
        this.lockModeLeft = parcel.readInt();
        this.lockModeRight = parcel.readInt();
        this.lockModeStart = parcel.readInt();
        this.lockModeEnd = parcel.readInt();
    }

    @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.openDrawerGravity);
        parcel.writeInt(this.lockModeLeft);
        parcel.writeInt(this.lockModeRight);
        parcel.writeInt(this.lockModeStart);
        parcel.writeInt(this.lockModeEnd);
    }
}
