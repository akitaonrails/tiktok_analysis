package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.0r95, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1577210r95 extends Message<C1577210r95, C1577230r97> {
    public static final ProtoAdapter<C1577210r95> ADAPTER = new ProtoAdapter<C1577210r95>() { // from class: X.0r96
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1577210r95 decode(ProtoReader protoReader) {
            C1577230r97 c1577230r97 = new C1577230r97();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c1577230r97.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c1577230r97.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1577230r97.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1577210r95 c1577210r95) {
            C1577210r95 c1577210r952 = c1577210r95;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c1577210r952.impr_id) + c1577210r952.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1577210r95 c1577210r95) {
            C1577210r95 c1577210r952 = c1577210r95;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c1577210r952.impr_id);
            protoWriter.writeBytes(c1577210r952.unknownFields());
        }
    };
    public String impr_id;

    @Override // com.squareup.wire.Message
    public C1577230r97 newBuilder() {
        return null;
    }

    public C1577210r95(String str) {
        this(str, ByteString.EMPTY);
    }

    public C1577210r95(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.impr_id = str;
    }
}
