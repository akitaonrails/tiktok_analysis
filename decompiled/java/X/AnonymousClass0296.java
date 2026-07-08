package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import okio.ByteString;

/* JADX INFO: renamed from: X.0296, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class AnonymousClass0296 extends Message<AnonymousClass0296, C02OI> {
    public static final ProtoAdapter<AnonymousClass0296> ADAPTER = new ProtoAdapter<AnonymousClass0296>() { // from class: X.0293
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final AnonymousClass0296 decode(ProtoReader protoReader) {
            AnonymousClass0296 anonymousClass0296 = new AnonymousClass0296();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            anonymousClass0296.identity_logo = C02U1.ADAPTER.decode(protoReader);
                            break;
                        case 2:
                            anonymousClass0296.identity_logo_dark = C02U1.ADAPTER.decode(protoReader);
                            break;
                        case 3:
                            anonymousClass0296.identity_label_bg_color = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            anonymousClass0296.identity_label_bg_color_dark = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            anonymousClass0296.identity_label_text = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            anonymousClass0296.identity_label_text_color = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            anonymousClass0296.identity_label_text_color_dark = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            anonymousClass0296.explanation_schema = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            anonymousClass0296.identity_label_name = C5431029t.ADAPTER.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            anonymousClass0296.shop_identity_key = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            anonymousClass0296.brand_logo = C02U1.ADAPTER.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            anonymousClass0296.style_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            anonymousClass0296.identity_image_logo = C643802fE.ADAPTER.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return anonymousClass0296;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(AnonymousClass0296 anonymousClass0296) {
            AnonymousClass0296 anonymousClass02962 = anonymousClass0296;
            ProtoAdapter<C02U1> protoAdapter = C02U1.ADAPTER;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, anonymousClass02962.identity_logo) + protoAdapter.encodedSizeWithTag(2, anonymousClass02962.identity_logo_dark);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(3, anonymousClass02962.identity_label_bg_color) + protoAdapter2.encodedSizeWithTag(4, anonymousClass02962.identity_label_bg_color_dark) + protoAdapter2.encodedSizeWithTag(5, anonymousClass02962.identity_label_text) + protoAdapter2.encodedSizeWithTag(6, anonymousClass02962.identity_label_text_color) + protoAdapter2.encodedSizeWithTag(7, anonymousClass02962.identity_label_text_color_dark) + protoAdapter2.encodedSizeWithTag(8, anonymousClass02962.explanation_schema) + C5431029t.ADAPTER.encodedSizeWithTag(9, anonymousClass02962.identity_label_name) + protoAdapter2.encodedSizeWithTag(10, anonymousClass02962.shop_identity_key) + protoAdapter.encodedSizeWithTag(11, anonymousClass02962.brand_logo) + ProtoAdapter.INT32.encodedSizeWithTag(12, anonymousClass02962.style_type) + C643802fE.ADAPTER.encodedSizeWithTag(13, anonymousClass02962.identity_image_logo) + anonymousClass02962.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, AnonymousClass0296 anonymousClass0296) {
        }
    };
    public C02U1 brand_logo;
    public String explanation_schema;
    public C643802fE identity_image_logo;
    public String identity_label_bg_color;
    public String identity_label_bg_color_dark;
    public C5431029t identity_label_name;
    public String identity_label_text;
    public String identity_label_text_color;
    public String identity_label_text_color_dark;
    public C02U1 identity_logo;
    public C02U1 identity_logo_dark;
    public String shop_identity_key;
    public Integer style_type;

    public AnonymousClass0296() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02OI newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
