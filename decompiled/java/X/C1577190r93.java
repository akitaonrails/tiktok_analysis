package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.0r93, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1577190r93 extends Message<C1577190r93, C1577200r94> {
    public static final ProtoAdapter<C1577190r93> ADAPTER = new ProtoAdapter<C1577190r93>() { // from class: X.0r8w
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1577190r93 decode(ProtoReader protoReader) {
            C1577200r94 c1577200r94 = new C1577200r94();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c1577200r94.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c1577200r94.LJ = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c1577200r94.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1577200r94.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1577190r93 c1577190r93) {
            C1577190r93 c1577190r932 = c1577190r93;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c1577190r932.banner_url) + protoAdapter.encodedSizeWithTag(2, c1577190r932.landing_url) + c1577190r932.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1577190r93 c1577190r93) {
            C1577190r93 c1577190r932 = c1577190r93;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c1577190r932.banner_url);
            protoAdapter.encodeWithTag(protoWriter, 2, c1577190r932.landing_url);
            protoWriter.writeBytes(c1577190r932.unknownFields());
        }
    };
    public String banner_url;
    public String landing_url;

    @Override // com.squareup.wire.Message
    public C1577200r94 newBuilder() {
        return null;
    }

    public C1577190r93(String str, String str2) {
        this(str, str2, ByteString.EMPTY);
    }

    public C1577190r93(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.banner_url = str;
        this.landing_url = str2;
    }
}
