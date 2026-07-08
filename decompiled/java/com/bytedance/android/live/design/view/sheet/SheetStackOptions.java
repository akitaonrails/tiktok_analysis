package com.bytedance.android.live.design.view.sheet;

import X.C1864730ycp;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes28.dex */
public final class SheetStackOptions implements Parcelable {
    public static final Parcelable.Creator<SheetStackOptions> CREATOR = new C1864730ycp(4);
    public int dimBehindType;
    public boolean vshotExposeDetectEnabled;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public SheetStackOptions() {
    }

    public SheetStackOptions(Parcel parcel) {
        boolean z;
        this.dimBehindType = parcel.readInt();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.vshotExposeDetectEnabled = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        if (parcel == null) {
            return;
        }
        parcel.writeInt(this.dimBehindType);
        parcel.writeByte(this.vshotExposeDetectEnabled ? (byte) 1 : (byte) 0);
    }
}
