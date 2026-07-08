package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.ss.android.ugc.aweme.creative.model.ChangeAvatarModel;
import com.ss.android.ugc.aweme.creative.model.SocialAvatarUpdateInfoStruct;
import com.ss.android.ugc.aweme.editSticker.model.CoverPreviewInfo;
import com.ss.android.ugc.aweme.editSticker.model.CoverPublishModel;
import com.ss.android.ugc.aweme.editSticker.model.EffectTextModel;
import com.ss.android.ugc.aweme.editSticker.model.UploadCustomizeCoverInfo;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS409S0200000_8;
import kotlin.jvm.internal.AwS477S0200000_8;
import l5a.a;

/* JADX INFO: renamed from: X.0nfV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1443550nfV {
    public final C19EG LIZ;
    public final boolean LIZIZ;
    public final Function0<Unit> LIZJ;
    public final C1443650nff LIZLLL;
    public final ShortVideoContext LJ;
    public final C054G LJFF;

    public final void LIZ(VideoPublishEditModel videoPublishEditModel) {
        C0CHQ.LIZ().getPublishService().LJJLL(videoPublishEditModel, "enter Story publish!");
        C1428520nHG.LJLI(videoPublishEditModel);
        a.LIZIZ.LIZ(videoPublishEditModel.getCreationId());
        if (!C1428720nHa.LIZ(videoPublishEditModel)) {
            videoPublishEditModel.isPrivate = 0;
            videoPublishEditModel.commentSetting = 0;
        }
        videoPublishEditModel.setTitle(null);
        videoPublishEditModel.setStructList(null);
        videoPublishEditModel.challenges = null;
        videoPublishEditModel.resetCompileProbeResult();
        videoPublishEditModel.resetStrategiesResult();
        videoPublishEditModel.commerceData = null;
        videoPublishEditModel.autoCaptionLang = null;
        videoPublishEditModel.allowDownloadSetting = 0;
        videoPublishEditModel.setMicroAppId(null);
        videoPublishEditModel.setMicroAppModel(null);
        videoPublishEditModel.setChain(null);
        videoPublishEditModel.setDisableDeleteChain(false);
        videoPublishEditModel.geofencingSetting = null;
        videoPublishEditModel.setDraftMusicIllegal(false);
        videoPublishEditModel.playlist_id = null;
        videoPublishEditModel.playlist_name = null;
        videoPublishEditModel.setVideoCoverStartTm(0.0f);
        AudioRecorderParam veAudioRecorderParam = videoPublishEditModel.getVeAudioRecorderParam();
        if (veAudioRecorderParam != null) {
            veAudioRecorderParam.setAudioRecordIndex(-1);
        }
        boolean needExpandCompiledSize = false;
        CoverPublishModel coverPublishModel = new CoverPublishModel(new EffectTextModel(false, null, null, null, null), -1.0f, false, 0, new ArrayList(), "", false, new UploadCustomizeCoverInfo(0, "", 0, 0, 0.0d, 0), new CopyOnWriteArrayList(), new CoverPreviewInfo(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0, 0));
        CoverPublishModel coverPublishModel2 = videoPublishEditModel.getCoverPublishModel();
        if (coverPublishModel2 != null) {
            needExpandCompiledSize = coverPublishModel2.getNeedExpandCompiledSize();
        }
        coverPublishModel.setNeedExpandCompiledSize(needExpandCompiledSize);
        videoPublishEditModel.setCoverPublishModel(coverPublishModel);
        C1438840nXu c1438840nXu = C1438840nXu.LIZ;
        C1438920nY2 c1438920nY2 = new C1438920nY2(videoPublishEditModel, new AwS477S0200000_8(this, videoPublishEditModel, 1));
        c1438840nXu.getClass();
        C1438840nXu.LIZ(c1438920nY2);
    }

    public final void LIZIZ(VideoPublishEditModel videoPublishEditModel) {
        ChangeAvatarModel changeAvatarModel = videoPublishEditModel.creativeModel.changeAvatarModel;
        changeAvatarModel.isFromChangeAvatar = true;
        C1443650nff c1443650nff = this.LIZLLL;
        changeAvatarModel.isFromAiVatar = c1443650nff.LJFF;
        changeAvatarModel.isFromSocialAvatar = c1443650nff.LJI;
        changeAvatarModel.aiVatarMode = c1443650nff.LJIIIIZZ;
        changeAvatarModel.avatarStruct.setOriginAvatarUri(c1443650nff.LIZIZ);
        videoPublishEditModel.creativeModel.changeAvatarModel.avatarStruct.setNewAvatarUri(this.LIZLLL.LIZ);
        ChangeAvatarModel changeAvatarModel2 = videoPublishEditModel.creativeModel.changeAvatarModel;
        C1443650nff c1443650nff2 = this.LIZLLL;
        changeAvatarModel2.publishEnterMethod = c1443650nff2.LJII;
        changeAvatarModel2.skipDecorativeInfoStickers = c1443650nff2.LJIIJ;
        SocialAvatarUpdateInfoStruct socialAvatarUpdateInfoStruct = changeAvatarModel2.socialAvatarUpdateInfoStruct;
        socialAvatarUpdateInfoStruct.setStyleSelection(Integer.valueOf(c1443650nff2.LJIIIZ.LIZ));
        socialAvatarUpdateInfoStruct.setExpressionSelection(Integer.valueOf(this.LIZLLL.LJIIIZ.LIZIZ));
        socialAvatarUpdateInfoStruct.setDynamicAvatarUri(this.LIZLLL.LJIIIZ.LIZJ);
        socialAvatarUpdateInfoStruct.setDynamicAvatarGifUri(this.LIZLLL.LJIIIZ.LIZLLL);
        socialAvatarUpdateInfoStruct.setStaticAvatarUri(this.LIZLLL.LJIIIZ.LJ);
        socialAvatarUpdateInfoStruct.setCompiledAvatarUri(this.LIZLLL.LJIIIZ.LJFF);
        socialAvatarUpdateInfoStruct.setAvatarId(Long.valueOf(this.LIZLLL.LJIIIZ.LJI));
        socialAvatarUpdateInfoStruct.setAvatarColor(Integer.valueOf(this.LIZLLL.LJIIIZ.LJII));
        socialAvatarUpdateInfoStruct.setEnterMethod(this.LIZLLL.LJIIIZ.LJIIIIZZ);
        videoPublishEditModel.setVideoCoverPath(this.LIZLLL.LJ);
    }

    public C1443550nfV(C19EG c19eg, Bundle bundle, boolean z, AwS409S0200000_8 awS409S0200000_8) {
        this.LIZ = c19eg;
        this.LIZIZ = z;
        this.LIZJ = awS409S0200000_8;
        String string = bundle.getString("new_avatar_uri", "");
        String string2 = bundle.getString("origin_avatar_uri", "");
        String string3 = bundle.getString("origin_no_crop_avatar_path", "");
        String string4 = bundle.getString("origin_avatar_url", "");
        String string5 = bundle.getString("cover_avatar_path", "");
        boolean z2 = bundle.getBoolean("is_aivatar", false);
        boolean z3 = bundle.getBoolean("is_social_avatar", false);
        bundle.getInt("background_selection", -1);
        String string6 = bundle.getString("enter_method", "");
        String string7 = bundle.getString("path_mode", "");
        int i = bundle.getInt("background_selection", 0);
        int i2 = bundle.getInt("expression_selection", 0);
        String string8 = bundle.getString("dynamic_social_avatar", "");
        String string9 = bundle.getString("static_social_avatar_gif", "");
        String string10 = bundle.getString("static_social_avatar", "");
        String string11 = bundle.getString("compiled_social_avatar", "");
        this.LIZLLL = new C1443650nff(string, string2, string3, string4, string5, z2, z3, string6, string7, new C1443660nfg(string8, string9, i, i2, string10, bundle.getLong("avatar_id", 0L), string11, bundle.getString("social_avatar_enter_method", ""), bundle.getInt("social_avatar_text_color", 0)), bundle.getBoolean("skip_decorative_info_stickers", false));
        this.LJ = C1443540nfU.LIZIZ(bundle);
        this.LJFF = C2296808zG.LIZ(C0PEM.LIZJ);
    }
}
