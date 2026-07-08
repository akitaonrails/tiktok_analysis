package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Aa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C543802Aa extends Message<C543802Aa, C02NZ> {
    public static final ProtoAdapter<C543802Aa> ADAPTER = new ProtoAdapter<C543802Aa>() { // from class: X.027B
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C543802Aa decode(ProtoReader protoReader) {
            C543802Aa c543802Aa = new C543802Aa();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c543802Aa.key = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c543802Aa.count_show_content = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c543802Aa.count = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 4:
                            c543802Aa.content = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c543802Aa.head_tag = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c543802Aa.seller_detail_popup = C685802m0.ADAPTER.decode(protoReader);
                            break;
                        case 7:
                            c543802Aa.benefit_image_light = C02U1.ADAPTER.decode(protoReader);
                            break;
                        case 8:
                            c543802Aa.benefit_image_dark = C02U1.ADAPTER.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c543802Aa.benefit_text_color_light = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c543802Aa.benefit_text_color_dark = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c543802Aa;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C543802Aa c543802Aa) {
            C543802Aa c543802Aa2 = c543802Aa;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c543802Aa2.key) + protoAdapter.encodedSizeWithTag(2, c543802Aa2.count_show_content) + ProtoAdapter.INT64.encodedSizeWithTag(3, c543802Aa2.count) + protoAdapter.encodedSizeWithTag(4, c543802Aa2.content) + protoAdapter.encodedSizeWithTag(5, c543802Aa2.head_tag) + C685802m0.ADAPTER.encodedSizeWithTag(6, c543802Aa2.seller_detail_popup);
            ProtoAdapter<C02U1> protoAdapter2 = C02U1.ADAPTER;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(7, c543802Aa2.benefit_image_light) + protoAdapter2.encodedSizeWithTag(8, c543802Aa2.benefit_image_dark) + protoAdapter.encodedSizeWithTag(9, c543802Aa2.benefit_text_color_light) + protoAdapter.encodedSizeWithTag(10, c543802Aa2.benefit_text_color_dark) + c543802Aa2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C543802Aa c543802Aa) {
        }
    };
    public C02U1 benefit_image_dark;
    public C02U1 benefit_image_light;
    public String benefit_text_color_dark;
    public String benefit_text_color_light;
    public String content;
    public Long count;
    public String count_show_content;
    public String head_tag;
    public String key;
    public C685802m0 seller_detail_popup;

    public C543802Aa() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02NZ newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
