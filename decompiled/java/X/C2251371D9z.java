package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1D9z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2251371D9z extends Message<C2251371D9z, C2251361D9y> {
    public static final ProtoAdapter<C2251371D9z> ADAPTER = new ProtoAdapter<C2251371D9z>() { // from class: X.1D9x
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2251371D9z decode(ProtoReader protoReader) {
            C2251361D9y c2251361D9y = new C2251361D9y();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2251361D9y.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c2251361D9y.LJ = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c2251361D9y.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2251361D9y.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2251371D9z c2251371D9z) {
            C2251371D9z c2251371D9z2 = c2251371D9z;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c2251371D9z2.signal_name) + protoAdapter.encodedSizeWithTag(2, c2251371D9z2.signal_value) + c2251371D9z2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2251371D9z c2251371D9z) {
            C2251371D9z c2251371D9z2 = c2251371D9z;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c2251371D9z2.signal_name);
            protoAdapter.encodeWithTag(protoWriter, 2, c2251371D9z2.signal_value);
            protoWriter.writeBytes(c2251371D9z2.unknownFields());
        }
    };
    public String signal_name;
    public String signal_value;

    @Override // com.squareup.wire.Message
    public C2251361D9y newBuilder() {
        return null;
    }

    public C2251371D9z(String str, String str2) {
        this(str, str2, ByteString.EMPTY);
    }

    public C2251371D9z(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.signal_name = str;
        this.signal_value = str2;
    }
}
