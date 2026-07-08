package X;

import com.bytedance.android.livesdk.sei.LiveSeiStruct;
import com.bytedance.android.livesdk.sei.SeiAppData;
import java.util.Map;

/* JADX INFO: renamed from: X.0bfQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C982220bfQ {
    public static boolean LIZJ(C945320ahu c945320ahu) {
        LiveSeiStruct liveSeiStruct;
        SeiAppData seiAppData;
        Map<String, Map<String, String>> map;
        Map<String, String> map2;
        if (c945320ahu != null && (liveSeiStruct = c945320ahu.LIZ) != null && liveSeiStruct.LIZ != null) {
            if (liveSeiStruct == null || (seiAppData = liveSeiStruct.LIZ) == null || (map = seiAppData.businessExtraInfo) == null || (map2 = map.get("match_info")) == null || C950220apo.LJIL(map2.get("match_type")) != EnumC962960bAM.TAKE_THE_STAGE.getType() || C950220apo.LJJ(map2.get("competition_id")) <= 0) {
                return false;
            }
            return true;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isSEICompetitionInfoValid");
        sbLIZ.append(", sei is null, sei=");
        sbLIZ.append(c945320ahu);
        C20441214yg.LJ("CompetitionAudienceIdentifyHelper", C2188811AlT.LIZIZ(sbLIZ));
        return false;
    }

    public static boolean LIZ(String str, EnumC974260bSa enumC974260bSa) {
        int i = C982980bge.LIZ[enumC974260bSa.ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3) {
                if (i != 4 && i != 5) {
                    return false;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("checkCanTransitStatusByInfoResult");
                sbLIZ.append(", source=");
                sbLIZ.append(str);
                sbLIZ.append(", transit to ");
                sbLIZ.append(enumC974260bSa);
                C20441214yg.LIZIZ("CompetitionAudienceIdentifyHelper", C2188811AlT.LIZIZ(sbLIZ));
                return true;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("checkCanTransitStatusByInfoResult");
            sbLIZ2.append(", source=");
            sbLIZ2.append(str);
            sbLIZ2.append(", transit to ");
            sbLIZ2.append(enumC974260bSa);
            C20441214yg.LIZIZ("CompetitionAudienceIdentifyHelper", C2188811AlT.LIZIZ(sbLIZ2));
            return true;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("checkCanTransitStatusByInfoResult");
        sbLIZ3.append(", source=");
        sbLIZ3.append(str);
        sbLIZ3.append(", transit to ");
        sbLIZ3.append(enumC974260bSa);
        C20441214yg.LIZIZ("CompetitionAudienceIdentifyHelper", C2188811AlT.LIZIZ(sbLIZ3));
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0092 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZIZ(X.C981480beE r9, X.C945320ahu r10) {
        /*
            X.0bAM r0 = r9.LJIIIIZZ
            boolean r0 = r0.isCatchBean()
            r8 = 1
            r0 = r0 ^ 1
            if (r0 != 0) goto Lc
            return r8
        Lc:
            boolean r0 = LIZJ(r10)
            r7 = 0
            java.lang.String r5 = "CompetitionAudienceIdentifyHelper"
            java.lang.String r6 = "isSEICompetitionIdValid"
            if (r0 != 0) goto L2b
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            r1.append(r6)
            java.lang.String r0 = ", isTakeTheStageSEIArrived = false"
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C20441214yg.LJ(r5, r0)
            return r7
        L2b:
            r9.LJIJJ = r10
            r0 = 0
            if (r10 == 0) goto L8f
            com.bytedance.android.livesdk.sei.LiveSeiStruct r1 = r10.LIZ
            if (r1 == 0) goto L8f
            com.bytedance.android.livesdk.sei.SeiAppData r1 = r1.LIZ
            if (r1 == 0) goto L8f
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> r2 = r1.businessExtraInfo
            if (r2 == 0) goto L8f
            java.lang.String r1 = "match_info"
            java.lang.Object r2 = r2.get(r1)
            java.util.Map r2 = (java.util.Map) r2
            if (r2 == 0) goto L90
            java.lang.String r1 = "match_type"
            java.lang.Object r1 = r2.get(r1)
            java.lang.String r1 = (java.lang.String) r1
        L4e:
            int r1 = X.C950220apo.LJIL(r1)
            if (r2 == 0) goto L5c
            java.lang.String r0 = "competition_id"
            java.lang.Object r0 = r2.get(r0)
            java.lang.String r0 = (java.lang.String) r0
        L5c:
            long r3 = X.C950220apo.LJJ(r0)
            java.lang.StringBuilder r2 = X.C2188811AlT.LIZ()
            r2.append(r6)
            java.lang.String r0 = ", sei_matchType="
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = ", sei_competitionId="
            r2.append(r0)
            r2.append(r3)
            java.lang.String r0 = ", local_competitionId="
            r2.append(r0)
            long r0 = r9.LJIIIZ
            r2.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r2)
            X.C20441214yg.LJIIIZ(r5, r0)
            long r1 = r9.LJIIIZ
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L92
            return r8
        L8f:
            r2 = r0
        L90:
            r1 = r0
            goto L4e
        L92:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C982220bfQ.LIZIZ(X.0beE, X.0ahu):boolean");
    }
}
