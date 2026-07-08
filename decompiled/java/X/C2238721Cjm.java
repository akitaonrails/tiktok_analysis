package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1Cjm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2238721Cjm extends Message<C2238721Cjm, C2238741Cjo> {
    public static final ProtoAdapter<C2238721Cjm> ADAPTER = new ProtoAdapter<C2238721Cjm>() { // from class: X.1Cjn
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2238721Cjm decode(ProtoReader protoReader) {
            C2238741Cjo c2238741Cjo = new C2238741Cjo();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                c2238741Cjo.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                c2238741Cjo.LJFF = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c2238741Cjo.LJ = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c2238741Cjo.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2238741Cjo.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2238721Cjm c2238721Cjm) {
            C2238721Cjm c2238721Cjm2 = c2238721Cjm;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c2238721Cjm2.key) + protoAdapter.encodedSizeWithTag(2, c2238721Cjm2.name) + protoAdapter.encodedSizeWithTag(3, c2238721Cjm2.schema) + c2238721Cjm2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2238721Cjm redact(C2238721Cjm c2238721Cjm) {
            C2238741Cjo c2238741CjoNewBuilder = c2238721Cjm.newBuilder();
            c2238741CjoNewBuilder.clearUnknownFields();
            return c2238741CjoNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2238721Cjm c2238721Cjm) {
            C2238721Cjm c2238721Cjm2 = c2238721Cjm;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c2238721Cjm2.key);
            protoAdapter.encodeWithTag(protoWriter, 2, c2238721Cjm2.name);
            protoAdapter.encodeWithTag(protoWriter, 3, c2238721Cjm2.schema);
            protoWriter.writeBytes(c2238721Cjm2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String key;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final String schema;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        String str = this.key;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.name;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.schema;
        int iHashCode4 = iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public C2238741Cjo newBuilder() {
        C2238741Cjo c2238741Cjo = new C2238741Cjo();
        c2238741Cjo.LIZLLL = this.key;
        c2238741Cjo.LJ = this.name;
        c2238741Cjo.LJFF = this.schema;
        c2238741Cjo.addUnknownFields(unknownFields());
        return c2238741Cjo;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.key != null) {
            sb.append(", key=");
            sb.append(this.key);
        }
        if (this.name != null) {
            sb.append(", name=");
            sb.append(this.name);
        }
        if (this.schema != null) {
            sb.append(", schema=");
            sb.append(this.schema);
        }
        sb.replace(0, 2, "VisualPoetActionTemplate{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2238721Cjm)) {
            return false;
        }
        C2238721Cjm c2238721Cjm = (C2238721Cjm) obj;
        if (unknownFields().equals(c2238721Cjm.unknownFields()) && C1516540pZE.LJ(this.key, c2238721Cjm.key) && C1516540pZE.LJ(this.name, c2238721Cjm.name) && C1516540pZE.LJ(this.schema, c2238721Cjm.schema)) {
            return true;
        }
        return false;
    }

    public C2238721Cjm(String str, String str2, String str3) {
        this(str, str2, str3, ByteString.EMPTY);
    }

    public C2238721Cjm(String str, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.key = str;
        this.name = str2;
        this.schema = str3;
    }
}
