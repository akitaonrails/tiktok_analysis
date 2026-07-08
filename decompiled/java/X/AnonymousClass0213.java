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
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.0213, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class AnonymousClass0213 extends Message<AnonymousClass0213, C02KO> {
    public static final ProtoAdapter<AnonymousClass0213> ADAPTER = new ProtoAdapter<AnonymousClass0213>() { // from class: X.020z
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final AnonymousClass0213 decode(ProtoReader protoReader) {
            AnonymousClass0213 anonymousClass0213 = new AnonymousClass0213();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            anonymousClass0213.play_addr = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        case 2:
                            anonymousClass0213.cover = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        case 3:
                            anonymousClass0213.height = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 4:
                            anonymousClass0213.width = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 5:
                            anonymousClass0213.dynamic_cover = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        case 6:
                            anonymousClass0213.origin_cover = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        case 7:
                            anonymousClass0213.ratio = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            anonymousClass0213.download_addr = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            anonymousClass0213.has_watermark = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            anonymousClass0213.play_addr_lowbr = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            anonymousClass0213.bit_rate.add(AnonymousClass0244.ADAPTER.decode(protoReader));
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            anonymousClass0213.new_download_addr = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            anonymousClass0213.duration = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 14:
                            anonymousClass0213.download_suffix_logo_addr = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        case 15:
                            anonymousClass0213.has_download_suffix_logo_addr = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 16:
                            anonymousClass0213.play_addr_265 = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                            anonymousClass0213.is_h265 = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                            anonymousClass0213.play_addr_h264 = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        case 19:
                            anonymousClass0213.ui_alike_download_addr = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                            anonymousClass0213.caption_download_addr = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        case 21:
                            anonymousClass0213.cdn_url_expired = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 22:
                            anonymousClass0213.is_long_video = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 23:
                            anonymousClass0213.video_model = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                            anonymousClass0213.need_set_token = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 25:
                            anonymousClass0213.misc_download_addrs = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 26:
                            anonymousClass0213.token_auth = C596502Uh.ADAPTER.decode(protoReader);
                            break;
                        case 27:
                            anonymousClass0213.play_addr_bytevc1 = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        case 28:
                            anonymousClass0213.is_bytevc1 = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 29:
                            anonymousClass0213.big_thumbs.add(C5310025c.ADAPTER.decode(protoReader));
                            break;
                        case 30:
                            anonymousClass0213.meta = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 31:
                            anonymousClass0213.cla_info = AnonymousClass0237.ADAPTER.decode(protoReader);
                            break;
                        case 32:
                            anonymousClass0213.source_HDR_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                            anonymousClass0213.CoverTsp = ProtoAdapter.DOUBLE.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                            anonymousClass0213.cover_is_custom = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 35:
                            anonymousClass0213.bit_rate_audio.add(C555002Ei.ADAPTER.decode(protoReader));
                            break;
                        case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                            anonymousClass0213.format = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 37:
                            anonymousClass0213.fake_landscape_video_info = C02DQ.ADAPTER.decode(protoReader);
                            break;
                        case 38:
                            anonymousClass0213.pillar_box_video_info = C02EZ.ADAPTER.decode(protoReader);
                            break;
                        case 39:
                            anonymousClass0213.did_profile_labels = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 40:
                            anonymousClass0213.vid_profile_labels = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 41:
                            anonymousClass0213.download_no_watermark_addr = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        case 42:
                            anonymousClass0213.play_addr_3d_fallback = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        case 43:
                            anonymousClass0213.is_3d = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 44:
                            anonymousClass0213.interest_selection_tags.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 45:
                            anonymousClass0213.ad_video_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 46:
                            anonymousClass0213.cover_rgb = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return anonymousClass0213;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(AnonymousClass0213 anonymousClass0213) {
            AnonymousClass0213 anonymousClass02132 = anonymousClass0213;
            ProtoAdapter<C673002jw> protoAdapter = C673002jw.ADAPTER;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, anonymousClass02132.play_addr) + protoAdapter.encodedSizeWithTag(2, anonymousClass02132.cover);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(3, anonymousClass02132.height) + protoAdapter2.encodedSizeWithTag(4, anonymousClass02132.width) + protoAdapter.encodedSizeWithTag(5, anonymousClass02132.dynamic_cover) + protoAdapter.encodedSizeWithTag(6, anonymousClass02132.origin_cover);
            ProtoAdapter<String> protoAdapter3 = ProtoAdapter.STRING;
            int iEncodedSizeWithTag3 = iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(7, anonymousClass02132.ratio) + protoAdapter.encodedSizeWithTag(8, anonymousClass02132.download_addr);
            ProtoAdapter<Boolean> protoAdapter4 = ProtoAdapter.BOOL;
            return iEncodedSizeWithTag3 + protoAdapter4.encodedSizeWithTag(9, anonymousClass02132.has_watermark) + protoAdapter.encodedSizeWithTag(10, anonymousClass02132.play_addr_lowbr) + AnonymousClass0244.ADAPTER.asRepeated().encodedSizeWithTag(11, anonymousClass02132.bit_rate) + protoAdapter.encodedSizeWithTag(12, anonymousClass02132.new_download_addr) + protoAdapter2.encodedSizeWithTag(13, anonymousClass02132.duration) + protoAdapter.encodedSizeWithTag(14, anonymousClass02132.download_suffix_logo_addr) + protoAdapter4.encodedSizeWithTag(15, anonymousClass02132.has_download_suffix_logo_addr) + protoAdapter.encodedSizeWithTag(16, anonymousClass02132.play_addr_265) + protoAdapter2.encodedSizeWithTag(17, anonymousClass02132.is_h265) + protoAdapter.encodedSizeWithTag(18, anonymousClass02132.play_addr_h264) + protoAdapter.encodedSizeWithTag(19, anonymousClass02132.ui_alike_download_addr) + protoAdapter.encodedSizeWithTag(20, anonymousClass02132.caption_download_addr) + ProtoAdapter.INT64.encodedSizeWithTag(21, anonymousClass02132.cdn_url_expired) + protoAdapter2.encodedSizeWithTag(22, anonymousClass02132.is_long_video) + protoAdapter3.encodedSizeWithTag(23, anonymousClass02132.video_model) + protoAdapter4.encodedSizeWithTag(24, anonymousClass02132.need_set_token) + protoAdapter3.encodedSizeWithTag(25, anonymousClass02132.misc_download_addrs) + C596502Uh.ADAPTER.encodedSizeWithTag(26, anonymousClass02132.token_auth) + protoAdapter.encodedSizeWithTag(27, anonymousClass02132.play_addr_bytevc1) + protoAdapter2.encodedSizeWithTag(28, anonymousClass02132.is_bytevc1) + C5310025c.ADAPTER.asRepeated().encodedSizeWithTag(29, anonymousClass02132.big_thumbs) + protoAdapter3.encodedSizeWithTag(30, anonymousClass02132.meta) + AnonymousClass0237.ADAPTER.encodedSizeWithTag(31, anonymousClass02132.cla_info) + protoAdapter2.encodedSizeWithTag(32, anonymousClass02132.source_HDR_type) + ProtoAdapter.DOUBLE.encodedSizeWithTag(33, anonymousClass02132.CoverTsp) + protoAdapter4.encodedSizeWithTag(34, anonymousClass02132.cover_is_custom) + C555002Ei.ADAPTER.asRepeated().encodedSizeWithTag(35, anonymousClass02132.bit_rate_audio) + protoAdapter3.encodedSizeWithTag(36, anonymousClass02132.format) + C02DQ.ADAPTER.encodedSizeWithTag(37, anonymousClass02132.fake_landscape_video_info) + C02EZ.ADAPTER.encodedSizeWithTag(38, anonymousClass02132.pillar_box_video_info) + protoAdapter3.encodedSizeWithTag(39, anonymousClass02132.did_profile_labels) + protoAdapter3.encodedSizeWithTag(40, anonymousClass02132.vid_profile_labels) + protoAdapter.encodedSizeWithTag(41, anonymousClass02132.download_no_watermark_addr) + protoAdapter.encodedSizeWithTag(42, anonymousClass02132.play_addr_3d_fallback) + protoAdapter4.encodedSizeWithTag(43, anonymousClass02132.is_3d) + protoAdapter3.asRepeated().encodedSizeWithTag(44, anonymousClass02132.interest_selection_tags) + protoAdapter3.encodedSizeWithTag(45, anonymousClass02132.ad_video_id) + protoAdapter3.encodedSizeWithTag(46, anonymousClass02132.cover_rgb) + anonymousClass02132.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, AnonymousClass0213 anonymousClass0213) {
            AnonymousClass0213 anonymousClass02132 = anonymousClass0213;
            ProtoAdapter<C673002jw> protoAdapter = C673002jw.ADAPTER;
            protoAdapter.encodeWithTag(protoWriter, 1, anonymousClass02132.play_addr);
            protoAdapter.encodeWithTag(protoWriter, 2, anonymousClass02132.cover);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            protoAdapter2.encodeWithTag(protoWriter, 3, anonymousClass02132.height);
            protoAdapter2.encodeWithTag(protoWriter, 4, anonymousClass02132.width);
            protoAdapter.encodeWithTag(protoWriter, 5, anonymousClass02132.dynamic_cover);
            protoAdapter.encodeWithTag(protoWriter, 6, anonymousClass02132.origin_cover);
            ProtoAdapter<String> protoAdapter3 = ProtoAdapter.STRING;
            protoAdapter3.encodeWithTag(protoWriter, 7, anonymousClass02132.ratio);
            protoAdapter.encodeWithTag(protoWriter, 8, anonymousClass02132.download_addr);
            ProtoAdapter<Boolean> protoAdapter4 = ProtoAdapter.BOOL;
            protoAdapter4.encodeWithTag(protoWriter, 9, anonymousClass02132.has_watermark);
            protoAdapter.encodeWithTag(protoWriter, 10, anonymousClass02132.play_addr_lowbr);
            AnonymousClass0244.ADAPTER.asRepeated().encodeWithTag(protoWriter, 11, anonymousClass02132.bit_rate);
            protoAdapter.encodeWithTag(protoWriter, 12, anonymousClass02132.new_download_addr);
            protoAdapter2.encodeWithTag(protoWriter, 13, anonymousClass02132.duration);
            protoAdapter.encodeWithTag(protoWriter, 14, anonymousClass02132.download_suffix_logo_addr);
            protoAdapter4.encodeWithTag(protoWriter, 15, anonymousClass02132.has_download_suffix_logo_addr);
            protoAdapter.encodeWithTag(protoWriter, 16, anonymousClass02132.play_addr_265);
            protoAdapter2.encodeWithTag(protoWriter, 17, anonymousClass02132.is_h265);
            protoAdapter.encodeWithTag(protoWriter, 18, anonymousClass02132.play_addr_h264);
            protoAdapter.encodeWithTag(protoWriter, 19, anonymousClass02132.ui_alike_download_addr);
            protoAdapter.encodeWithTag(protoWriter, 20, anonymousClass02132.caption_download_addr);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 21, anonymousClass02132.cdn_url_expired);
            protoAdapter2.encodeWithTag(protoWriter, 22, anonymousClass02132.is_long_video);
            protoAdapter3.encodeWithTag(protoWriter, 23, anonymousClass02132.video_model);
            protoAdapter4.encodeWithTag(protoWriter, 24, anonymousClass02132.need_set_token);
            protoAdapter3.encodeWithTag(protoWriter, 25, anonymousClass02132.misc_download_addrs);
            C596502Uh.ADAPTER.encodeWithTag(protoWriter, 26, anonymousClass02132.token_auth);
            protoAdapter.encodeWithTag(protoWriter, 27, anonymousClass02132.play_addr_bytevc1);
            protoAdapter2.encodeWithTag(protoWriter, 28, anonymousClass02132.is_bytevc1);
            C5310025c.ADAPTER.asRepeated().encodeWithTag(protoWriter, 29, anonymousClass02132.big_thumbs);
            protoAdapter3.encodeWithTag(protoWriter, 30, anonymousClass02132.meta);
            AnonymousClass0237.ADAPTER.encodeWithTag(protoWriter, 31, anonymousClass02132.cla_info);
            protoAdapter2.encodeWithTag(protoWriter, 32, anonymousClass02132.source_HDR_type);
            ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 33, anonymousClass02132.CoverTsp);
            protoAdapter4.encodeWithTag(protoWriter, 34, anonymousClass02132.cover_is_custom);
            C555002Ei.ADAPTER.asRepeated().encodeWithTag(protoWriter, 35, anonymousClass02132.bit_rate_audio);
            protoAdapter3.encodeWithTag(protoWriter, 36, anonymousClass02132.format);
            C02DQ.ADAPTER.encodeWithTag(protoWriter, 37, anonymousClass02132.fake_landscape_video_info);
            C02EZ.ADAPTER.encodeWithTag(protoWriter, 38, anonymousClass02132.pillar_box_video_info);
            protoAdapter3.encodeWithTag(protoWriter, 39, anonymousClass02132.did_profile_labels);
            protoAdapter3.encodeWithTag(protoWriter, 40, anonymousClass02132.vid_profile_labels);
            protoAdapter.encodeWithTag(protoWriter, 41, anonymousClass02132.download_no_watermark_addr);
            protoAdapter.encodeWithTag(protoWriter, 42, anonymousClass02132.play_addr_3d_fallback);
            protoAdapter4.encodeWithTag(protoWriter, 43, anonymousClass02132.is_3d);
            protoAdapter3.asRepeated().encodeWithTag(protoWriter, 44, anonymousClass02132.interest_selection_tags);
            protoAdapter3.encodeWithTag(protoWriter, 45, anonymousClass02132.ad_video_id);
            protoAdapter3.encodeWithTag(protoWriter, 46, anonymousClass02132.cover_rgb);
            protoWriter.writeBytes(anonymousClass02132.unknownFields());
        }
    };
    public Double CoverTsp;
    public String ad_video_id;
    public List<C5310025c> big_thumbs;
    public List<AnonymousClass0244> bit_rate;
    public List<C555002Ei> bit_rate_audio;
    public C673002jw caption_download_addr;
    public Long cdn_url_expired;
    public AnonymousClass0237 cla_info;
    public C673002jw cover;
    public Boolean cover_is_custom;
    public String cover_rgb;
    public String did_profile_labels;
    public C673002jw download_addr;
    public C673002jw download_no_watermark_addr;
    public C673002jw download_suffix_logo_addr;
    public Integer duration;
    public C673002jw dynamic_cover;
    public C02DQ fake_landscape_video_info;
    public String format;
    public Boolean has_download_suffix_logo_addr;
    public Boolean has_watermark;
    public Integer height;
    public List<String> interest_selection_tags;
    public Boolean is_3d;
    public Integer is_bytevc1;
    public Integer is_h265;
    public Integer is_long_video;
    public String meta;
    public String misc_download_addrs;
    public Boolean need_set_token;
    public C673002jw new_download_addr;
    public C673002jw origin_cover;
    public C02EZ pillar_box_video_info;
    public C673002jw play_addr;
    public C673002jw play_addr_265;
    public C673002jw play_addr_3d_fallback;
    public C673002jw play_addr_bytevc1;
    public C673002jw play_addr_h264;
    public C673002jw play_addr_lowbr;
    public String ratio;
    public Integer source_HDR_type;
    public C596502Uh token_auth;
    public C673002jw ui_alike_download_addr;
    public String vid_profile_labels;
    public String video_model;
    public Integer width;

    public AnonymousClass0213() {
        super(ADAPTER, ByteString.EMPTY);
        this.bit_rate = C1516540pZE.LJIIIIZZ();
        this.big_thumbs = C1516540pZE.LJIIIIZZ();
        this.bit_rate_audio = C1516540pZE.LJIIIIZZ();
        this.interest_selection_tags = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C02KO newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
