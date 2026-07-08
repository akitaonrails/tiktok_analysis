package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.o;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.draft.DraftInfoModel;
import com.ss.android.ugc.aweme.creative.model.edit.EditEffectModel;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.ImageStickerInfoNewEngine;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.draft.model.AVDraftAwemeCompat;
import com.ss.android.ugc.aweme.draft.model.AVDraftExtras;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.draft.model.DraftDBSaveException;
import com.ss.android.ugc.aweme.draft.model.DraftDBSaveResult;
import com.ss.android.ugc.aweme.effect.EffectListModel;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.offline.tools.debug.gp.IToolsDebugGpService;
import com.ss.android.ugc.aweme.tools.draft.db.SQLiteHelper;
import com.ss.android.ugc.aweme.tools.draft.entity.DraftViewInfo;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.EditViewUIState;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0MZJ, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MZJ {
    public static volatile C0MZJ LIZLLL;
    public final SQLiteDatabase LIZ = SQLiteHelper.getInstance().getWritableDatabase();
    public final SQLiteDatabase LIZIZ = SQLiteHelper.getInstance().getReadableDatabase();
    public volatile boolean LIZJ;

    public static C0MZJ LIZIZ() {
        if (LIZLLL == null) {
            synchronized (C0MZJ.class) {
                try {
                    if (LIZLLL == null) {
                        LIZLLL = new C0MZJ();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZLLL;
    }

    public static AwemeDraft LIZ(Cursor cursor) {
        AVDraftAwemeCompat aVDraftAwemeCompat;
        AVMusic aVMusic;
        EffectListModel effectListModel;
        CopyOnWriteArrayList<TextStickerModel> textStickerModels;
        boolean z;
        AwemeDraft awemeDraft = new AwemeDraft();
        String string = cursor.getString(cursor.getColumnIndex("user_id"));
        if (TextUtils.isEmpty(string)) {
            string = C0CHQ.LIZ().getAccountService().getCurrentUserID();
        }
        awemeDraft.LIZLLL = cursor.getString(cursor.getColumnIndex("video_path"));
        awemeDraft.LJJIIJZLJL = string;
        String string2 = cursor.getString(cursor.getColumnIndex("aweme"));
        try {
            aVDraftAwemeCompat = (AVDraftAwemeCompat) C0CHQ.LIZ().getGson().LJII(string2, AVDraftAwemeCompat.class);
        } catch (o e) {
            TryCatchGuardChecker.doCheck(e);
            C0MAY c0may = C0MAY.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("aweme-draft-monitor getAweme JsonParseException ");
            sbLIZ.append(string2);
            C201955140j.LJIIJ(c0may, C2188811AlT.LIZIZ(sbLIZ), e);
            aVDraftAwemeCompat = new AVDraftAwemeCompat();
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C0MAY c0may2 = C0MAY.LIZIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("aweme-draft-monitor getAweme Exception ");
            sbLIZ2.append(string2);
            C201955140j.LJIIJ(c0may2, C2188811AlT.LIZIZ(sbLIZ2), e2);
            aVDraftAwemeCompat = new AVDraftAwemeCompat();
        }
        awemeDraft.aweme = aVDraftAwemeCompat;
        String string3 = cursor.getString(cursor.getColumnIndex("music"));
        if (TextUtils.isEmpty(string3)) {
            aVMusic = null;
        } else {
            try {
                aVMusic = C1403010mc7.LIZ.getMusicService().transformNewAVMusic(string3);
            } catch (o e3) {
                TryCatchGuardChecker.doCheck(e3);
                C0MAY c0may3 = C0MAY.LIZIZ;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("aweme-draft-monitor getMusicModel JsonParseException ");
                sbLIZ3.append(string3);
                C201955140j.LJIIJ(c0may3, C2188811AlT.LIZIZ(sbLIZ3), e3);
                aVMusic = new AVMusic();
            } catch (Exception e4) {
                TryCatchGuardChecker.doCheck(e4);
                C0MAY c0may4 = C0MAY.LIZIZ;
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("aweme-draft-monitor getMusicModel Exception ");
                sbLIZ4.append(string3);
                C201955140j.LJIIJ(c0may4, C2188811AlT.LIZIZ(sbLIZ4), e4);
                aVMusic = new AVMusic();
            }
        }
        awemeDraft.LJ = aVMusic;
        awemeDraft.LJII = cursor.getString(cursor.getColumnIndex("music_path"));
        C0MAY c0may5 = C0MAY.LIZIZ;
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("getDraft() called, musicModel:");
        sbLIZ5.append(awemeDraft.LJ);
        sbLIZ5.append(" ,musicPath:");
        sbLIZ5.append(awemeDraft.LJII);
        C201955140j.LJIILJJIL(c0may5, C2188811AlT.LIZIZ(sbLIZ5));
        awemeDraft.LJIIIZ = cursor.getInt(cursor.getColumnIndex("video_volume"));
        awemeDraft.LJIIJ = cursor.getInt(cursor.getColumnIndex("music_volume"));
        C0MZ9.LJIIJJI(cursor.getInt(cursor.getColumnIndex("filter")), awemeDraft);
        awemeDraft.LJIILJJIL = cursor.getInt(cursor.getColumnIndex("music_start"));
        awemeDraft.LJIIIIZZ = cursor.getString(cursor.getColumnIndex("voice_path"));
        awemeDraft.lastEditTime = cursor.getLong(cursor.getColumnIndex("time"));
        awemeDraft.LJIILL = cursor.getInt(cursor.getColumnIndex("effect"));
        awemeDraft.LJIILLIIL = cursor.getInt(cursor.getColumnIndex("origin"));
        awemeDraft.LJJIIJ = cursor.getInt(cursor.getColumnIndex("face_beauty"));
        String string4 = cursor.getString(cursor.getColumnIndex("segment_video"));
        CreativeModel creativeModel = awemeDraft.LIZ;
        if (creativeModel.migrateModel.isEditModelPartitionPhase1Draft) {
            creativeModel.recordData.videoSegmentsDesc = string4;
        }
        awemeDraft.LJJIIZ = string4;
        awemeDraft.LJJIIZI = cursor.getInt(cursor.getColumnIndex("hard_encode"));
        awemeDraft.LJJIJ = cursor.getInt(cursor.getColumnIndex("special_points"));
        awemeDraft.LJJIJIIJI = cursor.getString(cursor.getColumnIndex("sticker_path"));
        awemeDraft.LJJIJIIJIL = cursor.getString(cursor.getColumnIndex("sticker_id"));
        awemeDraft.LJIL = cursor.getInt(cursor.getColumnIndex("camera_poi"));
        awemeDraft.LJIJJLI = cursor.getString(cursor.getColumnIndex("filter_label"));
        String string5 = cursor.getString(cursor.getColumnIndex("effect_list"));
        try {
        } catch (Exception e5) {
            TryCatchGuardChecker.doCheck(e5);
            C201955140j.LJIIJ(C0MAY.LIZIZ, "aweme-draft-monitor getEffectListModel Exception", e5);
        }
        if (!TextUtils.isEmpty(string5)) {
            effectListModel = (EffectListModel) C0CHQ.LIZ().getGson().LJII(string5, EffectListModel.class);
        } else {
            effectListModel = null;
        }
        awemeDraft.LJJII = effectListModel;
        awemeDraft.LJJ = cursor.getInt(cursor.getColumnIndex("beauty_label"));
        awemeDraft.LJIIZILJ = cursor.getString(cursor.getColumnIndex("reverse_path"));
        awemeDraft.LJIJ = cursor.getString(cursor.getColumnIndex("video_speed"));
        awemeDraft.LJJIFFI = cursor.getInt(cursor.getColumnIndex("is_private"));
        awemeDraft.LJJIII = cursor.getInt(cursor.getColumnIndex("max_duration"));
        String string6 = cursor.getString(cursor.getColumnIndex("photo_movie"));
        int iIntValue = 0;
        if (string6 != null && !a0.LJJJIL(string6)) {
            awemeDraft.LIZIZ = true;
        }
        awemeDraft.LJJIJL = cursor.getString(cursor.getColumnIndex("music_effect_segments"));
        awemeDraft.LJJIJLIJ = cursor.getInt(cursor.getColumnIndex("new_version"));
        awemeDraft.LJJIL = cursor.getFloat(cursor.getColumnIndex("custom_cover_start"));
        awemeDraft.LJJIZ = cursor.getString(cursor.getColumnIndex("duet_from"));
        awemeDraft.LJJJ = cursor.getString(cursor.getColumnIndex("sync_platforms"));
        try {
            String string7 = cursor.getString(cursor.getColumnIndex("draft_extras"));
            C0MAY c0may6 = C0MAY.LIZIZ;
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append("extra field failed, extras: ");
            sbLIZ6.append(string7);
            C201955140j.LJIILL(c0may6, "aweme-draft-monitor", C2188811AlT.LIZIZ(sbLIZ6));
            AVDraftExtras aVDraftExtras = (AVDraftExtras) C0CHQ.LIZ().getGson().LJII(string7, AVDraftExtras.class);
            awemeDraft.LJJJJIZL = aVDraftExtras;
            if (aVDraftExtras != null && !TextUtils.isEmpty(aVDraftExtras.draftVideoPath)) {
                awemeDraft.LJI = awemeDraft.LJJJJIZL.draftVideoPath;
            }
        } catch (Exception e6) {
            TryCatchGuardChecker.doCheck(e6);
            C1AF0.LJ(new Throwable(e6) { // from class: X.0MZQ
                public static final int $stable = 8;
            });
            C201955140j.LJIIJ(C0MAY.LIZIZ, "aweme-draft-monitor", e6);
        } catch (OutOfMemoryError e7) {
            TryCatchGuardChecker.doCheck(e7);
            C1AF0.LJ(new Throwable(e7) { // from class: X.0MZR
                public static final int $stable = 8;
            });
            C201955140j.LJIIJ(C0MAY.LIZIZ, "aweme-draft-monitor", e7);
        }
        AVDraftExtras aVDraftExtras2 = awemeDraft.LJJJJIZL;
        if (aVDraftExtras2 == null || TextUtils.isEmpty(aVDraftExtras2.draftVideoPath)) {
            String string8 = cursor.getString(cursor.getColumnIndex("video_path"));
            awemeDraft.LJI = string8;
            AVDraftExtras aVDraftExtras3 = awemeDraft.LJJJJIZL;
            if (aVDraftExtras3 != null) {
                aVDraftExtras3.draftVideoPath = string8;
            }
        }
        awemeDraft.saveTime = cursor.getLong(cursor.getColumnIndex("save_time"));
        int columnIndex = cursor.getColumnIndex("is_published");
        if (columnIndex > 0) {
            if (cursor.getInt(columnIndex) == 1) {
                z = true;
            } else {
                z = false;
            }
            awemeDraft.LJJJI = z;
        }
        int columnIndex2 = cursor.getColumnIndex("published_time");
        if (columnIndex2 > 0) {
            awemeDraft.LJJJIL = cursor.getLong(columnIndex2);
        }
        int columnIndex3 = cursor.getColumnIndex("published_aweme_id");
        if (columnIndex3 > 0) {
            awemeDraft.LJJJJ = cursor.getString(columnIndex3);
        }
        try {
            awemeDraft.LIZ = (CreativeModel) ((Gson) C09E3.LIZ.getValue()).LJII(cursor.getString(cursor.getColumnIndex("creative_model")), CreativeModel.class);
        } catch (Exception e8) {
            TryCatchGuardChecker.doCheck(e8);
            ((IToolsDebugGpService) ServiceManager.get().getService(IToolsDebugGpService.class)).isOpen();
            awemeDraft.LIZ = new CreativeModel();
            C201955140j.LJIIJ(C0MAY.LIZIZ, "aweme-draft-monitor CreativeMode fromJson Exception", e8);
        }
        AVDraftExtras aVDraftExtras4 = awemeDraft.LJJJJIZL;
        String str = aVDraftExtras4.creationId;
        if (str == null || str.length() == 0) {
            aVDraftExtras4.creationId = C0DMI.LIZ();
        }
        if (aVDraftExtras4.creativeInfo == null) {
            aVDraftExtras4.creativeInfo = new CreativeInfo(aVDraftExtras4.creationId, 0, null, 6, null);
        }
        String str2 = aVDraftExtras4.sessionId;
        if (str2 != null && str2.length() != 0) {
            CreativeInfo creativeInfo = aVDraftExtras4.creativeInfo;
            aVDraftExtras4.creativeInfo = creativeInfo.copy(creativeInfo.creationId, creativeInfo.version, aVDraftExtras4.sessionId);
        }
        CreativeModel creativeModel2 = awemeDraft.LIZ;
        DraftInfoModel draftInfoModel = creativeModel2.draftInfoModel;
        draftInfoModel.isDraft = true;
        draftInfoModel.isPublishedDraft = draftInfoModel.isPublishedDraft;
        draftInfoModel.publishedTime = draftInfoModel.publishedTime;
        String str3 = draftInfoModel.publishedAwemeId;
        if (str3 == null) {
            str3 = "";
        }
        draftInfoModel.publishedAwemeId = str3;
        EffectListModel effectListModel2 = awemeDraft.LJJII;
        if (effectListModel2 != null) {
            creativeModel2.editEffectModel.effectList = effectListModel2.getEffectPointModels();
        }
        if (awemeDraft.LJIILL != 0) {
            EditEffectModel editEffectModel = awemeDraft.LIZ.editEffectModel;
            EffectPointModel effectPointModel = new EffectPointModel();
            effectPointModel.setKey(String.valueOf(awemeDraft.LJIILL));
            Integer num = awemeDraft.LJJJJIZL.timeEffectStartPoint;
            if (num != null) {
                iIntValue = num.intValue();
            }
            effectPointModel.setStartPoint(iIntValue);
            effectPointModel.setEndPoint(awemeDraft.LJJIJ);
            editEffectModel.timeEffect = effectPointModel;
        }
        MusicBuzModel musicBuzModel = awemeDraft.LIZ.musicBuzModel;
        if (musicBuzModel.isDraftMusicValid) {
            awemeDraft.LJ = MusicBeanUtilKt.extractAVMusic(musicBuzModel);
        } else {
            MusicBeanUtilKt.updateAVMusic(musicBuzModel, awemeDraft.LJ);
        }
        ImageAlbumData imageAlbumData = awemeDraft.LJJJJIZL.imageAlbumData;
        if (imageAlbumData != null) {
            Iterator<SingleImageData> it2 = imageAlbumData.getImageList().iterator();
            while (it2.hasNext()) {
                ImageStickerInfoNewEngine stickerInfoNewEngine = it2.next().getStickerInfoNewEngine();
                if (stickerInfoNewEngine != null && (textStickerModels = stickerInfoNewEngine.getTextStickerModels()) != null) {
                    Iterator<TextStickerModel> it3 = textStickerModels.iterator();
                    while (it3.hasNext()) {
                        it3.next().setEditViewUIState(new EditViewUIState((C0FHM) null, (C0FHM) null, 7));
                    }
                }
            }
            if (C297660Blc.LIZ()) {
                Iterator<SingleImageData> it4 = imageAlbumData.getImageList().iterator();
                while (it4.hasNext()) {
                    it4.next().setSynthesisData(null);
                }
            }
        }
        return awemeDraft;
    }

    public final DraftDBSaveResult LIZLLL(AwemeDraft awemeDraft) {
        String strLIZJ;
        String strLIZJ2;
        C0M4I c0m4i;
        AVMusic aVMusic;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (TextUtils.isEmpty(awemeDraft.LJJJJIZL.filterLocalPath)) {
            awemeDraft.LJJJJIZL.filterLocalPath = C0CHQ.LIZ().LJJIL().LIZ().getFilter(awemeDraft.LJIILIIL).getFilterFolder();
        }
        ContentValues contentValues = new ContentValues();
        AVDraftAwemeCompat aVDraftAwemeCompat = awemeDraft.aweme;
        String musicId = "";
        if (aVDraftAwemeCompat == null) {
            strLIZJ = "";
        } else {
            strLIZJ = LIZJ(C0CHQ.LIZ().getGson(), aVDraftAwemeCompat);
        }
        contentValues.put("aweme", strLIZJ);
        contentValues.put("video_path", awemeDraft.LIZJ());
        contentValues.put("music_path", awemeDraft.LJII);
        contentValues.put("video_volume", Integer.valueOf(awemeDraft.LJIIIZ));
        contentValues.put("music_volume", Integer.valueOf(awemeDraft.LJIIJ));
        if (awemeDraft.LIZ.musicBuzModel.isDraftMusicValid || (aVMusic = awemeDraft.LJ) == null) {
            strLIZJ2 = "";
        } else {
            strLIZJ2 = LIZJ(C0CHQ.LIZ().getGson(), aVMusic);
        }
        contentValues.put("music", strLIZJ2);
        contentValues.put("filter", Integer.valueOf(awemeDraft.LJIILIIL));
        contentValues.put("music_start", Integer.valueOf(awemeDraft.LJIILJJIL));
        contentValues.put("time", Long.valueOf(awemeDraft.lastEditTime));
        contentValues.put("effect", (Integer) 0);
        contentValues.put("origin", Integer.valueOf(awemeDraft.LJIILLIIL));
        contentValues.put("face_beauty", Integer.valueOf(awemeDraft.LJJIIJ));
        contentValues.put("user_id", awemeDraft.LJJIIJZLJL);
        contentValues.put("segment_video", awemeDraft.LJII());
        contentValues.put("hard_encode", Integer.valueOf(awemeDraft.LJJIIZI));
        contentValues.put("special_points", (Integer) 0);
        contentValues.put("sticker_path", awemeDraft.LJJIJIIJI);
        contentValues.put("sticker_id", awemeDraft.LJJIJIIJIL);
        contentValues.put("camera_poi", Integer.valueOf(awemeDraft.LJIL));
        contentValues.put("filter_label", awemeDraft.LJIJJLI);
        contentValues.put("beauty_label", Integer.valueOf(awemeDraft.LJJ));
        contentValues.put("video_speed", awemeDraft.LJIJ);
        contentValues.put("music_effect_segments", awemeDraft.LJJIJL);
        contentValues.put("is_private", Integer.valueOf(awemeDraft.LJJIFFI));
        contentValues.put("max_duration", Long.valueOf(awemeDraft.LJJIII));
        contentValues.put("effect_list", "");
        AVMusic aVMusic2 = awemeDraft.LJ;
        if (aVMusic2 != null) {
            if (aVMusic2.isLocalMusic()) {
                musicId = String.valueOf(aVMusic2.getLocalMusicId());
            } else {
                musicId = aVMusic2.getMusicId();
            }
        }
        contentValues.put("music_id", musicId);
        contentValues.put("new_version", Integer.valueOf(awemeDraft.LJJIJLIJ));
        contentValues.put("custom_cover_start", Float.valueOf(awemeDraft.LJJIL));
        contentValues.put("duet_from", awemeDraft.LJJIZ);
        contentValues.put("sync_platforms", awemeDraft.LJJJ);
        contentValues.put("draft_extras", LIZJ(C0CHQ.LIZ().getGson(), awemeDraft.LJJJJIZL));
        AwemeDraft awemeDraftLIZJ = C0M4A.LIZJ(new C0M4B(awemeDraft.LIZIZ(), false, (List) null, 14));
        long j = awemeDraft.lastEditTime;
        if (awemeDraftLIZJ != null) {
            long j2 = awemeDraftLIZJ.saveTime;
            if (j2 != 0 && !awemeDraft.LJJJJI) {
                j = j2;
            }
        }
        awemeDraft.saveTime = j;
        contentValues.put("save_time", Long.valueOf(j));
        DraftViewInfo draftViewInfoLIZ = C562270M3l.LIZ(awemeDraft);
        contentValues.put("draft_view_info", LIZJ(C0CHQ.LIZ().getGson(), draftViewInfoLIZ));
        contentValues.put("free_up_space", Long.valueOf(draftViewInfoLIZ.draftOperationInfo.freeUpSpace));
        contentValues.put("with_template", Boolean.valueOf(C554810LpP.LIZIZ(awemeDraft)));
        contentValues.put("with_effect", Boolean.valueOf(C554810LpP.LIZ(awemeDraft)));
        contentValues.put("creative_model", LIZJ((Gson) C09E3.LIZ.getValue(), awemeDraft.LIZ));
        contentValues.put("visible_to_user", Integer.valueOf(awemeDraft.LJFF ? 1 : 0));
        contentValues.put("is_published", Integer.valueOf(awemeDraft.LJJJI ? 1 : 0));
        contentValues.put("published_time", Long.valueOf(awemeDraft.LJJJIL));
        contentValues.put("published_aweme_id", awemeDraft.LJJJJ);
        AVDraftExtras aVDraftExtras = awemeDraft.LJJJJIZL;
        if (aVDraftExtras.creationMode == 2) {
            c0m4i = C0M4I.PHOTO_MODE;
        } else if (aVDraftExtras.lighteningExtraInfo != null) {
            c0m4i = C0M4I.STORY_LIGHTENING;
        } else {
            c0m4i = C0M4I.DEFAULT;
        }
        contentValues.put("format_type", Integer.valueOf(c0m4i.getValue()));
        DraftDBSaveResult draftDBSaveResult = new DraftDBSaveResult();
        try {
            C0MAY c0may = C0MAY.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("start draft save, musicModel: ");
            sbLIZ.append(awemeDraft.LJ);
            sbLIZ.append(", musicPath:");
            sbLIZ.append(awemeDraft.LJII);
            C201955140j.LJIILJJIL(c0may, C2188811AlT.LIZIZ(sbLIZ));
            long jReplaceOrThrow = this.LIZ.replaceOrThrow("local_draft", null, contentValues);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("draft save done, rowId: ");
            sbLIZ2.append(jReplaceOrThrow);
            C201955140j.LJIILJJIL(c0may, C2188811AlT.LIZIZ(sbLIZ2));
            if (jReplaceOrThrow < 0) {
                long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("rowId : ");
                sbLIZ3.append(jReplaceOrThrow);
                return new DraftDBSaveResult(jCurrentTimeMillis2, new DraftDBSaveException(C386801es.DEFAULT, new RuntimeException(C2188811AlT.LIZIZ(sbLIZ3))));
            }
            return draftDBSaveResult;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return new DraftDBSaveResult(System.currentTimeMillis() - jCurrentTimeMillis, new DraftDBSaveException(-1001, e));
        }
    }

    public static String LIZJ(Gson gson, Object obj) {
        int i = 0;
        boolean z = true;
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_draft_save_json_modification_retry", true) == 0) {
            z = false;
        }
        if (z) {
            if (obj == null) {
                return "";
            }
            ConcurrentModificationException e = null;
            while (true) {
                String json = "aweme-draft-monitor CreativeModel";
                if (i < 3) {
                    try {
                        json = GsonProtectorUtils.toJson(gson, obj);
                        return json;
                    } catch (ConcurrentModificationException e2) {
                        e = e2;
                        TryCatchGuardChecker.doCheck(e);
                        C0MAY c0may = C0MAY.LIZIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(json);
                        sbLIZ.append(" toJson ConcurrentModificationException, retry ");
                        i++;
                        sbLIZ.append(i);
                        C201955140j.LJIJI(c0may, C2188811AlT.LIZIZ(sbLIZ));
                    }
                } else {
                    if (e != null) {
                        C0MAY c0may2 = C0MAY.LIZIZ;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("aweme-draft-monitor CreativeModel");
                        sbLIZ2.append(" toJson failed after ");
                        sbLIZ2.append(3);
                        sbLIZ2.append(" retries");
                        C201955140j.LJIIJ(c0may2, C2188811AlT.LIZIZ(sbLIZ2), e);
                        throw e;
                    }
                    throw new RuntimeException("serialize failed");
                }
            }
        } else {
            return GsonProtectorUtils.toJson((Gson) C09E3.LIZ.getValue(), obj);
        }
    }
}
