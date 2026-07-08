package com.bytedance.android.live.broadcast.model;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.live.broadcast.model.BubbleMetadata;
import com.bytedance.android.live.broadcast.model.GoLiveECIconInfo;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class GoLiveECIconInfo implements Serializable, Parcelable {
    public static final Parcelable.Creator<GoLiveECIconInfo> CREATOR = new Parcelable.Creator<GoLiveECIconInfo>() { // from class: X.0Tmb
        @Override // android.os.Parcelable.Creator
        public final GoLiveECIconInfo createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            BubbleMetadata bubbleMetadataCreateFromParcel;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (parcel.readInt() != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (parcel.readInt() != 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                bubbleMetadataCreateFromParcel = null;
            } else {
                bubbleMetadataCreateFromParcel = BubbleMetadata.CREATOR.createFromParcel(parcel);
            }
            return new GoLiveECIconInfo(z, z2, z3, z4, z5, string, bubbleMetadataCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final GoLiveECIconInfo[] newArray(int i) {
            return new GoLiveECIconInfo[i];
        }
    };

    @C09CT("bubble_metadata")
    public BubbleMetadata bubbleMetadata;

    @C09CT("bubble_text")
    public String bubbleText;

    @C09CT("display_ec_icon")
    public boolean displayEcIcon;

    @C09CT("display_red_dot")
    public boolean displayRedDot;

    @C09CT("has_ec_live_permission")
    public boolean hasEcLivePermission;

    @C09CT("independent_display_ec_icon")
    public boolean independentDisplayEcIcon;

    @C09CT("old_ec_icon_logic")
    public boolean isOldRedDotLogic;

    public GoLiveECIconInfo() {
        this(false, false, false, false, false, "", null);
    }

    public final boolean component1() {
        return this.hasEcLivePermission;
    }

    public final boolean component2() {
        return this.displayEcIcon;
    }

    public final boolean component3() {
        return this.displayRedDot;
    }

    public final boolean component4() {
        return this.independentDisplayEcIcon;
    }

    public final boolean component5() {
        return this.isOldRedDotLogic;
    }

    public final String component6() {
        return this.bubbleText;
    }

    public final BubbleMetadata component7() {
        return this.bubbleMetadata;
    }

    public final GoLiveECIconInfo copy(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str, BubbleMetadata bubbleMetadata) {
        return new GoLiveECIconInfo(z, z2, z3, z4, z5, str, bubbleMetadata);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GoLiveECIconInfo)) {
            return false;
        }
        GoLiveECIconInfo goLiveECIconInfo = (GoLiveECIconInfo) obj;
        return this.hasEcLivePermission == goLiveECIconInfo.hasEcLivePermission && this.displayEcIcon == goLiveECIconInfo.displayEcIcon && this.displayRedDot == goLiveECIconInfo.displayRedDot && this.independentDisplayEcIcon == goLiveECIconInfo.independentDisplayEcIcon && this.isOldRedDotLogic == goLiveECIconInfo.isOldRedDotLogic && Intrinsics.LJFF(this.bubbleText, goLiveECIconInfo.bubbleText) && Intrinsics.LJFF(this.bubbleMetadata, goLiveECIconInfo.bubbleMetadata);
    }

    public int hashCode() {
        int iZ2 = ((((((((((C786410Ut5.Z2(this.hasEcLivePermission) * 31) + C786410Ut5.Z2(this.displayEcIcon)) * 31) + C786410Ut5.Z2(this.displayRedDot)) * 31) + C786410Ut5.Z2(this.independentDisplayEcIcon)) * 31) + C786410Ut5.Z2(this.isOldRedDotLogic)) * 31) + this.bubbleText.hashCode()) * 31;
        BubbleMetadata bubbleMetadata = this.bubbleMetadata;
        return iZ2 + (bubbleMetadata == null ? 0 : bubbleMetadata.hashCode());
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GoLiveECIconInfo(hasEcLivePermission=");
        sbLIZ.append(this.hasEcLivePermission);
        sbLIZ.append(", displayEcIcon=");
        sbLIZ.append(this.displayEcIcon);
        sbLIZ.append(", displayRedDot=");
        sbLIZ.append(this.displayRedDot);
        sbLIZ.append(", independentDisplayEcIcon=");
        sbLIZ.append(this.independentDisplayEcIcon);
        sbLIZ.append(", isOldRedDotLogic=");
        sbLIZ.append(this.isOldRedDotLogic);
        sbLIZ.append(", bubbleText=");
        sbLIZ.append(this.bubbleText);
        sbLIZ.append(", bubbleMetadata=");
        sbLIZ.append(this.bubbleMetadata);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.hasEcLivePermission ? 1 : 0);
        parcel.writeInt(this.displayEcIcon ? 1 : 0);
        parcel.writeInt(this.displayRedDot ? 1 : 0);
        parcel.writeInt(this.independentDisplayEcIcon ? 1 : 0);
        parcel.writeInt(this.isOldRedDotLogic ? 1 : 0);
        parcel.writeString(this.bubbleText);
        BubbleMetadata bubbleMetadata = this.bubbleMetadata;
        if (bubbleMetadata == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            bubbleMetadata.writeToParcel(parcel, i);
        }
    }

    public GoLiveECIconInfo(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str, BubbleMetadata bubbleMetadata) {
        this.hasEcLivePermission = z;
        this.displayEcIcon = z2;
        this.displayRedDot = z3;
        this.independentDisplayEcIcon = z4;
        this.isOldRedDotLogic = z5;
        this.bubbleText = str;
        this.bubbleMetadata = bubbleMetadata;
    }
}
