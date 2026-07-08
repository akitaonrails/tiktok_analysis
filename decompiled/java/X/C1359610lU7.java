package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.InteractPermission;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteList;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0lU7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1359610lU7 {
    public static final boolean LJFF(Aweme aweme) {
        InteractPermission interactPermission;
        List<UpvoteStruct> list;
        boolean z = false;
        if (aweme.getAid() == null || (interactPermission = aweme.getInteractPermission()) == null || interactPermission.getUpvote() != 0) {
            return false;
        }
        C1360460lVU c1360460lVU = C1360460lVU.LIZIZ;
        String aid = aweme.getAid();
        if (aid == null) {
            aid = "";
        }
        UpvoteList upvoteListLJIIIIZZ = c1360460lVU.LJIIIIZZ(aid);
        if (upvoteListLJIIIIZZ == null || (list = upvoteListLJIIIIZZ.upvotes) == null || list.isEmpty()) {
            z = true;
        }
        return !z;
    }

    public static final void LIZ(Aweme aweme, AbstractC1386130mAt abstractC1386130mAt) {
        String aid;
        List<UpvoteStruct> list;
        String uid;
        C1360460lVU c1360460lVU = C1360460lVU.LIZIZ;
        String str = "";
        if (aweme == null || (aid = aweme.getAid()) == null) {
            aid = "";
        }
        UpvoteList upvoteListLJIIIIZZ = c1360460lVU.LJIIIIZZ(aid);
        if (upvoteListLJIIIIZZ != null && (list = upvoteListLJIIIIZZ.upvotes) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<UpvoteStruct> it2 = list.iterator();
            while (it2.hasNext()) {
                User user = it2.next().user;
                if (user != null && (uid = user.getUid()) != null) {
                    arrayList.add(uid);
                }
            }
            String strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62);
            if (strLJJLIIIJ != null) {
                str = strLJJLIIIJ;
            }
        }
        abstractC1386130mAt.LJ("repost_uid_str", str);
    }

    public static final AbstractC1386130mAt LIZIZ(Aweme aweme, AbstractC1386130mAt abstractC1386130mAt) {
        InteractPermission interactPermission;
        String str;
        String str2;
        String str3;
        if (aweme != null && aweme.getAid() != null && (interactPermission = aweme.getInteractPermission()) != null && interactPermission.getUpvote() == 0) {
            C1359620lU8 c1359620lU8LJI = LJI(aweme.getAid(), null);
            String str4 = "1";
            if (c1359620lU8LJI.LIZ) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            abstractC1386130mAt.getClass();
            C2082308Dt c2082308Dt = InterfaceC1210900hcG.LIZ;
            abstractC1386130mAt.LJFF("is_recommend", str, c2082308Dt);
            if (c1359620lU8LJI.LIZIZ) {
                str2 = "1";
            } else {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            abstractC1386130mAt.LJFF("is_repost_reply", str2, c2082308Dt);
            abstractC1386130mAt.LIZLLL(c1359620lU8LJI.LIZJ, "recommend_cnt");
            if (c1359620lU8LJI.LIZLLL) {
                str3 = "1";
            } else {
                str3 = CardStruct.IStatusCode.DEFAULT;
            }
            abstractC1386130mAt.LJFF("is_self", str3, c2082308Dt);
            if (!c1359620lU8LJI.LJ) {
                str4 = CardStruct.IStatusCode.DEFAULT;
            }
            abstractC1386130mAt.LJFF("with_recommendation", str4, c2082308Dt);
            abstractC1386130mAt.LIZLLL(c1359620lU8LJI.LJFF, "is_muf_to_reposter");
            abstractC1386130mAt.LIZLLL(c1359620lU8LJI.LJI, "is_follow_to_reposter");
            abstractC1386130mAt.LIZLLL(c1359620lU8LJI.LJII, "is_maf_to_reposter");
            abstractC1386130mAt.LIZLLL(c1359620lU8LJI.LJIIIIZZ, "is_unfollow_to_reposter");
            LIZ(aweme, abstractC1386130mAt);
            return abstractC1386130mAt;
        }
        return abstractC1386130mAt;
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C1359620lU8 LJI(java.lang.String r15, java.lang.String r16) {
        /*
            Method dump skipped, instruction units count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1359610lU7.LJI(java.lang.String, java.lang.String):X.0lU8");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZLLL(java.lang.Integer r9, java.lang.String r10, org.json.JSONObject r11) throws org.json.JSONException {
        /*
            if (r9 == 0) goto La7
            int r0 = r9.intValue()
            if (r0 != 0) goto La7
            r5 = 0
            X.0lU8 r2 = LJI(r10, r5)
            boolean r0 = r2.LIZ
            java.lang.String r3 = "1"
            java.lang.String r4 = "0"
            if (r0 == 0) goto L8f
            r1 = r3
        L16:
            java.lang.String r0 = "is_recommend"
            r11.put(r0, r1)
            boolean r0 = r2.LIZIZ
            if (r0 == 0) goto L8d
            r1 = r3
        L20:
            java.lang.String r0 = "is_repost_reply"
            r11.put(r0, r1)
            java.lang.String r1 = "recommend_cnt"
            int r0 = r2.LIZJ
            r11.put(r1, r0)
            boolean r0 = r2.LIZLLL
            if (r0 == 0) goto L8b
            r1 = r3
        L31:
            java.lang.String r0 = "is_self"
            r11.put(r0, r1)
            boolean r0 = r2.LJ
            if (r0 != 0) goto L3b
            r3 = r4
        L3b:
            java.lang.String r0 = "with_recommendation"
            r11.put(r0, r3)
            java.lang.String r1 = "is_muf_to_reposter"
            int r0 = r2.LJFF
            r11.put(r1, r0)
            java.lang.String r1 = "is_follow_to_reposter"
            int r0 = r2.LJI
            r11.put(r1, r0)
            java.lang.String r1 = "is_maf_to_reposter"
            int r0 = r2.LJII
            r11.put(r1, r0)
            java.lang.String r1 = "is_unfollow_to_reposter"
            int r0 = r2.LJIIIIZZ
            r11.put(r1, r0)
            X.0lVU r0 = X.C1360460lVU.LIZIZ
            com.ss.android.ugc.aweme.feed.model.upvote.UpvoteList r0 = r0.LJIIIIZZ(r10)
            if (r0 == 0) goto L9f
            java.util.List<com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct> r0 = r0.upvotes
            if (r0 == 0) goto L9f
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r1 = r0.iterator()
        L71:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L91
            java.lang.Object r0 = r1.next()
            com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct r0 = (com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct) r0
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.user
            if (r0 == 0) goto L71
            java.lang.String r0 = r0.getUid()
            if (r0 == 0) goto L71
            r3.add(r0)
            goto L71
        L8b:
            r1 = r4
            goto L31
        L8d:
            r1 = r4
            goto L20
        L8f:
            r1 = r4
            goto L16
        L91:
            java.lang.String r4 = ","
            r7 = 0
            r10 = 62
            r6 = r5
            r8 = r5
            r9 = r5
            java.lang.String r1 = X.C13LP.LJJLIIIJ(r3, r4, r5, r6, r7, r8, r9, r10)
            if (r1 != 0) goto La1
        L9f:
            java.lang.String r1 = ""
        La1:
            java.lang.String r0 = "repost_uid_str"
            r11.put(r0, r1)
            return
        La7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1359610lU7.LIZLLL(java.lang.Integer, java.lang.String, org.json.JSONObject):void");
    }

    public static final void LJ(C2344009Gk c2344009Gk, Aweme aweme, String str) {
        String aid;
        Integer numValueOf = null;
        if (aweme != null) {
            aid = aweme.getAid();
            InteractPermission interactPermission = aweme.getInteractPermission();
            if (interactPermission != null) {
                numValueOf = Integer.valueOf(interactPermission.getUpvote());
            }
        } else {
            aid = null;
        }
        LIZJ(c2344009Gk, aid, numValueOf, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C2344009Gk LIZJ(X.C2344009Gk r10, java.lang.String r11, java.lang.Integer r12, java.lang.String r13) {
        /*
            if (r11 != 0) goto L3
            return r10
        L3:
            if (r12 == 0) goto Lb2
            int r0 = r12.intValue()
            if (r0 != 0) goto Lb2
            X.0lU8 r2 = LJI(r11, r13)
            boolean r0 = r2.LIZ
            java.lang.String r3 = "1"
            java.lang.String r4 = "0"
            if (r0 == 0) goto L98
            r1 = r3
        L18:
            java.lang.String r0 = "is_recommend"
            r10.LJIIIIZZ(r0, r1)
            boolean r0 = r2.LIZIZ
            if (r0 == 0) goto L96
            r1 = r3
        L22:
            java.lang.String r0 = "is_repost_reply"
            r10.LJIIIIZZ(r0, r1)
            java.lang.String r1 = "recommend_cnt"
            int r0 = r2.LIZJ
            r10.LIZJ(r0, r1)
            boolean r0 = r2.LIZLLL
            if (r0 == 0) goto L94
            r1 = r3
        L33:
            java.lang.String r0 = "is_self"
            r10.LJIIIIZZ(r0, r1)
            boolean r0 = r2.LJ
            if (r0 != 0) goto L3d
            r3 = r4
        L3d:
            java.lang.String r0 = "with_recommendation"
            r10.LJIIIIZZ(r0, r3)
            java.lang.String r1 = "is_muf_to_reposter"
            int r0 = r2.LJFF
            r10.LIZJ(r0, r1)
            java.lang.String r1 = "is_follow_to_reposter"
            int r0 = r2.LJI
            r10.LIZJ(r0, r1)
            java.lang.String r1 = "is_maf_to_reposter"
            int r0 = r2.LJII
            r10.LIZJ(r0, r1)
            java.lang.String r1 = "is_unfollow_to_reposter"
            int r0 = r2.LJIIIIZZ
            r10.LIZJ(r0, r1)
            java.lang.String r1 = "has_repost_comment"
            int r0 = r2.LJIIIZ
            r10.LIZJ(r0, r1)
            X.0lVU r0 = X.C1360460lVU.LIZIZ
            com.ss.android.ugc.aweme.feed.model.upvote.UpvoteList r0 = r0.LJIIIIZZ(r11)
            if (r0 == 0) goto Laa
            java.util.List<com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct> r0 = r0.upvotes
            if (r0 == 0) goto Laa
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r0.iterator()
        L7a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L9b
            java.lang.Object r0 = r1.next()
            com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct r0 = (com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct) r0
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.user
            if (r0 == 0) goto L7a
            java.lang.String r0 = r0.getUid()
            if (r0 == 0) goto L7a
            r2.add(r0)
            goto L7a
        L94:
            r1 = r4
            goto L33
        L96:
            r1 = r4
            goto L22
        L98:
            r1 = r4
            goto L18
        L9b:
            java.lang.String r3 = ","
            r4 = 0
            r6 = 0
            r9 = 62
            r5 = r4
            r7 = r4
            r8 = r4
            java.lang.String r1 = X.C13LP.LJJLIIIJ(r2, r3, r4, r5, r6, r7, r8, r9)
            if (r1 != 0) goto Lac
        Laa:
            java.lang.String r1 = ""
        Lac:
            java.lang.String r0 = "repost_uid_str"
            r10.LJFF(r0, r1)
            return r10
        Lb2:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1359610lU7.LIZJ(X.09Gk, java.lang.String, java.lang.Integer, java.lang.String):X.09Gk");
    }
}
