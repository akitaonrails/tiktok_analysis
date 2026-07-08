package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02ii, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C665402ii extends Message<C665402ii, C665502ij> {
    public static final ProtoAdapter<C665402ii> ADAPTER = new ProtoAdapter<C665402ii>() { // from class: X.02ih
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C665402ii decode(ProtoReader protoReader) {
            C665402ii c665402ii = new C665402ii();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                    } else {
                        c665402ii.expire_time = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c665402ii;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C665402ii c665402ii) {
            C665402ii c665402ii2 = c665402ii;
            return ProtoAdapter.INT64.encodedSizeWithTag(1, c665402ii2.expire_time) + c665402ii2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C665402ii c665402ii) {
            C665402ii c665402ii2 = c665402ii;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, c665402ii2.expire_time);
            protoWriter.writeBytes(c665402ii2.unknownFields());
        }
    };
    public Long expire_time;

    public C665402ii() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C665502ij newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
