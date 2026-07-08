package X;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.gson.n;
import com.ss.android.ugc.aweme.comment.model.CmtAudioStruct;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentAudioModel;
import com.ss.android.ugc.aweme.comment.model.CommentExtKt;
import com.ss.android.ugc.aweme.comment.model.CommentImageStruct;
import com.ss.android.ugc.aweme.comment.model.UserVoteInfo;
import com.ss.android.ugc.aweme.comment.model.Volume;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.setting.services.ISettingService;
import com.ss.android.ugc.aweme.tako.mob.TakoAIVideoMobFiller;
import com.ss.android.ugc.tiktok.tns.commentsafety.creator.caremode.ICommentCareModeService;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0l6g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1345080l6g {
    public static void LIZ(Activity activity, Uri.Builder builder) {
        for (Map.Entry<String, String> entry : TakoAIVideoMobFiller.toParams(C0SUC.LIZ(activity)).entrySet()) {
            builder.appendQueryParameter(entry.getKey(), entry.getValue());
        }
    }

    public static void LIZIZ(Activity activity, Aweme aweme, Comment comment, String str, int i, String str2, EnumC1342450l2R enumC1342450l2R, boolean z, boolean z2) {
        String string;
        Integer num;
        String str3;
        String aid;
        String str4;
        CommentImageStruct commentImageStruct;
        String string2;
        Volume volume;
        String string3;
        Volume volume2;
        Double d;
        Volume volume3;
        Double d2;
        Long l;
        UserVoteInfo userVoteInfo = comment.userVoteInfo;
        String cid = comment.getCid();
        String strLIZJ = C10EU.LIZJ(comment.getUser());
        String authorUid = Comment.getAuthorUid(comment);
        boolean z3 = comment.getUser().isBlock;
        String string4 = null;
        if (userVoteInfo == null || (l = userVoteInfo.pollId) == null || (string = l.toString()) == null || !z2) {
            string = null;
        }
        if (z2) {
            num = 1;
        } else {
            num = null;
        }
        if (userVoteInfo == null || (str3 = userVoteInfo.voteText) == null || !z2) {
            str3 = null;
        }
        Uri.Builder builderAppendQueryParameter = new Uri.Builder().appendQueryParameter("object_id", cid).appendQueryParameter("comment_with_emoji", CardStruct.IStatusCode.DEFAULT).appendQueryParameter("owner_id", authorUid).appendQueryParameter("report_type", "comment");
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        Uri.Builder builderAppendQueryParameter2 = builderAppendQueryParameter.appendQueryParameter("related_object_ids", aid).appendQueryParameter("enter_from", str2).appendQueryParameter("comment_channel", C1342490l2V.LIZ(enumC1342450l2R));
        CmtAudioStruct audioStruct = comment.getAudioStruct();
        if (audioStruct != null) {
            Long durationMillis = audioStruct.getDurationMillis();
            if (durationMillis != null) {
                string2 = durationMillis.toString();
            } else {
                string2 = null;
            }
            builderAppendQueryParameter2.appendQueryParameter("audio_duration", string2);
            builderAppendQueryParameter2.appendQueryParameter("audio_volume", String.valueOf(C1345110l6j.LIZLLL(C1345110l6j.LJ(audioStruct.getWave()))));
            CommentAudioModel audioModel = audioStruct.getAudioModel();
            if (audioModel != null && (volume = audioModel.volume) != null && volume.loudness != null) {
                CommentAudioModel audioModel2 = audioStruct.getAudioModel();
                if (audioModel2 != null && (volume3 = audioModel2.volume) != null && (d2 = volume3.loudness) != null) {
                    string3 = d2.toString();
                } else {
                    string3 = null;
                }
                builderAppendQueryParameter2.appendQueryParameter("audio_ori_loudness", string3);
                CommentAudioModel audioModel3 = audioStruct.getAudioModel();
                if (audioModel3 != null && (volume2 = audioModel3.volume) != null && (d = volume2.peak) != null) {
                    string4 = d.toString();
                }
                builderAppendQueryParameter2.appendQueryParameter("audio_ori_peak_loudness", string4);
            }
        }
        builderAppendQueryParameter2.appendQueryParameter("locale", ((ISettingService) ServiceManager.get().getService(ISettingService.class)).getAppLanguage());
        if (!TextUtils.isEmpty(str)) {
            builderAppendQueryParameter2.appendQueryParameter("video_owner_id", str);
        }
        n nVar = new n();
        nVar.LJJIIJ("unique_id", strLIZJ);
        nVar.LJJII(Boolean.valueOf(z3), "is_blocked");
        ICommentCareModeService.LIZ.getClass();
        if (C1342200l22.LIZ().LIZLLL(aweme)) {
            nVar.LJJIII(1, "care_mode");
        }
        builderAppendQueryParameter2.appendQueryParameter("extra", C08JS.LIZLLL(nVar));
        if (z) {
            builderAppendQueryParameter2.appendQueryParameter("is_internal_image_comment", "1");
        }
        LIZ(activity, builderAppendQueryParameter2);
        Bundle bundle = new Bundle();
        bundle.putInt("half_screen_height", i);
        String strLIZ = C1350750lFp.LIZ(comment);
        if (C1533610q0l.LIZIZ(strLIZ)) {
            C786410Ut5.LJJJI("message_type", strLIZ, bundle);
        }
        if (comment.getIsPhotoContained() != 0) {
            C786410Ut5.LJJJI("photo_type", CommentExtKt.getPhotoType(comment), bundle);
            List<CommentImageStruct> imageList = comment.getImageList();
            if (imageList != null && (commentImageStruct = (CommentImageStruct) C13LP.LJJJLL(imageList)) != null && commentImageStruct.getLivePhotoInfoModel() != null) {
                str4 = "live_once";
            } else {
                str4 = "static";
            }
            C786410Ut5.LJJJI("sub_photo_type", str4, bundle);
        }
        if (string != null) {
            C786410Ut5.LJJJI("cmt_poll_id", string, bundle);
        }
        if (num != null) {
            bundle.putInt("is_cmt_poll_card_show", num.intValue());
        }
        if (str3 != null) {
            C786410Ut5.LJJJI("cmt_poll_card_show_option", str3, bundle);
        }
        ComplianceServiceProvider.LJJ().report(activity, builderAppendQueryParameter2, bundle);
    }
}
