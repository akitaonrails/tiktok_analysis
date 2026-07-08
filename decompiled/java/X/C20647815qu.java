package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.common.util.concurrent.ListenableFuture;
import com.ss.android.ugc.aweme.outreach.dispersion.data.DispersionModel;
import com.ss.android.ugc.aweme.outreach.dispersion.data.OutreachMultiGroupListModel;
import com.ss.android.ugc.aweme.outreach.dispersion.data.OutreachRecordResponseModel;
import com.ss.android.ugc.aweme.outreach.dispersion.data.OutreachRecordResultModel;
import com.ss.android.ugc.aweme.outreach.dispersion.data.OutreachRecordSnapshot;
import com.ss.android.ugc.aweme.outreach.dispersion.data.OutreachRecordSyncRequestParams;
import com.ss.android.ugc.aweme.outreach.dispersion.data.OutreachSyncConfigModel;
import com.ss.android.ugc.aweme.outreach.dispersion.save.OutreachRecordConfig;
import com.ss.android.ugc.aweme.outreach.dispersion.save.OutreachRecordData;
import com.ss.android.ugc.aweme.outreach.dispersion.synchronize.OutreachRecordSyncApi;
import com.ss.android.ugc.aweme.outreach.dispersion.synchronize.SyncAPI;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS276S0000000_31;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.15qu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20647815qu {
    public static final C20647815qu LIZ = new C20647815qu();
    public static boolean LIZIZ;
    public static boolean LIZJ;

    public static void LJFF(final DispersionModel dispersionModel) {
        C20571715ed c20571715ed = C20571715ed.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("initInternal, dispersionData: ");
        sbLIZ.append(dispersionModel);
        C2188811AlT.LIZIZ(sbLIZ);
        c20571715ed.getClass();
        C823050WQl.LJFF().submit(new Runnable() { // from class: X.15r5
            public final void LIZ() {
                C20650415rK.LIZ.getClass();
                C1590630rUj.LIZ = C20650415rK.LJ;
                C20648815r4 c20648815r4 = C20648815r4.LIZ;
                DispersionModel dispersionModel2 = dispersionModel;
                c20648815r4.getClass();
                C20648815r4.LJIIL(dispersionModel2);
                DispersionModel dispersionModel3 = dispersionModel;
                OutreachRecordConfig outreachRecordConfig = null;
                if (!C20649215r8.LIZ) {
                    HashMap<EnumC20654715s1, HashMap<String, C20650615rM>> map = new HashMap<>();
                    C20647815qu.LIZ.getClass();
                    if (C20647815qu.LIZJ) {
                        List<OutreachMultiGroupListModel> list = dispersionModel3.multiGroupList;
                        if (list != null) {
                            for (OutreachMultiGroupListModel outreachMultiGroupListModel : list) {
                                C20649215r8.LIZIZ(outreachMultiGroupListModel.groupKey, map, outreachMultiGroupListModel.dataGroupList);
                            }
                        }
                    } else {
                        C20649215r8.LIZIZ(null, map, dispersionModel3.dataGroupList);
                    }
                    C20649215r8.LIZIZ = map;
                    C20649215r8.LIZ = true;
                }
                C20648315qz.LIZ.getClass();
                try {
                    String string = ((Keva) C20648315qz.LIZLLL.getValue()).getString("outreach_time_cache", "");
                    C20571715ed c20571715ed2 = C20571715ed.LIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("initTimeWindowFromCache, timeCache = ");
                    sbLIZ2.append(string);
                    sbLIZ2.append(", isInitFromLogout = ");
                    sbLIZ2.append(C20648315qz.LJII);
                    C2188811AlT.LIZIZ(sbLIZ2);
                    c20571715ed2.getClass();
                    if (C123100dR.LIZ(string)) {
                        C20647215qo c20647215qo = (C20647215qo) C09C2.LIZ().LJII(string, C20647215qo.class);
                        C20648315qz.LJI = c20647215qo;
                        if (c20647215qo == null) {
                            C20648315qz.LJI = new C20647215qo();
                        }
                    } else {
                        C20648315qz.LJI = new C20647215qo();
                    }
                    C20647215qo c20647215qo2 = C20648315qz.LJI;
                    if (c20647215qo2 != null && c20647215qo2.LIZ == null && c20647215qo2 != null) {
                        c20647215qo2.LIZ = new ArrayList<>();
                    }
                    C20647215qo c20647215qo3 = C20648315qz.LJI;
                    if (c20647215qo3 != null && c20647215qo3.LIZIZ == null && c20647215qo3 != null) {
                        c20647215qo3.LIZIZ = new ArrayList<>();
                    }
                    boolean z = C20648315qz.LJII;
                    C20648315qz.LJII = false;
                    C20648315qz.LJIIJJI(!z);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C20571715ed c20571715ed3 = C20571715ed.LIZ;
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("initTimeWindowFromCache exception: ");
                    sbLIZ3.append(e);
                    C2188811AlT.LIZIZ(sbLIZ3);
                    c20571715ed3.getClass();
                }
                C20648715r3.LIZ.getClass();
                try {
                    String string2 = C20648715r3.LIZIZ().getString("outreach_record_cache", "");
                    C20571715ed c20571715ed4 = C20571715ed.LIZ;
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("initRecordFromCache, cache = ");
                    sbLIZ4.append(string2);
                    C2188811AlT.LIZIZ(sbLIZ4);
                    c20571715ed4.getClass();
                    if (C123100dR.LIZ(string2)) {
                        try {
                            outreachRecordConfig = (OutreachRecordConfig) C09C2.LIZ().LJII(string2, OutreachRecordConfig.class);
                        } catch (Exception e2) {
                            TryCatchGuardChecker.doCheck(e2);
                            C20648715r3.LJ = true;
                        }
                        C20648715r3.LJI = outreachRecordConfig;
                    }
                    if (C20648715r3.LJI == null) {
                        C20648715r3.LJI = new OutreachRecordConfig();
                        C20571715ed.LIZ.getClass();
                        C20571715ed.LIZ("initRecordFromCache recordConfig is null");
                    } else {
                        C20649415rA.LIZ.getClass();
                        if (C20649415rA.LIZ()) {
                            C20649415rA.LIZIZ();
                            C20649315r9.LIZ.getClass();
                            C20649315r9.LIZIZ();
                        }
                        C20648715r3.LIZLLL();
                    }
                } catch (Exception e3) {
                    TryCatchGuardChecker.doCheck(e3);
                    C20571715ed c20571715ed5 = C20571715ed.LIZ;
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append("initRecordFromCache exception: ");
                    sbLIZ5.append(e3);
                    C2188811AlT.LIZIZ(sbLIZ5);
                    c20571715ed5.getClass();
                }
                C20649015r6.LIZ.getClass();
                if (C282000B3m.LIZ()) {
                    C20649415rA.LIZ.getClass();
                    if (C20649415rA.LIZ()) {
                        C20649315r9.LIZ.getClass();
                        C20648715r3.LIZ.getClass();
                        boolean z2 = C20648715r3.LIZIZ().getBoolean("last_full_sync_flag", true);
                        C20649315r9.LJ = z2;
                        if (z2) {
                            C20571715ed.LIZ.getClass();
                            long jLIZIZ = C20649415rA.LIZIZ();
                            C20649615rC c20649615rC = new C20649615rC();
                            String strLIZ = C20649015r6.LIZ(jLIZIZ);
                            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                            sbLIZ6.append("checkMD5, startTime: ");
                            sbLIZ6.append(jLIZIZ);
                            sbLIZ6.append(", syncRecordStr: ");
                            sbLIZ6.append(strLIZ);
                            C2188811AlT.LIZIZ(sbLIZ6);
                            String strLIZ2 = C448720Hig.LIZ(strLIZ);
                            StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                            sbLIZ7.append("checkMD5, get MD5: ");
                            sbLIZ7.append(strLIZ2);
                            C2188811AlT.LIZIZ(sbLIZ7);
                            C20650815rO c20650815rO = new C20650815rO();
                            Long lValueOf = Long.valueOf(jLIZIZ);
                            C20648315qz.LIZ.getClass();
                            c20650815rO.LIZLLL = new OutreachRecordSnapshot(strLIZ2, lValueOf, Long.valueOf(C20648315qz.LJII()));
                            final C1868750yjJ c1868750yjJ = new C1868750yjJ(c20649615rC);
                            c20650815rO.LIZIZ = EnumC1779290wP1.CHECK_MD5.getType();
                            OutreachRecordSyncRequestParams outreachRecordSyncRequestParamsLIZ = c20650815rO.LIZ();
                            SyncAPI.LIZ.getClass();
                            ListenableFuture<OutreachRecordResponseModel> listenableFutureRecordSync = OutreachRecordSyncApi.LIZIZ.recordSync(outreachRecordSyncRequestParamsLIZ);
                            listenableFutureRecordSync.LJIIJJI(new C135Q(listenableFutureRecordSync, new C11U6<OutreachRecordResponseModel>() { // from class: X.15rF
                                @Override // X.C11U6
                                public final void onFailure(Throwable th) {
                                    C20571715ed c20571715ed6 = C20571715ed.LIZ;
                                    StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                                    sbLIZ8.append("check MD5 fail, ");
                                    sbLIZ8.append(th);
                                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ8);
                                    c20571715ed6.getClass();
                                    C20571715ed.LIZ(strLIZIZ);
                                    c1868750yjJ.invoke(Boolean.FALSE);
                                }

                                @Override // X.C11U6
                                public final void onSuccess(OutreachRecordResponseModel outreachRecordResponseModel) {
                                    Boolean boolValueOf;
                                    Integer num;
                                    OutreachRecordResultModel outreachRecordResultModel;
                                    OutreachRecordResponseModel outreachRecordResponseModel2 = outreachRecordResponseModel;
                                    C20571715ed c20571715ed6 = C20571715ed.LIZ;
                                    StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                                    sbLIZ8.append("check MD5 success, fullSync: ");
                                    if (outreachRecordResponseModel2 != null && (outreachRecordResultModel = outreachRecordResponseModel2.result) != null) {
                                        boolValueOf = Boolean.valueOf(outreachRecordResultModel.fullSync);
                                    } else {
                                        boolValueOf = null;
                                    }
                                    sbLIZ8.append(boolValueOf);
                                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ8);
                                    c20571715ed6.getClass();
                                    C20571715ed.LIZ(strLIZIZ);
                                    boolean z3 = false;
                                    if (outreachRecordResponseModel2 != null && (num = outreachRecordResponseModel2.statusCode) != null && num.intValue() == 0) {
                                        Function1<Boolean, Unit> function1 = c1868750yjJ;
                                        OutreachRecordResultModel outreachRecordResultModel2 = outreachRecordResponseModel2.result;
                                        if (outreachRecordResultModel2 != null) {
                                            z3 = outreachRecordResultModel2.fullSync;
                                        }
                                        function1.invoke(Boolean.valueOf(z3));
                                        return;
                                    }
                                    c1868750yjJ.invoke(Boolean.FALSE);
                                }
                            }), EnumC2272608vM.LL);
                        } else {
                            C20649015r6.LIZIZ(EnumC1779290wP1.FULL_SYNC, ((OutreachSyncConfigModel) C20649415rA.LIZLLL.getValue()).retryTimes);
                        }
                    }
                }
                C20647815qu.LIZ.getClass();
                C20647815qu.LIZIZ = true;
                if (C0B7J.LIZ()) {
                    for (OutreachRecordData outreachRecordData : C20652815ri.LIZ) {
                        C20648815r4.LIZ.getClass();
                        C20648815r4.LIZJ(outreachRecordData, true, false);
                    }
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("DispersionManager@4571.initInternal$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("DispersionManager@4571.initInternal$1");
            }
        });
    }

    public static C20648115qx LJ(OutreachRecordData outreachRecordData, boolean z) throws JSONException {
        boolean z2;
        String strLJFF;
        CopyOnWriteArrayList<OutreachRecordData> dispersalOutreachRecords;
        C20648515r1 dispersalRule;
        CopyOnWriteArrayList<OutreachRecordData> copyOnWriteArrayList;
        C20648515r1 dispersalRule2;
        String strLJFF2;
        C20648815r4.LIZ.getClass();
        C20648115qx c20648115qxLIZJ = C20648815r4.LIZJ(outreachRecordData, z, false);
        if (((Boolean) C0AO8.LIZ.getValue()).booleanValue() && C282000B3m.LIZ()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            C20647415qq.LIZ.getClass();
            if (c20648115qxLIZJ.LIZ()) {
                C20571715ed.LIZ.getClass();
            } else {
                C20648515r1 dispersalRule3 = outreachRecordData.getDispersalRule();
                if (dispersalRule3 == null) {
                    C20571715ed.LIZ.getClass();
                    C20571715ed.LIZ("reportDispersion, match rule is null!");
                } else {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("component_type", outreachRecordData.getOutreachType());
                    jSONObject.put("component_key", outreachRecordData.getKey());
                    if (C123100dR.LIZ(outreachRecordData.getEnterFrom())) {
                        strLJFF2 = outreachRecordData.getEnterFrom();
                    } else {
                        C1584320rKY c1584320rKY = C1584320rKY.LIZ;
                        String scene = outreachRecordData.getScene();
                        c1584320rKY.getClass();
                        strLJFF2 = C1584320rKY.LJFF(scene);
                    }
                    jSONObject.put("enter_from", strLJFF2);
                    jSONObject.put("dispersal_reason", dispersalRule3.LIZ);
                    jSONObject.put("group_id", outreachRecordData.getGroupId());
                    jSONObject.put("trigger_id", outreachRecordData.getTriggerId());
                    C20684815ws.LJIJ("cross_touchpoint_block", jSONObject);
                }
            }
        } else {
            C20647415qq.LIZ.getClass();
            if (c20648115qxLIZJ.LIZ()) {
                C20571715ed.LIZ.getClass();
            } else {
                C20648515r1 dispersalRule4 = outreachRecordData.getDispersalRule();
                if (dispersalRule4 == null) {
                    C20571715ed.LIZ.getClass();
                    C20571715ed.LIZ("reportDispersion, match rule is null!");
                } else {
                    JSONObject jSONObject2 = new JSONObject();
                    if (C123100dR.LIZ(outreachRecordData.getEnterFrom())) {
                        strLJFF = outreachRecordData.getEnterFrom();
                    } else {
                        C1584320rKY c1584320rKY2 = C1584320rKY.LIZ;
                        String scene2 = outreachRecordData.getScene();
                        c1584320rKY2.getClass();
                        strLJFF = C1584320rKY.LJFF(scene2);
                    }
                    if (outreachRecordData.getDispersalRule() == null || (dispersalRule = outreachRecordData.getDispersalRule()) == null || (copyOnWriteArrayList = dispersalRule.LJIIIIZZ) == null || !(!copyOnWriteArrayList.isEmpty()) || (dispersalRule2 = outreachRecordData.getDispersalRule()) == null || (dispersalOutreachRecords = dispersalRule2.LJIIIIZZ) == null) {
                        dispersalOutreachRecords = outreachRecordData.getDispersalOutreachRecords();
                    }
                    C443120HZe c443120HZe = new C443120HZe(AnonymousClass0119.LIZ(dispersalOutreachRecords, AFwS276S0000000_31.get$arr$(357)), AnonymousClass0119.LIZ(dispersalOutreachRecords, AFwS276S0000000_31.get$arr$(358)), AnonymousClass0119.LIZ(dispersalOutreachRecords, AFwS276S0000000_31.get$arr$(359)));
                    jSONObject2.put("enter_from", strLJFF);
                    jSONObject2.put("outreach_type", outreachRecordData.getOutreachType());
                    jSONObject2.put("outreach_key", outreachRecordData.getKey());
                    jSONObject2.put("outreach_id", outreachRecordData.getTriggerId());
                    jSONObject2.put("block_outreach_type", c443120HZe.getFirst());
                    jSONObject2.put("block_outreach_key", c443120HZe.getSecond());
                    jSONObject2.put("block_outreach_id", c443120HZe.getThird());
                    jSONObject2.put("block_strategy_type", "frequency_control_strategy");
                    jSONObject2.put("block_strategy_detail", dispersalRule4.LIZ);
                    jSONObject2.put("block_time", "client_last");
                    jSONObject2.put("extra_info", outreachRecordData.getLogId());
                    C20684815ws.LJIJ("outreach_block_detail", jSONObject2);
                }
            }
        }
        C20571715ed c20571715ed = C20571715ed.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("commitOutreachTask, result: ");
        sbLIZ.append(c20648115qxLIZJ.LIZ);
        sbLIZ.append(", ");
        sbLIZ.append(c20648115qxLIZJ.LIZIZ);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c20571715ed.getClass();
        C20571715ed.LIZ(strLIZIZ);
        new Object() { // from class: X.15qv
            public static final C01GW LIZIZ = C452501pT.LIZIZ(new C20648015qw());
        }.getClass();
        return c20648115qxLIZJ;
    }

    public static void LIZJ(String str, String str2, String str3) {
        String str4 = str3;
        if (!C282000B3m.LIZ()) {
            return;
        }
        C20649415rA c20649415rA = C20649415rA.LIZ;
        EnumC20654715s1 enumC20654715s1 = EnumC20654715s1.SPECIAL_CARD;
        String typeName = enumC20654715s1.getTypeName();
        c20649415rA.getClass();
        if (!C20649415rA.LIZJ(str, typeName)) {
            C20571715ed c20571715ed = C20571715ed.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("addSpecialCardRecord, is not in sync list, return: ");
            sbLIZ.append(str);
            C2188811AlT.LIZIZ(sbLIZ);
            c20571715ed.getClass();
            return;
        }
        C20571715ed c20571715ed2 = C20571715ed.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("addSpecialCardRecord, cardIType: ");
        sbLIZ2.append(str);
        sbLIZ2.append(", awemeId: ");
        sbLIZ2.append(str2);
        C2188811AlT.LIZIZ(sbLIZ2);
        c20571715ed2.getClass();
        C20648715r3.LIZ.getClass();
        if (!C20648715r3.LIZ(str, str2)) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("card duplicated, cardIType: ");
            sbLIZ3.append(str);
            sbLIZ3.append(", awemeId: ");
            sbLIZ3.append(str2);
            C2188811AlT.LIZIZ(sbLIZ3);
            return;
        }
        C20648315qz.LIZ.getClass();
        long jLJII = C20648315qz.LJII();
        if (jLJII == 0) {
            jLJII = System.currentTimeMillis();
        }
        String typeName2 = enumC20654715s1.getTypeName();
        String strLJI = C20648315qz.LJI(new Date(jLJII));
        String str5 = C20648315qz.LJFF;
        if (str4 == null) {
            str4 = "";
        }
        OutreachRecordData outreachRecordData = new OutreachRecordData(typeName2, str, null, "hot", strLJI, str5, str4);
        outreachRecordData.setAwemeId(str2);
        outreachRecordData.setShowTimeMiles(Long.valueOf(jLJII));
        C20648715r3.LJ(outreachRecordData);
    }

    public static void LIZLLL(String str, String str2, String str3) {
        String str4 = str3;
        if (!C282000B3m.LIZ()) {
            return;
        }
        C20649415rA c20649415rA = C20649415rA.LIZ;
        EnumC20654715s1 enumC20654715s1 = EnumC20654715s1.SURVEY_CARD;
        String typeName = enumC20654715s1.getTypeName();
        c20649415rA.getClass();
        if (!C20649415rA.LIZJ(str, typeName)) {
            C20571715ed c20571715ed = C20571715ed.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("addSurveyRecord, is not in sync list, return: ");
            sbLIZ.append(str);
            C2188811AlT.LIZIZ(sbLIZ);
            c20571715ed.getClass();
            return;
        }
        C20571715ed c20571715ed2 = C20571715ed.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("addSurveyRecord, surveyId: ");
        sbLIZ2.append(str);
        sbLIZ2.append(", awemeId: ");
        sbLIZ2.append(str2);
        C2188811AlT.LIZIZ(sbLIZ2);
        c20571715ed2.getClass();
        C20648715r3.LIZ.getClass();
        if (!C20648715r3.LIZ(str, str2)) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("survey duplicated, surveyId: ");
            sbLIZ3.append(str);
            sbLIZ3.append(", awemeId: ");
            sbLIZ3.append(str2);
            C2188811AlT.LIZIZ(sbLIZ3);
            return;
        }
        C20648315qz.LIZ.getClass();
        long jLJII = C20648315qz.LJII();
        if (jLJII == 0) {
            jLJII = System.currentTimeMillis();
        }
        String typeName2 = enumC20654715s1.getTypeName();
        String strLJI = C20648315qz.LJI(new Date(jLJII));
        String str5 = C20648315qz.LJFF;
        if (str4 == null) {
            str4 = "";
        }
        OutreachRecordData outreachRecordData = new OutreachRecordData(typeName2, str, null, "hot", strLJI, str5, str4);
        outreachRecordData.setAwemeId(str2);
        outreachRecordData.setShowTimeMiles(Long.valueOf(jLJII));
        C20648715r3.LJ(outreachRecordData);
    }

    public static void LIZ(EnumC20654715s1 enumC20654715s1, String str, String str2, String str3, String str4) {
        String str5 = str3;
        if (!C282000B3m.LIZ()) {
            return;
        }
        C20649415rA c20649415rA = C20649415rA.LIZ;
        String typeName = enumC20654715s1.getTypeName();
        c20649415rA.getClass();
        if (C20649415rA.LIZJ(str, typeName)) {
            C20571715ed c20571715ed = C20571715ed.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("addOutreachShowRecord, in sync list, key: ");
            sbLIZ.append(str);
            sbLIZ.append(", type: ");
            sbLIZ.append(enumC20654715s1.getTypeName());
            C2188811AlT.LIZIZ(sbLIZ);
            c20571715ed.getClass();
        } else if (C20649215r8.LIZ(str, str2, enumC20654715s1) != null) {
            C20571715ed c20571715ed2 = C20571715ed.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("addOutreachShowRecord, in dispersion list, key: ");
            sbLIZ2.append(str);
            sbLIZ2.append(", type: ");
            sbLIZ2.append(enumC20654715s1.getTypeName());
            C2188811AlT.LIZIZ(sbLIZ2);
            c20571715ed2.getClass();
        } else {
            C20571715ed c20571715ed3 = C20571715ed.LIZ;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("addOutreachShowRecord, not in dispersion list, key: ");
            sbLIZ3.append(str);
            sbLIZ3.append(", type: ");
            sbLIZ3.append(enumC20654715s1.getTypeName());
            C2188811AlT.LIZIZ(sbLIZ3);
            c20571715ed3.getClass();
            return;
        }
        C20648315qz.LIZ.getClass();
        long jLJII = C20648315qz.LJII();
        if (jLJII == 0) {
            jLJII = System.currentTimeMillis();
        }
        String typeName2 = enumC20654715s1.getTypeName();
        String str6 = "";
        if (str5 == null) {
            str5 = "";
        }
        String strLJI = C20648315qz.LJI(new Date(jLJII));
        String str7 = C20648315qz.LJFF;
        if (str4 != null) {
            str6 = str4;
        }
        OutreachRecordData outreachRecordData = new OutreachRecordData(typeName2, str, str2, str5, strLJI, str7, str6);
        outreachRecordData.setShowTimeMiles(Long.valueOf(jLJII));
        C20648715r3.LIZ.getClass();
        C20648715r3.LJ(outreachRecordData);
    }
}
