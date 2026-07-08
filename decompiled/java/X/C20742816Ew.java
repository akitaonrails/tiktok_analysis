package X;

import com.ss.android.ugc.aweme.search.pages.result.pov.model.ShortAnswerFormat;
import java.util.HashMap;

/* JADX INFO: renamed from: X.16Ew, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20742816Ew {
    public static final HashMap<ShortAnswerFormat, C21419118s1> LIZ = new HashMap<>();

    /* JADX WARN: Removed duplicated region for block: B:14:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C21419118s1 LIZ(com.ss.android.ugc.aweme.search.pages.result.pov.model.ShortAnswerFormat r8) {
        /*
            java.util.HashMap<com.ss.android.ugc.aweme.search.pages.result.pov.model.ShortAnswerFormat, X.18s1> r6 = X.C20742816Ew.LIZ
            java.lang.Object r0 = r6.get(r8)
            if (r0 != 0) goto L4b
            com.ss.android.ugc.aweme.search.pages.result.pov.model.HighlightConfig r7 = r8.highlightConfig
            r5 = 0
            if (r7 == 0) goto L1a
            java.lang.String r0 = r7.color
            if (r0 == 0) goto L1a
            java.lang.Integer r1 = X.C20741716El.LIZ(r0, r5)     // Catch: java.lang.Exception -> L16
            goto L1b
        L16:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L1a:
            r1 = r5
        L1b:
            java.lang.String r0 = r8.font
            int r4 = X.C20741716El.LJ(r0)
            int r0 = r8.paragraphSpacing
            float r3 = X.C418040GaI.LIZ(r0)
            if (r1 == 0) goto L41
            r1.intValue()
            X.18s2 r5 = new X.18s2
            int r2 = r1.intValue()
            int r0 = r7.topPadding
            float r1 = X.C418040GaI.LIZ(r0)
            int r0 = r7.bottomPadding
            float r0 = X.C418040GaI.LIZ(r0)
            r5.<init>(r2, r1, r0)
        L41:
            int r1 = r8.headLevel
            X.18s1 r0 = new X.18s1
            r0.<init>(r4, r3, r5, r1)
            r6.put(r8, r0)
        L4b:
            X.18s1 r0 = (X.C21419118s1) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20742816Ew.LIZ(com.ss.android.ugc.aweme.search.pages.result.pov.model.ShortAnswerFormat):X.18s1");
    }
}
