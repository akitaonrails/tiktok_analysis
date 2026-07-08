package X;

import Y.ACallableS411S0100000_3;
import android.util.Log;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.draft.model.DraftSaveResult;
import com.ss.android.ugc.aweme.tools.draft.monitor.DraftOperationEvent;
import com.ss.android.ugc.aweme.tools.draft.monitor.DraftOperationParams;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/* JADX INFO: renamed from: X.0MYb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C570230MYb {
    public static final C570230MYb LIZ = new C570230MYb();

    public static String LIZIZ() {
        Date date = new Date(System.currentTimeMillis());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss a");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return simpleDateFormat.format(date);
    }

    public static File LIZJ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C0CHQ.LIZ().getAccountService().LIZJ());
        sbLIZ.append(".json");
        return C0CHQ.LIZ().LJJIIJZLJL().getPathService().LJIIL(C1445850njD.LIZ, C0MI0.DRAFT_LOG, C2188811AlT.LIZIZ(sbLIZ), false);
    }

    public static String LIZLLL() {
        InterfaceC570310MYj pathService = C0CHQ.LIZ().LJJIIJZLJL().getPathService();
        CreativeInfo creativeInfo = C1445850njD.LIZ;
        C0MI0 c0mi0 = C0MI0.DRAFT_LOG;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C0CHQ.LIZ().getAccountService().LIZJ());
        sbLIZ.append(".json");
        return pathService.LJIILL(creativeInfo, c0mi0, C2188811AlT.LIZIZ(sbLIZ), false);
    }

    public static void LIZ(DraftSaveResult draftSaveResult) {
        String str;
        int i = draftSaveResult.draftAwemeType;
        if (draftSaveResult.isSuc()) {
            str = "finish";
        } else if (!draftSaveResult.preProcessResults.isSuc()) {
            str = "preProcess";
        } else if (!draftSaveResult.checkResult.isSuc()) {
            str = "fileCheck";
        } else if (!draftSaveResult.saveFileResults.isSuc()) {
            str = "fileSave";
        } else if (!draftSaveResult.saveDBResult.isSuc()) {
            str = "saveDB";
        } else {
            str = "unkonw";
        }
        DraftOperationParams draftOperationParams = new DraftOperationParams(i, str, draftSaveResult.draftVersion, draftSaveResult.fileTreeInfo, draftSaveResult.notStandardsPath);
        String str2 = draftSaveResult.creationId;
        String strLIZIZ = LIZIZ();
        String str3 = draftSaveResult.draftScene;
        int errorCode = draftSaveResult.getErrorCode();
        String strLIZLLL = "";
        if (draftSaveResult.getErrorCode() != 0) {
            if (draftSaveResult.preProcessResults.isSuc() && !(!draftSaveResult.preProcessResults.notBlockCreativeList.isEmpty())) {
                if (draftSaveResult.checkResult.isSuc() && !(!draftSaveResult.checkResult.fileCheckResults.notBlockCreativeList.isEmpty())) {
                    if (draftSaveResult.saveFileResults.isSuc() && !(!draftSaveResult.saveFileResults.notBlockCreativeList.isEmpty())) {
                        if (!draftSaveResult.saveDBResult.isSuc()) {
                            strLIZLLL = C570260MYe.LIZLLL(draftSaveResult.saveDBResult, 6);
                        }
                    } else {
                        strLIZLLL = C570260MYe.LIZLLL(draftSaveResult.saveFileResults, 6);
                    }
                } else {
                    strLIZLLL = C570260MYe.LIZLLL(draftSaveResult.checkResult, 6);
                }
            } else {
                strLIZLLL = C570260MYe.LIZLLL(draftSaveResult.preProcessResults, 6);
            }
            Throwable th = draftSaveResult.codeException;
            if (th != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(strLIZLLL);
                sbLIZ.append(Log.getStackTraceString(th));
                strLIZLLL = C2188811AlT.LIZIZ(sbLIZ);
            }
            if (strLIZLLL.length() == 0) {
                strLIZLLL = null;
            }
        }
        LJ(new DraftOperationEvent(null, "saveDraft", str2, 0, strLIZIZ, str3, errorCode, strLIZLLL, draftOperationParams, null, 521, null));
    }

    public static void LJ(DraftOperationEvent draftOperationEvent) {
        if (!C570350MYn.LIZ()) {
            return;
        }
        C15O7.LIZJ(new ACallableS411S0100000_3(draftOperationEvent, 22));
    }
}
