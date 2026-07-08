package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.message.persistentext.adapter.BotFeedbackData;
import com.ss.android.ugc.aweme.im.message.persistentext.adapter.FeatureAttachmentData;
import com.ss.android.ugc.aweme.im.message.persistentext.adapter.MentionMessageExtra;
import com.ss.android.ugc.aweme.im.message.persistentext.adapter.PersistentExtraData;
import com.ss.android.ugc.aweme.im.message.persistentext.adapter.ReplySourcePayloadData;
import com.ss.android.ugc.aweme.im.message.persistentext.adapter.TrackInfoData;
import com.ss.android.ugc.aweme.im.message.template.component.AttachmentTypeComponent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZfW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C905400ZfW {
    public static final PersistentExtraData LIZ(C869590Y9l c869590Y9l) {
        PersistentExtraData persistentExtraDataLIZIZ = null;
        if (c869590Y9l.getPersistentExtra() != null && c869590Y9l.getPersistentExtra().size() > 0) {
            try {
                C905470Zfd c905470ZfdDecode = C905470Zfd.ADAPTER.decode(c869590Y9l.getPersistentExtra());
                if (c905470ZfdDecode != null) {
                    persistentExtraDataLIZIZ = LIZIZ(c905470ZfdDecode);
                    return persistentExtraDataLIZIZ;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return persistentExtraDataLIZIZ;
    }

    public static final PersistentExtraData LIZIZ(C905470Zfd c905470Zfd) {
        boolean zLJFF;
        boolean zLJFF2;
        boolean zLJFF3;
        boolean zLJFF4;
        boolean zLJFF5;
        boolean zLJFF6;
        String str;
        long jLongValue;
        Long l;
        ReplySourcePayloadData replySourcePayloadData;
        BotFeedbackData botFeedbackData;
        long jLongValue2;
        long jLongValue3;
        C905410ZfX c905410ZfX;
        C905410ZfX c905410ZfX2;
        C905410ZfX c905410ZfX3;
        C905410ZfX c905410ZfX4;
        C905410ZfX c905410ZfX5;
        C905410ZfX c905410ZfX6;
        String str2 = c905470Zfd.im_session_id;
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        C905460Zfc c905460Zfc = c905470Zfd.track_info;
        int value = 0;
        if (c905460Zfc != null && (c905410ZfX6 = c905460Zfc.mention_message_params) != null) {
            zLJFF = Intrinsics.LJFF(c905410ZfX6.has_caption_mode_mention, Boolean.TRUE);
        } else {
            zLJFF = false;
        }
        C905460Zfc c905460Zfc2 = c905470Zfd.track_info;
        if (c905460Zfc2 != null && (c905410ZfX5 = c905460Zfc2.mention_message_params) != null) {
            zLJFF2 = Intrinsics.LJFF(c905410ZfX5.has_text_mode_mention, Boolean.TRUE);
        } else {
            zLJFF2 = false;
        }
        C905460Zfc c905460Zfc3 = c905470Zfd.track_info;
        if (c905460Zfc3 != null && (c905410ZfX4 = c905460Zfc3.mention_message_params) != null) {
            zLJFF3 = Intrinsics.LJFF(c905410ZfX4.has_sticker_mention, Boolean.TRUE);
        } else {
            zLJFF3 = false;
        }
        C905460Zfc c905460Zfc4 = c905470Zfd.track_info;
        if (c905460Zfc4 != null && (c905410ZfX3 = c905460Zfc4.mention_message_params) != null) {
            zLJFF4 = Intrinsics.LJFF(c905410ZfX3.has_post_page_mention, Boolean.TRUE);
        } else {
            zLJFF4 = false;
        }
        C905460Zfc c905460Zfc5 = c905470Zfd.track_info;
        if (c905460Zfc5 != null && (c905410ZfX2 = c905460Zfc5.mention_message_params) != null) {
            zLJFF5 = Intrinsics.LJFF(c905410ZfX2.has_story_mention_after_publish_share_panel, Boolean.TRUE);
        } else {
            zLJFF5 = false;
        }
        C905460Zfc c905460Zfc6 = c905470Zfd.track_info;
        if (c905460Zfc6 != null && (c905410ZfX = c905460Zfc6.mention_message_params) != null) {
            zLJFF6 = Intrinsics.LJFF(c905410ZfX.has_story_mention_after_publish_feed_bottom, Boolean.TRUE);
        } else {
            zLJFF6 = false;
        }
        MentionMessageExtra mentionMessageExtra = new MentionMessageExtra(zLJFF, zLJFF2, zLJFF3, zLJFF4, zLJFF5, zLJFF6);
        C905460Zfc c905460Zfc7 = c905470Zfd.track_info;
        if (c905460Zfc7 == null || (str = c905460Zfc7.aggregation_message_type) == null) {
            str = "";
        }
        TrackInfoData trackInfoData = new TrackInfoData(mentionMessageExtra, str);
        Long l2 = c905470Zfd.pre_entrance_type;
        long jLongValue4 = 0;
        if (l2 != null) {
            jLongValue = l2.longValue();
        } else {
            jLongValue = 0;
        }
        Long lValueOf = Long.valueOf(jLongValue);
        C905540Zfk c905540Zfk = c905470Zfd.message_style_info;
        FeatureAttachmentData featureAttachmentData = null;
        if (c905540Zfk != null) {
            l = c905540Zfk.chat_bubble_id;
        } else {
            l = null;
        }
        C905440Zfa c905440Zfa = c905470Zfd.reply_source_payload;
        if (c905440Zfa != null) {
            Long l3 = c905440Zfa.reply_source_msg_id;
            if (l3 != null) {
                jLongValue3 = l3.longValue();
            } else {
                jLongValue3 = 0;
            }
            String str4 = c905440Zfa.reply_source_unique_id;
            if (str4 == null) {
                str4 = "";
            }
            String str5 = c905440Zfa.client_message_id_for_reply;
            if (str5 == null) {
                str5 = "";
            }
            replySourcePayloadData = new ReplySourcePayloadData(jLongValue3, str4, str5);
        } else {
            replySourcePayloadData = null;
        }
        C1C1D c1c1d = c905470Zfd.bot_feedback;
        if (c1c1d != null) {
            botFeedbackData = new BotFeedbackData(c1c1d.feedback_map);
        } else {
            botFeedbackData = null;
        }
        C0ZGR c0zgr = c905470Zfd.feature_attachment;
        if (c0zgr != null) {
            C462070IAb c462070IAb = AttachmentTypeComponent.Companion;
            EnumC2244491Ct5 enumC2244491Ct5 = c0zgr.type;
            if (enumC2244491Ct5 != null) {
                value = enumC2244491Ct5.getValue();
            }
            c462070IAb.getClass();
            AttachmentTypeComponent attachmentTypeComponentLIZ = C462070IAb.LIZ(value);
            String str6 = c0zgr.id;
            if (str6 != null) {
                str3 = str6;
            }
            Long l4 = c0zgr.uid;
            if (l4 != null) {
                jLongValue2 = l4.longValue();
            } else {
                jLongValue2 = 0;
            }
            Long l5 = c0zgr.original_create_time;
            if (l5 != null) {
                jLongValue4 = l5.longValue();
            }
            featureAttachmentData = new FeatureAttachmentData(attachmentTypeComponentLIZ, str3, jLongValue2, jLongValue4, C2243551CrZ.LIZ(c0zgr.content));
        }
        return new PersistentExtraData(str2, trackInfoData, lValueOf, l, replySourcePayloadData, botFeedbackData, featureAttachmentData);
    }
}
