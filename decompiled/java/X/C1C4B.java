package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C4B, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C4B extends Message<C1C4B, C1C4D> {
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicContentType#ADAPTER", label = WireField.Label.REQUIRED, tag = 2)
    public final C1CXP content_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 1)
    public final Long position;
    public static final ProtoAdapter<C1C4B> ADAPTER = new ProtoAdapter<C1C4B>() { // from class: X.1C4C
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1C4B decode(ProtoReader protoReader) {
            C1C4D c1c4d = new C1C4D();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c1c4d.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            try {
                                c1c4d.LJ = C1CXP.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                TryCatchGuardChecker.doCheck(e);
                                c1c4d.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        }
                    } else {
                        c1c4d.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1c4d.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1C4B c1c4b) {
            C1C4B c1c4b2 = c1c4b;
            return ProtoAdapter.INT64.encodedSizeWithTag(1, c1c4b2.position) + C1CXP.ADAPTER.encodedSizeWithTag(2, c1c4b2.content_type) + c1c4b2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1C4B redact(C1C4B c1c4b) {
            C1C4D c1c4dNewBuilder = c1c4b.newBuilder();
            c1c4dNewBuilder.clearUnknownFields();
            return c1c4dNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1C4B c1c4b) {
            C1C4B c1c4b2 = c1c4b;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, c1c4b2.position);
            C1CXP.ADAPTER.encodeWithTag(protoWriter, 2, c1c4b2.content_type);
            protoWriter.writeBytes(c1c4b2.unknownFields());
        }
    };
    public static final Long DEFAULT_POSITION = 0L;
    public static final C1CXP DEFAULT_CONTENT_TYPE = C1CXP.VAR_LINK_MIC_CONTENT_TYPE_UNDEFINED;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.position.hashCode()) * 37) + this.content_type.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1C4D newBuilder() {
        C1C4D c1c4d = new C1C4D();
        c1c4d.LIZLLL = this.position;
        c1c4d.LJ = this.content_type;
        c1c4d.addUnknownFields(unknownFields());
        return c1c4d;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", position=");
        sb.append(this.position);
        sb.append(", content_type=");
        sb.append(this.content_type);
        sb.replace(0, 2, "LinkMicMicPositionInfo{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1C4B)) {
            return false;
        }
        C1C4B c1c4b = (C1C4B) obj;
        if (unknownFields().equals(c1c4b.unknownFields()) && this.position.equals(c1c4b.position) && this.content_type.equals(c1c4b.content_type)) {
            return true;
        }
        return false;
    }

    public C1C4B(Long l, C1CXP c1cxp) {
        this(l, c1cxp, ByteString.EMPTY);
    }

    public C1C4B(Long l, C1CXP c1cxp, ByteString byteString) {
        super(ADAPTER, byteString);
        this.position = l;
        this.content_type = c1cxp;
    }
}
