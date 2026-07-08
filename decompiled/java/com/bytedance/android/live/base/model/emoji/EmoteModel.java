package com.bytedance.android.live.base.model.emoji;

import X.C09CT;
import X.C1115500f8O;
import X.C521760KdC;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.chatroom.api.AuditInfo;
import com.bytedance.android.livesdk.chatroom.api.EmoteUploadInfo;

/* JADX INFO: loaded from: classes8.dex */
public class EmoteModel extends C1115500f8O implements Parcelable {
    public static final Parcelable.Creator<EmoteModel> CREATOR = new C521760KdC(1);

    @C09CT("audit_info")
    public AuditInfo auditInfo;

    @C09CT("audit_status")
    public int auditStatus;

    @C09CT("content_source")
    public int contentSource;

    @C09CT("create_time")
    public long createTime;

    @C09CT("emote_id")
    public String emoteId;

    @C09CT("emote_private_type")
    public int emotePrivateType;
    public transient Drawable emoteResource;

    @C09CT("emote_scene")
    public int emoteScene;

    @C09CT("emote_type")
    public int emoteType;

    @C09CT("emote_upload_info")
    public EmoteUploadInfo emoteUploadInfo;

    @C09CT("image")
    public ImageModel image;
    public boolean inputLimited;

    @C09CT("package_id")
    public String packageId;
    public boolean readOnly;

    @C09CT("reward_condition")
    public int rewardCondition;
    public boolean shine;

    @C09CT("uuid")
    public String uuid;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public EmoteModel() {
        this.emoteId = "";
        this.uuid = "";
        this.readOnly = true;
        this.packageId = "";
    }

    public EmoteModel(Parcel parcel) {
        boolean z;
        this.emoteId = "";
        this.uuid = "";
        this.readOnly = true;
        this.packageId = "";
        this.emoteId = parcel.readString();
        this.image = (ImageModel) parcel.readParcelable(ImageModel.class.getClassLoader());
        this.auditStatus = parcel.readInt();
        this.uuid = parcel.readString();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.readOnly = z;
        this.inputLimited = parcel.readByte() != 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.emoteId);
        parcel.writeParcelable(this.image, i);
        parcel.writeInt(this.auditStatus);
        parcel.writeString(this.uuid);
        parcel.writeByte(this.readOnly ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.inputLimited ? (byte) 1 : (byte) 0);
    }
}
