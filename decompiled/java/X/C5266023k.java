package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import okio.ByteString;

/* JADX INFO: renamed from: X.023k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5266023k extends Message<C5266023k, C567602Je> {
    public static final ProtoAdapter<C5266023k> ADAPTER = new ProtoAdapter<C5266023k>() { // from class: X.022a
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C5266023k decode(ProtoReader protoReader) {
            C5266023k c5266023k = new C5266023k();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c5266023k.id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c5266023k.ad_owner_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c5266023k.ad_owner_name = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c5266023k.detail_desc = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c5266023k.detail_letters = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c5266023k.detail_open_url = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            c5266023k.detail_web_url = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            c5266023k.detail_web_url_title = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c5266023k.screen_desc = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c5266023k.screen_switch = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            c5266023k.publish_icon_url = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            c5266023k.publish_letters = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            c5266023k.publish_open_url = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 14:
                            c5266023k.publish_web_url = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 15:
                            c5266023k.publish_web_url_title = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 16:
                            c5266023k.music_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                            c5266023k.challenge_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                            c5266023k.screen_icon = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        case 19:
                            c5266023k.expire_time = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                            c5266023k.unlock_info = C02W2.ADAPTER.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c5266023k;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C5266023k c5266023k) {
            C5266023k c5266023k2 = c5266023k;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c5266023k2.id) + protoAdapter.encodedSizeWithTag(2, c5266023k2.ad_owner_id) + protoAdapter.encodedSizeWithTag(3, c5266023k2.ad_owner_name) + protoAdapter.encodedSizeWithTag(4, c5266023k2.detail_desc) + protoAdapter.encodedSizeWithTag(5, c5266023k2.detail_letters) + protoAdapter.encodedSizeWithTag(6, c5266023k2.detail_open_url) + protoAdapter.encodedSizeWithTag(7, c5266023k2.detail_web_url) + protoAdapter.encodedSizeWithTag(8, c5266023k2.detail_web_url_title) + protoAdapter.encodedSizeWithTag(9, c5266023k2.screen_desc) + ProtoAdapter.BOOL.encodedSizeWithTag(10, c5266023k2.screen_switch);
            ProtoAdapter<C673002jw> protoAdapter2 = C673002jw.ADAPTER;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(11, c5266023k2.publish_icon_url) + protoAdapter.encodedSizeWithTag(12, c5266023k2.publish_letters) + protoAdapter.encodedSizeWithTag(13, c5266023k2.publish_open_url) + protoAdapter.encodedSizeWithTag(14, c5266023k2.publish_web_url) + protoAdapter.encodedSizeWithTag(15, c5266023k2.publish_web_url_title) + protoAdapter.encodedSizeWithTag(16, c5266023k2.music_id) + protoAdapter.encodedSizeWithTag(17, c5266023k2.challenge_id) + protoAdapter2.encodedSizeWithTag(18, c5266023k2.screen_icon) + ProtoAdapter.INT64.encodedSizeWithTag(19, c5266023k2.expire_time) + C02W2.ADAPTER.encodedSizeWithTag(20, c5266023k2.unlock_info) + c5266023k2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C5266023k c5266023k) {
            C5266023k c5266023k2 = c5266023k;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c5266023k2.id);
            protoAdapter.encodeWithTag(protoWriter, 2, c5266023k2.ad_owner_id);
            protoAdapter.encodeWithTag(protoWriter, 3, c5266023k2.ad_owner_name);
            protoAdapter.encodeWithTag(protoWriter, 4, c5266023k2.detail_desc);
            protoAdapter.encodeWithTag(protoWriter, 5, c5266023k2.detail_letters);
            protoAdapter.encodeWithTag(protoWriter, 6, c5266023k2.detail_open_url);
            protoAdapter.encodeWithTag(protoWriter, 7, c5266023k2.detail_web_url);
            protoAdapter.encodeWithTag(protoWriter, 8, c5266023k2.detail_web_url_title);
            protoAdapter.encodeWithTag(protoWriter, 9, c5266023k2.screen_desc);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 10, c5266023k2.screen_switch);
            ProtoAdapter<C673002jw> protoAdapter2 = C673002jw.ADAPTER;
            protoAdapter2.encodeWithTag(protoWriter, 11, c5266023k2.publish_icon_url);
            protoAdapter.encodeWithTag(protoWriter, 12, c5266023k2.publish_letters);
            protoAdapter.encodeWithTag(protoWriter, 13, c5266023k2.publish_open_url);
            protoAdapter.encodeWithTag(protoWriter, 14, c5266023k2.publish_web_url);
            protoAdapter.encodeWithTag(protoWriter, 15, c5266023k2.publish_web_url_title);
            protoAdapter.encodeWithTag(protoWriter, 16, c5266023k2.music_id);
            protoAdapter.encodeWithTag(protoWriter, 17, c5266023k2.challenge_id);
            protoAdapter2.encodeWithTag(protoWriter, 18, c5266023k2.screen_icon);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 19, c5266023k2.expire_time);
            C02W2.ADAPTER.encodeWithTag(protoWriter, 20, c5266023k2.unlock_info);
            protoWriter.writeBytes(c5266023k2.unknownFields());
        }
    };
    public String ad_owner_id;
    public String ad_owner_name;
    public String challenge_id;
    public String detail_desc;
    public String detail_letters;
    public String detail_open_url;
    public String detail_web_url;
    public String detail_web_url_title;
    public Long expire_time;
    public String id;
    public String music_id;
    public C673002jw publish_icon_url;
    public String publish_letters;
    public String publish_open_url;
    public String publish_web_url;
    public String publish_web_url_title;
    public String screen_desc;
    public C673002jw screen_icon;
    public Boolean screen_switch;
    public C02W2 unlock_info;

    public C5266023k() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C567602Je newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
