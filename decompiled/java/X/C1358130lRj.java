package X;

import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteCacheState;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lRj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1358130lRj implements InterfaceC1891350zJl {
    public final UpvoteStruct LL;
    public final VideoItemParams LLILLJJLI;
    public boolean LLILLL;
    public final UpvoteStruct LLILZ;

    public final int hashCode() {
        Object[] objArr = new Object[1];
        User user = this.LL.user;
        objArr[0] = user != null ? user.getUid() : null;
        return Objects.hash(objArr);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UpvotePanelListItem(upvote=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", detailMobParam=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", needHighlight=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", fusedCommentRepost=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean LIZ() {
        return this.LLILZ != null;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        String uid;
        String uid2;
        Integer numValueOf;
        Integer numValueOf2;
        String str;
        String str2;
        String str3;
        if (!(interfaceC1891350zJl instanceof C1358130lRj)) {
            return false;
        }
        User user = this.LL.user;
        String str4 = null;
        if (user != null) {
            uid = user.getUid();
        } else {
            uid = null;
        }
        C1358130lRj c1358130lRj = (C1358130lRj) interfaceC1891350zJl;
        User user2 = c1358130lRj.LL.user;
        if (user2 != null) {
            uid2 = user2.getUid();
        } else {
            uid2 = null;
        }
        if (!Intrinsics.LJFF(uid, uid2)) {
            return false;
        }
        User user3 = this.LL.user;
        if (user3 != null) {
            numValueOf = Integer.valueOf(user3.getFollowStatus());
        } else {
            numValueOf = null;
        }
        User user4 = c1358130lRj.LL.user;
        if (user4 != null) {
            numValueOf2 = Integer.valueOf(user4.getFollowStatus());
        } else {
            numValueOf2 = null;
        }
        if (!Intrinsics.LJFF(numValueOf, numValueOf2) || this.LL.isUserLiked() != c1358130lRj.LL.isUserLiked()) {
            return false;
        }
        UpvoteStruct upvoteStruct = this.LL;
        UpvoteCacheState upvoteCacheState = upvoteStruct.cacheState;
        UpvoteStruct upvoteStruct2 = c1358130lRj.LL;
        if (upvoteCacheState != upvoteStruct2.cacheState || !Intrinsics.LJFF(upvoteStruct.text, upvoteStruct2.text) || !Intrinsics.LJFF(this.LL.unReadAids, c1358130lRj.LL.unReadAids) || !Intrinsics.LJFF(this.LL.aiMojiSticker, c1358130lRj.LL.aiMojiSticker)) {
            return false;
        }
        UpvoteStruct upvoteStruct3 = this.LLILZ;
        if (upvoteStruct3 != null) {
            str = upvoteStruct3.upvoteId;
        } else {
            str = null;
        }
        UpvoteStruct upvoteStruct4 = c1358130lRj.LLILZ;
        if (upvoteStruct4 != null) {
            str2 = upvoteStruct4.upvoteId;
        } else {
            str2 = null;
        }
        if (!Intrinsics.LJFF(str, str2)) {
            return false;
        }
        UpvoteStruct upvoteStruct5 = this.LLILZ;
        if (upvoteStruct5 != null) {
            str3 = upvoteStruct5.text;
        } else {
            str3 = null;
        }
        UpvoteStruct upvoteStruct6 = c1358130lRj.LLILZ;
        if (upvoteStruct6 != null) {
            str4 = upvoteStruct6.text;
        }
        if (!Intrinsics.LJFF(str3, str4)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        String uid;
        if (!(interfaceC1891350zJl instanceof C1358130lRj)) {
            return false;
        }
        User user = this.LL.user;
        String uid2 = null;
        if (user != null) {
            uid = user.getUid();
        } else {
            uid = null;
        }
        User user2 = ((C1358130lRj) interfaceC1891350zJl).LL.user;
        if (user2 != null) {
            uid2 = user2.getUid();
        }
        return Intrinsics.LJFF(uid, uid2);
    }

    public final boolean equals(Object obj) {
        String uid;
        String uid2;
        Integer numValueOf;
        Integer numValueOf2;
        String str;
        if (!(obj instanceof C1358130lRj)) {
            return false;
        }
        User user = this.LL.user;
        String str2 = null;
        if (user != null) {
            uid = user.getUid();
        } else {
            uid = null;
        }
        C1358130lRj c1358130lRj = (C1358130lRj) obj;
        User user2 = c1358130lRj.LL.user;
        if (user2 != null) {
            uid2 = user2.getUid();
        } else {
            uid2 = null;
        }
        if (!Intrinsics.LJFF(uid, uid2)) {
            return false;
        }
        User user3 = this.LL.user;
        if (user3 != null) {
            numValueOf = Integer.valueOf(user3.getFollowStatus());
        } else {
            numValueOf = null;
        }
        User user4 = c1358130lRj.LL.user;
        if (user4 != null) {
            numValueOf2 = Integer.valueOf(user4.getFollowStatus());
        } else {
            numValueOf2 = null;
        }
        if (!Intrinsics.LJFF(numValueOf, numValueOf2)) {
            return false;
        }
        UpvoteStruct upvoteStruct = this.LL;
        if (upvoteStruct.cacheState != c1358130lRj.LL.cacheState || upvoteStruct.isUserLiked() != c1358130lRj.LL.isUserLiked() || LIZIZ(this.LL.text, c1358130lRj.LL.text) || !Intrinsics.LJFF(this.LL.unReadAids, c1358130lRj.LL.unReadAids) || !Intrinsics.LJFF(this.LL.aiMojiSticker, c1358130lRj.LL.aiMojiSticker)) {
            return false;
        }
        UpvoteStruct upvoteStruct2 = this.LLILZ;
        if (upvoteStruct2 != null) {
            str = upvoteStruct2.upvoteId;
        } else {
            str = null;
        }
        UpvoteStruct upvoteStruct3 = c1358130lRj.LLILZ;
        if (upvoteStruct3 != null) {
            str2 = upvoteStruct3.upvoteId;
        }
        if (!Intrinsics.LJFF(str, str2)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0050  */
    @Override // X.InterfaceC1891350zJl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getChangePayload(X.InterfaceC1891350zJl r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof X.C1358130lRj
            r7 = 0
            if (r0 != 0) goto L6
            return r7
        L6:
            X.0lRk r6 = new X.0lRk
            com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct r3 = r8.LL
            com.ss.android.ugc.aweme.feed.model.upvote.UpvoteCacheState r1 = r3.cacheState
            X.0lRj r9 = (X.C1358130lRj) r9
            com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct r2 = r9.LL
            com.ss.android.ugc.aweme.feed.model.upvote.UpvoteCacheState r0 = r2.cacheState
            r5 = 0
            if (r1 == r0) goto L5b
            r4 = 1
        L16:
            java.lang.String r1 = r3.text
            java.lang.String r0 = r2.text
            boolean r3 = LIZIZ(r1, r0)
            com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct r0 = r8.LL
            com.ss.android.ugc.aweme.feed.model.im.IMAIMojiSticker r1 = r0.aiMojiSticker
            com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct r0 = r9.LL
            com.ss.android.ugc.aweme.feed.model.im.IMAIMojiSticker r0 = r0.aiMojiSticker
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            r2 = r0 ^ 1
            com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct r0 = r8.LLILZ
            if (r0 == 0) goto L59
            java.lang.String r1 = r0.upvoteId
        L32:
            com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct r0 = r9.LLILZ
            if (r0 == 0) goto L57
            java.lang.String r0 = r0.upvoteId
        L38:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L50
            com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct r0 = r8.LLILZ
            if (r0 == 0) goto L55
            java.lang.String r1 = r0.text
        L44:
            com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct r0 = r9.LLILZ
            if (r0 == 0) goto L4a
            java.lang.String r7 = r0.text
        L4a:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r7)
            if (r0 != 0) goto L51
        L50:
            r5 = 1
        L51:
            r6.<init>(r4, r3, r2, r5)
            return r6
        L55:
            r1 = r7
            goto L44
        L57:
            r0 = r7
            goto L38
        L59:
            r1 = r7
            goto L32
        L5b:
            r4 = 0
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1358130lRj.getChangePayload(X.0zJl):java.lang.Object");
    }

    public static boolean LIZIZ(String str, String str2) {
        if ((str == null || str.length() == 0) && (str2 == null || str2.length() == 0)) {
            return false;
        }
        return !Intrinsics.LJFF(str, str2);
    }

    public C1358130lRj(UpvoteStruct upvoteStruct, VideoItemParams videoItemParams, boolean z, UpvoteStruct upvoteStruct2) {
        this.LL = upvoteStruct;
        this.LLILLJJLI = videoItemParams;
        this.LLILLL = z;
        this.LLILZ = upvoteStruct2;
    }
}
