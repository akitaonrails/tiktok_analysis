package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C00, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C00 extends Message<C1C00, C1C01> {
    public static final ProtoAdapter<C1C00> ADAPTER = new ProtoAdapter<C1C00>() { // from class: X.1Bzz
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1C00 decode(ProtoReader protoReader) {
            C1C00 c1c00 = new C1C00();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c1c00.end = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c1c00.start = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1c00;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1C00 c1c00) {
            C1C00 c1c002 = c1c00;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            return protoAdapter.encodedSizeWithTag(1, c1c002.start) + protoAdapter.encodedSizeWithTag(2, c1c002.end) + c1c002.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1C00 c1c00) {
            C1C00 c1c002 = c1c00;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            protoAdapter.encodeWithTag(protoWriter, 1, c1c002.start);
            protoAdapter.encodeWithTag(protoWriter, 2, c1c002.end);
            protoWriter.writeBytes(c1c002.unknownFields());
        }
    };
    public Integer end;
    public Integer start;

    public C1C00() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C1C01 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
