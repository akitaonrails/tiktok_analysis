package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02G1, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02G1 extends Message<C02G1, C574802Ly> {
    public static final ProtoAdapter<C02G1> ADAPTER = new ProtoAdapter<C02G1>() { // from class: X.028i
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02G1 decode(ProtoReader protoReader) {
            C02G1 c02g1 = new C02G1();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c02g1.action = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c02g1.text = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c02g1.offline_info_type = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02g1;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02G1 c02g1) {
            C02G1 c02g12 = c02g1;
            int iEncodedSizeWithTag = ProtoAdapter.INT32.encodedSizeWithTag(1, c02g12.offline_info_type);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c02g12.text) + protoAdapter.encodedSizeWithTag(3, c02g12.action) + c02g12.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02G1 c02g1) {
            C02G1 c02g12 = c02g1;
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, c02g12.offline_info_type);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 2, c02g12.text);
            protoAdapter.encodeWithTag(protoWriter, 3, c02g12.action);
            protoWriter.writeBytes(c02g12.unknownFields());
        }
    };
    public String action;
    public Integer offline_info_type;
    public String text;

    public C02G1() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C574802Ly newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
