package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0YaX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C876830YaX {
    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0055 A[PHI: r5
      0x0055: PHI (r5v1 boolean) = (r5v0 boolean), (r5v3 boolean) binds: [B:26:0x0052, B:13:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Pair<java.lang.Boolean, java.lang.Boolean> LIZ(X.C0Y8T r8) {
        /*
            java.lang.Class<com.ss.android.ugc.aweme.im.service.IDmHelper> r0 = com.ss.android.ugc.aweme.im.service.IDmHelper.class
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpiForReal(r0)
            com.ss.android.ugc.aweme.im.service.IDmHelper r0 = (com.ss.android.ugc.aweme.im.service.IDmHelper) r0
            r7 = 0
            if (r0 == 0) goto Lf
            com.ss.android.ugc.aweme.im.chatlist.api.model.LastMessageProperty r7 = r0.LJI(r8)
        Lf:
            r6 = 1
            if (r7 == 0) goto L51
            java.lang.Integer r0 = r7.getMark_read()
            if (r0 == 0) goto L1e
            int r0 = r0.intValue()
            if (r0 == r6) goto L51
        L1e:
            r5 = 1
        L1f:
            java.lang.Long r0 = r7.getCreate_at_in_seconds()
            if (r0 == 0) goto L55
            long r3 = r0.longValue()
        L29:
            r0 = 1000(0x3e8, float:1.401E-42)
            long r0 = (long) r0
            long r3 = r3 * r0
            long r3 = r3 * r0
            long r1 = r8.getReadIndex()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L4f
            r1 = 1
        L37:
            boolean r0 = X.C0YU9.LIZIZ(r7)
            kotlin.Pair r2 = new kotlin.Pair
            if (r5 == 0) goto L4d
            if (r1 == 0) goto L4d
        L41:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r6)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.<init>(r1, r0)
            return r2
        L4d:
            r6 = 0
            goto L41
        L4f:
            r1 = 0
            goto L37
        L51:
            r5 = 0
            if (r7 == 0) goto L55
            goto L1f
        L55:
            r3 = 0
            goto L29
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C876830YaX.LIZ(X.0Y8T):kotlin.Pair");
    }

    public static final boolean LIZIZ(C0Y8T c0y8t) {
        C869590Y9l lastShowMessage = c0y8t.getLastShowMessage();
        if (lastShowMessage == null) {
            return false;
        }
        String scene = lastShowMessage.getScene();
        if (!((Boolean) C279120Awo.LIZIZ.getValue()).booleanValue() || ((!Intrinsics.LJFF(scene, "like_notice_push") && !Intrinsics.LJFF(scene, "share_video_to_share_user")) || C0ZDX.LJJJJIZL(lastShowMessage) || lastShowMessage.getIndex() <= c0y8t.getReadIndex())) {
            return false;
        }
        return true;
    }

    public static final boolean LIZJ(C0Y8T c0y8t) {
        C869590Y9l lastShowMessage;
        if (c0y8t.getUnreadCount() <= 0) {
            return false;
        }
        C0CYH c0cyh = C0CYH.LIZJ;
        if (c0cyh.LJIIIZ() && C19212010Ec.LIZJ.LIZJ() != C05RV.BUSINESS_INBOX && (lastShowMessage = c0y8t.getLastShowMessage()) != null) {
            Long lValueOf = Long.valueOf(lastShowMessage.getCreatedAt());
            if (lValueOf.longValue() > 0) {
                if (System.currentTimeMillis() - lValueOf.longValue() > c0cyh.LJIIIIZZ()) {
                    return false;
                }
                return true;
            }
        }
        return true;
    }
}
