package com.bytedance.android.live.broadcast.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.live.broadcast.model.BubbleMetadata;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class BubbleMetadata implements Serializable, Parcelable {
    public static final Parcelable.Creator<BubbleMetadata> CREATOR = new Parcelable.Creator<BubbleMetadata>() { // from class: X.0Tma
        @Override // android.os.Parcelable.Creator
        public final BubbleMetadata createFromParcel(Parcel parcel) {
            return new BubbleMetadata(parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final BubbleMetadata[] newArray(int i) {
            return new BubbleMetadata[i];
        }
    };

    @C09CT("live_task_id")
    public String liveTaskId;

    @C09CT("live_task_status")
    public int liveTaskStatus;

    public BubbleMetadata() {
        this(null, 0);
    }

    public final String component1() {
        return this.liveTaskId;
    }

    public final int component2() {
        return this.liveTaskStatus;
    }

    public final BubbleMetadata copy(String str, int i) {
        return new BubbleMetadata(str, i);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BubbleMetadata)) {
            return false;
        }
        BubbleMetadata bubbleMetadata = (BubbleMetadata) obj;
        return Intrinsics.LJFF(this.liveTaskId, bubbleMetadata.liveTaskId) && this.liveTaskStatus == bubbleMetadata.liveTaskStatus;
    }

    public int hashCode() {
        String str = this.liveTaskId;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.liveTaskStatus;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BubbleMetadata(liveTaskId=");
        sbLIZ.append(this.liveTaskId);
        sbLIZ.append(", liveTaskStatus=");
        sbLIZ.append(this.liveTaskStatus);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.liveTaskId);
        parcel.writeInt(this.liveTaskStatus);
    }

    public BubbleMetadata(String str, int i) {
        this.liveTaskId = str;
        this.liveTaskStatus = i;
    }
}
