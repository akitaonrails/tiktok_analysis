package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CaN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2232891CaN extends Message<C2232891CaN, C2232911CaP> {
    public static final ProtoAdapter<C2232891CaN> ADAPTER = new ProtoAdapter<C2232891CaN>() { // from class: X.1CaO
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2232891CaN decode(ProtoReader protoReader) {
            C2232911CaP c2232911CaP = new C2232911CaP();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                c2232911CaP.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                c2232911CaP.LJFF = ProtoAdapter.BOOL.decode(protoReader);
                            }
                        } else {
                            c2232911CaP.LJ = C2232021CXo.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c2232911CaP.LIZLLL = C2232021CXo.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2232911CaP.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2232891CaN c2232891CaN) {
            C2232891CaN c2232891CaN2 = c2232891CaN;
            ProtoAdapter<C2232021CXo> protoAdapter = C2232021CXo.ADAPTER;
            return protoAdapter.encodedSizeWithTag(1, c2232891CaN2.invitee) + protoAdapter.encodedSizeWithTag(2, c2232891CaN2.invite_operator) + ProtoAdapter.BOOL.encodedSizeWithTag(3, c2232891CaN2.is_agree) + c2232891CaN2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2232891CaN redact(C2232891CaN c2232891CaN) {
            C2232911CaP c2232911CaPNewBuilder = c2232891CaN.newBuilder();
            ProtoAdapter<C2232021CXo> protoAdapter = C2232021CXo.ADAPTER;
            c2232911CaPNewBuilder.LIZLLL = protoAdapter.redact(c2232911CaPNewBuilder.LIZLLL);
            c2232911CaPNewBuilder.LJ = protoAdapter.redact(c2232911CaPNewBuilder.LJ);
            c2232911CaPNewBuilder.clearUnknownFields();
            return c2232911CaPNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2232891CaN c2232891CaN) {
            C2232891CaN c2232891CaN2 = c2232891CaN;
            ProtoAdapter<C2232021CXo> protoAdapter = C2232021CXo.ADAPTER;
            protoAdapter.encodeWithTag(protoWriter, 1, c2232891CaN2.invitee);
            protoAdapter.encodeWithTag(protoWriter, 2, c2232891CaN2.invite_operator);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, c2232891CaN2.is_agree);
            protoWriter.writeBytes(c2232891CaN2.unknownFields());
        }
    };
    public static final Boolean DEFAULT_IS_AGREE = Boolean.FALSE;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicLinkUser#ADAPTER", label = WireField.Label.REQUIRED, tag = 2)
    public final C2232021CXo invite_operator;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicLinkUser#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final C2232021CXo invitee;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.REQUIRED, tag = 3)
    public final Boolean is_agree;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.invitee.hashCode()) * 37) + this.invite_operator.hashCode()) * 37) + this.is_agree.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2232911CaP newBuilder() {
        C2232911CaP c2232911CaP = new C2232911CaP();
        c2232911CaP.LIZLLL = this.invitee;
        c2232911CaP.LJ = this.invite_operator;
        c2232911CaP.LJFF = this.is_agree;
        c2232911CaP.addUnknownFields(unknownFields());
        return c2232911CaP;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", invitee=");
        sb.append(this.invitee);
        sb.append(", invite_operator=");
        sb.append(this.invite_operator);
        sb.append(", is_agree=");
        sb.append(this.is_agree);
        sb.replace(0, 2, "LinkMicImReplyModel{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2232891CaN)) {
            return false;
        }
        C2232891CaN c2232891CaN = (C2232891CaN) obj;
        if (unknownFields().equals(c2232891CaN.unknownFields()) && this.invitee.equals(c2232891CaN.invitee) && this.invite_operator.equals(c2232891CaN.invite_operator) && this.is_agree.equals(c2232891CaN.is_agree)) {
            return true;
        }
        return false;
    }

    public C2232891CaN(C2232021CXo c2232021CXo, C2232021CXo c2232021CXo2, Boolean bool) {
        this(c2232021CXo, c2232021CXo2, bool, ByteString.EMPTY);
    }

    public C2232891CaN(C2232021CXo c2232021CXo, C2232021CXo c2232021CXo2, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.invitee = c2232021CXo;
        this.invite_operator = c2232021CXo2;
        this.is_agree = bool;
    }
}
