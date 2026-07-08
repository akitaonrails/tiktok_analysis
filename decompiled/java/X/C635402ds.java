package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02ds, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C635402ds extends Message<C635402ds, C635502dt> {
    public static final ProtoAdapter<C635402ds> ADAPTER = new ProtoAdapter<C635402ds>() { // from class: X.02dr
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C635402ds decode(ProtoReader protoReader) {
            C635402ds c635402ds = new C635402ds();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 5) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c635402ds.business_id = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c635402ds.component_key = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c635402ds;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C635402ds c635402ds) {
            C635402ds c635402ds2 = c635402ds;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c635402ds2.component_key) + protoAdapter.encodedSizeWithTag(5, c635402ds2.business_id) + c635402ds2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C635402ds c635402ds) {
            C635402ds c635402ds2 = c635402ds;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c635402ds2.component_key);
            protoAdapter.encodeWithTag(protoWriter, 5, c635402ds2.business_id);
            protoWriter.writeBytes(c635402ds2.unknownFields());
        }
    };
    public String business_id;
    public String component_key;

    public C635402ds() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C635502dt newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
