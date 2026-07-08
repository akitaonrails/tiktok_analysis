package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02SQ, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02SQ extends Message<C02SQ, C02ST> {
    public static final ProtoAdapter<C02SQ> ADAPTER = new ProtoAdapter<C02SQ>() { // from class: X.02SP
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02SQ decode(ProtoReader protoReader) {
            C02SQ c02sq = new C02SQ();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c02sq.val = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c02sq.key = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02sq;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02SQ c02sq) {
            C02SQ c02sq2 = c02sq;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c02sq2.key) + protoAdapter.encodedSizeWithTag(2, c02sq2.val) + c02sq2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02SQ c02sq) {
            C02SQ c02sq2 = c02sq;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c02sq2.key);
            protoAdapter.encodeWithTag(protoWriter, 2, c02sq2.val);
            protoWriter.writeBytes(c02sq2.unknownFields());
        }
    };
    public String key;
    public String val;

    public C02SQ() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02ST newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
