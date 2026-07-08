package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import okio.ByteString;

/* JADX INFO: renamed from: X.027X, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C027X extends Message<C027X, C02QD> {
    public static final ProtoAdapter<C027X> ADAPTER = new ProtoAdapter<C027X>() { // from class: X.023Y
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C027X decode(ProtoReader protoReader) {
            C027X c027x = new C027X();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c027x.size_guide_image = C02U1.ADAPTER.decode(protoReader);
                            break;
                        case 2:
                            c027x.origin_size_guide_image = C02U1.ADAPTER.decode(protoReader);
                            break;
                        case 3:
                            c027x.is_out_standing = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 4:
                            c027x.pdp_size_guide_button = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c027x.sku_size_guide_button = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c027x.sku_size_guide_title = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            c027x.sku_size_guide_button_icon = C029C.ADAPTER.decode(protoReader);
                            break;
                        case 8:
                            c027x.sku_size_guide_location = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c027x.sku_size_page_schema = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c027x.show_sale_prop_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            c027x.structure_size_assistant_panel = C1C7I.ADAPTER.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c027x;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C027X c027x) {
            C027X c027x2 = c027x;
            ProtoAdapter<C02U1> protoAdapter = C02U1.ADAPTER;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c027x2.size_guide_image) + protoAdapter.encodedSizeWithTag(2, c027x2.origin_size_guide_image) + ProtoAdapter.BOOL.encodedSizeWithTag(3, c027x2.is_out_standing);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(4, c027x2.pdp_size_guide_button) + protoAdapter2.encodedSizeWithTag(5, c027x2.sku_size_guide_button) + protoAdapter2.encodedSizeWithTag(6, c027x2.sku_size_guide_title) + C029C.ADAPTER.encodedSizeWithTag(7, c027x2.sku_size_guide_button_icon) + ProtoAdapter.INT32.encodedSizeWithTag(8, c027x2.sku_size_guide_location) + protoAdapter2.encodedSizeWithTag(9, c027x2.sku_size_page_schema) + protoAdapter2.encodedSizeWithTag(10, c027x2.show_sale_prop_id) + C1C7I.ADAPTER.encodedSizeWithTag(11, c027x2.structure_size_assistant_panel) + c027x2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C027X c027x) {
        }
    };
    public Boolean is_out_standing;
    public C02U1 origin_size_guide_image;
    public String pdp_size_guide_button;
    public String show_sale_prop_id;
    public C02U1 size_guide_image;
    public String sku_size_guide_button;
    public C029C sku_size_guide_button_icon;
    public Integer sku_size_guide_location;
    public String sku_size_guide_title;
    public String sku_size_page_schema;
    public C1C7I structure_size_assistant_panel;

    public C027X() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02QD newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
