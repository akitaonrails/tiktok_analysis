package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.021K, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C021K extends Message<C021K, C02MP> {
    public static final ProtoAdapter<C021K> ADAPTER = new ProtoAdapter<C021K>() { // from class: X.0218
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C021K decode(ProtoReader protoReader) {
            C021K c021k = new C021K();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c021k.is_rich_sug = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c021k.rich_sug_type = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c021k.rich_sug_nickname = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c021k.rich_sug_avatar_uri = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c021k.rich_sug_user_type = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c021k.rich_sug_shop_type = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            c021k.sug_uniq_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            c021k.sug_user_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c021k.sug_sec_user_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c021k.sug_shop_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            c021k.sug_hint = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            c021k.is_creator_live = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            c021k.is_live_query = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 14:
                            c021k.is_history_sug = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 15:
                            c021k.is_personalized = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 16:
                            c021k.is_business_account = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                            c021k.is_private_account = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                            c021k.words_type = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 19:
                            c021k.result_tab = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                            c021k.matched_friend = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 21:
                            c021k.recall_reason = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 22:
                            c021k.relation_type = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 23:
                            c021k.product_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            switch (iNextTag) {
                                case 30:
                                    c021k.mention_block_type = ProtoAdapter.INT64.decode(protoReader);
                                    break;
                                case 31:
                                    c021k.follow_status = ProtoAdapter.INT32.decode(protoReader);
                                    break;
                                case 32:
                                    c021k.follower_status = ProtoAdapter.INT32.decode(protoReader);
                                    break;
                                case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                                    c021k.user_story_status = ProtoAdapter.INT32.decode(protoReader);
                                    break;
                                case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                                    c021k.followers_count = ProtoAdapter.INT64.decode(protoReader);
                                    break;
                                case 35:
                                    c021k.aweme_count = ProtoAdapter.INT64.decode(protoReader);
                                    break;
                                case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                                    c021k.can_message_follow_status_list.add(ProtoAdapter.INT32.decode(protoReader));
                                    break;
                                case 37:
                                    c021k.use_generative_sug = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 38:
                                    c021k.generative_display_starting_pos = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 39:
                                    c021k.search_after_search_sug_type = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 40:
                                    c021k.search_after_search_text = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 41:
                                    c021k.lang = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 42:
                                    c021k.brand_blue_label_light = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 43:
                                    c021k.brand_blue_label_dark = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 44:
                                    c021k.penetrate_info = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 45:
                                    c021k.predict_ctr_score = ProtoAdapter.DOUBLE.decode(protoReader);
                                    break;
                                default:
                                    protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                    break;
                            }
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c021k;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C021K c021k) {
            C021K c021k2 = c021k;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c021k2.is_rich_sug) + protoAdapter.encodedSizeWithTag(2, c021k2.rich_sug_type) + protoAdapter.encodedSizeWithTag(3, c021k2.rich_sug_nickname) + protoAdapter.encodedSizeWithTag(4, c021k2.rich_sug_avatar_uri) + protoAdapter.encodedSizeWithTag(5, c021k2.rich_sug_user_type) + protoAdapter.encodedSizeWithTag(6, c021k2.rich_sug_shop_type) + protoAdapter.encodedSizeWithTag(7, c021k2.sug_uniq_id) + protoAdapter.encodedSizeWithTag(8, c021k2.sug_user_id) + protoAdapter.encodedSizeWithTag(9, c021k2.sug_sec_user_id) + protoAdapter.encodedSizeWithTag(10, c021k2.sug_shop_id) + protoAdapter.encodedSizeWithTag(11, c021k2.sug_hint) + protoAdapter.encodedSizeWithTag(12, c021k2.is_creator_live) + protoAdapter.encodedSizeWithTag(13, c021k2.is_live_query) + protoAdapter.encodedSizeWithTag(14, c021k2.is_history_sug) + protoAdapter.encodedSizeWithTag(15, c021k2.is_personalized);
            ProtoAdapter<Boolean> protoAdapter2 = ProtoAdapter.BOOL;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(16, c021k2.is_business_account) + protoAdapter2.encodedSizeWithTag(17, c021k2.is_private_account) + protoAdapter.encodedSizeWithTag(18, c021k2.words_type) + protoAdapter.encodedSizeWithTag(19, c021k2.result_tab) + protoAdapter.encodedSizeWithTag(20, c021k2.matched_friend) + protoAdapter.encodedSizeWithTag(21, c021k2.recall_reason) + protoAdapter.encodedSizeWithTag(22, c021k2.relation_type) + protoAdapter.encodedSizeWithTag(23, c021k2.product_id);
            ProtoAdapter<Long> protoAdapter3 = ProtoAdapter.INT64;
            int iEncodedSizeWithTag3 = iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(30, c021k2.mention_block_type);
            ProtoAdapter<Integer> protoAdapter4 = ProtoAdapter.INT32;
            return iEncodedSizeWithTag3 + protoAdapter4.encodedSizeWithTag(31, c021k2.follow_status) + protoAdapter4.encodedSizeWithTag(32, c021k2.follower_status) + protoAdapter4.encodedSizeWithTag(33, c021k2.user_story_status) + protoAdapter3.encodedSizeWithTag(34, c021k2.followers_count) + protoAdapter3.encodedSizeWithTag(35, c021k2.aweme_count) + protoAdapter4.asRepeated().encodedSizeWithTag(36, c021k2.can_message_follow_status_list) + protoAdapter.encodedSizeWithTag(37, c021k2.use_generative_sug) + protoAdapter.encodedSizeWithTag(38, c021k2.generative_display_starting_pos) + protoAdapter.encodedSizeWithTag(39, c021k2.search_after_search_sug_type) + protoAdapter.encodedSizeWithTag(40, c021k2.search_after_search_text) + protoAdapter.encodedSizeWithTag(41, c021k2.lang) + protoAdapter.encodedSizeWithTag(42, c021k2.brand_blue_label_light) + protoAdapter.encodedSizeWithTag(43, c021k2.brand_blue_label_dark) + protoAdapter.encodedSizeWithTag(44, c021k2.penetrate_info) + ProtoAdapter.DOUBLE.encodedSizeWithTag(45, c021k2.predict_ctr_score) + c021k2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C021K c021k) {
            C021K c021k2 = c021k;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c021k2.is_rich_sug);
            protoAdapter.encodeWithTag(protoWriter, 2, c021k2.rich_sug_type);
            protoAdapter.encodeWithTag(protoWriter, 3, c021k2.rich_sug_nickname);
            protoAdapter.encodeWithTag(protoWriter, 4, c021k2.rich_sug_avatar_uri);
            protoAdapter.encodeWithTag(protoWriter, 5, c021k2.rich_sug_user_type);
            protoAdapter.encodeWithTag(protoWriter, 6, c021k2.rich_sug_shop_type);
            protoAdapter.encodeWithTag(protoWriter, 7, c021k2.sug_uniq_id);
            protoAdapter.encodeWithTag(protoWriter, 8, c021k2.sug_user_id);
            protoAdapter.encodeWithTag(protoWriter, 9, c021k2.sug_sec_user_id);
            protoAdapter.encodeWithTag(protoWriter, 10, c021k2.sug_shop_id);
            protoAdapter.encodeWithTag(protoWriter, 11, c021k2.sug_hint);
            protoAdapter.encodeWithTag(protoWriter, 12, c021k2.is_creator_live);
            protoAdapter.encodeWithTag(protoWriter, 13, c021k2.is_live_query);
            protoAdapter.encodeWithTag(protoWriter, 14, c021k2.is_history_sug);
            protoAdapter.encodeWithTag(protoWriter, 15, c021k2.is_personalized);
            ProtoAdapter<Boolean> protoAdapter2 = ProtoAdapter.BOOL;
            protoAdapter2.encodeWithTag(protoWriter, 16, c021k2.is_business_account);
            protoAdapter2.encodeWithTag(protoWriter, 17, c021k2.is_private_account);
            protoAdapter.encodeWithTag(protoWriter, 18, c021k2.words_type);
            protoAdapter.encodeWithTag(protoWriter, 19, c021k2.result_tab);
            protoAdapter.encodeWithTag(protoWriter, 20, c021k2.matched_friend);
            protoAdapter.encodeWithTag(protoWriter, 21, c021k2.recall_reason);
            protoAdapter.encodeWithTag(protoWriter, 22, c021k2.relation_type);
            protoAdapter.encodeWithTag(protoWriter, 23, c021k2.product_id);
            ProtoAdapter<Long> protoAdapter3 = ProtoAdapter.INT64;
            protoAdapter3.encodeWithTag(protoWriter, 30, c021k2.mention_block_type);
            ProtoAdapter<Integer> protoAdapter4 = ProtoAdapter.INT32;
            protoAdapter4.encodeWithTag(protoWriter, 31, c021k2.follow_status);
            protoAdapter4.encodeWithTag(protoWriter, 32, c021k2.follower_status);
            protoAdapter4.encodeWithTag(protoWriter, 33, c021k2.user_story_status);
            protoAdapter3.encodeWithTag(protoWriter, 34, c021k2.followers_count);
            protoAdapter3.encodeWithTag(protoWriter, 35, c021k2.aweme_count);
            protoAdapter4.asRepeated().encodeWithTag(protoWriter, 36, c021k2.can_message_follow_status_list);
            protoAdapter.encodeWithTag(protoWriter, 37, c021k2.use_generative_sug);
            protoAdapter.encodeWithTag(protoWriter, 38, c021k2.generative_display_starting_pos);
            protoAdapter.encodeWithTag(protoWriter, 39, c021k2.search_after_search_sug_type);
            protoAdapter.encodeWithTag(protoWriter, 40, c021k2.search_after_search_text);
            protoAdapter.encodeWithTag(protoWriter, 41, c021k2.lang);
            protoAdapter.encodeWithTag(protoWriter, 42, c021k2.brand_blue_label_light);
            protoAdapter.encodeWithTag(protoWriter, 43, c021k2.brand_blue_label_dark);
            protoAdapter.encodeWithTag(protoWriter, 44, c021k2.penetrate_info);
            ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 45, c021k2.predict_ctr_score);
            protoWriter.writeBytes(c021k2.unknownFields());
        }
    };
    public Long aweme_count;
    public String brand_blue_label_dark;
    public String brand_blue_label_light;
    public List<Integer> can_message_follow_status_list;
    public Integer follow_status;
    public Integer follower_status;
    public Long followers_count;
    public String generative_display_starting_pos;
    public Boolean is_business_account;
    public String is_creator_live;
    public String is_history_sug;
    public String is_live_query;
    public String is_personalized;
    public Boolean is_private_account;
    public String is_rich_sug;
    public String lang;
    public String matched_friend;
    public Long mention_block_type;
    public String penetrate_info;
    public Double predict_ctr_score;
    public String product_id;
    public String recall_reason;
    public String relation_type;
    public String result_tab;
    public String rich_sug_avatar_uri;
    public String rich_sug_nickname;
    public String rich_sug_shop_type;
    public String rich_sug_type;
    public String rich_sug_user_type;
    public String search_after_search_sug_type;
    public String search_after_search_text;
    public String sug_hint;
    public String sug_sec_user_id;
    public String sug_shop_id;
    public String sug_uniq_id;
    public String sug_user_id;
    public String use_generative_sug;
    public Integer user_story_status;
    public String words_type;

    public C021K() {
        super(ADAPTER, ByteString.EMPTY);
        this.can_message_follow_status_list = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C02MP newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
