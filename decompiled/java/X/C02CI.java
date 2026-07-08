package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02CI, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02CI extends Message<C02CI, C02M4> {
    public static final ProtoAdapter<C02CI> ADAPTER = new ProtoAdapter<C02CI>() { // from class: X.025K
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02CI decode(ProtoReader protoReader) {
            C02CI c02ci = new C02CI();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c02ci.card_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 2:
                            c02ci.card_id = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 3:
                            c02ci.card_material = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c02ci.card_source = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 5:
                            c02ci.card_impl_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 6:
                            c02ci.lynx_template = C548302Bt.ADAPTER.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02ci;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02CI c02ci) {
            C02CI c02ci2 = c02ci;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            return protoAdapter.encodedSizeWithTag(1, c02ci2.card_type) + ProtoAdapter.INT64.encodedSizeWithTag(2, c02ci2.card_id) + ProtoAdapter.STRING.encodedSizeWithTag(3, c02ci2.card_material) + protoAdapter.encodedSizeWithTag(4, c02ci2.card_source) + protoAdapter.encodedSizeWithTag(5, c02ci2.card_impl_type) + C548302Bt.ADAPTER.encodedSizeWithTag(6, c02ci2.lynx_template) + c02ci2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02CI c02ci) {
            C02CI c02ci2 = c02ci;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            protoAdapter.encodeWithTag(protoWriter, 1, c02ci2.card_type);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, c02ci2.card_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, c02ci2.card_material);
            protoAdapter.encodeWithTag(protoWriter, 4, c02ci2.card_source);
            protoAdapter.encodeWithTag(protoWriter, 5, c02ci2.card_impl_type);
            C548302Bt.ADAPTER.encodeWithTag(protoWriter, 6, c02ci2.lynx_template);
            protoWriter.writeBytes(c02ci2.unknownFields());
        }
    };
    public Long card_id;
    public Integer card_impl_type;
    public String card_material;
    public Integer card_source;
    public Integer card_type;
    public C548302Bt lynx_template;

    public C02CI() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02M4 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
