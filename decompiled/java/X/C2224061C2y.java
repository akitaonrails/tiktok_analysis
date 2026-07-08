package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import java.util.Map;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C2y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2224061C2y extends Message<C2224061C2y, C1C30> {
    public static final ProtoAdapter<C2224061C2y> ADAPTER = new ProtoAdapter<C2224061C2y>() { // from class: X.1C2z
        public final ProtoAdapter<Map<String, String>> LIZ;

        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.LIZ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2224061C2y decode(ProtoReader protoReader) {
            C1C30 c1c30 = new C1C30();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                c1c30.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                c1c30.LJFF = ProtoAdapter.INT64.decode(protoReader);
                            }
                        } else {
                            c1c30.LJ.putAll(this.LIZ.decode(protoReader));
                        }
                    } else {
                        c1c30.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1c30.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2224061C2y c2224061C2y) {
            C2224061C2y c2224061C2y2 = c2224061C2y;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c2224061C2y2.event) + this.LIZ.encodedSizeWithTag(2, c2224061C2y2.param_map) + ProtoAdapter.INT64.encodedSizeWithTag(3, c2224061C2y2.level) + c2224061C2y2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2224061C2y redact(C2224061C2y c2224061C2y) {
            C1C30 c1c30NewBuilder = c2224061C2y.newBuilder();
            c1c30NewBuilder.clearUnknownFields();
            return c1c30NewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2224061C2y c2224061C2y) {
            C2224061C2y c2224061C2y2 = c2224061C2y;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c2224061C2y2.event);
            this.LIZ.encodeWithTag(protoWriter, 2, c2224061C2y2.param_map);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, c2224061C2y2.level);
            protoWriter.writeBytes(c2224061C2y2.unknownFields());
        }
    };
    public static final Long DEFAULT_LEVEL = 0L;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    public final String event;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 3)
    public final Long level;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final Map<String, String> param_map;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.event.hashCode()) * 37) + this.param_map.hashCode()) * 37) + this.level.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1C30 newBuilder() {
        C1C30 c1c30 = new C1C30();
        c1c30.LIZLLL = this.event;
        c1c30.LJ = C1516540pZE.LIZLLL("param_map", this.param_map);
        c1c30.LJFF = this.level;
        c1c30.addUnknownFields(unknownFields());
        return c1c30;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", event=");
        sb.append(this.event);
        if (!this.param_map.isEmpty()) {
            sb.append(", param_map=");
            sb.append(this.param_map);
        }
        sb.append(", level=");
        sb.append(this.level);
        sb.replace(0, 2, "FuncParamsXaed54e08ba164c5f{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2224061C2y)) {
            return false;
        }
        C2224061C2y c2224061C2y = (C2224061C2y) obj;
        if (unknownFields().equals(c2224061C2y.unknownFields()) && this.event.equals(c2224061C2y.event) && this.param_map.equals(c2224061C2y.param_map) && this.level.equals(c2224061C2y.level)) {
            return true;
        }
        return false;
    }

    public C2224061C2y(String str, Map<String, String> map, Long l) {
        this(str, map, l, ByteString.EMPTY);
    }

    public C2224061C2y(String str, Map<String, String> map, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.event = str;
        this.param_map = C1516540pZE.LJI("param_map", map);
        this.level = l;
    }
}
