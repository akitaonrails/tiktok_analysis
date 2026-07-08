package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0Kmb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C527590Kmb {
    public static final C527590Kmb LIZ = new C527590Kmb();
    public static final Keva LIZIZ = Keva.getRepo("cc_template_info");

    /* JADX WARN: Removed duplicated region for block: B:9:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C527600Kmc LIZ(java.lang.String r6) {
        /*
            com.bytedance.keva.Keva r2 = X.C527590Kmb.LIZIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "music_id_"
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r5 = 0
            java.lang.String r4 = r2.getString(r0, r5)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "music_start_time_"
            r1.append(r0)
            r1.append(r6)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            r0 = 0
            int r3 = r2.getInt(r1, r0)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "music_wwa_campaign_"
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r2 = r2.getString(r0, r5)
            boolean r0 = X.C123100dR.LIZ(r2)
            if (r0 == 0) goto L69
            X.04rF r1 = X.C1227904rF.LIZ     // Catch: java.lang.Throwable -> L57
            java.lang.Class<X.0oBw> r0 = X.C1463660oBw.class
            r1.getClass()     // Catch: java.lang.Throwable -> L57
            java.lang.Object r2 = X.C1227904rF.LIZIZ(r2, r0)     // Catch: java.lang.Throwable -> L57
            X.0oBw r2 = (X.C1463660oBw) r2     // Catch: java.lang.Throwable -> L57
            X.C189200o6.m2constructorimpl(r2)     // Catch: java.lang.Throwable -> L57
            goto L63
        L57:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r2 = new X.00Yq
            r2.<init>(r0)
            X.C189200o6.m2constructorimpl(r2)
        L63:
            boolean r0 = X.C189200o6.m7isFailureimpl(r2)
            if (r0 == 0) goto L6a
        L69:
            r2 = r5
        L6a:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "CCTemplateInfoKeva get ; templateId : "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = " ; musicId : "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = " ; musicStartTime : "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = " ; wwaCampaignInfo : "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C201955140j.LJIIL(r0)
            boolean r0 = X.C123100dR.LIZ(r4)
            if (r0 == 0) goto La4
            if (r4 == 0) goto La4
            X.0Kmc r5 = new X.0Kmc
            X.0oBw r2 = (X.C1463660oBw) r2
            r5.<init>(r4, r3, r2)
        La4:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C527590Kmb.LIZ(java.lang.String):X.0Kmc");
    }

    public static void LIZIZ(String str, String str2, int i, C1463660oBw c1463660oBw) {
        Object c098200Yq;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CCTemplateInfoKeva store ; templateId : ");
        sbLIZ.append(str);
        sbLIZ.append(" ; musicId : ");
        sbLIZ.append(str2);
        sbLIZ.append(" ; musicStartTime : ");
        sbLIZ.append(i);
        C201955140j.LJIIL(C2188811AlT.LIZIZ(sbLIZ));
        Keva keva = LIZIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("music_id_");
        sbLIZ2.append(str);
        keva.storeString(C2188811AlT.LIZIZ(sbLIZ2), str2);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("music_start_time_");
        sbLIZ3.append(str);
        keva.storeInt(C2188811AlT.LIZIZ(sbLIZ3), i);
        if (c1463660oBw != null) {
            try {
                LIZ.getClass();
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("music_wwa_campaign_");
                sbLIZ4.append(str);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ4);
                C1227904rF.LIZ.getClass();
                keva.storeString(strLIZIZ, C1227904rF.LJI(c1463660oBw));
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            C189200o6.m1boximpl(c098200Yq);
        }
    }
}
