package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.0pbC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1517760pbC extends Message<C1517760pbC, C1517770pbD> {
    public static final ProtoAdapter<C1517760pbC> ADAPTER = new ProtoAdapter<C1517760pbC>() { // from class: X.0pbB
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1517760pbC decode(ProtoReader protoReader) {
            C1517760pbC c1517760pbC = new C1517760pbC();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                    } else {
                        c1517760pbC.id = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1517760pbC;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1517760pbC c1517760pbC) {
            C1517760pbC c1517760pbC2 = c1517760pbC;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c1517760pbC2.id) + c1517760pbC2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1517760pbC c1517760pbC) {
            C1517760pbC c1517760pbC2 = c1517760pbC;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c1517760pbC2.id);
            protoWriter.writeBytes(c1517760pbC2.unknownFields());
        }
    };
    public String id;

    public C1517760pbC() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C1517770pbD newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
