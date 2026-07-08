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

/* JADX INFO: renamed from: X.02OV, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02OV extends Message<C02OV, C585302Pz> {
    public static final ProtoAdapter<C02OV> ADAPTER = new ProtoAdapter<C02OV>() { // from class: X.02OU
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02OV decode(ProtoReader protoReader) {
            C02OV c02ov = new C02OV();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c02ov.seller_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c02ov.warehouse_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c02ov.seller = AnonymousClass0210.ADAPTER.decode(protoReader);
                            break;
                        case 4:
                            c02ov.packed_skus.add(C5194020q.ADAPTER.decode(protoReader));
                            break;
                        case 5:
                            c02ov.shop_bill = C02OY.ADAPTER.decode(protoReader);
                            break;
                        case 6:
                            c02ov.logistics.add(C021O.ADAPTER.decode(protoReader));
                            break;
                        case 7:
                            c02ov.voucher_info = C763702yZ.ADAPTER.decode(protoReader);
                            break;
                        case 8:
                            c02ov.main_order_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c02ov.selected_logistics_service_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c02ov.reachable = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            c02ov.unreachable_reason = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            c02ov.shop_promotion_activity = C737102uH.ADAPTER.decode(protoReader);
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            c02ov.product_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 14:
                            c02ov.phone_credit = C02OX.ADAPTER.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02ov;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02OV c02ov) {
            C02OV c02ov2 = c02ov;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c02ov2.seller_id) + protoAdapter.encodedSizeWithTag(2, c02ov2.warehouse_id) + AnonymousClass0210.ADAPTER.encodedSizeWithTag(3, c02ov2.seller) + C5194020q.ADAPTER.asRepeated().encodedSizeWithTag(4, c02ov2.packed_skus) + C02OY.ADAPTER.encodedSizeWithTag(5, c02ov2.shop_bill) + C021O.ADAPTER.asRepeated().encodedSizeWithTag(6, c02ov2.logistics) + C763702yZ.ADAPTER.encodedSizeWithTag(7, c02ov2.voucher_info) + protoAdapter.encodedSizeWithTag(8, c02ov2.main_order_id) + protoAdapter.encodedSizeWithTag(9, c02ov2.selected_logistics_service_id) + ProtoAdapter.BOOL.encodedSizeWithTag(10, c02ov2.reachable) + protoAdapter.encodedSizeWithTag(11, c02ov2.unreachable_reason) + C737102uH.ADAPTER.encodedSizeWithTag(12, c02ov2.shop_promotion_activity) + ProtoAdapter.INT32.encodedSizeWithTag(13, c02ov2.product_type) + C02OX.ADAPTER.encodedSizeWithTag(14, c02ov2.phone_credit) + c02ov2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02OV c02ov) {
        }
    };
    public List<C021O> logistics;
    public String main_order_id;
    public List<C5194020q> packed_skus;
    public C02OX phone_credit;
    public Integer product_type;
    public Boolean reachable;
    public String selected_logistics_service_id;
    public AnonymousClass0210 seller;
    public String seller_id;
    public C02OY shop_bill;
    public C737102uH shop_promotion_activity;
    public String unreachable_reason;
    public C763702yZ voucher_info;
    public String warehouse_id;

    public C02OV() {
        super(ADAPTER, ByteString.EMPTY);
        this.packed_skus = C1516540pZE.LJIIIIZZ();
        this.logistics = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C585302Pz newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
