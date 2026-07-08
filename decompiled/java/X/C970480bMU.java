package X;

import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchBeansSettings;
import com.bytedance.android.livesdk.sei.LiveSeiStruct;
import com.bytedance.android.livesdk.sei.SeiAppData;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AwS122S0201000_15;
import kotlin.jvm.internal.AwS293S0300000_15;
import kotlin.jvm.internal.AwS451S0200000_15;
import kotlin.jvm.internal.AwS629S0100000_15;

/* JADX INFO: renamed from: X.0bMU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C970480bMU {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(185));
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(186));
    public final C01GW LIZJ = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(184));
    public final C01GW LIZLLL = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(187));
    public final C01GW LJ = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(181));
    public final C01GW LJFF = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(182));
    public final C01GW LJI = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(183));

    public final void LIZ(C970530bMZ c970530bMZ) {
        int i;
        Map<String, Map<String, String>> map;
        Map<String, String> map2;
        String str;
        LiveSeiStruct liveSeiStruct;
        if (LiveMatchBeansSettings.INSTANCE.isAudienceEnabled() && (liveSeiStruct = c970530bMZ.LIZJ.LIZ) != null && (liveSeiStruct.matchGameUpdateInfo != null || (liveSeiStruct != null && liveSeiStruct.matchGameFinalScore != null))) {
            C20441214yg.LJIIIZ("CompetitionAudienceLauncher", "sei_audience_competition catch bean score callback");
            c970530bMZ.LIZ.invoke(new C970500bMW(EnumC919170a1j.MATCH_TYPE_CATCH_BEANS, null, 10));
        }
        SeiAppData seiAppDataLJII = C969340bKe.LJII(c970530bMZ.LIZJ);
        if (seiAppDataLJII == null) {
        }
        try {
            map = seiAppDataLJII.businessExtraInfo;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("matchType error. e = ");
            sbLIZ.append(e);
            C20441214yg.LJ("EntranceIdentifier", C2188811AlT.LIZIZ(sbLIZ));
        }
        if (map != null && (map2 = map.get("match_info")) != null && (str = map2.get("match_type")) != null) {
            i = CastIntegerProtector.parseInt(str);
        } else {
            i = 0;
        }
        C20441214yg.LIZIZ("CompetitionAudienceLauncher", "dispatchSeiEntrance: matchTypeInt " + i + ", isFromMatch " + c970530bMZ.LIZLLL + ", inMatch " + C500260Jjc.LJJIFFI(Boolean.valueOf(C915980Zwa.LJFF().co0())) + ' ');
        EnumC919170a1j enumC919170a1jLIZ = C918130a03.LIZ(Integer.valueOf(i));
        switch (C917540Zz6.LIZ[enumC919170a1jLIZ.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                if (c970530bMZ.LIZLLL && C500260Jjc.LJJIFFI(Boolean.valueOf(C915980Zwa.LJFF().co0()))) {
                    ((C970310bMD) this.LIZLLL.getValue()).LIZ(c970530bMZ.LIZIZ, seiAppDataLJII, new AwS122S0201000_15(i, c970530bMZ, enumC919170a1jLIZ, 0));
                    break;
                }
                break;
            case 5:
                if (!c970530bMZ.LIZLLL) {
                    if (C915980Zwa.LIZIZ().JV1(false).isIdle()) {
                        C970920bNC c970920bNC = new C970920bNC();
                        long jLIZLLL = C975230bU9.LIZLLL(seiAppDataLJII);
                        int type = enumC919170a1jLIZ.getType();
                        if (jLIZLLL > 0) {
                            long j = C973910bS1.LJI;
                            if (j <= 0 || j != jLIZLLL) {
                                C973910bS1.LJFF = C158B.LIZ();
                                AbstractC962030b8r.LJIIJ(c970920bNC.LIZLLL, "sei_battle_id", Long.valueOf(jLIZLLL), true);
                                c970920bNC.LJIIL(Integer.valueOf(type), "sei_battle_type", true);
                                if (C973910bS1.LJI != jLIZLLL) {
                                    c970920bNC.LJIIL(1, "is_first_sei", true);
                                } else {
                                    c970920bNC.LJIIL(0, "is_first_sei", true);
                                }
                                C973910bS1.LJI = jLIZLLL;
                                c970920bNC.LJIJJLI("sei_identify_start");
                            }
                        }
                    }
                    ((C970490bMV) this.LJFF.getValue()).LIZ(c970530bMZ.LIZIZ, seiAppDataLJII, new AwS293S0300000_15(seiAppDataLJII, enumC919170a1jLIZ, c970530bMZ, 13));
                }
                break;
            case 6:
                if (LiveMatchBeansSettings.INSTANCE.isAudienceEnabled() && !C915980Zwa.LIZ().kg2()) {
                    ((C970490bMV) this.LJFF.getValue()).LIZ(c970530bMZ.LIZIZ, seiAppDataLJII, new AwS629S0100000_15(c970530bMZ, 54));
                    break;
                }
                break;
            default:
                if (c970530bMZ.LIZLLL) {
                    ((C970310bMD) this.LIZLLL.getValue()).LIZ(c970530bMZ.LIZIZ, seiAppDataLJII, new AwS451S0200000_15(c970530bMZ, enumC919170a1jLIZ, 10));
                }
                break;
        }
    }
}
