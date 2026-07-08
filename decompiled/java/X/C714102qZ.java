package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02qZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C714102qZ extends Message<C714102qZ, C714202qa> {
    public static final ProtoAdapter<C714102qZ> ADAPTER = new ProtoAdapter<C714102qZ>() { // from class: X.02qY
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C714102qZ decode(ProtoReader protoReader) {
            C714202qa c714202qa = new C714202qa();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 2) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c714202qa.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c714202qa.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c714202qa.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C714102qZ c714102qZ) {
            C714102qZ c714102qZ2 = c714102qZ;
            return ProtoAdapter.STRING.encodedSizeWithTag(2, c714102qZ2.impr_id) + c714102qZ2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C714102qZ c714102qZ) {
            C714102qZ c714102qZ2 = c714102qZ;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, c714102qZ2.impr_id);
            protoWriter.writeBytes(c714102qZ2.unknownFields());
        }
    };
    public String impr_id;

    public C714102qZ() {
    }

    @Override // com.squareup.wire.Message
    public C714202qa newBuilder() {
        return null;
    }

    public C714102qZ(String str) {
        this(str, ByteString.EMPTY);
    }

    public C714102qZ(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.impr_id = str;
    }
}
