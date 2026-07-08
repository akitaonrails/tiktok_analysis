package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02XF, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02XF extends Message<C02XF, C02XG> {
    public static final ProtoAdapter<C02XF> ADAPTER = new ProtoAdapter<C02XF>() { // from class: X.02XE
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02XF decode(ProtoReader protoReader) {
            C02XF c02xf = new C02XF();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c02xf.text = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c02xf.schema = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c02xf.head_text = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02xf;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02XF c02xf) {
            C02XF c02xf2 = c02xf;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c02xf2.head_text) + protoAdapter.encodedSizeWithTag(2, c02xf2.schema) + protoAdapter.encodedSizeWithTag(3, c02xf2.text) + c02xf2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02XF c02xf) {
        }
    };
    public String head_text;
    public String schema;
    public String text;

    public C02XF() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02XG newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
