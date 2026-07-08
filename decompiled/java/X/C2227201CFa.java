package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CFa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2227201CFa extends Message<C2227201CFa, C2227221CFc> {
    public static final ProtoAdapter<C2227201CFa> ADAPTER = new ProtoAdapter<C2227201CFa>() { // from class: X.1CFb
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2227201CFa decode(ProtoReader protoReader) {
            C2227221CFc c2227221CFc = new C2227221CFc();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c2227221CFc.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c2227221CFc.LIZLLL = C2232021CXo.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2227221CFc.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2227201CFa c2227201CFa) {
            C2227201CFa c2227201CFa2 = c2227201CFa;
            return C2232021CXo.ADAPTER.encodedSizeWithTag(1, c2227201CFa2.applier) + c2227201CFa2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2227201CFa redact(C2227201CFa c2227201CFa) {
            C2227221CFc c2227221CFcNewBuilder = c2227201CFa.newBuilder();
            c2227221CFcNewBuilder.LIZLLL = C2232021CXo.ADAPTER.redact(c2227221CFcNewBuilder.LIZLLL);
            c2227221CFcNewBuilder.clearUnknownFields();
            return c2227221CFcNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2227201CFa c2227201CFa) {
            C2227201CFa c2227201CFa2 = c2227201CFa;
            C2232021CXo.ADAPTER.encodeWithTag(protoWriter, 1, c2227201CFa2.applier);
            protoWriter.writeBytes(c2227201CFa2.unknownFields());
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
    public C2227221CFc newBuilder() {
        C2227221CFc c2227221CFc = new C2227221CFc();
        c2227221CFc.LIZLLL = this.applier;
        c2227221CFc.addUnknownFields(unknownFields());
        return c2227221CFc;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", applier=");
        sb.append(this.applier);
        sb.replace(0, 2, "LinkMicImCancelApplyModel{");
        sb.append('}');
        return sb.toString();
    }

    public C2227201CFa(C2232021CXo c2232021CXo) {
        this(c2232021CXo, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2227201CFa)) {
            return false;
        }
        C2227201CFa c2227201CFa = (C2227201CFa) obj;
        if (unknownFields().equals(c2227201CFa.unknownFields()) && this.applier.equals(c2227201CFa.applier)) {
            return true;
        }
        return false;
    }

    public C2227201CFa(C2232021CXo c2232021CXo, ByteString byteString) {
        super(ADAPTER, byteString);
        this.applier = c2232021CXo;
    }
}
