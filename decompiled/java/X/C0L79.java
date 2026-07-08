package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.autocut.s;
import com.ss.android.ugc.aweme.creative.model.CreativeInitialModel;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.HighLightVideoParametersModel;
import com.ss.android.ugc.aweme.creative.model.NLEInfoModel;
import com.ss.android.ugc.aweme.creative.model.album.AlbumModel;
import com.ss.android.ugc.aweme.creative.model.album.ImportVideoInfo;
import com.ss.android.ugc.aweme.creative.model.draft.DraftInfoModel;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.property.AVSettingsWrapper;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.services.optimization.ILayoutPreloadServiceForEditPage;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo;
import com.ss.android.ugc.aweme.shortvideo.model.AVETParameter;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0L79, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0L79 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1417310mzB LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ List<TikTokMediaModel> LLILLL;
    public final /* synthetic */ ShortVideoContext LLILZ;
    public final /* synthetic */ VideoPublishEditModel LLILZIL;
    public final /* synthetic */ C1DRG LLILZLL;
    public final /* synthetic */ C19EG LLIZ;
    public final /* synthetic */ boolean LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0L79(C1417310mzB c1417310mzB, String str, List<? extends TikTokMediaModel> list, ShortVideoContext shortVideoContext, VideoPublishEditModel videoPublishEditModel, C1DRG c1drg, C19EG c19eg, boolean z) {
        super(0);
        this.LL = c1417310mzB;
        this.LLILLJJLI = str;
        this.LLILLL = list;
        this.LLILZ = shortVideoContext;
        this.LLILZIL = videoPublishEditModel;
        this.LLILZLL = c1drg;
        this.LLIZ = c19eg;
        this.LLIZLLLIL = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() throws Throwable {
        Bundle extras;
        Bundle extras2;
        Bundle extras3;
        HighLightVideoParametersModel highLightVideoParametersModel;
        C1417310mzB c1417310mzB = this.LL;
        NLEModel nLEModel = c1417310mzB.LJII;
        if (nLEModel != null) {
            String strLJJLIIIJJIZ = this.LLILLJJLI;
            List<TikTokMediaModel> list = this.LLILLL;
            ShortVideoContext shortVideoContext = this.LLILZ;
            VideoPublishEditModel videoPublishEditModel = this.LLILZIL;
            C1DRG c1drg = this.LLILZLL;
            C19EG c19eg = this.LLIZ;
            boolean z = this.LLIZLLLIL;
            C0L4U c0l4u = C0L4U.LIZ;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            for (TikTokMediaModel tikTokMediaModel : list) {
                TikTokMediaModel.Companion.getClass();
                arrayList.add(C527240Km2.LIZIZ(tikTokMediaModel));
            }
            c0l4u.getClass();
            Intent intent = new Intent();
            C0MUK.LJIIIZ(intent, shortVideoContext.creativeModel);
            CreativeModel creativeModelLIZIZ = C0MUK.LIZIZ(intent);
            if (videoPublishEditModel != null) {
                C580260MpM.LIZ(intent, videoPublishEditModel);
            }
            NLEInfoModel nLEInfoModel = creativeModelLIZIZ.nleInfoModel;
            if (strLJJLIIIJJIZ == null) {
                s sVar = s.LIZ;
                int value = EnumC1412640mre.ALGORITHM_TEMPLATE.getValue();
                sVar.getClass();
                strLJJLIIIJJIZ = s.LJJLIIIJJIZ(nLEModel, value);
            }
            nLEInfoModel.nleData = strLJJLIIIJJIZ;
            intent.putExtra("extra_request_code", 12347);
            intent.putExtra("voice_volume", 0.0f);
            Throwable th = null;
            Scene scene = (Scene) c1drg.LJIIL(null, AbstractC214814194y.class);
            if (scene == null || (extras = scene.mArguments) == null) {
                try {
                    extras = ((Activity) c1drg.LJII(Activity.class, null)).getIntent().getExtras();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    extras = null;
                }
            }
            intent.putExtra("extra_edit_effect_uid", extras != null ? extras.getString("extra_edit_effect_uid") : null);
            int[] importVideoSize = AVSettingsWrapper.getImportVideoSize();
            Pair pair = (importVideoSize == null || importVideoSize.length != 2) ? new Pair(1920, 1080) : new Pair(Integer.valueOf(importVideoSize[0]), Integer.valueOf(importVideoSize[1]));
            VideoFileInfo videoFileInfo = new VideoFileInfo(((Number) pair.getFirst()).intValue(), ((Number) pair.getSecond()).intValue(), nLEModel.getDuration(), 30, 0, 0, 0, 0, 0.0f, 496, null);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(s.LJIIL(shortVideoContext.creativeInfo));
            s.LIZ.getClass();
            sbLIZ.append(s.LJJII());
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            C570490MZb.LJI(new C0VSJ(strLIZIZ));
            creativeModelLIZIZ.editModel.editPreviewInfo = new C538330L9j(((Number) pair.getFirst()).intValue(), ((Number) pair.getSecond()).intValue(), 12).LIZ(new EditVideoSegment(strLIZIZ, null, videoFileInfo));
            if (C0C64.LJIILLIIL().LJIIIZ(31744, "autocut_album_force_build_multi_edit_record_data", true, true)) {
                creativeModelLIZIZ.editModel.multiEditVideoStatusRecordData = C0L4U.LIZIZ(intent, arrayList, c19eg);
            } else if (!C0C64.LJIILLIIL().LJIIIZ(31744, "disable_autocut_path_adjust_clip_experiment", true, false) && !C338630DPh.LIZ()) {
                creativeModelLIZIZ.editModel.multiEditVideoStatusRecordData = C0L4U.LIZIZ(intent, arrayList, c19eg);
            }
            AVETParameter aVETParameterLJ = shortVideoContext.LJ();
            if (aVETParameterLJ != null) {
                intent.putExtra("challenge", (Serializable) C1443030nef.LJII().LIZ);
                intent.putExtra("shoot_way", shortVideoContext.shootWay);
                C537520L6g.LIZLLL(intent, shortVideoContext.creativeInfo);
                intent.putExtra("is_private", shortVideoContext.LJIILLIIL());
                creativeModelLIZIZ.recordData.shootMode = aVETParameterLJ.getShootMode() == 0 ? shortVideoContext.shootMode : aVETParameterLJ.getShootMode();
                if (shortVideoContext.LJJJJJL()) {
                    intent.putExtra("reuse_original_sound_id", shortVideoContext.LJIJ());
                    intent.putExtra("reuse_original_sound_url", shortVideoContext.LJIJJ());
                    intent.putExtra("reuse_original_sound_length", shortVideoContext.LJIJI());
                }
                DraftInfoModel draftInfoModel = C0MUK.LIZIZ(intent).draftInfoModel;
                draftInfoModel.newDraftId = aVETParameterLJ.getNewDraftId();
                draftInfoModel.draftId = aVETParameterLJ.getDraftId();
                intent.putExtra("origin", 0);
                intent.putExtra("content_source", "upload");
                creativeModelLIZIZ.creativeFlowData = shortVideoContext.creativeFlowData;
                intent.putExtra("share_id", shortVideoContext.mShareId);
                intent.putExtra("channel", shortVideoContext.clientId);
                creativeModelLIZIZ.editStickerModel.commentVideoModel = shortVideoContext.LJFF();
                C0MUK.LIZIZ(intent).ttsVoiceModel = shortVideoContext.ttsVoiceModel;
                intent.putExtra("extra_start_enter_edit_page", System.currentTimeMillis());
                intent.putExtra("use_music_before_edit", true);
                if (shortVideoContext.cameraComponentModel.mMusicPath != null && MusicBeanUtilKt.extractAVMusic(shortVideoContext.creativeModel.musicBuzModel) != null) {
                    intent.putExtra("path", shortVideoContext.cameraComponentModel.mMusicPath);
                    intent.putExtra("music_model", C1403010mc7.LIZ.getMusicService().transformAVMusic(MusicBeanUtilKt.extractAVMusic(shortVideoContext.creativeModel.musicBuzModel)));
                    if (Intrinsics.LJFF(shortVideoContext.enterFrom, "music_detail")) {
                        intent.putExtra("music_origin", "single_song");
                    } else {
                        intent.putExtra("music_origin", "auto_cut_music_recommend");
                    }
                    intent.putExtra("extra_need_add_recent", true);
                    AVMusic aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(shortVideoContext.creativeModel.musicBuzModel);
                    intent.putExtra(FollowStatusChangeMethod.PARAM_UID, aVMusicExtractAVMusic != null ? aVMusicExtractAVMusic.getMusicId() : null);
                    if (C294040Bfm.LIZ()) {
                        intent.putExtra("music_start", shortVideoContext.cameraComponentModel.mMusicStart);
                        intent.putExtra("music_end", shortVideoContext.cameraComponentModel.musicEndTime);
                    }
                }
                intent.putExtra("workspace", shortVideoContext.cameraComponentModel.mWorkspace);
                ArrayList<ImportVideoInfo> arrayList2 = new ArrayList<>(C15438062q.LJIJJ(arrayList, 10));
                int i = 0;
                for (Object obj : arrayList) {
                    int i2 = i + 1;
                    if (i < 0) {
                        C1697810uHb.LJIJI();
                        throw th;
                    }
                    MediaModel mediaModel = (MediaModel) obj;
                    arrayList2.add(new ImportVideoInfo(mediaModel.width, mediaModel.height, 0, 0, String.valueOf(i), mediaModel.endTime - mediaModel.startTime, mediaModel.duration, null, null, 0, 0.0f, mediaModel.LJFF(), mediaModel.LJFF(), false, null, mediaModel.aigcInfo, 0L, 92044, null));
                    i = i2;
                    th = null;
                }
                creativeModelLIZIZ.albumModel.importInfoList = arrayList2;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : arrayList) {
                    if (((MediaModel) obj2).LJIIL()) {
                        arrayList3.add(obj2);
                    }
                }
                if (!arrayList3.isEmpty()) {
                    CreativeInitialModel creativeInitialModel = creativeModelLIZIZ.initialModel;
                    if (creativeInitialModel != null) {
                        HighLightVideoParametersModel highLightVideoParametersModel2 = creativeInitialModel.highLightVideoParametersModel;
                        if (highLightVideoParametersModel2 != null) {
                            highLightVideoParametersModel2.fromLiveRecordingsAlbum = true;
                        }
                        HighLightVideoParametersModel highLightVideoParametersModel3 = creativeInitialModel.highLightVideoParametersModel;
                        if (highLightVideoParametersModel3 != null) {
                            highLightVideoParametersModel3.publisherIdentity = "anchor";
                        }
                        HighLightVideoParametersModel highLightVideoParametersModel4 = creativeInitialModel.highLightVideoParametersModel;
                        if (highLightVideoParametersModel4 != null) {
                            ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(arrayList3, 10));
                            Iterator it2 = arrayList3.iterator();
                            while (it2.hasNext()) {
                                arrayList4.add(((MediaModel) it2.next()).id);
                            }
                            highLightVideoParametersModel4.albumFragmentIds = arrayList4;
                        }
                    }
                    CreativeInitialModel creativeInitialModel2 = creativeModelLIZIZ.initialModel;
                    if (creativeInitialModel2 != null && (highLightVideoParametersModel = creativeInitialModel2.highLightVideoParametersModel) != null) {
                        ArrayList arrayList5 = new ArrayList(C15438062q.LJIJJ(arrayList3, 10));
                        Iterator it3 = arrayList3.iterator();
                        while (it3.hasNext()) {
                            arrayList5.add(String.valueOf(((MediaModel) it3.next()).liveHighlightType));
                        }
                        highLightVideoParametersModel.albumFragmentTypes = arrayList5;
                    }
                } else {
                    CreativeInitialModel creativeInitialModel3 = creativeModelLIZIZ.initialModel;
                    if (creativeInitialModel3 != null) {
                        HighLightVideoParametersModel highLightVideoParametersModel5 = creativeInitialModel3.highLightVideoParametersModel;
                        if (highLightVideoParametersModel5 != null) {
                            highLightVideoParametersModel5.albumFragmentIds = C13BV.INSTANCE;
                        }
                        HighLightVideoParametersModel highLightVideoParametersModel6 = creativeInitialModel3.highLightVideoParametersModel;
                        if (highLightVideoParametersModel6 != null) {
                            highLightVideoParametersModel6.albumFragmentTypes = C13BV.INSTANCE;
                        }
                        HighLightVideoParametersModel highLightVideoParametersModel7 = creativeInitialModel3.highLightVideoParametersModel;
                        if (highLightVideoParametersModel7 != null) {
                            highLightVideoParametersModel7.fromLiveRecordingsAlbum = false;
                        }
                        HighLightVideoParametersModel highLightVideoParametersModel8 = creativeInitialModel3.highLightVideoParametersModel;
                        if (highLightVideoParametersModel8 != null) {
                            highLightVideoParametersModel8.publisherIdentity = "";
                        }
                    }
                }
                intent.putExtra("commerce_data_in_tools_line", shortVideoContext.extraSession.commerceData);
                intent.putExtra("extra_start_enter_edit_page", System.currentTimeMillis());
            }
            if (((Number) C0BJ2.LIZ.getValue()).intValue() != 0) {
                C0L77.LIZ = shortVideoContext;
                intent.putParcelableArrayListExtra("extra_image_model_media_list", C09HN.LIZ(arrayList));
            }
            creativeModelLIZIZ.eventData.shootEnterMethod = shortVideoContext.enterMethod;
            if (!creativeModelLIZIZ.autoPickModel.mediaList.isEmpty()) {
                intent.putExtra("enter_edit_page_method", "click_back_button");
            }
            intent.putExtra("shoot_from", shortVideoContext.mShootFrom);
            AlbumModel albumModel = creativeModelLIZIZ.albumModel;
            String str = shortVideoContext.uploadMethod;
            if (str == null) {
                str = "";
            }
            albumModel.uploadMethod = str;
            List<String> list2 = shortVideoContext.uploadTabNameList;
            if (list2 != null) {
                albumModel.uploadTabNameList = new ArrayList(list2);
            }
            String str2 = shortVideoContext.albumPreviewNextMethod;
            intent.putExtra("upload_next_method", str2 != null ? str2 : "");
            if (c1417310mzB.LIZJ == EnumC1412640mre.CUT_SAME.getValue()) {
                if (c1417310mzB.LIZ()) {
                    intent.putExtra("voice_volume", 0.0f);
                } else {
                    intent.putExtra("voice_volume", 1.0f);
                }
            }
            if (z) {
                C1660680tJi.LIZ().LJIIZILJ(c19eg, intent, true);
            } else {
                ILayoutPreloadServiceForEditPage iLayoutPreloadServiceForEditPage = (ILayoutPreloadServiceForEditPage) ServiceManager.get().getService(ILayoutPreloadServiceForEditPage.class);
                try {
                    extras2 = intent.getExtras();
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    extras2 = null;
                }
                iLayoutPreloadServiceForEditPage.preloadLayoutFiles(c19eg, extras2);
                try {
                    extras3 = intent.getExtras();
                } catch (Exception e3) {
                    TryCatchGuardChecker.doCheck(e3);
                    extras3 = null;
                }
                C0MWH.LJIILLIIL(c19eg, extras3);
            }
        }
        return Unit.LIZ;
    }
}
