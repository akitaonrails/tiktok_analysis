package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1Cac, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2233041Cac extends Message<C2233041Cac, C2233061Cae> {
    public static final ProtoAdapter<C2233041Cac> ADAPTER = new ProtoAdapter<C2233041Cac>() { // from class: X.1Cad
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2233041Cac decode(ProtoReader protoReader) {
            C2233061Cae c2233061Cae = new C2233061Cae();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2233061Cae.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c2233061Cae.LJ = C2232021CXo.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c2233061Cae.LIZLLL = C2232021CXo.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2233061Cae.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2233041Cac c2233041Cac) {
            C2233041Cac c2233041Cac2 = c2233041Cac;
            ProtoAdapter<C2232021CXo> protoAdapter = C2232021CXo.ADAPTER;
            return protoAdapter.encodedSizeWithTag(1, c2233041Cac2.invitor) + protoAdapter.encodedSizeWithTag(2, c2233041Cac2.invitee) + c2233041Cac2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2233041Cac redact(C2233041Cac c2233041Cac) {
            C2233061Cae c2233061CaeNewBuilder = c2233041Cac.newBuilder();
            ProtoAdapter<C2232021CXo> protoAdapter = C2232021CXo.ADAPTER;
            c2233061CaeNewBuilder.LIZLLL = protoAdapter.redact(c2233061CaeNewBuilder.LIZLLL);
            c2233061CaeNewBuilder.LJ = protoAdapter.redact(c2233061CaeNewBuilder.LJ);
            c2233061CaeNewBuilder.clearUnknownFields();
            return c2233061CaeNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2233041Cac c2233041Cac) {
            C2233041Cac c2233041Cac2 = c2233041Cac;
            ProtoAdapter<C2232021CXo> protoAdapter = C2232021CXo.ADAPTER;
            protoAdapter.encodeWithTag(protoWriter, 1, c2233041Cac2.invitor);
            protoAdapter.encodeWithTag(protoWriter, 2, c2233041Cac2.invitee);
            protoWriter.writeBytes(c2233041Cac2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicLinkUser#ADAPTER", label = WireField.Label.REQUIRED, tag = 2)
    public final C2232021CXo invitee;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicLinkUser#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final C2232021CXo invitor;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.invitor.hashCode()) * 37) + this.invitee.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2233061Cae newBuilder() {
        C2233061Cae c2233061Cae = new C2233061Cae();
        c2233061Cae.LIZLLL = this.invitor;
        c2233061Cae.LJ = this.invitee;
        c2233061Cae.addUnknownFields(unknownFields());
        return c2233061Cae;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", invitor=");
        sb.append(this.invitor);
        sb.append(", invitee=");
        sb.append(this.invitee);
        sb.replace(0, 2, "LinkMicImCancelInviteModel{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2233041Cac)) {
            return false;
        }
        C2233041Cac c2233041Cac = (C2233041Cac) obj;
        if (unknownFields().equals(c2233041Cac.unknownFields()) && this.invitor.equals(c2233041Cac.invitor) && this.invitee.equals(c2233041Cac.invitee)) {
            return true;
        }
        return false;
    }

    public C2233041Cac(C2232021CXo c2232021CXo, C2232021CXo c2232021CXo2) {
        this(c2232021CXo, c2232021CXo2, ByteString.EMPTY);
    }

    public C2233041Cac(C2232021CXo c2232021CXo, C2232021CXo c2232021CXo2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.invitor = c2232021CXo;
        this.invitee = c2232021CXo2;
    }
}
