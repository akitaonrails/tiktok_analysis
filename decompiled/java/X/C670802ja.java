package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02ja, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C670802ja extends Message<C670802ja, C670902jb> {
    public static final ProtoAdapter<C670802ja> ADAPTER = new ProtoAdapter<C670802ja>() { // from class: X.02jZ
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C670802ja decode(ProtoReader protoReader) {
            C670802ja c670802ja = new C670802ja();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                    } else {
                        c670802ja.user_now_status = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c670802ja;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C670802ja c670802ja) {
            C670802ja c670802ja2 = c670802ja;
            return ProtoAdapter.INT32.encodedSizeWithTag(1, c670802ja2.user_now_status) + c670802ja2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C670802ja c670802ja) {
            C670802ja c670802ja2 = c670802ja;
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, c670802ja2.user_now_status);
            protoWriter.writeBytes(c670802ja2.unknownFields());
        }
    };
    public Integer user_now_status;

    public C670802ja() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C670902jb newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
