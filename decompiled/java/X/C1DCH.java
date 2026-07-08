package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.ugc.aweme.exp.DMInboxChangeRightZoneClickableSizeExp;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.1DCH, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DCH extends Message<C1DCH, C1DCF> {
    public static final ProtoAdapter<C1DCH> ADAPTER = new ProtoAdapter<C1DCH>() { // from class: X.1DCG
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1DCH decode(ProtoReader protoReader) {
            C1DCF c1dcf = new C1DCF();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c1dcf.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c1dcf.LJ = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 3:
                            c1dcf.LJFF = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 4:
                            c1dcf.LJI = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 5:
                            c1dcf.LJII = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 6:
                            c1dcf.LJIIIIZZ = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 7:
                            c1dcf.LJIIIZ = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 8:
                            c1dcf.LJIIJ = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c1dcf.LJIIJJI = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c1dcf.LJIIL = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            c1dcf.LJIILIIL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            c1dcf.LJIILJJIL = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            c1dcf.LJIILL = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 14:
                            c1dcf.LJIILLIIL = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 15:
                            c1dcf.LJIIZILJ = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 16:
                            c1dcf.LJIJ = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                            c1dcf.LJIJI = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                            c1dcf.LJIJJ = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 19:
                            c1dcf.LJIJJLI = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                            c1dcf.LJIL = C1DC3.ADAPTER.decode(protoReader);
                            break;
                        case 21:
                            c1dcf.LJJ.add(C558502Fr.ADAPTER.decode(protoReader));
                            break;
                        case 22:
                            c1dcf.LJJI = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 23:
                            c1dcf.LJJIFFI.add(C1C1Z.ADAPTER.decode(protoReader));
                            break;
                        default:
                            switch (iNextTag) {
                                case 51:
                                    c1dcf.LJJII = ProtoAdapter.BOOL.decode(protoReader);
                                    break;
                                case 52:
                                    c1dcf.LJJIII = ProtoAdapter.BOOL.decode(protoReader);
                                    break;
                                case 53:
                                    c1dcf.LJJIIJ = ProtoAdapter.BOOL.decode(protoReader);
                                    break;
                                case 54:
                                    c1dcf.LJJIIJZLJL = ProtoAdapter.BOOL.decode(protoReader);
                                    break;
                                case 55:
                                    c1dcf.LJJIIZ = ProtoAdapter.BOOL.decode(protoReader);
                                    break;
                                case 56:
                                    c1dcf.LJJIIZI = ProtoAdapter.BOOL.decode(protoReader);
                                    break;
                                case 57:
                                    c1dcf.LJJIJ = ProtoAdapter.BOOL.decode(protoReader);
                                    break;
                                case 58:
                                    c1dcf.LJJIJIIJI = ProtoAdapter.BOOL.decode(protoReader);
                                    break;
                                case 59:
                                    c1dcf.LJJIJIIJIL = ProtoAdapter.BOOL.decode(protoReader);
                                    break;
                                case 60:
                                    c1dcf.LJJIJIL = ProtoAdapter.BOOL.decode(protoReader);
                                    break;
                                case 61:
                                    c1dcf.LJJIJL = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case BaseNotice.CREATOR /* 62 */:
                                    c1dcf.LJJIJLIJ = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 63:
                                    c1dcf.LJJIL = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 64:
                                    c1dcf.LJJIZ = ProtoAdapter.BOOL.decode(protoReader);
                                    break;
                                case 65:
                                    c1dcf.LJJJ = ProtoAdapter.BOOL.decode(protoReader);
                                    break;
                                case 66:
                                    c1dcf.LJJJI = ProtoAdapter.BOOL.decode(protoReader);
                                    break;
                                case 67:
                                    c1dcf.LJJJIL = ProtoAdapter.BOOL.decode(protoReader);
                                    break;
                                case 68:
                                    c1dcf.LJJJJ = ProtoAdapter.BOOL.decode(protoReader);
                                    break;
                                case 69:
                                    c1dcf.LJJJJI = ProtoAdapter.BOOL.decode(protoReader);
                                    break;
                                case 70:
                                    c1dcf.LJJJJIZL = ProtoAdapter.BOOL.decode(protoReader);
                                    break;
                                case 71:
                                    c1dcf.LJJJJJ = ProtoAdapter.BOOL.decode(protoReader);
                                    break;
                                case DMInboxChangeRightZoneClickableSizeExp.NEW_DP_SIZE /* 72 */:
                                    c1dcf.LJJJJJL = C1518290pc3.ADAPTER.decode(protoReader);
                                    break;
                                case 73:
                                    c1dcf.LJJJJL = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 74:
                                    c1dcf.LJJJJLI = ProtoAdapter.INT64.decode(protoReader);
                                    break;
                                case 75:
                                    c1dcf.LJJJJLL = ProtoAdapter.BOOL.decode(protoReader);
                                    break;
                                case 76:
                                    c1dcf.LJJJJZ = ProtoAdapter.BOOL.decode(protoReader);
                                    break;
                                case 77:
                                    c1dcf.LJJJJZI = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 78:
                                    c1dcf.LJJJLIIL = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 79:
                                    c1dcf.LJJJLL = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 80:
                                    c1dcf.LJJJLZIJ = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 81:
                                    c1dcf.LJJJZ = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 82:
                                    c1dcf.LJJL = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 83:
                                    c1dcf.LJJLI = C1C1H.ADAPTER.decode(protoReader);
                                    break;
                                case 84:
                                    c1dcf.LJJLIIIIJ = ProtoAdapter.BOOL.decode(protoReader);
                                    break;
                                default:
                                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                    c1dcf.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                    break;
                            }
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1dcf.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1DCH c1dch) {
            C1DCH c1dch2 = c1dch;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c1dch2.id);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(2, c1dch2.model_type) + protoAdapter2.encodedSizeWithTag(3, c1dch2.playtime) + protoAdapter2.encodedSizeWithTag(4, c1dch2.playtime_live) + protoAdapter2.encodedSizeWithTag(5, c1dch2.duration) + protoAdapter2.encodedSizeWithTag(6, c1dch2.vv) + protoAdapter2.encodedSizeWithTag(7, c1dch2.session_v_num) + protoAdapter2.encodedSizeWithTag(8, c1dch2.session_r_num) + protoAdapter2.encodedSizeWithTag(9, c1dch2.day_v_num) + protoAdapter2.encodedSizeWithTag(10, c1dch2.day_r_num) + protoAdapter.encodedSizeWithTag(11, c1dch2.author_id);
            ProtoAdapter<Long> protoAdapter3 = ProtoAdapter.INT64;
            int iEncodedSizeWithTag3 = iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(12, c1dch2.start_playing_timestamp) + protoAdapter3.encodedSizeWithTag(13, c1dch2.first_frame_duration) + protoAdapter2.encodedSizeWithTag(14, c1dch2.block_count) + protoAdapter3.encodedSizeWithTag(15, c1dch2.block_duration) + protoAdapter3.encodedSizeWithTag(16, c1dch2.video_bitrate) + protoAdapter.encodedSizeWithTag(17, c1dch2.video_resolution);
            ProtoAdapter<Boolean> protoAdapter4 = ProtoAdapter.BOOL;
            return iEncodedSizeWithTag3 + protoAdapter4.encodedSizeWithTag(18, c1dch2.is_bytevc1) + protoAdapter2.encodedSizeWithTag(19, c1dch2.playtime_max) + C1DC3.ADAPTER.encodedSizeWithTag(20, c1dch2.poi) + C558502Fr.ADAPTER.asRepeated().encodedSizeWithTag(21, c1dch2.post_search_info) + protoAdapter3.encodedSizeWithTag(22, c1dch2.timestamp) + C1C1Z.ADAPTER.asRepeated().encodedSizeWithTag(23, c1dch2.components) + protoAdapter4.encodedSizeWithTag(51, c1dch2.is_finished) + protoAdapter4.encodedSizeWithTag(52, c1dch2.is_followed) + protoAdapter4.encodedSizeWithTag(53, c1dch2.is_entered_profile) + protoAdapter4.encodedSizeWithTag(54, c1dch2.is_liked) + protoAdapter4.encodedSizeWithTag(55, c1dch2.is_favorited) + protoAdapter4.encodedSizeWithTag(56, c1dch2.is_shared) + protoAdapter4.encodedSizeWithTag(57, c1dch2.is_disliked) + protoAdapter4.encodedSizeWithTag(58, c1dch2.is_reported) + protoAdapter4.encodedSizeWithTag(59, c1dch2.is_ecom) + protoAdapter4.encodedSizeWithTag(60, c1dch2.is_ad) + protoAdapter.encodedSizeWithTag(61, c1dch2.ad_id) + protoAdapter.encodedSizeWithTag(62, c1dch2.log_id) + protoAdapter.encodedSizeWithTag(63, c1dch2.creative_id) + protoAdapter4.encodedSizeWithTag(64, c1dch2.is_commentted) + protoAdapter4.encodedSizeWithTag(65, c1dch2.is_click_comment) + protoAdapter4.encodedSizeWithTag(66, c1dch2.is_click_cover) + protoAdapter4.encodedSizeWithTag(67, c1dch2.is_ad_click) + protoAdapter4.encodedSizeWithTag(68, c1dch2.is_download) + protoAdapter4.encodedSizeWithTag(69, c1dch2.is_skipped) + protoAdapter4.encodedSizeWithTag(70, c1dch2.download_result_succ) + protoAdapter4.encodedSizeWithTag(71, c1dch2.is_live) + C1518290pc3.ADAPTER.encodedSizeWithTag(72, c1dch2.live_hot_refresh_info) + protoAdapter.encodedSizeWithTag(73, c1dch2.comment_message_type) + protoAdapter3.encodedSizeWithTag(74, c1dch2.comment_duration) + protoAdapter4.encodedSizeWithTag(75, c1dch2.is_like_comment) + protoAdapter4.encodedSizeWithTag(76, c1dch2.is_click_hashtag) + protoAdapter.encodedSizeWithTag(77, c1dch2.comment_category) + protoAdapter.encodedSizeWithTag(78, c1dch2.post_parent_comment_id) + protoAdapter.encodedSizeWithTag(79, c1dch2.post_comment_id) + protoAdapter.encodedSizeWithTag(80, c1dch2.like_parent_comment_id) + protoAdapter.encodedSizeWithTag(81, c1dch2.like_comment_id) + protoAdapter.encodedSizeWithTag(82, c1dch2.dynamic_feature) + C1C1H.ADAPTER.encodedSizeWithTag(83, c1dch2.new_user_survey) + protoAdapter4.encodedSizeWithTag(84, c1dch2.is_refreshed_homepage) + c1dch2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1DCH c1dch) {
            C1DCH c1dch2 = c1dch;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c1dch2.id);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            protoAdapter2.encodeWithTag(protoWriter, 2, c1dch2.model_type);
            protoAdapter2.encodeWithTag(protoWriter, 3, c1dch2.playtime);
            protoAdapter2.encodeWithTag(protoWriter, 4, c1dch2.playtime_live);
            protoAdapter2.encodeWithTag(protoWriter, 5, c1dch2.duration);
            protoAdapter2.encodeWithTag(protoWriter, 6, c1dch2.vv);
            protoAdapter2.encodeWithTag(protoWriter, 7, c1dch2.session_v_num);
            protoAdapter2.encodeWithTag(protoWriter, 8, c1dch2.session_r_num);
            protoAdapter2.encodeWithTag(protoWriter, 9, c1dch2.day_v_num);
            protoAdapter2.encodeWithTag(protoWriter, 10, c1dch2.day_r_num);
            protoAdapter.encodeWithTag(protoWriter, 11, c1dch2.author_id);
            ProtoAdapter<Long> protoAdapter3 = ProtoAdapter.INT64;
            protoAdapter3.encodeWithTag(protoWriter, 12, c1dch2.start_playing_timestamp);
            protoAdapter3.encodeWithTag(protoWriter, 13, c1dch2.first_frame_duration);
            protoAdapter2.encodeWithTag(protoWriter, 14, c1dch2.block_count);
            protoAdapter3.encodeWithTag(protoWriter, 15, c1dch2.block_duration);
            protoAdapter3.encodeWithTag(protoWriter, 16, c1dch2.video_bitrate);
            protoAdapter.encodeWithTag(protoWriter, 17, c1dch2.video_resolution);
            ProtoAdapter<Boolean> protoAdapter4 = ProtoAdapter.BOOL;
            protoAdapter4.encodeWithTag(protoWriter, 18, c1dch2.is_bytevc1);
            protoAdapter2.encodeWithTag(protoWriter, 19, c1dch2.playtime_max);
            C1DC3.ADAPTER.encodeWithTag(protoWriter, 20, c1dch2.poi);
            C558502Fr.ADAPTER.asRepeated().encodeWithTag(protoWriter, 21, c1dch2.post_search_info);
            protoAdapter3.encodeWithTag(protoWriter, 22, c1dch2.timestamp);
            C1C1Z.ADAPTER.asRepeated().encodeWithTag(protoWriter, 23, c1dch2.components);
            protoAdapter4.encodeWithTag(protoWriter, 51, c1dch2.is_finished);
            protoAdapter4.encodeWithTag(protoWriter, 52, c1dch2.is_followed);
            protoAdapter4.encodeWithTag(protoWriter, 53, c1dch2.is_entered_profile);
            protoAdapter4.encodeWithTag(protoWriter, 54, c1dch2.is_liked);
            protoAdapter4.encodeWithTag(protoWriter, 55, c1dch2.is_favorited);
            protoAdapter4.encodeWithTag(protoWriter, 56, c1dch2.is_shared);
            protoAdapter4.encodeWithTag(protoWriter, 57, c1dch2.is_disliked);
            protoAdapter4.encodeWithTag(protoWriter, 58, c1dch2.is_reported);
            protoAdapter4.encodeWithTag(protoWriter, 59, c1dch2.is_ecom);
            protoAdapter4.encodeWithTag(protoWriter, 60, c1dch2.is_ad);
            protoAdapter.encodeWithTag(protoWriter, 61, c1dch2.ad_id);
            protoAdapter.encodeWithTag(protoWriter, 62, c1dch2.log_id);
            protoAdapter.encodeWithTag(protoWriter, 63, c1dch2.creative_id);
            protoAdapter4.encodeWithTag(protoWriter, 64, c1dch2.is_commentted);
            protoAdapter4.encodeWithTag(protoWriter, 65, c1dch2.is_click_comment);
            protoAdapter4.encodeWithTag(protoWriter, 66, c1dch2.is_click_cover);
            protoAdapter4.encodeWithTag(protoWriter, 67, c1dch2.is_ad_click);
            protoAdapter4.encodeWithTag(protoWriter, 68, c1dch2.is_download);
            protoAdapter4.encodeWithTag(protoWriter, 69, c1dch2.is_skipped);
            protoAdapter4.encodeWithTag(protoWriter, 70, c1dch2.download_result_succ);
            protoAdapter4.encodeWithTag(protoWriter, 71, c1dch2.is_live);
            C1518290pc3.ADAPTER.encodeWithTag(protoWriter, 72, c1dch2.live_hot_refresh_info);
            protoAdapter.encodeWithTag(protoWriter, 73, c1dch2.comment_message_type);
            protoAdapter3.encodeWithTag(protoWriter, 74, c1dch2.comment_duration);
            protoAdapter4.encodeWithTag(protoWriter, 75, c1dch2.is_like_comment);
            protoAdapter4.encodeWithTag(protoWriter, 76, c1dch2.is_click_hashtag);
            protoAdapter.encodeWithTag(protoWriter, 77, c1dch2.comment_category);
            protoAdapter.encodeWithTag(protoWriter, 78, c1dch2.post_parent_comment_id);
            protoAdapter.encodeWithTag(protoWriter, 79, c1dch2.post_comment_id);
            protoAdapter.encodeWithTag(protoWriter, 80, c1dch2.like_parent_comment_id);
            protoAdapter.encodeWithTag(protoWriter, 81, c1dch2.like_comment_id);
            protoAdapter.encodeWithTag(protoWriter, 82, c1dch2.dynamic_feature);
            C1C1H.ADAPTER.encodeWithTag(protoWriter, 83, c1dch2.new_user_survey);
            protoAdapter4.encodeWithTag(protoWriter, 84, c1dch2.is_refreshed_homepage);
            protoWriter.writeBytes(c1dch2.unknownFields());
        }
    };
    public String ad_id;
    public String author_id;
    public Integer block_count;
    public Long block_duration;
    public String comment_category;
    public Long comment_duration;
    public String comment_message_type;
    public List<C1C1Z> components;
    public String creative_id;
    public Integer day_r_num;
    public Integer day_v_num;
    public Boolean download_result_succ;
    public Integer duration;
    public String dynamic_feature;
    public Long first_frame_duration;
    public String id;
    public Boolean is_ad;
    public Boolean is_ad_click;
    public Boolean is_bytevc1;
    public Boolean is_click_comment;
    public Boolean is_click_cover;
    public Boolean is_click_hashtag;
    public Boolean is_commentted;
    public Boolean is_disliked;
    public Boolean is_download;
    public Boolean is_ecom;
    public Boolean is_entered_profile;
    public Boolean is_favorited;
    public Boolean is_finished;
    public Boolean is_followed;
    public Boolean is_like_comment;
    public Boolean is_liked;
    public Boolean is_live;
    public Boolean is_refreshed_homepage;
    public Boolean is_reported;
    public Boolean is_shared;
    public Boolean is_skipped;
    public String like_comment_id;
    public String like_parent_comment_id;
    public C1518290pc3 live_hot_refresh_info;
    public String log_id;
    public Integer model_type;
    public C1C1H new_user_survey;
    public Integer playtime;
    public Integer playtime_live;
    public Integer playtime_max;
    public C1DC3 poi;
    public String post_comment_id;
    public String post_parent_comment_id;
    public List<C558502Fr> post_search_info;
    public Integer session_r_num;
    public Integer session_v_num;
    public Long start_playing_timestamp;
    public Long timestamp;
    public Long video_bitrate;
    public String video_resolution;
    public Integer vv;

    @Override // com.squareup.wire.Message
    public C1DCF newBuilder() {
        return null;
    }

    public C1DCH(String str, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, String str2, Long l, Long l2, Integer num10, Long l3, Long l4, String str3, Boolean bool, Integer num11, C1DC3 c1dc3, List<C558502Fr> list, Long l5, List<C1C1Z> list2, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, String str4, String str5, String str6, Boolean bool12, Boolean bool13, Boolean bool14, Boolean bool15, Boolean bool16, Boolean bool17, Boolean bool18, Boolean bool19, C1518290pc3 c1518290pc3, String str7, Long l6, Boolean bool20, Boolean bool21, String str8, String str9, String str10, String str11, String str12, String str13, C1C1H c1c1h, Boolean bool22) {
        this(str, num, num2, num3, num4, num5, num6, num7, num8, num9, str2, l, l2, num10, l3, l4, str3, bool, num11, c1dc3, list, l5, list2, bool2, bool3, bool4, bool5, bool6, bool7, bool8, bool9, bool10, bool11, str4, str5, str6, bool12, bool13, bool14, bool15, bool16, bool17, bool18, bool19, c1518290pc3, str7, l6, bool20, bool21, str8, str9, str10, str11, str12, str13, c1c1h, bool22, ByteString.EMPTY);
    }

    public C1DCH(String str, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, String str2, Long l, Long l2, Integer num10, Long l3, Long l4, String str3, Boolean bool, Integer num11, C1DC3 c1dc3, List<C558502Fr> list, Long l5, List<C1C1Z> list2, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, String str4, String str5, String str6, Boolean bool12, Boolean bool13, Boolean bool14, Boolean bool15, Boolean bool16, Boolean bool17, Boolean bool18, Boolean bool19, C1518290pc3 c1518290pc3, String str7, Long l6, Boolean bool20, Boolean bool21, String str8, String str9, String str10, String str11, String str12, String str13, C1C1H c1c1h, Boolean bool22, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.model_type = num;
        this.playtime = num2;
        this.playtime_live = num3;
        this.duration = num4;
        this.vv = num5;
        this.session_v_num = num6;
        this.session_r_num = num7;
        this.day_v_num = num8;
        this.day_r_num = num9;
        this.author_id = str2;
        this.start_playing_timestamp = l;
        this.first_frame_duration = l2;
        this.block_count = num10;
        this.block_duration = l3;
        this.video_bitrate = l4;
        this.video_resolution = str3;
        this.is_bytevc1 = bool;
        this.playtime_max = num11;
        this.poi = c1dc3;
        this.post_search_info = C1516540pZE.LJFF("post_search_info", list);
        this.timestamp = l5;
        this.components = C1516540pZE.LJFF("components", list2);
        this.is_finished = bool2;
        this.is_followed = bool3;
        this.is_entered_profile = bool4;
        this.is_liked = bool5;
        this.is_favorited = bool6;
        this.is_shared = bool7;
        this.is_disliked = bool8;
        this.is_reported = bool9;
        this.is_ecom = bool10;
        this.is_ad = bool11;
        this.ad_id = str4;
        this.log_id = str5;
        this.creative_id = str6;
        this.is_commentted = bool12;
        this.is_click_comment = bool13;
        this.is_click_cover = bool14;
        this.is_ad_click = bool15;
        this.is_download = bool16;
        this.is_skipped = bool17;
        this.download_result_succ = bool18;
        this.is_live = bool19;
        this.live_hot_refresh_info = c1518290pc3;
        this.comment_message_type = str7;
        this.comment_duration = l6;
        this.is_like_comment = bool20;
        this.is_click_hashtag = bool21;
        this.comment_category = str8;
        this.post_parent_comment_id = str9;
        this.post_comment_id = str10;
        this.like_parent_comment_id = str11;
        this.like_comment_id = str12;
        this.dynamic_feature = str13;
        this.new_user_survey = c1c1h;
        this.is_refreshed_homepage = bool22;
    }
}
