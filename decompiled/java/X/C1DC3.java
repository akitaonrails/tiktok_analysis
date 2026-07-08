package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1DC3, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DC3 extends Message<C1DC3, C1DC4> {
    public static final ProtoAdapter<C1DC3> ADAPTER = new ProtoAdapter<C1DC3>() { // from class: X.1DC2
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1DC3 decode(ProtoReader protoReader) {
            C1DC4 c1dc4 = new C1DC4();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                c1dc4.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                c1dc4.LJFF = C1DCW.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c1dc4.LJ = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c1dc4.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1dc4.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1DC3 c1dc3) {
            C1DC3 c1dc32 = c1dc3;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c1dc32.poi_id) + protoAdapter.encodedSizeWithTag(2, c1dc32.distance) + C1DCW.ADAPTER.encodedSizeWithTag(3, c1dc32.multi_action) + c1dc32.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1DC3 c1dc3) {
            C1DC3 c1dc32 = c1dc3;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c1dc32.poi_id);
            protoAdapter.encodeWithTag(protoWriter, 2, c1dc32.distance);
            C1DCW.ADAPTER.encodeWithTag(protoWriter, 3, c1dc32.multi_action);
            protoWriter.writeBytes(c1dc32.unknownFields());
        }
    };
    public String distance;
    public C1DCW multi_action;
    public String poi_id;

    @Override // com.squareup.wire.Message
    public C1DC4 newBuilder() {
        return null;
    }

    public C1DC3(String str, String str2, C1DCW c1dcw) {
        this(str, str2, c1dcw, ByteString.EMPTY);
    }

    public C1DC3(String str, String str2, C1DCW c1dcw, ByteString byteString) {
        super(ADAPTER, byteString);
        this.poi_id = str;
        this.distance = str2;
        this.multi_action = c1dcw;
    }
}
