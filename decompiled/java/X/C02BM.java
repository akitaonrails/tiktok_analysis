package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import okio.ByteString;

/* JADX INFO: renamed from: X.02BM, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02BM extends Message<C02BM, C02QF> {
    public static final ProtoAdapter<C02BM> ADAPTER = new ProtoAdapter<C02BM>() { // from class: X.0262
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02BM decode(ProtoReader protoReader) {
            C02BM c02bm = new C02BM();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c02bm.delivery_text = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c02bm.time_text = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c02bm.icon_from = C029C.ADAPTER.decode(protoReader);
                            break;
                        case 4:
                            c02bm.icon_to = C029C.ADAPTER.decode(protoReader);
                            break;
                        case 5:
                            c02bm.from_overseas = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c02bm.destination = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            c02bm.from_message = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            c02bm.from_overseas_v2 = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c02bm.delivery_text_prefix = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c02bm.shipping_coupon_text = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02bm;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02BM c02bm) {
            C02BM c02bm2 = c02bm;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c02bm2.delivery_text) + protoAdapter.encodedSizeWithTag(2, c02bm2.time_text);
            ProtoAdapter<C029C> protoAdapter2 = C029C.ADAPTER;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(3, c02bm2.icon_from) + protoAdapter2.encodedSizeWithTag(4, c02bm2.icon_to) + protoAdapter.encodedSizeWithTag(5, c02bm2.from_overseas) + protoAdapter.encodedSizeWithTag(6, c02bm2.destination) + protoAdapter.encodedSizeWithTag(7, c02bm2.from_message) + protoAdapter.encodedSizeWithTag(8, c02bm2.from_overseas_v2) + protoAdapter.encodedSizeWithTag(9, c02bm2.delivery_text_prefix) + protoAdapter.encodedSizeWithTag(10, c02bm2.shipping_coupon_text) + c02bm2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02BM c02bm) {
        }
    };
    public String delivery_text;
    public String delivery_text_prefix;
    public String destination;
    public String from_message;
    public String from_overseas;
    public String from_overseas_v2;
    public C029C icon_from;
    public C029C icon_to;
    public String shipping_coupon_text;
    public String time_text;

    public C02BM() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02QF newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
