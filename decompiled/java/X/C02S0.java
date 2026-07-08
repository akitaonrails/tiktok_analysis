package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02S0, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02S0 extends Message<C02S0, C02S4> {
    public static final ProtoAdapter<C02S0> ADAPTER = new ProtoAdapter<C02S0>() { // from class: X.02Rz
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02S0 decode(ProtoReader protoReader) {
            C02S0 c02s0 = new C02S0();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c02s0.show_strategy = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c02s0.component_key = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02s0;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02S0 c02s0) {
            C02S0 c02s02 = c02s0;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c02s02.component_key) + ProtoAdapter.INT32.encodedSizeWithTag(2, c02s02.show_strategy) + c02s02.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02S0 c02s0) {
            C02S0 c02s02 = c02s0;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c02s02.component_key);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, c02s02.show_strategy);
            protoWriter.writeBytes(c02s02.unknownFields());
        }
    };
    public String component_key;
    public Integer show_strategy;

    public C02S0() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02S4 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
