package X;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0l9e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1346920l9e implements Serializable {
    public final C1346910l9d extra;
    public final boolean forceDisableCommentPhoto;
    public final boolean forceDisableExposedEmoji;
    public final boolean forceDisableMention;
    public final boolean forceDisableReplyWithVideo;
    public final boolean forceEnableReplyWithVideo;
    public final EnumC1341680l1C initKeyboardType;
    public final EnumC1346360l8k inputServiceType;
    public final boolean isClickFromGuideReplyUser;
    public final boolean isLandScapeMode;
    public final int openKeyboardType;
    public String postMethod;
    public final boolean slotByNewWindowContainer;

    public C1346920l9e() {
        this(false, false, false, false, false, false, null, 0, EnumC1341680l1C.TEXT, false, null, false);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1346920l9e)) {
            return false;
        }
        C1346920l9e c1346920l9e = (C1346920l9e) obj;
        return this.forceDisableCommentPhoto == c1346920l9e.forceDisableCommentPhoto && this.isLandScapeMode == c1346920l9e.isLandScapeMode && this.forceDisableReplyWithVideo == c1346920l9e.forceDisableReplyWithVideo && this.forceEnableReplyWithVideo == c1346920l9e.forceEnableReplyWithVideo && this.forceDisableExposedEmoji == c1346920l9e.forceDisableExposedEmoji && this.forceDisableMention == c1346920l9e.forceDisableMention && this.inputServiceType == c1346920l9e.inputServiceType && this.openKeyboardType == c1346920l9e.openKeyboardType && this.initKeyboardType == c1346920l9e.initKeyboardType && this.slotByNewWindowContainer == c1346920l9e.slotByNewWindowContainer && Intrinsics.LJFF(this.extra, c1346920l9e.extra) && this.isClickFromGuideReplyUser == c1346920l9e.isClickFromGuideReplyUser;
    }

    public String toString() {
        return "CommentKeyboardConfig(forceDisableCommentPhoto=" + this.forceDisableCommentPhoto + ", isLandScapeMode=" + this.isLandScapeMode + ", forceDisableReplyWithVideo=" + this.forceDisableReplyWithVideo + ", forceEnableReplyWithVideo=" + this.forceEnableReplyWithVideo + ", forceDisableExposedEmoji=" + this.forceDisableExposedEmoji + ", forceDisableMention=" + this.forceDisableMention + ", inputServiceType=" + this.inputServiceType + ", openKeyboardType=" + this.openKeyboardType + ", initKeyboardType=" + this.initKeyboardType + ", slotByNewWindowContainer=" + this.slotByNewWindowContainer + ", extra=" + this.extra + ", isClickFromGuideReplyUser=" + this.isClickFromGuideReplyUser + ')';
    }

    public final boolean isClickFromGuideReplyUser() {
        return this.isClickFromGuideReplyUser;
    }

    public final boolean isLandScapeMode() {
        return this.isLandScapeMode;
    }

    public final void setPostMethod(String str) {
        this.postMethod = str;
    }

    public C1346920l9e(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, EnumC1346360l8k enumC1346360l8k, int i, EnumC1341680l1C enumC1341680l1C, boolean z7, C1346910l9d c1346910l9d, boolean z8) {
        this.forceDisableCommentPhoto = z;
        this.isLandScapeMode = z2;
        this.forceDisableReplyWithVideo = z3;
        this.forceEnableReplyWithVideo = z4;
        this.forceDisableExposedEmoji = z5;
        this.forceDisableMention = z6;
        this.inputServiceType = enumC1346360l8k;
        this.openKeyboardType = i;
        this.initKeyboardType = enumC1341680l1C;
        this.slotByNewWindowContainer = z7;
        this.extra = c1346910l9d;
        this.isClickFromGuideReplyUser = z8;
    }
}
