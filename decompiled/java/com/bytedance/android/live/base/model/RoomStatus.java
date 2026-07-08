package com.bytedance.android.live.base.model;

import X.C521760KdC;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class RoomStatus implements Parcelable {
    public static final Parcelable.Creator<RoomStatus> CREATOR = new C521760KdC(0);
    public long anchorId;
    public int countOfWatchUsers;
    public boolean isFinish;
    public long roomId;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public RoomStatus() {
    }

    public RoomStatus(Parcel parcel) {
        boolean z;
        this.roomId = parcel.readLong();
        this.anchorId = parcel.readLong();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.isFinish = z;
        this.countOfWatchUsers = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.roomId);
        parcel.writeLong(this.anchorId);
        parcel.writeByte(this.isFinish ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.countOfWatchUsers);
    }
}
