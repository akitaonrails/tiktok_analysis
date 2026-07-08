package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CFY, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CFY extends Message<C1CFY, C1CFZ> {
    public static final ProtoAdapter<C1CFY> ADAPTER = new ProtoAdapter<C1CFY>() { // from class: X.1CFX
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CFY decode(ProtoReader protoReader) {
            C1CFZ c1cfz = new C1CFZ();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c1cfz.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c1cfz.LIZLLL = C2232021CXo.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cfz.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CFY c1cfy) {
            C1CFY c1cfy2 = c1cfy;
            return C2232021CXo.ADAPTER.encodedSizeWithTag(1, c1cfy2.applier) + c1cfy2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CFY redact(C1CFY c1cfy) {
            C1CFZ c1cfzNewBuilder = c1cfy.newBuilder();
            c1cfzNewBuilder.LIZLLL = C2232021CXo.ADAPTER.redact(c1cfzNewBuilder.LIZLLL);
            c1cfzNewBuilder.clearUnknownFields();
            return c1cfzNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CFY c1cfy) {
            C1CFY c1cfy2 = c1cfy;
            C2232021CXo.ADAPTER.encodeWithTag(protoWriter, 1, c1cfy2.applier);
            protoWriter.writeBytes(c1cfy2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicLinkUser#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final C2232021CXo applier;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.applier.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1CFZ newBuilder() {
        C1CFZ c1cfz = new C1CFZ();
        c1cfz.LIZLLL = this.applier;
        c1cfz.addUnknownFields(unknownFields());
        return c1cfz;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", applier=");
        sb.append(this.applier);
        sb.replace(0, 2, "LinkMicImApplyModel{");
        sb.append('}');
        return sb.toString();
    }

    public C1CFY(C2232021CXo c2232021CXo) {
        this(c2232021CXo, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CFY)) {
            return false;
        }
        C1CFY c1cfy = (C1CFY) obj;
        if (unknownFields().equals(c1cfy.unknownFields()) && this.applier.equals(c1cfy.applier)) {
            return true;
        }
        return false;
    }

    public C1CFY(C2232021CXo c2232021CXo, ByteString byteString) {
        super(ADAPTER, byteString);
        this.applier = c2232021CXo;
    }
}
