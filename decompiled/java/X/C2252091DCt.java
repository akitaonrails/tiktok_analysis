package X;

import java.io.Serializable;

/* JADX INFO: renamed from: X.1DCt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2252091DCt implements Serializable {
    public static final int $stable = 8;
    public boolean bigScreenPlay;
    public Long bigScreenPlayTimeStamp;
    public boolean clickComment;
    public Long clickCommentTimeStamp;
    public boolean digg;
    public Long diggTimeStamp;
    public boolean download;
    public Long downloadTimeStamp;
    public boolean enterUser;
    public Long enterUserTimeStamp;
    public boolean favorite;
    public Long favoriteTimeStamp;
    public boolean follow;
    public Long followTimeStamp;
    public boolean playFinish;
    public Long playFinishTimeStamp;
    public boolean postComment;
    public Long postCommentTimeStamp;
    public boolean share;
    public Long shareTimeStamp;

    public C2252091DCt() {
        this(false, null, false, null, false, null, false, null, false, null, false, null, false, null, false, null, false, null, false, null);
    }

    public final void setBigScreenPlay(boolean z) {
        this.bigScreenPlay = z;
    }

    public final void setBigScreenPlayTimeStamp(Long l) {
        this.bigScreenPlayTimeStamp = l;
    }

    public final void setClickComment(boolean z) {
        this.clickComment = z;
    }

    public final void setClickCommentTimeStamp(Long l) {
        this.clickCommentTimeStamp = l;
    }

    public final void setDigg(boolean z) {
        this.digg = z;
    }

    public final void setDiggTimeStamp(Long l) {
        this.diggTimeStamp = l;
    }

    public final void setDownload(boolean z) {
        this.download = z;
    }

    public final void setDownloadTimeStamp(Long l) {
        this.downloadTimeStamp = l;
    }

    public final void setEnterUser(boolean z) {
        this.enterUser = z;
    }

    public final void setEnterUserTimeStamp(Long l) {
        this.enterUserTimeStamp = l;
    }

    public final void setFavorite(boolean z) {
        this.favorite = z;
    }

    public final void setFavoriteTimeStamp(Long l) {
        this.favoriteTimeStamp = l;
    }

    public final void setFollow(boolean z) {
        this.follow = z;
    }

    public final void setFollowTimeStamp(Long l) {
        this.followTimeStamp = l;
    }

    public final void setPlayFinish(boolean z) {
        this.playFinish = z;
    }

    public final void setPlayFinishTimeStamp(Long l) {
        this.playFinishTimeStamp = l;
    }

    public final void setPostComment(boolean z) {
        this.postComment = z;
    }

    public final void setPostCommentTimeStamp(Long l) {
        this.postCommentTimeStamp = l;
    }

    public final void setShare(boolean z) {
        this.share = z;
    }

    public final void setShareTimeStamp(Long l) {
        this.shareTimeStamp = l;
    }

    public C2252091DCt(boolean z, Long l, boolean z2, Long l2, boolean z3, Long l3, boolean z4, Long l4, boolean z5, Long l5, boolean z6, Long l6, boolean z7, Long l7, boolean z8, Long l8, boolean z9, Long l9, boolean z10, Long l10) {
        this.clickComment = z;
        this.clickCommentTimeStamp = l;
        this.digg = z2;
        this.diggTimeStamp = l2;
        this.playFinish = z3;
        this.playFinishTimeStamp = l3;
        this.share = z4;
        this.shareTimeStamp = l4;
        this.enterUser = z5;
        this.enterUserTimeStamp = l5;
        this.favorite = z6;
        this.favoriteTimeStamp = l6;
        this.bigScreenPlay = z7;
        this.bigScreenPlayTimeStamp = l7;
        this.follow = z8;
        this.followTimeStamp = l8;
        this.postComment = z9;
        this.postCommentTimeStamp = l9;
        this.download = z10;
        this.downloadTimeStamp = l10;
    }
}
