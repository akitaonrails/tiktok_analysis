package com.bytedance.android.live.uikit.rtl;

import X.C21599219fy;
import X.InterfaceC21599319fz;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.live.uikit.rtl.RtlViewPager$SavedState;

/* JADX INFO: loaded from: classes34.dex */
public class RtlViewPager$SavedState implements Parcelable {
    public static final Parcelable.Creator<RtlViewPager$SavedState> CREATOR = new C21599219fy(new InterfaceC21599319fz<RtlViewPager$SavedState>() { // from class: X.19fK
        @Override // X.InterfaceC21599319fz
        public final RtlViewPager$SavedState[] newArray(int i) {
            return new RtlViewPager$SavedState[i];
        }

        @Override // X.InterfaceC21599319fz
        public final RtlViewPager$SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new RtlViewPager$SavedState(parcel, classLoader);
        }
    });
    public final int mLayoutDirection;
    public final Parcelable mViewPagerSavedState;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public RtlViewPager$SavedState(Parcel parcel, ClassLoader classLoader) {
        this.mViewPagerSavedState = parcel.readParcelable(classLoader == null ? getClass().getClassLoader() : classLoader);
        this.mLayoutDirection = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.mViewPagerSavedState, i);
        parcel.writeInt(this.mLayoutDirection);
    }

    public RtlViewPager$SavedState(Parcelable parcelable, int i) {
        this.mViewPagerSavedState = parcelable;
        this.mLayoutDirection = i;
    }
}
