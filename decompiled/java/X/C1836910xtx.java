package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.api.ContentAuditStatus;
import com.bytedance.android.livesdk.chatroom.api.SMBCourse;
import kotlin.jvm.internal.AwS176S1100000_27;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.smb.GetSMBCourseDetailResponse;

/* JADX INFO: renamed from: X.0xtx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1836910xtx {
    public static final C1838060xvo LIZ(GetSMBCourseDetailResponse.Data data, Boolean bool, AwS176S1100000_27 awS176S1100000_27) {
        String str;
        String str2;
        boolean z;
        String nickName;
        int i;
        SMBCourse sMBCourse;
        ContentAuditStatus contentAuditStatus;
        ContentAuditStatus contentAuditStatus2;
        SMBCourse sMBCourse2 = data.course;
        ImageModel avatarThumb = null;
        if (sMBCourse2 != null && (contentAuditStatus2 = sMBCourse2.name) != null) {
            str = contentAuditStatus2.content;
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        if (sMBCourse2 == null || (contentAuditStatus = sMBCourse2.description) == null || (str2 = contentAuditStatus.content) == null) {
            str2 = "";
        }
        Boolean bool2 = Boolean.TRUE;
        if (Intrinsics.LJFF(bool, bool2) || ((sMBCourse = data.course) != null && sMBCourse.isPurchased)) {
            z = true;
        } else {
            z = false;
        }
        boolean zLJFF = Intrinsics.LJFF(bool, bool2);
        User user = data.anchorInfo;
        if (user != null) {
            avatarThumb = user.getAvatarThumb();
        }
        User user2 = data.anchorInfo;
        if (user2 == null || (nickName = user2.getNickName()) == null) {
            nickName = "";
        }
        SMBCourse sMBCourse3 = data.course;
        if (sMBCourse3 != null) {
            i = sMBCourse3.validVideoCount;
        } else {
            i = 0;
        }
        return new C1838060xvo(str, str2, nickName, avatarThumb, z, zLJFF, i, awS176S1100000_27);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00ac A[PHI: r5
      0x00ac: PHI (r5v2 java.util.List) = (r5v0 java.util.List), (r5v3 java.util.List) binds: [B:7:0x000c, B:5:0x0008] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List LIZIZ(webcast.api.smb.GetSMBCourseDetailResponse.Data r24, X.C1836920xty r25, kotlin.jvm.internal.AwS462S0200000_27 r26) {
        /*
            r0 = r24
            com.bytedance.android.livesdk.chatroom.api.SMBCourse r0 = r0.course
            if (r0 == 0) goto La
            java.util.List<com.bytedance.android.livesdk.chatroom.api.SMBCourseVideo> r5 = r0.videoList
            if (r5 != 0) goto Lac
        La:
            X.13BV r5 = X.C13BV.INSTANCE
            if (r0 != 0) goto Lac
            r4 = 0
        Lf:
            java.util.ArrayList r3 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C15438062q.LJIJJ(r5, r0)
            r3.<init>(r0)
            java.util.Iterator r13 = r5.iterator()
            r2 = 0
        L1f:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto Lb4
            java.lang.Object r0 = r13.next()
            int r12 = r2 + 1
            r1 = 0
            if (r2 < 0) goto Lb0
            com.bytedance.android.livesdk.chatroom.api.SMBCourseVideo r0 = (com.bytedance.android.livesdk.chatroom.api.SMBCourseVideo) r0
            r8 = 1
            r1 = r25
            if (r1 == 0) goto Laa
            boolean r1 = r1.LLIZLLLIL
            if (r1 != r8) goto Laa
            r1 = 1
        L3a:
            java.lang.String r17 = ""
            r6 = r26
            if (r1 == 0) goto L73
            com.bytedance.android.livesdk.chatroom.api.ContentAuditStatus r1 = r0.title
            if (r1 == 0) goto L48
            java.lang.String r9 = r1.content
            if (r9 != 0) goto L4a
        L48:
            r9 = r17
        L4a:
            com.bytedance.android.livesdk.chatroom.api.ContentAuditStatus r1 = r0.cover
            if (r1 == 0) goto L54
            java.lang.String r1 = r1.content
            if (r1 == 0) goto L54
            r17 = r1
        L54:
            long r15 = (long) r2
            long r10 = r0.videoDuration
            r21 = r4 ^ 1
            long r0 = r0.viewCount
            X.0xu5 r14 = new X.0xu5
            kotlin.jvm.internal.AwS156S0101000_16 r8 = new kotlin.jvm.internal.AwS156S0101000_16
            r7 = 3
            r8.<init>(r2, r6, r7)
            r22 = r8
            r23 = r0
            r19 = r10
            r18 = r9
            r14.<init>(r15, r17, r18, r19, r21, r22, r23)
        L6e:
            r3.add(r14)
            r2 = r12
            goto L1f
        L73:
            com.bytedance.android.livesdk.chatroom.api.ContentAuditStatus r1 = r0.title
            if (r1 == 0) goto L7b
            java.lang.String r9 = r1.content
            if (r9 != 0) goto L7d
        L7b:
            r9 = r17
        L7d:
            com.bytedance.android.livesdk.chatroom.api.ContentAuditStatus r1 = r0.cover
            if (r1 == 0) goto L87
            java.lang.String r1 = r1.content
            if (r1 == 0) goto L87
            r17 = r1
        L87:
            long r15 = (long) r2
            long r0 = r0.videoDuration
            r21 = r4 ^ 1
            int r7 = r5.size()
            int r7 = r7 - r8
            if (r2 != r7) goto La7
            r23 = 1
        L95:
            X.0xu6 r14 = new X.0xu6
            kotlin.jvm.internal.AwS156S0101000_16 r8 = new kotlin.jvm.internal.AwS156S0101000_16
            r7 = 4
            r8.<init>(r2, r6, r7)
            r22 = r8
            r19 = r0
            r18 = r9
            r14.<init>(r15, r17, r18, r19, r21, r22, r23)
            goto L6e
        La7:
            r23 = 0
            goto L95
        Laa:
            r1 = 0
            goto L3a
        Lac:
            boolean r4 = r0.isPurchased
            goto Lf
        Lb0:
            X.C1697810uHb.LJIJI()
            throw r1
        Lb4:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1836910xtx.LIZIZ(webcast.api.smb.GetSMBCourseDetailResponse$Data, X.0xty, kotlin.jvm.internal.AwS462S0200000_27):java.util.List");
    }
}
