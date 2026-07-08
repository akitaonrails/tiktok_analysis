package X;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Q2v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@InterfaceC1294060jmO
public final class C664030Q2v implements Serializable {
    public final String authorId;
    public final String groupId;
    public final Boolean isFeedCollected;
    public final Boolean isFeedCommentClicked;
    public final Boolean isFeedForwardClicked;
    public final Boolean isFeedLiked;

    public C664030Q2v() {
        this(null, null, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C664030Q2v)) {
            return false;
        }
        C664030Q2v c664030Q2v = (C664030Q2v) obj;
        return Intrinsics.LJFF(this.authorId, c664030Q2v.authorId) && Intrinsics.LJFF(this.groupId, c664030Q2v.groupId) && Intrinsics.LJFF(this.isFeedLiked, c664030Q2v.isFeedLiked) && Intrinsics.LJFF(this.isFeedCollected, c664030Q2v.isFeedCollected) && Intrinsics.LJFF(this.isFeedCommentClicked, c664030Q2v.isFeedCommentClicked) && Intrinsics.LJFF(this.isFeedForwardClicked, c664030Q2v.isFeedForwardClicked);
    }

    public int hashCode() {
        String str = this.authorId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.groupId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.isFeedLiked;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isFeedCollected;
        int iHashCode4 = (iHashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isFeedCommentClicked;
        int iHashCode5 = (iHashCode4 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.isFeedForwardClicked;
        return iHashCode5 + (bool4 != null ? bool4.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchVideoModel(authorId=");
        sbLIZ.append(this.authorId);
        sbLIZ.append(", groupId=");
        sbLIZ.append(this.groupId);
        sbLIZ.append(", isFeedLiked=");
        sbLIZ.append(this.isFeedLiked);
        sbLIZ.append(", isFeedCollected=");
        sbLIZ.append(this.isFeedCollected);
        sbLIZ.append(", isFeedCommentClicked=");
        sbLIZ.append(this.isFeedCommentClicked);
        sbLIZ.append(", isFeedForwardClicked=");
        sbLIZ.append(this.isFeedForwardClicked);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final Boolean isFeedCollected() {
        return this.isFeedCollected;
    }

    public final Boolean isFeedCommentClicked() {
        return this.isFeedCommentClicked;
    }

    public final Boolean isFeedForwardClicked() {
        return this.isFeedForwardClicked;
    }

    public final Boolean isFeedLiked() {
        return this.isFeedLiked;
    }

    public C664030Q2v(String str, String str2, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
        this.authorId = str;
        this.groupId = str2;
        this.isFeedLiked = bool;
        this.isFeedCollected = bool2;
        this.isFeedCommentClicked = bool3;
        this.isFeedForwardClicked = bool4;
    }
}
