package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02GO, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02GO extends Message<C02GO, C577902Nd> {
    public static final ProtoAdapter<C02GO> ADAPTER = new ProtoAdapter<C02GO>() { // from class: X.02Ap
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02GO decode(ProtoReader protoReader) {
            C02GO c02go = new C02GO();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 4) {
                                if (iNextTag != 5) {
                                    protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                } else {
                                    c02go.prop_value = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c02go.prop_value_id = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c02go.prop_name = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c02go.prop_id = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02go;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02GO c02go) {
            C02GO c02go2 = c02go;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c02go2.prop_id) + protoAdapter.encodedSizeWithTag(2, c02go2.prop_name) + protoAdapter.encodedSizeWithTag(4, c02go2.prop_value_id) + protoAdapter.encodedSizeWithTag(5, c02go2.prop_value) + c02go2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02GO c02go) {
        }
    };
    public String prop_id;
    public String prop_name;
    public String prop_value;
    public String prop_value_id;

    public C02GO() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C577902Nd newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
