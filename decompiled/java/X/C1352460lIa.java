package X;

import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.now.NowPostAttributes;
import com.ss.android.ugc.aweme.now.NowPostInfo;
import com.ss.android.ugc.now.interaction.NowFeedMobHierarchyData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lIa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1352460lIa implements InterfaceC111300bX {
    public final Aweme LL;
    public final String LLILLJJLI;
    public boolean LLILLL;
    public Comment LLILZ;
    public final NowFeedMobHierarchyData LLILZIL;
    public String LLILZLL;
    public final int LLIZ;

    public C1352460lIa() {
        this(null, null, false, null, null, null, 127);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1352460lIa)) {
            return false;
        }
        C1352460lIa c1352460lIa = (C1352460lIa) obj;
        return Intrinsics.LJFF(this.LL, c1352460lIa.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1352460lIa.LLILLJJLI) && this.LLILLL == c1352460lIa.LLILLL && Intrinsics.LJFF(this.LLILZ, c1352460lIa.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1352460lIa.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1352460lIa.LLILZLL) && this.LLIZ == c1352460lIa.LLIZ;
    }

    public final int hashCode() {
        Aweme aweme = this.LL;
        int iHashCode = (aweme == null ? 0 : aweme.hashCode()) * 31;
        String str = this.LLILLJJLI;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31;
        Comment comment = this.LLILZ;
        int iHashCode3 = (iHashCode2 + (comment == null ? 0 : comment.hashCode())) * 31;
        NowFeedMobHierarchyData nowFeedMobHierarchyData = this.LLILZIL;
        int iHashCode4 = (iHashCode3 + (nowFeedMobHierarchyData == null ? 0 : nowFeedMobHierarchyData.hashCode())) * 31;
        String str2 = this.LLILZLL;
        return ((iHashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.LLIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CommentListInitData(aweme=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", insertCid=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", showKeyboard=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", replyComment=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", interactionHierarchyData=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", enterMethod=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", hasSmallWindow=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1352460lIa(Aweme aweme, String str, boolean z, Comment comment, NowFeedMobHierarchyData nowFeedMobHierarchyData, String str2, int i) {
        NowPostInfo nowPostInfo;
        NowPostAttributes nowPostAttributes;
        aweme = (i & 1) != 0 ? null : aweme;
        str = (i & 2) != 0 ? null : str;
        int i2 = 0;
        z = (i & 4) != 0 ? false : z;
        comment = (i & 8) != 0 ? null : comment;
        nowFeedMobHierarchyData = (i & 16) != 0 ? null : nowFeedMobHierarchyData;
        str2 = (i & 32) != 0 ? null : str2;
        if ((i & 64) != 0 && aweme != null && (nowPostInfo = aweme.nowPostInfo) != null && (nowPostAttributes = nowPostInfo.attributes) != null && nowPostAttributes.nowPostCameraType == 0) {
            i2 = 1;
        }
        this.LL = aweme;
        this.LLILLJJLI = str;
        this.LLILLL = z;
        this.LLILZ = comment;
        this.LLILZIL = nowFeedMobHierarchyData;
        this.LLILZLL = str2;
        this.LLIZ = i2;
    }
}
