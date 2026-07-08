package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CKp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2228651CKp extends Message<C2228651CKp, C2228671CKr> {
    public static final ProtoAdapter<C2228651CKp> ADAPTER = new ProtoAdapter<C2228651CKp>() { // from class: X.1CKq
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2228651CKp decode(ProtoReader protoReader) {
            C2228671CKr c2228671CKr = new C2228671CKr();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                    c2228671CKr.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                } else {
                                    c2228671CKr.LJI = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c2228671CKr.LJFF = ProtoAdapter.INT64.decode(protoReader);
                            }
                        } else {
                            c2228671CKr.LJ = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c2228671CKr.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2228671CKr.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2228651CKp c2228651CKp) {
            C2228651CKp c2228651CKp2 = c2228651CKp;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c2228651CKp2.key) + protoAdapter.encodedSizeWithTag(2, c2228651CKp2.value) + ProtoAdapter.INT64.encodedSizeWithTag(3, c2228651CKp2.repeat_times) + protoAdapter.encodedSizeWithTag(4, c2228651CKp2.data_flow_id) + c2228651CKp2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2228651CKp redact(C2228651CKp c2228651CKp) {
            C2228671CKr c2228671CKrNewBuilder = c2228651CKp.newBuilder();
            c2228671CKrNewBuilder.clearUnknownFields();
            return c2228671CKrNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2228651CKp c2228651CKp) {
            C2228651CKp c2228651CKp2 = c2228651CKp;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c2228651CKp2.key);
            protoAdapter.encodeWithTag(protoWriter, 2, c2228651CKp2.value);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, c2228651CKp2.repeat_times);
            protoAdapter.encodeWithTag(protoWriter, 4, c2228651CKp2.data_flow_id);
            protoWriter.writeBytes(c2228651CKp2.unknownFields());
        }
    };
    public static final Long DEFAULT_REPEAT_TIMES = 0L;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 4)
    public final String data_flow_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    public final String key;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 3)
    public final Long repeat_times;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 2)
    public final String value;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((unknownFields().hashCode() * 37) + this.key.hashCode()) * 37) + this.value.hashCode()) * 37) + this.repeat_times.hashCode()) * 37) + this.data_flow_id.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2228671CKr newBuilder() {
        C2228671CKr c2228671CKr = new C2228671CKr();
        c2228671CKr.LIZLLL = this.key;
        c2228671CKr.LJ = this.value;
        c2228671CKr.LJFF = this.repeat_times;
        c2228671CKr.LJI = this.data_flow_id;
        c2228671CKr.addUnknownFields(unknownFields());
        return c2228671CKr;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", key=");
        sb.append(this.key);
        sb.append(", value=");
        sb.append(this.value);
        sb.append(", repeat_times=");
        sb.append(this.repeat_times);
        sb.append(", data_flow_id=");
        sb.append(this.data_flow_id);
        sb.replace(0, 2, "FuncParamsX6de3b54a3d3259f0{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2228651CKp)) {
            return false;
        }
        C2228651CKp c2228651CKp = (C2228651CKp) obj;
        if (unknownFields().equals(c2228651CKp.unknownFields()) && this.key.equals(c2228651CKp.key) && this.value.equals(c2228651CKp.value) && this.repeat_times.equals(c2228651CKp.repeat_times) && this.data_flow_id.equals(c2228651CKp.data_flow_id)) {
            return true;
        }
        return false;
    }

    public C2228651CKp(String str, String str2, Long l, String str3) {
        this(str, str2, l, str3, ByteString.EMPTY);
    }

    public C2228651CKp(String str, String str2, Long l, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.key = str;
        this.value = str2;
        this.repeat_times = l;
        this.data_flow_id = str3;
    }
}
