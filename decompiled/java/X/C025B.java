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

/* JADX INFO: renamed from: X.025B, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C025B extends Message<C025B, C580102Nz> {
    public static final ProtoAdapter<C025B> ADAPTER = new ProtoAdapter<C025B>() { // from class: X.023S
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C025B decode(ProtoReader protoReader) {
            C025B c025b = new C025B();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c025b.prop_value_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c025b.prop_value = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c025b.image = C02U1.ADAPTER.decode(protoReader);
                            break;
                        case 4:
                            c025b.prop_value_display_price = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c025b.tag = C543902Ab.ADAPTER.decode(protoReader);
                            break;
                        case 6:
                            c025b.extended_images.add(C02U1.ADAPTER.decode(protoReader));
                            break;
                        case 7:
                            c025b.is_default_selected = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 8:
                            c025b.sub_product_property_value = C750402wQ.ADAPTER.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c025b.da_info = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c025b.prop_tool_tip = C679502kz.ADAPTER.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c025b;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C025B c025b) {
            C025B c025b2 = c025b;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c025b2.prop_value_id) + protoAdapter.encodedSizeWithTag(2, c025b2.prop_value);
            ProtoAdapter<C02U1> protoAdapter2 = C02U1.ADAPTER;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(3, c025b2.image) + protoAdapter.encodedSizeWithTag(4, c025b2.prop_value_display_price) + C543902Ab.ADAPTER.encodedSizeWithTag(5, c025b2.tag) + protoAdapter2.asRepeated().encodedSizeWithTag(6, c025b2.extended_images) + ProtoAdapter.BOOL.encodedSizeWithTag(7, c025b2.is_default_selected) + C750402wQ.ADAPTER.encodedSizeWithTag(8, c025b2.sub_product_property_value) + protoAdapter.encodedSizeWithTag(9, c025b2.da_info) + C679502kz.ADAPTER.encodedSizeWithTag(10, c025b2.prop_tool_tip) + c025b2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C025B c025b) {
        }
    };
    public String da_info;
    public List<C02U1> extended_images;
    public C02U1 image;
    public Boolean is_default_selected;
    public C679502kz prop_tool_tip;
    public String prop_value;
    public String prop_value_display_price;
    public String prop_value_id;
    public C750402wQ sub_product_property_value;
    public C543902Ab tag;

    public C025B() {
        super(ADAPTER, ByteString.EMPTY);
        this.extended_images = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C580102Nz newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
