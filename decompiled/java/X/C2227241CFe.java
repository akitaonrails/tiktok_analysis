package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CFe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2227241CFe extends Message<C2227241CFe, C2227251CFf> {
    public static final ProtoAdapter<C2227241CFe> ADAPTER = new ProtoAdapter<C2227241CFe>() { // from class: X.1CFd
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2227241CFe decode(ProtoReader protoReader) {
            C2227251CFf c2227251CFf = new C2227251CFf();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c2227251CFf.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c2227251CFf.LIZLLL = C2232021CXo.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2227251CFf.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2227241CFe c2227241CFe) {
            C2227241CFe c2227241CFe2 = c2227241CFe;
            return C2232021CXo.ADAPTER.encodedSizeWithTag(1, c2227241CFe2.joiner) + c2227241CFe2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2227241CFe redact(C2227241CFe c2227241CFe) {
            C2227251CFf c2227251CFfNewBuilder = c2227241CFe.newBuilder();
            c2227251CFfNewBuilder.LIZLLL = C2232021CXo.ADAPTER.redact(c2227251CFfNewBuilder.LIZLLL);
            c2227251CFfNewBuilder.clearUnknownFields();
            return c2227251CFfNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2227241CFe c2227241CFe) {
            C2227241CFe c2227241CFe2 = c2227241CFe;
            C2232021CXo.ADAPTER.encodeWithTag(protoWriter, 1, c2227241CFe2.joiner);
            protoWriter.writeBytes(c2227241CFe2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicLinkUser#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final C2232021CXo joiner;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.joiner.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2227251CFf newBuilder() {
        C2227251CFf c2227251CFf = new C2227251CFf();
        c2227251CFf.LIZLLL = this.joiner;
        c2227251CFf.addUnknownFields(unknownFields());
        return c2227251CFf;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", joiner=");
        sb.append(this.joiner);
        sb.replace(0, 2, "LinkMicImJoinDirectModel{");
        sb.append('}');
        return sb.toString();
    }

    public C2227241CFe(C2232021CXo c2232021CXo) {
        this(c2232021CXo, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2227241CFe)) {
            return false;
        }
        C2227241CFe c2227241CFe = (C2227241CFe) obj;
        if (unknownFields().equals(c2227241CFe.unknownFields()) && this.joiner.equals(c2227241CFe.joiner)) {
            return true;
        }
        return false;
    }

    public C2227241CFe(C2232021CXo c2232021CXo, ByteString byteString) {
        super(ADAPTER, byteString);
        this.joiner = c2232021CXo;
    }
}
