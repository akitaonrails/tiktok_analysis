package X;

import android.util.Log;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.draft.model.DraftDeleteResult;
import com.ss.android.ugc.aweme.draft.model.DraftFileRestoreResult;
import com.ss.android.ugc.aweme.draft.model.DraftRestoreResult;
import com.ss.android.ugc.aweme.draft.model.DraftSaveResult;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0MYe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C570260MYe {
    public static final Map<String, String> LIZ(DraftDeleteResult draftDeleteResult) {
        HashMap map = new HashMap();
        map.put("creation_id", draftDeleteResult.creationId);
        map.put("error_code", String.valueOf(draftDeleteResult.getErrorCode()));
        map.put("draft_type", String.valueOf(draftDeleteResult.draftType));
        map.put("save_draft_time", draftDeleteResult.saveDraftTime);
        map.put("save_draft_app_version", String.valueOf(draftDeleteResult.saveDraftAppVersion));
        map.put("delete_duration", String.valueOf(draftDeleteResult.deleteDuration));
        map.put("delete_scene", draftDeleteResult.deleteScene);
        map.put("delete_db_Duration", String.valueOf(draftDeleteResult.deleteDBResult.dbDeleteDuration));
        map.put("delete_file_duration", String.valueOf(draftDeleteResult.deleteFileResult.deleteFileDuration));
        Throwable th = draftDeleteResult.codeException;
        if (th != null) {
            map.put("code_exception", Log.getStackTraceString(th));
        }
        map.put("draft_aweme_type", String.valueOf(draftDeleteResult.draftAwemeType));
        return map;
    }

    public static final Map<String, String> LIZIZ(DraftRestoreResult draftRestoreResult) {
        String str;
        HashMap map = new HashMap();
        map.put("creation_id", draftRestoreResult.creationId);
        map.put("error_code", String.valueOf(draftRestoreResult.getErrorCode()));
        if (!draftRestoreResult.checkResult.isSuc()) {
            String relativeDir = draftRestoreResult.checkResult.getRelativeDir();
            if (relativeDir != null) {
                map.put("file_relative_dir", relativeDir);
            }
            String fileName = draftRestoreResult.checkResult.getFileName();
            if (fileName != null) {
                map.put("file_name", fileName);
            }
        }
        map.put("draft_type", String.valueOf(draftRestoreResult.draftType));
        map.put("save_draft_time", draftRestoreResult.saveDraftTime);
        map.put("saving_time", String.valueOf(System.currentTimeMillis() - draftRestoreResult.lastEditTime));
        int i = 1;
        if (!draftRestoreResult.restoreFileResults.blockCreativeList.isEmpty()) {
            map.put("resource_type", ((DraftFileRestoreResult) C13LP.LJJJJZI(draftRestoreResult.restoreFileResults.blockCreativeList)).restoreException.resourceType);
        }
        map.put("save_draft_app_version", String.valueOf(draftRestoreResult.saveDraftAppVersion));
        map.put("use_creative_file_standard", String.valueOf(draftRestoreResult.useCreativeFileStandard));
        map.put("restore_duration", String.valueOf(draftRestoreResult.getDuration()));
        map.put("check_duration", String.valueOf(draftRestoreResult.checkResult.checkDuration));
        if (!draftRestoreResult.checkResult.isSuc() || (!draftRestoreResult.checkResult.fileCheckResults.notBlockCreativeList.isEmpty())) {
            map.put("check_result", LIZLLL(draftRestoreResult.checkResult, 6));
        }
        map.put("restore_file_duration", String.valueOf(draftRestoreResult.restoreFileResults.fileRestoreDuration));
        if (draftRestoreResult.isPublishedDraft()) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_posted_draft", str);
        if (!draftRestoreResult.restoreFileResults.isSuc() || (!draftRestoreResult.restoreFileResults.notBlockCreativeList.isEmpty())) {
            map.put("restore_file_result", LIZLLL(draftRestoreResult.restoreFileResults, 6));
        }
        Throwable th = draftRestoreResult.codeException;
        if (th != null) {
            map.put("code_exception", Log.getStackTraceString(th));
        }
        if (!draftRestoreResult.isSuc()) {
            map.put("file_tree_info", draftRestoreResult.fileTreeInfo);
        }
        map.put("draft_aweme_type", String.valueOf(draftRestoreResult.draftAwemeType));
        map.put("is_draft_deleted", String.valueOf(draftRestoreResult.isDraftDeleted()));
        if (draftRestoreResult.draftType != 10) {
            i = 0;
        }
        map.put("editor_pro_edited", String.valueOf(i));
        return map;
    }

    public static final Map<String, String> LIZJ(DraftSaveResult draftSaveResult) {
        String str;
        long jLongValue;
        HashMap map = new HashMap();
        map.put("creation_id", draftSaveResult.creationId);
        map.put("error_code", String.valueOf(draftSaveResult.getErrorCode()));
        if (!draftSaveResult.checkResult.isSuc()) {
            String relativeDir = draftSaveResult.checkResult.getRelativeDir();
            if (relativeDir != null) {
                map.put("file_relative_dir", relativeDir);
            }
            String fileName = draftSaveResult.checkResult.getFileName();
            if (fileName != null) {
                map.put("file_name", fileName);
            }
        }
        map.put("draft_type", String.valueOf(draftSaveResult.draftType));
        map.put("save_draft_from", String.valueOf(draftSaveResult.draftFrom));
        map.put("use_creative_file_standard", String.valueOf(draftSaveResult.useCreativeFileStandard));
        map.put("save_duration", String.valueOf(draftSaveResult.getDuration()));
        map.put("save_pre_process_duration", String.valueOf(draftSaveResult.preProcessResults.preProcessDuration));
        int i = 1;
        if (!draftSaveResult.preProcessResults.isSuc() || (!draftSaveResult.preProcessResults.notBlockCreativeList.isEmpty())) {
            map.put("save_pre_process_result", LIZLLL(draftSaveResult.preProcessResults, 6));
        }
        map.put("check_duration", String.valueOf(draftSaveResult.checkResult.checkDuration));
        if (!draftSaveResult.checkResult.isSuc() || (!draftSaveResult.checkResult.fileCheckResults.notBlockCreativeList.isEmpty())) {
            map.put("check_result", LIZLLL(draftSaveResult.checkResult, 6));
        }
        map.put("save_file_duration", String.valueOf(draftSaveResult.saveFileResults.fileSaveDuration));
        if (!draftSaveResult.saveFileResults.isSuc() || (!draftSaveResult.saveFileResults.notBlockCreativeList.isEmpty())) {
            map.put("save_file_result", LIZLLL(draftSaveResult.saveFileResults, 6));
        }
        map.put("save_db_duration", String.valueOf(draftSaveResult.saveDBResult.dbSaveDuration));
        if (!draftSaveResult.saveDBResult.isSuc()) {
            map.put("save_db_result", LIZLLL(draftSaveResult.saveDBResult, 6));
        }
        map.put("save_draft_time", draftSaveResult.saveDraftTime);
        map.put("save_draft_app_version", String.valueOf(draftSaveResult.saveDraftAppVersion));
        if (draftSaveResult.isPublishedDraft()) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_posted_draft", str);
        Throwable th = draftSaveResult.codeException;
        if (th != null) {
            map.put("code_exception", Log.getStackTraceString(th));
        }
        if (!draftSaveResult.isSuc()) {
            map.put("file_tree_info", draftSaveResult.fileTreeInfo);
        }
        map.put(Scene.SCENE_SERVICE, draftSaveResult.draftScene);
        map.put("draft_aweme_type", String.valueOf(draftSaveResult.draftAwemeType));
        map.put("content_size", C13LP.LJJLIIIJ(draftSaveResult.contentFileSizeList, ",", null, null, 0, null, null, 62));
        Long l = (Long) C13LP.LJJLIIIJLJLI(draftSaveResult.contentFileSizeList);
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        map.put("content_size_max", String.valueOf(jLongValue));
        if (draftSaveResult.draftType != 10) {
            i = 0;
        }
        map.put("editor_pro_edited", String.valueOf(i));
        map.put("content_source", draftSaveResult.contentSource);
        map.put("content_type", draftSaveResult.contentType);
        Integer num = draftSaveResult.videoCount;
        if (num != null) {
            map.put("video_cnt", String.valueOf(num.intValue()));
        }
        Integer num2 = draftSaveResult.picCount;
        if (num2 != null) {
            map.put("photo_cnt", String.valueOf(num2.intValue()));
        }
        Integer num3 = draftSaveResult.livePhotoCount;
        if (num3 != null) {
            map.put("live_photo_cnt", String.valueOf(num3.intValue()));
        }
        Integer numIsLiveVideo = draftSaveResult.isLiveVideo();
        if (numIsLiveVideo != null) {
            map.put("is_live_video", String.valueOf(numIsLiveVideo.intValue()));
        }
        String str2 = draftSaveResult.liveMode;
        if (str2 != null) {
            map.put("live_mode", str2);
        }
        String str3 = draftSaveResult.uploadTabName;
        if (str3 != null) {
            map.put("upload_tab_name", str3);
        }
        return map;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZLLL(java.lang.Object r18, int r19) {
        /*
            Method dump skipped, instruction units count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C570260MYe.LIZLLL(java.lang.Object, int):java.lang.String");
    }
}
