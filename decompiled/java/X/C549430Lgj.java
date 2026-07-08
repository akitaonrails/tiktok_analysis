package X;

import com.ss.android.ugc.aweme.feed.model.AITheaterInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CameoInfo;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.theater.model.AITheaterConsumptionModel;
import java.util.List;

/* JADX INFO: renamed from: X.0Lgj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C549430Lgj {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List<java.lang.String> LIZ(java.util.List<com.ss.android.ugc.aweme.feed.model.CameoInfo> r6) {
        /*
            if (r6 == 0) goto Ld
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto Ld
            r0 = 0
        L9:
            r4 = 0
            if (r0 == 0) goto Lf
            return r4
        Ld:
            r0 = 1
            goto L9
        Lf:
            java.util.ArrayList r3 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C15438062q.LJIJJ(r6, r0)
            r3.<init>(r0)
            java.util.Iterator r6 = r6.iterator()
        L1e:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto Lc0
            java.lang.Object r5 = r6.next()
            com.ss.android.ugc.aweme.feed.model.CameoInfo r5 = (com.ss.android.ugc.aweme.feed.model.CameoInfo) r5
            if (r5 == 0) goto L7c
            com.ss.android.ugc.aweme.feed.model.CameoAssetInfo r0 = r5.getCameoAssetInfo()
            if (r0 == 0) goto L70
            java.lang.Boolean r1 = r0.isVirtual()
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L6e
            java.lang.StringBuilder r2 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "virtual_"
            r2.append(r0)
            com.ss.android.ugc.aweme.feed.model.UserBaseInfo r0 = r5.getUserBaseInfo()
            if (r0 == 0) goto L6c
            java.lang.String r1 = r0.getNickname()
            if (r1 == 0) goto L6c
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r0 = r1.toLowerCase(r0)
        L59:
            r2.append(r0)
            java.lang.String r2 = X.C2188811AlT.LIZIZ(r2)
            kotlin.text.Regex r1 = X.C549450Lgl.LIZ
            java.lang.String r0 = "_"
            java.lang.String r0 = r1.replace(r2, r0)
        L68:
            r3.add(r0)
            goto L1e
        L6c:
            r0 = r4
            goto L59
        L6e:
            if (r5 == 0) goto L7c
        L70:
            com.ss.android.ugc.aweme.feed.model.UserBaseInfo r0 = r5.getUserBaseInfo()
            if (r0 == 0) goto L7c
            java.lang.String r2 = r0.getUserId()
            if (r2 != 0) goto L7e
        L7c:
            java.lang.String r2 = ""
        L7e:
            X.1Ds4 r0 = X.C0CHQ.LIZ()
            X.0o1f r0 = r0.getAccountService()
            X.10dm r0 = r0.getCurrentUser()
            if (r0 == 0) goto L99
            java.lang.String r0 = r0.getUid()
        L90:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r0)
            if (r0 == 0) goto L9b
            java.lang.String r0 = "self"
            goto L68
        L99:
            r0 = r4
            goto L90
        L9b:
            X.069P r0 = com.ss.android.ugc.aweme.im.contacts.api.IMContactApi.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.im.contacts.api.IMContactApi r0 = X.C069P.LIZ()
            X.1BGS r1 = r0.LJ()
            java.lang.String r0 = "im_chat"
            com.ss.android.ugc.aweme.im.contacts.api.model.IMUser r0 = r1.LIZLLL(r2, r4, r0)
            if (r0 == 0) goto Lbb
            X.0ljr r1 = r0.getRelationship()
        Lb4:
            X.0ljr r0 = X.EnumC1369370ljr.FRIENDS
            if (r1 != r0) goto Lbd
            java.lang.String r0 = "friends"
            goto L68
        Lbb:
            r1 = r4
            goto Lb4
        Lbd:
            java.lang.String r0 = "else"
            goto L68
        Lc0:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C549430Lgj.LIZ(java.util.List):java.util.List");
    }

    public static final AITheaterConsumptionModel LIZIZ(Aweme aweme) {
        List<CameoInfo> cameoInfo;
        String taskId;
        String rootItemId;
        String str;
        String uid;
        Integer numValueOf;
        String promptText;
        Boolean boolIsRefImage;
        List<CameoInfo> cameoInfo2;
        String strLJJLIIIJ;
        Boolean boolValueOf;
        VideoUrlModel playAddr;
        List<String> urlList;
        AITheaterInfo aITheaterInfo = aweme.aiTheaterInfo;
        String castFaceSel = null;
        if (aITheaterInfo != null) {
            cameoInfo = aITheaterInfo.getCameoInfo();
        } else {
            cameoInfo = null;
        }
        AITheaterInfo aITheaterInfo2 = aweme.aiTheaterInfo;
        if (aITheaterInfo2 != null) {
            taskId = aITheaterInfo2.getTaskId();
        } else {
            taskId = null;
        }
        AITheaterInfo aITheaterInfo3 = aweme.aiTheaterInfo;
        if (aITheaterInfo3 != null) {
            rootItemId = aITheaterInfo3.getRootItemId();
        } else {
            rootItemId = null;
        }
        String aid = aweme.getAid();
        Video video = aweme.getVideo();
        if (video != null && (playAddr = video.getPlayAddr()) != null && (urlList = playAddr.getUrlList()) != null) {
            str = (String) C13LP.LJJJLL(urlList);
        } else {
            str = null;
        }
        User author = aweme.getAuthor();
        if (author != null) {
            uid = author.getUid();
        } else {
            uid = null;
        }
        User author2 = aweme.getAuthor();
        if (author2 != null) {
            numValueOf = Integer.valueOf(author2.getFollowStatus());
        } else {
            numValueOf = null;
        }
        AITheaterInfo aITheaterInfo4 = aweme.aiTheaterInfo;
        if (aITheaterInfo4 != null) {
            promptText = aITheaterInfo4.getPromptText();
        } else {
            promptText = null;
        }
        AITheaterInfo aITheaterInfo5 = aweme.aiTheaterInfo;
        if (aITheaterInfo5 != null) {
            boolIsRefImage = aITheaterInfo5.isRefImage();
        } else {
            boolIsRefImage = null;
        }
        AITheaterInfo aITheaterInfo6 = aweme.aiTheaterInfo;
        if (aITheaterInfo6 != null) {
            cameoInfo2 = aITheaterInfo6.getCameoInfo();
        } else {
            cameoInfo2 = null;
        }
        List<String> listLIZ = LIZ(cameoInfo2);
        if (listLIZ != null) {
            strLJJLIIIJ = C13LP.LJJLIIIJ(listLIZ, ",", null, null, 0, null, null, 62);
        } else {
            strLJJLIIIJ = null;
        }
        Video video2 = aweme.getVideo();
        if (video2 != null) {
            boolValueOf = Boolean.valueOf(video2.isNeedSetCookie());
        } else {
            boolValueOf = null;
        }
        AITheaterInfo aITheaterInfo7 = aweme.aiTheaterInfo;
        if (aITheaterInfo7 != null) {
            castFaceSel = aITheaterInfo7.getCastFaceSel();
        }
        return new AITheaterConsumptionModel(cameoInfo, taskId, str, aid, rootItemId, uid, numValueOf, promptText, strLJJLIIIJ, boolIsRefImage, boolValueOf, castFaceSel);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x012e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.ss.android.ugc.aweme.theater.model.AITheaterContextModel LIZJ(com.ss.android.ugc.aweme.aikit.api.common.AIGCDraft r35) {
        /*
            Method dump skipped, instruction units count: 555
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C549430Lgj.LIZJ(com.ss.android.ugc.aweme.aikit.api.common.AIGCDraft):com.ss.android.ugc.aweme.theater.model.AITheaterContextModel");
    }
}
