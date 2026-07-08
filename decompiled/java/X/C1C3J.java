package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C3J, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C3J extends Message<C1C3J, C1C3K> {
    public static final ProtoAdapter<C1C3J> ADAPTER = new ProtoAdapter<C1C3J>() { // from class: X.1C3I
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1C3J decode(ProtoReader protoReader) {
            C1C3J c1c3j = new C1C3J();
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
                                    c1c3j.is_retention = ProtoAdapter.BOOL.decode(protoReader);
                                }
                            } else {
                                c1c3j.load_timeout_ms = ProtoAdapter.INT64.decode(protoReader);
                            }
                        } else {
                            c1c3j.schema = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c1c3j.data = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1c3j;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1C3J c1c3j) {
            C1C3J c1c3j2 = c1c3j;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c1c3j2.data) + protoAdapter.encodedSizeWithTag(2, c1c3j2.schema) + ProtoAdapter.INT64.encodedSizeWithTag(4, c1c3j2.load_timeout_ms) + ProtoAdapter.BOOL.encodedSizeWithTag(5, c1c3j2.is_retention) + c1c3j2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C1C3J c1c3j) {
        }
    };
    public String data;
    public Boolean is_retention;
    public Long load_timeout_ms;
    public String schema;

    public C1C3J() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C1C3K newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
