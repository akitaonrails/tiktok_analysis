package com.bytedance.android.live.liveinteract.multiguestv3.model;

import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.live.liveinteract.multiguestv3.model.PreviewPageActivePlaybook;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public final class PreviewPageActivePlaybook implements Parcelable {
    public static final Parcelable.Creator<PreviewPageActivePlaybook> CREATOR = new Parcelable.Creator<PreviewPageActivePlaybook>() { // from class: X.14q7
        @Override // android.os.Parcelable.Creator
        public final PreviewPageActivePlaybook createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            long j = parcel.readLong();
            long j2 = parcel.readLong();
            long j3 = parcel.readLong();
            String string = parcel.readString();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            return new PreviewPageActivePlaybook(j, j2, j3, string, z, string2, string3, z2, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PreviewPageActivePlaybook[] newArray(int i) {
            return new PreviewPageActivePlaybook[i];
        }
    };
    public final String autoApplyType;
    public final boolean existsCustomContent;
    public final String flowStr;
    public final String from;
    public final long originalPlaybookContentId;
    public final String panelEntrance;
    public final String panelPage;
    public final long playbookContentId;
    public final long playbookId;
    public final boolean previewStartIsActivityFrom;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PreviewPageActivePlaybook)) {
            return false;
        }
        PreviewPageActivePlaybook previewPageActivePlaybook = (PreviewPageActivePlaybook) obj;
        return this.playbookId == previewPageActivePlaybook.playbookId && this.playbookContentId == previewPageActivePlaybook.playbookContentId && this.originalPlaybookContentId == previewPageActivePlaybook.originalPlaybookContentId && Intrinsics.LJFF(this.flowStr, previewPageActivePlaybook.flowStr) && this.existsCustomContent == previewPageActivePlaybook.existsCustomContent && Intrinsics.LJFF(this.from, previewPageActivePlaybook.from) && Intrinsics.LJFF(this.autoApplyType, previewPageActivePlaybook.autoApplyType) && this.previewStartIsActivityFrom == previewPageActivePlaybook.previewStartIsActivityFrom && Intrinsics.LJFF(this.panelPage, previewPageActivePlaybook.panelPage) && Intrinsics.LJFF(this.panelEntrance, previewPageActivePlaybook.panelEntrance);
    }

    public final int hashCode() {
        return (((((((((((((((((C786410Ut5.Y2(this.playbookId) * 31) + C786410Ut5.Y2(this.playbookContentId)) * 31) + C786410Ut5.Y2(this.originalPlaybookContentId)) * 31) + this.flowStr.hashCode()) * 31) + C786410Ut5.Z2(this.existsCustomContent)) * 31) + this.from.hashCode()) * 31) + this.autoApplyType.hashCode()) * 31) + C786410Ut5.Z2(this.previewStartIsActivityFrom)) * 31) + this.panelPage.hashCode()) * 31) + this.panelEntrance.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PreviewPageActivePlaybook(playbookId=");
        sbLIZ.append(this.playbookId);
        sbLIZ.append(", playbookContentId=");
        sbLIZ.append(this.playbookContentId);
        sbLIZ.append(", originalPlaybookContentId=");
        sbLIZ.append(this.originalPlaybookContentId);
        sbLIZ.append(", flowStr=");
        sbLIZ.append(this.flowStr);
        sbLIZ.append(", existsCustomContent=");
        sbLIZ.append(this.existsCustomContent);
        sbLIZ.append(", from=");
        sbLIZ.append(this.from);
        sbLIZ.append(", autoApplyType=");
        sbLIZ.append(this.autoApplyType);
        sbLIZ.append(", previewStartIsActivityFrom=");
        sbLIZ.append(this.previewStartIsActivityFrom);
        sbLIZ.append(", panelPage=");
        sbLIZ.append(this.panelPage);
        sbLIZ.append(", panelEntrance=");
        sbLIZ.append(this.panelEntrance);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.playbookId);
        parcel.writeLong(this.playbookContentId);
        parcel.writeLong(this.originalPlaybookContentId);
        parcel.writeString(this.flowStr);
        parcel.writeInt(this.existsCustomContent ? 1 : 0);
        parcel.writeString(this.from);
        parcel.writeString(this.autoApplyType);
        parcel.writeInt(this.previewStartIsActivityFrom ? 1 : 0);
        parcel.writeString(this.panelPage);
        parcel.writeString(this.panelEntrance);
    }

    public PreviewPageActivePlaybook(long j, long j2, long j3, String str, boolean z, String str2, String str3, boolean z2, String str4, String str5) {
        this.playbookId = j;
        this.playbookContentId = j2;
        this.originalPlaybookContentId = j3;
        this.flowStr = str;
        this.existsCustomContent = z;
        this.from = str2;
        this.autoApplyType = str3;
        this.previewStartIsActivityFrom = z2;
        this.panelPage = str4;
        this.panelEntrance = str5;
    }
}
