package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02dU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C633002dU extends Message<C633002dU, C633102dV> {
    public static final ProtoAdapter<C633002dU> ADAPTER = new ProtoAdapter<C633002dU>() { // from class: X.02dT
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C633002dU decode(ProtoReader protoReader) {
            C633002dU c633002dU = new C633002dU();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c633002dU.body = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c633002dU.title = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c633002dU;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C633002dU c633002dU) {
            C633002dU c633002dU2 = c633002dU;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c633002dU2.title) + protoAdapter.encodedSizeWithTag(2, c633002dU2.body) + c633002dU2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C633002dU c633002dU) {
            C633002dU c633002dU2 = c633002dU;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c633002dU2.title);
            protoAdapter.encodeWithTag(protoWriter, 2, c633002dU2.body);
            protoWriter.writeBytes(c633002dU2.unknownFields());
        }
    };
    public String body;
    public String title;

    public C633002dU() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C633102dV newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
