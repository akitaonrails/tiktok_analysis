package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.0pal, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1517490pal extends Message<C1517490pal, C1517500pam> {
    public static final ProtoAdapter<C1517490pal> ADAPTER = new ProtoAdapter<C1517490pal>() { // from class: X.0pak
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1517490pal decode(ProtoReader protoReader) {
            C1517490pal c1517490pal = new C1517490pal();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                    } else {
                        c1517490pal.timestamp = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1517490pal;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1517490pal c1517490pal) {
            C1517490pal c1517490pal2 = c1517490pal;
            return ProtoAdapter.INT64.encodedSizeWithTag(1, c1517490pal2.timestamp) + c1517490pal2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1517490pal c1517490pal) {
            C1517490pal c1517490pal2 = c1517490pal;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, c1517490pal2.timestamp);
            protoWriter.writeBytes(c1517490pal2.unknownFields());
        }
    };
    public Long timestamp;

    public C1517490pal() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C1517500pam newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
