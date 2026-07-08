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

/* JADX INFO: renamed from: X.022A, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C022A extends Message<C022A, C02M2> {
    public static final ProtoAdapter<C022A> ADAPTER = new ProtoAdapter<C022A>() { // from class: X.021V
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C022A decode(ProtoReader protoReader) {
            C022A c022a = new C022A();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c022a.room_id = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 2:
                            c022a.status = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 3:
                            c022a.owner = C5189020l.ADAPTER.decode(protoReader);
                            break;
                        case 4:
                            c022a.title = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c022a.user_count = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 6:
                            c022a.create_time = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 7:
                            c022a.finish_time = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 8:
                            c022a.stream_id = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c022a.stream_url = C611702a3.ADAPTER.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c022a.share_info = C5271023p.ADAPTER.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            c022a.digg_count = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            c022a.total_user_count = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                        case 14:
                            c022a.in_sandbox = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 15:
                            c022a.dynamic_cover = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        case 16:
                            c022a.room_cover = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                            c022a.room_type_tag = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                            c022a.additional_stream_url = C611702a3.ADAPTER.decode(protoReader);
                            break;
                        case 19:
                            c022a.webp_cover = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                            c022a.extra = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 21:
                            c022a.live_type_audio = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 22:
                            c022a.live_type_third_party = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 23:
                            c022a.live_type_screenshot = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                            c022a.live_type_official = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 25:
                            c022a.live_type_normal = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 26:
                            c022a.live_type_linkmic = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 27:
                            c022a.live_type_sandbox = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 28:
                            c022a.with_linkmic = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c022a;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C022A c022a) {
            C022A c022a2 = c022a;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c022a2.room_id);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(2, c022a2.status) + C5189020l.ADAPTER.encodedSizeWithTag(3, c022a2.owner);
            ProtoAdapter<String> protoAdapter3 = ProtoAdapter.STRING;
            int iEncodedSizeWithTag3 = iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(4, c022a2.title) + protoAdapter2.encodedSizeWithTag(5, c022a2.user_count) + protoAdapter.encodedSizeWithTag(6, c022a2.create_time) + protoAdapter.encodedSizeWithTag(7, c022a2.finish_time) + protoAdapter.encodedSizeWithTag(8, c022a2.stream_id);
            ProtoAdapter<C611702a3> protoAdapter4 = C611702a3.ADAPTER;
            int iEncodedSizeWithTag4 = iEncodedSizeWithTag3 + protoAdapter4.encodedSizeWithTag(9, c022a2.stream_url) + C5271023p.ADAPTER.encodedSizeWithTag(10, c022a2.share_info) + protoAdapter2.encodedSizeWithTag(11, c022a2.digg_count) + protoAdapter2.encodedSizeWithTag(12, c022a2.total_user_count);
            ProtoAdapter<Boolean> protoAdapter5 = ProtoAdapter.BOOL;
            int iEncodedSizeWithTag5 = iEncodedSizeWithTag4 + protoAdapter5.encodedSizeWithTag(14, c022a2.in_sandbox);
            ProtoAdapter<C673002jw> protoAdapter6 = C673002jw.ADAPTER;
            return iEncodedSizeWithTag5 + protoAdapter6.encodedSizeWithTag(15, c022a2.dynamic_cover) + protoAdapter6.encodedSizeWithTag(16, c022a2.room_cover) + protoAdapter3.encodedSizeWithTag(17, c022a2.room_type_tag) + protoAdapter4.encodedSizeWithTag(18, c022a2.additional_stream_url) + protoAdapter6.encodedSizeWithTag(19, c022a2.webp_cover) + protoAdapter3.encodedSizeWithTag(20, c022a2.extra) + protoAdapter5.encodedSizeWithTag(21, c022a2.live_type_audio) + protoAdapter5.encodedSizeWithTag(22, c022a2.live_type_third_party) + protoAdapter5.encodedSizeWithTag(23, c022a2.live_type_screenshot) + protoAdapter5.encodedSizeWithTag(24, c022a2.live_type_official) + protoAdapter5.encodedSizeWithTag(25, c022a2.live_type_normal) + protoAdapter5.encodedSizeWithTag(26, c022a2.live_type_linkmic) + protoAdapter5.encodedSizeWithTag(27, c022a2.live_type_sandbox) + protoAdapter5.encodedSizeWithTag(28, c022a2.with_linkmic) + c022a2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C022A c022a) {
            C022A c022a2 = c022a;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 1, c022a2.room_id);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            protoAdapter2.encodeWithTag(protoWriter, 2, c022a2.status);
            C5189020l.ADAPTER.encodeWithTag(protoWriter, 3, c022a2.owner);
            ProtoAdapter<String> protoAdapter3 = ProtoAdapter.STRING;
            protoAdapter3.encodeWithTag(protoWriter, 4, c022a2.title);
            protoAdapter2.encodeWithTag(protoWriter, 5, c022a2.user_count);
            protoAdapter.encodeWithTag(protoWriter, 6, c022a2.create_time);
            protoAdapter.encodeWithTag(protoWriter, 7, c022a2.finish_time);
            protoAdapter.encodeWithTag(protoWriter, 8, c022a2.stream_id);
            ProtoAdapter<C611702a3> protoAdapter4 = C611702a3.ADAPTER;
            protoAdapter4.encodeWithTag(protoWriter, 9, c022a2.stream_url);
            C5271023p.ADAPTER.encodeWithTag(protoWriter, 10, c022a2.share_info);
            protoAdapter2.encodeWithTag(protoWriter, 11, c022a2.digg_count);
            protoAdapter2.encodeWithTag(protoWriter, 12, c022a2.total_user_count);
            ProtoAdapter<Boolean> protoAdapter5 = ProtoAdapter.BOOL;
            protoAdapter5.encodeWithTag(protoWriter, 14, c022a2.in_sandbox);
            ProtoAdapter<C673002jw> protoAdapter6 = C673002jw.ADAPTER;
            protoAdapter6.encodeWithTag(protoWriter, 15, c022a2.dynamic_cover);
            protoAdapter6.encodeWithTag(protoWriter, 16, c022a2.room_cover);
            protoAdapter3.encodeWithTag(protoWriter, 17, c022a2.room_type_tag);
            protoAdapter4.encodeWithTag(protoWriter, 18, c022a2.additional_stream_url);
            protoAdapter6.encodeWithTag(protoWriter, 19, c022a2.webp_cover);
            protoAdapter3.encodeWithTag(protoWriter, 20, c022a2.extra);
            protoAdapter5.encodeWithTag(protoWriter, 21, c022a2.live_type_audio);
            protoAdapter5.encodeWithTag(protoWriter, 22, c022a2.live_type_third_party);
            protoAdapter5.encodeWithTag(protoWriter, 23, c022a2.live_type_screenshot);
            protoAdapter5.encodeWithTag(protoWriter, 24, c022a2.live_type_official);
            protoAdapter5.encodeWithTag(protoWriter, 25, c022a2.live_type_normal);
            protoAdapter5.encodeWithTag(protoWriter, 26, c022a2.live_type_linkmic);
            protoAdapter5.encodeWithTag(protoWriter, 27, c022a2.live_type_sandbox);
            protoAdapter5.encodeWithTag(protoWriter, 28, c022a2.with_linkmic);
            protoWriter.writeBytes(c022a2.unknownFields());
        }
    };
    public C611702a3 additional_stream_url;
    public Long create_time;
    public Integer digg_count;
    public C673002jw dynamic_cover;
    public String extra;
    public Long finish_time;
    public Boolean in_sandbox;
    public Boolean live_type_audio;
    public Boolean live_type_linkmic;
    public Boolean live_type_normal;
    public Boolean live_type_official;
    public Boolean live_type_sandbox;
    public Boolean live_type_screenshot;
    public Boolean live_type_third_party;
    public C5189020l owner;
    public C673002jw room_cover;
    public Long room_id;
    public String room_type_tag;
    public C5271023p share_info;
    public Integer status;
    public Long stream_id;
    public C611702a3 stream_url;
    public String title;
    public Integer total_user_count;
    public Integer user_count;
    public C673002jw webp_cover;
    public Boolean with_linkmic;

    public C022A() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02M2 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
