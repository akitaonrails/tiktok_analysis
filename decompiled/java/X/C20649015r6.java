package X;

import Y.ARunnableS42S0101000_31;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.common.util.concurrent.ListenableFuture;
import com.ss.android.ugc.aweme.outreach.dispersion.data.OutreachRecordResponseModel;
import com.ss.android.ugc.aweme.outreach.dispersion.data.OutreachRecordResultModel;
import com.ss.android.ugc.aweme.outreach.dispersion.data.OutreachRecordSnapshot;
import com.ss.android.ugc.aweme.outreach.dispersion.data.OutreachRecordSyncRequestParams;
import com.ss.android.ugc.aweme.outreach.dispersion.data.OutreachRecords;
import com.ss.android.ugc.aweme.outreach.dispersion.data.OutreachSyncConfigModel;
import com.ss.android.ugc.aweme.outreach.dispersion.data.SyncOutreachModel;
import com.ss.android.ugc.aweme.outreach.dispersion.save.OutreachRecordData;
import com.ss.android.ugc.aweme.outreach.dispersion.synchronize.OutreachRecordSyncApi;
import com.ss.android.ugc.aweme.outreach.dispersion.synchronize.SyncAPI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentSkipListSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AwS168S0101000_31;
import kotlin.jvm.internal.AwS184S0101000_31;
import kotlin.text.Regex;

