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

/* JADX INFO: renamed from: X.0240, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class AnonymousClass0240 extends Message<AnonymousClass0240, C578902Nn> {
    public static final ProtoAdapter<AnonymousClass0240> ADAPTER = new ProtoAdapter<AnonymousClass0240>() { // from class: X.022u
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final AnonymousClass0240 decode(ProtoReader protoReader) {
            AnonymousClass0240 anonymousClass0240 = new AnonymousClass0240();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            anonymousClass0240.prop_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            anonymousClass0240.prop_name = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            anonymousClass0240.has_image = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 4:
                            anonymousClass0240.sale_prop_values.add(C025B.ADAPTER.decode(protoReader));
                            break;
                        case 5:
                            anonymousClass0240.size_show_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 6:
                            anonymousClass0240.sale_prop_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 7:
                            anonymousClass0240.has_extended_images = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 8:
                            anonymousClass0240.available_prop_type_display = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            anonymousClass0240.is_top_sku = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            anonymousClass0240.sale_prop_info = C5431029t.ADAPTER.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            anonymousClass0240.prop_base_name = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            anonymousClass0240.sub_product_property = C1C4P.ADAPTER.decode(protoReader);
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            anonymousClass0240.is_default_selected = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 14:
                            anonymousClass0240.prop_tool_tip_schema = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return anonymousClass0240;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(AnonymousClass0240 anonymousClass0240) {
            AnonymousClass0240 anonymousClass02402 = anonymousClass0240;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, anonymousClass02402.prop_id) + protoAdapter.encodedSizeWithTag(2, anonymousClass02402.prop_name);
            ProtoAdapter<Boolean> protoAdapter2 = ProtoAdapter.BOOL;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(3, anonymousClass02402.has_image) + C025B.ADAPTER.asRepeated().encodedSizeWithTag(4, anonymousClass02402.sale_prop_values);
            ProtoAdapter<Integer> protoAdapter3 = ProtoAdapter.INT32;
            return iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(5, anonymousClass02402.size_show_type) + protoAdapter3.encodedSizeWithTag(6, anonymousClass02402.sale_prop_type) + protoAdapter2.encodedSizeWithTag(7, anonymousClass02402.has_extended_images) + protoAdapter.encodedSizeWithTag(8, anonymousClass02402.available_prop_type_display) + protoAdapter2.encodedSizeWithTag(9, anonymousClass02402.is_top_sku) + C5431029t.ADAPTER.encodedSizeWithTag(10, anonymousClass02402.sale_prop_info) + protoAdapter.encodedSizeWithTag(11, anonymousClass02402.prop_base_name) + C1C4P.ADAPTER.encodedSizeWithTag(12, anonymousClass02402.sub_product_property) + protoAdapter2.encodedSizeWithTag(13, anonymousClass02402.is_default_selected) + protoAdapter.encodedSizeWithTag(14, anonymousClass02402.prop_tool_tip_schema) + anonymousClass02402.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, AnonymousClass0240 anonymousClass0240) {
        }
    };
    public String available_prop_type_display;
    public Boolean has_extended_images;
    public Boolean has_image;
    public Boolean is_default_selected;
    public Boolean is_top_sku;
    public String prop_base_name;
    public String prop_id;
    public String prop_name;
    public String prop_tool_tip_schema;
    public C5431029t sale_prop_info;
    public Integer sale_prop_type;
    public List<C025B> sale_prop_values;
    public Integer size_show_type;
    public C1C4P sub_product_property;

    public AnonymousClass0240() {
        super(ADAPTER, ByteString.EMPTY);
        this.sale_prop_values = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C578902Nn newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
