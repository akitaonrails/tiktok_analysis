package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import java.util.Map;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CGw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2227681CGw extends Message<C2227681CGw, C2227701CGy> {
    public static final ProtoAdapter<C2227681CGw> ADAPTER = new ProtoAdapter<C2227681CGw>() { // from class: X.1CGx
        public final ProtoAdapter<Map<String, String>> LIZ;

        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.LIZ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2227681CGw decode(ProtoReader protoReader) {
            C2227701CGy c2227701CGy = new C2227701CGy();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2227701CGy.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c2227701CGy.LJ.putAll(this.LIZ.decode(protoReader));
                        }
                    } else {
                        c2227701CGy.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2227701CGy.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2227681CGw c2227681CGw) {
            C2227681CGw c2227681CGw2 = c2227681CGw;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c2227681CGw2.resource_id) + this.LIZ.encodedSizeWithTag(2, c2227681CGw2.extra) + c2227681CGw2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2227681CGw redact(C2227681CGw c2227681CGw) {
            C2227701CGy c2227701CGyNewBuilder = c2227681CGw.newBuilder();
            c2227701CGyNewBuilder.clearUnknownFields();
            return c2227701CGyNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2227681CGw c2227681CGw) {
            C2227681CGw c2227681CGw2 = c2227681CGw;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c2227681CGw2.resource_id);
            this.LIZ.encodeWithTag(protoWriter, 2, c2227681CGw2.extra);
            protoWriter.writeBytes(c2227681CGw2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final Map<String, String> extra;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String resource_id;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        String str = this.resource_id;
        int iHashCode2 = ((iHashCode + (str != null ? str.hashCode() : 0)) * 37) + this.extra.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public C2227701CGy newBuilder() {
        C2227701CGy c2227701CGy = new C2227701CGy();
        c2227701CGy.LIZLLL = this.resource_id;
        c2227701CGy.LJ = C1516540pZE.LIZLLL("extra", this.extra);
        c2227701CGy.addUnknownFields(unknownFields());
        return c2227701CGy;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.resource_id != null) {
            sb.append(", resource_id=");
            sb.append(this.resource_id);
        }
        if (!this.extra.isEmpty()) {
            sb.append(", extra=");
            sb.append(this.extra);
        }
        sb.replace(0, 2, "QueryData{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2227681CGw)) {
            return false;
        }
        C2227681CGw c2227681CGw = (C2227681CGw) obj;
        if (unknownFields().equals(c2227681CGw.unknownFields()) && C1516540pZE.LJ(this.resource_id, c2227681CGw.resource_id) && this.extra.equals(c2227681CGw.extra)) {
            return true;
        }
        return false;
    }

    public C2227681CGw(String str, Map<String, String> map) {
        this(str, map, ByteString.EMPTY);
    }

    public C2227681CGw(String str, Map<String, String> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.resource_id = str;
        this.extra = C1516540pZE.LJI("extra", map);
    }
}
