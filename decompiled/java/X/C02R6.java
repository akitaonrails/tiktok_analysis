package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02R6, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02R6 extends Message<C02R6, C02RB> {
    public static final ProtoAdapter<C02R6> ADAPTER = new ProtoAdapter<C02R6>() { // from class: X.02R5
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02R6 decode(ProtoReader protoReader) {
            C02R6 c02r6 = new C02R6();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c02r6.slot_config = C02R4.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c02r6.raw_data = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02r6;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02R6 c02r6) {
            C02R6 c02r62 = c02r6;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c02r62.raw_data) + C02R4.ADAPTER.encodedSizeWithTag(2, c02r62.slot_config) + c02r62.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02R6 c02r6) {
            C02R6 c02r62 = c02r6;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c02r62.raw_data);
            C02R4.ADAPTER.encodeWithTag(protoWriter, 2, c02r62.slot_config);
            protoWriter.writeBytes(c02r62.unknownFields());
        }
    };
    public String raw_data;
    public C02R4 slot_config;

    public C02R6() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02RB newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
