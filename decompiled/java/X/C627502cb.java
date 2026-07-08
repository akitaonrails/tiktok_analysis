package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02cb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C627502cb extends Message<C627502cb, C627602cc> {
    public static final ProtoAdapter<C627502cb> ADAPTER = new ProtoAdapter<C627502cb>() { // from class: X.02ca
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C627502cb decode(ProtoReader protoReader) {
            C627502cb c627502cb = new C627502cb();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c627502cb.duration_ms = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c627502cb.start_ms = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c627502cb;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C627502cb c627502cb) {
            C627502cb c627502cb2 = c627502cb;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            return protoAdapter.encodedSizeWithTag(1, c627502cb2.start_ms) + protoAdapter.encodedSizeWithTag(2, c627502cb2.duration_ms) + c627502cb2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C627502cb c627502cb) {
            C627502cb c627502cb2 = c627502cb;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 1, c627502cb2.start_ms);
            protoAdapter.encodeWithTag(protoWriter, 2, c627502cb2.duration_ms);
            protoWriter.writeBytes(c627502cb2.unknownFields());
        }
    };
    public Long duration_ms;
    public Long start_ms;

    public C627502cb() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C627602cc newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
