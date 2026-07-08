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

/* JADX INFO: renamed from: X.023p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5271023p extends Message<C5271023p, C02KZ> {
    public static final ProtoAdapter<C5271023p> ADAPTER = new ProtoAdapter<C5271023p>() { // from class: X.0222
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C5271023p decode(ProtoReader protoReader) {
            C5271023p c5271023p = new C5271023p();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c5271023p.share_url = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c5271023p.share_weibo_desc = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c5271023p.share_desc = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c5271023p.share_title = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c5271023p.share_qrcode_url = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        case 6:
                            c5271023p.manage_goods_url = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            c5271023p.share_image_url = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        case 8:
                            c5271023p.bool_persist = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c5271023p.goods_rec_url = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c5271023p.share_title_myself = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            c5271023p.share_title_other = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            c5271023p.share_link_desc = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            c5271023p.share_signature_url = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 14:
                            c5271023p.share_signature_desc = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 15:
                            c5271023p.share_quote = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 16:
                            c5271023p.whatsapp_desc = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                            c5271023p.share_desc_info = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                        case 19:
                            c5271023p.share_button_display_mode = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                            c5271023p.button_display_stratege_source = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 21:
                            c5271023p.quick_share_out_info = C02VF.ADAPTER.decode(protoReader);
                            break;
                        case 22:
                            c5271023p.share_channel_ordering_extra_info = ProtoAdapter.STRING.decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c5271023p;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C5271023p c5271023p) {
            C5271023p c5271023p2 = c5271023p;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c5271023p2.share_url) + protoAdapter.encodedSizeWithTag(2, c5271023p2.share_weibo_desc) + protoAdapter.encodedSizeWithTag(3, c5271023p2.share_desc) + protoAdapter.encodedSizeWithTag(4, c5271023p2.share_title);
            ProtoAdapter<C673002jw> protoAdapter2 = C673002jw.ADAPTER;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(5, c5271023p2.share_qrcode_url) + protoAdapter.encodedSizeWithTag(6, c5271023p2.manage_goods_url) + protoAdapter2.encodedSizeWithTag(7, c5271023p2.share_image_url);
            ProtoAdapter<Integer> protoAdapter3 = ProtoAdapter.INT32;
            return iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(8, c5271023p2.bool_persist) + protoAdapter.encodedSizeWithTag(9, c5271023p2.goods_rec_url) + protoAdapter.encodedSizeWithTag(10, c5271023p2.share_title_myself) + protoAdapter.encodedSizeWithTag(11, c5271023p2.share_title_other) + protoAdapter.encodedSizeWithTag(12, c5271023p2.share_link_desc) + protoAdapter.encodedSizeWithTag(13, c5271023p2.share_signature_url) + protoAdapter.encodedSizeWithTag(14, c5271023p2.share_signature_desc) + protoAdapter.encodedSizeWithTag(15, c5271023p2.share_quote) + protoAdapter.encodedSizeWithTag(16, c5271023p2.whatsapp_desc) + protoAdapter.encodedSizeWithTag(17, c5271023p2.share_desc_info) + protoAdapter3.encodedSizeWithTag(19, c5271023p2.share_button_display_mode) + protoAdapter.encodedSizeWithTag(20, c5271023p2.button_display_stratege_source) + C02VF.ADAPTER.encodedSizeWithTag(21, c5271023p2.quick_share_out_info) + protoAdapter.encodedSizeWithTag(22, c5271023p2.share_channel_ordering_extra_info) + c5271023p2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C5271023p c5271023p) {
            C5271023p c5271023p2 = c5271023p;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c5271023p2.share_url);
            protoAdapter.encodeWithTag(protoWriter, 2, c5271023p2.share_weibo_desc);
            protoAdapter.encodeWithTag(protoWriter, 3, c5271023p2.share_desc);
            protoAdapter.encodeWithTag(protoWriter, 4, c5271023p2.share_title);
            ProtoAdapter<C673002jw> protoAdapter2 = C673002jw.ADAPTER;
            protoAdapter2.encodeWithTag(protoWriter, 5, c5271023p2.share_qrcode_url);
            protoAdapter.encodeWithTag(protoWriter, 6, c5271023p2.manage_goods_url);
            protoAdapter2.encodeWithTag(protoWriter, 7, c5271023p2.share_image_url);
            ProtoAdapter<Integer> protoAdapter3 = ProtoAdapter.INT32;
            protoAdapter3.encodeWithTag(protoWriter, 8, c5271023p2.bool_persist);
            protoAdapter.encodeWithTag(protoWriter, 9, c5271023p2.goods_rec_url);
            protoAdapter.encodeWithTag(protoWriter, 10, c5271023p2.share_title_myself);
            protoAdapter.encodeWithTag(protoWriter, 11, c5271023p2.share_title_other);
            protoAdapter.encodeWithTag(protoWriter, 12, c5271023p2.share_link_desc);
            protoAdapter.encodeWithTag(protoWriter, 13, c5271023p2.share_signature_url);
            protoAdapter.encodeWithTag(protoWriter, 14, c5271023p2.share_signature_desc);
            protoAdapter.encodeWithTag(protoWriter, 15, c5271023p2.share_quote);
            protoAdapter.encodeWithTag(protoWriter, 16, c5271023p2.whatsapp_desc);
            protoAdapter.encodeWithTag(protoWriter, 17, c5271023p2.share_desc_info);
            protoAdapter3.encodeWithTag(protoWriter, 19, c5271023p2.share_button_display_mode);
            protoAdapter.encodeWithTag(protoWriter, 20, c5271023p2.button_display_stratege_source);
            C02VF.ADAPTER.encodeWithTag(protoWriter, 21, c5271023p2.quick_share_out_info);
            protoAdapter.encodeWithTag(protoWriter, 22, c5271023p2.share_channel_ordering_extra_info);
            protoWriter.writeBytes(c5271023p2.unknownFields());
        }
    };
    public Integer bool_persist;
    public String button_display_stratege_source;
    public String goods_rec_url;
    public String manage_goods_url;
    public C02VF quick_share_out_info;
    public Integer share_button_display_mode;
    public String share_channel_ordering_extra_info;
    public String share_desc;
    public String share_desc_info;
    public C673002jw share_image_url;
    public String share_link_desc;
    public C673002jw share_qrcode_url;
    public String share_quote;
    public String share_signature_desc;
    public String share_signature_url;
    public String share_title;
    public String share_title_myself;
    public String share_title_other;
    public String share_url;
    public String share_weibo_desc;
    public String whatsapp_desc;

    public C5271023p() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02KZ newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
