package X;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ihK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1252480ihK implements Serializable {
    public static final int $stable = 8;
    public String actionType;
    public String enterFromMerge;
    public String enterMethod;
    public String fromAnchorId;
    public String fromLiveModule;
    public String fromRoomId;
    public boolean isFromLive;
    public String liveEnterModule;
    public String liveFeedEnterFrom;
    public String pageUserId;
    public String roomRequestId;

    public C1252480ihK() {
        this(null, null, false, null, null, null, null, null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1252480ihK)) {
            return false;
        }
        C1252480ihK c1252480ihK = (C1252480ihK) obj;
        return Intrinsics.LJFF(this.liveEnterModule, c1252480ihK.liveEnterModule) && Intrinsics.LJFF(this.liveFeedEnterFrom, c1252480ihK.liveFeedEnterFrom) && this.isFromLive == c1252480ihK.isFromLive && Intrinsics.LJFF(this.fromRoomId, c1252480ihK.fromRoomId) && Intrinsics.LJFF(this.fromAnchorId, c1252480ihK.fromAnchorId) && Intrinsics.LJFF(this.roomRequestId, c1252480ihK.roomRequestId) && Intrinsics.LJFF(this.pageUserId, c1252480ihK.pageUserId) && Intrinsics.LJFF(this.fromLiveModule, c1252480ihK.fromLiveModule) && Intrinsics.LJFF(this.enterFromMerge, c1252480ihK.enterFromMerge) && Intrinsics.LJFF(this.enterMethod, c1252480ihK.enterMethod) && Intrinsics.LJFF(this.actionType, c1252480ihK.actionType);
    }

    public String toString() {
        return "LiveFollowReportParams(liveEnterModule=" + this.liveEnterModule + ", liveFeedEnterFrom=" + this.liveFeedEnterFrom + ", isFromLive=" + this.isFromLive + ", fromRoomId=" + this.fromRoomId + ", fromAnchorId=" + this.fromAnchorId + ", roomRequestId=" + this.roomRequestId + ", pageUserId=" + this.pageUserId + ", fromLiveModule=" + this.fromLiveModule + ", enterFromMerge=" + this.enterFromMerge + ", enterMethod=" + this.enterMethod + ", actionType=" + this.actionType + ')';
    }

    public final boolean isFromLive() {
        return this.isFromLive;
    }

    public final void setActionType(String str) {
        this.actionType = str;
    }

    public final void setEnterFromMerge(String str) {
        this.enterFromMerge = str;
    }

    public final void setEnterMethod(String str) {
        this.enterMethod = str;
    }

    public final void setFromAnchorId(String str) {
        this.fromAnchorId = str;
    }

    public final void setFromLive(boolean z) {
        this.isFromLive = z;
    }

    public final void setFromLiveModule(String str) {
        this.fromLiveModule = str;
    }

    public final void setFromRoomId(String str) {
        this.fromRoomId = str;
    }

    public final void setLiveEnterModule(String str) {
        this.liveEnterModule = str;
    }

    public final void setLiveFeedEnterFrom(String str) {
        this.liveFeedEnterFrom = str;
    }

    public final void setPageUserId(String str) {
        this.pageUserId = str;
    }

    public final void setRoomRequestId(String str) {
        this.roomRequestId = str;
    }

    public C1252480ihK(String str, String str2, boolean z, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        this.liveEnterModule = str;
        this.liveFeedEnterFrom = str2;
        this.isFromLive = z;
        this.fromRoomId = str3;
        this.fromAnchorId = str4;
        this.roomRequestId = str5;
        this.pageUserId = str6;
        this.fromLiveModule = str7;
        this.enterFromMerge = str8;
        this.enterMethod = str9;
        this.actionType = str10;
    }
}
