package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import java.util.Map;
import okio.ByteString;

/* JADX INFO: renamed from: X.0pbH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1517810pbH extends Message<C1517810pbH, C1517830pbJ> {
    public static final ProtoAdapter<C1517810pbH> ADAPTER = new ProtoAdapter<C1517810pbH>() { // from class: X.0pbI
        public final ProtoAdapter<Map<String, String>> LIZ;

        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.LIZ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1517810pbH decode(ProtoReader protoReader) {
            C1517830pbJ c1517830pbJ = new C1517830pbJ();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c1517830pbJ.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c1517830pbJ.LIZLLL.putAll(this.LIZ.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1517830pbJ.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1517810pbH c1517810pbH) {
            C1517810pbH c1517810pbH2 = c1517810pbH;
            return this.LIZ.encodedSizeWithTag(1, c1517810pbH2.params) + c1517810pbH2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1517810pbH redact(C1517810pbH c1517810pbH) {
            C1517830pbJ c1517830pbJNewBuilder = c1517810pbH.newBuilder();
            c1517830pbJNewBuilder.clearUnknownFields();
            return c1517830pbJNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1517810pbH c1517810pbH) {
            C1517810pbH c1517810pbH2 = c1517810pbH;
            this.LIZ.encodeWithTag(protoWriter, 1, c1517810pbH2.params);
            protoWriter.writeBytes(c1517810pbH2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final Map<String, String> params;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.params.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1517830pbJ newBuilder() {
        C1517830pbJ c1517830pbJ = new C1517830pbJ();
        c1517830pbJ.LIZLLL = C1516540pZE.LIZLLL("params", this.params);
        c1517830pbJ.addUnknownFields(unknownFields());
        return c1517830pbJ;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.params.isEmpty()) {
            sb.append(", params=");
            sb.append(this.params);
        }
        sb.replace(0, 2, "FuncParamsX3c13d7a198bc3336{");
        sb.append('}');
        return sb.toString();
    }

    public C1517810pbH(Map<String, String> map) {
        this(map, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1517810pbH)) {
            return false;
        }
        C1517810pbH c1517810pbH = (C1517810pbH) obj;
        if (unknownFields().equals(c1517810pbH.unknownFields()) && this.params.equals(c1517810pbH.params)) {
            return true;
        }
        return false;
    }

    public C1517810pbH(Map<String, String> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.params = C1516540pZE.LJI("params", map);
    }
}
