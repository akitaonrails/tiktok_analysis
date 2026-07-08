package X;

import Y.ARunnableS103S0100000_3;
import Y.ARunnableS1S1000000_3;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.draft.model.DraftDeleteResult;
import com.ss.android.ugc.aweme.draft.model.DraftRestoreResult;
import com.ss.android.ugc.aweme.tools.draft.monitor.log.DraftLogEntry;
import com.ss.android.ugc.aweme.tools.draft.monitor.log.DraftSummaryEntry;
import com.ss.android.ugc.aweme.tools.draft.monitor.log.LogDiffInfo;
import com.ss.android.ugc.aweme.tools.draft.monitor.log.LogErrorInfo;
import com.ss.android.ugc.aweme.tools.draft.monitor.log.LogRelationInfo;
import com.ss.android.ugc.aweme.tools.draft.monitor.log.LogStepInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS231S0000000_3;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0MYc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C570240MYc {
    public static final List<String> LIZ = C1697810uHb.LJIIJJI("com.ss.android.ugc.aweme", "com.bytedance");
    public static final List<String> LIZIZ = C1697810uHb.LJIIJJI("DraftLogService", "DraftLogHelper", "DraftDataAnalyzeService", "CreativeDraftUpdateServiceImpl", "$sam$", "$$Lambda");

    public static List LJIIIIZZ(String str) {
        boolean z;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return null;
        }
        List listLJJII = C09RB.LJJII(C09RB.LJJI(new C08LY(C09RB.LJIIIZ(new C1947107jx(str), AFwS231S0000000_3.get$arr$(194)), AFwS231S0000000_3.get$arr$(195)), 15));
        if (!(true ^ listLJJII.isEmpty())) {
            return null;
        }
        return listLJJII;
    }

    public static LogDiffInfo LIZ(AwemeDraft awemeDraft, AwemeDraft awemeDraft2) {
        LogDiffInfo logDiffInfoLIZ = null;
        if (!C0CH1.LIZ()) {
            return null;
        }
        try {
            C2393209Zi c2393209ZiLIZ = C1715006nc.LIZ(awemeDraft, awemeDraft2);
            if (c2393209ZiLIZ.LIZ.isEmpty() && c2393209ZiLIZ.LIZIZ.isEmpty() && c2393209ZiLIZ.LIZJ.isEmpty()) {
                return null;
            }
            logDiffInfoLIZ = C2393209Zi.LIZ(c2393209ZiLIZ);
            return logDiffInfoLIZ;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C201955140j.LJIIIZ(C0MAY.LIZIZ, "DraftLogHelper", "Calculate diff failed", e);
            return logDiffInfoLIZ;
        }
    }

    public static void LJ(String str, String str2) {
        Boolean bool = Boolean.TRUE;
        C570220MYa.LIZ(str, new DraftLogEntry(Long.valueOf(System.currentTimeMillis()), "publish", null, "publish", "post", bool, null, null, null, null, null, null, C2097908Jt.LIZJ(new Pair("publishId", str2))));
        C570220MYa.LIZIZ(new DraftSummaryEntry(Long.valueOf(System.currentTimeMillis()), str, "publish", "publish", bool, null, null, null));
        C09UZ.LIZ(new ARunnableS1S1000000_3(str, 6));
    }

    public static void LJFF(String str, Exception exc) {
        String message;
        Boolean bool = Boolean.FALSE;
        String strLJIIJJI = null;
        if (exc != null) {
            message = exc.getMessage();
            strLJIIJJI = C201955140j.LJIIJJI(exc);
        } else {
            message = null;
        }
        DraftLogEntry draftLogEntry = new DraftLogEntry(Long.valueOf(System.currentTimeMillis()), "query_db_failed", null, "clearCache", null, bool, new LogErrorInfo(-1, message, strLJIIJJI, null), null, null, null, null, null, C2097908Jt.LIZJ(new Pair("fromClass", str)));
        C570220MYa.LIZIZ(new DraftSummaryEntry(Long.valueOf(System.currentTimeMillis()), "", "query_db_failed", "clearCache", bool, null, -1, null));
        if (C0CH1.LIZIZ()) {
            C09UZ.LIZ(new ARunnableS103S0100000_3(draftLogEntry, 106));
        }
    }

    public static void LIZIZ(String str, String str2, String str3) {
        Boolean bool = Boolean.TRUE;
        C13DA c13da = new C13DA();
        c13da.put("path", str2);
        if (str3 != null) {
            c13da.put("stackTrace", str3);
        }
        C570220MYa.LIZ(str, new DraftLogEntry(Long.valueOf(System.currentTimeMillis()), "clear_record_file", null, "clear_record_file", null, bool, null, null, null, null, null, null, c13da.build()));
        C570220MYa.LIZIZ(new DraftSummaryEntry(Long.valueOf(System.currentTimeMillis()), str, "clear_record_file", "clear_record_file", bool, null, null, null));
    }

    public static void LIZLLL(String str, DraftDeleteResult draftDeleteResult, String str2) {
        List listLJJLIIIJILLIZJL;
        LogErrorInfo logErrorInfo;
        String message;
        Integer numValueOf = null;
        if (str2 != null) {
            listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str2, new String[]{"\n"}, 0, 6);
        } else {
            listLJJLIIIJILLIZJL = null;
        }
        if (listLJJLIIIJILLIZJL == null) {
            C0CHQ.LIZ().LJIIJJI();
            listLJJLIIIJILLIZJL = null;
        }
        String str3 = draftDeleteResult.deleteScene;
        boolean zIsSuc = draftDeleteResult.isSuc();
        if (!draftDeleteResult.isSuc()) {
            Integer numValueOf2 = Integer.valueOf(draftDeleteResult.getErrorCode());
            Throwable th = draftDeleteResult.deleteDBResult.deleteException.throwable;
            if (th != null) {
                message = th.getMessage();
            } else {
                message = null;
            }
            logErrorInfo = new LogErrorInfo(numValueOf2, message, null, null);
        } else {
            logErrorInfo = null;
        }
        C570220MYa.LIZ(str, new DraftLogEntry(Long.valueOf(System.currentTimeMillis()), "delete", 0, str3, "post", Boolean.valueOf(zIsSuc), logErrorInfo, null, listLJJLIIIJILLIZJL, null, null, null, null));
        String str4 = draftDeleteResult.deleteScene;
        Boolean boolValueOf = Boolean.valueOf(draftDeleteResult.isSuc());
        if (!draftDeleteResult.isSuc()) {
            numValueOf = Integer.valueOf(draftDeleteResult.getErrorCode());
        }
        C570220MYa.LIZIZ(new DraftSummaryEntry(Long.valueOf(System.currentTimeMillis()), str, "delete", str4, boolValueOf, null, numValueOf, null));
        if (draftDeleteResult.isSuc()) {
            C09UZ.LIZ(new ARunnableS1S1000000_3(str, 6));
        }
    }

    public static void LJI(String str, DraftRestoreResult draftRestoreResult, String str2) {
        Integer numValueOf;
        List listLJII;
        Integer numValueOf2;
        List listLJ;
        LogErrorInfo logErrorInfo;
        String json;
        String strLJIIJJI;
        List listLJIIIIZZ = LJIIIIZZ(str2);
        Integer numValueOf3 = null;
        if (listLJIIIIZZ == null) {
            C0CHQ.LIZ().LJIIJJI();
            listLJIIIIZZ = null;
        }
        int i = draftRestoreResult.draftVersion;
        String str3 = draftRestoreResult.restoreScene;
        boolean zIsSuc = draftRestoreResult.isSuc();
        long duration = draftRestoreResult.getDuration();
        ArrayList arrayList = new ArrayList();
        boolean z = !draftRestoreResult.checkResult.isSuc();
        Boolean boolValueOf = Boolean.valueOf(draftRestoreResult.checkResult.isSuc());
        Long lValueOf = Long.valueOf(draftRestoreResult.checkResult.checkDuration);
        if (z) {
            numValueOf = Integer.valueOf(draftRestoreResult.checkResult.getErrorCode());
            listLJII = C570220MYa.LJII(draftRestoreResult);
        } else {
            numValueOf = null;
            listLJII = null;
        }
        arrayList.add(new LogStepInfo("fileCheck", boolValueOf, lValueOf, numValueOf, listLJII, null));
        boolean z2 = !draftRestoreResult.restoreFileResults.isSuc();
        Boolean boolValueOf2 = Boolean.valueOf(draftRestoreResult.restoreFileResults.isSuc());
        Long lValueOf2 = Long.valueOf(draftRestoreResult.restoreFileResults.fileRestoreDuration);
        if (z2) {
            numValueOf2 = Integer.valueOf(draftRestoreResult.restoreFileResults.getErrorCode());
            listLJ = C570220MYa.LJ(draftRestoreResult);
        } else {
            numValueOf2 = null;
            listLJ = null;
        }
        arrayList.add(new LogStepInfo("fileRestore", boolValueOf2, lValueOf2, numValueOf2, listLJ, null));
        if (!draftRestoreResult.isSuc()) {
            if (!draftRestoreResult.checkResult.isSuc()) {
                json = GsonProtectorUtils.toJson(C570220MYa.LJIIIIZZ(), draftRestoreResult.checkResult);
            } else if (!draftRestoreResult.restoreFileResults.isSuc()) {
                json = GsonProtectorUtils.toJson(C570220MYa.LJIIIIZZ(), draftRestoreResult.restoreFileResults);
            } else {
                json = "Draft restore failed, Unknown error";
            }
            ArrayList arrayList2 = new ArrayList();
            List listLJII2 = C570220MYa.LJII(draftRestoreResult);
            if (listLJII2 != null) {
                arrayList2.addAll(listLJII2);
            }
            List listLJ2 = C570220MYa.LJ(draftRestoreResult);
            if (listLJ2 != null) {
                arrayList2.addAll(listLJ2);
            }
            Integer numValueOf4 = Integer.valueOf(draftRestoreResult.getErrorCode());
            Throwable th = draftRestoreResult.codeException;
            if (th != null) {
                strLJIIJJI = C201955140j.LJIIJJI(th);
            } else {
                strLJIIJJI = null;
            }
            if (!(!arrayList2.isEmpty())) {
                arrayList2 = null;
            }
            logErrorInfo = new LogErrorInfo(numValueOf4, json, strLJIIJJI, arrayList2);
        } else {
            logErrorInfo = null;
        }
        C570220MYa.LIZ(str, new DraftLogEntry(Long.valueOf(System.currentTimeMillis()), "restore", Integer.valueOf(i), str3, "post", Boolean.valueOf(zIsSuc), logErrorInfo, Long.valueOf(duration), listLJIIIIZZ, arrayList, null, null, null));
        String str4 = draftRestoreResult.restoreScene;
        Boolean boolValueOf3 = Boolean.valueOf(draftRestoreResult.isSuc());
        Long lValueOf3 = Long.valueOf(draftRestoreResult.getDuration());
        if (!draftRestoreResult.isSuc()) {
            numValueOf3 = Integer.valueOf(draftRestoreResult.getErrorCode());
        }
        C570220MYa.LIZIZ(new DraftSummaryEntry(Long.valueOf(System.currentTimeMillis()), str, "restore", str4, boolValueOf3, lValueOf3, numValueOf3, null));
    }

    public static void LJII(String str, String str2, Map map) {
        C570220MYa.LIZ(str, new DraftLogEntry(Long.valueOf(System.currentTimeMillis()), "save", null, str2, "delete_old_draft_files", Boolean.TRUE, null, null, null, null, null, null, map));
    }

    public static void LIZJ(int i, String str, String str2, String str3) {
        Boolean bool = Boolean.TRUE;
        C570220MYa.LIZ(str, new DraftLogEntry(Long.valueOf(System.currentTimeMillis()), "copy", null, "copy", "post", bool, null, null, null, null, new LogRelationInfo(str3, str2, Integer.valueOf(i)), null, null));
        C570220MYa.LIZIZ(new DraftSummaryEntry(Long.valueOf(System.currentTimeMillis()), str, "copy", str3, bool, null, null, str2));
    }
}
