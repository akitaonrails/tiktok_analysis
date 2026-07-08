package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import okio.ByteString;

/* JADX INFO: renamed from: X.0216, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class AnonymousClass0216 extends Message<AnonymousClass0216, C02K2> {
    public static final ProtoAdapter<AnonymousClass0216> ADAPTER = new ProtoAdapter<AnonymousClass0216>() { // from class: X.0212
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final AnonymousClass0216 decode(ProtoReader protoReader) {
            AnonymousClass0216 anonymousClass0216 = new AnonymousClass0216();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            anonymousClass0216.type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 2:
                            anonymousClass0216.index = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 3:
                            anonymousClass0216.is_non_global = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 4:
                            anonymousClass0216.track_info = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            anonymousClass0216.attr = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            anonymousClass0216.vote_info = C5420029i.ADAPTER.decode(protoReader);
                            break;
                        case 7:
                            anonymousClass0216.text_info = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            anonymousClass0216.mention_info = C550602Cq.ADAPTER.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            anonymousClass0216.hashtag_info = C597802Uu.ADAPTER.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            anonymousClass0216.countdown_info = C548402Bu.ADAPTER.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            anonymousClass0216.auto_video_caption_info = C605902Xx.ADAPTER.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            anonymousClass0216.duet_with_me = C738102uR.ADAPTER.decode(protoReader);
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        case 16:
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                        case 14:
                            anonymousClass0216.question_info = C5437029z.ADAPTER.decode(protoReader);
                            break;
                        case 15:
                            anonymousClass0216.text_sticker_info = C02CN.ADAPTER.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                            anonymousClass0216.video_share_info = C02EL.ADAPTER.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                            anonymousClass0216.nature_info = C2223961C2o.ADAPTER.decode(protoReader);
                            break;
                        case 19:
                            anonymousClass0216.poi_info = C674602kC.ADAPTER.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                            anonymousClass0216.nature_classification_sticker_info = C1CAX.ADAPTER.decode(protoReader);
                            break;
                        case 21:
                            anonymousClass0216.material_index = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 22:
                            anonymousClass0216.add_yours_sticker = C024O.ADAPTER.decode(protoReader);
                            break;
                        case 23:
                            anonymousClass0216.comment_post_sticker = C636302e1.ADAPTER.decode(protoReader);
                            break;
                        case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                            anonymousClass0216.music_sticker = C547502Bl.ADAPTER.decode(protoReader);
                            break;
                        case 25:
                            anonymousClass0216.interactive_emoji_sticker = C02W8.ADAPTER.decode(protoReader);
                            break;
                        case 26:
                            anonymousClass0216.emoji_slider_sticker = C02CQ.ADAPTER.decode(protoReader);
                            break;
                        case 27:
                            anonymousClass0216.is_non_global_v2 = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 28:
                            anonymousClass0216.link_sticker = C02EI.ADAPTER.decode(protoReader);
                            break;
                        case 29:
                            anonymousClass0216.attribution_link_sticker = C02EK.ADAPTER.decode(protoReader);
                            break;
                        case 30:
                            anonymousClass0216.lyric_sticker = C619902bN.ADAPTER.decode(protoReader);
                            break;
                        case 31:
                            anonymousClass0216.live_story_sticker = C621402bc.ADAPTER.decode(protoReader);
                            break;
                        case 32:
                            anonymousClass0216.social_avatar_sticker = C545802Au.ADAPTER.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                            anonymousClass0216.article_sticker = C02FM.ADAPTER.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                            anonymousClass0216.public_group_entry_sticker = C02BG.ADAPTER.decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return anonymousClass0216;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(AnonymousClass0216 anonymousClass0216) {
            AnonymousClass0216 anonymousClass02162 = anonymousClass0216;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, anonymousClass02162.type) + protoAdapter.encodedSizeWithTag(2, anonymousClass02162.index);
            ProtoAdapter<Boolean> protoAdapter2 = ProtoAdapter.BOOL;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(3, anonymousClass02162.is_non_global);
            ProtoAdapter<String> protoAdapter3 = ProtoAdapter.STRING;
            return iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(4, anonymousClass02162.track_info) + protoAdapter3.encodedSizeWithTag(5, anonymousClass02162.attr) + C5420029i.ADAPTER.encodedSizeWithTag(6, anonymousClass02162.vote_info) + protoAdapter3.encodedSizeWithTag(7, anonymousClass02162.text_info) + C550602Cq.ADAPTER.encodedSizeWithTag(8, anonymousClass02162.mention_info) + C597802Uu.ADAPTER.encodedSizeWithTag(9, anonymousClass02162.hashtag_info) + C548402Bu.ADAPTER.encodedSizeWithTag(10, anonymousClass02162.countdown_info) + C605902Xx.ADAPTER.encodedSizeWithTag(11, anonymousClass02162.auto_video_caption_info) + C738102uR.ADAPTER.encodedSizeWithTag(12, anonymousClass02162.duet_with_me) + C5437029z.ADAPTER.encodedSizeWithTag(14, anonymousClass02162.question_info) + C02CN.ADAPTER.encodedSizeWithTag(15, anonymousClass02162.text_sticker_info) + C02EL.ADAPTER.encodedSizeWithTag(17, anonymousClass02162.video_share_info) + C2223961C2o.ADAPTER.encodedSizeWithTag(18, anonymousClass02162.nature_info) + C674602kC.ADAPTER.encodedSizeWithTag(19, anonymousClass02162.poi_info) + C1CAX.ADAPTER.encodedSizeWithTag(20, anonymousClass02162.nature_classification_sticker_info) + protoAdapter.encodedSizeWithTag(21, anonymousClass02162.material_index) + C024O.ADAPTER.encodedSizeWithTag(22, anonymousClass02162.add_yours_sticker) + C636302e1.ADAPTER.encodedSizeWithTag(23, anonymousClass02162.comment_post_sticker) + C547502Bl.ADAPTER.encodedSizeWithTag(24, anonymousClass02162.music_sticker) + C02W8.ADAPTER.encodedSizeWithTag(25, anonymousClass02162.interactive_emoji_sticker) + C02CQ.ADAPTER.encodedSizeWithTag(26, anonymousClass02162.emoji_slider_sticker) + protoAdapter2.encodedSizeWithTag(27, anonymousClass02162.is_non_global_v2) + C02EI.ADAPTER.encodedSizeWithTag(28, anonymousClass02162.link_sticker) + C02EK.ADAPTER.encodedSizeWithTag(29, anonymousClass02162.attribution_link_sticker) + C619902bN.ADAPTER.encodedSizeWithTag(30, anonymousClass02162.lyric_sticker) + C621402bc.ADAPTER.encodedSizeWithTag(31, anonymousClass02162.live_story_sticker) + C545802Au.ADAPTER.encodedSizeWithTag(32, anonymousClass02162.social_avatar_sticker) + C02FM.ADAPTER.encodedSizeWithTag(33, anonymousClass02162.article_sticker) + C02BG.ADAPTER.encodedSizeWithTag(34, anonymousClass02162.public_group_entry_sticker) + anonymousClass02162.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, AnonymousClass0216 anonymousClass0216) {
            AnonymousClass0216 anonymousClass02162 = anonymousClass0216;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            protoAdapter.encodeWithTag(protoWriter, 1, anonymousClass02162.type);
            protoAdapter.encodeWithTag(protoWriter, 2, anonymousClass02162.index);
            ProtoAdapter<Boolean> protoAdapter2 = ProtoAdapter.BOOL;
            protoAdapter2.encodeWithTag(protoWriter, 3, anonymousClass02162.is_non_global);
            ProtoAdapter<String> protoAdapter3 = ProtoAdapter.STRING;
            protoAdapter3.encodeWithTag(protoWriter, 4, anonymousClass02162.track_info);
            protoAdapter3.encodeWithTag(protoWriter, 5, anonymousClass02162.attr);
            C5420029i.ADAPTER.encodeWithTag(protoWriter, 6, anonymousClass02162.vote_info);
            protoAdapter3.encodeWithTag(protoWriter, 7, anonymousClass02162.text_info);
            C550602Cq.ADAPTER.encodeWithTag(protoWriter, 8, anonymousClass02162.mention_info);
            C597802Uu.ADAPTER.encodeWithTag(protoWriter, 9, anonymousClass02162.hashtag_info);
            C548402Bu.ADAPTER.encodeWithTag(protoWriter, 10, anonymousClass02162.countdown_info);
            C605902Xx.ADAPTER.encodeWithTag(protoWriter, 11, anonymousClass02162.auto_video_caption_info);
            C738102uR.ADAPTER.encodeWithTag(protoWriter, 12, anonymousClass02162.duet_with_me);
            C5437029z.ADAPTER.encodeWithTag(protoWriter, 14, anonymousClass02162.question_info);
            C02CN.ADAPTER.encodeWithTag(protoWriter, 15, anonymousClass02162.text_sticker_info);
            C02EL.ADAPTER.encodeWithTag(protoWriter, 17, anonymousClass02162.video_share_info);
            C2223961C2o.ADAPTER.encodeWithTag(protoWriter, 18, anonymousClass02162.nature_info);
            C674602kC.ADAPTER.encodeWithTag(protoWriter, 19, anonymousClass02162.poi_info);
            C1CAX.ADAPTER.encodeWithTag(protoWriter, 20, anonymousClass02162.nature_classification_sticker_info);
            protoAdapter.encodeWithTag(protoWriter, 21, anonymousClass02162.material_index);
            C024O.ADAPTER.encodeWithTag(protoWriter, 22, anonymousClass02162.add_yours_sticker);
            C636302e1.ADAPTER.encodeWithTag(protoWriter, 23, anonymousClass02162.comment_post_sticker);
            C547502Bl.ADAPTER.encodeWithTag(protoWriter, 24, anonymousClass02162.music_sticker);
            C02W8.ADAPTER.encodeWithTag(protoWriter, 25, anonymousClass02162.interactive_emoji_sticker);
            C02CQ.ADAPTER.encodeWithTag(protoWriter, 26, anonymousClass02162.emoji_slider_sticker);
            protoAdapter2.encodeWithTag(protoWriter, 27, anonymousClass02162.is_non_global_v2);
            C02EI.ADAPTER.encodeWithTag(protoWriter, 28, anonymousClass02162.link_sticker);
            C02EK.ADAPTER.encodeWithTag(protoWriter, 29, anonymousClass02162.attribution_link_sticker);
            C619902bN.ADAPTER.encodeWithTag(protoWriter, 30, anonymousClass02162.lyric_sticker);
            C621402bc.ADAPTER.encodeWithTag(protoWriter, 31, anonymousClass02162.live_story_sticker);
            C545802Au.ADAPTER.encodeWithTag(protoWriter, 32, anonymousClass02162.social_avatar_sticker);
            C02FM.ADAPTER.encodeWithTag(protoWriter, 33, anonymousClass02162.article_sticker);
            C02BG.ADAPTER.encodeWithTag(protoWriter, 34, anonymousClass02162.public_group_entry_sticker);
            protoWriter.writeBytes(anonymousClass02162.unknownFields());
        }
    };
    public C024O add_yours_sticker;
    public C02FM article_sticker;
    public String attr;
    public C02EK attribution_link_sticker;
    public C605902Xx auto_video_caption_info;
    public C636302e1 comment_post_sticker;
    public C548402Bu countdown_info;
    public C738102uR duet_with_me;
    public C02CQ emoji_slider_sticker;
    public C597802Uu hashtag_info;
    public Integer index;
    public C02W8 interactive_emoji_sticker;
    public Boolean is_non_global;
    public Boolean is_non_global_v2;
    public C02EI link_sticker;
    public C621402bc live_story_sticker;
    public C619902bN lyric_sticker;
    public Integer material_index;
    public C550602Cq mention_info;
    public C547502Bl music_sticker;
    public C1CAX nature_classification_sticker_info;
    public C2223961C2o nature_info;
    public C674602kC poi_info;
    public C02BG public_group_entry_sticker;
    public C5437029z question_info;
    public C545802Au social_avatar_sticker;
    public String text_info;
    public C02CN text_sticker_info;
    public String track_info;
    public Integer type;
    public C02EL video_share_info;
    public C5420029i vote_info;

    public AnonymousClass0216() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02K2 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
