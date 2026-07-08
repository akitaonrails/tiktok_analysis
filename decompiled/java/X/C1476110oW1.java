package X;

import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.mediakit.medialoader.AVMDLDataLoaderNotifyInfo;
import com.ss.ttvideoengine.DataLoaderHelper;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import com.tts.oecverify.BdTuring;
import fyo.e;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0oW1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1476110oW1 {
    public static void LIZ(AVMDLDataLoaderNotifyInfo aVMDLDataLoaderNotifyInfo, DataLoaderHelper dataLoaderHelper) {
        String str;
        C1471550oOf c1471550oOfLJ;
        String str2;
        String str3;
        String str4;
        int i;
        long j;
        int i2;
        int i3;
        String str5;
        boolean z;
        C1471550oOf c1471550oOfLJ2;
        C1476330oWN c1476330oWN;
        String str6;
        int i4;
        String str7;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        if (aVMDLDataLoaderNotifyInfo == null) {
            return;
        }
        JSONObject jSONObject3 = aVMDLDataLoaderNotifyInfo.jsonLog;
        if (jSONObject3 != null) {
            try {
                if (!jSONObject3.has("app_session_id")) {
                    aVMDLDataLoaderNotifyInfo.jsonLog.put("app_session_id", C1468180oJE.LJJZZIII);
                }
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        int i5 = aVMDLDataLoaderNotifyInfo.what;
        if (i5 != 8) {
            if (i5 != 24) {
                if (i5 != 50) {
                    if (i5 != 70) {
                        if (i5 != 700) {
                            if (i5 != 10) {
                                if (i5 != 11) {
                                    if (i5 != 702) {
                                        if (i5 != 703) {
                                            if (i5 != 901) {
                                                if (i5 != 902) {
                                                    switch (i5) {
                                                        case 0:
                                                            C0WPR c0wpr = dataLoaderHelper.LJIILJJIL;
                                                            if (c0wpr != null) {
                                                                ((C0WPO) c0wpr).LIZIZ(aVMDLDataLoaderNotifyInfo.logType, aVMDLDataLoaderNotifyInfo.jsonLog);
                                                                return;
                                                            }
                                                            C1476170oW7 c1476170oW7 = dataLoaderHelper.LIZ;
                                                            if (c1476170oW7 == null) {
                                                                return;
                                                            }
                                                            c1476170oW7.LJI(0, aVMDLDataLoaderNotifyInfo.logType, aVMDLDataLoaderNotifyInfo.jsonLog);
                                                            return;
                                                        case 1:
                                                            C0WPR c0wpr2 = dataLoaderHelper.LJIILJJIL;
                                                            if (c0wpr2 != null) {
                                                                ((C0WPO) c0wpr2).LIZIZ(aVMDLDataLoaderNotifyInfo.logType, aVMDLDataLoaderNotifyInfo.jsonLog);
                                                                return;
                                                            }
                                                            C1476170oW7 c1476170oW72 = dataLoaderHelper.LIZ;
                                                            if (c1476170oW72 == null) {
                                                                return;
                                                            }
                                                            c1476170oW72.LJI(1, aVMDLDataLoaderNotifyInfo.logType, aVMDLDataLoaderNotifyInfo.jsonLog);
                                                            return;
                                                        case 2:
                                                            C790230UzF.LIZ.LJIILIIL();
                                                            C1476170oW7 c1476170oW73 = dataLoaderHelper.LIZ;
                                                            if (c1476170oW73 == null) {
                                                                return;
                                                            }
                                                            c1476170oW73.LJ(2, aVMDLDataLoaderNotifyInfo.code, aVMDLDataLoaderNotifyInfo.parameter, aVMDLDataLoaderNotifyInfo.logInfo);
                                                            return;
                                                        case 3:
                                                        case 4:
                                                            int i6 = C2187451AjH.LIZ;
                                                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                                                            sbLIZ.append("KeyIsFileCacheProgress log = ");
                                                            sbLIZ.append(aVMDLDataLoaderNotifyInfo.logInfo);
                                                            sbLIZ.append(", task type = ");
                                                            sbLIZ.append(aVMDLDataLoaderNotifyInfo.parameter);
                                                            sbLIZ.append(" code = ");
                                                            sbLIZ.append((int) aVMDLDataLoaderNotifyInfo.code);
                                                            TTVideoEngineLog.d("DataLoaderHelper", C2188811AlT.LIZIZ(sbLIZ));
                                                            String str8 = aVMDLDataLoaderNotifyInfo.logInfo;
                                                            if (str8 == null) {
                                                                return;
                                                            }
                                                            long j2 = aVMDLDataLoaderNotifyInfo.parameter;
                                                            if (j2 == 3) {
                                                                C0VOT.LJIIIIZZ.getClass();
                                                                TextUtils.isEmpty(str8);
                                                                return;
                                                            }
                                                            if (j2 == 2) {
                                                                z = true;
                                                            } else {
                                                                z = false;
                                                            }
                                                            if (TextUtils.isEmpty(str8)) {
                                                                return;
                                                            }
                                                            String[] strArrSplit = aVMDLDataLoaderNotifyInfo.logInfo.split(",");
                                                            if (strArrSplit.length < 3) {
                                                                return;
                                                            }
                                                            try {
                                                                long jLongValue = CastLongProtector.valueOf(strArrSplit[0]).longValue();
                                                                long jLongValue2 = CastLongProtector.valueOf(strArrSplit[1]).longValue();
                                                                if (jLongValue2 <= 0 && aVMDLDataLoaderNotifyInfo.what != 4) {
                                                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                                                    sbLIZ2.append("[preload] mediaSize <= 0 return ");
                                                                    sbLIZ2.append(aVMDLDataLoaderNotifyInfo.logInfo);
                                                                    C1471660oOq.LIZJ("DataLoaderHelper", C2188811AlT.LIZIZ(sbLIZ2));
                                                                    return;
                                                                }
                                                                String str9 = strArrSplit[2];
                                                                String str10 = "";
                                                                if (strArrSplit.length >= 4) {
                                                                    str10 = strArrSplit[3];
                                                                }
                                                                if (z) {
                                                                    c1471550oOfLJ2 = dataLoaderHelper.LJ.LJ(str9);
                                                                    if (c1471550oOfLJ2 == null) {
                                                                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                                                        sbLIZ3.append("[preload] preload temItem == null return ");
                                                                        sbLIZ3.append(aVMDLDataLoaderNotifyInfo.logInfo);
                                                                        C1471660oOq.LIZJ("DataLoaderHelper", C2188811AlT.LIZIZ(sbLIZ3));
                                                                        int i7 = aVMDLDataLoaderNotifyInfo.what;
                                                                        if (i7 == 4) {
                                                                            C1475430oUv c1475430oUv = new C1475430oUv();
                                                                            c1475430oUv.LJ = jLongValue;
                                                                            c1475430oUv.LIZLLL = jLongValue2;
                                                                            c1475430oUv.LIZ = str9;
                                                                            c1475430oUv.LJIIIIZZ = 2;
                                                                            c1475430oUv.LIZJ = str10;
                                                                            C1476170oW7 c1476170oW74 = dataLoaderHelper.LIZ;
                                                                            if (c1476170oW74 == null) {
                                                                                return;
                                                                            }
                                                                            c1476170oW74.LJIIIIZZ(c1475430oUv);
                                                                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                                                            sbLIZ4.append(" task progress. cache end. key = ");
                                                                            sbLIZ4.append(str9);
                                                                            C1471660oOq.LIZJ("DataLoaderHelper", C2188811AlT.LIZIZ(sbLIZ4));
                                                                            return;
                                                                        }
                                                                        if (dataLoaderHelper.LJJJJZI != 1 || i7 != 3) {
                                                                            return;
                                                                        }
                                                                        C1475790oVV c1475790oVV = new C1475790oVV();
                                                                        c1475790oVV.LIZ = 2;
                                                                        C1471550oOf c1471550oOf = new C1471550oOf();
                                                                        c1471550oOf.LIZIZ(str9);
                                                                        C1476320oWM c1476320oWMLIZLLL = c1471550oOf.LIZLLL(str9);
                                                                        if (c1476320oWMLIZLLL == null) {
                                                                            return;
                                                                        }
                                                                        c1476320oWMLIZLLL.LJIIJJI = jLongValue;
                                                                        c1476320oWMLIZLLL.LJIIIZ = jLongValue;
                                                                        c1476320oWMLIZLLL.LJIIJ = jLongValue2;
                                                                        c1476320oWMLIZLLL.LJIIL = str10;
                                                                        c1476320oWMLIZLLL.LIZ = str9;
                                                                        c1475790oVV.LJ(c1471550oOf);
                                                                        C1476170oW7 c1476170oW75 = dataLoaderHelper.LIZ;
                                                                        if (c1476170oW75 == null) {
                                                                            return;
                                                                        }
                                                                        c1476170oW75.LIZIZ(c1475790oVV);
                                                                        return;
                                                                    }
                                                                    c1476330oWN = dataLoaderHelper.LJ;
                                                                } else {
                                                                    c1471550oOfLJ2 = dataLoaderHelper.LJFF.LJ(str9);
                                                                    if (c1471550oOfLJ2 == null) {
                                                                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                                                        sbLIZ5.append("[preload] play temItem == null return ");
                                                                        sbLIZ5.append(aVMDLDataLoaderNotifyInfo.logInfo);
                                                                        C1471660oOq.LIZJ("DataLoaderHelper", C2188811AlT.LIZIZ(sbLIZ5));
                                                                        return;
                                                                    }
                                                                    c1476330oWN = dataLoaderHelper.LJFF;
                                                                }
                                                                C1476320oWM c1476320oWMLIZLLL2 = c1471550oOfLJ2.LIZLLL(str9);
                                                                if (c1476320oWMLIZLLL2 != null) {
                                                                    c1476320oWMLIZLLL2.LJIIJ = jLongValue2;
                                                                    c1476320oWMLIZLLL2.LJIIJJI = jLongValue;
                                                                    c1476320oWMLIZLLL2.LJIIL = str10;
                                                                }
                                                                if (TextUtils.isEmpty(c1471550oOfLJ2.LIZ)) {
                                                                    str6 = str9;
                                                                } else {
                                                                    str6 = c1471550oOfLJ2.LIZ;
                                                                }
                                                                C1476210oWB c1476210oWB = C1476340oWO.LIZ;
                                                                C1475790oVV c1475790oVVLIZ = c1476210oWB.LIZ(str6);
                                                                if (c1475790oVVLIZ == null) {
                                                                    c1475790oVVLIZ = new C1475790oVV();
                                                                }
                                                                if (z) {
                                                                    i4 = 2;
                                                                } else {
                                                                    i4 = 1;
                                                                }
                                                                c1475790oVVLIZ.LIZ = i4;
                                                                c1475790oVVLIZ.LJ(c1471550oOfLJ2);
                                                                if (jLongValue2 == jLongValue && c1476320oWMLIZLLL2 != null && c1476320oWMLIZLLL2.LJ != null) {
                                                                    StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                                                                    sbLIZ6.append("[preload] ");
                                                                    if (c1476320oWMLIZLLL2.LJ.LJFF() == 1) {
                                                                        str7 = "Audio";
                                                                    } else {
                                                                        str7 = "Video";
                                                                    }
                                                                    sbLIZ6.append(str7);
                                                                    sbLIZ6.append(" cache complete key: ");
                                                                    sbLIZ6.append(str9);
                                                                    C1471660oOq.LIZJ("DataLoaderHelper", C2188811AlT.LIZIZ(sbLIZ6));
                                                                }
                                                                C1476170oW7 c1476170oW76 = dataLoaderHelper.LIZ;
                                                                if (c1476170oW76 != null) {
                                                                    c1476170oW76.LIZIZ(c1475790oVVLIZ);
                                                                }
                                                                c1476210oWB.LIZIZ(str6, c1475790oVVLIZ);
                                                                if (!c1475790oVVLIZ.LIZJ() && ((!z || !c1475790oVVLIZ.LIZLLL()) && aVMDLDataLoaderNotifyInfo.what != 4)) {
                                                                    return;
                                                                }
                                                                c1476330oWN.LJI(str9);
                                                                c1476210oWB.LIZJ(str6);
                                                                if (!z) {
                                                                    StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                                                                    sbLIZ7.append("[preload] notify vid cache end key: ");
                                                                    sbLIZ7.append(str6);
                                                                    C1471660oOq.LIZJ("DataLoaderHelper", C2188811AlT.LIZIZ(sbLIZ7));
                                                                    dataLoaderHelper.LIZJ(c1471550oOfLJ2);
                                                                }
                                                                C1475430oUv c1475430oUv2 = new C1475430oUv();
                                                                c1475430oUv2.LJ = jLongValue;
                                                                c1475430oUv2.LIZLLL = jLongValue2;
                                                                c1475430oUv2.LIZ = str9;
                                                                c1475430oUv2.LIZJ = str10;
                                                                c1475430oUv2.LJFF = c1476320oWMLIZLLL2.LIZJ;
                                                                c1475430oUv2.LJI = c1476320oWMLIZLLL2.LIZLLL;
                                                                c1475430oUv2.LJII = c1476320oWMLIZLLL2.LJ;
                                                                c1475430oUv2.LIZIZ = c1471550oOfLJ2.LIZ;
                                                                c1475430oUv2.LJIIIIZZ = c1475790oVVLIZ.LIZ;
                                                                if (c1471550oOfLJ2.LIZJ() != null && z) {
                                                                    C1475490oV1 c1475490oV1 = new C1475490oV1(2);
                                                                    c1475490oV1.LIZIZ = c1475430oUv2;
                                                                    c1471550oOfLJ2.LIZJ().LIZ(c1475490oV1);
                                                                    StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                                                                    sbLIZ8.append("[preload] notify end cache size = ");
                                                                    sbLIZ8.append(c1475790oVVLIZ.LIZIZ());
                                                                    C1471660oOq.LIZJ("DataLoaderHelper", C2188811AlT.LIZIZ(sbLIZ8));
                                                                }
                                                                C1476170oW7 c1476170oW77 = dataLoaderHelper.LIZ;
                                                                if (c1476170oW77 == null) {
                                                                    return;
                                                                }
                                                                c1476170oW77.LJIIIIZZ(c1475430oUv2);
                                                                StringBuilder sbLIZ9 = C2188811AlT.LIZ();
                                                                sbLIZ9.append(" task progress. cache end. key = ");
                                                                sbLIZ9.append(str9);
                                                                sbLIZ9.append(", rawKey = ");
                                                                sbLIZ9.append(str6);
                                                                C1471660oOq.LIZJ("DataLoaderHelper", C2188811AlT.LIZIZ(sbLIZ9));
                                                                return;
                                                            } catch (Exception e2) {
                                                                TryCatchGuardChecker.doCheck(e2);
                                                                int i8 = C2187451AjH.LIZ;
                                                                TTVideoEngineLog.d(e2);
                                                                return;
                                                            }
                                                        case 5:
                                                            C1476170oW7 c1476170oW78 = dataLoaderHelper.LIZ;
                                                            if (c1476170oW78 == null) {
                                                                return;
                                                            }
                                                            c1476170oW78.LJ(20, aVMDLDataLoaderNotifyInfo.code, aVMDLDataLoaderNotifyInfo.parameter, aVMDLDataLoaderNotifyInfo.logInfo);
                                                            return;
                                                        case 6:
                                                            try {
                                                                JSONObject jSONObjectLIZ = C2085608Fa.LIZ(aVMDLDataLoaderNotifyInfo.jsonLog);
                                                                if (jSONObjectLIZ == null) {
                                                                    return;
                                                                }
                                                                C1476170oW7 c1476170oW79 = dataLoaderHelper.LIZ;
                                                                if (c1476170oW79 != null) {
                                                                    c1476170oW79.LIZLLL(jSONObjectLIZ);
                                                                }
                                                                int i9 = C2187451AjH.LIZ;
                                                                StringBuilder sbLIZ10 = C2188811AlT.LIZ();
                                                                sbLIZ10.append("receive log:");
                                                                sbLIZ10.append(jSONObjectLIZ);
                                                                TTVideoEngineLog.d("avmdlcdnlog", C2188811AlT.LIZIZ(sbLIZ10));
                                                                return;
                                                            } catch (Exception e3) {
                                                                TryCatchGuardChecker.doCheck(e3);
                                                                return;
                                                            }
                                                        default:
                                                            switch (i5) {
                                                                case BdTuring.TYPE_SMS_VOICE /* 13 */:
                                                                    C1476170oW7 c1476170oW710 = dataLoaderHelper.LIZ;
                                                                    if (c1476170oW710 == null || (jSONObject2 = aVMDLDataLoaderNotifyInfo.jsonLog) == null) {
                                                                        return;
                                                                    }
                                                                    c1476170oW710.LJI(0, aVMDLDataLoaderNotifyInfo.logType, jSONObject2);
                                                                    return;
                                                                case 14:
                                                                    int i10 = C2187451AjH.LIZ;
                                                                    StringBuilder sbLIZ11 = C2188811AlT.LIZ();
                                                                    sbLIZ11.append("MDL Alog: ");
                                                                    sbLIZ11.append(aVMDLDataLoaderNotifyInfo.logInfo);
                                                                    C1471660oOq.LIZJ("DataLoaderHelper", C2188811AlT.LIZIZ(sbLIZ11));
                                                                    return;
                                                                case 15:
                                                                    C0WPR c0wpr3 = dataLoaderHelper.LJIILJJIL;
                                                                    if (c0wpr3 != null) {
                                                                        ((C0WPO) c0wpr3).LIZIZ(aVMDLDataLoaderNotifyInfo.logType, aVMDLDataLoaderNotifyInfo.jsonLog);
                                                                        return;
                                                                    }
                                                                    C1476170oW7 c1476170oW711 = dataLoaderHelper.LIZ;
                                                                    if (c1476170oW711 == null || (jSONObject = aVMDLDataLoaderNotifyInfo.jsonLog) == null) {
                                                                        return;
                                                                    }
                                                                    c1476170oW711.LIZ(aVMDLDataLoaderNotifyInfo.logType, jSONObject);
                                                                    return;
                                                                case 16:
                                                                    C1476170oW7 c1476170oW712 = dataLoaderHelper.LIZ;
                                                                    if (c1476170oW712 == null) {
                                                                        return;
                                                                    }
                                                                    c1476170oW712.LJI(0, aVMDLDataLoaderNotifyInfo.logType, aVMDLDataLoaderNotifyInfo.jsonLog);
                                                                    return;
                                                                default:
                                                                    switch (i5) {
                                                                        case 19:
                                                                            C0WPR c0wpr4 = dataLoaderHelper.LJIILJJIL;
                                                                            if (c0wpr4 != null) {
                                                                                ((C0WPO) c0wpr4).LIZIZ(aVMDLDataLoaderNotifyInfo.logType, aVMDLDataLoaderNotifyInfo.jsonLog);
                                                                                return;
                                                                            }
                                                                            C1476170oW7 c1476170oW713 = dataLoaderHelper.LIZ;
                                                                            if (c1476170oW713 == null) {
                                                                                return;
                                                                            }
                                                                            c1476170oW713.LJI(7, aVMDLDataLoaderNotifyInfo.logType, aVMDLDataLoaderNotifyInfo.jsonLog);
                                                                            return;
                                                                        case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                                                                            break;
                                                                        case 21:
                                                                            String str11 = aVMDLDataLoaderNotifyInfo.logInfo;
                                                                            if (str11 == null) {
                                                                                return;
                                                                            }
                                                                            C0VOT.LJIIIIZZ.getClass();
                                                                            TextUtils.isEmpty(str11);
                                                                            return;
                                                                        case 22:
                                                                            String str12 = aVMDLDataLoaderNotifyInfo.logInfo;
                                                                            if (str12 == null) {
                                                                                return;
                                                                            }
                                                                            C0VOT.LJIIIIZZ.getClass();
                                                                            TextUtils.isEmpty(str12);
                                                                            return;
                                                                        default:
                                                                            switch (i5) {
                                                                                case LSPassThroughRecordSizeConfig.DEFAULT /* 1000 */:
                                                                                case 1001:
                                                                                case 1002:
                                                                                case 1003:
                                                                                case 1005:
                                                                                    C0WPR c0wpr5 = dataLoaderHelper.LJIILJJIL;
                                                                                    if (c0wpr5 != null) {
                                                                                        ((C0WPO) c0wpr5).LIZIZ(aVMDLDataLoaderNotifyInfo.logType, aVMDLDataLoaderNotifyInfo.jsonLog);
                                                                                        return;
                                                                                    }
                                                                                    C1476170oW7 c1476170oW714 = dataLoaderHelper.LIZ;
                                                                                    if (c1476170oW714 == null) {
                                                                                        return;
                                                                                    }
                                                                                    c1476170oW714.LJI(10, aVMDLDataLoaderNotifyInfo.logType, aVMDLDataLoaderNotifyInfo.jsonLog);
                                                                                    return;
                                                                                case 1004:
                                                                                    C0WPR c0wpr6 = dataLoaderHelper.LJIILJJIL;
                                                                                    if (c0wpr6 == null) {
                                                                                        return;
                                                                                    }
                                                                                    ((C0WPO) c0wpr6).LIZJ("videoplayer_mdl_sample", aVMDLDataLoaderNotifyInfo.jsonLog);
                                                                                    return;
                                                                                default:
                                                                                    int i11 = C2187451AjH.LIZ;
                                                                                    StringBuilder sbLIZ12 = C2188811AlT.LIZ();
                                                                                    sbLIZ12.append("NOT DEAL notify info what =  ");
                                                                                    sbLIZ12.append(aVMDLDataLoaderNotifyInfo.what);
                                                                                    TTVideoEngineLog.d("DataLoaderHelper", C2188811AlT.LIZIZ(sbLIZ12));
                                                                                    return;
                                                                            }
                                                                    }
                                                                    break;
                                                            }
                                                            break;
                                                    }
                                                } else {
                                                    int i12 = C2187451AjH.LIZ;
                                                    StringBuilder sbLIZ13 = C2188811AlT.LIZ();
                                                    sbLIZ13.append("KeyIsFileDeleteSizeByUsedTime size: ");
                                                    sbLIZ13.append(aVMDLDataLoaderNotifyInfo.code);
                                                    TTVideoEngineLog.d("DataLoaderHelper", C2188811AlT.LIZIZ(sbLIZ13));
                                                    C1476170oW7 c1476170oW715 = dataLoaderHelper.LIZ;
                                                    if (c1476170oW715 == null) {
                                                        return;
                                                    }
                                                    c1476170oW715.LJ(31, 0L, aVMDLDataLoaderNotifyInfo.code, null);
                                                    return;
                                                }
                                            } else {
                                                int i13 = C2187451AjH.LIZ;
                                                TTVideoEngineLog.d("multinetwork", C786410Ut5.j4("target network:%d current network:%d", new Object[]{Long.valueOf(aVMDLDataLoaderNotifyInfo.parameter), Long.valueOf(aVMDLDataLoaderNotifyInfo.code)}));
                                                String strLJJIJIIJIL = dataLoaderHelper.LJJIJIIJIL(aVMDLDataLoaderNotifyInfo.parameter);
                                                String strLJJIJIIJIL2 = dataLoaderHelper.LJJIJIIJIL(aVMDLDataLoaderNotifyInfo.code);
                                                if (TextUtils.isEmpty(strLJJIJIIJIL) || TextUtils.isEmpty(strLJJIJIIJIL2) || dataLoaderHelper.LIZ == null) {
                                                    return;
                                                }
                                                StringBuilder sbLIZ14 = C2188811AlT.LIZ();
                                                sbLIZ14.append("do callback target: ");
                                                sbLIZ14.append(strLJJIJIIJIL);
                                                sbLIZ14.append(" current: ");
                                                sbLIZ14.append(strLJJIJIIJIL2);
                                                TTVideoEngineLog.d("multinetwork", C2188811AlT.LIZIZ(sbLIZ14));
                                                dataLoaderHelper.LIZ.getClass();
                                                StringBuilder sbLIZ15 = C2188811AlT.LIZ();
                                                sbLIZ15.append("end do callback target: ");
                                                sbLIZ15.append(strLJJIJIIJIL);
                                                sbLIZ15.append(" current: ");
                                                sbLIZ15.append(strLJJIJIIJIL2);
                                                TTVideoEngineLog.d("multinetwork", C2188811AlT.LIZIZ(sbLIZ15));
                                                return;
                                            }
                                        } else {
                                            return;
                                        }
                                    } else {
                                        dataLoaderHelper.getClass();
                                        return;
                                    }
                                } else {
                                    C0WPR c0wpr7 = dataLoaderHelper.LJIILJJIL;
                                    if (c0wpr7 != null) {
                                        ((C0WPO) c0wpr7).LIZIZ(aVMDLDataLoaderNotifyInfo.logType, aVMDLDataLoaderNotifyInfo.jsonLog);
                                        return;
                                    }
                                    C1476170oW7 c1476170oW716 = dataLoaderHelper.LIZ;
                                    if (c1476170oW716 == null) {
                                        return;
                                    }
                                    c1476170oW716.LJI(5, aVMDLDataLoaderNotifyInfo.logType, aVMDLDataLoaderNotifyInfo.jsonLog);
                                    int i14 = C2187451AjH.LIZ;
                                    StringBuilder sbLIZ16 = C2188811AlT.LIZ();
                                    sbLIZ16.append("live loader log sample msg: ");
                                    sbLIZ16.append(aVMDLDataLoaderNotifyInfo.logInfo);
                                    TTVideoEngineLog.d("DataLoaderHelper", C2188811AlT.LIZIZ(sbLIZ16));
                                    return;
                                }
                            } else {
                                C0WPR c0wpr8 = dataLoaderHelper.LJIILJJIL;
                                if (c0wpr8 != null) {
                                    ((C0WPO) c0wpr8).LIZIZ(aVMDLDataLoaderNotifyInfo.logType, aVMDLDataLoaderNotifyInfo.jsonLog);
                                    return;
                                }
                                C1476170oW7 c1476170oW717 = dataLoaderHelper.LIZ;
                                if (c1476170oW717 == null) {
                                    return;
                                }
                                c1476170oW717.LJI(4, aVMDLDataLoaderNotifyInfo.logType, aVMDLDataLoaderNotifyInfo.jsonLog);
                                int i15 = C2187451AjH.LIZ;
                                StringBuilder sbLIZ17 = C2188811AlT.LIZ();
                                sbLIZ17.append("live loader log msg: ");
                                sbLIZ17.append(aVMDLDataLoaderNotifyInfo.logInfo);
                                TTVideoEngineLog.d("DataLoaderHelper", C2188811AlT.LIZIZ(sbLIZ17));
                                return;
                            }
                        } else {
                            int i16 = C2187451AjH.LIZ;
                            StringBuilder sbLIZ18 = C2188811AlT.LIZ();
                            sbLIZ18.append("KeyIsSpeedTestSampledByTime  mNeedSpeedTestByTimeInternal:");
                            sbLIZ18.append(dataLoaderHelper.LJJIIJZLJL);
                            sbLIZ18.append(" code:");
                            sbLIZ18.append(aVMDLDataLoaderNotifyInfo.code);
                            TTVideoEngineLog.d("DataLoaderHelper", C2188811AlT.LIZIZ(sbLIZ18));
                            int i17 = dataLoaderHelper.LJJIIJZLJL;
                            if (i17 != 1) {
                                i2 = 2;
                                if (i17 != 2) {
                                    i3 = -1;
                                } else {
                                    i3 = 32;
                                }
                            } else {
                                i2 = 2;
                                i3 = 2;
                            }
                            if (dataLoaderHelper.LIZ == null || i3 == -1) {
                                return;
                            }
                            StringBuilder sbLIZ19 = C2188811AlT.LIZ();
                            sbLIZ19.append("KeyIsSpeedTestSampledByTimenotify by");
                            if (i3 == i2) {
                                str5 = "general";
                            } else {
                                str5 = "timeinternal";
                            }
                            sbLIZ19.append(str5);
                            sbLIZ19.append("speed info code:");
                            sbLIZ19.append(aVMDLDataLoaderNotifyInfo.code);
                            sbLIZ19.append(" parameter:");
                            sbLIZ19.append(aVMDLDataLoaderNotifyInfo.parameter);
                            TTVideoEngineLog.d("DataLoaderHelper", C2188811AlT.LIZIZ(sbLIZ19));
                            dataLoaderHelper.LIZ.LJ(i3, aVMDLDataLoaderNotifyInfo.code, aVMDLDataLoaderNotifyInfo.parameter, aVMDLDataLoaderNotifyInfo.logInfo);
                            return;
                        }
                    } else {
                        JSONObject jSONObject4 = aVMDLDataLoaderNotifyInfo.jsonLog;
                        try {
                            C790190UzB c790190UzB = C790190UzB.LIZLLL;
                            long jLIZ = c790190UzB.LIZ();
                            if (jLIZ > 0) {
                                jSONObject4.put("_play_waste_data", jLIZ);
                            }
                            synchronized (c790190UzB) {
                                j = c790190UzB.LIZJ;
                                c790190UzB.LIZJ = 0L;
                            }
                            if (j > 0) {
                                jSONObject4.put("_play_consumed_data", j);
                            }
                        } catch (Exception e4) {
                            TryCatchGuardChecker.doCheck(e4);
                        }
                        aVMDLDataLoaderNotifyInfo.jsonLog = jSONObject4;
                        C0WPR c0wpr9 = dataLoaderHelper.LJIILJJIL;
                        if (c0wpr9 != null) {
                            ((C0WPO) c0wpr9).LIZIZ(aVMDLDataLoaderNotifyInfo.logType, jSONObject4);
                            return;
                        }
                        C1476170oW7 c1476170oW718 = dataLoaderHelper.LIZ;
                        if (c1476170oW718 != null) {
                            c1476170oW718.LJI(3, aVMDLDataLoaderNotifyInfo.logType, jSONObject4);
                        }
                        int i18 = C2187451AjH.LIZ;
                        StringBuilder sbLIZ20 = C2188811AlT.LIZ();
                        sbLIZ20.append("heart beat msg: ");
                        sbLIZ20.append(aVMDLDataLoaderNotifyInfo.logInfo);
                        TTVideoEngineLog.d("DataLoaderHelper", C2188811AlT.LIZIZ(sbLIZ20));
                        return;
                    }
                } else {
                    return;
                }
            } else {
                C1476170oW7 c1476170oW719 = dataLoaderHelper.LIZ;
                if (c1476170oW719 == null) {
                    return;
                }
                c1476170oW719.LJ(30, 0L, aVMDLDataLoaderNotifyInfo.parameter, aVMDLDataLoaderNotifyInfo.logInfo);
                return;
            }
        }
        String str13 = aVMDLDataLoaderNotifyInfo.logInfo;
        if (str13 == null) {
            return;
        }
        if (aVMDLDataLoaderNotifyInfo.parameter == 3) {
            long j3 = aVMDLDataLoaderNotifyInfo.code;
            C0VOT c0vot = C0VOT.LJIIIIZZ;
            int i19 = (int) j3;
            if (i19 != -5000) {
                if (i19 != -4000) {
                    if (i19 != -2000) {
                        if (i19 != -3001) {
                            if (i19 != -3000) {
                                switch (i19) {
                                    case -1002:
                                        str4 = "Waiting for too many tasks, > 20";
                                        break;
                                    case -1001:
                                        str4 = "add the same key task.";
                                        break;
                                    case C386801es.DEFAULT /* -1000 */:
                                        str4 = "create preload task fail.";
                                        break;
                                    default:
                                        str4 = "task fail. reply task error.";
                                        break;
                                }
                            } else {
                                if (!C787250UuR.LIZIZ(dataLoaderHelper.LJIIJ)) {
                                    i = -9960;
                                } else {
                                    i = -9945;
                                }
                                str4 = "url invalid. response status code >= 400";
                            }
                        } else {
                            str4 = "server invalid. response status code >= 500";
                            i = -9944;
                        }
                    } else {
                        str4 = "media data content length invalid";
                    }
                } else {
                    str4 = "request invalid.";
                }
                i = i19;
            } else {
                str4 = "write file fail.";
                i = -9948;
            }
            StringBuilder sbLIZ21 = C2188811AlT.LIZ();
            sbLIZ21.append("key = ");
            sbLIZ21.append(str13);
            sbLIZ21.append(", reason = ");
            sbLIZ21.append(str4);
            new e("kTTVideoErrorDomainDownload", i, i19, C2188811AlT.LIZIZ(sbLIZ21));
            c0vot.getClass();
            TextUtils.isEmpty(str13);
            return;
        }
        int i20 = C2187451AjH.LIZ;
        StringBuilder sbLIZ22 = C2188811AlT.LIZ();
        sbLIZ22.append(" task fail log = ");
        sbLIZ22.append(aVMDLDataLoaderNotifyInfo.logInfo);
        sbLIZ22.append(", code = ");
        sbLIZ22.append(aVMDLDataLoaderNotifyInfo.code);
        sbLIZ22.append(", task type = ");
        sbLIZ22.append(aVMDLDataLoaderNotifyInfo.parameter);
        C1471660oOq.LIZJ("DataLoaderHelper", C2188811AlT.LIZIZ(sbLIZ22));
        String[] strArrSplit2 = aVMDLDataLoaderNotifyInfo.logInfo.split(",");
        if (strArrSplit2.length < 1 || (c1471550oOfLJ = dataLoaderHelper.LJ.LJ((str = strArrSplit2[0]))) == null) {
            return;
        }
        C1476330oWN c1476330oWN2 = dataLoaderHelper.LJ;
        e eVar = new e("kTTVideoErrorDomainDataLoaderPreload", (int) aVMDLDataLoaderNotifyInfo.code, 0, aVMDLDataLoaderNotifyInfo.logInfo);
        if (TextUtils.isEmpty(c1471550oOfLJ.LIZ)) {
            str2 = str;
        } else {
            str2 = c1471550oOfLJ.LIZ;
        }
        C1476210oWB c1476210oWB2 = C1476340oWO.LIZ;
        C1475790oVV c1475790oVVLIZ2 = c1476210oWB2.LIZ(str2);
        if (c1475790oVVLIZ2 == null) {
            c1475790oVVLIZ2 = new C1475790oVV();
        }
        c1475790oVVLIZ2.LIZ = (int) aVMDLDataLoaderNotifyInfo.parameter;
        c1475790oVVLIZ2.LJ(c1471550oOfLJ);
        C1475770oVT c1475770oVTLIZ = c1475790oVVLIZ2.LIZ(str);
        if (c1475770oVTLIZ != null) {
            c1475770oVTLIZ.LJFF = eVar;
        }
        C1476170oW7 c1476170oW720 = dataLoaderHelper.LIZ;
        if (c1476170oW720 != null) {
            c1476170oW720.LIZIZ(c1475790oVVLIZ2);
        }
        c1476210oWB2.LIZIZ(str2, c1475790oVVLIZ2);
        if (!c1475790oVVLIZ2.LIZJ() && !c1475790oVVLIZ2.LIZLLL()) {
            return;
        }
        c1476330oWN2.LJI(str);
        StringBuilder sbLIZ23 = C2188811AlT.LIZ();
        sbLIZ23.append("pop all task item. videoId = ");
        sbLIZ23.append(c1471550oOfLJ.LIZ);
        sbLIZ23.append(" key = ");
        sbLIZ23.append(str);
        C1471660oOq.LIZJ("DataLoaderHelper", C2188811AlT.LIZIZ(sbLIZ23));
        c1476210oWB2.LIZJ(str2);
        if (dataLoaderHelper.LIZ != null) {
            C1475430oUv c1475430oUv3 = new C1475430oUv();
            c1475430oUv3.LJIIIIZZ = (int) aVMDLDataLoaderNotifyInfo.parameter;
            c1475430oUv3.LIZIZ = c1471550oOfLJ.LIZ;
            c1475430oUv3.LIZ = str;
            C1475600oVC c1475600oVC = c1471550oOfLJ.LJIIJ;
            if (c1475600oVC != null && (str3 = c1475600oVC.LIZIZ) != null) {
                c1475430oUv3.LIZJ = str3;
                c1475430oUv3.LIZ = null;
            }
            dataLoaderHelper.LIZ.LJIIIIZZ(c1475430oUv3);
        }
        if (c1471550oOfLJ.LIZJ() == null || aVMDLDataLoaderNotifyInfo.parameter != 2) {
            return;
        }
        C1475490oV1 c1475490oV12 = new C1475490oV1(3);
        c1475490oV12.LIZJ = eVar;
        c1475490oV12.LIZIZ = null;
        c1471550oOfLJ.LIZJ().LIZ(c1475490oV12);
    }
}
