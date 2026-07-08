package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02El, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C555302El extends Message<C555302El, C574202Ls> {
    public static final ProtoAdapter<C555302El> ADAPTER = new ProtoAdapter<C555302El>() { // from class: X.026t
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C555302El decode(ProtoReader protoReader) {
            C555302El c555302El = new C555302El();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c555302El.action_type = ProtoAdapter.INT32.decode(protoReader);
                            }
                        } else {
                            c555302El.schema = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c555302El.icon = C673002jw.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c555302El;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C555302El c555302El) {
            C555302El c555302El2 = c555302El;
            return C673002jw.ADAPTER.encodedSizeWithTag(1, c555302El2.icon) + ProtoAdapter.STRING.encodedSizeWithTag(2, c555302El2.schema) + ProtoAdapter.INT32.encodedSizeWithTag(3, c555302El2.action_type) + c555302El2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C555302El c555302El) {
            C555302El c555302El2 = c555302El;
            C673002jw.ADAPTER.encodeWithTag(protoWriter, 1, c555302El2.icon);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, c555302El2.schema);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, c555302El2.action_type);
            protoWriter.writeBytes(c555302El2.unknownFields());
        }
    };
    public Integer action_type;
    public C673002jw icon;
    public String schema;

    public C555302El() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C574202Ls newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
