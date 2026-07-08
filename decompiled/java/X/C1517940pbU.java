package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.0pbU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1517940pbU extends Message<C1517940pbU, C1517950pbV> {
    public static final ProtoAdapter<C1517940pbU> ADAPTER = new ProtoAdapter<C1517940pbU>() { // from class: X.0pbT
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1517940pbU decode(ProtoReader protoReader) {
            C1517940pbU c1517940pbU = new C1517940pbU();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 2) {
                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                    } else {
                        c1517940pbU.impr_id = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1517940pbU;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1517940pbU c1517940pbU) {
            C1517940pbU c1517940pbU2 = c1517940pbU;
            return ProtoAdapter.STRING.encodedSizeWithTag(2, c1517940pbU2.impr_id) + c1517940pbU2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1517940pbU c1517940pbU) {
            C1517940pbU c1517940pbU2 = c1517940pbU;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, c1517940pbU2.impr_id);
            protoWriter.writeBytes(c1517940pbU2.unknownFields());
        }
    };
    public String impr_id;

    public C1517940pbU() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C1517950pbV newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
