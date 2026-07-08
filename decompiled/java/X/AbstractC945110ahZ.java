package X;

/* JADX INFO: renamed from: X.0ahZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public abstract class AbstractC945110ahZ {
    /* JADX WARN: Removed duplicated region for block: B:12:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C950000apS LIZ(com.bytedance.android.livesdk.model.message.LinkMessage r19, java.lang.String r20) {
        /*
            r1 = r19
            com.bytedance.android.livesdk.model.message.linker.random_linkmic_message.LinkerRandomMatchContent r4 = r1.randomMatchContent
            r12 = 0
            if (r4 == 0) goto La7
            long r6 = r4.roomId
            com.bytedance.android.live.base.model.user.User r0 = r4.user
            if (r0 == 0) goto La9
            long r8 = r0.getId()
        L12:
            long r10 = r4.innerChannelId
            long r12 = r4.groupChannelId
        L16:
            java.lang.String r2 = ""
            if (r4 == 0) goto L1e
            java.lang.String r3 = r4.matchId
            if (r3 != 0) goto L1f
        L1e:
            r3 = r2
        L1f:
            com.bytedance.android.livesdk.model.message.linker.random_linkmic_message.LinkerRandomMatchContent r0 = r1.randomMatchContent
            if (r0 == 0) goto La2
            long r0 = r0.sourceType
            int r5 = (int) r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            if (r0 == 0) goto La2
            X.0ayO r0 = X.C915200ZvK.LIZ(r0)
            int r5 = r0.LIZ
        L32:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "randomMatchContent="
            r1.append(r0)
            r1.append(r4)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "TeamPairJoinGroupRequestBuilder"
            X.C20441214yg.LIZIZ(r0, r1)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1 = 12
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            java.lang.String r1 = "vendor"
            r0.put(r1, r4)
            java.lang.String r1 = "sec_to_user_id"
            r0.put(r1, r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            java.lang.String r1 = "source_type"
            r0.put(r1, r2)
            r1 = 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            java.lang.String r1 = "match_type"
            r0.put(r1, r2)
            java.lang.String r1 = "algo_request_id"
            r0.put(r1, r3)
            java.lang.String r1 = "session_id"
            r2 = r20
            r0.put(r1, r2)
            java.lang.String r1 = "match_id"
            r0.put(r1, r3)
            r5 = 1
            com.bytedance.android.livesdk.livesetting.linkmic.MtCoHostInviteTimeOutSetting r1 = com.bytedance.android.livesdk.livesetting.linkmic.MtCoHostInviteTimeOutSetting.INSTANCE
            int r1 = r1.getValue()
            long r14 = (long) r1
            r16 = 0
            java.lang.String r18 = "join_team_pair"
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.String r2 = "join_team_pair"
            r1.add(r2)
            r20 = 64
            X.0apS r4 = new X.0apS
            r17 = r0
            r19 = r1
            r4.<init>(r5, r6, r8, r10, r12, r14, r16, r17, r18, r19, r20)
            return r4
        La2:
            X.0ayO r0 = X.C955540ayO.LIZIZ
            int r5 = r0.LIZ
            goto L32
        La7:
            r6 = 0
        La9:
            r8 = 0
            if (r4 != 0) goto L12
            r10 = 0
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC945110ahZ.LIZ(com.bytedance.android.livesdk.model.message.LinkMessage, java.lang.String):X.0apS");
    }
}
