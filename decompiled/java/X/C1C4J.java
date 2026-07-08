package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C4J, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C4J extends Message<C1C4J, C1C4K> {
    public static final ProtoAdapter<C1C4J> ADAPTER = new ProtoAdapter<C1C4J>() { // from class: X.1C4I
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1C4J decode(ProtoReader protoReader) {
            C1C4K c1c4k = new C1C4K();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c1c4k.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            try {
                                c1c4k.LJ = C1CXP.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                TryCatchGuardChecker.doCheck(e);
                                c1c4k.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        }
                    } else {
                        c1c4k.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1c4k.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1C4J c1c4j) {
            C1C4J c1c4j2 = c1c4j;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c1c4j2.content_id) + C1CXP.ADAPTER.encodedSizeWithTag(2, c1c4j2.content_type) + c1c4j2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1C4J redact(C1C4J c1c4j) {
            C1C4K c1c4kNewBuilder = c1c4j.newBuilder();
            c1c4kNewBuilder.clearUnknownFields();
            return c1c4kNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1C4J c1c4j) {
            C1C4J c1c4j2 = c1c4j;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c1c4j2.content_id);
            C1CXP.ADAPTER.encodeWithTag(protoWriter, 2, c1c4j2.content_type);
            protoWriter.writeBytes(c1c4j2.unknownFields());
        }
    };
    public static final C1CXP DEFAULT_CONTENT_TYPE = C1CXP.VAR_LINK_MIC_CONTENT_TYPE_UNDEFINED;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    public final String content_id;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicContentType#ADAPTER", label = WireField.Label.REQUIRED, tag = 2)
    public final C1CXP content_type;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.content_id.hashCode()) * 37) + this.content_type.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1C4K newBuilder() {
        C1C4K c1c4k = new C1C4K();
        c1c4k.LIZLLL = this.content_id;
        c1c4k.LJ = this.content_type;
        c1c4k.addUnknownFields(unknownFields());
        return c1c4k;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", content_id=");
        sb.append(this.content_id);
        sb.append(", content_type=");
        sb.append(this.content_type);
        sb.replace(0, 2, "LinkMicContentInfo{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1C4J)) {
            return false;
        }
        C1C4J c1c4j = (C1C4J) obj;
        if (unknownFields().equals(c1c4j.unknownFields()) && this.content_id.equals(c1c4j.content_id) && this.content_type.equals(c1c4j.content_type)) {
            return true;
        }
        return false;
    }

    public C1C4J(String str, C1CXP c1cxp) {
        this(str, c1cxp, ByteString.EMPTY);
    }

    public C1C4J(String str, C1CXP c1cxp, ByteString byteString) {
        super(ADAPTER, byteString);
        this.content_id = str;
        this.content_type = c1cxp;
    }
}
