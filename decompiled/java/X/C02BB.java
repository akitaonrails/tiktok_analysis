package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02BB, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02BB extends Message<C02BB, C576602Mq> {
    public static final ProtoAdapter<C02BB> ADAPTER = new ProtoAdapter<C02BB>() { // from class: X.026R
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02BB decode(ProtoReader protoReader) {
            C02BB c02bb = new C02BB();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c02bb.insurance_protection_code = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c02bb.description = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c02bb.what_is_covered = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c02bb.what_is_covered_url = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c02bb.insurance_product_infos.add(AnonymousClass0226.ADAPTER.decode(protoReader));
                            break;
                        case 6:
                            c02bb.insurance_protection_type = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02bb;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02BB c02bb) {
            C02BB c02bb2 = c02bb;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c02bb2.insurance_protection_code) + protoAdapter.encodedSizeWithTag(2, c02bb2.description) + protoAdapter.encodedSizeWithTag(3, c02bb2.what_is_covered) + protoAdapter.encodedSizeWithTag(4, c02bb2.what_is_covered_url) + AnonymousClass0226.ADAPTER.asRepeated().encodedSizeWithTag(5, c02bb2.insurance_product_infos) + protoAdapter.encodedSizeWithTag(6, c02bb2.insurance_protection_type) + c02bb2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02BB c02bb) {
        }
    };
    public String description;
    public List<AnonymousClass0226> insurance_product_infos;
    public String insurance_protection_code;
    public String insurance_protection_type;
    public String what_is_covered;
    public String what_is_covered_url;

    public C02BB() {
        super(ADAPTER, ByteString.EMPTY);
        this.insurance_product_infos = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C576602Mq newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
