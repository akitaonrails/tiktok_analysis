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

/* JADX INFO: renamed from: X.021l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5215021l extends Message<C5215021l, C573802Lo> {
    public static final ProtoAdapter<C5215021l> ADAPTER = new ProtoAdapter<C5215021l>() { // from class: X.021H
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C5215021l decode(ProtoReader protoReader) {
            C5215021l c5215021l = new C5215021l();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c5215021l.back_image = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        case 2:
                            c5215021l.back_image_thumbnail = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        case 3:
                            c5215021l.front_image = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        case 4:
                            c5215021l.front_image_thumbnail = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        case 5:
                            c5215021l.fuzzy_image = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        case 6:
                            c5215021l.composite_image_ltr = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        case 7:
                            c5215021l.composite_image_rtl = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        case 8:
                            c5215021l.last_pushed_at_sec = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c5215021l.fuzzy_front_image_thumbnail = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c5215021l.fuzzy_front_image_thumbnail_with_logo = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            c5215021l.now_status = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            c5215021l.incompatibility_info = C602602Wq.ADAPTER.decode(protoReader);
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            c5215021l.now_media_type = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 14:
                            c5215021l.composite_image_ltr_without_watermark = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        case 15:
                            c5215021l.composite_image_rtl_without_watermark = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        case 16:
                            c5215021l.watermark_image_ltr = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                            c5215021l.watermark_image_rtl = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                            c5215021l.fuzzy_image_with_watermark = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        case 19:
                            c5215021l.fuzzy_image_rtl_with_watermark = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                            c5215021l.create_time_in_author_timezone = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 21:
                            c5215021l.disable_interaction = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 22:
                            c5215021l.now_post_source = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 23:
                            c5215021l.now_interaction_control = C02DT.ADAPTER.decode(protoReader);
                            break;
                        case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                            c5215021l.background_music = C5199020v.ADAPTER.decode(protoReader);
                            break;
                        case 25:
                        case 26:
                        case 27:
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                        case 28:
                            c5215021l.attributes = C596202Ue.ADAPTER.decode(protoReader);
                            break;
                        case 29:
                            c5215021l.content_info = C710002pu.ADAPTER.decode(protoReader);
                            break;
                        case 30:
                            c5215021l.consumption_info = C646102fb.ADAPTER.decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c5215021l;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C5215021l c5215021l) {
            C5215021l c5215021l2 = c5215021l;
            ProtoAdapter<C673002jw> protoAdapter = C673002jw.ADAPTER;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c5215021l2.back_image) + protoAdapter.encodedSizeWithTag(2, c5215021l2.back_image_thumbnail) + protoAdapter.encodedSizeWithTag(3, c5215021l2.front_image) + protoAdapter.encodedSizeWithTag(4, c5215021l2.front_image_thumbnail) + protoAdapter.encodedSizeWithTag(5, c5215021l2.fuzzy_image) + protoAdapter.encodedSizeWithTag(6, c5215021l2.composite_image_ltr) + protoAdapter.encodedSizeWithTag(7, c5215021l2.composite_image_rtl) + ProtoAdapter.INT64.encodedSizeWithTag(8, c5215021l2.last_pushed_at_sec) + protoAdapter.encodedSizeWithTag(9, c5215021l2.fuzzy_front_image_thumbnail) + protoAdapter.encodedSizeWithTag(10, c5215021l2.fuzzy_front_image_thumbnail_with_logo);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(11, c5215021l2.now_status) + C602602Wq.ADAPTER.encodedSizeWithTag(12, c5215021l2.incompatibility_info);
            ProtoAdapter<String> protoAdapter3 = ProtoAdapter.STRING;
            return iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(13, c5215021l2.now_media_type) + protoAdapter.encodedSizeWithTag(14, c5215021l2.composite_image_ltr_without_watermark) + protoAdapter.encodedSizeWithTag(15, c5215021l2.composite_image_rtl_without_watermark) + protoAdapter.encodedSizeWithTag(16, c5215021l2.watermark_image_ltr) + protoAdapter.encodedSizeWithTag(17, c5215021l2.watermark_image_rtl) + protoAdapter.encodedSizeWithTag(18, c5215021l2.fuzzy_image_with_watermark) + protoAdapter.encodedSizeWithTag(19, c5215021l2.fuzzy_image_rtl_with_watermark) + protoAdapter3.encodedSizeWithTag(20, c5215021l2.create_time_in_author_timezone) + ProtoAdapter.BOOL.encodedSizeWithTag(21, c5215021l2.disable_interaction) + protoAdapter2.encodedSizeWithTag(22, c5215021l2.now_post_source) + C02DT.ADAPTER.encodedSizeWithTag(23, c5215021l2.now_interaction_control) + C5199020v.ADAPTER.encodedSizeWithTag(24, c5215021l2.background_music) + C596202Ue.ADAPTER.encodedSizeWithTag(28, c5215021l2.attributes) + C710002pu.ADAPTER.encodedSizeWithTag(29, c5215021l2.content_info) + C646102fb.ADAPTER.encodedSizeWithTag(30, c5215021l2.consumption_info) + c5215021l2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C5215021l c5215021l) {
            C5215021l c5215021l2 = c5215021l;
            ProtoAdapter<C673002jw> protoAdapter = C673002jw.ADAPTER;
            protoAdapter.encodeWithTag(protoWriter, 1, c5215021l2.back_image);
            protoAdapter.encodeWithTag(protoWriter, 2, c5215021l2.back_image_thumbnail);
            protoAdapter.encodeWithTag(protoWriter, 3, c5215021l2.front_image);
            protoAdapter.encodeWithTag(protoWriter, 4, c5215021l2.front_image_thumbnail);
            protoAdapter.encodeWithTag(protoWriter, 5, c5215021l2.fuzzy_image);
            protoAdapter.encodeWithTag(protoWriter, 6, c5215021l2.composite_image_ltr);
            protoAdapter.encodeWithTag(protoWriter, 7, c5215021l2.composite_image_rtl);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 8, c5215021l2.last_pushed_at_sec);
            protoAdapter.encodeWithTag(protoWriter, 9, c5215021l2.fuzzy_front_image_thumbnail);
            protoAdapter.encodeWithTag(protoWriter, 10, c5215021l2.fuzzy_front_image_thumbnail_with_logo);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            protoAdapter2.encodeWithTag(protoWriter, 11, c5215021l2.now_status);
            C602602Wq.ADAPTER.encodeWithTag(protoWriter, 12, c5215021l2.incompatibility_info);
            ProtoAdapter<String> protoAdapter3 = ProtoAdapter.STRING;
            protoAdapter3.encodeWithTag(protoWriter, 13, c5215021l2.now_media_type);
            protoAdapter.encodeWithTag(protoWriter, 14, c5215021l2.composite_image_ltr_without_watermark);
            protoAdapter.encodeWithTag(protoWriter, 15, c5215021l2.composite_image_rtl_without_watermark);
            protoAdapter.encodeWithTag(protoWriter, 16, c5215021l2.watermark_image_ltr);
            protoAdapter.encodeWithTag(protoWriter, 17, c5215021l2.watermark_image_rtl);
            protoAdapter.encodeWithTag(protoWriter, 18, c5215021l2.fuzzy_image_with_watermark);
            protoAdapter.encodeWithTag(protoWriter, 19, c5215021l2.fuzzy_image_rtl_with_watermark);
            protoAdapter3.encodeWithTag(protoWriter, 20, c5215021l2.create_time_in_author_timezone);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 21, c5215021l2.disable_interaction);
            protoAdapter2.encodeWithTag(protoWriter, 22, c5215021l2.now_post_source);
            C02DT.ADAPTER.encodeWithTag(protoWriter, 23, c5215021l2.now_interaction_control);
            C5199020v.ADAPTER.encodeWithTag(protoWriter, 24, c5215021l2.background_music);
            C596202Ue.ADAPTER.encodeWithTag(protoWriter, 28, c5215021l2.attributes);
            C710002pu.ADAPTER.encodeWithTag(protoWriter, 29, c5215021l2.content_info);
            C646102fb.ADAPTER.encodeWithTag(protoWriter, 30, c5215021l2.consumption_info);
            protoWriter.writeBytes(c5215021l2.unknownFields());
        }
    };
    public C596202Ue attributes;
    public C673002jw back_image;
    public C673002jw back_image_thumbnail;
    public C5199020v background_music;
    public C673002jw composite_image_ltr;
    public C673002jw composite_image_ltr_without_watermark;
    public C673002jw composite_image_rtl;
    public C673002jw composite_image_rtl_without_watermark;
    public C646102fb consumption_info;
    public C710002pu content_info;
    public String create_time_in_author_timezone;
    public Boolean disable_interaction;
    public C673002jw front_image;
    public C673002jw front_image_thumbnail;
    public C673002jw fuzzy_front_image_thumbnail;
    public C673002jw fuzzy_front_image_thumbnail_with_logo;
    public C673002jw fuzzy_image;
    public C673002jw fuzzy_image_rtl_with_watermark;
    public C673002jw fuzzy_image_with_watermark;
    public C602602Wq incompatibility_info;
    public Long last_pushed_at_sec;
    public C02DT now_interaction_control;
    public String now_media_type;
    public Integer now_post_source;
    public Integer now_status;
    public C673002jw watermark_image_ltr;
    public C673002jw watermark_image_rtl;

    public C5215021l() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C573802Lo newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
