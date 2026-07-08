package com.bytedance.android.live.broadcast.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.live.broadcast.model.GameLiveConvertInfo;

/* JADX INFO: loaded from: classes32.dex */
public final class GameLiveConvertInfo implements Parcelable {
    public static final Parcelable.Creator<GameLiveConvertInfo> CREATOR = new Parcelable.Creator<GameLiveConvertInfo>() { // from class: X.153O
        @Override // android.os.Parcelable.Creator
        public final GameLiveConvertInfo createFromParcel(Parcel parcel) {
            return new GameLiveConvertInfo(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final GameLiveConvertInfo[] newArray(int i) {
            return new GameLiveConvertInfo[i];
        }
    };

    @C09CT("acu_type")
    public int acuType;

    @C09CT("convert_type")
    public int convertType;

    @C09CT("text")
    public String text;

    @C09CT("title")
    public String title;

    public GameLiveConvertInfo() {
        this(0, "", "", 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.convertType);
        parcel.writeString(this.title);
        parcel.writeString(this.text);
        parcel.writeInt(this.acuType);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GameLiveConvertInfo(convertType=");
        sbLIZ.append(this.convertType);
        sbLIZ.append(", title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", text=");
        sbLIZ.append(this.text);
        sbLIZ.append(", acuType=");
        sbLIZ.append(this.acuType);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public GameLiveConvertInfo(int i, String str, String str2, int i2) {
        this.convertType = i;
        this.title = str;
        this.text = str2;
        this.acuType = i2;
    }
}
