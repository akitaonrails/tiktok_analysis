package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02SW, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02SW extends Message<C02SW, C590602Sa> {
    public static final ProtoAdapter<C02SW> ADAPTER = new ProtoAdapter<C02SW>() { // from class: X.02SV
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02SW decode(ProtoReader protoReader) {
            C02SW c02sw = new C02SW();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c02sw.extra = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c02sw.type = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02sw;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02SW c02sw) {
            C02SW c02sw2 = c02sw;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c02sw2.type) + protoAdapter.encodedSizeWithTag(2, c02sw2.extra) + c02sw2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02SW c02sw) {
            C02SW c02sw2 = c02sw;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c02sw2.type);
            protoAdapter.encodeWithTag(protoWriter, 2, c02sw2.extra);
            protoWriter.writeBytes(c02sw2.unknownFields());
        }
    };
    public String extra;
    public String type;

    public C02SW() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C590602Sa newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
