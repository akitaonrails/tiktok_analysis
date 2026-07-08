package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02da, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C633602da extends Message<C633602da, C633702db> {
    public static final ProtoAdapter<C633602da> ADAPTER = new ProtoAdapter<C633602da>() { // from class: X.02dZ
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C633602da decode(ProtoReader protoReader) {
            C633602da c633602da = new C633602da();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c633602da.schema = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c633602da.suffix = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c633602da;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C633602da c633602da) {
            C633602da c633602da2 = c633602da;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c633602da2.suffix) + protoAdapter.encodedSizeWithTag(2, c633602da2.schema) + c633602da2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C633602da c633602da) {
            C633602da c633602da2 = c633602da;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c633602da2.suffix);
            protoAdapter.encodeWithTag(protoWriter, 2, c633602da2.schema);
            protoWriter.writeBytes(c633602da2.unknownFields());
        }
    };
    public String schema;
    public String suffix;

    public C633602da() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C633702db newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