/* JADX INFO: renamed from: X.15r6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20649015r6 {
    public static final C20649015r6 LIZ = new C20649015r6();
    public static long LIZIZ;
    public static AwS168S0101000_31 LIZJ;
    public static boolean LIZLLL;

    public static String LIZ(long j) {
        long jLongValue;
        ArrayList arrayList = new ArrayList();
        C20649315r9 c20649315r9 = C20649315r9.LIZ;
        EnumC20650315rJ enumC20650315rJ = EnumC20650315rJ.SYNCED;
        c20649315r9.getClass();
        for (OutreachRecordData outreachRecordData : C20649315r9.LIZ(enumC20650315rJ)) {
            String key = outreachRecordData.getKey();
            String outreachType = outreachRecordData.getOutreachType();
            String scene = outreachRecordData.getScene();
            String sessionId = outreachRecordData.getSessionId();
            Long showTimeMiles = outreachRecordData.getShowTimeMiles();
            if (showTimeMiles != null) {
                jLongValue = showTimeMiles.longValue();
            } else {
                jLongValue = 0;
            }
            arrayList.add(new SyncOutreachModel(key, outreachType, scene, sessionId, Long.valueOf(jLongValue), outreachRecordData.getTriggerId(), outreachRecordData.getLogId()));
        }
        String strReplace = new Regex("\\s+").replace(GsonProtectorUtils.toJson(C20684715wr.LIZ, arrayList), "");
        C20571715ed c20571715ed = C20571715ed.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getSyncedRecordStr, startTime: ");
        sbLIZ.append(j);
        sbLIZ.append(", str: ");
        sbLIZ.append(strReplace);
        C2188811AlT.LIZIZ(sbLIZ);
        c20571715ed.getClass();
        return strReplace;
    }

    public static OutreachRecords LIZJ(ConcurrentSkipListSet concurrentSkipListSet) {
        ArrayList arrayList = new ArrayList();
        Iterator it2 = concurrentSkipListSet.iterator();
        while (it2.hasNext()) {
            arrayList.add(((OutreachRecordData) it2.next()).transToSyncModel());
        }
        return new OutreachRecords(arrayList);
    }

    public static void LIZIZ(EnumC1779290wP1 enumC1779290wP1, int i) {
        EnumC1779290wP1 enumC1779290wP12;
        C20649415rA.LIZ.getClass();
        if (!C20649415rA.LIZ()) {
            return;
        }
        C20649315r9.LIZ.getClass();
        C20648715r3.LIZ.getClass();
        boolean z = C20648715r3.LIZIZ().getBoolean("last_full_sync_flag", true);
        C20649315r9.LJ = z;
        if (z && enumC1779290wP1 == (enumC1779290wP12 = EnumC1779290wP1.INCREMENTAL_SYNC)) {
            if (LIZLLL) {
                if (LIZJ == null) {
                    LIZJ = new AwS168S0101000_31(enumC1779290wP1, i, 6);
                    return;
                }
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis() - LIZIZ;
            C01GW c01gw = C20649415rA.LIZLLL;
            if (jCurrentTimeMillis < ((long) ((OutreachSyncConfigModel) c01gw.getValue()).minInterval) * 1000) {
                C786410Ut5.LJLIIL((((long) ((OutreachSyncConfigModel) c01gw.getValue()).minInterval) * 1000) - jCurrentTimeMillis, C799570VYd.LIZIZ(), new ARunnableS42S0101000_31(i, enumC1779290wP1, 20));
                return;
            }
            if (!C20649315r9.LIZJ.isEmpty()) {
                long jLIZIZ = C20649415rA.LIZIZ();
                String strLIZ = LIZ(jLIZIZ);
                C20571715ed c20571715ed = C20571715ed.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("get syncedRecordStr: ");
                sbLIZ.append(strLIZ);
                C2188811AlT.LIZIZ(sbLIZ);
                c20571715ed.getClass();
                String strLIZ2 = C448720Hig.LIZ(strLIZ);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("get MD5: ");
                sbLIZ2.append(strLIZ2);
                C2188811AlT.LIZIZ(sbLIZ2);
                C20649315r9.LIZIZ.addAll(C20649315r9.LIZJ);
                C20649315r9.LIZJ.clear();
                OutreachRecords outreachRecordsLIZJ = LIZJ(C20649315r9.LIZ(EnumC20650315rJ.SYNCING));
                LIZLLL = true;
                C20650815rO c20650815rO = new C20650815rO();
                c20650815rO.LIZJ = outreachRecordsLIZJ;
                Long lValueOf = Long.valueOf(jLIZIZ);
                C20648315qz.LIZ.getClass();
                c20650815rO.LIZLLL = new OutreachRecordSnapshot(strLIZ2, lValueOf, Long.valueOf(C20648315qz.LJII()));
                final AwS184S0101000_31 awS184S0101000_31 = new AwS184S0101000_31(i, jLIZIZ, strLIZ, strLIZ2, enumC1779290wP1, 1);
                c20650815rO.LIZIZ = enumC1779290wP12.getType();
                OutreachRecordSyncRequestParams outreachRecordSyncRequestParamsLIZ = c20650815rO.LIZ();
                SyncAPI.LIZ.getClass();
                OutreachRecords outreachRecords = outreachRecordSyncRequestParamsLIZ.records;
                if (outreachRecords != null && outreachRecords.addList != null && !outreachRecords.addList.isEmpty()) {
                    ListenableFuture<OutreachRecordResponseModel> listenableFutureRecordSync = OutreachRecordSyncApi.LIZIZ.recordSync(outreachRecordSyncRequestParamsLIZ);
                    listenableFutureRecordSync.LJIIJJI(new C135Q(listenableFutureRecordSync, new C11U6<OutreachRecordResponseModel>() { // from class: X.15rE
                        @Override // X.C11U6
                        public final void onFailure(Throwable th) {
                            C20571715ed c20571715ed2 = C20571715ed.LIZ;
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("incrementalSync fail, throwable: ");
                            sbLIZ3.append(th);
                            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
                            c20571715ed2.getClass();
                            C20571715ed.LIZ(strLIZIZ);
                            Function2<Boolean, Boolean, Unit> function2 = awS184S0101000_31;
                            Boolean bool = Boolean.FALSE;
                            function2.invoke(bool, bool);
                        }

                        @Override // X.C11U6
                        public final void onSuccess(OutreachRecordResponseModel outreachRecordResponseModel) {
                            Integer num;
                            Integer num2;
                            OutreachRecordResponseModel outreachRecordResponseModel2 = outreachRecordResponseModel;
                            C20571715ed c20571715ed2 = C20571715ed.LIZ;
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("incrementalSync success, statusCode: ");
                            if (outreachRecordResponseModel2 != null) {
                                num = outreachRecordResponseModel2.statusCode;
                            } else {
                                num = null;
                            }
                            sbLIZ3.append(num);
                            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
                            c20571715ed2.getClass();
                            C20571715ed.LIZ(strLIZIZ);
                            boolean z2 = false;
                            if (outreachRecordResponseModel2 != null && (num2 = outreachRecordResponseModel2.statusCode) != null && num2.intValue() == 0) {
                                Function2<Boolean, Boolean, Unit> function2 = awS184S0101000_31;
                                Boolean bool = Boolean.TRUE;
                                OutreachRecordResultModel outreachRecordResultModel = outreachRecordResponseModel2.result;
                                if (outreachRecordResultModel != null) {
                                    z2 = outreachRecordResultModel.fullSync;
                                }
                                function2.invoke(bool, Boolean.valueOf(z2));
                                return;
                            }
                            Function2<Boolean, Boolean, Unit> function22 = awS184S0101000_31;
                            Boolean bool2 = Boolean.FALSE;
                            function22.invoke(bool2, bool2);
                        }
                    }), EnumC2272608vM.LL);
                    return;
                }
                C20571715ed.LIZ("record is null or empty");
                return;
            }
            return;
        }
        LIZLLL = true;
        ConcurrentSkipListSet<OutreachRecordData> concurrentSkipListSet = C20649315r9.LIZLLL;
        ConcurrentSkipListSet<OutreachRecordData> concurrentSkipListSet2 = C20649315r9.LIZIZ;
        concurrentSkipListSet.addAll(concurrentSkipListSet2);
        concurrentSkipListSet.addAll(C20649315r9.LIZJ);
        concurrentSkipListSet2.clear();
        C20649315r9.LIZJ.clear();
        C20649315r9.LIZJ(EnumC20650315rJ.SYNCING);
        OutreachRecords outreachRecordsLIZJ2 = LIZJ(C20649315r9.LIZ(EnumC20650315rJ.SYNCED));
        C20650815rO c20650815rO2 = new C20650815rO();
        c20650815rO2.LIZJ = outreachRecordsLIZJ2;
        Long lValueOf2 = Long.valueOf(C20649415rA.LIZIZ());
        C20648315qz.LIZ.getClass();
        c20650815rO2.LIZLLL = new OutreachRecordSnapshot("", lValueOf2, Long.valueOf(C20648315qz.LJII()));
        final AFwS276S0000000_31 aFwS276S0000000_31 = AFwS276S0000000_31.get$arr$(367);
        c20650815rO2.LIZIZ = EnumC1779290wP1.FULL_SYNC.getType();
        OutreachRecordSyncRequestParams outreachRecordSyncRequestParamsLIZ2 = c20650815rO2.LIZ();
        SyncAPI.LIZ.getClass();
        ListenableFuture<OutreachRecordResponseModel> listenableFutureRecordSync2 = OutreachRecordSyncApi.LIZIZ.recordSync(outreachRecordSyncRequestParamsLIZ2);
        listenableFutureRecordSync2.LJIIJJI(new C135Q(listenableFutureRecordSync2, new C11U6<OutreachRecordResponseModel>() { // from class: X.15rD
            @Override // X.C11U6
            public final void onFailure(Throwable th) {
                C20571715ed c20571715ed2 = C20571715ed.LIZ;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("fullSync fail, ");
                sbLIZ3.append(th);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
                c20571715ed2.getClass();
                C20571715ed.LIZ(strLIZIZ);
                aFwS276S0000000_31.invoke(Boolean.FALSE);
            }

            @Override // X.C11U6
            public final void onSuccess(OutreachRecordResponseModel outreachRecordResponseModel) {
                Integer num;
                boolean z2;
                Integer num2;
                OutreachRecordResponseModel outreachRecordResponseModel2 = outreachRecordResponseModel;
                C20571715ed c20571715ed2 = C20571715ed.LIZ;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("fullSync success, statusCode: ");
                if (outreachRecordResponseModel2 != null) {
                    num = outreachRecordResponseModel2.statusCode;
                } else {
                    num = null;
                }
                sbLIZ3.append(num);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
                c20571715ed2.getClass();
                C20571715ed.LIZ(strLIZIZ);
                Function1<Boolean, Unit> function1 = aFwS276S0000000_31;
                if (outreachRecordResponseModel2 != null && (num2 = outreachRecordResponseModel2.statusCode) != null && num2.intValue() == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                function1.invoke(Boolean.valueOf(z2));
            }
        }), EnumC2272608vM.LL);
    }
}
