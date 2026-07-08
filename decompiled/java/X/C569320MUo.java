package X;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creative.model.album.ImportVideoInfo;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.OriginalAudioStruct;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.services.external.ui.ChangeBanMusicConfig;
import com.ss.android.ugc.aweme.services.video.VideoRecordEntranceServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo;
import com.ss.android.vesdk.VEUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0MUo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.external.ui.RecordServiceBaseImpl$startStripMusicPreview$2", f = "RecordServiceBaseImpl.kt", l = {}, m = "invokeSuspend")
public final class C569320MUo extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Activity LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Aweme LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;
    public final /* synthetic */ Function0<Unit> LLILZIL;
    public final /* synthetic */ VEUtils.VEVideoFileInfo LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ ChangeBanMusicConfig LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C569320MUo(Activity activity, Aweme aweme, ChangeBanMusicConfig changeBanMusicConfig, VEUtils.VEVideoFileInfo vEVideoFileInfo, String str, String str2, String str3, InterfaceC1364105Vn interfaceC1364105Vn, Function0 function0, Function0 function02) {
        super(2, interfaceC1364105Vn);
        this.LL = activity;
        this.LLILLJJLI = str;
        this.LLILLL = aweme;
        this.LLILZ = function0;
        this.LLILZIL = function02;
        this.LLILZLL = vEVideoFileInfo;
        this.LLIZ = str2;
        this.LLIZLLLIL = str3;
        this.LLJ = changeBanMusicConfig;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        Activity activity = this.LL;
        String str = this.LLILLJJLI;
        Aweme aweme = this.LLILLL;
        Function0<Unit> function0 = this.LLILZ;
        Function0<Unit> function02 = this.LLILZIL;
        return new C569320MUo(activity, aweme, this.LLJ, this.LLILZLL, str, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn, function0, function02);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        C1C7U.LIZ("RecordServiceBaseImpl@d40c.startStripMusicPreview$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL.isFinishing()) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("RecordServiceBaseImpl@d40c.startStripMusicPreview$2");
            return unit;
        }
        ArrayList<ImportVideoInfo> arrayListLJ = C1697810uHb.LJ(new ImportVideoInfo(0, 0, 0, 0, this.LLILLJJLI, 0L, 0L, null, null, 0, 0.0f, null, null, false, null, null, 0L, 131055, null));
        Intent intent = new Intent();
        VEUtils.VEVideoFileInfo vEVideoFileInfo = this.LLILZLL;
        Aweme aweme = this.LLILLL;
        String str3 = this.LLIZ;
        String str4 = this.LLIZLLLIL;
        String str5 = this.LLILLJJLI;
        ChangeBanMusicConfig changeBanMusicConfig = this.LLJ;
        C0MUK.LJIIIZ(intent, C0MUK.LJIIIIZZ());
        C0MUK.LIZIZ(intent).albumModel.importInfoList = arrayListLJ;
        C0MUK.LIZIZ(intent).editModel.videoDurationFromVideoCutPage = vEVideoFileInfo.duration;
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
        intent.putExtra("shoot_way", "strip_music_preview");
        C0MUK.LIZIZ(intent).eventData.enterFrom = str3;
        C0MUK.LIZIZ(intent).eventData.shootEnterMethod = str4;
        intent.putExtra("content_type", "replace_music");
        intent.putExtra("content_source", "replace_music");
        C0MUK.LIZIZ(intent).editModel.editPreviewInfo = new C538330L9j(0, 0, 15).LIZ(new EditVideoSegment(str5, changeBanMusicConfig.getVoicePath(), new VideoFileInfo(vEVideoFileInfo.width, vEVideoFileInfo.height, vEVideoFileInfo.duration, vEVideoFileInfo.fps, 0, 0, 0, 0, 0.0f, 496, null)));
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
        if (!TextUtils.isEmpty(this.LLILLL.getAid()) && this.LLILLL.getVideo() != null && this.LLILLL.getVideo().getPlayAddr().getOriginUri() != null) {
            intent.putExtra(FollowStatusChangeMethod.PARAM_UID, this.LLILLL.getAid());
            intent.putExtra("video_id", this.LLILLL.getVideo().getPlayAddr().getOriginUri());
            intent.putExtra("video_cover", (String) ListProtector.get(this.LLILLL.getVideo().getCover().getUrlList(), 0));
            OriginalAudioStruct originalAudioStruct = this.LLILLL.strippedOriginalAudio;
            if (originalAudioStruct != null) {
                str = originalAudioStruct.vid;
            } else {
                str = null;
            }
            intent.putExtra("stripped_origin_audio_vid", str);
            if (C10IT.LJIIIIZZ(this.LLILLL)) {
                str2 = "copyright";
            } else {
                str2 = "other";
            }
            intent.putExtra("mute_reason", str2);
            VideoRecordEntranceServiceImpl.Companion.getINSTANCE().startChangeBanMusicEditActivity(this.LL, intent);
            this.LLILZ.invoke();
        } else {
            this.LLILZIL.invoke();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("awemetype=");
            sbLIZ.append(this.LLILLL.getAwemeType());
            C201955140j.LIZIZ("changebanmusic", C2188811AlT.LIZIZ(sbLIZ));
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("RecordServiceBaseImpl@d40c.startStripMusicPreview$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
