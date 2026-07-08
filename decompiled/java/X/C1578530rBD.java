package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.0rBD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1578530rBD extends Message<C1578530rBD, C1578540rBE> {
    public static final ProtoAdapter<C1578530rBD> ADAPTER = new ProtoAdapter<C1578530rBD>() { // from class: X.0rBC
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1578530rBD decode(ProtoReader protoReader) {
            C1578530rBD c1578530rBD = new C1578530rBD();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                    } else {
                        c1578530rBD.impr_id = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1578530rBD;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1578530rBD c1578530rBD) {
            C1578530rBD c1578530rBD2 = c1578530rBD;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c1578530rBD2.impr_id) + c1578530rBD2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1578530rBD c1578530rBD) {
            C1578530rBD c1578530rBD2 = c1578530rBD;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c1578530rBD2.impr_id);
            protoWriter.writeBytes(c1578530rBD2.unknownFields());
        }
    };
    public String impr_id;

    public C1578530rBD() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C1578540rBE newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
