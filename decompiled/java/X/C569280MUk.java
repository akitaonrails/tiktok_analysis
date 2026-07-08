package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.album.ImportVideoInfo;
import com.ss.android.ugc.aweme.creative.model.edit.EditModel;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.edit.Cut2EditTransferModel;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.OriginalAudioStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.services.external.ui.ChangeBanMusicConfig;
import com.ss.android.ugc.aweme.services.optimization.ILayoutPreloadServiceForEditPage;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo;
import com.ss.android.ugc.aweme.utils.oh;
import com.ss.android.vesdk.VEUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0MUk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.external.ui.EditServiceImpl$startEditorProChangeBanMusic$2", f = "EditServiceImpl.kt", l = {}, m = "invokeSuspend")
public final class C569280MUk extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ ChangeBanMusicConfig LLILLJJLI;
    public final /* synthetic */ VEUtils.VEVideoFileInfo LLILLL;
    public final /* synthetic */ Aweme LLILZ;
    public final /* synthetic */ Activity LLILZIL;
    public final /* synthetic */ Function0<Unit> LLILZLL;
    public final /* synthetic */ Function0<Unit> LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ String LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C569280MUk(Activity activity, Aweme aweme, ChangeBanMusicConfig changeBanMusicConfig, VEUtils.VEVideoFileInfo vEVideoFileInfo, String str, String str2, String str3, InterfaceC1364105Vn interfaceC1364105Vn, Function0 function0, Function0 function02) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = changeBanMusicConfig;
        this.LLILLL = vEVideoFileInfo;
        this.LLILZ = aweme;
        this.LLILZIL = activity;
        this.LLILZLL = function0;
        this.LLIZ = function02;
        this.LLIZLLLIL = str2;
        this.LLJ = str3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        String str = this.LL;
        ChangeBanMusicConfig changeBanMusicConfig = this.LLILLJJLI;
        VEUtils.VEVideoFileInfo vEVideoFileInfo = this.LLILLL;
        Aweme aweme = this.LLILZ;
        return new C569280MUk(this.LLILZIL, aweme, changeBanMusicConfig, vEVideoFileInfo, str, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn, this.LLILZLL, this.LLIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        boolean z;
        Bundle extras;
        Bundle extras2;
        C1C7U.LIZ("EditServiceImpl@7fc6.startEditorProChangeBanMusic$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        ArrayList<ImportVideoInfo> arrayListLJ = C1697810uHb.LJ(new ImportVideoInfo(0, 0, 0, 0, this.LL, 0L, 0L, null, null, 0, 0.0f, null, null, false, null, null, 0L, 131055, null));
        C538330L9j c538330L9j = new C538330L9j(0, 0, 15);
        String str3 = this.LL;
        String voicePath = this.LLILLJJLI.getVoicePath();
        VEUtils.VEVideoFileInfo vEVideoFileInfo = this.LLILLL;
        EditPreviewInfo editPreviewInfoLIZ = c538330L9j.LIZ(new EditVideoSegment(str3, voicePath, new VideoFileInfo(vEVideoFileInfo.width, vEVideoFileInfo.height, vEVideoFileInfo.duration, vEVideoFileInfo.fps, 0, 0, 0, 0, 0.0f, 496, null)));
        Intent intent = new Intent();
        VEUtils.VEVideoFileInfo vEVideoFileInfo2 = this.LLILLL;
        Aweme aweme = this.LLILZ;
        String str4 = this.LLIZLLLIL;
        String str5 = this.LLJ;
        ChangeBanMusicConfig changeBanMusicConfig = this.LLILLJJLI;
        C0MUK.LJIIIZ(intent, C0MUK.LJIIIIZZ());
        C0MUK.LIZIZ(intent).albumModel.importInfoList = arrayListLJ;
        C0MUK.LIZIZ(intent).editModel.videoDurationFromVideoCutPage = vEVideoFileInfo2.duration;
        List<AnchorCommonStruct> anchors = aweme.getAnchors();
        if (anchors != null) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(anchors, 10));
            Iterator<AnchorCommonStruct> it2 = anchors.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().getId());
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                if (C123100dR.LIZ((String) obj2)) {
                    arrayList2.add(obj2);
                }
            }
            String strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList2, ",", null, null, 0, null, null, 62);
            if (strLJJLIIIJ != null) {
                C0MUK.LIZIZ(intent).recordEffectModel.stickerID = strLJJLIIIJ;
            }
        }
        intent.putExtra("shoot_way", "change_ban_music_ep");
        C0MUK.LIZIZ(intent).eventData.enterFrom = str4;
        C0MUK.LIZIZ(intent).eventData.shootEnterMethod = str5;
        intent.putExtra("content_type", "replace_music");
        intent.putExtra("content_source", "replace_music");
        C0MUK.LIZIZ(intent).editModel.editPreviewInfo = editPreviewInfoLIZ;
        C537520L6g.LIZLLL(intent, changeBanMusicConfig.getCreationInfo());
        intent.putExtra("is_sub_only_video", aweme.isSubOnlyVideo());
        if (changeBanMusicConfig.getVoicePath() != null) {
            intent.putExtra("voice_vid", changeBanMusicConfig.getOriginalAudioVid());
        }
        intent.putExtra("enable_music_path_check", false);
        MusicBuzModel musicBuzModel = changeBanMusicConfig.getMusicBuzModel();
        if (musicBuzModel != null) {
            C0MUK.LIZIZ(intent).musicBuzModel = musicBuzModel;
        }
        C0MUK.LIZIZ(intent).musicBuzModel.musicMuteDetailUrl = changeBanMusicConfig.getMusicMuteDetailUrl();
        if (this.LLILZ.getMusic() != null && !TextUtils.isEmpty(this.LLILZ.getMusic().getIdStr())) {
            intent.putExtra("music_id", this.LLILZ.getMusic().getIdStr());
        }
        if (!TextUtils.isEmpty(this.LLILZ.getAid()) && this.LLILZ.getVideo() != null && this.LLILZ.getVideo().getPlayAddr().getOriginUri() != null) {
            intent.putExtra(FollowStatusChangeMethod.PARAM_UID, this.LLILZ.getAid());
            intent.putExtra("video_id", this.LLILZ.getVideo().getPlayAddr().getOriginUri());
            intent.putExtra("video_cover", (String) ListProtector.get(this.LLILZ.getVideo().getCover().getUrlList(), 0));
            OriginalAudioStruct originalAudioStruct = this.LLILZ.strippedOriginalAudio;
            if (originalAudioStruct != null) {
                str = originalAudioStruct.vid;
            } else {
                str = null;
            }
            intent.putExtra("stripped_origin_audio_vid", str);
            if (C10IT.LJIIIIZZ(this.LLILZ)) {
                str2 = "copyright";
            } else {
                str2 = "other";
            }
            intent.putExtra("mute_reason", str2);
            Cut2EditTransferModel cut2EditTransferModel = new Cut2EditTransferModel(false, false, new ArrayList(), 0L, 0L, 0L, 0L, false);
            C569290MUl c569290MUl = new Object() { // from class: X.0MUl
            };
            Activity activity = this.LLILZIL;
            List<EditVideoSegment> videoList = editPreviewInfoLIZ.getVideoList();
            long jCurrentTimeMillis = System.currentTimeMillis();
            c569290MUl.getClass();
            Workspace workspaceLIZ = C14D2.LIZ(C537520L6g.LIZ(intent));
            C569220MUe c569220MUe = new C569220MUe();
            c569220MUe.LJIIIIZZ = workspaceLIZ;
            C569350MUr.LIZ.getClass();
            C569350MUr.LIZIZ(c569220MUe, intent);
            ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(videoList, 10));
            for (EditVideoSegment editVideoSegment : videoList) {
                new Object() { // from class: X.0MUl
                }.getClass();
                VideoSegment videoSegment = new VideoSegment(editVideoSegment.getVideoPath(), editVideoSegment.getVideoPath(), editVideoSegment.getVideoFileInfo().getWidth(), editVideoSegment.getVideoFileInfo().getHeight(), (int) editVideoSegment.getVideoFileInfo().getDuration());
                videoSegment.fps = editVideoSegment.getVideoFileInfo().getFps();
                videoSegment.bitRate = editVideoSegment.getVideoFileInfo().getBitrate();
                arrayList3.add(videoSegment);
            }
            if (videoList.size() > 1) {
                z = true;
            } else {
                z = false;
            }
            C569360MUs c569360MUs = new C569360MUs(arrayList3, 0L, z, false, null);
            EditPreviewInfo editPreviewInfoLIZ2 = new C538310L9h(C0CHQ.LIZ().LJJIIZ().getVideoWidth(), C0CHQ.LIZ().LJJIIZ().getVideoHeight(), 28).LIZ(videoList);
            oh.LIZ.getClass();
            oh.LIZIZ = -1;
            List<EditVideoSegment> videoList2 = editPreviewInfoLIZ2.getVideoList();
            MultiEditVideoRecordData multiEditVideoRecordDataLIZIZ = C574800MgY.LIZIZ(videoList2);
            if (multiEditVideoRecordDataLIZIZ != null) {
                MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = new MultiEditVideoStatusRecordData();
                Iterator<EditVideoSegment> it3 = videoList2.iterator();
                long duration = 0;
                while (it3.hasNext()) {
                    duration += it3.next().getVideoFileInfo().getDuration();
                }
                multiEditVideoRecordDataLIZIZ.endTime = Math.min(duration, C536240L1i.LIZ());
                boolean z2 = false;
                multiEditVideoRecordDataLIZIZ.useMusic = false;
                if (multiEditVideoStatusRecordData.curMultiEditVideoRecordData == null) {
                    if (multiEditVideoRecordDataLIZIZ.segmentDataList.size() == 1) {
                        z2 = true;
                    }
                    multiEditVideoRecordDataLIZIZ.isSingleVideo = z2;
                    multiEditVideoStatusRecordData.originMultiEditRecordData = multiEditVideoRecordDataLIZIZ.cloneData();
                }
                multiEditVideoStatusRecordData.curMultiEditVideoRecordData = multiEditVideoRecordDataLIZIZ;
                C569350MUr c569350MUr = C569350MUr.LIZ;
                Intent intent2 = new Intent(intent);
                c569350MUr.getClass();
                Intent intentLIZJ = C569350MUr.LIZJ(intent2, c569220MUe, c569360MUs, jCurrentTimeMillis, true);
                intentLIZJ.putExtra("workspace", workspaceLIZ);
                CreativeModel creativeModelLIZIZ = C0MUK.LIZIZ(intentLIZJ);
                EditModel editModel = creativeModelLIZIZ.editModel;
                editModel.editPreviewInfo = editPreviewInfoLIZ2;
                editModel.multiEditVideoStatusRecordData = multiEditVideoStatusRecordData;
                creativeModelLIZIZ.cut2EditTransferModel = cut2EditTransferModel;
                C0EYF.LIZ.getClass();
                C0CHQ.LIZ().LJJIZ();
                C365800EVu.LIZ.LIZ(activity.getApplication());
                intentLIZJ.putExtra("editor_pro_start_time", System.currentTimeMillis());
                intentLIZJ.putExtra("disable_change_surface_visibility", true);
                ILayoutPreloadServiceForEditPage iLayoutPreloadServiceForEditPage = (ILayoutPreloadServiceForEditPage) ServiceManager.get().getService(ILayoutPreloadServiceForEditPage.class);
                try {
                    extras = intentLIZJ.getExtras();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    extras = null;
                }
                iLayoutPreloadServiceForEditPage.preloadLayoutFiles(activity, extras);
                try {
                    extras2 = intentLIZJ.getExtras();
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    extras2 = null;
                }
                C0MWH.LJIILL(activity, extras2);
            }
            this.LLILZLL.invoke();
        } else {
            this.LLIZ.invoke();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("awemetype=");
            sbLIZ.append(this.LLILZ.getAwemeType());
            C201955140j.LIZIZ("changebanmusic", C2188811AlT.LIZIZ(sbLIZ));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EditServiceImpl@7fc6.startEditorProChangeBanMusic$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
