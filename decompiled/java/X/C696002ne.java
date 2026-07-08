package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02ne, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C696002ne extends Message<C696002ne, C696102nf> {
    public static final ProtoAdapter<C696002ne> ADAPTER = new ProtoAdapter<C696002ne>() { // from class: X.02nd
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C696002ne decode(ProtoReader protoReader) {
            C696002ne c696002ne = new C696002ne();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c696002ne.schema = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c696002ne.action_type = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c696002ne;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C696002ne c696002ne) {
            C696002ne c696002ne2 = c696002ne;
            return ProtoAdapter.INT32.encodedSizeWithTag(1, c696002ne2.action_type) + ProtoAdapter.STRING.encodedSizeWithTag(2, c696002ne2.schema) + c696002ne2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C696002ne c696002ne) {
            C696002ne c696002ne2 = c696002ne;
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, c696002ne2.action_type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, c696002ne2.schema);
            protoWriter.writeBytes(c696002ne2.unknownFields());
        }
    };
    public Integer action_type;
    public String schema;

    public C696002ne() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C696102nf newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
