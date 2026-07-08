package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.0265, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class AnonymousClass0265 extends Message<AnonymousClass0265, C583602Pi> {
    public static final ProtoAdapter<AnonymousClass0265> ADAPTER = new ProtoAdapter<AnonymousClass0265>() { // from class: X.0257
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final AnonymousClass0265 decode(ProtoReader protoReader) {
            AnonymousClass0265 anonymousClass0265 = new AnonymousClass0265();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            anonymousClass0265.discount_desc_text = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            anonymousClass0265.service_text = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            anonymousClass0265.lead_time_text = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            anonymousClass0265.delivery_status_text = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            anonymousClass0265.threshold_text = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            anonymousClass0265.threshold_text_en = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            anonymousClass0265.discount_views.add(C682302lR.ADAPTER.decode(protoReader));
                            break;
                        case 8:
                            anonymousClass0265.lead_message = C02BM.ADAPTER.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            anonymousClass0265.shipping_text_info = C698802o6.ADAPTER.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            anonymousClass0265.estimated_arrival_text = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            anonymousClass0265.estimated_transit_time_text = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return anonymousClass0265;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(AnonymousClass0265 anonymousClass0265) {
            AnonymousClass0265 anonymousClass02652 = anonymousClass0265;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, anonymousClass02652.discount_desc_text) + protoAdapter.encodedSizeWithTag(2, anonymousClass02652.service_text) + protoAdapter.encodedSizeWithTag(3, anonymousClass02652.lead_time_text) + protoAdapter.encodedSizeWithTag(4, anonymousClass02652.delivery_status_text) + protoAdapter.encodedSizeWithTag(5, anonymousClass02652.threshold_text) + protoAdapter.encodedSizeWithTag(6, anonymousClass02652.threshold_text_en) + C682302lR.ADAPTER.asRepeated().encodedSizeWithTag(7, anonymousClass02652.discount_views) + C02BM.ADAPTER.encodedSizeWithTag(8, anonymousClass02652.lead_message) + C698802o6.ADAPTER.encodedSizeWithTag(9, anonymousClass02652.shipping_text_info) + protoAdapter.encodedSizeWithTag(10, anonymousClass02652.estimated_arrival_text) + protoAdapter.encodedSizeWithTag(11, anonymousClass02652.estimated_transit_time_text) + anonymousClass02652.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, AnonymousClass0265 anonymousClass0265) {
        }
    };
    public String delivery_status_text;
    public String discount_desc_text;
    public List<C682302lR> discount_views;
    public String estimated_arrival_text;
    public String estimated_transit_time_text;
    public C02BM lead_message;
    public String lead_time_text;
    public String service_text;
    public C698802o6 shipping_text_info;
    public String threshold_text;
    public String threshold_text_en;

    public AnonymousClass0265() {
        super(ADAPTER, ByteString.EMPTY);
        this.discount_views = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C583602Pi newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
