package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import java.util.Map;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C48, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C48 extends Message<C1C48, C1C4A> {
    public static final ProtoAdapter<C1C48> ADAPTER = new ProtoAdapter<C1C48>() { // from class: X.1C49
        public final ProtoAdapter<Map<String, C1C4B>> LIZ;

        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            this.LIZ = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, C1C4B.ADAPTER);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1C48 decode(ProtoReader protoReader) {
            C1C4A c1c4a = new C1C4A();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c1c4a.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c1c4a.LIZLLL.putAll(this.LIZ.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1c4a.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1C48 c1c48) {
            C1C48 c1c482 = c1c48;
            return this.LIZ.encodedSizeWithTag(1, c1c482.position_map) + c1c482.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1C48 redact(C1C48 c1c48) {
            C1C4A c1c4aNewBuilder = c1c48.newBuilder();
            C1516540pZE.LJIIJ(c1c4aNewBuilder.LIZLLL, C1C4B.ADAPTER);
            c1c4aNewBuilder.clearUnknownFields();
            return c1c4aNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1C48 c1c48) {
            C1C48 c1c482 = c1c48;
            this.LIZ.encodeWithTag(protoWriter, 1, c1c482.position_map);
            protoWriter.writeBytes(c1c482.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicMicPositionInfo#ADAPTER", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final Map<String, C1C4B> position_map;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.position_map.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1C4A newBuilder() {
        C1C4A c1c4a = new C1C4A();
        c1c4a.LIZLLL = C1516540pZE.LIZLLL("position_map", this.position_map);
        c1c4a.addUnknownFields(unknownFields());
        return c1c4a;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.position_map.isEmpty()) {
            sb.append(", position_map=");
            sb.append(this.position_map);
        }
        sb.replace(0, 2, "FuncParamsX48a3693dbad8b2fe{");
        sb.append('}');
        return sb.toString();
    }

    public C1C48(Map<String, C1C4B> map) {
        this(map, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1C48)) {
            return false;
        }
        C1C48 c1c48 = (C1C48) obj;
        if (unknownFields().equals(c1c48.unknownFields()) && this.position_map.equals(c1c48.position_map)) {
            return true;
        }
        return false;
    }

    public C1C48(Map<String, C1C4B> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.position_map = C1516540pZE.LJI("position_map", map);
    }
}
