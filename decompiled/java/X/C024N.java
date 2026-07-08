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

/* JADX INFO: renamed from: X.024N, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C024N extends Message<C024N, C02QH> {
    public static final ProtoAdapter<C024N> ADAPTER = new ProtoAdapter<C024N>() { // from class: X.022k
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C024N decode(ProtoReader protoReader) {
            C024N c024n = new C024N();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c024n.skc_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c024n.skc_name = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c024n.color_block_image = C02U1.ADAPTER.decode(protoReader);
                            break;
                        case 4:
                            c024n.skc_images.add(C02U1.ADAPTER.decode(protoReader));
                            break;
                        case 5:
                            c024n.sku_ids.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 6:
                            c024n.skc_stock = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 7:
                            c024n.price = AnonymousClass0234.ADAPTER.decode(protoReader);
                            break;
                        case 8:
                            c024n.is_default = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c024n.out_of_stock_warning = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c024n.pdp_button_area_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            c024n.skc_display_price = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            c024n.product_link = C603202Ww.ADAPTER.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c024n;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C024N c024n) {
            C024N c024n2 = c024n;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c024n2.skc_id) + protoAdapter.encodedSizeWithTag(2, c024n2.skc_name);
            ProtoAdapter<C02U1> protoAdapter2 = C02U1.ADAPTER;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(3, c024n2.color_block_image) + protoAdapter2.asRepeated().encodedSizeWithTag(4, c024n2.skc_images) + protoAdapter.asRepeated().encodedSizeWithTag(5, c024n2.sku_ids) + ProtoAdapter.INT32.encodedSizeWithTag(6, c024n2.skc_stock) + AnonymousClass0234.ADAPTER.encodedSizeWithTag(7, c024n2.price) + ProtoAdapter.BOOL.encodedSizeWithTag(8, c024n2.is_default) + protoAdapter.encodedSizeWithTag(9, c024n2.out_of_stock_warning) + protoAdapter.encodedSizeWithTag(10, c024n2.pdp_button_area_id) + protoAdapter.encodedSizeWithTag(11, c024n2.skc_display_price) + C603202Ww.ADAPTER.encodedSizeWithTag(12, c024n2.product_link) + c024n2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C024N c024n) {
        }
    };
    public C02U1 color_block_image;
    public Boolean is_default;
    public String out_of_stock_warning;
    public String pdp_button_area_id;
    public AnonymousClass0234 price;
    public C603202Ww product_link;
    public String skc_display_price;
    public String skc_id;
    public List<C02U1> skc_images;
    public String skc_name;
    public Integer skc_stock;
    public List<String> sku_ids;

    public C024N() {
        super(ADAPTER, ByteString.EMPTY);
        this.skc_images = C1516540pZE.LJIIIIZZ();
        this.sku_ids = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C02QH newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
