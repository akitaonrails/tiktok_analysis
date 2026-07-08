package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.0pau, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1517580pau extends Message<C1517580pau, C1517590pav> {
    public static final ProtoAdapter<C1517580pau> ADAPTER = new ProtoAdapter<C1517580pau>() { // from class: X.0pat
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1517580pau decode(ProtoReader protoReader) {
            C1517580pau c1517580pau = new C1517580pau();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                    } else {
                        c1517580pau.viewer_exempt_from_content_reuse_setting = ProtoAdapter.BOOL.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1517580pau;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1517580pau c1517580pau) {
            C1517580pau c1517580pau2 = c1517580pau;
            return ProtoAdapter.BOOL.encodedSizeWithTag(1, c1517580pau2.viewer_exempt_from_content_reuse_setting) + c1517580pau2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1517580pau c1517580pau) {
            C1517580pau c1517580pau2 = c1517580pau;
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, c1517580pau2.viewer_exempt_from_content_reuse_setting);
            protoWriter.writeBytes(c1517580pau2.unknownFields());
        }
    };
    public Boolean viewer_exempt_from_content_reuse_setting;

    public C1517580pau() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C1517590pav newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
