package X;

import Y.ARunnableS103S0100000_3;
import Y.ARunnableS9S1100000_3;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.draft.model.DraftFileCheckResult;
import com.ss.android.ugc.aweme.draft.model.DraftFileRestoreResult;
import com.ss.android.ugc.aweme.draft.model.DraftFileSaveResult;
import com.ss.android.ugc.aweme.draft.model.DraftRestoreResult;
import com.ss.android.ugc.aweme.draft.model.DraftSavePreProcessResult;
import com.ss.android.ugc.aweme.draft.model.DraftSaveResult;
import com.ss.android.ugc.aweme.draft.model.DraftVECheckResult;
import com.ss.android.ugc.aweme.tools.draft.monitor.log.DraftLogEntry;
import com.ss.android.ugc.aweme.tools.draft.monitor.log.DraftSummaryEntry;
import com.ss.android.ugc.aweme.tools.draft.monitor.log.LogDiffInfo;
import com.ss.android.ugc.aweme.tools.draft.monitor.log.LogErrorInfo;
import com.ss.android.ugc.aweme.tools.draft.monitor.log.LogFailedItem;
import com.ss.android.ugc.aweme.tools.draft.monitor.log.LogStepInfo;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.text.Charsets;

/* JADX INFO: renamed from: X.0MYa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C570220MYa {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(479));
    public static volatile int LIZIZ;

    public static Gson LJIIIIZZ() {
        return (Gson) LIZ.getValue();
    }

    public static void LIZIZ(DraftSummaryEntry draftSummaryEntry) {
        if (!C0CH1.LIZIZ()) {
            return;
        }
        C09UZ.LIZ(new ARunnableS103S0100000_3(draftSummaryEntry, 105));
    }

    public static void LIZJ(String str) {
        try {
            C0VSJ c0vsjLJIIJ = LJIIJ(str, false);
            if (!c0vsjLJIIJ.exists()) {
                return;
            }
            C0VSJ c0vsjLJIIJ2 = LJIIJ(str, true);
            File parentFile = c0vsjLJIIJ2.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            c0vsjLJIIJ.renameTo(c0vsjLJIIJ2);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C0MAY c0may = C0MAY.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Archive log sync failed: ");
            sbLIZ.append(str);
            C201955140j.LJIIIZ(c0may, "DraftLogService", C2188811AlT.LIZIZ(sbLIZ), e);
        }
    }

    public static List LIZLLL(DraftSaveResult draftSaveResult) {
        ArrayList arrayList = new ArrayList();
        for (DraftFileCheckResult draftFileCheckResult : draftSaveResult.checkResult.fileCheckResults.blockCreativeList) {
            Integer numValueOf = Integer.valueOf(draftFileCheckResult.errorCode);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("File check failed: ");
            sbLIZ.append(draftFileCheckResult.fileName);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            C13DA c13da = new C13DA();
            c13da.put("blockCreative", Boolean.TRUE);
            String str = draftFileCheckResult.originPath;
            if (str != null) {
                c13da.put("originPath", str);
            }
            String str2 = draftFileCheckResult.existPath;
            if (str2 != null) {
                c13da.put("existPath", str2);
            }
            String str3 = draftFileCheckResult.relativeDir;
            if (str3 != null) {
                c13da.put("relativeDir", str3);
            }
            String str4 = draftFileCheckResult.fileName;
            if (str4 != null) {
                c13da.put("fileName", str4);
            }
            String str5 = draftFileCheckResult.fieldInfo;
            if (str5 != null || (str5 = draftFileCheckResult.fieldPath) != null) {
                c13da.put("fieldInfo", str5);
            }
            arrayList.add(new LogFailedItem("file", numValueOf, strLIZIZ, c13da.build()));
        }
        List<DraftFileCheckResult> list = draftSaveResult.checkResult.fileCheckResults.notBlockCreativeList;
        ArrayList<DraftFileCheckResult> arrayList2 = new ArrayList();
        for (DraftFileCheckResult draftFileCheckResult2 : list) {
            if (!draftFileCheckResult2.isSuc()) {
                arrayList2.add(draftFileCheckResult2);
            }
        }
        for (DraftFileCheckResult draftFileCheckResult3 : arrayList2) {
            Integer numValueOf2 = Integer.valueOf(draftFileCheckResult3.errorCode);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("File check failed: ");
            sbLIZ2.append(draftFileCheckResult3.fileName);
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
            C13DA c13da2 = new C13DA();
            c13da2.put("blockCreative", Boolean.FALSE);
            String str6 = draftFileCheckResult3.originPath;
            if (str6 != null) {
                c13da2.put("originPath", str6);
            }
            String str7 = draftFileCheckResult3.existPath;
            if (str7 != null) {
                c13da2.put("existPath", str7);
            }
            String str8 = draftFileCheckResult3.relativeDir;
            if (str8 != null) {
                c13da2.put("relativeDir", str8);
            }
            String str9 = draftFileCheckResult3.fileName;
            if (str9 != null) {
                c13da2.put("fileName", str9);
            }
            String str10 = draftFileCheckResult3.fieldInfo;
            if (str10 != null || (str10 = draftFileCheckResult3.fieldPath) != null) {
                c13da2.put("fieldInfo", str10);
            }
            arrayList.add(new LogFailedItem("file", numValueOf2, strLIZIZ2, c13da2.build()));
        }
        List<DraftVECheckResult> list2 = draftSaveResult.checkResult.invalidVEFileList;
        if (list2 != null) {
            for (DraftVECheckResult draftVECheckResult : list2) {
                Integer numValueOf3 = Integer.valueOf(draftVECheckResult.errorCode);
                C13DA c13da3 = new C13DA();
                c13da3.put("blockCreative", Boolean.TRUE);
                String str11 = draftVECheckResult.path;
                if (str11 != null) {
                    c13da3.put("originPath", str11);
                }
                arrayList.add(new LogFailedItem("ve", numValueOf3, "VE file invalid", c13da3.build()));
            }
        }
        if (!(!arrayList.isEmpty())) {
            return null;
        }
        return arrayList;
    }

    public static List LJ(DraftRestoreResult draftRestoreResult) {
        String message;
        String message2;
        String message3;
        ArrayList arrayList = new ArrayList();
        Iterator<DraftFileRestoreResult> it2 = draftRestoreResult.restoreFileResults.blockCreativeList.iterator();
        while (true) {
            String message4 = null;
            if (!it2.hasNext()) {
                break;
            }
            DraftFileRestoreResult next = it2.next();
            Integer numValueOf = Integer.valueOf(next.restoreException.errorCode);
            Throwable th = next.restoreException.throwable;
            if (th != null) {
                message4 = th.getMessage();
            }
            C13DA c13da = new C13DA();
            c13da.put("blockCreative", Boolean.TRUE);
            String str = next.restoreException.resourceType;
            if (str != null) {
                c13da.put("resourceType", str);
            }
            c13da.put("fileType", Integer.valueOf(next.fileType));
            Throwable th2 = next.restoreException.throwable;
            if (th2 != null && (message3 = th2.getMessage()) != null) {
                c13da.put("exception", message3);
            }
            arrayList.add(new LogFailedItem("fileRestore", numValueOf, message4, c13da.build()));
        }
        List<DraftFileRestoreResult> list = draftRestoreResult.restoreFileResults.notBlockCreativeList;
        ArrayList<DraftFileRestoreResult> arrayList2 = new ArrayList();
        for (DraftFileRestoreResult draftFileRestoreResult : list) {
            if (!draftFileRestoreResult.isSuc()) {
                arrayList2.add(draftFileRestoreResult);
            }
        }
        for (DraftFileRestoreResult draftFileRestoreResult2 : arrayList2) {
            Integer numValueOf2 = Integer.valueOf(draftFileRestoreResult2.restoreException.errorCode);
            Throwable th3 = draftFileRestoreResult2.restoreException.throwable;
            if (th3 != null) {
                message = th3.getMessage();
            } else {
                message = null;
            }
            C13DA c13da2 = new C13DA();
            c13da2.put("blockCreative", Boolean.FALSE);
            String str2 = draftFileRestoreResult2.restoreException.resourceType;
            if (str2 != null) {
                c13da2.put("resourceType", str2);
            }
            c13da2.put("fileType", Integer.valueOf(draftFileRestoreResult2.fileType));
            Throwable th4 = draftFileRestoreResult2.restoreException.throwable;
            if (th4 != null && (message2 = th4.getMessage()) != null) {
                c13da2.put("exception", message2);
            }
            arrayList.add(new LogFailedItem("fileRestore", numValueOf2, message, c13da2.build()));
        }
        if (!(!arrayList.isEmpty())) {
            return null;
        }
        return arrayList;
    }

    public static List LJFF(DraftSaveResult draftSaveResult) {
        String message;
        String message2;
        String message3;
        ArrayList arrayList = new ArrayList();
        Iterator<DraftFileSaveResult> it2 = draftSaveResult.saveFileResults.blockCreativeList.iterator();
        while (true) {
            String message4 = null;
            if (!it2.hasNext()) {
                break;
            }
            DraftFileSaveResult next = it2.next();
            Integer numValueOf = Integer.valueOf(next.saveException.errorCode);
            Throwable th = next.saveException.throwable;
            if (th != null) {
                message4 = th.getMessage();
            }
            C13DA c13da = new C13DA();
            c13da.put("blockCreative", Boolean.TRUE);
            c13da.put("fileType", Integer.valueOf(next.saveType));
            Throwable th2 = next.saveException.throwable;
            if (th2 != null && (message3 = th2.getMessage()) != null) {
                c13da.put("exception", message3);
            }
            arrayList.add(new LogFailedItem("fileSave", numValueOf, message4, c13da.build()));
        }
        List<DraftFileSaveResult> list = draftSaveResult.saveFileResults.notBlockCreativeList;
        ArrayList<DraftFileSaveResult> arrayList2 = new ArrayList();
        for (DraftFileSaveResult draftFileSaveResult : list) {
            if (!draftFileSaveResult.isSuc()) {
                arrayList2.add(draftFileSaveResult);
            }
        }
        for (DraftFileSaveResult draftFileSaveResult2 : arrayList2) {
            Integer numValueOf2 = Integer.valueOf(draftFileSaveResult2.saveException.errorCode);
            Throwable th3 = draftFileSaveResult2.saveException.throwable;
            if (th3 != null) {
                message = th3.getMessage();
            } else {
                message = null;
            }
            C13DA c13da2 = new C13DA();
            c13da2.put("blockCreative", Boolean.FALSE);
            c13da2.put("fileType", Integer.valueOf(draftFileSaveResult2.saveType));
            Throwable th4 = draftFileSaveResult2.saveException.throwable;
            if (th4 != null && (message2 = th4.getMessage()) != null) {
                c13da2.put("exception", message2);
            }
            arrayList.add(new LogFailedItem("fileSave", numValueOf2, message, c13da2.build()));
        }
        if (!(!arrayList.isEmpty())) {
            return null;
        }
        return arrayList;
    }

    public static List LJI(DraftSaveResult draftSaveResult) {
        String message;
        String message2;
        String message3;
        ArrayList arrayList = new ArrayList();
        Iterator<DraftSavePreProcessResult> it2 = draftSaveResult.preProcessResults.blockCreativeList.iterator();
        while (true) {
            String message4 = null;
            if (!it2.hasNext()) {
                break;
            }
            DraftSavePreProcessResult next = it2.next();
            Integer numValueOf = Integer.valueOf(next.preProcessException.errorCode);
            Throwable th = next.preProcessException.throwable;
            if (th != null) {
                message4 = th.getMessage();
            }
            C13DA c13da = new C13DA();
            c13da.put("blockCreative", Boolean.TRUE);
            c13da.put("preProcessType", Integer.valueOf(next.preProcessType));
            Throwable th2 = next.preProcessException.throwable;
            if (th2 != null && (message3 = th2.getMessage()) != null) {
                c13da.put("exception", message3);
            }
            arrayList.add(new LogFailedItem("preProcess", numValueOf, message4, c13da.build()));
        }
        List<DraftSavePreProcessResult> list = draftSaveResult.preProcessResults.notBlockCreativeList;
        ArrayList<DraftSavePreProcessResult> arrayList2 = new ArrayList();
        for (DraftSavePreProcessResult draftSavePreProcessResult : list) {
            if (!draftSavePreProcessResult.isSuc()) {
                arrayList2.add(draftSavePreProcessResult);
            }
        }
        for (DraftSavePreProcessResult draftSavePreProcessResult2 : arrayList2) {
            Integer numValueOf2 = Integer.valueOf(draftSavePreProcessResult2.preProcessException.errorCode);
            Throwable th3 = draftSavePreProcessResult2.preProcessException.throwable;
            if (th3 != null) {
                message = th3.getMessage();
            } else {
                message = null;
            }
            C13DA c13da2 = new C13DA();
            c13da2.put("blockCreative", Boolean.FALSE);
            c13da2.put("preProcessType", Integer.valueOf(draftSavePreProcessResult2.preProcessType));
            Throwable th4 = draftSavePreProcessResult2.preProcessException.throwable;
            if (th4 != null && (message2 = th4.getMessage()) != null) {
                c13da2.put("exception", message2);
            }
            arrayList.add(new LogFailedItem("preProcess", numValueOf2, message, c13da2.build()));
        }
        if (!(!arrayList.isEmpty())) {
            return null;
        }
        return arrayList;
    }

    public static List LJII(DraftRestoreResult draftRestoreResult) {
        ArrayList arrayList = new ArrayList();
        for (DraftFileCheckResult draftFileCheckResult : draftRestoreResult.checkResult.fileCheckResults.blockCreativeList) {
            Integer numValueOf = Integer.valueOf(draftFileCheckResult.errorCode);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("File check failed: ");
            sbLIZ.append(draftFileCheckResult.fileName);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            C13DA c13da = new C13DA();
            c13da.put("blockCreative", Boolean.TRUE);
            String str = draftFileCheckResult.originPath;
            if (str != null) {
                c13da.put("originPath", str);
            }
            String str2 = draftFileCheckResult.existPath;
            if (str2 != null) {
                c13da.put("existPath", str2);
            }
            String str3 = draftFileCheckResult.relativeDir;
            if (str3 != null) {
                c13da.put("relativeDir", str3);
            }
            String str4 = draftFileCheckResult.fileName;
            if (str4 != null) {
                c13da.put("fileName", str4);
            }
            String str5 = draftFileCheckResult.fieldInfo;
            if (str5 != null || (str5 = draftFileCheckResult.fieldPath) != null) {
                c13da.put("fieldInfo", str5);
            }
            arrayList.add(new LogFailedItem("file", numValueOf, strLIZIZ, c13da.build()));
        }
        List<DraftFileCheckResult> list = draftRestoreResult.checkResult.fileCheckResults.notBlockCreativeList;
        ArrayList<DraftFileCheckResult> arrayList2 = new ArrayList();
        for (DraftFileCheckResult draftFileCheckResult2 : list) {
            if (!draftFileCheckResult2.isSuc()) {
                arrayList2.add(draftFileCheckResult2);
            }
        }
        for (DraftFileCheckResult draftFileCheckResult3 : arrayList2) {
            Integer numValueOf2 = Integer.valueOf(draftFileCheckResult3.errorCode);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("File check failed: ");
            sbLIZ2.append(draftFileCheckResult3.fileName);
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
            C13DA c13da2 = new C13DA();
            c13da2.put("blockCreative", Boolean.FALSE);
            String str6 = draftFileCheckResult3.originPath;
            if (str6 != null) {
                c13da2.put("originPath", str6);
            }
            String str7 = draftFileCheckResult3.existPath;
            if (str7 != null) {
                c13da2.put("existPath", str7);
            }
            String str8 = draftFileCheckResult3.relativeDir;
            if (str8 != null) {
                c13da2.put("relativeDir", str8);
            }
            String str9 = draftFileCheckResult3.fileName;
            if (str9 != null) {
                c13da2.put("fileName", str9);
            }
            String str10 = draftFileCheckResult3.fieldInfo;
            if (str10 != null || (str10 = draftFileCheckResult3.fieldPath) != null) {
                c13da2.put("fieldInfo", str10);
            }
            arrayList.add(new LogFailedItem("file", numValueOf2, strLIZIZ2, c13da2.build()));
        }
        List<DraftVECheckResult> list2 = draftRestoreResult.checkResult.invalidVEFileList;
        if (list2 != null) {
            for (DraftVECheckResult draftVECheckResult : list2) {
                Integer numValueOf3 = Integer.valueOf(draftVECheckResult.errorCode);
                C13DA c13da3 = new C13DA();
                c13da3.put("blockCreative", Boolean.TRUE);
                String str11 = draftVECheckResult.path;
                if (str11 != null) {
                    c13da3.put("originPath", str11);
                }
                arrayList.add(new LogFailedItem("ve", numValueOf3, "VE file invalid", c13da3.build()));
            }
        }
        if (!(!arrayList.isEmpty())) {
            return null;
        }
        return arrayList;
    }

    public static C0VSJ LJIIIZ(boolean z) {
        String str;
        if (z) {
            str = "archived";
        } else {
            str = "active";
        }
        return new C0VSJ(C0CHQ.LIZ().LJJIIJZLJL().getPathService().LJIILL(C1445850njD.LIZ, C0MI0.DRAFT_LOG, str, false));
    }

    public static void LJIIL(C0VSJ c0vsj) {
        try {
            List listLJFF = C09BH.LJFF(c0vsj);
            int size = ((ArrayList) listLJFF).size() / 2;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(C13LP.LJJLIIIJ(C13LP.LLD(size, listLJFF), "\n", null, null, 0, null, null, 62));
            sbLIZ.append('\n');
            C09BH.LJIIIZ(c0vsj, C2188811AlT.LIZIZ(sbLIZ), Charsets.UTF_8);
            C0MAY c0may = C0MAY.LIZIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Truncated log file: ");
            sbLIZ2.append(c0vsj.getName());
            sbLIZ2.append(", kept ");
            sbLIZ2.append(size);
            sbLIZ2.append(" lines");
            C201955140j.LIZLLL(c0may, "DraftLogService", C2188811AlT.LIZIZ(sbLIZ2));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C201955140j.LJIIIZ(C0MAY.LIZIZ, "DraftLogService", "Truncate log file failed", e);
        }
    }

    public static void LIZ(String str, DraftLogEntry draftLogEntry) {
        if (!C0CH1.LIZIZ()) {
            return;
        }
        C09UZ.LIZ(new ARunnableS9S1100000_3(draftLogEntry, str, 17));
    }

    public static C0VSJ LJIIJ(String str, boolean z) {
        C0VSJ c0vsjLJIIIZ = LJIIIZ(z);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(".log");
        return new C0VSJ(c0vsjLJIIIZ, C2188811AlT.LIZIZ(sbLIZ));
    }

    public static void LJIIJJI(String str, DraftSaveResult draftSaveResult, LogDiffInfo logDiffInfo, List list, Boolean bool, int i) {
        String str2;
        Integer numValueOf;
        List listLJI;
        Integer numValueOf2;
        List listLIZLLL;
        Integer numValueOf3;
        List listLJFF;
        Integer numValueOf4;
        List listSingletonList;
        LogErrorInfo logErrorInfo;
        Integer numValueOf5;
        String strLIZIZ;
        String strLJIIJJI;
        String message;
        Map mapLIZJ;
        String message2;
        String message3;
        Map mapLIZJ2;
        String message4;
        Boolean bool2 = bool;
        List list2 = list;
        if ((i & 4) != 0) {
            logDiffInfo = null;
        }
        if ((i & 8) != 0) {
            str2 = "post";
        } else {
            str2 = null;
        }
        if ((i & 16) != 0) {
            list2 = null;
        }
        if ((i & 32) != 0) {
            bool2 = null;
        }
        if (list2 == null) {
            C0CHQ.LIZ().LJIIJJI();
            list2 = null;
        }
        int i2 = draftSaveResult.draftVersion;
        String str3 = draftSaveResult.draftScene;
        boolean zIsSuc = draftSaveResult.isSuc();
        long duration = draftSaveResult.getDuration();
        ArrayList arrayList = new ArrayList();
        boolean z = !draftSaveResult.preProcessResults.isSuc();
        Boolean boolValueOf = Boolean.valueOf(draftSaveResult.preProcessResults.isSuc());
        Long lValueOf = Long.valueOf(draftSaveResult.preProcessResults.preProcessDuration);
        if (z) {
            numValueOf = Integer.valueOf(draftSaveResult.preProcessResults.getErrorCode());
            listLJI = LJI(draftSaveResult);
        } else {
            numValueOf = null;
            listLJI = null;
        }
        LogDiffInfo logDiffInfo2 = null;
        arrayList.add(new LogStepInfo("preProcess", boolValueOf, lValueOf, numValueOf, listLJI, null));
        boolean z2 = !draftSaveResult.checkResult.isSuc();
        Boolean boolValueOf2 = Boolean.valueOf(draftSaveResult.checkResult.isSuc());
        Long lValueOf2 = Long.valueOf(draftSaveResult.checkResult.checkDuration);
        if (z2) {
            numValueOf2 = Integer.valueOf(draftSaveResult.checkResult.getErrorCode());
            listLIZLLL = LIZLLL(draftSaveResult);
        } else {
            numValueOf2 = null;
            listLIZLLL = null;
        }
        arrayList.add(new LogStepInfo("fileCheck", boolValueOf2, lValueOf2, numValueOf2, listLIZLLL, null));
        boolean z3 = !draftSaveResult.saveFileResults.isSuc();
        Boolean boolValueOf3 = Boolean.valueOf(draftSaveResult.saveFileResults.isSuc());
        Long lValueOf3 = Long.valueOf(draftSaveResult.saveFileResults.fileSaveDuration);
        if (z3) {
            numValueOf3 = Integer.valueOf(draftSaveResult.saveFileResults.getErrorCode());
            listLJFF = LJFF(draftSaveResult);
        } else {
            numValueOf3 = null;
            listLJFF = null;
        }
        arrayList.add(new LogStepInfo("fileSave", boolValueOf3, lValueOf3, numValueOf3, listLJFF, null));
        if (logDiffInfo != null && (!logDiffInfo.isEmpty())) {
            logDiffInfo2 = logDiffInfo;
        }
        boolean z4 = !draftSaveResult.saveDBResult.isSuc();
        Boolean boolValueOf4 = Boolean.valueOf(draftSaveResult.saveDBResult.isSuc());
        Long lValueOf4 = Long.valueOf(draftSaveResult.saveDBResult.dbSaveDuration);
        if (z4) {
            numValueOf4 = Integer.valueOf(draftSaveResult.saveDBResult.saveException.errorCode);
        } else {
            numValueOf4 = null;
        }
        if (z4) {
            Integer numValueOf6 = Integer.valueOf(draftSaveResult.saveDBResult.saveException.errorCode);
            Throwable th = draftSaveResult.saveDBResult.saveException.throwable;
            if (th != null) {
                message3 = th.getMessage();
            } else {
                message3 = null;
            }
            Throwable th2 = draftSaveResult.saveDBResult.saveException.throwable;
            if (th2 != null && (message4 = th2.getMessage()) != null) {
                mapLIZJ2 = C2097908Jt.LIZJ(new Pair("exception", message4));
            } else {
                mapLIZJ2 = null;
            }
            listSingletonList = Collections.singletonList(new LogFailedItem("db", numValueOf6, message3, mapLIZJ2));
        } else {
            listSingletonList = null;
        }
        arrayList.add(new LogStepInfo("saveDB", boolValueOf4, lValueOf4, numValueOf4, listSingletonList, logDiffInfo2));
        if (!draftSaveResult.isSuc()) {
            if (!draftSaveResult.preProcessResults.isSuc()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("PreProcess failed, ");
                sbLIZ.append(GsonProtectorUtils.toJson(LJIIIIZZ(), draftSaveResult.preProcessResults));
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            } else if (!draftSaveResult.checkResult.isSuc()) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("FileCheck failed, ");
                sbLIZ2.append(GsonProtectorUtils.toJson(LJIIIIZZ(), draftSaveResult.checkResult));
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            } else if (!draftSaveResult.saveFileResults.isSuc()) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("FileSave failed, ");
                sbLIZ3.append(GsonProtectorUtils.toJson(LJIIIIZZ(), draftSaveResult.saveFileResults));
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
            } else if (!draftSaveResult.saveDBResult.isSuc()) {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("DBSave failed, ");
                sbLIZ4.append(GsonProtectorUtils.toJson(LJIIIIZZ(), draftSaveResult.saveDBResult));
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ4);
            } else {
                strLIZIZ = "Unknown error";
            }
            ArrayList arrayList2 = new ArrayList();
            List listLJI2 = LJI(draftSaveResult);
            if (listLJI2 != null) {
                arrayList2.addAll(listLJI2);
            }
            List listLIZLLL2 = LIZLLL(draftSaveResult);
            if (listLIZLLL2 != null) {
                arrayList2.addAll(listLIZLLL2);
            }
            List listLJFF2 = LJFF(draftSaveResult);
            if (listLJFF2 != null) {
                arrayList2.addAll(listLJFF2);
            }
            if (!draftSaveResult.saveDBResult.isSuc()) {
                Integer numValueOf7 = Integer.valueOf(draftSaveResult.saveDBResult.saveException.errorCode);
                Throwable th3 = draftSaveResult.saveDBResult.saveException.throwable;
                if (th3 != null) {
                    message = th3.getMessage();
                } else {
                    message = null;
                }
                Throwable th4 = draftSaveResult.saveDBResult.saveException.throwable;
                if (th4 != null && (message2 = th4.getMessage()) != null) {
                    mapLIZJ = C2097908Jt.LIZJ(new Pair("exception", message2));
                } else {
                    mapLIZJ = null;
                }
                arrayList2.add(new LogFailedItem("db", numValueOf7, message, mapLIZJ));
            }
            Integer numValueOf8 = Integer.valueOf(draftSaveResult.getErrorCode());
            Throwable th5 = draftSaveResult.codeException;
            if (th5 != null) {
                strLJIIJJI = C201955140j.LJIIJJI(th5);
            } else {
                strLJIIJJI = null;
            }
            if (!(!arrayList2.isEmpty())) {
                arrayList2 = null;
            }
            logErrorInfo = new LogErrorInfo(numValueOf8, strLIZIZ, strLJIIJJI, arrayList2);
        } else {
            logErrorInfo = null;
        }
        LIZ(str, new DraftLogEntry(Long.valueOf(System.currentTimeMillis()), "save", Integer.valueOf(i2), str3, str2, Boolean.valueOf(zIsSuc), logErrorInfo, Long.valueOf(duration), list2, arrayList, null, bool2, null));
        String str4 = draftSaveResult.draftScene;
        Boolean boolValueOf5 = Boolean.valueOf(draftSaveResult.isSuc());
        Long lValueOf5 = Long.valueOf(draftSaveResult.getDuration());
        if (!draftSaveResult.isSuc()) {
            numValueOf5 = Integer.valueOf(draftSaveResult.getErrorCode());
        } else {
            numValueOf5 = null;
        }
        LIZIZ(new DraftSummaryEntry(Long.valueOf(System.currentTimeMillis()), str, "save", str4, boolValueOf5, lValueOf5, numValueOf5, null));
    }
}
