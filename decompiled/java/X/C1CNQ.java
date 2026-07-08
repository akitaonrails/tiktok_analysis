package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CNQ, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CNQ extends Message<C1CNQ, C1CNR> {
    public static final ProtoAdapter<C1CNQ> ADAPTER = new ProtoAdapter<C1CNQ>() { // from class: X.1CNP
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CNQ decode(ProtoReader protoReader) {
            C1CNR c1cnr = new C1CNR();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c1cnr.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c1cnr.LIZLLL = C1CNM.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cnr.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CNQ c1cnq) {
            C1CNQ c1cnq2 = c1cnq;
            return C1CNM.ADAPTER.encodedSizeWithTag(1, c1cnq2.component_config) + c1cnq2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CNQ c1cnq) {
            C1CNQ c1cnq2 = c1cnq;
            C1CNM.ADAPTER.encodeWithTag(protoWriter, 1, c1cnq2.component_config);
            protoWriter.writeBytes(c1cnq2.unknownFields());
        }
    };
    public C1CNM component_config;

    @Override // com.squareup.wire.Message
    public C1CNR newBuilder() {
        return null;
    }

    public C1CNQ(C1CNM c1cnm) {
        this(c1cnm, ByteString.EMPTY);
    }

    public C1CNQ(C1CNM c1cnm, ByteString byteString) {
        super(ADAPTER, byteString);
        this.component_config = c1cnm;
    }
}
