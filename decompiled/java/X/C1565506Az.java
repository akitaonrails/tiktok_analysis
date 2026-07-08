package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.message.content.SystemContent;
import com.ss.android.ugc.aweme.im.message.content.adapter.BaseContentParserKt;
import com.ss.android.ugc.aweme.im.streak.api.StreakInlineMsgInfo;
import com.ss.android.ugc.aweme.im.streak.impl.utils.StreakLocalExtHelper;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.06Az, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1565506Az {
    public static final C1565506Az LIZ = new C1565506Az();

    public static Map LIZ(String str) {
        StreakLocalExtHelper.StreakInlineMsgHolder streakInlineMsgHolderLIZIZ = StreakLocalExtHelper.LIZ.LIZIZ(str);
        StreakInlineMsgInfo streakInlineMsgInfo = null;
        if (streakInlineMsgHolderLIZIZ == null) {
            return null;
        }
        Pair[] pairArr = new Pair[2];
        StreakInlineMsgInfo streakInlineMsgInfo2 = streakInlineMsgHolderLIZIZ.remindInlineMsg;
        if (streakInlineMsgInfo2 == null || System.currentTimeMillis() >= streakInlineMsgInfo2.expireTime) {
            streakInlineMsgInfo2 = null;
        }
        pairArr[0] = new Pair(1, streakInlineMsgInfo2);
        StreakInlineMsgInfo streakInlineMsgInfo3 = streakInlineMsgHolderLIZIZ.continueInlineMsg;
        if (streakInlineMsgInfo3 != null && System.currentTimeMillis() < streakInlineMsgInfo3.expireTime) {
            streakInlineMsgInfo = streakInlineMsgInfo3;
        }
        pairArr[1] = new Pair(2, streakInlineMsgInfo);
        return C2097608Jq.LJIIIIZZ(pairArr);
    }

    public static final SystemContent LIZJ(C869590Y9l c869590Y9l) {
        Object c098200Yq;
        try {
            c098200Yq = (SystemContent) BaseContentParserKt.getOrParseJsonContent(c869590Y9l, SystemContent.class);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        return (SystemContent) c098200Yq;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x005e A[PHI: r6
      0x005e: PHI (r6v1 java.util.Map<java.lang.String, java.lang.String>) = 
      (r6v0 java.util.Map<java.lang.String, java.lang.String>)
      (r6v0 java.util.Map<java.lang.String, java.lang.String>)
      (r6v0 java.util.Map<java.lang.String, java.lang.String>)
      (r6v0 java.util.Map<java.lang.String, java.lang.String>)
      (r6v0 java.util.Map<java.lang.String, java.lang.String>)
      (r6v3 java.util.Map<java.lang.String, java.lang.String>)
      (r6v3 java.util.Map<java.lang.String, java.lang.String>)
      (r6v3 java.util.Map<java.lang.String, java.lang.String>)
      (r6v3 java.util.Map<java.lang.String, java.lang.String>)
     binds: [B:3:0x0002, B:5:0x0008, B:13:0x002b, B:15:0x0031, B:42:0x005e, B:21:0x0046, B:23:0x0050, B:25:0x0056, B:27:0x005c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static kotlin.Pair LIZIZ(X.C869590Y9l r8, java.lang.String r9) {
        /*
            r6 = 0
            r7 = 1
            if (r8 == 0) goto L5e
            int r0 = r8.getMsgType()
            if (r0 != r7) goto L5e
            java.lang.Class<com.ss.android.ugc.aweme.im.message.content.SystemContent> r0 = com.ss.android.ugc.aweme.im.message.content.SystemContent.class
            com.ss.android.ugc.aweme.im.message.content.BaseContent r1 = com.ss.android.ugc.aweme.im.message.content.adapter.BaseContentParserKt.getOrParseJsonContent(r8, r0)     // Catch: java.lang.Throwable -> L16
            com.ss.android.ugc.aweme.im.message.content.SystemContent r1 = (com.ss.android.ugc.aweme.im.message.content.SystemContent) r1     // Catch: java.lang.Throwable -> L16
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L16
            goto L22
        L16:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r1 = new X.00Yq
            r1.<init>(r0)
            X.C189200o6.m2constructorimpl(r1)
        L22:
            boolean r0 = X.C189200o6.m7isFailureimpl(r1)
            if (r0 == 0) goto L29
            r1 = r6
        L29:
            com.ss.android.ugc.aweme.im.message.content.SystemContent r1 = (com.ss.android.ugc.aweme.im.message.content.SystemContent) r1
            if (r1 == 0) goto L5e
            com.ss.android.ugc.aweme.im.message.content.SystemContent$Key[] r5 = r1.getTemplate()
            if (r5 == 0) goto L5e
            int r4 = r5.length
            r3 = 0
        L35:
            if (r3 >= r4) goto L5e
            r2 = r5[r3]
            int r1 = r2.getAction()
            r0 = 200002(0x30d42, float:2.80262E-40)
            if (r1 != r0) goto L9e
            java.util.Map r6 = r2.getExtra()
            if (r6 == 0) goto L5e
            java.lang.String r0 = "streak_badge_streak_num"
            java.lang.Object r0 = r6.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L5e
            java.lang.Integer r0 = X.C2095008Iq.LJIIJJI(r0)
            if (r0 == 0) goto L5e
            int r1 = r0.intValue()
            if (r1 != 0) goto L6b
        L5e:
            X.06LY r0 = com.ss.android.ugc.aweme.im.streak.api.IStreakService.LJJIIZ
            r0.getClass()
            com.ss.android.ugc.aweme.im.streak.api.IStreakService r0 = X.C06LY.LIZ()
            int r1 = r0.C(r9, r7)
        L6b:
            if (r6 == 0) goto L83
            java.lang.String r0 = "streak_badge_streak_level"
            java.lang.Object r0 = r6.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L83
            java.lang.Integer r0 = X.C2095008Iq.LJIIJJI(r0)
            if (r0 == 0) goto L83
            int r0 = r0.intValue()
            if (r0 != 0) goto L90
        L83:
            X.06LY r0 = com.ss.android.ugc.aweme.im.streak.api.IStreakService.LJJIIZ
            r0.getClass()
            com.ss.android.ugc.aweme.im.streak.api.IStreakService r0 = X.C06LY.LIZ()
            int r0 = r0.f(r9)
        L90:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r2, r1)
            return r0
        L9e:
            int r3 = r3 + 1
            goto L35
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1565506Az.LIZIZ(X.0Y9l, java.lang.String):kotlin.Pair");
    }
}
