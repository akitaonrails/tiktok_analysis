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

/* JADX INFO: renamed from: X.036j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C7891036j extends Message<C7891036j, C7892036k> {
    public static final ProtoAdapter<C7891036j> ADAPTER = new ProtoAdapter<C7891036j>() { // from class: X.036i
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C7891036j decode(ProtoReader protoReader) {
            C7891036j c7891036j = new C7891036j();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c7891036j.seller_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c7891036j.activity_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c7891036j.fulfillment_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 4:
                            c7891036j.threshold_diff = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c7891036j.pinup_product_ids.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 6:
                            c7891036j.related_product_ids.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 7:
                            c7891036j.cart_sku_info_list.add(C7894036m.ADAPTER.decode(protoReader));
                            break;
                        case 8:
                            c7891036j.addon_product_info = C589702Rr.ADAPTER.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c7891036j.related_product_ids_str = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c7891036j.voucher_type_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            c7891036j.voucher_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            c7891036j.promotion_template = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            c7891036j.da_info = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 14:
                            c7891036j.theme_based_params = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c7891036j;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C7891036j c7891036j) {
            C7891036j c7891036j2 = c7891036j;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c7891036j2.seller_id) + protoAdapter.encodedSizeWithTag(2, c7891036j2.activity_id) + ProtoAdapter.INT32.encodedSizeWithTag(3, c7891036j2.fulfillment_type) + protoAdapter.encodedSizeWithTag(4, c7891036j2.threshold_diff) + protoAdapter.asRepeated().encodedSizeWithTag(5, c7891036j2.pinup_product_ids) + protoAdapter.asRepeated().encodedSizeWithTag(6, c7891036j2.related_product_ids) + C7894036m.ADAPTER.asRepeated().encodedSizeWithTag(7, c7891036j2.cart_sku_info_list) + C589702Rr.ADAPTER.encodedSizeWithTag(8, c7891036j2.addon_product_info) + protoAdapter.encodedSizeWithTag(9, c7891036j2.related_product_ids_str) + protoAdapter.encodedSizeWithTag(10, c7891036j2.voucher_type_id) + protoAdapter.encodedSizeWithTag(11, c7891036j2.voucher_id) + protoAdapter.encodedSizeWithTag(12, c7891036j2.promotion_template) + protoAdapter.encodedSizeWithTag(13, c7891036j2.da_info) + protoAdapter.encodedSizeWithTag(14, c7891036j2.theme_based_params) + c7891036j2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C7891036j c7891036j) {
        }
    };
    public String activity_id;
    public C589702Rr addon_product_info;
    public List<C7894036m> cart_sku_info_list;
    public String da_info;
    public Integer fulfillment_type;
    public List<String> pinup_product_ids;
    public String promotion_template;
    public List<String> related_product_ids;
    public String related_product_ids_str;
    public String seller_id;
    public String theme_based_params;
    public String threshold_diff;
    public String voucher_id;
    public String voucher_type_id;

    public C7891036j() {
        super(ADAPTER, ByteString.EMPTY);
        this.pinup_product_ids = C1516540pZE.LJIIIIZZ();
        this.related_product_ids = C1516540pZE.LJIIIIZZ();
        this.cart_sku_info_list = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C7892036k newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
