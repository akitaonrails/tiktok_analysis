package X;

import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lRT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1357970lRT extends C1358220lRs {
    public final UpvoteStruct LLILZIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1357970lRT) && Intrinsics.LJFF(this.LLILZIL, ((C1357970lRT) obj).LLILZIL);
    }

    public final int hashCode() {
        return this.LLILZIL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RepostNormalItem(repost=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1357970lRT(com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct r13) {
        /*
            r12 = this;
            java.lang.String r2 = r13.upvoteId
            com.ss.android.ugc.aweme.feed.model.upvote.UpvoteCacheState r0 = r13.cacheState
            if (r0 == 0) goto L38
            int[] r1 = X.C1357830lRF.LIZ
            int r0 = r0.ordinal()
            r1 = r1[r0]
            r0 = 1
            if (r1 == r0) goto L35
            r0 = 2
            if (r1 != r0) goto L38
            X.0bvQ r11 = X.EnumC992140bvQ.FAILED
        L16:
            X.0lRu r3 = new X.0lRu
            com.ss.android.ugc.aweme.profile.model.User r4 = r13.user
            boolean r5 = r13.isUserLiked()
            int r6 = r13.likeCount
            java.lang.String r7 = X.C1359720lUI.LIZLLL(r13)
            if (r7 != 0) goto L28
            java.lang.String r7 = ""
        L28:
            java.util.List<? extends com.ss.android.ugc.aweme.model.TextExtraStruct> r8 = r13.textExtra
            long r9 = r13.createTime
            r3.<init>(r4, r5, r6, r7, r8, r9, r11)
            r12.<init>(r2, r13, r3)
            r12.LLILZIL = r13
            return
        L35:
            X.0bvQ r11 = X.EnumC992140bvQ.START
            goto L16
        L38:
            X.0bvQ r11 = X.EnumC992140bvQ.SUCCESS
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1357970lRT.<init>(com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct):void");
    }

    @Override // X.C1358220lRs
    public final boolean LIZ(C1358220lRs c1358220lRs) {
        String uid;
        if (c1358220lRs instanceof C1357970lRT) {
            User user = this.LLILZIL.user;
            String uid2 = null;
            if (user != null) {
                uid = user.getUid();
            } else {
                uid = null;
            }
            User user2 = ((C1357970lRT) c1358220lRs).LLILZIL.user;
            if (user2 != null) {
                uid2 = user2.getUid();
            }
            if (Intrinsics.LJFF(uid, uid2)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.C1358220lRs, X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        String uid;
        if (interfaceC1891350zJl instanceof C1357970lRT) {
            User user = this.LLILZIL.user;
            String uid2 = null;
            if (user != null) {
                uid = user.getUid();
            } else {
                uid = null;
            }
            User user2 = ((C1357970lRT) interfaceC1891350zJl).LLILZIL.user;
            if (user2 != null) {
                uid2 = user2.getUid();
            }
            if (Intrinsics.LJFF(uid, uid2)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
