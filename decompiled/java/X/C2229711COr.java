package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1COr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2229711COr extends Message<C2229711COr, C2229721COs> {
    public static final ProtoAdapter<C2229711COr> ADAPTER = new ProtoAdapter<C2229711COr>() { // from class: X.1COq
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2229711COr decode(ProtoReader protoReader) {
            C2229721COs c2229721COs = new C2229721COs();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2229721COs.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c2229721COs.LJ = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c2229721COs.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2229721COs.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2229711COr c2229711COr) {
            C2229711COr c2229711COr2 = c2229711COr;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c2229711COr2.key) + protoAdapter.encodedSizeWithTag(2, c2229711COr2.reason) + c2229711COr2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2229711COr c2229711COr) {
            C2229711COr c2229711COr2 = c2229711COr;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c2229711COr2.key);
            protoAdapter.encodeWithTag(protoWriter, 2, c2229711COr2.reason);
            protoWriter.writeBytes(c2229711COr2.unknownFields());
        }
    };
    public String key;
    public String reason;

    @Override // com.squareup.wire.Message
    public C2229721COs newBuilder() {
        return null;
    }

    public C2229711COr(String str, String str2) {
        this(str, str2, ByteString.EMPTY);
    }

    public C2229711COr(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.key = str;
        this.reason = str2;
    }
}
