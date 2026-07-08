package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02BD, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02BD extends Message<C02BD, C580302Ob> {
    public static final ProtoAdapter<C02BD> ADAPTER = new ProtoAdapter<C02BD>() { // from class: X.0277
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02BD decode(ProtoReader protoReader) {
            C02BD c02bd = new C02BD();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c02bd.cvv_length.add(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 2:
                            c02bd.card_brand_regex = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c02bd.card_brand_length.add(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 4:
                            c02bd.card_brand_display_name = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c02bd.card_brand = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c02bd.payment_method_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02bd;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02BD c02bd) {
            C02BD c02bd2 = c02bd;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            int iEncodedSizeWithTag = protoAdapter.asRepeated().encodedSizeWithTag(1, c02bd2.cvv_length);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(2, c02bd2.card_brand_regex) + protoAdapter.asRepeated().encodedSizeWithTag(3, c02bd2.card_brand_length) + protoAdapter2.encodedSizeWithTag(4, c02bd2.card_brand_display_name) + protoAdapter2.encodedSizeWithTag(5, c02bd2.card_brand) + protoAdapter2.encodedSizeWithTag(6, c02bd2.payment_method_id) + c02bd2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02BD c02bd) {
        }
    };
    public String card_brand;
    public String card_brand_display_name;
    public List<Integer> card_brand_length;
    public String card_brand_regex;
    public List<Integer> cvv_length;
    public String payment_method_id;

    public C02BD() {
        super(ADAPTER, ByteString.EMPTY);
        this.cvv_length = C1516540pZE.LJIIIIZZ();
        this.card_brand_length = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C580302Ob newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
