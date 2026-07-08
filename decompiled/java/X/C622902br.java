package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02br, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C622902br extends Message<C622902br, C623002bs> {
    public static final ProtoAdapter<C622902br> ADAPTER = new ProtoAdapter<C622902br>() { // from class: X.02bq
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C622902br decode(ProtoReader protoReader) {
            C622902br c622902br = new C622902br();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c622902br.schema = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c622902br.action_type = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c622902br;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C622902br c622902br) {
            C622902br c622902br2 = c622902br;
            return ProtoAdapter.INT32.encodedSizeWithTag(1, c622902br2.action_type) + ProtoAdapter.STRING.encodedSizeWithTag(2, c622902br2.schema) + c622902br2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C622902br c622902br) {
            C622902br c622902br2 = c622902br;
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, c622902br2.action_type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, c622902br2.schema);
            protoWriter.writeBytes(c622902br2.unknownFields());
        }
    };
    public Integer action_type;
    public String schema;

    public C622902br() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C623002bs newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
